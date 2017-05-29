package com.iucn.whp.portlet.dto.step.assessingvalues;

import com.iucn.whp.dbservice.model.state_trend_biodivvals;
import com.iucn.whp.dbservice.model.trend_lkp;

/**
 * Created by Lugovskoy Andrey on 01.09.16.
 */
public class AssessingValuesDTOStateTrendBio {

    state_trend_biodivvals state_trend_biodivvals;
    trend_lkp trend_lkp;

    public AssessingValuesDTOStateTrendBio() {
    }

    public com.iucn.whp.dbservice.model.state_trend_biodivvals getState_trend_biodivvals() {
        return state_trend_biodivvals;
    }

    public void setState_trend_biodivvals(com.iucn.whp.dbservice.model.state_trend_biodivvals state_trend_biodivvals) {
        this.state_trend_biodivvals = state_trend_biodivvals;
    }

    public com.iucn.whp.dbservice.model.trend_lkp getTrend_lkp() {
        return trend_lkp;
    }

    public void setTrend_lkp(com.iucn.whp.dbservice.model.trend_lkp trend_lkp) {
        this.trend_lkp = trend_lkp;
    }
}
