package com.iucn.whp.dto;

import java.io.Serializable;

import com.iucn.whp.dbservice.model.flagship_species_lkp;
import com.iucn.whp.dbservice.model.iucn_pa_lkp_category;
import com.iucn.whp.dbservice.model.other_designation_lkp;
import com.iucn.whp.dbservice.model.whp_sites_flagship_species;
import com.iucn.whp.dbservice.model.whp_sites_other_designations;

public class WhpSiteOtherDesignations implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private whp_sites_other_designations other_designations;
	private other_designation_lkp  other_designationType;
	
	public void setOther_designations(whp_sites_other_designations other_designations) {
		this.other_designations = other_designations;
	}
	public whp_sites_other_designations getOther_designations() {
		return other_designations;
	}
	public void setOther_designationType(other_designation_lkp other_designationType) {
		this.other_designationType = other_designationType;
	}
	public other_designation_lkp getOther_designationType() {
		return other_designationType;
	}
	
}