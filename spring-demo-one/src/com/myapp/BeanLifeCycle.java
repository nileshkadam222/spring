package com.myapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

class parentM{
	static void m1() {
		System.out.println("Parent Method");
	}
}

class ChildM extends parentM{
	static void m1() {
		System.out.println("child Method");
	}
	
	
}


  public class BeanLifeCycle {
  
  public static void main(String[] args) {
	  parentM p = new ChildM();
	  p.m1();
	  
  /*
  ClassPathXmlApplicationContext context = new
  ClassPathXmlApplicationContext("scopeLifeCycle_applicationContext.xml");
  
  //getting bean from container BaseballCoach coach =
  context.getBean("myCoach",BaseballCoach.class);
  
  //use bean System.out.println(coach.getDailyWorkout());
  
  //close container context.close(); }
   
   */
  
  }
  }
 
