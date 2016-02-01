/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.iucn.whp.dbservice.model;

import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link assessing_threats_potential}.
 * </p>
 *
 * @author    alok.sen
 * @see       assessing_threats_potential
 * @generated
 */
public class assessing_threats_potentialWrapper
	implements assessing_threats_potential,
		ModelWrapper<assessing_threats_potential> {
	public assessing_threats_potentialWrapper(
		assessing_threats_potential assessing_threats_potential) {
		_assessing_threats_potential = assessing_threats_potential;
	}

	public Class<?> getModelClass() {
		return assessing_threats_potential.class;
	}

	public String getModelClassName() {
		return assessing_threats_potential.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("potential_threat_id", getPotential_threat_id());
		attributes.put("assessment_version_id", getAssessment_version_id());
		attributes.put("potential_threat", getPotential_threat());
		attributes.put("justification", getJustification());
		attributes.put("threat_rating", getThreat_rating());
		attributes.put("inside_site", getInside_site());
		attributes.put("outside_site", getOutside_site());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long potential_threat_id = (Long)attributes.get("potential_threat_id");

		if (potential_threat_id != null) {
			setPotential_threat_id(potential_threat_id);
		}

		Long assessment_version_id = (Long)attributes.get(
				"assessment_version_id");

		if (assessment_version_id != null) {
			setAssessment_version_id(assessment_version_id);
		}

		String potential_threat = (String)attributes.get("potential_threat");

		if (potential_threat != null) {
			setPotential_threat(potential_threat);
		}

		String justification = (String)attributes.get("justification");

		if (justification != null) {
			setJustification(justification);
		}

		Long threat_rating = (Long)attributes.get("threat_rating");

		if (threat_rating != null) {
			setThreat_rating(threat_rating);
		}

		Boolean inside_site = (Boolean)attributes.get("inside_site");

		if (inside_site != null) {
			setInside_site(inside_site);
		}

		Boolean outside_site = (Boolean)attributes.get("outside_site");

		if (outside_site != null) {
			setOutside_site(outside_site);
		}
	}

	/**
	* Returns the primary key of this assessing_threats_potential.
	*
	* @return the primary key of this assessing_threats_potential
	*/
	public long getPrimaryKey() {
		return _assessing_threats_potential.getPrimaryKey();
	}

	/**
	* Sets the primary key of this assessing_threats_potential.
	*
	* @param primaryKey the primary key of this assessing_threats_potential
	*/
	public void setPrimaryKey(long primaryKey) {
		_assessing_threats_potential.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the potential_threat_id of this assessing_threats_potential.
	*
	* @return the potential_threat_id of this assessing_threats_potential
	*/
	public long getPotential_threat_id() {
		return _assessing_threats_potential.getPotential_threat_id();
	}

	/**
	* Sets the potential_threat_id of this assessing_threats_potential.
	*
	* @param potential_threat_id the potential_threat_id of this assessing_threats_potential
	*/
	public void setPotential_threat_id(long potential_threat_id) {
		_assessing_threats_potential.setPotential_threat_id(potential_threat_id);
	}

	/**
	* Returns the assessment_version_id of this assessing_threats_potential.
	*
	* @return the assessment_version_id of this assessing_threats_potential
	*/
	public long getAssessment_version_id() {
		return _assessing_threats_potential.getAssessment_version_id();
	}

	/**
	* Sets the assessment_version_id of this assessing_threats_potential.
	*
	* @param assessment_version_id the assessment_version_id of this assessing_threats_potential
	*/
	public void setAssessment_version_id(long assessment_version_id) {
		_assessing_threats_potential.setAssessment_version_id(assessment_version_id);
	}

	/**
	* Returns the potential_threat of this assessing_threats_potential.
	*
	* @return the potential_threat of this assessing_threats_potential
	*/
	public java.lang.String getPotential_threat() {
		return _assessing_threats_potential.getPotential_threat();
	}

	/**
	* Sets the potential_threat of this assessing_threats_potential.
	*
	* @param potential_threat the potential_threat of this assessing_threats_potential
	*/
	public void setPotential_threat(java.lang.String potential_threat) {
		_assessing_threats_potential.setPotential_threat(potential_threat);
	}

	/**
	* Returns the justification of this assessing_threats_potential.
	*
	* @return the justification of this assessing_threats_potential
	*/
	public java.lang.String getJustification() {
		return _assessing_threats_potential.getJustification();
	}

	/**
	* Sets the justification of this assessing_threats_potential.
	*
	* @param justification the justification of this assessing_threats_potential
	*/
	public void setJustification(java.lang.String justification) {
		_assessing_threats_potential.setJustification(justification);
	}

	/**
	* Returns the threat_rating of this assessing_threats_potential.
	*
	* @return the threat_rating of this assessing_threats_potential
	*/
	public long getThreat_rating() {
		return _assessing_threats_potential.getThreat_rating();
	}

	/**
	* Sets the threat_rating of this assessing_threats_potential.
	*
	* @param threat_rating the threat_rating of this assessing_threats_potential
	*/
	public void setThreat_rating(long threat_rating) {
		_assessing_threats_potential.setThreat_rating(threat_rating);
	}

	/**
	* Returns the inside_site of this assessing_threats_potential.
	*
	* @return the inside_site of this assessing_threats_potential
	*/
	public boolean getInside_site() {
		return _assessing_threats_potential.getInside_site();
	}

	/**
	* Returns <code>true</code> if this assessing_threats_potential is inside_site.
	*
	* @return <code>true</code> if this assessing_threats_potential is inside_site; <code>false</code> otherwise
	*/
	public boolean isInside_site() {
		return _assessing_threats_potential.isInside_site();
	}

	/**
	* Sets whether this assessing_threats_potential is inside_site.
	*
	* @param inside_site the inside_site of this assessing_threats_potential
	*/
	public void setInside_site(boolean inside_site) {
		_assessing_threats_potential.setInside_site(inside_site);
	}

	/**
	* Returns the outside_site of this assessing_threats_potential.
	*
	* @return the outside_site of this assessing_threats_potential
	*/
	public boolean getOutside_site() {
		return _assessing_threats_potential.getOutside_site();
	}

	/**
	* Returns <code>true</code> if this assessing_threats_potential is outside_site.
	*
	* @return <code>true</code> if this assessing_threats_potential is outside_site; <code>false</code> otherwise
	*/
	public boolean isOutside_site() {
		return _assessing_threats_potential.isOutside_site();
	}

	/**
	* Sets whether this assessing_threats_potential is outside_site.
	*
	* @param outside_site the outside_site of this assessing_threats_potential
	*/
	public void setOutside_site(boolean outside_site) {
		_assessing_threats_potential.setOutside_site(outside_site);
	}

	public boolean isNew() {
		return _assessing_threats_potential.isNew();
	}

	public void setNew(boolean n) {
		_assessing_threats_potential.setNew(n);
	}

	public boolean isCachedModel() {
		return _assessing_threats_potential.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_assessing_threats_potential.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _assessing_threats_potential.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _assessing_threats_potential.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_assessing_threats_potential.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _assessing_threats_potential.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_assessing_threats_potential.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new assessing_threats_potentialWrapper((assessing_threats_potential)_assessing_threats_potential.clone());
	}

	public int compareTo(
		com.iucn.whp.dbservice.model.assessing_threats_potential assessing_threats_potential) {
		return _assessing_threats_potential.compareTo(assessing_threats_potential);
	}

	@Override
	public int hashCode() {
		return _assessing_threats_potential.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.iucn.whp.dbservice.model.assessing_threats_potential> toCacheModel() {
		return _assessing_threats_potential.toCacheModel();
	}

	public com.iucn.whp.dbservice.model.assessing_threats_potential toEscapedModel() {
		return new assessing_threats_potentialWrapper(_assessing_threats_potential.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _assessing_threats_potential.toString();
	}

	public java.lang.String toXmlString() {
		return _assessing_threats_potential.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_assessing_threats_potential.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public assessing_threats_potential getWrappedassessing_threats_potential() {
		return _assessing_threats_potential;
	}

	public assessing_threats_potential getWrappedModel() {
		return _assessing_threats_potential;
	}

	public void resetOriginalValues() {
		_assessing_threats_potential.resetOriginalValues();
	}

	private assessing_threats_potential _assessing_threats_potential;
}