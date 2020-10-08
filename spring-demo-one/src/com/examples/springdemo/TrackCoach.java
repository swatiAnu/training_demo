package com.examples.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	// creating no-arg constructor for MyApp.java class
	
	
	public TrackCoach()
	{
		System.out.println("Hello from trackcoach..");
	}
	
	 // constructor for dependency injection
	public  TrackCoach(FortuneService theFortuneService)
	{
		System.out.println("Inside tracktcoach for FortuneService ");
		fortuneService=theFortuneService;
		
	}
	
	@Override
	public String getdailyWorkout() {
		
		return "Running practise in track for 30min.";
	}

	@Override
	public String getDailyFortune() {
		
		return "fortune froom track coach..: "+fortuneService.getFortune();
	}
	//add init method for bean initialization
	 public void initializeMyBean()
	 {
		 System.out.println("inside Trackcoach: for initialization of bean");
	 }
	// add destroy method for bean destruction
	 public void destroyMyBean()
	 {
		 System.out.println("inside Trackcoach: destroyMyBean");
	 }

}
