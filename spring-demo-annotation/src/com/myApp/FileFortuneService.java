package com.myApp;

import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		return "File Fortune Service called";
	}

}
