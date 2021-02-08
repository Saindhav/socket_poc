package com.socket.cognigy.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class QuickReplies{
    public String type;
    public List<QuickReply> quickReplies;
    public String text;
    
    @JsonProperty("type")
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	@JsonProperty("quickReplies")
	public List<QuickReply> getQuickReplies() {
		return quickReplies;
	}
	public void setQuickReplies(List<QuickReply> quickReplies) {
		this.quickReplies = quickReplies;
	}
	
	@JsonProperty("text")
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	@Override
	public String toString() {
		return "QuickReplies [type=" + type + ", quickReplies=" + quickReplies + ", text=" + text + "]";
	}
}
