package com.socket.cognigy.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Cognigy{
    public Default _default;

    @JsonProperty("_default")
	public Default get_default() {
		return _default;
	}

	public void set_default(Default _default) {
		this._default = _default;
	}

	@Override
	public String toString() {
		return "Cognigy [_default=" + _default + "]";
	}
    
    
}
