package com.betvictor.app.dao.facade;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import com.betvictor.app.dao.TaskHistory;
import com.betvictor.app.dao.repository.TaskHistoryRepository;
import com.betvictor.app.msg.object.TaskHistoryDTO;
import com.betvictor.app.msg.object.TaskResponse;

public class DaoManagerImpl implements DaoManager {

	@Autowired
	private TaskHistoryRepository repository;
	
	@Override
	public void addTaskHistory(TaskResponse taskResponse) {
		repository.save(taskResponseToTaskHistory(taskResponse));		
	}

	@Override
	public List<TaskHistoryDTO> getHistory() {
		Pageable topTen = new PageRequest(0, 10); // Direction.DESC, "idTaskHistory" 
		Page<TaskHistory> result = repository.findAllByOrderByIdTaskHistoryDesc(topTen);
		if(result != null){
			List<TaskHistoryDTO> output = new ArrayList<>();
			for(TaskHistory th: result){
				output.add(taskHistoryToTaskHistoryDTO(th));
			}
			return output;
		}
		return null;
	}

	// ObjectMapper Methods
	private TaskHistoryDTO taskHistoryToTaskHistoryDTO(TaskHistory th) {
		TaskHistoryDTO task = new TaskHistoryDTO();
		task.setFreq_word(th.getFreq_word());
		task.setAvg_paragraph_size(th.getAvg_paragraph_size());
		task.setAvg_paragraph_processing_time(th.getAvg_paragraph_processing_time());
		task.setTotal_processing_time(th.getTotal_processing_time());		
		return task;
	}
	
	private TaskHistory taskResponseToTaskHistory(TaskResponse tr) {
		TaskHistory task = new TaskHistory();
		task.setFreq_word(tr.getFreq_word());
		task.setAvg_paragraph_size(tr.getAvg_paragraph_size().toString());
		task.setAvg_paragraph_processing_time(tr.getAvg_paragraph_processing_time().toString());
		task.setTotal_processing_time(tr.getTotal_processing_time().toString());		
		return task;
	}

}
