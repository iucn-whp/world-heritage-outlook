package com.iucn.whp.dto;

import java.io.Serializable;

import com.iucn.whp.dbservice.model.recommendation_type_lkp;
import com.iucn.whp.dbservice.model.whp_sites_iucn_recommendation;

public class WhpSiteRecommendationType implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private whp_sites_iucn_recommendation whpRecommendation;
	private recommendation_type_lkp recommendationType;
	public whp_sites_iucn_recommendation getWhpRecommendation() {
		return whpRecommendation;
	}
	public void setWhpRecommendation(whp_sites_iucn_recommendation whpRecommendation) {
		this.whpRecommendation = whpRecommendation;
	}
	public recommendation_type_lkp getRecommendationType() {
		return recommendationType;
	}
	public void setRecommendationType(recommendation_type_lkp recommendationType) {
		this.recommendationType = recommendationType;
	}
	
}
