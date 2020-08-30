package com.krish.app;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawApp {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle tr = context.getBean("triangle", Triangle.class);
		tr.draw();
		((ClassPathXmlApplicationContext) context).close();
	}

}
