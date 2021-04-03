package com.myApp;

import java.util.Iterator;

import org.springframework.beans.factory.annotation.Value;

public class SwmiCoach implements Coach {

	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.name}")
	private String name;
	
	
	private FortuneService fortuneService;
	
	public SwmiCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		System.out.println(email);
		System.out.println(name);
		return "Swmi 1000 meter daily";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}

}
