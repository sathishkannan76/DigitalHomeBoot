package com.digital.home.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class MaterialType {

	@Id @GeneratedValue
	private long materialTypeID;
	private String name;
	private String description;
	
	@OneToOne(cascade = CascadeType.ALL)
	private MaterialUOM materialUOM;

	public long getMaterialTypeID() {
		return materialTypeID;
	}

	public void setMaterialTypeID(long materialTypeID) {
		this.materialTypeID = materialTypeID;
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

	public MaterialUOM getMaterialUOM() {
		return materialUOM;
	}

	public void setMaterialUOM(MaterialUOM materialUOM) {
		this.materialUOM = materialUOM;
	}
	
	
}
