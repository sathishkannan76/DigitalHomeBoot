package com.digital.home.repository;

import com.digital.home.model.MaterialDetails;
import com.digital.home.model.MaterialDetailsKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaterialDetailsRepository extends JpaRepository<MaterialDetails, MaterialDetailsKey> {
}
