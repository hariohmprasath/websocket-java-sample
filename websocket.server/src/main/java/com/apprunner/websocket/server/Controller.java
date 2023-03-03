package com.apprunner.websocket.server;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;

@org.springframework.stereotype.Controller
public class Controller {

	@MessageMapping("/hello")
	@SendTo("/topic/greetings")
	public String sayHello(String name) throws InterruptedException {
		System.out.println("Received message: " + name);
		Thread.sleep(1000);
		return "Hello " + name;
	}
}
