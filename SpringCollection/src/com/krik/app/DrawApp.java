package com.krik.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle tr = context.getBean("triangle", Triangle.class);
		tr.draw();
		((ClassPathXmlApplicationContext)context).close();
	}

}
