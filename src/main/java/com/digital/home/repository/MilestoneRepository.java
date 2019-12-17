package com.digital.home.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.digital.home.model.Milestone;

@Repository
public interface MilestoneRepository extends JpaRepository<Milestone, Long> {

}
