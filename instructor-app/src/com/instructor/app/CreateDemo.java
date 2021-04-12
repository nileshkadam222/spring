package com.instructor.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.instructor.entity.Instructor;
import com.instructor.entity.InstructorDetail;

public class CreateDemo {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Instructor.class)
								.addAnnotatedClass(InstructorDetail.class)
								.buildSessionFactory();
		
		
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		
		Instructor instructor = new Instructor("Nilesh","Kadam","Nilesh@gmail.com");
		
		InstructorDetail instructorDetail = new InstructorDetail("XYZ", "Study");
		
		instructor.setInstructorDetail(instructorDetail);
		
		session.save(instructor);
		
		session.getTransaction().commit();
		
	}

}
