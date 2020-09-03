package com.krish.app;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
/*import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;*/

@Component //bean is not needed to register in xml & its generic of below annotation
//@Service 
//@Controller  //this is C of MVC
//@Repository //for data specific
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
