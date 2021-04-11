package com.myApp.jdbc.demo;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.myApp.jdbc.entity.Student;

public class DeleteStudentDemo {

	public static  Logger logger = Logger.getLogger(UpdateStudentDemo.class);
	public static void main(String[] args) {

		SessionFactory factory = new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(Student.class)
									.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		logger.error("Delete Student where student id is 5");
		Student student = session.get(Student.class, 5);
		//session.delete(student);
		
		
		logger.error("Delete Student where student id is 2");
		session.createQuery("delete Student s where s.id=2").executeUpdate();
		
		session.getTransaction().commit();
	}

}
