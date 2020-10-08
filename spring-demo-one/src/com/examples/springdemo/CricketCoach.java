package com.examples.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService; 
	private String emailAddress;
	private String team;
	
	public CricketCoach()
	{
		System.out.println("Inside no-arg of cricketcoach.....");
	}
	

	public void setFortuneService(FortuneService fortuneService)
	{
		System.out.println("Inside cricketCoach setter method-  setFortuneService ");
		
		this.fortuneService = fortuneService;
	}
	@Override
	public String getdailyWorkout() {
		
		return "bowling practise for 10min.";
	}
	
	@Override
	public String getDailyFortune() {
		
		return "Inside cricket fortune overriden method..;" + fortuneService.getFortune();
		
	}


	public String getEmailAddress() {
		return emailAddress;
	}


	public void setEmailAddress(String emailAddress) 
	{
		this.emailAddress = emailAddress;
		System.out.println("Inside cricketCoach setter method-  setEmailAddress ");
	}


	public String getTeam() {
		return team;
	}


	public void setTeam(String team) 
	{
		this.team = team;
		System.out.println("Inside cricketCoach setter method-  setTeam ");
	}
}
