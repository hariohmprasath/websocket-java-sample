package com.apprunner.websocket.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebSocketServerApplication {

	public static void main(String[] args) {
		System.out.println("Starting WebSocketServerApplication");
		SpringApplication.run(WebSocketServerApplication.class, args);
	}

}
