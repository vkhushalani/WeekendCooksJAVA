package com.weekendcooks.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.weekendcooks.app.model.Address;
import com.weekendcooks.app.model.Customer;
import com.weekendcooks.app.services.AddressServices;
import com.weekendcooks.app.services.CustomerService;

@RestController
public class AddressController {
	
	Logger logger = LoggerFactory.getLogger(AddressController.class);
	
	@Autowired
	CustomerService customerService;
	@Autowired
	AddressServices addressServices;
	
	@GetMapping("/Addresses/{MobileNo}")
	public ResponseEntity <List<Address>> getCustomerAddressByMobNo(@PathVariable("MobileNo") Integer mobileNo){
		List<Customer> customers = customerService.findByMobileNo(mobileNo);
		List<Address> addresses = new ArrayList<Address>();
		for(Customer cust:customers)
		{
			addresses.add(addressServices.findById(cust.getAddressId()));	
		}
		
		return ResponseEntity.ok().body(addresses);
	}

}
