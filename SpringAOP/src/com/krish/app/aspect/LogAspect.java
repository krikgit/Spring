package com.krish.app.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {
	@Before("execution(public String getShapeName())")
	public void logAdvice() {
		System.out.println("Advice to run. Method called");
	}
}
