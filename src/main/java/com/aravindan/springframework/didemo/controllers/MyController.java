package com.aravindan.springframework.didemo.controllers;

import org.springframework.stereotype.Component;

import com.aravindan.springframework.didemo.services.GreetingService;

@Component
public class MyController {
	
	private GreetingService greetingService;
	
	
	public MyController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}


	public void hello() {
		System.out.println(greetingService.sayHello());
	}
}
