package com.krik.app;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Draw {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		context.registerShutdownHook();
		Triangle t = context.getBean("triangle", Triangle.class);
		t.draw();
		((ClassPathXmlApplicationContext)context).close();
	}
}
