package com.iucn.whp.portlet.dto.step.benefits;

public class BenefitsSummaryDTO {

    private Long benefitsSummaryId;
    private String summary;

    public Long getBenefitsSummaryId() {
        return benefitsSummaryId;
    }

    public void setBenefitsSummaryId(Long benefitsSummaryId) {
        this.benefitsSummaryId = benefitsSummaryId;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
}
