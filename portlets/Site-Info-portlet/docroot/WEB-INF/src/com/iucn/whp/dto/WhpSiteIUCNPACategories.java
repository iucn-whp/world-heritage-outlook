package com.iucn.whp.dto;

import java.io.Serializable;

import com.iucn.whp.dbservice.model.flagship_species_lkp;
import com.iucn.whp.dbservice.model.iucn_pa_lkp_category;
import com.iucn.whp.dbservice.model.whp_sites_flagship_species;
import com.iucn.whp.dbservice.model.whp_sites_iucn_pa_category;

public class WhpSiteIUCNPACategories implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private whp_sites_iucn_pa_category iucn_pa_categories;
	private iucn_pa_lkp_category  iucn_pa_categoryType;
	
	
	public void setIucn_pa_categories(whp_sites_iucn_pa_category iucn_pa_categories) {
		this.iucn_pa_categories = iucn_pa_categories;
	}
	public whp_sites_iucn_pa_category getIucn_pa_categories() {
		return iucn_pa_categories;
	}
	public void setIucn_pa_categoryType(iucn_pa_lkp_category iucn_pa_categoryType) {
		this.iucn_pa_categoryType = iucn_pa_categoryType;
	}
	public iucn_pa_lkp_category getIucn_pa_categoryType() {
		return iucn_pa_categoryType;
	}
	
	
	
	
	
}