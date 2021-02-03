package com.socket.cognigy.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.socket.cognigy.service.BotService;

@RestController
@RequestMapping("/bot")
public class CognigyResource {
	@Autowired
	BotService botService;
	
	@RequestMapping("/{userMessage}")
	public String getBotMessage( @PathVariable("userMessage") String userMessage) {
		return botService.generateBotReply(userMessage);
	}

}
