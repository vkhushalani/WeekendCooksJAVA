package com.weekendcooks.app.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.weekendcooks.app.model.Customer;

@Transactional
@Component
public class CustomerServiceImp implements CustomerService {

	@PersistenceContext
	 EntityManager em;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Customer> findAll() {
		Query query = em.createNamedQuery("Customer.findAll");
		 List<Customer> items = query.getResultList();

	        return items;
	}

	@Override
	@Transactional
	public Customer update(Customer item) {
		em.merge(item);
		return item;
	}

	@Override
	@Transactional
	public Customer create(Customer item) {
		em.persist(item);
		return item;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Customer> findByMobileNo(Integer mobNo) {
		Query query = em.createNamedQuery("Customer.findByMobileNo")
				.setParameter("cMobile", mobNo);
		 List<Customer> items = query.getResultList();

	        return items;
	}

	@Override
	@Transactional
	public void deleteByObject(Customer item) {
		em.remove(item);

	}

}
