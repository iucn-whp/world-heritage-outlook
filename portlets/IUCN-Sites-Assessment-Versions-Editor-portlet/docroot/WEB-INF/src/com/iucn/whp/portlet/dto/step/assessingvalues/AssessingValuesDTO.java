package com.iucn.whp.portlet.dto.step.assessingvalues;

import java.util.List;

/**
 * Created by Lugovskoy Andrey on 01.09.16.
 */
public class AssessingValuesDTO {

    List<AssessingValueDTOTrend> notBioVal;

    List<AssessingValueDTOTrend> bioVal;

    AssessingValuesDTOStateTrend assessingValuesDTOStateTrend;

    AssessingValuesDTOStateTrendBio assessingValuesDTOStateTrendBio;

    public AssessingValuesDTO() {
    }

    public AssessingValuesDTOStateTrendBio getAssessingValuesDTOStateTrendBio() {
        return assessingValuesDTOStateTrendBio;
    }

    public void setAssessingValuesDTOStateTrendBio(AssessingValuesDTOStateTrendBio assessingValuesDTOStateTrendBio) {
        this.assessingValuesDTOStateTrendBio = assessingValuesDTOStateTrendBio;
    }

    public AssessingValuesDTOStateTrend getAssessingValuesDTOStateTrend() {
        return assessingValuesDTOStateTrend;
    }

    public void setAssessingValuesDTOStateTrend(AssessingValuesDTOStateTrend assessingValuesDTOStateTrend) {
        this.assessingValuesDTOStateTrend = assessingValuesDTOStateTrend;
    }

    public List<AssessingValueDTOTrend> getNotBioVal() {
        return notBioVal;
    }

    public void setNotBioVal(List<AssessingValueDTOTrend> notBioVal) {
        this.notBioVal = notBioVal;
    }

    public List<AssessingValueDTOTrend> getBioVal() {
        return bioVal;
    }

    public void setBioVal(List<AssessingValueDTOTrend> bioVal) {
        this.bioVal = bioVal;
    }
}
