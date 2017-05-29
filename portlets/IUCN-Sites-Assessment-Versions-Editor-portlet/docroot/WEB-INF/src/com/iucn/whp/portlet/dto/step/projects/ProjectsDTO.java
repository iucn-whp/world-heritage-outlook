package com.iucn.whp.portlet.dto.step.projects;

import java.util.List;

public class ProjectsDTO {

    private Long projectId;
    private Long assessmentVersionId;
    private Long userId;
    private String userFullName;
    private String roleName;
    private String version;
    private List<ConservationProjectDTO> conservationProjectDTOList;
    private List<PotentialProjectsNeedsDTO> potentialProjectsNeedsDTOList;

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public List<ConservationProjectDTO> getConservationProjectDTOList() {
        return conservationProjectDTOList;
    }

    public void setConservationProjectDTOList(List<ConservationProjectDTO> conservationProjectDTOList) {
        this.conservationProjectDTOList = conservationProjectDTOList;
    }

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

    public List<PotentialProjectsNeedsDTO> getPotentialProjectsNeedsDTOList() {
        return potentialProjectsNeedsDTOList;
    }

    public void setPotentialProjectsNeedsDTOList(List<PotentialProjectsNeedsDTO> potentialProjectsNeedsDTOList) {
        this.potentialProjectsNeedsDTOList = potentialProjectsNeedsDTOList;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
