package com.weekendcooks.app.services;

import java.util.List;

import com.weekendcooks.app.model.Customer;

public interface CustomerService {
	
	public List<Customer> findAll();
	public Customer update(Customer item);
	public Customer create(Customer item);
	public List<Customer> findByMobileNo(Integer mobNo);
	public void deleteByObject(Customer item);


}
