package com.examples.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("beanLifeCycleApplicationContext.xml");
		Coach theCoach = context.getBean("myCoach", Coach.class);
		System.out.println(theCoach.getdailyWorkout());
		
		context.close();
		
		
		

	}

	
}
