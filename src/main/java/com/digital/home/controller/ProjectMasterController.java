package com.digital.home.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.digital.home.model.LabourMaster;
import com.digital.home.model.MaterialMaster;
import com.digital.home.model.ProjectMaster;
import com.digital.home.repository.LabourMasterRepository;
import com.digital.home.repository.MaterialMasterRepository;
import com.digital.home.repository.ProjectMasterRepository;
import com.digital.home.service.ProjectMasterService;
import com.digital.home.utility.ResourceNotFoundException;

@CrossOrigin()
@RestController
public class ProjectMasterController {

	@Autowired
	private ProjectMasterService projectService;

	@Autowired
	private ProjectMasterRepository projectRepo;

	@Autowired
	private LabourMasterRepository labourMasterRepo;

	@Autowired
	private MaterialMasterRepository materialMasterRepo;

	@PostMapping("/projects/createProject")
	public ProjectMaster createProject(@RequestBody ProjectMaster master) {
		ProjectMaster project = projectService.createProjectMaster(projectRepo, master);
		return project;
	}

	@PostMapping("/projects/addLabour")
	public List<LabourMaster> createLabourMaster(@Valid @RequestBody ArrayList<LabourMaster> labourMasterList) {

		boolean isProjectIdValid = true;
		long projectId = 0L;
		for (LabourMaster labourMaster : labourMasterList) {
			projectId = labourMaster.getProjectId();
			Optional<ProjectMaster> master = projectRepo.findById(projectId);
			if (master.equals(Optional.empty())) {
				isProjectIdValid = false;
				break; // if any of the project ID is invalid, it will stop here and throw the error
			}
		}
		if (isProjectIdValid) {
			labourMasterRepo.saveAll(labourMasterList);
		} else {
			throw new ResourceNotFoundException("projectId " + projectId + " not found");
		}
		return labourMasterList;

	}

	@PostMapping("/projects/addMaterial")
	public List<MaterialMaster> createMaterialMaster(@RequestBody ArrayList<MaterialMaster> materialMasterList) {

		boolean isProjectIdValid = true;
		long projectId = 0L;
		for (MaterialMaster materialMaster : materialMasterList) {
			projectId = materialMaster.getProjectId();
			Optional<ProjectMaster> master = projectRepo.findById(projectId);
			if (master.equals(Optional.empty())) {
				isProjectIdValid = false;
				break; // if any of the project ID is invalid, it will stop here and throw the error
			}
		}
		if (isProjectIdValid) {
			materialMasterRepo.saveAll(materialMasterList);
		} else {
			throw new ResourceNotFoundException("projectId " + projectId + " not found");
		}
		return materialMasterList;

	}

	@GetMapping("/projects/findProjectById/{projectId}")
	public Optional<ProjectMaster> findProjectById(@PathVariable(value = "projectId") Long projectId) {
		return projectRepo.findById(projectId);
	}

	@GetMapping("/projects/findAllProjects")
	public List<ProjectMaster> findAllProjects() {
		List<ProjectMaster> projectList = projectService.findAllProjects(projectRepo);
		return projectList;
	}

}
