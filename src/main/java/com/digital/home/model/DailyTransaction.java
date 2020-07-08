package com.digital.home.model;

import java.util.Date;
import java.util.List;

public class DailyTransaction {

    private long projectId;
    private Date transactionDate;
    private List<MaterialDetails> materialDetailsList;
    private List<LabourDetails> labourDetailsList;

    public long getProjectId() {
        return projectId;
    }

    public void setProjectId(long projectId) {
        this.projectId = projectId;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public List<MaterialDetails> getMaterialDetailsList() {
        return materialDetailsList;
    }

    public void setMaterialDetailsList(List<MaterialDetails> materialDetailsList) {
        this.materialDetailsList = materialDetailsList;
    }

    public List<LabourDetails> getLabourDetailsList() {
        return labourDetailsList;
    }

    public void setLabourDetailsList(List<LabourDetails> labourDetailsList) {
        this.labourDetailsList = labourDetailsList;
    }
}
