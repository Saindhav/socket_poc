package com.bot.message;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Button {
	public double id;
	public String payload;
	public String type;
	public String title;

	@JsonProperty("id")
	public double getId() {
		return this.id;
	}
 
	public void setId(double id) {
		this.id = id;
	}


	@JsonProperty("payload")
	public String getPayload() {
		return this.payload;
	}

	public void setPayload(String payload) {
		this.payload = payload;
	}


	@JsonProperty("type")
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}


	@JsonProperty("title")
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
