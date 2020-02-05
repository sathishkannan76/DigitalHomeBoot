/**
 *
 */
package com.digital.home.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.NoArgsConstructor;

/**
 * @author Sathish Kannan
 *
 */
@Entity
@NoArgsConstructor
@Table(name = "ProjectMaster")
public class ProjectMaster extends AuditModel {

	/**
	 *
	 */
	private static final long serialVersionUID = 2323232323232L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long projectId;

	@Size(max = 100)
	@Column(unique = true)
	private String projectName;

	private long projectTypeId;

	private @NotNull long projectArea;
	private @Size(max = 100) String clientName;

	private @Size(max = 100) String clientAddress;
	private @Size(max = 50) String clientCity;
	private @Size(max = 50) String clientState;
	private @Size(max = 20) String clientContact;

	private Date projectStartDate;
	private Date projectEndDate;
	private @NotNull long projectBudget;
	private @NotNull int numberOfStories;

	public long getProjectId() {
		return projectId;
	}

	public void setProjectId(long projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public long getProjectArea() {
		return projectArea;
	}

	public long getProjectTypeId() {
		return projectTypeId;
	}

	public void setProjectTypeId(long projectTypeId) {
		this.projectTypeId = projectTypeId;
	}

	public void setProjectArea(long projectArea) {
		this.projectArea = projectArea;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getClientAddress() {
		return clientAddress;
	}

	public void setClientAddress(String clientAddress) {
		this.clientAddress = clientAddress;
	}

	public String getClientCity() {
		return clientCity;
	}

	public void setClientCity(String clientCity) {
		this.clientCity = clientCity;
	}

	public String getClientState() {
		return clientState;
	}

	public void setClientState(String clientState) {
		this.clientState = clientState;
	}

	public String getClientContact() {
		return clientContact;
	}

	public void setClientContact(String clientContact) {
		this.clientContact = clientContact;
	}

	public Date getProjectStartDate() {
		return projectStartDate;
	}

	public void setProjectStartDate(Date projectStartDate) {
		this.projectStartDate = projectStartDate;
	}

	public Date getProjectEndDate() {
		return projectEndDate;
	}

	public void setProjectEndDate(Date projectEndDate) {
		this.projectEndDate = projectEndDate;
	}

	public long getProjectBudget() {
		return projectBudget;
	}

	public void setProjectBudget(long projectBudget) {
		this.projectBudget = projectBudget;
	}

	public int getNumberOfStories() {
		return numberOfStories;
	}

	public void setNumberOfStories(int numberOfStories) {
		this.numberOfStories = numberOfStories;
	}

	@Override
	public String toString() {
		return "ProjectID:" + projectId + "ProjectName:" + projectName + "ProjectType: " + projectTypeId;
	}

}
