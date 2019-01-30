package com.weekendcooks.app.services;

import java.util.List;

import com.weekendcooks.app.model.Address;

public interface AddressServices {
	public List<Address> findAll();
	public Address update(Address item);
	public Address create(Address item);
	public Address findById(Integer id);
	public void deleteByObject(Address item);
	public void deleteById(Integer id);
}
