package com.betvictor.app.bsl.workers;


import org.springframework.beans.factory.annotation.Autowired;

import com.betvictor.app.msg.object.RandomTextResponse;
import com.betvictor.app.msg.object.TaskRequest;
import com.betvictor.app.msg.object.TaskResults;
import com.betvictor.app.ws.client.RandomTextClient;

public class Worker implements Runnable{

	@Autowired
	private RandomTextClient randomText;
	private TaskResults sharedResults;
	private TaskRequest request;
	
	public Worker(TaskResults shared, RandomTextClient randomClient, TaskRequest request){
		this.sharedResults = shared;
		this.request = request;
		this.randomText = randomClient;
	}

	@Override
	public void run() {
		//get paragraphs splited
		RandomTextResponse textResponse = randomText.doGet(request.getP_start(), request.getW_count_min(), request.getW_count_max());
		String[] paragraphs = textResponse.getText_out().replaceAll("<p>", "").split(".</p>\r");
		for(String p : paragraphs){
			Long paragraph = System.currentTimeMillis();
			//get words splited
			String[] words = p.split(" ");
			for(String w: words){
				synchronized(sharedResults){
					sharedResults.setTotalWords(sharedResults.getTotalWords()+1);
					if (sharedResults.getWordsStats().containsKey(w)) {
						int cont = sharedResults.getWordsStats().get(w);
						sharedResults.getWordsStats().put(w, cont + 1);
					} else {
						sharedResults.getWordsStats().put(w, 1);
					}
				}
			}
			synchronized(sharedResults){
				sharedResults.setParagraphTime(sharedResults.getParagraphTime()+(System.currentTimeMillis()-paragraph));
				sharedResults.setTotalParagraphs(sharedResults.getTotalParagraphs()+1);
				
			}
		}
	}


}
