package com.weekendcooks.app.services;

import java.util.List;

import com.weekendcooks.app.model.Services;

public interface ServicesService {
	public List<Services> findAll();
	public Services update(Services item);
	public Services create(Services item);
	public Services findById(Integer id);
	public void deleteByObject(Services item);
	public void deleteById(Integer id);
}
