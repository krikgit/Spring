package com.krik.app;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangle implements InitializingBean,DisposableBean{
	
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
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
		System.out.println("A Point: (" + pointA.getX()+"," +pointA.getY()+")");
		System.out.println("B Point: (" + pointB.getX()+"," +pointB.getY()+")");
		System.out.println("C Point: (" + pointC.getX()+", " +pointC.getY()+")");
	}
	
	
	  @Override public void afterPropertiesSet() throws Exception {
	  System.out.println("InitializingBean: init method called in Triangle");
	  
	  }
	  
	  @Override public void destroy() throws Exception {
	  System.out.println("DisposableBean: destroy method called in Triangle");
	  
	  }
	 
	 
}
