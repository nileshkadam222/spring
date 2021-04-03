package com.myApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("theTennisCoach")
@Component
public class TennisCoach implements Coach {

	private FortuneService fortuneService;
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.name}")
	private String name;
	
	
	@Autowired
	public TennisCoach(@Qualifier("happyFortuneService") FortuneService theFortuneService) {
		System.out.println("Ibjecting bean Using Constructore in :"+getClass());
		this.fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		System.out.println(email + "  "+name);
		return "Running for 20 min";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}

}
