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
	private String projectName;
	private String projectDescription;
}
