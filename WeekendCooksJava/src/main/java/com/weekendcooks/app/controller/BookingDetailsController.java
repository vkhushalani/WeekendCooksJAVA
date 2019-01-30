package com.weekendcooks.app.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.weekendcooks.app.model.BookingDetails;
import com.weekendcooks.app.services.BookingDetailsService;

@RestController
public class BookingDetailsController {
	
	Logger logger = LoggerFactory.getLogger(BookingDetailsController.class);
	
	@Autowired
	BookingDetailsService bookingDetailsService;
	
	@PostMapping(value = "/Booking")
	public ResponseEntity<BookingDetails> createBooking(@RequestBody BookingDetails booking){
		booking = bookingDetailsService.create(booking);
		return ResponseEntity.ok().body(booking);
	}
	@GetMapping("/admin/Booking")
	public ResponseEntity <List<BookingDetails>> getAllBooking(){
		List<BookingDetails> bookings = bookingDetailsService.findAll();
		return ResponseEntity.ok().body(bookings);
	}
	
	@GetMapping("/admin/Booking/{id}")
	public ResponseEntity <BookingDetails> getBookingById(@PathVariable("id") Integer bookingId){
		BookingDetails booking = bookingDetailsService.findById(bookingId);
		return ResponseEntity.ok().body(booking);
	}
}
