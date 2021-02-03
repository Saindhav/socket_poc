package com.socket.cognigy.util;

import java.net.URI;

import org.springframework.stereotype.Component;

import io.socket.client.IO;
import io.socket.client.Socket;
import io.socket.emitter.Emitter;
import io.socket.engineio.client.transports.Polling;
import io.socket.engineio.client.transports.WebSocket;
import okhttp3.OkHttpClient;

@Component
public class CognigyConnectionUtil {

	public Socket getCognigyBotMessage() {
		final IO.Options options = new IO.Options();
		options.forceNew = true;
		options.transports = new String[] { WebSocket.NAME, Polling.NAME };

		final OkHttpClient client = new OkHttpClient();
		options.webSocketFactory = client;
		options.callFactory = client;

		IO.setDefaultOkHttpWebSocketFactory(client);
		IO.setDefaultOkHttpCallFactory(client);

		URI uri = URI.create("https://endpoint-trial.cognigy.ai");
		Socket socket = IO.socket(uri, options);

		socket.on(Socket.EVENT_CONNECT, new Emitter.Listener() {
			@Override
			public void call(Object... args) {
				//System.out.println("CONNECTED WITH : " + socket.id());
			}
		});

		socket.connect();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return socket;

	}

}
