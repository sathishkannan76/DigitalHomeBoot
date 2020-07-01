package com.digital.home.service;

import com.digital.home.model.LabourDetails;
import com.digital.home.model.MaterialDetails;
import com.digital.home.model.SalaryDetails;
import com.digital.home.repository.LabourDetailsRepository;
import com.digital.home.repository.MaterialDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalaryService {

    @Autowired
    private MaterialDetailsRepository materialDetailsRepository;

    @Autowired
    private LabourDetailsRepository labourDetailsRepository;

    public SalaryDetails getSalaryDetails(long projectId) {
        SalaryDetails salaryDetails = new SalaryDetails();
        salaryDetails.setProjectId(projectId);
        List<LabourDetails> labourDetailsList = labourDetailsRepository.findByProjectId(projectId);
        salaryDetails.setLabourDetailsList(labourDetailsList);
        List<MaterialDetails> materialDetailsList = materialDetailsRepository.findByProjectId(projectId);
        salaryDetails.setMaterialDetailsList(materialDetailsList);
        return salaryDetails;
    }

}
