package com.iucn.whp.dto;

import java.io.Serializable;
import java.util.List;

import com.iucn.whp.dbservice.model.assessing_threats_potential;
import com.iucn.whp.dbservice.model.assessment_whvalues;
import com.iucn.whp.dbservice.model.potential_threat_assessment_cat;
import com.iucn.whp.dbservice.model.potential_threat_values;
import com.iucn.whp.dbservice.model.threat_categories_lkp;
import com.iucn.whp.dbservice.model.threat_rating_lkp;
import com.iucn.whp.dbservice.model.threat_subcategories_lkp;

public class PotentialThreatValues implements Serializable {



	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private assessing_threats_potential threats_potential;
	
	private threat_categories_lkp threat_category;
	
	private threat_subcategories_lkp threat_subcategory;
	
	private List<potential_threat_assessment_cat> lstthreat_assessment_cat;
	
	private String threatValues;
	private List<potential_threat_values> lstthreat_values;
	
	private threat_rating_lkp threat_rating;

	public void setThreats_potential(assessing_threats_potential threats_potential) {
		this.threats_potential = threats_potential;
	}

	public assessing_threats_potential getThreats_potential() {
		return threats_potential;
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

	public void setThreat_rating(threat_rating_lkp threat_rating) {
		this.threat_rating = threat_rating;
	}

	public threat_rating_lkp getThreat_rating() {
		return threat_rating;
	}

	public void setLstthreat_assessment_cat(List<potential_threat_assessment_cat> lstthreat_assessment_cat) {
		this.lstthreat_assessment_cat = lstthreat_assessment_cat;
	}

	public List<potential_threat_assessment_cat> getLstthreat_assessment_cat() {
		return lstthreat_assessment_cat;
	}

	public void setLstthreat_values(List<potential_threat_values> lstthreat_values) {
		this.lstthreat_values = lstthreat_values;
	}

	public List<potential_threat_values> getLstthreat_values() {
		return lstthreat_values;
	}

	public void setThreatValues(String threatValues) {
		this.threatValues = threatValues;
	}

	public String getThreatValues() {
		return threatValues;
	}
	
}
