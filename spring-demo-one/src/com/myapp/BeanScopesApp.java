package com.myapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopesApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("scope_applicationContext2.xml");

		Coach bean = context.getBean("myCoach", Coach.class);

		Coach bean1 = context.getBean("myCoach", Coach.class);

		System.out.println(bean.hashCode());
		System.out.println(bean1.hashCode());

		context.close();

	}

}
