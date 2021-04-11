package com.myApp.jdbc.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.myApp.jdbc.entity.Student;

public class ReadStudentDemo {

	public static void main(String[] args) {
		
		//Create Factory Object
		SessionFactory factory = new  Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(Student.class)
									.buildSessionFactory();
			
		//get session object
		Session currentSession = factory.getCurrentSession();
		
		try {
			//Creating new Studen object
			System.out.println("Creating student Object");
			Student s = new Student("Pooja","Parab","pooja12@gmail.com");
			
			//start the transation
			currentSession.beginTransaction();
			
			//saving student Object
			System.out.println("Saveing student");
			currentSession.save(s);
			
			
			//commit transation
			 currentSession.getTransaction().commit();

			 System.out.println("Done");
			 
			 
			 Session session = factory.getCurrentSession();
			 session.beginTransaction();
			 
			 Student student = session.get(Student.class, s.getId());
			 
			 System.out.println("Student " +student);
			 
			 session.getTransaction().commit();
			 
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
