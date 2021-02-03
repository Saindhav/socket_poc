package com.socket.cognigy.util;

import java.util.HashMap;
import java.util.Map;
import io.socket.client.Socket;
import io.socket.emitter.Emitter;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.socket.cognigy.model.CognigyMessage;

@Component
public class CognigyMessageUtil {
	
	public void sendMessage(Socket socket, String jsonStr) {
		socket.emit("processInput", jsonStr);
		socket.off("output");
		//socket.off("processInput");
		
	}
	
	
	public String getJson(String socketId, String msg) {
		CognigyMessage cm = new CognigyMessage();
		String jsonStr = null;
		
		cm.setURLToken("70fc8f3981e28c1f07df5a24a89932dfc475a19db911cb3cb2ab277210b1fb23");
		//cm.setURLToken("0826ab1ae142c1ff16064176ea23e3f3ba0eeb3cace6c4e7a32d9b1d334d0bfa");
		cm.setSessionId(socketId);
		cm.setUserId("email");
		cm.setPassthroughIP("127.0.0.1");
		cm.setReloadFlow("true");
		cm.setResetFlow("false");
		cm.setResetState("false");
		cm.setResetContext("true");
		cm.setText(msg);
		Map<String, String> data = new HashMap<String, String>();
		data.put("Key", "Value");
		cm.setData(data);
		
		ObjectMapper obj = new ObjectMapper();
		try {
			
			jsonStr = obj.writeValueAsString(cm);
			jsonStr = jsonStr.replace("urltoken", "URLToken");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return jsonStr;
		
	}

}
