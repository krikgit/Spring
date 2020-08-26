package com.kk.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SuppressWarnings("unused")
public class DrwingApp {

	public static void main(String[] args) {
		//BeanFactory context = new ClassPathXmlApplicationContext("spring.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle tr = context.getBean("triangle",Triangle.class); 
		tr.draw();
		((ClassPathXmlApplicationContext)context).close();
	}

}
