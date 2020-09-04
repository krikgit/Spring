package com.krish.app.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {
	  
	
	  //For all the getShapeName
	  
	  @Before("execution(public String getShapeName())") public void
	  logAdviceBefore() {
	  System.out.println("Advice to run from Aspect. Method called"); }
	  
	  //To run class specific method mention with package
	  
	  @After("execution(public String com.krish.app.model.Circle.getShapeName())")
	  public void logAdviceAfter() {
	  System.out.println("Advice to show with after annotation in aspect. "); }
	  
	  //Usage of Wild card whatever the get method which return String
	  
	  @Before("execution(public String get*())") public void logAdviceBeforeWild()
	  { System.out.
	  println("Advice to run from Aspect with wild for return type String only.");
	  }
	  
	  //Usage of Wild card whatever the get method or whatever the return type
	  
	  @After("execution(public * get*())") //* can be included aa argument in get
	  public void logAdviceAfterWild() { System.out.
	  println("Advice to show with after annotation in aspect with fully wild card."
	  ); }
	 
	  
	
	  //Usage of pointcut
	  
	  @Pointcut("execution(public * com.krish.app.model.Triangle.get*())") public
	  void allGetters() {}
	  
	  //method for allGetters pointcut only
	  
	  @Before("allGetters()") public void poincutDemo() {
	  System.out.println("This is from from pointcut"); }
	 
	  
	
	  //pointcut for all method of whole class whatever the argument is
	  
	  @Pointcut("execution(* com.krish.app.model.Circle.*())") 
	  public void allMethodsOfCircle() {}
	  
	  //method for allGetters pointcut only
	  
	  @Before("allMethodsOfCircle()") public void poincutDemoAllMethod() {
	  System.out.println("This is from from circle pointcut"); }
	 
	  
	  //usage of within for all method in package
	  @Pointcut("within(com.krish.app.model..*)")
	  public void allMethods() {}
	  
	  //whithin use
	  @Before("allMethods()")
	  public void demoAllMethods() {
		  System.out.println("This is from from within advice pointcut");
	  }
	  
	  //restricted to class with && operation
	  @Before("allMethodsOfCircle() && allMethods()")
	  public void restrictClass() {
		  System.out.println("Restricted to circle");
	  }
}
