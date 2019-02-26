package com.aravindan.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("es")
public class PrimarySpanishGreetingServiceImpl implements GreetingService {

	public static final String HELLO_GURUS = "Hola gurús !! Estoy inyectado del Servicio Primario";
	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		return HELLO_GURUS;
	}

}
