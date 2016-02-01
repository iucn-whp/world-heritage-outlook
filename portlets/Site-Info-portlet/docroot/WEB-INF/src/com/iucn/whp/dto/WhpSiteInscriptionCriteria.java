package com.iucn.whp.dto;

import java.io.Serializable;

import com.iucn.whp.dbservice.model.inscription_criteria_lkp;
import com.iucn.whp.dbservice.model.whp_sites_inscription_criteria;

public class WhpSiteInscriptionCriteria implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private whp_sites_inscription_criteria inscription_criteria ;
	private inscription_criteria_lkp inscription_criteria_type;
	
	public whp_sites_inscription_criteria getInscription_criteria() {
		return inscription_criteria;
	}
	public void setInscription_criteria(
			whp_sites_inscription_criteria inscription_criteria) {
		this.inscription_criteria = inscription_criteria;
	}
	public inscription_criteria_lkp getInscription_criteria_type() {
		return inscription_criteria_type;
	}
	public void setInscription_criteria_type(
			inscription_criteria_lkp inscription_criteria_type) {
		this.inscription_criteria_type = inscription_criteria_type;
	}
	
	
}
