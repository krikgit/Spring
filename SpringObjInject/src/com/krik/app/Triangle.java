package com.krik.app;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware,BeanNameAware {
	
	private Point pointA;
	private Point pointB;
	private Point pointC;
	ApplicationContext context = null;
	
	public Point getPointA() {
		return pointA;
	}
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	public Point getPointB() {
		return pointB;
	}
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	public Point getPointC() {
		return pointC;
	}
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	
	public void draw() {
		System.out.println("A Points are: " + pointA.getX()+" & " +pointA.getY());
		System.out.println("B Points are: " + pointB.getX()+" & " +pointB.getY());
		System.out.println("C Points are: " + pointC.getX()+" & " +pointC.getY());
	}
	@Override
	public void setBeanName(String beanName) {
		System.out.println(beanName);
	}
	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		this.context = context;
	}
	
}
