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
 * This class is a wrapper for {@link threat_summary_overall}.
 * </p>
 *
 * @author    alok.sen
 * @see       threat_summary_overall
 * @generated
 */
public class threat_summary_overallWrapper implements threat_summary_overall,
	ModelWrapper<threat_summary_overall> {
	public threat_summary_overallWrapper(
		threat_summary_overall threat_summary_overall) {
		_threat_summary_overall = threat_summary_overall;
	}

	public Class<?> getModelClass() {
		return threat_summary_overall.class;
	}

	public String getModelClassName() {
		return threat_summary_overall.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("threat_sum_overall_id", getThreat_sum_overall_id());
		attributes.put("assessment_version_id", getAssessment_version_id());
		attributes.put("overall_threat", getOverall_threat());
		attributes.put("threat_rating", getThreat_rating());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long threat_sum_overall_id = (Long)attributes.get(
				"threat_sum_overall_id");

		if (threat_sum_overall_id != null) {
			setThreat_sum_overall_id(threat_sum_overall_id);
		}

		Long assessment_version_id = (Long)attributes.get(
				"assessment_version_id");

		if (assessment_version_id != null) {
			setAssessment_version_id(assessment_version_id);
		}

		String overall_threat = (String)attributes.get("overall_threat");

		if (overall_threat != null) {
			setOverall_threat(overall_threat);
		}

		Long threat_rating = (Long)attributes.get("threat_rating");

		if (threat_rating != null) {
			setThreat_rating(threat_rating);
		}
	}

	/**
	* Returns the primary key of this threat_summary_overall.
	*
	* @return the primary key of this threat_summary_overall
	*/
	public long getPrimaryKey() {
		return _threat_summary_overall.getPrimaryKey();
	}

	/**
	* Sets the primary key of this threat_summary_overall.
	*
	* @param primaryKey the primary key of this threat_summary_overall
	*/
	public void setPrimaryKey(long primaryKey) {
		_threat_summary_overall.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the threat_sum_overall_id of this threat_summary_overall.
	*
	* @return the threat_sum_overall_id of this threat_summary_overall
	*/
	public long getThreat_sum_overall_id() {
		return _threat_summary_overall.getThreat_sum_overall_id();
	}

	/**
	* Sets the threat_sum_overall_id of this threat_summary_overall.
	*
	* @param threat_sum_overall_id the threat_sum_overall_id of this threat_summary_overall
	*/
	public void setThreat_sum_overall_id(long threat_sum_overall_id) {
		_threat_summary_overall.setThreat_sum_overall_id(threat_sum_overall_id);
	}

	/**
	* Returns the assessment_version_id of this threat_summary_overall.
	*
	* @return the assessment_version_id of this threat_summary_overall
	*/
	public long getAssessment_version_id() {
		return _threat_summary_overall.getAssessment_version_id();
	}

	/**
	* Sets the assessment_version_id of this threat_summary_overall.
	*
	* @param assessment_version_id the assessment_version_id of this threat_summary_overall
	*/
	public void setAssessment_version_id(long assessment_version_id) {
		_threat_summary_overall.setAssessment_version_id(assessment_version_id);
	}

	/**
	* Returns the overall_threat of this threat_summary_overall.
	*
	* @return the overall_threat of this threat_summary_overall
	*/
	public java.lang.String getOverall_threat() {
		return _threat_summary_overall.getOverall_threat();
	}

	/**
	* Sets the overall_threat of this threat_summary_overall.
	*
	* @param overall_threat the overall_threat of this threat_summary_overall
	*/
	public void setOverall_threat(java.lang.String overall_threat) {
		_threat_summary_overall.setOverall_threat(overall_threat);
	}

	/**
	* Returns the threat_rating of this threat_summary_overall.
	*
	* @return the threat_rating of this threat_summary_overall
	*/
	public long getThreat_rating() {
		return _threat_summary_overall.getThreat_rating();
	}

	/**
	* Sets the threat_rating of this threat_summary_overall.
	*
	* @param threat_rating the threat_rating of this threat_summary_overall
	*/
	public void setThreat_rating(long threat_rating) {
		_threat_summary_overall.setThreat_rating(threat_rating);
	}

	public boolean isNew() {
		return _threat_summary_overall.isNew();
	}

	public void setNew(boolean n) {
		_threat_summary_overall.setNew(n);
	}

	public boolean isCachedModel() {
		return _threat_summary_overall.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_threat_summary_overall.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _threat_summary_overall.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _threat_summary_overall.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_threat_summary_overall.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _threat_summary_overall.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_threat_summary_overall.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new threat_summary_overallWrapper((threat_summary_overall)_threat_summary_overall.clone());
	}

	public int compareTo(
		com.iucn.whp.dbservice.model.threat_summary_overall threat_summary_overall) {
		return _threat_summary_overall.compareTo(threat_summary_overall);
	}

	@Override
	public int hashCode() {
		return _threat_summary_overall.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.iucn.whp.dbservice.model.threat_summary_overall> toCacheModel() {
		return _threat_summary_overall.toCacheModel();
	}

	public com.iucn.whp.dbservice.model.threat_summary_overall toEscapedModel() {
		return new threat_summary_overallWrapper(_threat_summary_overall.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _threat_summary_overall.toString();
	}

	public java.lang.String toXmlString() {
		return _threat_summary_overall.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_threat_summary_overall.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public threat_summary_overall getWrappedthreat_summary_overall() {
		return _threat_summary_overall;
	}

	public threat_summary_overall getWrappedModel() {
		return _threat_summary_overall;
	}

	public void resetOriginalValues() {
		_threat_summary_overall.resetOriginalValues();
	}

	private threat_summary_overall _threat_summary_overall;
}