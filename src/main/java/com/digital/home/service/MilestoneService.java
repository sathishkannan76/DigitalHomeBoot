package com.digital.home.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.digital.home.model.Milestone;
import com.digital.home.repository.MilestoneRepository;

@Service
public class MilestoneService {

	public List<Milestone> getAllMilestones(MilestoneRepository milestoneRepo) {
		return milestoneRepo.findAll();
	}
	
	public Milestone addMilestone(MilestoneRepository milestoneRepo, Milestone milestone) {
		return milestoneRepo.save(milestone);
	}
}
