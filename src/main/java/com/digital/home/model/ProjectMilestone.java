package com.digital.home.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class ProjectMilestone {

	@Id
	@GeneratedValue
	private long projectMilestoneId;
	private String milestoneId;
	private long milestonePercentage;
	private long milestoneValue;

	public long getProjectMilestoneId() {
		return projectMilestoneId;
	}

	public void setProjectMilestoneId(long projectMilestoneId) {
		this.projectMilestoneId = projectMilestoneId;
	}

	public String getMilestoneId() {
		return milestoneId;
	}

	public void setMilestoneId(String milestoneId) {
		this.milestoneId = milestoneId;
	}

	public long getMilestonePercentage() {
		return milestonePercentage;
	}

	public void setMilestonePercentage(long milestonePercentage) {
		this.milestonePercentage = milestonePercentage;
	}

	public long getMilestoneValue() {
		return milestoneValue;
	}

	public void setMilestoneValue(long milestoneValue) {
		this.milestoneValue = milestoneValue;
	}

}
