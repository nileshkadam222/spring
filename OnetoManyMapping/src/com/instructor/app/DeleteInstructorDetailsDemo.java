package com.instructor.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.instructor.entity.Instructor;
import com.instructor.entity.InstructorDetail;


public class DeleteInstructorDetailsDemo {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class).buildSessionFactory();

		Session currentSession = factory.getCurrentSession();
		try {
			currentSession.beginTransaction();
			InstructorDetail instructorDetail = currentSession.get(InstructorDetail.class, 3);
			instructorDetail.getInstructor().setInstructorDetail(null);
			currentSession.delete(instructorDetail);
			currentSession.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			currentSession.close();
			factory.close();
		}

	}
}
