package com.socket.cognigy.model; 
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty; 
public class Gallery{
    public String type;
    public List<Item> items;
    
    @JsonProperty("type")
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	@JsonProperty("items")
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	@Override
	public String toString() {
		return "Gallery [type=" + type + ", items=" + items + "]";
	}
}
