package com.iucn.whp.portlet.dto.step.assessingvalues;

import com.iucn.whp.dbservice.model.state_trend_whvalues;
import com.iucn.whp.dbservice.model.trend_lkp;

/**
 * Created by Lugovskoy Andrey on 01.09.16.
 */
public class AssessingValuesDTOStateTrend {

    state_trend_whvalues trendWhValue;

    trend_lkp trend_lkp;

    public AssessingValuesDTOStateTrend() {
    }

    public state_trend_whvalues getTrendWhValue() {
        return trendWhValue;
    }

    public void setTrendWhValue(state_trend_whvalues trendWhValue) {
        this.trendWhValue = trendWhValue;
    }

    public com.iucn.whp.dbservice.model.trend_lkp getTrend_lkp() {
        return trend_lkp;
    }

    public void setTrend_lkp(com.iucn.whp.dbservice.model.trend_lkp trend_lkp) {
        this.trend_lkp = trend_lkp;
    }
}
