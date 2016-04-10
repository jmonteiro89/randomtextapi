package com.betvictor.app.bsl;

import java.time.Duration;
import java.time.LocalTime;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.betvictor.app.bsl.workers.WorkersFactory;
import com.betvictor.app.dao.facade.DaoManager;
import com.betvictor.app.msg.object.TaskHistoryDTO;
import com.betvictor.app.msg.object.TaskRequest;
import com.betvictor.app.msg.object.TaskResponse;
import com.betvictor.app.msg.object.TaskResults;
import com.betvictor.app.ws.client.RandomTextClient;

public class TaskManagerImpl implements TaskManager {
	@Autowired
	private RandomTextClient randomText;
	private DaoManager daoManager;
	private WorkersFactory factory;
	private TaskResults sharedResults;
	
	public void setFactory(WorkersFactory factory) {
		this.factory = factory;
	}

	public void setSharedResults(TaskResults sharedResults) {
		this.sharedResults = sharedResults;
	}

	public void setDaoManager(DaoManager daoManager) {
		this.daoManager = daoManager;
	}

	public void setRandomText(RandomTextClient randomText) {
		this.randomText = randomText;
	}

	
	@Override
	@Transactional
	public TaskResponse doTask(TaskRequest request) {
		ExecutorService jobQueue = Executors.newFixedThreadPool(4);
		LocalTime startProcessTime = LocalTime.now();
		for(int i = request.getP_start(); i <= request.getP_end(); i++){
			jobQueue.execute(factory.getInstance(sharedResults, randomText, new TaskRequest(i, i, request.getW_count_min(), request.getW_count_max())));
		}
		jobQueue.shutdown();
		try {
			jobQueue.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
		} catch (InterruptedException e) {
		  System.out.println("InterruptedException");
		}
		
		//Compute responses
		String freq_word = sharedResults.getWordsStats().entrySet().stream().max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get().getKey();
		//TODO-Probably this can't be rounded.. use BigDecimal?
		Integer aps = Math.round(sharedResults.getTotalWords()/(sharedResults.getTotalParagraphs()));
		Duration appt = sharedResults.getParagraphTime().dividedBy(sharedResults.getTotalParagraphs());
		Duration tpt = Duration.between(startProcessTime, LocalTime.now());
		TaskResponse task = new TaskResponse(freq_word, aps, appt, tpt);
		daoManager.addTaskHistory(task);
		return task;

	}
	
	@Override
	@Transactional
	public List<TaskHistoryDTO> getTaskHistory() {
		return daoManager.getHistory();
	}

}
