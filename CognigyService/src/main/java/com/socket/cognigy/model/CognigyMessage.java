package com.socket.cognigy.model;

import java.util.HashMap;
import java.util.Map;

public class CognigyMessage {
	
	private String URLToken;
	private String sessionId;
	private String userId;
	private String passthroughIP;
	private String reloadFlow;
	private String resetFlow;
	private String resetState;
	private String resetContext;
	private String text;
	private Map<String, String> data = new HashMap<String, String>();
	public String getURLToken() {
		return URLToken;
	}
	public void setURLToken(String uRLToken) {
		URLToken = uRLToken;
	}
	public String getSessionId() {
		return sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassthroughIP() {
		return passthroughIP;
	}
	public void setPassthroughIP(String passthroughIP) {
		this.passthroughIP = passthroughIP;
	}
	public String getReloadFlow() {
		return reloadFlow;
	}
	public void setReloadFlow(String reloadFlow) {
		this.reloadFlow = reloadFlow;
	}
	public String getResetFlow() {
		return resetFlow;
	}
	public void setResetFlow(String resetFlow) {
		this.resetFlow = resetFlow;
	}
	public String getResetState() {
		return resetState;
	}
	public void setResetState(String resetState) {
		this.resetState = resetState;
	}
	public String getResetContext() {
		return resetContext;
	}
	public void setResetContext(String resetContext) {
		this.resetContext = resetContext;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Map<String, String> getData() {
		return data;
	}
	public void setData(Map<String, String> data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "CognigyMessage [URLToken=" + URLToken + ", sessionId=" + sessionId + ", userId=" + userId
				+ ", passthroughIP=" + passthroughIP + ", reloadFlow=" + reloadFlow + ", resetFlow=" + resetFlow
				+ ", resetState=" + resetState + ", resetContext=" + resetContext + ", text=" + text + ", data=" + data
				+ "]";
	}
}
