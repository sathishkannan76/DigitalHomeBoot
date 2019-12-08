package com.digital.home.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.digital.home.model.ProjectType;
import com.digital.home.repository.ProjectTypeRepository;

@Service
public class ProjectService {

	public List<ProjectType> getAllProjectTypes(ProjectTypeRepository projectTypeRepo) {
		return projectTypeRepo.findAll();
	}
	
	public List<ProjectType> addProjectType(ProjectTypeRepository projectTypeRepo, ProjectType projectType) {
		projectTypeRepo.save(projectType);
		return projectTypeRepo.findAll();
	}

	public List<ProjectType> deleteProjectType(ProjectTypeRepository projectTypeRepo, ProjectType projectType) {
		projectTypeRepo.delete(projectType);
		return projectTypeRepo.findAll();
	}
}
