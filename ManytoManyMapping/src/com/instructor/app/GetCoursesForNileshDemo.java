package com.instructor.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.instructor.entity.Course;
import com.instructor.entity.Instructor;
import com.instructor.entity.InstructorDetail;
import com.instructor.entity.Reviews;
import com.instructor.entity.Student;

public class GetCoursesForNileshDemo {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Instructor.class)
								.addAnnotatedClass(InstructorDetail.class)
								.addAnnotatedClass(Course.class)
								.addAnnotatedClass(Reviews.class)
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		
		
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		
		Student student = session.get(Student.class, 1);
		
		System.out.println("Student Object :"+student);
		System.out.println("Course Object :"+student.getCourses());
		
		Course c = new Course(".Net");
		Course c1 = new Course("C++");
		Course c2 = new Course("Js");
		
		c.addStudent(student);
		c1.addStudent(student);
		c2.addStudent(student);
		
		System.out.println("Saving course");
		
		session.save(c);
		session.save(c1);
		session.save(c2);
		
		
		session.getTransaction().commit();
		
	}

}
