package com.krish.app;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component //bean is not needed to register in xml
public class JavaBasedConfig implements Shape{
	
	private Point coordinate;
	
	public Point getCoordinate() {
		return coordinate;
	}
	@Resource(name="point2")
	public void setCoordinate(Point coordinate) {
		this.coordinate = coordinate;
	}

	@Override
	public void draw() {
		System.out.println("Coordinate is:("+coordinate.getX()+","+coordinate.getY()+")");
		
	}
	
}
