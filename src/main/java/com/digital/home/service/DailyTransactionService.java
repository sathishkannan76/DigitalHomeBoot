package com.digital.home.service;

import com.digital.home.model.*;
import com.digital.home.repository.LabourDetailsRepository;
import com.digital.home.repository.LabourMasterRepository;
import com.digital.home.repository.MaterialDetailsRepository;
import com.digital.home.repository.MaterialMasterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class DailyTransactionService {

    @Autowired
    private MaterialDetailsRepository materialDetailsRepository;

    @Autowired
    private LabourDetailsRepository labourDetailsRepository;

    @Autowired
    private MaterialMasterRepository materialMasterRepository;

    @Autowired
    private LabourMasterRepository labourMasterRepository;

    public boolean postDailyTransactionDetails(long projectId, DailyTransaction dailyTransaction) {
        List<MaterialDetails> materialDetailsList =
                materialDetailsRepository.saveAll(dailyTransaction.getMaterialDetailsList());
        List<LabourDetails> labourDetailsList =
                labourDetailsRepository.saveAll(dailyTransaction.getLabourDetailsList());
        return true;
    }

    public DailyTransaction getDailyTransactionDetails(long projectId) {

        DailyTransaction dailyTransaction = new DailyTransaction();
        Date currentDate = new Date();
        dailyTransaction.setProjectId(projectId);
        dailyTransaction.setTransactionDate(currentDate);

        // Get material details
        List<MaterialMaster> materialMasterList = materialMasterRepository.findByProjectId(projectId);
        List<Long> materialTypeIds = materialMasterList.stream()
                .map(e -> e.getMaterialTypeId()).collect(Collectors.toList());
        List<MaterialDetailsKey> materialDetailsKeyList = materialTypeIds.stream()
                .map(e -> new MaterialDetailsKey(projectId, currentDate, e)).collect(Collectors.toList());
        List<MaterialDetails> materialDetailsList = materialDetailsRepository.findAllById(materialDetailsKeyList);
        dailyTransaction.setMaterialDetailsList(materialDetailsList);

        // Get labour details
        List<LabourMaster> labourMasterList = labourMasterRepository.findByProjectId(projectId);
        List<Long> labourTypeIds = labourMasterList.stream()
                .map(e -> e.getLabourTypeId()).collect(Collectors.toList());
        List<LabourDetailsKey> labourDetailsKeyList = labourTypeIds.stream()
                .map(e -> new LabourDetailsKey(projectId, currentDate, e)).collect(Collectors.toList());
        List<LabourDetails> labourDetailsList = labourDetailsRepository.findAllById(labourDetailsKeyList);
        dailyTransaction.setLabourDetailsList(labourDetailsList);

        return dailyTransaction;
    }

}
