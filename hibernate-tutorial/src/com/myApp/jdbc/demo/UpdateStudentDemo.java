package com.myApp.jdbc.demo;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.myApp.jdbc.entity.Student;

public class UpdateStudentDemo {
	public static  Logger logger = Logger.getLogger(UpdateStudentDemo.class);
	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class).buildSessionFactory();
		
		
		Session currentSession = factory.getCurrentSession();
		
		currentSession.beginTransaction();
		
		logger.info("Update Pooja Record");
		Student student = currentSession.get(Student.class, 5);
		student.setFirstName("Ranjana");
		student.setLastName("Kadam");
		
		
		logger.info("Update Query Execute");
		currentSession.createQuery("update Student s set s.email='abc@gmail.com'").executeUpdate();
		
		currentSession.getTransaction().commit();
	}

}
