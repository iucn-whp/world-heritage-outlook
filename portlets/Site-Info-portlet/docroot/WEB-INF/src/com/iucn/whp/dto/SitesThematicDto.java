package com.iucn.whp.dto;

import java.io.Serializable;

import com.iucn.whp.dbservice.model.sites_thematic;
import com.iucn.whp.dbservice.model.thematic_lkp;

public class SitesThematicDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private sites_thematic other_thematic;
	private thematic_lkp other_thematic_Type;
	
	public sites_thematic getOther_thematic() {
		return other_thematic;
	}
	public void setOther_thematic(sites_thematic other_thematic) {
		this.other_thematic = other_thematic;
	}
	public thematic_lkp getOther_thematic_Type() {
		return other_thematic_Type;
	}
	public void setOther_thematic_Type(thematic_lkp other_thematic_Type) {
		this.other_thematic_Type = other_thematic_Type;
	}
	
	
	
	

}
