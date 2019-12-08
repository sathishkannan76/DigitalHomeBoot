package com.digital.home.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.digital.home.model.MaterialType;

@Repository
public interface MaterialTypeRepository extends JpaRepository<MaterialType, Long> {

}
