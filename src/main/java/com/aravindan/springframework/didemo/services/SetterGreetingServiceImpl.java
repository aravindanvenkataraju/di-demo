package com.aravindan.springframework.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingServiceImpl implements GreetingService {

	public static final String HELLO_GURUS = "Hello Gurus!! I'm injected from Setter";
	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		return HELLO_GURUS;
	}

}
