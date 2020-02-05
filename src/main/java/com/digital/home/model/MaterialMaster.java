package com.digital.home.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.NoArgsConstructor;

@Entity
@Table(name = "MaterialMaster")
@NoArgsConstructor
public class MaterialMaster {

	@Id
	@GeneratedValue
	private long materialId;

	private @NotNull long materialTypeId;
	private @NotNull long materialUnits;
	private @NotNull long materialUnitCost;
	private @NotNull long projectId;

	public long getProjectId() {
		return projectId;
	}

	public void setProjectId(long projectId) {
		this.projectId = projectId;
	}

	public long getMaterialId() {
		return materialId;
	}

	public void setMaterialId(long materialId) {
		this.materialId = materialId;
	}

	public long getMaterialTypeId() {
		return materialTypeId;
	}

	public void setMaterialTypeId(long materialTypeId) {
		this.materialTypeId = materialTypeId;
	}

	public long getMaterialUnits() {
		return materialUnits;
	}

	public void setMaterialUnits(long materialUnits) {
		this.materialUnits = materialUnits;
	}

	public long getMaterialUnitCost() {
		return materialUnitCost;
	}

	public void setMaterialUnitCost(long materialUnitCost) {
		this.materialUnitCost = materialUnitCost;
	}

}
