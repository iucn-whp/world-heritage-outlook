package com.iucn.whp.portlet.dto.step.values;

import java.util.List;

public class ValuesDTO {

    private Long assessmentVersionId;
    private Long userId;
    private String userFullName;
    private String roleName;
    private String version;

    private List<WhValuesDTO> whValuesDTOList;
    private List<BiodiversityValuesDTO> biodiversityValuesDTOList;

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

    public List<WhValuesDTO> getWhValuesDTOList() {
        return whValuesDTOList;
    }

    public void setWhValuesDTOList(List<WhValuesDTO> whValuesDTOList) {
        this.whValuesDTOList = whValuesDTOList;
    }

    public List<BiodiversityValuesDTO> getBiodiversityValuesDTOList() {
        return biodiversityValuesDTOList;
    }

    public void setBiodiversityValuesDTOList(List<BiodiversityValuesDTO> biodiversityValuesDTOList) {
        this.biodiversityValuesDTOList = biodiversityValuesDTOList;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
