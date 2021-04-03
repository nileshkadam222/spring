package com.myApp;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		return "Random Fortune Service";
	}

}
