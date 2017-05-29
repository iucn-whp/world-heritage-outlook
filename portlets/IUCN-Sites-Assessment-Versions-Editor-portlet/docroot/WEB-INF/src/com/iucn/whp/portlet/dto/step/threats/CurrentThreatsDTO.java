package com.iucn.whp.portlet.dto.step.threats;

import com.iucn.whp.portlet.dto.ThreatsRating;

import java.util.List;

public class CurrentThreatsDTO {

    private Long currentThreatId;
    private String currentThreatName;
    private String justification;
    private String threatExtentValue;

    private List<CategoryDTO> categoryDTOList;
    private String valuesAffected;

    private ThreatsRating threatRating;

    private boolean insideSite;
    private boolean outsideSite;

    public Long getCurrentThreatId() {
        return currentThreatId;
    }

    public void setCurrentThreatId(Long currentThreatId) {
        this.currentThreatId = currentThreatId;
    }

    public String getCurrentThreatName() {
        return currentThreatName;
    }

    public void setCurrentThreatName(String currentThreatName) {
        this.currentThreatName = currentThreatName;
    }

    public String getJustification() {
        return justification;
    }

    public void setJustification(String justification) {
        this.justification = justification;
    }

    public String getThreatExtentValue() {
        return threatExtentValue;
    }

    public void setThreatExtentValue(String threatExtentValue) {
        this.threatExtentValue = threatExtentValue;
    }

    public ThreatsRating getThreatRating() {
        return threatRating;
    }

    public void setThreatRating(ThreatsRating threatRating) {
        this.threatRating = threatRating;
    }

    public boolean isInsideSite() {
        return insideSite;
    }

    public void setInsideSite(boolean insideSite) {
        this.insideSite = insideSite;
    }

    public boolean isOutsideSite() {
        return outsideSite;
    }

    public void setOutsideSite(boolean outsideSite) {
        this.outsideSite = outsideSite;
    }

    public List<CategoryDTO> getCategoryDTOList() {
        return categoryDTOList;
    }

    public void setCategoryDTOList(List<CategoryDTO> categoryDTOList) {
        this.categoryDTOList = categoryDTOList;
    }

    public String getValuesAffected() {
        return valuesAffected;
    }

    public void setValuesAffected(String valuesAffected) {
        this.valuesAffected = valuesAffected;
    }
}
