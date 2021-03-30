package com.myapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		//load all beans in container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Retrive beans from container
		CricketCoach theCoach = context.getBean("myCricketCoach",CricketCoach.class);
		
		
		//call the methods
		System.out.println(theCoach.getDailyFortune());
		
		System.out.println(theCoach.getTeam());
		
		System.out.println(theCoach.getEmailaddress());
		
		
		//cloase context
		context.close();
		
		
		
		
	}

}
