package com.digital.home.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.digital.home.model.ProjectType;
import com.digital.home.repository.ProjectTypeRepository;
import com.digital.home.service.ProjectTypeService;

@CrossOrigin()
@RestController
public class ProjectTypeController {
	
	@Autowired
	ProjectTypeRepository projectTypeRepo;
	ProjectTypeService projectTypeService = new ProjectTypeService();

	@PostMapping("/addProjectType")
	public List<ProjectType> addProjectType(@RequestBody ProjectType projectType) {
		return projectTypeService.addProjectType(projectTypeRepo, projectType);
	}
	
	@PostMapping("/deleteProjectType")
	public List<ProjectType> deleteProjectType(@RequestBody ProjectType projectType) {
		return projectTypeService.deleteProjectType(projectTypeRepo, projectType);
	}
	
	@GetMapping("/getAllProjectTypes")
	public List<ProjectType> getAllProjectTypeaas() {
		return projectTypeService.getAllProjectTypes(projectTypeRepo);
	}
}
