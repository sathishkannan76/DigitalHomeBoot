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
	public ProjectType addProjectType(@RequestBody ProjectType projectType) {
		return projectTypeService.addProjectType(projectTypeRepo, projectType);
	}
	
	@GetMapping("/getAllProjectTypes")
	public List<ProjectType> getAllProjectTypes() {
		return projectTypeService.getAllProjectTypes(projectTypeRepo);
	}
}
