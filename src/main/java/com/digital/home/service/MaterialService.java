package com.digital.home.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.digital.home.model.MaterialType;
import com.digital.home.model.MaterialUOM;
import com.digital.home.repository.MaterialTypeRepository;
import com.digital.home.repository.MaterialUOMRepository;

@Service
public class MaterialService {
	
	public List<MaterialType> getAllMaterialTypes(MaterialTypeRepository materialTypeRepo) {
		return materialTypeRepo.findAll();
	}
	
	public List<MaterialType> addMaterialType(MaterialTypeRepository materialTypeRepo, MaterialType materialType) {
		materialTypeRepo.save(materialType);
		return materialTypeRepo.findAll();
	}

	public List<MaterialType> deleteMaterialType(MaterialTypeRepository materialTypeRepo, MaterialType materialType) {
		materialTypeRepo.delete(materialType);
		return materialTypeRepo.findAll();
	}
	
	public List<MaterialUOM> getAllMaterialUOMs(MaterialUOMRepository materialUOMRepo) {
		return materialUOMRepo.findAll();
	}
	
	public List<MaterialUOM> addMaterialUOM(MaterialUOMRepository materialUOMRepo, MaterialUOM materialUOM) {
		materialUOMRepo.save(materialUOM);
		return materialUOMRepo.findAll();
	}

	public List<MaterialUOM> deleteMaterialUOM(MaterialUOMRepository materialUOMRepo, MaterialUOM materialUOM) {
		materialUOMRepo.delete(materialUOM);
		return materialUOMRepo.findAll();
	}
}
