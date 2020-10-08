package com.examples.springdemo;

public class BaseballCoach implements Coach
{
	//define a private field for dependency
	private FortuneService fortuneService;
	
	//define constructor of this class for dependency injection
	public BaseballCoach(FortuneService theFortuneService)
	{
		
		System.out.println("Inside BaseballCoach Constructor for dependency injection.....");
		fortuneService=theFortuneService;
	}
	@Override
	public String getdailyWorkout() 
	{
		return "Baseball practise for 10 min";
	}

	@Override
	public String getDailyFortune() 
	{
		
		return fortuneService.getFortune();
		
	}

}
