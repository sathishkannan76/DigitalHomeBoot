package com.digital.home.service;

import com.digital.home.model.LabourDetails;
import com.digital.home.model.MaterialCostDetails;
import com.digital.home.model.MaterialDetails;
import com.digital.home.model.SalaryDetails;
import com.digital.home.repository.LabourDetailsRepository;
import com.digital.home.repository.MaterialDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PaymentService {

    @Autowired
    private MaterialDetailsRepository materialDetailsRepository;

    @Autowired
    private LabourDetailsRepository labourDetailsRepository;

    public SalaryDetails getSalaryDetails(long projectId, Date fromDate, Date toDate) {
        SalaryDetails salaryDetails = new SalaryDetails();
        salaryDetails.setProjectId(projectId);
        List<LabourDetails> labourDetailsList = labourDetailsRepository.findByProjectIdAndTransactionDate(projectId,
                fromDate, toDate);
        salaryDetails.setLabourDetailsList(labourDetailsList);
        return salaryDetails;
    }

    public MaterialCostDetails getMaterialCostDetails(long projectId, Date fromDate, Date toDate) {
        MaterialCostDetails materialCostDetails = new MaterialCostDetails();
        materialCostDetails.setProjectId(projectId);
        List<MaterialDetails> materialDetailsList = materialDetailsRepository.findByProjectIdAndTransactionDate(
                projectId, fromDate, toDate);
        materialCostDetails.setMaterialDetailsList(materialDetailsList);
        return materialCostDetails;
    }

}
