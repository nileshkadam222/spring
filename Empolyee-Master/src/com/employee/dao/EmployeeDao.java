package com.employee.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.employee.entity.Employee;

public class EmployeeDao {

	private static SessionFactory factory;
	public EmployeeDao() {
		factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();
	}
	public static void createEmployee(String name,String lastName,String company) {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		Employee e = new Employee(name, lastName, company);
		session.save(e);
		session.getTransaction().commit();
	}
	
	public static Employee getEmoloyeeById(int id) {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		Employee e= session.get(Employee.class, id);
		session.getTransaction().commit();
		return e;
	}
	
	public static List<Employee> getEmployeeByCompanyName(String companyName){
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		List<Employee> resultList = session.createQuery("from Employee e where company='"+companyName+"'").getResultList();
		session.getTransaction().commit();
		return resultList;
	}
	
	@Deprecated
	public static void deleteEmployeeById(int id) {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		Employee emoloyeeById = getEmoloyeeById(id);
		session.delete(emoloyeeById);
		session.getTransaction().commit();
	}
	
	public static void deleteEmployeeByIdQuery(int id) {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		session.createQuery("delete Employee e where e.id='"+id+"'").executeUpdate();
		session.getTransaction().commit();
	}
	
	
	public static void deleteAllEmployee() {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		session.createQuery("delete Employee").executeUpdate();
		session.getTransaction().commit();
	}
	
}
