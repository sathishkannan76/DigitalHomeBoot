package com.digital.home.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.digital.home.model.LabourType;
import com.digital.home.repository.LabourTypeRepository;
import com.digital.home.service.LabourService;

@RestController
public class LabourController {
	
	@Autowired
	LabourTypeRepository labourTypeRepo;
	LabourService labourService = new LabourService();

	@PostMapping("/addLabourType")
	public List<LabourType> addLabourType(@RequestBody LabourType labourType) {
		return labourService.addLabourType(labourTypeRepo, labourType);
	}
	
	@PostMapping("/deleteLabourType")
	public List<LabourType> deleteLabourType(@RequestBody LabourType labourType) {
		return labourService.deleteLabourType(labourTypeRepo, labourType);
	}
	
	@GetMapping("/getAllLabourTypes")
	public List<LabourType> getAllLabourTypes() {
		return labourService.getAllLabourTypes(labourTypeRepo);
	}
}
