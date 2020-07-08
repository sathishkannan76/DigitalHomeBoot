package com.digital.home.repository;

import com.digital.home.model.LabourDetails;
import com.digital.home.model.MaterialDetails;
import com.digital.home.model.MaterialDetailsKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface MaterialDetailsRepository extends JpaRepository<MaterialDetails, MaterialDetailsKey> {

    @Query(value = "SELECT * FROM material_details where project_id = :projectId " +
            "AND transaction_date BETWEEN ':fromDate' AND ':toDate'", nativeQuery = true)
    List<MaterialDetails> findByProjectIdAndTransactionDate(@Param("projectId") long projectId,
                                                          @Param("fromDate") Date fromDate,
                                                          @Param("toDate") Date toDate);

}
