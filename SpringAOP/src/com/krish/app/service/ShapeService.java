package com.krish.app.service;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import com.krish.app.aspect.Logs;
import com.krish.app.model.Circle;
import com.krish.app.model.Triangle;

public class ShapeService {
	
	private Triangle tri;
	
	private Circle cir;
	
	public Triangle getTri() {
		return tri;
	}
	public void setTri(Triangle tri) {
		this.tri = tri;
	}
	@Logs //interface defined in aspect 
	public Circle getCir() {
		return cir;
	}
	public void setCir(Circle cir) {
		this.cir = cir;
	}
	@PreDestroy
	public void destroy() {
		System.out.print("Im going to die");
	}
	@PostConstruct
	public void start() {
		System.out.println("I am ready");
	}
}
