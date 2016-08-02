package com.betvictor.app.msg.object;

import java.io.Serializable;

public class TaskResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9220470058799886725L;

	private String freq_word; //most frequent word
	private Integer avg_paragraph_size; //average parapraph size
	private Long avg_paragraph_processing_time; // average paragraph processing time in millis
	private Long total_processing_time; //total processing time in millis

	public TaskResponse(){}
	public TaskResponse(String fw, Integer aps, Long appt, Long tpt){
		this.freq_word = fw;
		this.avg_paragraph_size = aps;
		this.avg_paragraph_processing_time = appt;
		this.total_processing_time =  tpt;
	}
	public String getFreq_word() {
		return freq_word;
	}
	public void setFreq_word(String freq_word) {
		this.freq_word = freq_word;
	}
	public Integer getAvg_paragraph_size() {
		return avg_paragraph_size;
	}
	public void setAvg_paragraph_size(Integer avg_paragraph_size) {
		this.avg_paragraph_size = avg_paragraph_size;
	}
	public Long getAvg_paragraph_processing_time() {
		return avg_paragraph_processing_time;
	}
	public void setAvg_paragraph_processing_time(Long avg_paragraph_processing_time) {
		this.avg_paragraph_processing_time = avg_paragraph_processing_time;
	}
	public Long getTotal_processing_time() {
		return total_processing_time;
	}
	public void setTotal_processing_time(Long total_processing_time) {
		this.total_processing_time = total_processing_time;
	}


}
