package com.digital.home.model;

import java.util.List;

public class MaterialCostDetails {

    private long projectId;
    private List<MaterialDetails> materialDetailsList;

    public long getProjectId() {
        return projectId;
    }

    public void setProjectId(long projectId) {
        this.projectId = projectId;
    }

    public List<MaterialDetails> getMaterialDetailsList() {
        return materialDetailsList;
    }

    public void setMaterialDetailsList(List<MaterialDetails> materialDetailsList) {
        this.materialDetailsList = materialDetailsList;
    }
}
