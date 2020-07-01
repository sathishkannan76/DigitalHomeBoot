package com.digital.home.repository;

import com.digital.home.model.LabourDetails;
import com.digital.home.model.MaterialDetails;
import com.digital.home.model.MaterialDetailsKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MaterialDetailsRepository extends JpaRepository<MaterialDetails, MaterialDetailsKey> {

    @Query(value = "SELECT * FROM material_details md where md.projectId = :projectId", nativeQuery = true)
    List<MaterialDetails> findByProjectId(@Param("projectId") long projectId);

}
