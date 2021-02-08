package com.socket.cognigy.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Buttons{
    public String type;
    public String text;
    public List<Button> buttons;
    
    @JsonProperty("type")
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	@JsonProperty("text")
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	@JsonProperty("buttons")
	public List<Button> getButtons() {
		return buttons;
	}
	public void setButtons(List<Button> buttons) {
		this.buttons = buttons;
	}
	@Override
	public String toString() {
		return "Buttons [type=" + type + ", text=" + text + ", buttons=" + buttons + "]";
	}
}