package com.digital.home.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class Milestone {
	
	@Id @GeneratedValue
	private long milestonID;
	private String milestoneName;
	private String milestoneDesc;
	private boolean applicableToGF;
	
}
