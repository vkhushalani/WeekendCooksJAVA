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
	@NamedQuery(name = "TimeSlots.findAll", query = "SELECT ts FROM TimeSlots ts "),
	@NamedQuery(name = "TimeSlots.findByServiceId", query = "SELECT ts FROM TimeSlots ts WHERE ts.serviceId = :serviceId ")
		
})
public class TimeSlots {
	
	@Id
	@Column
	private Integer timeSlotId;
	
	@Column
	private Integer serviceId;
	
	@Column
	private String timeSlotText;

	public Integer getTimeSlotId() {
		return timeSlotId;
	}

	public void setTimeSlotId(Integer timeSlotId) {
		this.timeSlotId = timeSlotId;
	}

	public Integer getServiceId() {
		return serviceId;
	}

	public void setServiceId(Integer serviceId) {
		this.serviceId = serviceId;
	}

	public String getTimeSlotText() {
		return timeSlotText;
	}

	public void setTimeSlotText(String timeSlotText) {
		this.timeSlotText = timeSlotText;
	}

}
