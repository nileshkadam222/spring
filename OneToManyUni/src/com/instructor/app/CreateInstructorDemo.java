package com.instructor.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.instructor.entity.Course;
import com.instructor.entity.Instructor;
import com.instructor.entity.InstructorDetail;

public class CreateInstructorDemo {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class).addAnnotatedClass(Course.class).buildSessionFactory();

		Session session = factory.getCurrentSession();
		session.beginTransaction();

		Instructor instructor = session.get(Instructor.class, 1);

		Course c1 = new Course("Java");
		Course c2 = new Course("HTML");
		Course c3 = new Course("CSS");

		instructor.add(c1);
		instructor.add(c2);
		instructor.add(c3);
		session.save(c1);
		session.save(c2);
		session.save(c3);
		System.out.println(instructor);
		session.getTransaction().commit();
	}

}
