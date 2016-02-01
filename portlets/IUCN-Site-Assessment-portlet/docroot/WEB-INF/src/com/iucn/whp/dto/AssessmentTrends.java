package com.iucn.whp.dto;

import java.io.Serializable;
import java.util.List;

import com.iucn.whp.dbservice.model.assessment_whvalues;
import com.iucn.whp.dbservice.model.assessment_whvalues_whcriterion;
import com.iucn.whp.dbservice.model.biodiversity_values;
import com.iucn.whp.dbservice.model.current_state_trend;
import com.iucn.whp.dbservice.model.recommendation_type_lkp;
import com.iucn.whp.dbservice.model.state_lkp;
import com.iucn.whp.dbservice.model.trend_lkp;
import com.iucn.whp.dbservice.model.whp_sites_iucn_recommendation;

public class AssessmentTrends implements Serializable {



	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private state_lkp state;
	
	private trend_lkp trend;
	
	private current_state_trend currentstatetrend;
	
	private String whvalue;
	private boolean is_Biodiv_value;
	
	private int count;

	public void setState(state_lkp state) {
		this.state = state;
	}

	public state_lkp getState() {
		return state;
	}

	public void setTrend(trend_lkp trend) {
		this.trend = trend;
	}

	public trend_lkp getTrend() {
		return trend;
	}

	public void setCurrentstatetrend(current_state_trend currentstatetrend) {
		this.currentstatetrend = currentstatetrend;
	}

	public current_state_trend getCurrentstatetrend() {
		return currentstatetrend;
	}


	public void setCount(int count) {
		this.count = count;
	}

	public int getCount() {
		return count;
	}

	public void setWhvalue(String whvalue) {
		this.whvalue = whvalue;
	}

	public String getWhvalue() {
		return whvalue;
	}

	public void setIs_Biodiv_value(boolean is_Biodiv_value) {
		this.is_Biodiv_value = is_Biodiv_value;
	}

	public boolean isIs_Biodiv_value() {
		return is_Biodiv_value;
	}
	
	
}
