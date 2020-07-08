package com.digital.home.repository;

import com.digital.home.model.LabourDetails;
import com.digital.home.model.LabourDetailsKey;
import com.digital.home.model.LabourMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface LabourDetailsRepository extends JpaRepository<LabourDetails, LabourDetailsKey> {

    @Query(value = "SELECT * FROM labour_details where project_id = :projectId " +
            "AND transaction_date BETWEEN ':fromDate' AND ':toDate'", nativeQuery = true)
    List<LabourDetails> findByProjectIdAndTransactionDate(@Param("projectId") long projectId,
                                                          @Param("fromDate") Date fromDate,
                                                          @Param("toDate") Date toDate);
}
