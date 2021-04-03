package com.myApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("basketBallCoach")
public class BasketBallCoach implements Coach {

	@Autowired
	@Qualifier("fileFortuneService")
	private FortuneService fortuneService;
	
	@Override
	public String getDailyWorkout() {
		return "Basket ball Coach";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}

}
