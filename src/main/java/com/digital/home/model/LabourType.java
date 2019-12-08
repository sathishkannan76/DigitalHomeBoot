package com.digital.home.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class LabourType {
	
	@Id @GeneratedValue
	private long labourTypeID;
	private String name;
	private String description;
	private double wage;
	public long getLabourTypeID() {
		return labourTypeID;
	}
	public void setLabourTypeID(long labourTypeID) {
		this.labourTypeID = labourTypeID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getWage() {
		return wage;
	}
	public void setWage(double wage) {
		this.wage = wage;
	}

	
}
