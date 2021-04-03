package com.myApp;

import org.springframework.stereotype.Component;

@Component
public class RestFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		return "Rest Frotune Service";
	}

}
