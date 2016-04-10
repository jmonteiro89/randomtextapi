package com.betvictor.app.msg.object;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Duration;

public class TaskResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9220470058799886725L;
	private final long TIMECONVERSION = 1000000000;
	private String freq_word; //most frequent word
	private Integer avg_paragraph_size; //average parapraph size
	private BigDecimal avg_paragraph_processing_time; // average paragraph processing time in seconds
	private BigDecimal total_processing_time; //total processing time in seconds

	public TaskResponse(){}
	public TaskResponse(String fw, Integer aps, Duration appt, Duration tpt){
		this.freq_word = fw;
		this.avg_paragraph_size = aps;
		this.avg_paragraph_processing_time = BigDecimal.valueOf(appt.getSeconds() + (double)appt.getNano()/TIMECONVERSION);
		this.total_processing_time =  BigDecimal.valueOf(tpt.getSeconds() + (double)tpt.getNano()/TIMECONVERSION);
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
	public BigDecimal getAvg_paragraph_processing_time() {
		return avg_paragraph_processing_time;
	}
	public void setAvg_paragraph_processing_time(long avg_paragraph_processing_time) {
		this.avg_paragraph_processing_time = BigDecimal.valueOf((double)avg_paragraph_processing_time/TIMECONVERSION);
	}
	public BigDecimal getTotal_processing_time() {
		return total_processing_time;
	}
	public void setTotal_processing_time(long total_processing_time) {
		this.total_processing_time = BigDecimal.valueOf((double)total_processing_time/TIMECONVERSION);
	}


}
