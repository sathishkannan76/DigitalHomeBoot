package com.digital.home.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.digital.home.model.ProjectMaster;

@Repository
public interface ProjectMasterRepository extends JpaRepository<ProjectMaster, Long> {

}
