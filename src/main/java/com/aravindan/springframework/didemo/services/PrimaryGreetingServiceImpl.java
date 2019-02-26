package com.aravindan.springframework.didemo.services;

public class PrimaryGreetingServiceImpl implements GreetingService {

	public static final String HELLO_GURUS = "Hello Gurus!! I'm injected from Primary Service";
	private GreetingRepository greetingRepository;
	
	public PrimaryGreetingServiceImpl(GreetingRepository greetingRepository) {
		super();
		this.greetingRepository = greetingRepository;
	}

	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		return greetingRepository.getEnglishGreeting();
	}

}
