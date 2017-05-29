package com.iucn.whp.portlet.dto.step.assessingvalues;

import com.iucn.whp.dbservice.model.current_state_trend;
import com.iucn.whp.dbservice.model.state_lkp;
import com.iucn.whp.dbservice.model.trend_lkp;

/**
 * Created by Lugovskoy Andrey on 01.09.16.
 */
public class AssessingValueDTOTrend {

    private state_lkp state;

    private trend_lkp trend;

    private current_state_trend currentstatetrend;

    private String whvalue;

    private boolean is_Biodiv_value;

    private int count;

    public state_lkp getState() {
        return state;
    }

    public void setState(state_lkp state) {
        this.state = state;
    }

    public trend_lkp getTrend() {
        return trend;
    }

    public void setTrend(trend_lkp trend) {
        this.trend = trend;
    }

    public current_state_trend getCurrentstatetrend() {
        return currentstatetrend;
    }

    public void setCurrentstatetrend(current_state_trend currentstatetrend) {
        this.currentstatetrend = currentstatetrend;
    }

    public String getWhvalue() {
        return whvalue;
    }

    public void setWhvalue(String whvalue) {
        this.whvalue = whvalue;
    }

    public boolean is_Biodiv_value() {
        return is_Biodiv_value;
    }

    public void setIs_Biodiv_value(boolean is_Biodiv_value) {
        this.is_Biodiv_value = is_Biodiv_value;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
