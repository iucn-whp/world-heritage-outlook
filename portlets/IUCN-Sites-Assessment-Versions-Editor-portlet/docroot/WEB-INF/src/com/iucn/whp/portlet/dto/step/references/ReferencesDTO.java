package com.iucn.whp.portlet.dto.step.references;

import java.util.List;

public class ReferencesDTO {

    private Long assessmentVersionId;
    private Long userId;
    private String userFullName;
    private String roleName;
    private String version;

    private List<ReferenceValueDTO> referenceValues;

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

    public List<ReferenceValueDTO> getReferenceValues() {
        return referenceValues;
    }

    public void setReferenceValues(List<ReferenceValueDTO> referenceValues) {
        this.referenceValues = referenceValues;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
