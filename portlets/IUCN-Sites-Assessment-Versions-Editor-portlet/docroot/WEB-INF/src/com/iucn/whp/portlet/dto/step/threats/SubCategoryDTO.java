package com.iucn.whp.portlet.dto.step.threats;

import java.io.Serializable;

public class SubCategoryDTO implements Serializable, Comparable<SubCategoryDTO>  {

    private Long subCategoryId;
    private String subCategoryName;

    public Long getSubCategoryId() {
        return subCategoryId;
    }

    public void setSubCategoryId(Long subCategoryId) {
        this.subCategoryId = subCategoryId;
    }

    public String getSubCategoryName() {
        return subCategoryName;
    }

    public void setSubCategoryName(String subCategoryName) {
        this.subCategoryName = subCategoryName;
    }

    @Override
    public int compareTo(SubCategoryDTO o) {

        return new Integer(Long.compare(this.getSubCategoryId(), o.getSubCategoryId()));
    }
}
