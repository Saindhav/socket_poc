package com.socket.cognigy.model.output;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.socket.cognigy.model.Data;

public class OutputData {
	
	String text;
	Data data;
	String traceId;
	String source;
	boolean disableSensitiveLogging;

	@JsonProperty("traceId")
	public String getTraceId() {
		return this.traceId;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

	@JsonProperty("data")
	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	@JsonProperty("text")
	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@JsonProperty("source")
	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	@JsonProperty("disableSensitiveLogging")
	public boolean getDisableSensitiveLogging() {
		return this.disableSensitiveLogging;
	}

	public void setDisableSensitiveLogging(boolean disableSensitiveLogging) {
		this.disableSensitiveLogging = disableSensitiveLogging;
	}

	@Override
	public String toString() {
		return "OutputData [text=" + text + ", data=" + data + ", traceId=" + traceId + ", source=" + source
				+ ", disableSensitiveLogging=" + disableSensitiveLogging + "]";
	}


}
