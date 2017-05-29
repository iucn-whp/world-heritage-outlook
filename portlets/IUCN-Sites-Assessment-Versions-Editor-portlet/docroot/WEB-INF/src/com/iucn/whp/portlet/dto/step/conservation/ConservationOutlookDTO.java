package com.iucn.whp.portlet.dto.step.conservation;

import java.util.List;

public class ConservationOutlookDTO {

    private Long assessmentVersionId;
    private Long userId;
    private String userFullName;
    private String roleName;
    private String version;

    SummaryOfAssessmentsDTO summaryOfAssessmentsDTO;
    List<AssessmentOfConservationOutlookDTO> conservationOutlookDTOList;

    public Long getAssessmentVersionId() {
        return assessmentVersionId;
    }

    public void setAssessmentVersionId(Long assessmentVersionId) {
        this.assessmentVersionId = assessmentVersionId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserFullName() {
        return userFullName;
    }

    public void setUserFullName(String userFullName) {
        this.userFullName = userFullName;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public SummaryOfAssessmentsDTO getSummaryOfAssessmentsDTO() {
        return summaryOfAssessmentsDTO;
    }

    public void setSummaryOfAssessmentsDTO(SummaryOfAssessmentsDTO summaryOfAssessmentsDTO) {
        this.summaryOfAssessmentsDTO = summaryOfAssessmentsDTO;
    }

    public List<AssessmentOfConservationOutlookDTO> getConservationOutlookDTOList() {
        return conservationOutlookDTOList;
    }

    public void setConservationOutlookDTOList(List<AssessmentOfConservationOutlookDTO> conservationOutlookDTOList) {
        this.conservationOutlookDTOList = conservationOutlookDTOList;
    }

}
