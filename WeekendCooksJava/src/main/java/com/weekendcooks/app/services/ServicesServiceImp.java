package com.weekendcooks.app.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import com.weekendcooks.app.model.Services;

@Transactional
@Component
public class ServicesServiceImp implements ServicesService {

	@PersistenceContext
	 EntityManager em;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Services> findAll() {
		Query query = em.createNamedQuery("Services.findAll");
		 List<Services> items = query.getResultList();

	        return items;
	}

	@Override
	@Transactional
	public Services update(Services item) {
		em.merge(item);
		return item;
	}

	@Override
	@Transactional
	public Services create(Services item) {
		em.persist(item);
		return item;
		}

	@Override
	public Services findById(Integer id) {
		Services item = em.find(Services.class, id);
		return item;
		}

	@Override
	@Transactional
	public void deleteByObject(Services item) {
		em.remove(item);

	}

	@Override
	@Transactional
	public void deleteById(Integer id) {
		em.remove(findById(id));

	}

}
