package com.myApp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanInitalizationUsingJavaConfigApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfiguration.class);
		
		Coach swmiCoach = context.getBean("swmiCoach",Coach.class);
		
		System.out.println(swmiCoach.getDailyFortune());

		System.out.println(swmiCoach.getDailyWorkout());
		
		context.close();
		
	}

}
