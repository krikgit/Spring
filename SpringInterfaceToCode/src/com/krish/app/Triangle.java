package com.krish.app;

public class Triangle implements Shape{
	
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

	@Override
	public void draw() {
		System.out.println("The Triangle coordinates are: "
				+ "("+pointA.getX()+","+pointA.getY()+") "
				+"("+pointB.getX()+","+pointB.getY()+") "
				+"("+pointC.getX()+","+pointC.getY()+") ");
							
		
	}

}
