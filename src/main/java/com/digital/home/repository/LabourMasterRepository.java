package com.digital.home.repository;

import com.digital.home.model.MaterialMaster;
import org.springframework.data.jpa.repository.JpaRepository;

import com.digital.home.model.LabourMaster;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface LabourMasterRepository extends JpaRepository<LabourMaster, Long> {

    @Query(value = "SELECT * FROM labour_master lm where lm.projectId = :projectId", nativeQuery = true)
    List<LabourMaster> findByProjectId(@Param("projectId") long projectId);

}
