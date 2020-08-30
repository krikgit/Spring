package com.krish.app;

public class Circle implements Shape{
	
	private Point point;

	public Point getPoint() {
		return point;
	}

	public void setPoint(Point point) {
		this.point = point;
	}

	@Override
	public void draw() {
		System.out.println("Circle center coordinate is:("+point.getX()+","+point.getY()+")");
		
	}

}
