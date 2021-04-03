package com.myApp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnoationScopeApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach tennisCoach = context.getBean("tennisCoach",Coach.class);
		
		Coach tennisCoach1 = context.getBean("tennisCoach",Coach.class);
		
		System.out.println(tennisCoach.hashCode());
		System.out.println(tennisCoach1.hashCode());
		
		context.close();
		
	}

}
