package com.iucn.whp.portlet.dto.step.threats;

import java.util.List;

public class ThreatsDTO {

    private Long assessmentVersionId;
    private Long userId;
    private String userFullName;
    private String roleName;
    private String version;

    private List<CurrentThreatsDTO> currentThreatsDTOList;
    private List<PotentialThreatsDTO> potentialThreatsDTOList;
    private List<OverallAssessmentOfThreatsDTO> overallAssessmentOfThreatsDTOList;

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

    public List<CurrentThreatsDTO> getCurrentThreatsDTOList() {
        return currentThreatsDTOList;
    }

    public void setCurrentThreatsDTOList(List<CurrentThreatsDTO> currentThreatsDTOList) {
        this.currentThreatsDTOList = currentThreatsDTOList;
    }

    public List<PotentialThreatsDTO> getPotentialThreatsDTOList() {
        return potentialThreatsDTOList;
    }

    public void setPotentialThreatsDTOList(List<PotentialThreatsDTO> potentialThreatsDTOList) {
        this.potentialThreatsDTOList = potentialThreatsDTOList;
    }

    public List<OverallAssessmentOfThreatsDTO> getOverallAssessmentOfThreatsDTOList() {
        return overallAssessmentOfThreatsDTOList;
    }

    public void setOverallAssessmentOfThreatsDTOList(List<OverallAssessmentOfThreatsDTO> overallAssessmentOfThreatsDTOList) {
        this.overallAssessmentOfThreatsDTOList = overallAssessmentOfThreatsDTOList;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
