package com.digital.home.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class ProjectType {
	
	@Id @GeneratedValue
	private long projectTypeID;
	private String name;
	private String description;
	public long getProjectTypeID() {
		return projectTypeID;
	}
	public void setProjectTypeID(long projectTypeID) {
		this.projectTypeID = projectTypeID;
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
}
