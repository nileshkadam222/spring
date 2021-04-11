package com.myApp.jdbc.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.myApp.jdbc.entity.Student;

public class CreateStudentDemo {

	public static void main(String[] args) {
		
		//Create Factory Object
		SessionFactory session = new  Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(Student.class)
									.buildSessionFactory();
			
		//get session object
		Session currentSession = session.getCurrentSession();
		
		try {
			//Creating new Studen object
			System.out.println("Creating student Object");
			Student s = new Student("Yogesh","Kadam","yogesh.kadam222@gmail.com");
			
			//start the transation
			currentSession.beginTransaction();
			
			//saving student Object
			System.out.println("Saveing student");
			currentSession.save(s);
			
			
			//commit transation
			 currentSession.getTransaction().commit();

			 System.out.println("Done");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
