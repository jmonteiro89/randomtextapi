package com.betvictor.app.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TaskHistory")
public class TaskHistory {

	@Id
    @SequenceGenerator(name = "taskhistory_idtaskhistory_seq", sequenceName = "taskhistory_idtaskhistory_seq", allocationSize = 1, initialValue = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "taskhistory_idtaskhistory_seq")
    private Integer idTaskHistory;
	@Column
	private String freq_word;
	@Column
	private String avg_paragraph_size;
	@Column
	private String avg_paragraph_processing_time;
	@Column
	private String total_processing_time;
	
	
	public Integer getIdTaskHistory() {
		return idTaskHistory;
	}
	public void setIdTaskHistory(Integer idTaskHistory) {
		this.idTaskHistory = idTaskHistory;
	}
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
