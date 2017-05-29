package com.iucn.whp.portlet.dto.step.threats;

import java.io.Serializable;
import java.util.List;

public class CategoryDTO implements Serializable, Comparable<CategoryDTO> {

    private Long categoryId;
    private String categoryName;

    private List<SubCategoryDTO> subCategoryDTOList;

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<SubCategoryDTO> getSubCategoryDTOList() {
        return subCategoryDTOList;
    }

    public void setSubCategoryDTOList(List<SubCategoryDTO> subCategoryDTOList) {
        this.subCategoryDTOList = subCategoryDTOList;
    }

    @Override
    public int compareTo(CategoryDTO o) {
        return Long.compare(this.getCategoryId(), o.getCategoryId());
    }
}
