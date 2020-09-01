package com.krish.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class CircleAutowiredQualifier implements Shape{
	private Point point;

	public Point getPoint() {
		return point;
	}
	@Autowired
	@Qualifier("circleCenter")
	public void setPoint(Point point) {
		this.point = point;
	}

	@Override
	public void draw() {
		System.out.println("Coordinate of the center of the circle is:("+point.getX()+","+point.getY()+")");
		
	}
	
	
}
