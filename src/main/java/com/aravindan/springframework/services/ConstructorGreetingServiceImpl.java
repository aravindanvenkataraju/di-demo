package com.aravindan.springframework.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingServiceImpl implements GreetingService {

	public static final String HELLO_GURUS = "Hello Gurus!! I'm injected from Constructor";
	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		return HELLO_GURUS;
	}

}
