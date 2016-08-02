package com.betvictor.app.msg.object;

import java.util.HashMap;
import java.util.Map;

public class TaskResults {

	private Map<String, Integer> wordsStats;
	private Integer totalParagraphs;
	private Integer totalWords;
	private Long paragraphTime;
	private Long totalProcess;
	
	public TaskResults(){
		this.wordsStats = new HashMap<>();
		this.totalParagraphs = 0;
		this.totalWords = 0;
		this.paragraphTime = new Long(0);
		this.totalProcess = new Long(0);
	}
	public Map<String, Integer> getWordsStats() {
		return wordsStats;
	}
	public void setWordsStats(Map<String, Integer> wordsStats) {
		this.wordsStats = wordsStats;
	}
	public Integer getTotalParagraphs() {
		return totalParagraphs;
	}
	public void setTotalParagraphs(Integer totalParagraphs) {
		this.totalParagraphs = totalParagraphs;
	}
	public Integer getTotalWords() {
		return totalWords;
	}
	public void setTotalWords(Integer totalWords) {
		this.totalWords = totalWords;
	}
	public Long getParagraphTime() {
		return paragraphTime;
	}
	public void setParagraphTime(Long paragraphTime) {
		this.paragraphTime = paragraphTime;
	}
	public Long getTotalProcess() {
		return totalProcess;
	}
	public void setTotalProcess(Long totalProcess) {
		this.totalProcess = totalProcess;
	}
	
	
}
