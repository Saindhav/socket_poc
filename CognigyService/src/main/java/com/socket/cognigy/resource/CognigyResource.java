package com.socket.cognigy.resource;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.socket.cognigy.model.output.OutputData;
import com.socket.cognigy.service.BotService;

@RestController
@RequestMapping("/bot")
public class CognigyResource {
	@Autowired
	BotService botService;
	
	@RequestMapping("/{userMessage}")
	public CompletableFuture<List<OutputData>> getBotMessage( @PathVariable("userMessage") String userMessage) {
		return botService.generateBotReply(userMessage);
	}

}
