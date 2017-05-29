package com.iucn.whp.portlet.dto.step.threats;

import com.iucn.whp.portlet.dto.ThreatsRating;

import java.io.Serializable;

public class OverallAssessmentOfThreatsDTO implements Serializable, Comparable<OverallAssessmentOfThreatsDTO>{

    private Long threatSumPotentialId;
    private Long threatSumCurrentId;
    private Long threatSumOverallId;

    private String overallPotential;
    private String overallCurrent;
    private String overallThreat;

    private ThreatsRating potentialRating;
    private ThreatsRating currentRating;
    private ThreatsRating threatRating;


    public Long getThreatSumPotentialId() {
        return threatSumPotentialId;
    }

    public void setThreatSumPotentialId(Long threatSumPotentialId) {
        this.threatSumPotentialId = threatSumPotentialId;
    }

    public Long getThreatSumCurrentId() {
        return threatSumCurrentId;
    }

    public void setThreatSumCurrentId(Long threatSumCurrentId) {
        this.threatSumCurrentId = threatSumCurrentId;
    }

    public Long getThreatSumOverallId() {
        return threatSumOverallId;
    }

    public void setThreatSumOverallId(Long threatSumOverallId) {
        this.threatSumOverallId = threatSumOverallId;
    }

    public String getOverallPotential() {
        return overallPotential;
    }

    public void setOverallPotential(String overallPotential) {
        this.overallPotential = overallPotential;
    }

    public String getOverallCurrent() {
        return overallCurrent;
    }

    public void setOverallCurrent(String overallCurrent) {
        this.overallCurrent = overallCurrent;
    }

    public String getOverallThreat() {
        return overallThreat;
    }

    public void setOverallThreat(String overallThreat) {
        this.overallThreat = overallThreat;
    }

    public ThreatsRating getPotentialRating() {
        return potentialRating;
    }

    public void setPotentialRating(ThreatsRating potentialRating) {
        this.potentialRating = potentialRating;
    }

    public ThreatsRating getCurrentRating() {
        return currentRating;
    }

    public void setCurrentRating(ThreatsRating currentRating) {
        this.currentRating = currentRating;
    }

    public ThreatsRating getThreatRating() {
        return threatRating;
    }

    public void setThreatRating(ThreatsRating threatRating) {
        this.threatRating = threatRating;
    }

    @Override
    public int compareTo(OverallAssessmentOfThreatsDTO o) {
        return Long.compare(this.getThreatSumPotentialId(), o.getThreatSumPotentialId());
    }
}
