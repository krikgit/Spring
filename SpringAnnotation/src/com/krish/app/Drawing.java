package com.krish.app;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Drawing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		context.registerShutdownHook();
		Shape s = context.getBean("javaBasedConfig", Shape.class);
		s.draw();
		((ClassPathXmlApplicationContext)context).close();
	}

}
