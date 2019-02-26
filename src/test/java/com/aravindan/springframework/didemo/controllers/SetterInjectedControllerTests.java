package com.aravindan.springframework.didemo.controllers;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.aravindan.springframework.didemo.services.GreetingServiceImpl;

public class SetterInjectedControllerTests {
	
	private SetterInjectedController setterInjectedController;

	@Before
	public void setUp() throws Exception {
		this.setterInjectedController = new SetterInjectedController();
		this.setterInjectedController.setGreetingService(new GreetingServiceImpl());
	}

	@Test
	public void test() {
		assertEquals(GreetingServiceImpl.HELLO_GURUS, setterInjectedController.sayHello());
	}

}
