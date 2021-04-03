package com.myApp;

import org.springframework.stereotype.Component;

@Component
public class DatbaseFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		return "Database Fortune service";
	}

}
