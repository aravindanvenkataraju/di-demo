package com.aravindan.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile({"en","default"})
public class PrimaryGreetingServiceImpl implements GreetingService {

	public static final String HELLO_GURUS = "Hello Gurus!! I'm injected from Primary Service";
	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		return HELLO_GURUS;
	}

}
