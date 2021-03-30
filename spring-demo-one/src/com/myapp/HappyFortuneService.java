package com.myapp;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is your happy Day";
	}

}
