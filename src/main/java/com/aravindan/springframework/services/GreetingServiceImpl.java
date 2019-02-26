package com.aravindan.springframework.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

	public static final String HELLO_GURUS = "Hello Gurus!!";
	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		return HELLO_GURUS;
	}

}
