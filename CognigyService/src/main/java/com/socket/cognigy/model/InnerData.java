package com.socket.cognigy.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InnerData{
    public Cognigy _cognigy;

    @JsonProperty("_cognigy")
	public Cognigy get_cognigy() {
		return _cognigy;
	}

	public void set_cognigy(Cognigy _cognigy) {
		this._cognigy = _cognigy;
	}

	@Override
	public String toString() {
		return "InnerData [_cognigy=" + _cognigy + "]";
	}
        
}
