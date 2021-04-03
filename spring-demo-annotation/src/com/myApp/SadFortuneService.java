package com.myApp;

public class SadFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		return "Today is your Sad Day";
	}

}
