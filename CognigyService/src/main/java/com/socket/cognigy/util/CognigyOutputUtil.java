package com.socket.cognigy.util;

import org.springframework.stereotype.Component;

import io.socket.client.Socket;
import io.socket.emitter.Emitter;

@Component
public class CognigyOutputUtil {

	public void getOutput(Socket socket) {
		socket.on("output", new Emitter.Listener() {
			@Override
			public void call(Object... args) {
				System.out.println("output : " + args[0]);
			}
			
		});
	}
}
