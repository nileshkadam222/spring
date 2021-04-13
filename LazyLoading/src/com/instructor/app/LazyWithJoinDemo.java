package com.instructor.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.instructor.entity.Course;
import com.instructor.entity.Instructor;
import com.instructor.entity.InstructorDetail;


public class LazyWithJoinDemo {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class).addAnnotatedClass(Course.class).buildSessionFactory();

		Session currentSession = factory.getCurrentSession();
		try {
			currentSession.beginTransaction();
			Query<Instructor> createQuery = currentSession.createQuery("select i from Instructor i "
											+ "JOIN FETCH i.course "
											+ "where i.id=:theInstructorId",Instructor.class);
			
			createQuery.setParameter("theInstructorId", 1);
			Instructor singleResult = createQuery.getSingleResult();
			System.out.println(singleResult);
			
			
			currentSession.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			currentSession.close();
			factory.close();
		}

	}
}
