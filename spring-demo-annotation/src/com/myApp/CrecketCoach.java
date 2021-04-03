package com.myApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CrecketCoach implements Coach {

	@Autowired
	@Qualifier("datbaseFortuneService")
	private FortuneService fortuneService;
	
	@Override
	public String getDailyWorkout() {
		return "Yes 200 Runs";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}

}
