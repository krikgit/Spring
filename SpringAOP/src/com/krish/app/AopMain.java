package com.krish.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.krish.app.service.ShapeService;

public class AopMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		ShapeService shapeService = context.getBean("shapeService", ShapeService.class);
		//shapeService.getCir().setShapeName("To see the effect of args advice in aspect");
		//shapeService.getCir().setShapeNameAndReturn("dummy from extra setter in circle ");
		System.out.println("This is from main "+shapeService.getCir().getShapeName()); //print for annotation and main call
		((ClassPathXmlApplicationContext)context).close();
	}

}
