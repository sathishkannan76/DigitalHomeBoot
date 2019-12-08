package com.digital.home.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.digital.home.model.MaterialUOM;

@Repository
public interface MaterialUOMRepository extends JpaRepository<MaterialUOM, Long> {

}
