package com.instructor.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.instructor.entity.Course;
import com.instructor.entity.Instructor;
import com.instructor.entity.InstructorDetail;


public class EgerLazyDemo {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class).addAnnotatedClass(Course.class).buildSessionFactory();

		Session currentSession = factory.getCurrentSession();
		try {
			currentSession.beginTransaction();
			Instructor instructorDetail = currentSession.get(Instructor.class, 1);
			System.out.println("Instructor : "+instructorDetail);
			System.out.println("Course : "+instructorDetail.getCourse());
			currentSession.close();
			System.out.println("Course : "+instructorDetail.getCourse());
			System.out.println("Instructor Details : "+instructorDetail.getInstructorDetail());
			currentSession.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			currentSession.close();
			factory.close();
		}

	}
}
