package com.weekendcooks.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table
@NamedQueries({ 
		@NamedQuery(name = "Customer.findAll", query = "SELECT cust FROM Customer cust "),
		@NamedQuery(name = "Customer.findByMobileNo", query = "SELECT cust FROM Customer cust WHERE cust.cMobile = :cMobile ")
		
})
public class Customer {
	
	@Id
	@Column
	private Integer cMobile;
	
	@Id
	@Column
	private Integer addressId;

	public Integer getcMobile() {
		return cMobile;
	}

	public void setcMobile(Integer cMobile) {
		this.cMobile = cMobile;
	}

	public Integer getAddressId() {
		return addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}
	

}
