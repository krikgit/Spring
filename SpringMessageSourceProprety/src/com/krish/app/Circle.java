package com.krish.app;


import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape,ApplicationEventPublisherAware{
	
	private Point point;
	@Autowired
	private MessageSource messageSource;
	private String msgStatic ="";
	private String msgDynamic = "";
	private String keyNotFoundMsg = "";
	private ApplicationEventPublisher publish;

	public MessageSource getMessageSource() {
		return messageSource;
	}
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}
	
	public Point getPoint() {
		return point;
	}
	@Resource(name="point")
	public void setPoint(Point point) {
		this.point = point;
	}

	@Override
	public void print() {
		//static section from properties
		msgStatic = this.getMessageSource().getMessage("greet1", null,"Default value is printed as greet is not found", null);
		System.out.println("static section from properties:"+msgStatic);
		//Dynamic section
		msgDynamic = this.getMessageSource().getMessage("drawing.circle",new Object[] {point.getX(),point.getY()},"Default drawing",null);
		System.out.println("Dynamic section from properties:"+msgDynamic);
		//key not found in properties file
		keyNotFoundMsg = this.getMessageSource().getMessage("undefinedKey", null, "Oops! You didn't define the key.", null);
		System.out.println("When key is not found in properties file:"+keyNotFoundMsg);
		//Event
		DrawEvent dr = new DrawEvent(this);
		publish.publishEvent(dr);
		 
	}
	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publish) {
		this.publish = publish;
	}
	
	
}
