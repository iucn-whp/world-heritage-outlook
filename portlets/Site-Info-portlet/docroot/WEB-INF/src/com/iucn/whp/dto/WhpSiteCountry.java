package com.iucn.whp.dto;

import java.io.Serializable;

import com.iucn.whp.dbservice.model.country_lkp;
import com.iucn.whp.dbservice.model.whp_sites_country;

public class WhpSiteCountry implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private whp_sites_country countryList;
	private country_lkp countryName;
	public void setCountryList(whp_sites_country countryList) {
		this.countryList = countryList;
	}
	public whp_sites_country getCountryList() {
		return countryList;
	}
	public void setCountryName(country_lkp countryName) {
		this.countryName = countryName;
	}
	public country_lkp getCountryName() {
		return countryName;
	}

}
