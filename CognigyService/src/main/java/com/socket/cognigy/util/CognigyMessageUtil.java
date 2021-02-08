package com.socket.cognigy.util;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.socket.cognigy.model.CognigyMessage;
import com.socket.cognigy.model.output.Output;
import com.socket.cognigy.model.output.OutputData;

import io.socket.client.Socket;

@Component
public class CognigyMessageUtil {

	public void sendMessage(Socket socket, String jsonStr) {
		System.out.println(jsonStr);
		socket.off("output");
		socket.emit("processInput", jsonStr);
	}

	public String getJson(String socketId, String msg) {
		CognigyMessage cm = new CognigyMessage();
		String jsonStr = null;

		// cm.setURLToken("70fc8f3981e28c1f07df5a24a89932dfc475a19db911cb3cb2ab277210b1fb23");
		cm.setURLToken("0826ab1ae142c1ff16064176ea23e3f3ba0eeb3cace6c4e7a32d9b1d334d0bfa");
		cm.setSessionId(socketId);
		cm.setUserId("email");
		cm.setText(msg);

		ObjectMapper obj = new ObjectMapper();
		try {

			jsonStr = obj.writeValueAsString(cm);
			jsonStr = jsonStr.replace("urltoken", "URLToken");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return jsonStr;
	}

	public OutputData getOutputDataObject(String output) {
		Output op = new Output();
		try {
			ObjectMapper mapper = new ObjectMapper();
			op = mapper.readValue(output, Output.class);
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return op.getData();
	}

}
