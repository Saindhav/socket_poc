package com.socket.cognigy.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Image{
    public String type;
    public String imageUrl;
    
    @JsonProperty("type")
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
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
		return "Image [type=" + type + ", imageUrl=" + imageUrl + "]";
	}
}
