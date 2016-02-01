/**
 * 
 */
package com.iucn.whp.dto;

import java.io.Serializable;

import com.iucn.whp.dbservice.model.boundary_modification_type_lkp;
import com.iucn.whp.dbservice.model.whp_sites_boundary_modification;

/**
 * @author Aparesh.Chakraborty
 *
 */
public class WhpSiteBoundaryModificationType implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * @return the boundaryModification
	 */
	public whp_sites_boundary_modification getBoundaryModification() {
		return boundaryModification;
	}
	/**
	 * @param boundaryModification the boundaryModification to set
	 */
	public void setBoundaryModification(
			whp_sites_boundary_modification boundaryModification) {
		this.boundaryModification = boundaryModification;
	}
	/**
	 * @return the boundaryModificationType
	 */
	public boundary_modification_type_lkp getBoundaryModificationType() {
		return boundaryModificationType;
	}
	/**
	 * @param boundaryModificationType the boundaryModificationType to set
	 */
	public void setBoundaryModificationType(
			boundary_modification_type_lkp boundaryModificationType) {
		this.boundaryModificationType = boundaryModificationType;
	}
	private whp_sites_boundary_modification boundaryModification;
	private boundary_modification_type_lkp  boundaryModificationType;
	
}
