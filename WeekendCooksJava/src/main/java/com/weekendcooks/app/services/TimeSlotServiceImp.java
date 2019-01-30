package com.weekendcooks.app.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.weekendcooks.app.model.TimeSlots;

@Transactional
@Component
public class TimeSlotServiceImp implements TimeSlotService {

	@PersistenceContext
	 EntityManager em;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<TimeSlots> findAll() {
		Query query = em.createNamedQuery("TimeSlots.findAll");
		 List<TimeSlots> items = query.getResultList();

	        return items;
	}

	@Override
	public TimeSlots update(TimeSlots item) {
		em.merge(item);
		return item;
	}

	@Override
	public TimeSlots create(TimeSlots item) {
		em.persist(item);
		return item;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<TimeSlots> findByServiceId(Integer id) {
		Query query = em.createNamedQuery("TimeSlots.findByServiceId")
						.setParameter("serviceId", id);
		 List<TimeSlots> items = query.getResultList();

	        return items;
	}

	@Override
	public void deleteByObject(TimeSlots item) {
		em.remove(item);

	}

	

}
