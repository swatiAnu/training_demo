package com.examples.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("beanScopeApplicationContext.xml");
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		boolean result = (theCoach==alphaCoach);
		System.out.println("the memory allocation for object is :" + result);
		System.out.println("the memory allocation theCoach object is" + theCoach);
		System.out.println("the memory allocation alphaCoach object is" + alphaCoach);
		context.close();
		
		
		

	}

	
}
