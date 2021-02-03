package com.socket.cognigy.service;

import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

	public String generateBotReply(String userMessage) {
		if (null == socket) {
			System.out.println(" socket_id null");
			socket = ccu.getCognigyBotMessage();
			socket_id = socket.id();
		} else {
			System.out.println("socket_id not null");
			String jsonStr = cmu.getJson(socket_id, userMessage);
			
			CompletableFuture.runAsync(() -> {
				cmu.sendMessage(socket, jsonStr);
			});

			
			
			CompletableFuture.runAsync(() -> {
				cou.getOutput(socket);
			});
			
		}
		return "Hey " + userMessage + "!!. How Are You? Your Socket ID Is : " + socket_id;
	}

}
