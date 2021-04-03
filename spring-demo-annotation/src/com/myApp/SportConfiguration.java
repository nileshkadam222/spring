package com.myApp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.myApp")
@PropertySource("classpath:application.properties")
public class SportConfiguration {

	//createing Fortune service bean
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	//createing Coach bean
	@Bean
	public Coach swmiCoach() {
		return new SwmiCoach(sadFortuneService());
	}
}
