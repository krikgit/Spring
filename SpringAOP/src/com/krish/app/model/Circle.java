package com.krish.app.model;


public class Circle {
	private String shapeName;
	
	
	public String getShapeName() {
		return shapeName;
	}
	
	public void setShapeName(String shapeName) {
		this.shapeName = shapeName;
		System.out.println("Circle setter called"); // this will be printed twice. one for bean initialization & another for main
		throw(new RuntimeException());
	}
	
	public String setShapeNameAndReturn(String shapeName) {
		this.shapeName = shapeName;
		System.out.println("Extra setter");
		return shapeName;
	}
}
