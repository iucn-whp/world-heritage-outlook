package com.iucn.whp.portlet.dto.step.conservation;

import com.iucn.whp.portlet.dto.ThreatsRating;

public class AssessmentOfConservationOutlookDTO {

    private Long conservationOutlookId;
    private String justification;

    private ThreatsRating threatRating;

    public Long getConservationOutlookId() {
        return conservationOutlookId;
    }

    public void setConservationOutlookId(Long conservationOutlookId) {
        this.conservationOutlookId = conservationOutlookId;
    }

    public ThreatsRating getThreatRating() {
        return threatRating;
    }

    public void setThreatRating(ThreatsRating threatRating) {
        this.threatRating = threatRating;
    }

    public String getJustification() {
        return justification;
    }

    public void setJustification(String justification) {
        this.justification = justification;
    }

}
