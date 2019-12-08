package com.digital.home.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.digital.home.model.MaterialType;
import com.digital.home.model.MaterialUOM;
import com.digital.home.repository.MaterialTypeRepository;
import com.digital.home.repository.MaterialUOMRepository;
import com.digital.home.service.LabourService;
import com.digital.home.service.MaterialService;

@RestController
public class MaterialController {
	
	@Autowired
	MaterialTypeRepository materialTypeRepo;
	@Autowired
	MaterialUOMRepository materialUOMRepo;
	
	MaterialService materialService = new MaterialService();
	
	@PostMapping("/addMaterialType")
	public List<MaterialType> addmaterialType(@RequestBody MaterialType materialType) {
		return materialService.addMaterialType(materialTypeRepo, materialType);
	}
	
	@PostMapping("/deleteMaterialType")
	public List<MaterialType> deletematerialType(@RequestBody MaterialType materialType) {
		return materialService.deleteMaterialType(materialTypeRepo, materialType);
	}
	
	@GetMapping("/getAllMaterialTypes")
	public List<MaterialType> getAllmaterialTypes() {
		return materialService.getAllMaterialTypes(materialTypeRepo);
	}
	
	@PostMapping("/addMaterialUOM")
	public List<MaterialUOM> addMaterialUOM(@RequestBody MaterialUOM materialUOM) {
		return materialService.addMaterialUOM(materialUOMRepo, materialUOM);
	}
	
	@PostMapping("/deleteMaterialUOM")
	public List<MaterialUOM> deleteMaterialUOM(@RequestBody MaterialUOM materialUOM) {
		return materialService.deleteMaterialUOM(materialUOMRepo, materialUOM);
	}
	
	@GetMapping("/getAllMaterialUOMs")
	public List<MaterialUOM> getAllMaterialUOMs() {
		return materialService.getAllMaterialUOMs(materialUOMRepo);
	}
}
