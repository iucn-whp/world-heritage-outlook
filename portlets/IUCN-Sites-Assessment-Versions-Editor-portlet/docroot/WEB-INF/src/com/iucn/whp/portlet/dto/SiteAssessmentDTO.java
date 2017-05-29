package com.iucn.whp.portlet.dto;

import com.iucn.whp.portlet.dto.step.assessingvalues.AssessingValuesDTO;
import com.iucn.whp.portlet.dto.step.benefits.BenefitsDTO;
import com.iucn.whp.portlet.dto.step.conservation.ConservationOutlookDTO;
import com.iucn.whp.portlet.dto.step.projects.ProjectsDTO;
import com.iucn.whp.portlet.dto.step.protectionmanagement.ProtectionManagementDTO;
import com.iucn.whp.portlet.dto.step.references.ReferencesDTO;
import com.iucn.whp.portlet.dto.step.threats.ThreatsDTO;
import com.iucn.whp.portlet.dto.step.values.ValuesDTO;

import java.util.Collections;

public class SiteAssessmentDTO {

    private Long siteId;

    private Long assessmentId;

    private Long versionId;

    /* Step 1*/
    private ValuesDTO valuesDTO;

    /* Step 2 */
    private ThreatsDTO threatsDTO;

    /* Step 3*/
    private ProtectionManagementDTO protectionManagementDTO;

    /* Step 4*/
    private AssessingValuesDTO assessingValuesDTO;

    /* Step 5 */
    private ConservationOutlookDTO conservationOutlookDTO;

    /* Step 6 */
    private BenefitsDTO benefitsDTO;

    /* Step 7 */
    private ProjectsDTO projectsDTO;

    /* Step 8 */
    private ReferencesDTO referencesDTO;

    private Long status;

    private Long stage;

    public SiteAssessmentDTO() {
    }

    public AssessingValuesDTO getAssessingValuesDTO() {
        return assessingValuesDTO;
    }

    public void setAssessingValuesDTO(AssessingValuesDTO assessingValuesDTO) {
        this.assessingValuesDTO = assessingValuesDTO;
    }

    public Long getVersionId() {
        return versionId;
    }

    public void setVersionId(Long versionId) {
        this.versionId = versionId;
    }

    public ProtectionManagementDTO getProtectionManagementDTO() {
//        Collections.reverse(protectionManagementDTO.getProtectionManagementDTOs());
        return protectionManagementDTO;
    }

    public void setProtectionManagementDTO(ProtectionManagementDTO protectionManagementDTO) {
        this.protectionManagementDTO = protectionManagementDTO;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Long getStage() {
        return stage;
    }

    public void setStage(Long stage) {
        this.stage = stage;
    }

    public Long getAssessmentId() {
        return assessmentId;
    }

    public void setAssessmentId(Long assessmentId) {
        this.assessmentId = assessmentId;
    }

    public ValuesDTO getValuesDTO() {
        return valuesDTO;
    }

    public void setValuesDTO(ValuesDTO valuesDTO) {
        this.valuesDTO = valuesDTO;
    }

    public Long getSiteId() {
        return siteId;
    }

    public void setSiteId(Long siteId) {
        this.siteId = siteId;
    }

    public ThreatsDTO getThreatsDTO() {
        return threatsDTO;
    }

    public void setThreatsDTO(ThreatsDTO threatsDTO) {
        this.threatsDTO = threatsDTO;
    }

    public ProjectsDTO getProjectsDTO() {
        return projectsDTO;
    }

    public void setProjectsDTO(ProjectsDTO projectsDTO) {
        this.projectsDTO = projectsDTO;
    }

    public ReferencesDTO getReferencesDTO() {
        return referencesDTO;
    }

    public void setReferencesDTO(ReferencesDTO referencesDTO) {
        this.referencesDTO = referencesDTO;
    }

    public ConservationOutlookDTO getConservationOutlookDTO() {
        return conservationOutlookDTO;
    }

    public void setConservationOutlookDTO(ConservationOutlookDTO conservationOutlookDTO) {
        this.conservationOutlookDTO = conservationOutlookDTO;
    }

    public BenefitsDTO getBenefitsDTO() {
        return benefitsDTO;
    }

    public void setBenefitsDTO(BenefitsDTO benefitsDTO) {
        this.benefitsDTO = benefitsDTO;
    }
}
