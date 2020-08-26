package com.kk.spring;

public class Triangle {
	
	private String type;
	private int length;
	
	
	public Triangle(String type) {
		this.type = type;
	}
	
	public Triangle(int length) {
		this.length = length;
	}
	

	public Triangle(String type, int length) {
		this.type = type;
		this.length = length;
	}

	public int getLength() {
		return length;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void draw() {
		System.out.println(getType() + " Triangle Class of length "+ getLength());
	}
}
