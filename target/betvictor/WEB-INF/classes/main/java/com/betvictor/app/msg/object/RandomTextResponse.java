package com.betvictor.app.msg.object;

public class RandomTextResponse {

	private String type;
	private Integer amount;
	private Integer number;
	private Integer number_max;
	private String format;
	private String time;
	private String text_out;
	
	public RandomTextResponse(){}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Integer getNumber_max() {
		return number_max;
	}

	public void setNumber_max(Integer number_max) {
		this.number_max = number_max;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getText_out() {
		return text_out;
	}

	public void setText_out(String text_out) {
		this.text_out = text_out;
	};
	
	
	
}
