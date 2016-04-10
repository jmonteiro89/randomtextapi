package com.betvictor.app.msg.object;

import java.io.Serializable;

public class TaskHistoryDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6750907450863843415L;
	private String freq_word;
	private String avg_paragraph_size;
	private String avg_paragraph_processing_time;
	private String total_processing_time;
	
	public String getFreq_word() {
		return freq_word;
	}
	public void setFreq_word(String freq_word) {
		this.freq_word = freq_word;
	}
	public String getAvg_paragraph_size() {
		return avg_paragraph_size;
	}
	public void setAvg_paragraph_size(String avg_paragraph_size) {
		this.avg_paragraph_size = avg_paragraph_size;
	}
	public String getAvg_paragraph_processing_time() {
		return avg_paragraph_processing_time;
	}
	public void setAvg_paragraph_processing_time(String avg_paragraph_processing_time) {
		this.avg_paragraph_processing_time = avg_paragraph_processing_time;
	}
	public String getTotal_processing_time() {
		return total_processing_time;
	}
	public void setTotal_processing_time(String total_processing_time) {
		this.total_processing_time = total_processing_time;
	}
	
	
}
