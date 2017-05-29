package com.iucn.whp.portlet.dto.step.threats;

import com.iucn.whp.portlet.dto.ThreatsRating;

import java.io.Serializable;
import java.util.List;

public class PotentialThreatsDTO implements Serializable, Comparable<PotentialThreatsDTO> {

    private Long potentialThreatId;
    private String potentialThreatName;
    private String justification;
    private String threatExtentValue;

    private List<CategoryDTO> categoryDTOList;
    private String valuesAffected;

    private ThreatsRating threatRating;

    private boolean insideSite;
    private boolean outsideSite;

    public Long getPotentialThreatId() {
        return potentialThreatId;
    }

    public void setPotentialThreatId(Long potentialThreatId) {
        this.potentialThreatId = potentialThreatId;
    }

    public String getPotentialThreatName() {
        return potentialThreatName;
    }

    public void setPotentialThreatName(String potentialThreatName) {
        this.potentialThreatName = potentialThreatName;
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

    @Override
    public int compareTo(PotentialThreatsDTO o) {
        return Long.compare(this.getPotentialThreatId(), o.getPotentialThreatId());
    }
}
