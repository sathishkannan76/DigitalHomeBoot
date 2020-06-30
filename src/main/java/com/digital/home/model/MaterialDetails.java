package com.digital.home.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "MaterialDetails")
@IdClass(MaterialDetailsKey.class)
public class MaterialDetails {

    @Id
    private long projectId;
    @Id
    private Date transactionDate;
    @Id
    private long materialTypeId;

    private int unitsUsed;
    private double actualCost;
    private String vendorName;

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

    public long getMaterialTypeId() {
        return materialTypeId;
    }

    public void setMaterialTypeId(long materialTypeId) {
        this.materialTypeId = materialTypeId;
    }

    public int getUnitsUsed() {
        return unitsUsed;
    }

    public void setUnitsUsed(int unitsUsed) {
        this.unitsUsed = unitsUsed;
    }

    public double getActualCost() {
        return actualCost;
    }

    public void setActualCost(double actualCost) {
        this.actualCost = actualCost;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }
}
