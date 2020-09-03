package com.krish.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Shape shape = context.getBean("circle", Shape.class);
		shape.print();
		System.out.println("From Main:"+context.getMessage("greet1", null, "This is your default message", null));
		((ClassPathXmlApplicationContext)context).close();
	}
}
