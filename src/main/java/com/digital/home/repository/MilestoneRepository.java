package com.digital.home.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.digital.home.model.Milestone;

@Repository
public interface MilestoneRepository extends JpaRepository<Milestone, Long> {
	
	@Query(value = "SELECT * FROM MILESTONE", nativeQuery = true)
	public List<Milestone> getAllMilestone();

}
