package com.myapp;

public class BaseballCoach implements Coach {
	private FortuneService fortuneService;

	public BaseballCoach(FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	public void initBean() {
		System.out.println("bean init method called");
	}
	
	public void destoryBean() {
		System.out.println("bean destory method called");
	}

}
