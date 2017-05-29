/**
 * 
 */
package com.iucn.whp.dto;

import java.io.Serializable;

import com.iucn.whp.dbservice.model.inscription_type_lkp;
import com.iucn.whp.dbservice.model.whp_sites_inscription_date;

/**
 * @author Aparesh.Chakraborty
 *
 */
public class WhpSiteInscriptionHistoryType implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private whp_sites_inscription_date inscription_date;
	private inscription_type_lkp inscriptionType;
	/**
	 * @return the inscription_date
	 */
	public whp_sites_inscription_date getInscription_date() {
		return inscription_date;
	}
	/**
	 * @param inscription_date the inscription_date to set
	 */
	public void setInscription_date(whp_sites_inscription_date inscription_date) {
		this.inscription_date = inscription_date;
	}
	/**
	 * @return the inscriptionType
	 */
	public inscription_type_lkp getInscriptionType() {
		return inscriptionType;
	}
	/**
	 * @param inscriptionType the inscriptionType to set
	 */
	public void setInscriptionType(inscription_type_lkp inscriptionType) {
		this.inscriptionType = inscriptionType;
	}
}
