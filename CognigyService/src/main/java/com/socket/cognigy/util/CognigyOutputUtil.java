package com.socket.cognigy.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.socket.cognigy.model.output.OutputData;

import io.socket.client.Socket;
import io.socket.emitter.Emitter;

@Component
public class CognigyOutputUtil {
	
	
	
	@Autowired
	CognigyMessageUtil cmu;

	public List<OutputData> getOutput(Socket socket) {
		System.out.println("******************************");
		List<OutputData> outputDataList = new ArrayList<OutputData>();
		socket.on("output", new Emitter.Listener() {
			@Override
			public void call(Object... args) {
				System.out.println("output : " + args[0]);
				OutputData outputData = cmu.getOutputDataObject(args[0].toString());
				System.out.println("outputData = "+outputData);
				outputDataList.add(outputData);
			}
		});
		
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println("******************************");
		return outputDataList;
	}
}
