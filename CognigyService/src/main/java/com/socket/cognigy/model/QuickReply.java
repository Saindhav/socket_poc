package com.socket.cognigy.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class QuickReply{
    public double id;
    public String contentType;
    public String payload;
    public String title;
    public String imageUrl;
    
    @JsonProperty("id")
	public double getId() {
		return id;
	}
	public void setId(double id) {
		this.id = id;
	}
	
	@JsonProperty("contentType")
	public String getContentType() {
		return contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
	
	@JsonProperty("payload")
	public String getPayload() {
		return payload;
	}
	public void setPayload(String payload) {
		this.payload = payload;
	}
	
	@JsonProperty("title")
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	@JsonProperty("imageUrl")
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	@Override
	public String toString() {
		return "QuickReply [id=" + id + ", contentType=" + contentType + ", payload=" + payload + ", title=" + title
				+ ", imageUrl=" + imageUrl + "]";
	}
    
}
