package com.socket.conn.exec;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import org.json.JSONException;
import org.json.JSONObject;

import static java.util.Collections.singletonMap;

import io.socket.client.IO;
import io.socket.client.Manager;
import io.socket.client.Socket;
import io.socket.emitter.Emitter;
import io.socket.engineio.client.transports.Polling;
import io.socket.engineio.client.transports.WebSocket;
import io.socket.util.Optional;
//import io.socket.engineio.client.transports.WebSocket;
import okhttp3.OkHttpClient;

public class TestCognigy {

	public static void main(String[] args) throws URISyntaxException {

		/*IO.Options options = new IO.Options();
		options.forceNew = true;
		options.transports = new String[] { WebSocket.NAME };
		options.auth = singletonMap("token", "70fc8f3981e28c1f07df5a24a89932dfc475a19db911cb3cb2ab277210b1fb23");*/
		
		IO.Options options = IO.Options.builder()
			    // IO factory options
			    .setForceNew(true)
			    .setMultiplex(true)
			    .setAuth(singletonMap("token", "70fc8f3981e28c1f07df5a24a89932dfc475a19db911cb3cb2ab277210b1fb23"))
			    .setTransports(new String[] {WebSocket.NAME }).build();

		//final OkHttpClient client = new OkHttpClient();
		//options.webSocketFactory = client;
		//options.callFactory = client;
		URI uri = URI.create(
				"https://endpoint-trial.cognigy.ai");

		final Socket socket = IO.socket("https://endpoint-trial.cognigy.ai", options);

		final BlockingQueue<Optional> values = new LinkedBlockingQueue<Optional>();

		socket.on(Socket.EVENT_CONNECT, new Emitter.Listener() {
			@Override
			public void call(Object... args) {
				System.out.println("connected : ");
				System.out.println("--" + socket.connected());
				System.out.println("connected : " + socket.id());
				JSONObject obj = new JSONObject();
				try {
					obj.put("sid", socket.id());
					obj.put("age", new Integer(27));
				} catch (JSONException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				values.offer(Optional.ofNullable(obj));
				// socket.close();
			}
		});

		socket.on(Socket.EVENT_CONNECT_ERROR, new Emitter.Listener() {
			@Override
			public void call(Object... args) {
				System.out.println("connection error");
				System.out.println("--" + args[0]);
				System.out.println("connection error");
				socket.close();
			}
		});

		socket.on(Manager.EVENT_ERROR, new Emitter.Listener() {

			@Override
			public void call(Object... arg0) {
				System.out.println(" event error");

			}
		});

		socket.on(Manager.EVENT_PACKET, new Emitter.Listener() {

			@Override
			public void call(Object... arg0) {
				System.out.println(" event packet");

			}
		});

		socket.on(Manager.EVENT_RECONNECT, new Emitter.Listener() {

			@Override
			public void call(Object... arg0) {
				System.out.println(" event reconnect");

			}
		});

		socket.on(Manager.EVENT_RECONNECT_ATTEMPT, new Emitter.Listener() {

			@Override
			public void call(Object... arg0) {
				System.out.println(" event reconnect attempt");

			}
		});

		socket.on(Manager.EVENT_RECONNECT_ERROR, new Emitter.Listener() {

			@Override
			public void call(Object... arg0) {
				System.out.println(" event reconnect error");

			}
		});

		socket.on(Manager.EVENT_RECONNECT_FAILED, new Emitter.Listener() {

			@Override
			public void call(Object... arg0) {
				System.out.println(" event failed");

			}
		});

		socket.on(Manager.EVENT_TRANSPORT, new Emitter.Listener() {

			@Override
			public void call(Object... arg0) {
				System.out.println(" event transport");

			}
		});

		socket.open();
		socket.connect();

	}

}
