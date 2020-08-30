package com.krish.app;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDraw {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		context.registerShutdownHook();
		Shape shape = context.getBean("rect",Shape.class);
		shape.draw();
		((ClassPathXmlApplicationContext)context).close();
	}

}
