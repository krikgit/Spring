package com.krish.app;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

public class RectJSR250 implements Shape{
	private Point pointA;
	private Point pointB;
	private Point pointC;
	private Point pointD;
	
	public Point getPointA() {
		return pointA;
	}
	@Resource(name="point1")
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	public Point getPointB() {
		return pointB;
	}
	@Resource(name="point2")
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}
	@Resource(name="point3")
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public Point getPointD() {
		return pointD;
	}
	@Resource(name="point4")
	public void setPointD(Point pointD) {
		this.pointD = pointD;
	}

	@Override
	public void draw() {
		System.out.println("Drawing rect having coordinates"
				+ pointA.getX()+","+pointA.getY()+"),"
				+ "("+pointB.getX()+","+pointB.getY()+"),"
				+ "("+ pointC.getX()+","+pointC.getY()+"),"
				+ "("+ pointD.getX()+","+pointD.getY()+")");
		
	}
	@PostConstruct
	public void initilizeRect() {
		System.out.println("Rectangle coordinates are preparing");
	}
	@PreDestroy
	public void destroyRect() {
		System.out.println("Rectangle coordinates are shown");
	}
}
