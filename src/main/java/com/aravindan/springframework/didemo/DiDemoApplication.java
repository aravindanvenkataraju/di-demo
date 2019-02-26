package com.aravindan.springframework.didemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.aravindan.springframework.didemo.controllers.ConstructorInjectedController;
import com.aravindan.springframework.didemo.controllers.MyController;
import com.aravindan.springframework.didemo.controllers.PropertyInjectedController;
import com.aravindan.springframework.didemo.controllers.SetterInjectedController;

@SpringBootApplication
@ComponentScan(basePackages= {"com.aravindan.springframework.services", "com.aravindan.springframework.didemo"})
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =  SpringApplication.run(DiDemoApplication.class, args);
		MyController controller = ctx.getBean(MyController.class, "myController");
		controller.hello();
		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
	}

}
