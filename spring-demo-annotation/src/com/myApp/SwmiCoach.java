package com.myApp;

import java.util.Iterator;

public class SwmiCoach implements Coach {

	private FortuneService fortuneService;
	
	public SwmiCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Swmi 1000 meter daily";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}

}
