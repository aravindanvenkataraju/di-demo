package com.aravindan.springframework.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

public class PrimarySpanishGreetingServiceImpl implements GreetingService {

	public static final String HELLO_GURUS = "Hola gurús !! Estoy inyectado del Servicio Primario";
	
	private GreetingRepository greetingRepository;
	
	
	public PrimarySpanishGreetingServiceImpl(GreetingRepository greetingRepository) {
		super();
		this.greetingRepository = greetingRepository;
	}


	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		return greetingRepository.getSpanishGreeting();
	}

}
