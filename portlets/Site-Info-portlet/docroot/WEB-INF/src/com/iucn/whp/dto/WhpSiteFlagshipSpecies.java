package com.iucn.whp.dto;

import java.io.Serializable;

import com.iucn.whp.dbservice.model.flagship_species_lkp;
import com.iucn.whp.dbservice.model.whp_sites_flagship_species;

public class WhpSiteFlagshipSpecies implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private whp_sites_flagship_species flagship_species;
	private flagship_species_lkp  flagship_speciesType;
	/**
	 * @return the flagship_species
	 */
	public whp_sites_flagship_species getFlagship_species() {
		return flagship_species;
	}
	/**
	 * @param flagship_species the flagship_species to set
	 */
	public void setFlagship_species(whp_sites_flagship_species flagship_species) {
		this.flagship_species = flagship_species;
	}
	/**
	 * @return the flagship_speciesType
	 */
	public flagship_species_lkp getFlagship_speciesType() {
		return flagship_speciesType;
	}
	/**
	 * @param flagship_speciesType the flagship_speciesType to set
	 */
	public void setFlagship_speciesType(flagship_species_lkp flagship_speciesType) {
		this.flagship_speciesType = flagship_speciesType;
	}
}
