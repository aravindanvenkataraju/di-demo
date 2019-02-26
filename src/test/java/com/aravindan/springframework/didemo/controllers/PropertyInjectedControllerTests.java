package com.aravindan.springframework.didemo.controllers;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.aravindan.springframework.didemo.services.GreetingServiceImpl;

public class PropertyInjectedControllerTests {
	
	private PropertyInjectedController propertyInjectedController;

	@Before
	public void setUp() throws Exception {
		this.propertyInjectedController = new PropertyInjectedController();
		this.propertyInjectedController.greetingService = new GreetingServiceImpl();
	}

	@Test
	public void test() {
		assertEquals(GreetingServiceImpl.HELLO_GURUS, propertyInjectedController.sayHello());
	}

}
