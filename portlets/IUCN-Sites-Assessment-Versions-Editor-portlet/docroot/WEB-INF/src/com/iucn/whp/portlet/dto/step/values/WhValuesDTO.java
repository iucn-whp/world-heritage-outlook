package com.iucn.whp.portlet.dto.step.values;

public class WhValuesDTO {

    /* Identifying And Describing Values Table*/

    private Long valueId;
    private String values;
    private String description;
    private String whCriteria;

    public Long getValueId() {
        return valueId;
    }

    public void setValueId(Long valueId) {
        this.valueId = valueId;
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

    public String getWhCriteria() {
        return whCriteria;
    }

    public void setWhCriteria(String whCriteria) {
        this.whCriteria = whCriteria;
    }
}
