package com.aravindan.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("de")
public class PrimaryGermanGreetingServiceImpl implements GreetingService {

	public static final String HELLO_GURUS = "Hallo Gurus !! Ich bin vom Primärdienst eingespritzt";
	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		return HELLO_GURUS;
	}

}
