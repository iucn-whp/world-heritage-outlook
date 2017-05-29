package com.iucn.whp.portlet.dto.step.benefits;

import java.util.List;

public class BenefitsDTO {

    private Long assessmentVersionId;
    private Long userId;
    private String userFullName;
    private String roleName;
    private String version;

    private List<UnderstandBenefitsDTO> understandBenefitsDTOList;
    private List<BenefitsSummaryDTO> benefitsSummaryDTOList;

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

    public List<BenefitsSummaryDTO> getBenefitsSummaryDTOList() {
        return benefitsSummaryDTOList;
    }

    public void setBenefitsSummaryDTOList(List<BenefitsSummaryDTO> benefitsSummaryDTOList) {
        this.benefitsSummaryDTOList = benefitsSummaryDTOList;
    }

    public List<UnderstandBenefitsDTO> getUnderstandBenefitsDTOList() {
        return understandBenefitsDTOList;
    }

    public void setUnderstandBenefitsDTOList(List<UnderstandBenefitsDTO> understandBenefitsDTOList) {
        this.understandBenefitsDTOList = understandBenefitsDTOList;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
