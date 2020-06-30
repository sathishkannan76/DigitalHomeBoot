package com.digital.home.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class MaterialDetailsKey implements Serializable {

    private long projectId;
    private Date transactionDate;
    private long materialTypeId;

    public MaterialDetailsKey() {

    }

    public MaterialDetailsKey(long projectId, Date transactionDate, long materialTypeId) {
        this.projectId = projectId;
        this.transactionDate = transactionDate;
        this.materialTypeId = materialTypeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MaterialDetailsKey that = (MaterialDetailsKey) o;
        return projectId == that.projectId &&
                materialTypeId == that.materialTypeId &&
                transactionDate.equals(that.transactionDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, transactionDate, materialTypeId);
    }
}
