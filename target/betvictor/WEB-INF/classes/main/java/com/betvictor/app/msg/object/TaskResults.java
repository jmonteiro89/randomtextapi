package com.betvictor.app.msg.object;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class TaskResults {

	private Map<String, Integer> wordsStats;
	private Integer totalParagraphs;
	private Integer totalWords;
	private Duration paragraphTime;
	private Duration totalProcess;
	
	public TaskResults(){
		this.wordsStats = new HashMap<>();
		this.totalParagraphs = 0;
		this.totalWords = 0;
		this.paragraphTime = Duration.ZERO;
		this.totalProcess = Duration.ZERO;
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
	public Duration getParagraphTime() {
		return paragraphTime;
	}
	public void setParagraphTime(Duration paragraphTime) {
		this.paragraphTime = paragraphTime;
	}
	public Duration getTotalProcess() {
		return totalProcess;
	}
	public void setTotalProcess(Duration totalProcess) {
		this.totalProcess = totalProcess;
	}
	
	
}
