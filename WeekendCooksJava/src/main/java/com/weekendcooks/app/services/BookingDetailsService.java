package com.weekendcooks.app.services;

import java.util.List;

import com.weekendcooks.app.model.BookingDetails;

public interface BookingDetailsService {

	public List<BookingDetails> findAll();
	public BookingDetails update(BookingDetails item);
	public BookingDetails create(BookingDetails item);
	public BookingDetails findById(Integer id);
	public void deleteByObject(BookingDetails item);
	public void deleteById(Integer id);
}
