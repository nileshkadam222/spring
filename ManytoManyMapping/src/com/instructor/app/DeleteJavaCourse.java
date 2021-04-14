package com.instructor.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.instructor.entity.Course;
import com.instructor.entity.Instructor;
import com.instructor.entity.InstructorDetail;
import com.instructor.entity.Reviews;
import com.instructor.entity.Student;

public class DeleteJavaCourse {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class).addAnnotatedClass(Course.class)
				.addAnnotatedClass(Reviews.class).addAnnotatedClass(Student.class).buildSessionFactory();

		Session currentSession = factory.getCurrentSession();

		currentSession.beginTransaction();
		
		Course course = currentSession.get(Course.class, 11);
		currentSession.delete(course);
		currentSession.getTransaction().commit();
	}

}
