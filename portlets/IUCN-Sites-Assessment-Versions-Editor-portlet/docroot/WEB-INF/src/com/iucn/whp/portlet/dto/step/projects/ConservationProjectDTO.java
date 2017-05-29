package com.iucn.whp.portlet.dto.step.projects;

public class ConservationProjectDTO {

    private Long conservationId;
    private String organizationIndividual;
    private String projectDurationFrom;
    private String projectDurationTo;
    private String conservationDescription;
    private String conservationDetails;

    public Long getConservationId() {
        return conservationId;
    }

    public void setConservationId(Long conservationId) {
        this.conservationId = conservationId;
    }

    public String getProjectDurationFrom() {
        return projectDurationFrom;
    }

    public void setProjectDurationFrom(String projectDurationFrom) {
        this.projectDurationFrom = projectDurationFrom;
    }

    public String getProjectDurationTo() {
        return projectDurationTo;
    }

    public void setProjectDurationTo(String projectDurationTo) {
        this.projectDurationTo = projectDurationTo;
    }

    public String getConservationDescription() {
        return conservationDescription;
    }

    public void setConservationDescription(String conservationDescription) {
        this.conservationDescription = conservationDescription;
    }

    public String getConservationDetails() {
        return conservationDetails;
    }

    public void setConservationDetails(String conservationDetails) {
        this.conservationDetails = conservationDetails;
    }

    public String getOrganizationIndividual() {
        return organizationIndividual;
    }

    public void setOrganizationIndividual(String organizationIndividual) {
        this.organizationIndividual = organizationIndividual;
    }
}
