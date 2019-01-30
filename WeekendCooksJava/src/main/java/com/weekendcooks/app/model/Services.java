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
		@NamedQuery(name = "Services.findAll", query = "SELECT srv FROM Services srv ")
		
})
public class Services {

	@Id
	@Column
	private Integer serviceId;
	
	@Column
	private String serviceText;
	
	@Column
	private String serviceDescription;
	
	@Column 
	private Integer costPerPerson;
	
	@Column
	private String timeRange;
	
	@Column 
	private String day;

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

	public String getServiceDescription() {
		return serviceDescription;
	}

	public void setServiceDescription(String serviceDescription) {
		this.serviceDescription = serviceDescription;
	}

	public Integer getCostPerPerson() {
		return costPerPerson;
	}

	public void setCostPerPerson(Integer costPerPerson) {
		this.costPerPerson = costPerPerson;
	}

	public String getTimeRange() {
		return timeRange;
	}

	public void setTimeRange(String timeRange) {
		this.timeRange = timeRange;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}
	
}
