package com.digital.home.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.digital.home.model.ProjectType;
import com.digital.home.repository.ProjectTypeRepository;

@Service
public class ProjectTypeService {

	public List<ProjectType> getAllProjectTypes(ProjectTypeRepository projectTypeRepo) {
		return projectTypeRepo.findAll();
	}
	
	public ProjectType addProjectType(ProjectTypeRepository projectTypeRepo, ProjectType projectType) {
		return projectTypeRepo.save(projectType);
	}
}
