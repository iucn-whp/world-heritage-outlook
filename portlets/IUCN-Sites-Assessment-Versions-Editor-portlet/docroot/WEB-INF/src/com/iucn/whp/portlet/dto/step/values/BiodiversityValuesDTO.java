package com.iucn.whp.portlet.dto.step.values;

public class BiodiversityValuesDTO {

    /* Other Important Biodiversity Values Table */

    private Long biodiversityValueId;
    private String values;
    private String description;

    public Long getBiodiversityValueId() {
        return biodiversityValueId;
    }

    public void setBiodiversityValueId(Long biodiversityValueId) {
        this.biodiversityValueId = biodiversityValueId;
    }

    public String getValues() {
        return values;
    }

    public void setValues(String values) {
        this.values = values;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
