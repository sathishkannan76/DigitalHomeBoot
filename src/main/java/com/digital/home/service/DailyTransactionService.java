package com.digital.home.service;

import com.digital.home.model.*;
import com.digital.home.repository.LabourDetailsRepository;
import com.digital.home.repository.MaterialDetailsRepository;
import com.digital.home.repository.MaterialMasterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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

    public DailyTransaction getDailyTransactionDetails(long projectId) {
        List<MaterialMaster> materialMasterList = materialMasterRepository.findByProjectId(projectId);
        List<Long> materialTypeIds = materialMasterList.stream()
                .map(e -> e.getMaterialTypeId()).collect(Collectors.toList());
        DailyTransaction dailyTransaction = new DailyTransaction();
        Date currentDate = new Date();
        dailyTransaction.setProjectId(projectId);
        dailyTransaction.setTransactionDate(currentDate);
        List<MaterialDetailsKey> materialDetailsKeyList = new ArrayList<>();
        for (long materialTypeId : materialTypeIds) {
            MaterialDetailsKey materialDetailsKey = new MaterialDetailsKey(projectId, currentDate, materialTypeId);
            materialDetailsKeyList.add(materialDetailsKey);
        }
        materialDetailsRepository.findById(new MaterialDetailsKey());
        List<MaterialDetails> materialDetailsList = materialDetailsRepository.findAllById(materialDetailsKeyList);
        dailyTransaction.setMaterialDetailsList(materialDetailsList);
        return dailyTransaction;
    }

}
