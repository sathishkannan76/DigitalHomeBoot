package com.digital.home.model;

import java.util.List;

public class SalaryDetails {

    private long projectId;
    private List<LabourDetails> labourDetailsList;
    private List<MaterialDetails> materialDetailsList;

    public long getProjectId() {
        return projectId;
    }

    public void setProjectId(long projectId) {
        this.projectId = projectId;
    }

    public List<LabourDetails> getLabourDetailsList() {
        return labourDetailsList;
    }

    public void setLabourDetailsList(List<LabourDetails> labourDetailsList) {
        this.labourDetailsList = labourDetailsList;
    }

    public List<MaterialDetails> getMaterialDetailsList() {
        return materialDetailsList;
    }

    public void setMaterialDetailsList(List<MaterialDetails> materialDetailsList) {
        this.materialDetailsList = materialDetailsList;
    }
}
