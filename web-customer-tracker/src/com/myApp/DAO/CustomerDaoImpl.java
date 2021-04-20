package com.myApp.DAO;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.myApp.entity.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	@Override
	public List<Customer> getCustomers() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Customer> createQuery = currentSession.createQuery("from Customer order by lastName", Customer.class);
		return createQuery.getResultList();
	}

	@Override
	@Transactional
	public void saveCustomer(Customer theCustomer) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(theCustomer);
	}

	@Override
	@Transactional
	public Customer getCustomer(int theId) {
		Session currentSession = sessionFactory.getCurrentSession();
		return currentSession.get(Customer.class, theId);
	}

	@Override
	@Transactional
	public void deleteCustomer(int theId) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query createQuery = currentSession.createQuery("delete from Customer where id =:theCustomerId");
		createQuery.setParameter("theCustomerId", theId);
		createQuery.executeUpdate();
	}

	@Override
	@Transactional
	public List<Customer> searchCustomer(String search) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Customer> createQuery = currentSession.createQuery("from Customer where lower(firstName) like :theName or lower(lastName) like :theName",Customer.class);
		createQuery.setParameter("theName", "%"+search.toLowerCase()+"%");
		return createQuery.getResultList();
	}
}
