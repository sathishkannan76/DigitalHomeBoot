package com.digital.home.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "LabourDetails")
@IdClass(LabourDetailsKey.class)
public class LabourDetails {

    @Id
    private long projectId;
    @Id
    private Date transactionDate;
    @Id
    private long labourTypeId;
    @Id
    private String name;
    @Id
    private String contactNumber;

    private float shift;
    private double wage;
    private double plannedSalary;
    private double actualSalary;

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

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

    public long getLabourTypeId() {
        return labourTypeId;
    }

    public void setLabourTypeId(long labourTypeId) {
        this.labourTypeId = labourTypeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getShift() {
        return shift;
    }

    public void setShift(float shift) {
        this.shift = shift;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getPlannedSalary() {
        return plannedSalary;
    }

    public void setPlannedSalary(double plannedSalary) {
        this.plannedSalary = plannedSalary;
    }

    public double getActualSalary() {
        return actualSalary;
    }

    public void setActualSalary(double actualSalary) {
        this.actualSalary = actualSalary;
    }
}
