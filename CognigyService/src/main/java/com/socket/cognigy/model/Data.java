package com.socket.cognigy.model; 
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty; 
public class Data{
    public String data;
    public String type;
    public boolean linear;
    public boolean loop;
    public List<String> text;
    public Cognigy _cognigy;
    public InnerData _data;
    public String action;
    
    @JsonProperty("data")
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	@JsonProperty("type")
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	@JsonProperty("linear")
	public boolean isLinear() {
		return linear;
	}
	public void setLinear(boolean linear) {
		this.linear = linear;
	}
	
	@JsonProperty("loop")
	public boolean isLoop() {
		return loop;
	}
	public void setLoop(boolean loop) {
		this.loop = loop;
	}
	
	@JsonProperty("text")
	public List<String> getText() {
		return text;
	}
	public void setText(List<String> text) {
		this.text = text;
	}
	
	@JsonProperty("_cognigy")
	public Cognigy get_cognigy() {
		return _cognigy;
	}
	public void set_cognigy(Cognigy _cognigy) {
		this._cognigy = _cognigy;
	}
	
	@JsonProperty("_data")
	public InnerData get_data() {
		return _data;
	}
	public void set_data(InnerData _data) {
		this._data = _data;
	}
	
	@JsonProperty("action")
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	@Override
	public String toString() {
		return "Data [data=" + data + ", type=" + type + ", linear=" + linear + ", loop=" + loop + ", text=" + text
				+ ", _cognigy=" + _cognigy + ", _data=" + _data + ", action=" + action + "]";
	}
	
	
    
}
