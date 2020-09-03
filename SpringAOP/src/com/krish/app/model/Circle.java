package com.krish.app.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Circle {
	private String shapeName;

	public String getShapeName() {
		return shapeName;
	}
	@Autowired
	public void setShapeName(String shapeName) {
		this.shapeName = shapeName;
	}
	
}
