package com.digital.home.repository;

import com.digital.home.model.LabourDetails;
import com.digital.home.model.LabourDetailsKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LabourDetailsRepository extends JpaRepository<LabourDetails, LabourDetailsKey> {
}
