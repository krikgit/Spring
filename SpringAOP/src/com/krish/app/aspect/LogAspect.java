package com.krish.app.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.krish.app.model.Circle;

@Aspect
@Component
public class LogAspect {
	  
	
	
	  //For all the getShapeName
	  
		/*
		 * @Before("execution(public String getShapeName())") public void
		 * logAdviceBefore() {
		 * System.out.println("Advice to run from Aspect. Method called"); }
		 */
	  
	  //To run class specific method mention with package
	  
		/*
		 * @After("execution(public String com.krish.app.model.Circle.getShapeName())")
		 * public void logAdviceAfter() {
		 * System.out.println("Advice to show with after annotation in aspect. "); }
		 */
	  
	  //Usage of Wild card whatever the get method which return String
		/*
		 * @Before("execution(public String get*())") public void logAdviceBeforeWild()
		 * { System.out.
		 * println("Advice to run from Aspect with wild for return type String only.");
		 * }
		 */
	  
	  //Usage of Wild card whatever the get method or whatever the return type
	  
		/*
		 * @After("execution(public * get*())") //* can be included aa argument in get
		 * public void logAdviceAfterWild() { System.out.
		 * println("Advice to show with after annotation in aspect with fully wild card."
		 * ); }
		 */
	  
	  
	  
	  //Usage of pointcut
	  
	  @Pointcut("execution(public * com.krish.app.model.Circle.get*())") public
	  void allGetters() {}
	  
	  //method for allGetters pointcut only
	  
	  @Before("allGetters()") public void poincutDemo() {
	  System.out.println("This is from from pointcut Circle getters"); }
	  
	  
	  
	  //pointcut for all method of whole class whatever the argument is
	  
	  @Pointcut("execution(* com.krish.app.model.Circle.*())") public void
	  allMethodsOfCircle() {}
	  
	  //method for allGetters pointcut only
	  
		/*
		 * @Before("allMethodsOfCircle()") public void poincutDemoAllMethod() {
		 * System.out.println("This is from from circle pointcut"); }
		 * 
		 * 
		 * //usage of within for all method in package
		 * 
		 * @Pointcut("within(com.krish.app.model..*)") public void allMethods() {}
		 * 
		 * //whithin use
		 * 
		 * @Before("allMethods()") public void demoAllMethods() { System.out.
		 * println("This is from from within advice pointcut with all methods"); }
		 */
	  
		/*
		 * //restricted to class with && operation
		 * 
		 * @Before("allMethodsOfCircle() && allMethods()") public void restrictClass() {
		 * System.out.println("Restricted to circle"); }
		 */
	  
	  //Joinpoint Usage
	  @Before("allMethodsOfCircle()")
	  public void circleClass(JoinPoint jointPoint) {
		  System.out.println(jointPoint.toString());
	  }
	  
	  //jontpoint get_target
	  @Before("allMethodsOfCircle()")
	  public void circleTarget(JoinPoint jointPoint) {
		 // System.out.println(jointPoint.getTarget());.
		  Circle cir = (Circle)jointPoint.getTarget();
		  System.out.println("This is from jointpoint.getTarget() :"+cir.getShapeName());
	  }
	  
	  //jointPoint argument pass
	  @Before("args(String)")   //need to call setMethod in main to see the effect
	  public void circleClassArg() {
		  System.out.println("For args methods with String");
	  }
	  
	  //To make use of String pass in args
	  @After("args(var)")   //need to call setMethod in main to see the effect
	  public void circleArgValue(String var) {
		  System.out.println("For args methods with String value: "+var);
	  }
	  
	  //After Returning in AOP
	  @AfterReturning("args(variable)")
	  public void controlWithAfterReturnSetter(String variable) {
		  System.out.println("After Successfull return:"+variable);
	  }
	  
	  //After Exception
	  @AfterThrowing("args(variable)")
	  public void afterThrowingInSetter(String variable) {
		//To show this msg, disable prop in circle bean in Spring.xml
		  System.out.println("After throwing exception from setters of circle:"+variable); 
	  }
	  
	  //to handle obj from pojo 
	  @AfterReturning(pointcut="args(variable)", returning="returnString")
	  public void controlWithAfterReturning(String variable,Object returnString) {
		  System.out.println("After Successfull return:"+variable+" with return value:"+returnString);
	  }
	  
	  //handling exception by poncut
	  @AfterThrowing(pointcut="args(variable)", throwing = "ex")
	  public void afterThrowingUseOfPointcut(String variable, RuntimeException ex) {
		//To show this msg, disable prop in circle bean in Spring.xml
		  System.out.println("After throwing exception from setters of circle:"+variable+" & throwing :"+ex); 
	  }
	  
	  //Around advice for before and after config
	  @Around("allGetters()")
	  public Object aroundUsage(ProceedingJoinPoint pj) { //passing argument is mandate for around
		  Object obj = null;
		  try {
			 System.out.println("allMethodsOfCircle pointcut==Before in around");
			obj = pj.proceed();
			System.out.println("allMethodsOfCircle pointcut==return in try in around");
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			 System.out.println("allMethodsOfCircle pointcut==For all getters before pointcut around annotation");
			 e.printStackTrace();
		}
		  System.out.println("After finally");
		  return obj;
	  }
	  
	  //making of user defined annotation
	  @Around("@annotation(com.krish.app.aspect.Logs)")
	  public Object aroundUsageUserDefinedAnnotation(ProceedingJoinPoint pj) { //passing argument is mandate for around
		  Object obj = null;
		  try {
			 System.out.println("allMethodsOfCircle pointcut==Before in around");
			obj = pj.proceed();
			System.out.println("allMethodsOfCircle pointcut==return in try in around");
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			 System.out.println("allMethodsOfCircle pointcut==For all getters before pointcut around annotation");
			 e.printStackTrace();
		}
		  System.out.println("After finally");
		  return obj;
	  }
}
