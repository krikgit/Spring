package com.krik.app;

import java.util.List;

public class Triangle {
	
	private List<Point> points;

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}
	
	public void draw() {
		System.out.println("Points are: ");
		for(Point p:points) {
			System.out.println(p.getX()+ ","+p.getY());
		}
	}

}
