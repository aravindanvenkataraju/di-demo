package com.aravindan.springframework.didemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.aravindan.springframework.didemo.services.GreetingService;
import com.aravindan.springframework.didemo.services.GreetingServiceImpl;
@Controller
public class PropertyInjectedController {
	@Autowired
	@Qualifier("greetingServiceImpl")
	public GreetingService greetingService;
	
	public String sayHello() {
		return greetingService.sayHello();
	}
}
