package com.betvictor.app.msg.object;

import java.io.Serializable;

public class TaskRequest implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -773533475872925903L;
	private Integer p_start; //start number of paragraphs
	private Integer p_end; //end number of paragraphs
	private Integer w_count_min; //minimum number of words in each paragraph
	private Integer w_count_max; //maximum number of words in each paragraph
	
	public TaskRequest(){}
	public TaskRequest(Integer p_start, Integer p_end, Integer w_count_min, Integer w_count_max){
		this.p_start = p_start;
		this.p_end = p_end;
		this.w_count_min = w_count_min;
		this.w_count_max = w_count_max;
	}
	/**
	 * 
	 * @return start number of paragraphs
	 */
	public Integer getP_start() {
		return p_start;
	}
	/**
	 * 
	 * @param p_start - start number of paragraphs
	 */
	public void setP_start(Integer p_start) {
		this.p_start = p_start;
	}
	/**
	 * 
	 * @return end number of paragraphs
	 */
	public Integer getP_end() {
		return p_end;
	}
	/**
	 * 
	 * @param p_end - end number of paragraphs
	 */
	public void setP_end(Integer p_end) {
		this.p_end = p_end;
	}
	/**
	 * 
	 * @return minimum number of words in each paragraph
	 */
	public Integer getW_count_min() {
		return w_count_min;
	}
	/**
	 * 
	 * @param w_count_min - minimum number of words in each paragraph
	 */
	public void setW_count_min(Integer w_count_min) {
		this.w_count_min = w_count_min;
	}
	/**
	 * 
	 * @return maximum number of words in each paragraph
	 */
	public Integer getW_count_max() {
		return w_count_max;
	}
	/**
	 * 
	 * @param w_count_max - maximum number of words in each paragraph
	 */
	public void setW_count_max(Integer w_count_max) {
		this.w_count_max = w_count_max;
	}
	
	

}
