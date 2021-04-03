package com.myApp;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

//@Component("theTennisCoach")
@Component
//@Scope("prototype")
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
	
	@PostConstruct
	public void init() {
		System.out.println("Post Construct method call");
	}
	
	@PreDestroy
	public void destory() {
		System.out.println("destroy bean method call");
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
