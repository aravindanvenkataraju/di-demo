package com.aravindan.springframework.didemo.services;

public class GreetingServiceFactory {
	
	private GreetingRepository greetingRepository;

	public GreetingServiceFactory(GreetingRepository greetingRepository) {
		super();
		this.greetingRepository = greetingRepository;
	}
	
	public GreetingService createGreetingService(String lang) {
		switch(lang) {
		case "en":
			return new PrimaryGreetingServiceImpl(greetingRepository);
		case "es":
			return new PrimarySpanishGreetingServiceImpl(greetingRepository);
		case "de":
			return new PrimaryGermanGreetingServiceImpl(greetingRepository);
		default:
			return new PrimaryGreetingServiceImpl(greetingRepository);
		}
			
	}

}
