package com.socket.cognigy.model; 
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty; 
public class Item{
    public String title;
    public String subtitle;
    public String imageUrl;
    public List<Button> buttons;
    public double id;
    
    @JsonProperty("title")
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	 @JsonProperty("subtitle")
	public String getSubtitle() {
		return subtitle;
	}
	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}
	
	 @JsonProperty("imageUrl")
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	
	 @JsonProperty("buttons")
	public List<Button> getButtons() {
		return buttons;
	}
	public void setButtons(List<Button> buttons) {
		this.buttons = buttons;
	}
	
	 @JsonProperty("id")
	public double getId() {
		return id;
	}
	public void setId(double id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Item [title=" + title + ", subtitle=" + subtitle + ", imageUrl=" + imageUrl + ", buttons=" + buttons
				+ ", id=" + id + "]";
	}
}
