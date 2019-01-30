package com.weekendcooks.app.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.weekendcooks.app.model.Services;
import com.weekendcooks.app.model.TimeSlots;
import com.weekendcooks.app.services.ServicesService;
import com.weekendcooks.app.services.TimeSlotService;

@RestController
public class ServicesController {

	Logger logger = LoggerFactory.getLogger(ServicesController.class);
	
	@Autowired 
	ServicesService servicesService;
	@Autowired 
	TimeSlotService timeSlotService;
	
	@GetMapping("/Services")
	public ResponseEntity <List<Services>> getAllServices(){
		List<Services> services = servicesService.findAll();
		return ResponseEntity.ok().body(services);
	}
	
	@GetMapping("/Services/{id}")
	public ResponseEntity <Services> getServiceById(@PathVariable("id") Integer serviceId){
		Services service = servicesService.findById(serviceId);
		return ResponseEntity.ok().body(service);
	}
	
	@GetMapping("/Services/{id}/TimeSlots")
	public ResponseEntity <List<TimeSlots>> getTimeSlotsByServiceId(@PathVariable("id") Integer serviceId){
		List<TimeSlots> timeSlots = timeSlotService.findByServiceId(serviceId);
		return ResponseEntity.ok().body(timeSlots);
	}
	
}
