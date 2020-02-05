package com.digital.home.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "LabourMaster")
public class LabourMaster {

	@Id
	@GeneratedValue
	private @NotNull long labourId;
	private @NotNull long labourTypeId;
	private @NotNull long totalLabourNumber;
	private @NotNull long totalLabourWage;

	private @NotNull long projectId;

	public long getProjectId() {
		return projectId;
	}

	public void setProjectId(long projectId) {
		this.projectId = projectId;
	}

	public long getLabourId() {
		return labourId;
	}

	public void setLabourId(long labourId) {
		this.labourId = labourId;
	}

	public long getLabourTypeId() {
		return labourTypeId;
	}

	public void setLabourTypeId(long labourTypeId) {
		this.labourTypeId = labourTypeId;
	}

	public long getTotalLabourNumber() {
		return totalLabourNumber;
	}

	public void setTotalLabourNumber(long totalLabourNumber) {
		this.totalLabourNumber = totalLabourNumber;
	}

	public long getTotalLabourWage() {
		return totalLabourWage;
	}

	public void setTotalLabourWage(long totalLabourWage) {
		this.totalLabourWage = totalLabourWage;
	}

}
