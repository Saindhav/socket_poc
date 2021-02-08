package com.socket.cognigy.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.socket.cognigy.model.output.OutputData;
import com.socket.cognigy.util.CognigyConnectionUtil;
import com.socket.cognigy.util.CognigyMessageUtil;
import com.socket.cognigy.util.CognigyOutputUtil;

import io.socket.client.Socket;

@Service
public class BotService {

	private static String socket_id = null;
	private static Socket socket = null;

	@Autowired
	CognigyConnectionUtil ccu;

	@Autowired
	CognigyMessageUtil cmu;

	@Autowired
	CognigyOutputUtil cou;

	@Async
	public CompletableFuture<List<OutputData>> generateBotReply(String userMessage) {
		List<OutputData> outputDataList = new ArrayList<OutputData>();
		
		System.out.println("-------generateBotReply started ");
		System.out.println("1 list size = "+outputDataList.size());
		if (null == socket) {
			System.out.println(" socket_id null");
			socket = ccu.getCognigyBotMessage();
			socket_id = socket.id();
		} else {
			try {
				System.out.println("socket_id not null");
				String jsonStr = cmu.getJson(socket_id, userMessage);
				cmu.sendMessage(socket, jsonStr);
				outputDataList = cou.getOutput(socket);
				System.out.println("2 list size = "+outputDataList.size());
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		CompletableFuture<List<OutputData>> completableFutureList = CompletableFuture.completedFuture(outputDataList);
		return completableFutureList;
	}

}
