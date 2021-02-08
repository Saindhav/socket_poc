package com.socket.cognigy.model.output;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Output {
	
	String type;
	OutputData data;
	
	@JsonProperty("data")
	public OutputData getData() {
		return this.data;
	}

	public void setData(OutputData data) {
		this.data = data;
	}

	@JsonProperty("type")
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Output [type=" + type + ", data=" + data + "]";
	}
	
	
	
}
