package com.digital.home.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.digital.home.model.Milestone;
import com.digital.home.repository.MilestoneRepository;
import com.digital.home.service.MilestoneService;

@CrossOrigin()
@RestController
public class MilestoneController {
	
	@Autowired
	MilestoneRepository milestoneTypeRepo;
	
	@Autowired
	MilestoneService milestoneService;

	@PostMapping("/addMilestone")
	public Milestone addProjectType(@RequestBody Milestone milestone) {
		return milestoneService.addMilestone(milestoneTypeRepo, milestone);
	}
	
	@GetMapping("/getAllMilestones")
	public List<Milestone> getAllProjectTypes() {
		return milestoneService.getAllMilestones(milestoneTypeRepo);
	}
}
