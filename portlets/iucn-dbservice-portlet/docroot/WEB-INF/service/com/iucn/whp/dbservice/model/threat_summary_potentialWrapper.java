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
 * This class is a wrapper for {@link threat_summary_potential}.
 * </p>
 *
 * @author    alok.sen
 * @see       threat_summary_potential
 * @generated
 */
public class threat_summary_potentialWrapper implements threat_summary_potential,
	ModelWrapper<threat_summary_potential> {
	public threat_summary_potentialWrapper(
		threat_summary_potential threat_summary_potential) {
		_threat_summary_potential = threat_summary_potential;
	}

	public Class<?> getModelClass() {
		return threat_summary_potential.class;
	}

	public String getModelClassName() {
		return threat_summary_potential.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("threat_sum_potential_id", getThreat_sum_potential_id());
		attributes.put("assessment_version_id", getAssessment_version_id());
		attributes.put("overall_potential", getOverall_potential());
		attributes.put("threat_rating", getThreat_rating());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long threat_sum_potential_id = (Long)attributes.get(
				"threat_sum_potential_id");

		if (threat_sum_potential_id != null) {
			setThreat_sum_potential_id(threat_sum_potential_id);
		}

		Long assessment_version_id = (Long)attributes.get(
				"assessment_version_id");

		if (assessment_version_id != null) {
			setAssessment_version_id(assessment_version_id);
		}

		String overall_potential = (String)attributes.get("overall_potential");

		if (overall_potential != null) {
			setOverall_potential(overall_potential);
		}

		Long threat_rating = (Long)attributes.get("threat_rating");

		if (threat_rating != null) {
			setThreat_rating(threat_rating);
		}
	}

	/**
	* Returns the primary key of this threat_summary_potential.
	*
	* @return the primary key of this threat_summary_potential
	*/
	public long getPrimaryKey() {
		return _threat_summary_potential.getPrimaryKey();
	}

	/**
	* Sets the primary key of this threat_summary_potential.
	*
	* @param primaryKey the primary key of this threat_summary_potential
	*/
	public void setPrimaryKey(long primaryKey) {
		_threat_summary_potential.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the threat_sum_potential_id of this threat_summary_potential.
	*
	* @return the threat_sum_potential_id of this threat_summary_potential
	*/
	public long getThreat_sum_potential_id() {
		return _threat_summary_potential.getThreat_sum_potential_id();
	}

	/**
	* Sets the threat_sum_potential_id of this threat_summary_potential.
	*
	* @param threat_sum_potential_id the threat_sum_potential_id of this threat_summary_potential
	*/
	public void setThreat_sum_potential_id(long threat_sum_potential_id) {
		_threat_summary_potential.setThreat_sum_potential_id(threat_sum_potential_id);
	}

	/**
	* Returns the assessment_version_id of this threat_summary_potential.
	*
	* @return the assessment_version_id of this threat_summary_potential
	*/
	public long getAssessment_version_id() {
		return _threat_summary_potential.getAssessment_version_id();
	}

	/**
	* Sets the assessment_version_id of this threat_summary_potential.
	*
	* @param assessment_version_id the assessment_version_id of this threat_summary_potential
	*/
	public void setAssessment_version_id(long assessment_version_id) {
		_threat_summary_potential.setAssessment_version_id(assessment_version_id);
	}

	/**
	* Returns the overall_potential of this threat_summary_potential.
	*
	* @return the overall_potential of this threat_summary_potential
	*/
	public java.lang.String getOverall_potential() {
		return _threat_summary_potential.getOverall_potential();
	}

	/**
	* Sets the overall_potential of this threat_summary_potential.
	*
	* @param overall_potential the overall_potential of this threat_summary_potential
	*/
	public void setOverall_potential(java.lang.String overall_potential) {
		_threat_summary_potential.setOverall_potential(overall_potential);
	}

	/**
	* Returns the threat_rating of this threat_summary_potential.
	*
	* @return the threat_rating of this threat_summary_potential
	*/
	public long getThreat_rating() {
		return _threat_summary_potential.getThreat_rating();
	}

	/**
	* Sets the threat_rating of this threat_summary_potential.
	*
	* @param threat_rating the threat_rating of this threat_summary_potential
	*/
	public void setThreat_rating(long threat_rating) {
		_threat_summary_potential.setThreat_rating(threat_rating);
	}

	public boolean isNew() {
		return _threat_summary_potential.isNew();
	}

	public void setNew(boolean n) {
		_threat_summary_potential.setNew(n);
	}

	public boolean isCachedModel() {
		return _threat_summary_potential.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_threat_summary_potential.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _threat_summary_potential.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _threat_summary_potential.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_threat_summary_potential.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _threat_summary_potential.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_threat_summary_potential.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new threat_summary_potentialWrapper((threat_summary_potential)_threat_summary_potential.clone());
	}

	public int compareTo(
		com.iucn.whp.dbservice.model.threat_summary_potential threat_summary_potential) {
		return _threat_summary_potential.compareTo(threat_summary_potential);
	}

	@Override
	public int hashCode() {
		return _threat_summary_potential.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.iucn.whp.dbservice.model.threat_summary_potential> toCacheModel() {
		return _threat_summary_potential.toCacheModel();
	}

	public com.iucn.whp.dbservice.model.threat_summary_potential toEscapedModel() {
		return new threat_summary_potentialWrapper(_threat_summary_potential.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _threat_summary_potential.toString();
	}

	public java.lang.String toXmlString() {
		return _threat_summary_potential.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_threat_summary_potential.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public threat_summary_potential getWrappedthreat_summary_potential() {
		return _threat_summary_potential;
	}

	public threat_summary_potential getWrappedModel() {
		return _threat_summary_potential;
	}

	public void resetOriginalValues() {
		_threat_summary_potential.resetOriginalValues();
	}

	private threat_summary_potential _threat_summary_potential;
}