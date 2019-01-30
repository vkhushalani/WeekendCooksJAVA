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
		@NamedQuery(name = "BookingDetails.findAll", query = "SELECT bd FROM BookingDetails bd ")
		
})
public class BookingDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private Integer bookingId;
	
	@Column
	private String bookingDate;
	
	@Column
	private Integer cMobile;
	
	@Column
	private String cName;
	
	@Column
	private Integer cAddressId;
		
	@Column
	private String cAddress;
	
	@Column 
	private Integer serviceId;
	
	@Column 
	private String serviceText;
	
	@Column 
	private String serviceDay;
	
	@Column 
	private String bookedDate;
	
	@Column
	private Integer timeSlotId;
	
	@Column
	private String timeSlotText;
	
	@Column
	private Integer personCount;
	
	@Column
	private Integer totalCost;

	public Integer getBookingId() {
		return bookingId;
	}

	public void setBookingId(Integer bookingId) {
		this.bookingId = bookingId;
	}

	public String getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}

	public Integer getcMobile() {
		return cMobile;
	}

	public void setcMobile(Integer cMobile) {
		this.cMobile = cMobile;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public Integer getcAddressId() {
		return cAddressId;
	}

	public void setcAddressId(Integer cAddressId) {
		this.cAddressId = cAddressId;
	}

	public String getcAddress() {
		return cAddress;
	}

	public void setcAddress(String cAddress) {
		this.cAddress = cAddress;
	}

	public Integer getServiceId() {
		return serviceId;
	}

	public void setServiceId(Integer serviceId) {
		this.serviceId = serviceId;
	}

	public String getServiceText() {
		return serviceText;
	}

	public void setServiceText(String serviceText) {
		this.serviceText = serviceText;
	}

	public String getServiceDay() {
		return serviceDay;
	}

	public void setServiceDay(String serviceDay) {
		this.serviceDay = serviceDay;
	}

	public String getBookedDate() {
		return bookedDate;
	}

	public void setBookedDate(String bookedDate) {
		this.bookedDate = bookedDate;
	}

	public Integer getTimeSlotId() {
		return timeSlotId;
	}

	public void setTimeSlotId(Integer timeSlotId) {
		this.timeSlotId = timeSlotId;
	}

	public String getTimeSlotText() {
		return timeSlotText;
	}

	public void setTimeSlotText(String timeSlotText) {
		this.timeSlotText = timeSlotText;
	}

	public Integer getPersonCount() {
		return personCount;
	}

	public void setPersonCount(Integer personCount) {
		this.personCount = personCount;
	}

	public Integer getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(Integer totalCost) {
		this.totalCost = totalCost;
	}

}
