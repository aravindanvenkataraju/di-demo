package com.aravindan.springframework.didemo.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.aravindan.springframework.didemo.services.GreetingService;
@Controller
public class ConstructorInjectedController {
	
	private GreetingService greetingService;

	public ConstructorInjectedController(@Qualifier("constructorGreetingServiceImpl")GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}
	
	public String sayHello() {
		return greetingService.sayHello();
	}

}
