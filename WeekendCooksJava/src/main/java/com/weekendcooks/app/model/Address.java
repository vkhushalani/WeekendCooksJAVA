package com.weekendcooks.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table
@NamedQueries({ 
		@NamedQuery(name = "Address.findAll", query = "SELECT add FROM Address add ")
		
})

public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private Integer addressId;
	
	@Column
	private Integer addressName;
	
	@Column
	private String addressText;

	public Integer getAddressId() {
		return addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	public String getAddressText() {
		return addressText;
	}

	public void setAddressText(String addressText) {
		this.addressText = addressText;
	}

	public Integer getAddressName() {
		return addressName;
	}

	public void setAddressName(Integer addressName) {
		this.addressName = addressName;
	}
	
}
