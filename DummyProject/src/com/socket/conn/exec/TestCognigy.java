package com.dummy;

import java.net.URI;
import static java.util.Collections.singletonMap;

import io.socket.client.IO;
import io.socket.client.Socket;
import io.socket.emitter.Emitter;
import io.socket.engineio.client.transports.WebSocket;
//import io.socket.engineio.client.transports.WebSocket;
import okhttp3.OkHttpClient;
public class TestCognigy {

	public static void main(String[] args) {
		
		IO.Options options = new IO.Options();
        options.forceNew = true;
        options.transports = new String[]{WebSocket.NAME};
        options.auth = singletonMap("token", "70fc8f3981e28c1f07df5a24a89932dfc475a19db911cb3cb2ab277210b1fb23");

        final OkHttpClient client = new OkHttpClient();
        options.webSocketFactory = client;
        options.callFactory = client;
        URI uri = URI.create("https://endpoint-trial.cognigy.ai");

        final Socket socket = IO.socket(uri, options);
        
        socket.on(Socket.EVENT_CONNECT, new Emitter.Listener() {
            @Override
            public void call(Object... args) {
                System.out.println("connected : ");
                System.out.println("--"+socket.connected());
                System.out.println("connected : ");
                socket.close();
            }
        });
        
        socket.on(Socket.EVENT_CONNECT_ERROR, new Emitter.Listener() {
            @Override
            public void call(Object... args) {
                System.out.println("connection error");
                System.out.println("--"+args[0]);
                System.out.println("connection error");
                socket.close();
            }
        });

        socket.open();
        socket.connect();

	}

}
