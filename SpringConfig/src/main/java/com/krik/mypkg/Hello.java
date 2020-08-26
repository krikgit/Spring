package com.krik.mypkg;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Hello {
	public static final Logger log = LoggerFactory.getLogger(Hello.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		log.debug("Hello");
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Book book = context.getBean("book", Book.class);
		book.paint();
		((ClassPathXmlApplicationContext)context).close();
	}

}
