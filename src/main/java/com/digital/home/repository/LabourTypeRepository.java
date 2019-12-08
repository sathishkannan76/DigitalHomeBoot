package com.digital.home.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.digital.home.model.LabourType;

@Repository
public interface LabourTypeRepository extends JpaRepository<LabourType, Long>{

}
