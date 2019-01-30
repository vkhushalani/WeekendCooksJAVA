package com.weekendcooks.app.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.weekendcooks.app.model.BookingDetails;

@Transactional
@Component
public class BookingDetailsServiceImp implements BookingDetailsService {

	@PersistenceContext
	 EntityManager em;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<BookingDetails> findAll() {
		Query query = em.createNamedQuery("BookingDetails.findAll");
		 List<BookingDetails> items = query.getResultList();

	        return items;
	}

	@Override
	@Transactional
	public BookingDetails update(BookingDetails item) {
		em.merge(item);
		return item;
	}

	@Override
	@Transactional
	public BookingDetails create(BookingDetails item) {
		em.persist(item);
		return item;
	}

	@Override
	public BookingDetails findById(Integer id) {
		BookingDetails item = em.find(BookingDetails.class,id);
		return item ;
	}

	@Override
	@Transactional
	public void deleteByObject(BookingDetails item) {
	em.remove(item);
	

	}

	@Override
	@Transactional
	public void deleteById(Integer id) {
	em.remove(findById(id));

	}

}
