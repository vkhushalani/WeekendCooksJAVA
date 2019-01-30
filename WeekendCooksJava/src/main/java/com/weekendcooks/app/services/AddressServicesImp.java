package com.weekendcooks.app.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.weekendcooks.app.model.Address;

@Transactional
@Component
public class AddressServicesImp implements AddressServices {

	@PersistenceContext
	 EntityManager em;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Address> findAll() {
		Query query = em.createNamedQuery("Address.findAll");
		 List<Address> items = query.getResultList();

	        return items;
	}

	@Override
	@Transactional
	public Address update(Address item) {
		em.merge(item);
		return item;
	}

	@Override
	@Transactional
	public Address create(Address item) {
		em.persist(item);
	       return item;
	}

	@Override
	public Address findById(Integer id) {
		Address item = em.find(Address.class, id);
		return item;
	}

	@Override
	@Transactional
	public void deleteByObject(Address item) {
		em.remove(item);

	}

	@Override
	@Transactional
	public void deleteById(Integer id) {
		Address item = em.find(Address.class, id);
		em.remove(item);

	}

}
