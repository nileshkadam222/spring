package com.instructor.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.instructor.entity.Course;
import com.instructor.entity.Instructor;
import com.instructor.entity.InstructorDetail;
import com.instructor.entity.Reviews;
import com.instructor.entity.Student;

public class CreateCourseAndStudentsDemo {

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
		
		Course tempCourse = new Course("Java");
		
		Reviews r1 = new Reviews("This iS Good Cource");
		Reviews r2 = new Reviews("This iS Bad Cource");
		Reviews r3 = new Reviews("This iS Very Good Cource");
		
		tempCourse.addReview(r3);
		tempCourse.addReview(r1);
		tempCourse.addReview(r2);
		
		
		session.save(tempCourse);
		System.out.println("Save Course");
		
		Student s = new Student("Nilesh","Kadam","abc.gmail.com");
		Student s1 = new Student("Ashok","Kadam","ashok.gmail.com");
		Student s2 = new Student("Harshu","Kadam","harshu.gmail.com");
		
		tempCourse.addStudent(s2);
		tempCourse.addStudent(s);
		tempCourse.addStudent(s1);
		
		session.save(s);
		session.save(s1);
		session.save(s2);

		session.getTransaction().commit();
		
	}

}
