package com.myApp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Coach coach =  context.getBean("theTennisCoach",Coach.class);
		Coach tennisCoach =  context.getBean("tennisCoach",Coach.class);
		
		Coach footBallCaach =  context.getBean("footballCoach",Coach.class);
		
		Coach crecketCoach =  context.getBean("crecketCoach",Coach.class);
		
		Coach basketBallCoach =  context.getBean("basketBallCoach",Coach.class);
		
		System.out.println(tennisCoach.getDailyWorkout());
		
		System.out.println(footBallCaach.getDailyWorkout());
		
		System.out.println(tennisCoach.getDailyFortune());
		
		System.out.println(footBallCaach.getDailyWorkout());
		
		System.out.println(crecketCoach.getDailyWorkout());
		
		System.out.println(crecketCoach.getDailyFortune());
		
		System.out.println(basketBallCoach.getDailyFortune());
		
		context.close();
	}

}
