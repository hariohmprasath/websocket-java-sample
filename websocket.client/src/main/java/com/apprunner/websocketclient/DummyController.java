package com.apprunner.websocketclient;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class DummyController {

	@GetMapping
	public String sayHello(){
		return "Dummy response";
	}
}
