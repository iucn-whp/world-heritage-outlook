package com.iucn.whp.dto;

import com.iucn.whp.dbservice.model.conservation_outlook;
import com.iucn.whp.dbservice.model.conservation_outlook_rating_lkp;

public class Conservationoutlook {

	
	private conservation_outlook  conservationoutlook;
	
	
	private  conservation_outlook_rating_lkp  conservationoutlookrating;


	public void setConservationoutlook(conservation_outlook conservationoutlook) {
		this.conservationoutlook = conservationoutlook;
	}


	public conservation_outlook getConservationoutlook() {
		return conservationoutlook;
	}


	public void setConservationoutlookrating(conservation_outlook_rating_lkp conservationoutlookrating) {
		this.conservationoutlookrating = conservationoutlookrating;
	}


	public conservation_outlook_rating_lkp getConservationoutlookrating() {
		return conservationoutlookrating;
	}
	
	
	
	
	
	
	
	
	
	
	
}
