package com.instructor.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.instructor.entity.Instructor;
import com.instructor.entity.InstructorDetail;

public class GetInstructorDetailsDemmo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class).buildSessionFactory();

		Session session = factory.getCurrentSession();
		try {
		session.beginTransaction();
		InstructorDetail instructorDetail = session.get(InstructorDetail.class, 25);
		System.out.println("Instructor Details :"+instructorDetail);
		System.out.println("Associated Instructor: "+instructorDetail.getInstructor());
		session.getTransaction().commit();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
			factory.close();
		}
	}

}
