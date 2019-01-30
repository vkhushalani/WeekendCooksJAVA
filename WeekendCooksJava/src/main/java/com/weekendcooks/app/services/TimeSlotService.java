package com.weekendcooks.app.services;

import java.util.List;

import com.weekendcooks.app.model.TimeSlots;

public interface TimeSlotService {
	public List<TimeSlots> findAll();
	public TimeSlots update(TimeSlots item);
	public TimeSlots create(TimeSlots item);
	public List<TimeSlots> findByServiceId(Integer id);
	public void deleteByObject(TimeSlots item);
}
