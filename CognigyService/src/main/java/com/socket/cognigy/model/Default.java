package com.socket.cognigy.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Default{
    public Gallery _gallery;
    public Image _image;
    public QuickReplies _quickReplies;
    public Buttons _buttons;
    
    @JsonProperty("_gallery")
	public Gallery get_gallery() {
		return _gallery;
	}
	public void set_gallery(Gallery _gallery) {
		this._gallery = _gallery;
	}
	
	@JsonProperty("_image")
	public Image get_image() {
		return _image;
	}
	public void set_image(Image _image) {
		this._image = _image;
	}
	
	@JsonProperty("_quickReplies")
	public QuickReplies get_quickReplies() {
		return _quickReplies;
	}
	public void set_quickReplies(QuickReplies _quickReplies) {
		this._quickReplies = _quickReplies;
	}
	
	@JsonProperty("_buttons")
	public Buttons get_buttons() {
		return _buttons;
	}
	public void set_buttons(Buttons _buttons) {
		this._buttons = _buttons;
	}
	@Override
	public String toString() {
		return "Default [_gallery=" + _gallery + ", _image=" + _image + ", _quickReplies=" + _quickReplies
				+ ", _buttons=" + _buttons + "]";
	}
    
}
