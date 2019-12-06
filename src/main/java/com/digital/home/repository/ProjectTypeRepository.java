package com.digital.home.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.digital.home.model.ProjectType;

@Repository
public interface ProjectTypeRepository extends JpaRepository<ProjectType, Long> {

}
