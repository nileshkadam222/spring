package com.instructor.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.instructor.entity.Instructor;
import com.instructor.entity.InstructorDetail;

public class DeleteDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class).buildSessionFactory();

		Session currentSession = factory.getCurrentSession();
		currentSession.beginTransaction();
		
		Instructor instructor = currentSession.get(Instructor.class, 1);

		currentSession.delete(instructor);
		
		currentSession.getTransaction().commit();
	}

}
