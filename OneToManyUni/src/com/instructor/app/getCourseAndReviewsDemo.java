package com.instructor.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.instructor.entity.Course;
import com.instructor.entity.Instructor;
import com.instructor.entity.InstructorDetail;
import com.instructor.entity.Reviews;

public class getCourseAndReviewsDemo {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Instructor.class)
								.addAnnotatedClass(InstructorDetail.class)
								.addAnnotatedClass(Course.class)
								.addAnnotatedClass(Reviews.class)
								.buildSessionFactory();
		
		
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		
		Course course = session.get(Course.class, 10);
		System.out.println("Course :"+course);
		
		System.out.println("Course Reviews :"+ course.getReviews());
		
		session.delete(course);
		
		session.getTransaction().commit();
		
	}

}
