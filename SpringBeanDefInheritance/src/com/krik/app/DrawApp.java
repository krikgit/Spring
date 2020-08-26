package com.krik.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawApp {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		Triangle tr = applicationContext.getBean("parent1",Triangle.class);
		tr.draw();
	}
}