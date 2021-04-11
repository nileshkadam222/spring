package com.myApp.jdbc.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.myApp.jdbc.entity.Student;

public class QueryStudentDemo {

	public static void main(String[] args) {

			SessionFactory factory = new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(Student.class)
									.buildSessionFactory();
			
			Session session = factory.getCurrentSession();
			
			session.beginTransaction();
			List<Student> resultList = session.createQuery("from Student").getResultList();
			System.out.println("All Student Data :"+resultList);
			
			List resultList2 = session.createQuery("from Student s where s.lastName='kadam'").getResultList();
			System.out.println("Only Last Name Whare clause :"+ resultList2);
			
			List<Student> list = session.createQuery("from Student s where s.lastName='kadam' OR s.firstName='Nilesh'").list();
			System.out.println("OR Clause :"+list);
			
			List<Student> resultList3 = session.createQuery("from Student s where s.email LIKE '%harsh%'").getResultList();
			System.out.println("Like Query :"+resultList3);
			
			
			
			
			session.getTransaction().commit();
			
	}

}
