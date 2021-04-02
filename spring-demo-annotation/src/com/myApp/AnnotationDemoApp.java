package com.myApp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Coach coach =  context.getBean("theTennisCoach",Coach.class);
		Coach coach =  context.getBean("tennisCoach",Coach.class);
		
		Coach coach1 =  context.getBean("footballCoach",Coach.class);
		
		System.out.println(coach.getDailyWorkout());
		
		System.out.println(coach1.getDailyWorkout());
		
		context.close();
	}

}
