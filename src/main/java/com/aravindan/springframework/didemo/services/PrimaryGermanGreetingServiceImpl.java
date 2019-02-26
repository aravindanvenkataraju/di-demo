package com.aravindan.springframework.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

public class PrimaryGermanGreetingServiceImpl implements GreetingService {
	public static final String HELLO_GURUS = "Hallo Gurus !! Ich bin vom Primärdienst eingespritzt";
	
	private GreetingRepository greetingRepository;
	
	
	public PrimaryGermanGreetingServiceImpl(GreetingRepository greetingRepository) {
		super();
		this.greetingRepository = greetingRepository;
	}


	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		return greetingRepository.getGermanGreeting();
	}

}
