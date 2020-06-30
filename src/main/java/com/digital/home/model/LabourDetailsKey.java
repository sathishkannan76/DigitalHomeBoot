package com.digital.home.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class LabourDetailsKey implements Serializable {

    private long projectId;
    private Date transactionDate;
    private long labourTypeId;
    private String name;

    public LabourDetailsKey() {

    }

    public LabourDetailsKey(long projectId, Date transactionDate, long labourTypeId, String name) {
        this.projectId = projectId;
        this.transactionDate = transactionDate;
        this.labourTypeId = labourTypeId;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LabourDetailsKey that = (LabourDetailsKey) o;
        return projectId == that.projectId &&
                labourTypeId == that.labourTypeId &&
                transactionDate.equals(that.transactionDate) &&
                name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, transactionDate, labourTypeId, name);
    }
}
