package com.aravindan.springframework.didemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.aravindan.springframework.didemo.services.GreetingService;
@Controller
public class SetterInjectedController {
	
	private GreetingService greetingService;
	
	public String sayHello() {
		return greetingService.sayHello();
	}
	
	@Autowired
	 
	public void setGreetingService(@Qualifier("setterGreetingServiceImpl") GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	

}
