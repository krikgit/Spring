package com.krik.app;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

//to show the bean names
public class DemoPostProcessor  implements BeanPostProcessor {

	
	  @Override public Object postProcessAfterInitialization(Object obj, String
	  beanName) throws BeansException {
	  System.out.println("After initialazation of "+beanName); return obj; }
	  
	  @Override public Object postProcessBeforeInitialization(Object obj, String
	  beanName) throws BeansException {
	  System.out.println("Before initialazation of "+beanName); return obj; }
	 

}
