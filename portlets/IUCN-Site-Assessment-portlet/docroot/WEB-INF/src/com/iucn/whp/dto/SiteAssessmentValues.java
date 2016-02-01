package com.iucn.whp.dto;

import java.io.Serializable;
import java.util.List;

import com.iucn.whp.dbservice.model.assessment_whvalues;
import com.iucn.whp.dbservice.model.assessment_whvalues_whcriterion;
import com.iucn.whp.dbservice.model.recommendation_type_lkp;
import com.iucn.whp.dbservice.model.whp_sites_iucn_recommendation;

public class SiteAssessmentValues implements Serializable {



	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private assessment_whvalues whvalues;
	
	private String strwhvalues_whcriterion;
	
	private int sno;

	public void setWhvalues(assessment_whvalues whvalues) {
		this.whvalues = whvalues;
	}

	public assessment_whvalues getWhvalues() {
		return whvalues;
	}

	public void setStrwhvalues_whcriterion(String strwhvalues_whcriterion) {
		this.strwhvalues_whcriterion = strwhvalues_whcriterion;
	}

	public String getStrwhvalues_whcriterion() {
		return strwhvalues_whcriterion;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public int getSno() {
		return sno;
	}
	
}
