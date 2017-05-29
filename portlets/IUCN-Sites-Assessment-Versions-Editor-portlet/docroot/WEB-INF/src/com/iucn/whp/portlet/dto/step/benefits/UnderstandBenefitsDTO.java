package com.iucn.whp.portlet.dto.step.benefits;

import com.iucn.whp.dbservice.model.*;

import java.util.List;
import java.util.Map;

// TODO - Refactor me!!!!!!!!
public class UnderstandBenefitsDTO {

    private List<benefit_checksubtype_lkp> benefitchecksubtypelkp;

    private benefit_checktype_lkp benefitchecktypelkp;

    private benefit_rating_lkp benefitratingInside;
    private benefit_rating_lkp benefitratingOutside;
    private benefit_rating_lkp benefitratingWider;
    private benefits objbenefits;

    private String datadeficent;

    private List<benefits_type_ref> benefits_type_reflist;

    private Map<Long, String> negativeLevelsMap;
    private Map<Long, String> trendsMap;

    public List<benefits_type_ref> getBenefits_type_reflist() {
        return benefits_type_reflist;
    }

    public void setBenefits_type_reflist(
            List<benefits_type_ref> benefits_type_reflist) {
        this.benefits_type_reflist = benefits_type_reflist;
    }

    public benefits getObjbenefits() {
        return objbenefits;
    }

    public void setObjbenefits(benefits objbenefits) {
        this.objbenefits = objbenefits;
    }

    public void setBenefitchecksubtypelkp(List<benefit_checksubtype_lkp> benefitchecksubtypelkp) {
        this.benefitchecksubtypelkp = benefitchecksubtypelkp;
    }

    public List<benefit_checksubtype_lkp> getBenefitchecksubtypelkp() {
        return benefitchecksubtypelkp;
    }

    public void setBenefitchecktypelkp(benefit_checktype_lkp benefitchecktypelkp) {
        this.benefitchecktypelkp = benefitchecktypelkp;
    }

    public benefit_checktype_lkp getBenefitchecktypelkp() {
        return benefitchecktypelkp;
    }

    public void setBenefitratingInside(benefit_rating_lkp benefitratingInside) {
        this.benefitratingInside = benefitratingInside;
    }

    public benefit_rating_lkp getBenefitratingInside() {
        return benefitratingInside;
    }

    public void setBenefitratingOutside(benefit_rating_lkp benefitratingOutside) {
        this.benefitratingOutside = benefitratingOutside;
    }

    public benefit_rating_lkp getBenefitratingOutside() {
        return benefitratingOutside;
    }

    public void setBenefitratingWider(benefit_rating_lkp benefitratingWider) {
        this.benefitratingWider = benefitratingWider;
    }

    public benefit_rating_lkp getBenefitratingWider() {
        return benefitratingWider;
    }

    public void setDatadeficent(String datadeficent) {
        this.datadeficent = datadeficent;
    }

    public String getDatadeficent() {
        return datadeficent;
    }

    public Map<Long, String> getNegativeLevelsMap() {
        return negativeLevelsMap;
    }

    public void setNegativeLevelsMap(Map<Long, String> negativeLevelsMap) {
        this.negativeLevelsMap = negativeLevelsMap;
    }

    public Map<Long, String> getTrendsMap() {
        return trendsMap;
    }

    public void setTrendsMap(Map<Long, String> trendsMap) {
        this.trendsMap = trendsMap;
    }
}
