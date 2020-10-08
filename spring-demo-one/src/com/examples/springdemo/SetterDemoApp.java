package com.examples.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) 
	{
		//load the spring container
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CricketCoach cricketcoach = context.getBean("myCricketCoach", CricketCoach.class);
		System.out.println(cricketcoach.getDailyFortune());
		System.out.println(cricketcoach.getdailyWorkout());
		System.out.println(cricketcoach.getEmailAddress());
		System.out.println(cricketcoach.getTeam());
		context.close();
		
		
		

	}

}
