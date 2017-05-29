package com.iucn.whp.dto;

import java.io.Serializable;
import java.util.List;

import com.iucn.whp.dbservice.model.assessing_threats_current;
import com.iucn.whp.dbservice.model.assessment_whvalues;
import com.iucn.whp.dbservice.model.current_threat_assessment_cat;
import com.iucn.whp.dbservice.model.current_threat_values;
import com.iucn.whp.dbservice.model.threat_categories_lkp;
import com.iucn.whp.dbservice.model.threat_rating_lkp;
import com.iucn.whp.dbservice.model.threat_subcategories_lkp;

public class CurrentThreatValues implements Serializable {



	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private assessing_threats_current threats_current;
	
	private threat_categories_lkp threat_category;
	
	private threat_subcategories_lkp threat_subcategory;
	
	private List<current_threat_assessment_cat> lstthreat_assessment_cat;
	
	private List<assessment_whvalues> lstwhvalues;
	
	private current_threat_values threat_values;
	
	private threat_rating_lkp threat_rating;

	public void setThreats_current(assessing_threats_current threats_current) {
		this.threats_current = threats_current;
	}

	public assessing_threats_current getThreats_current() {
		return threats_current;
	}

	public void setThreat_category(threat_categories_lkp threat_category) {
		this.threat_category = threat_category;
	}

	public threat_categories_lkp getThreat_category() {
		return threat_category;
	}

	public void setThreat_subcategory(threat_subcategories_lkp threat_subcategory) {
		this.threat_subcategory = threat_subcategory;
	}

	public threat_subcategories_lkp getThreat_subcategory() {
		return threat_subcategory;
	}

	public void setThreat_values(current_threat_values threat_values) {
		this.threat_values = threat_values;
	}

	public current_threat_values getThreat_values() {
		return threat_values;
	}

	public void setThreat_rating(threat_rating_lkp threat_rating) {
		this.threat_rating = threat_rating;
	}

	public threat_rating_lkp getThreat_rating() {
		return threat_rating;
	}

	public void setLstthreat_assessment_cat(List<current_threat_assessment_cat> lstthreat_assessment_cat) {
		this.lstthreat_assessment_cat = lstthreat_assessment_cat;
	}

	public List<current_threat_assessment_cat> getLstthreat_assessment_cat() {
		return lstthreat_assessment_cat;
	}

	public void setLstwhvalues(List<assessment_whvalues> lstwhvalues) {
		this.lstwhvalues = lstwhvalues;
	}

	public List<assessment_whvalues> getLstwhvalues() {
		return lstwhvalues;
	}
	
}
