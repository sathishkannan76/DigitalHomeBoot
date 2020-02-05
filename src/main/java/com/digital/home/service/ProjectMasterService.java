package com.digital.home.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.digital.home.model.ProjectMaster;
import com.digital.home.repository.ProjectMasterRepository;

@Service
public class ProjectMasterService {

	public ProjectMaster createProjectMaster(ProjectMasterRepository repo, ProjectMaster projectMaster) {
		ProjectMaster master = null;
		if (!repo.existsById(projectMaster.getProjectId())) {
			master = repo.save(projectMaster);
		}
		return master;
	}

	public List<ProjectMaster> findAllProjects(ProjectMasterRepository repo) {
		return repo.findAll();
	}

}
