package com.iucn.whp.portlet.dto.step.projects;

public class PotentialProjectsNeedsDTO {

    private Long ppnId;
    private String organizationIndividual;
    private String description;

    public Long getPpnId() {
        return ppnId;
    }

    public void setPpnId(Long ppnId) {
        this.ppnId = ppnId;
    }

    public String getOrganizationIndividual() {
        return organizationIndividual;
    }

    public void setOrganizationIndividual(String organizationIndividual) {
        this.organizationIndividual = organizationIndividual;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
