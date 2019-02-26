package com.aravindan.springframework.didemo.controllers;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.aravindan.springframework.didemo.services.GreetingServiceImpl;

public class ConstructorInjectedControllerTests {
	
	private ConstructorInjectedController constructorInjectedController;

	@Before
	public void setUp() throws Exception {
		this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
	}

	@Test
	public void test() {
		assertEquals(GreetingServiceImpl.HELLO_GURUS, constructorInjectedController.sayHello());
	}

}
