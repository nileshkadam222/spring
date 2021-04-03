package com.myApp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnoationBasedConfiguration {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfiguration.class);
		
		Coach tennisCoach = context.getBean("tennisCoach",Coach.class);
		
		Coach tennisCoach1 = context.getBean("tennisCoach",Coach.class);
		
		System.out.println(tennisCoach.hashCode());
		System.out.println(tennisCoach1.hashCode());
		
		context.close();
		
	}

}
