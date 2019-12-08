package com.digital.home.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class MaterialUOM {
	
	@Id @GeneratedValue
	private long materialUOMID;
	private String name;
	private String description;
	
	public long getMaterialUOMID() {
		return materialUOMID;
	}
	public void setMaterialUOMID(long materialUOMID) {
		this.materialUOMID = materialUOMID;
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
