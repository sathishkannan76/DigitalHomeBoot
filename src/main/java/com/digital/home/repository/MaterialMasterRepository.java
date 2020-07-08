package com.digital.home.repository;

import com.digital.home.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import com.digital.home.model.MaterialMaster;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MaterialMasterRepository extends JpaRepository<MaterialMaster, Long> {

    @Query(value = "SELECT * FROM material_master mm where mm.projectId = :projectId", nativeQuery = true)
    List<MaterialMaster> findByProjectId(@Param("projectId") long projectId);

}
