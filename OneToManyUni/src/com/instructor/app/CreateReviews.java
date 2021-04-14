package com.instructor.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.instructor.entity.Course;
import com.instructor.entity.Instructor;
import com.instructor.entity.InstructorDetail;
import com.instructor.entity.Reviews;

public class CreateReviews {

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
		
		Course tempCourse = new Course("Java");
		
		Reviews r1 = new Reviews("This iS Good Cource");
		Reviews r2 = new Reviews("This iS Bad Cource");
		Reviews r3 = new Reviews("This iS Very Good Cource");
		
		tempCourse.addReview(r3);
		tempCourse.addReview(r1);
		tempCourse.addReview(r2);
		
		
		session.save(tempCourse);
		session.getTransaction().commit();
		
	}

}
