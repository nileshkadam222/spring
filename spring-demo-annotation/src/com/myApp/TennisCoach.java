package com.myApp;

import org.springframework.stereotype.Component;

//@Component("theTennisCoach")
@Component
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Running for 20 min";
	}

}
