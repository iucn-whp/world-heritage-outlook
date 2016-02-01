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
 * This class is a wrapper for {@link threat_summary_current}.
 * </p>
 *
 * @author    alok.sen
 * @see       threat_summary_current
 * @generated
 */
public class threat_summary_currentWrapper implements threat_summary_current,
	ModelWrapper<threat_summary_current> {
	public threat_summary_currentWrapper(
		threat_summary_current threat_summary_current) {
		_threat_summary_current = threat_summary_current;
	}

	public Class<?> getModelClass() {
		return threat_summary_current.class;
	}

	public String getModelClassName() {
		return threat_summary_current.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("threat_sum_cur_id", getThreat_sum_cur_id());
		attributes.put("assessment_version_id", getAssessment_version_id());
		attributes.put("overall_current", getOverall_current());
		attributes.put("threat_rating", getThreat_rating());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long threat_sum_cur_id = (Long)attributes.get("threat_sum_cur_id");

		if (threat_sum_cur_id != null) {
			setThreat_sum_cur_id(threat_sum_cur_id);
		}

		Long assessment_version_id = (Long)attributes.get(
				"assessment_version_id");

		if (assessment_version_id != null) {
			setAssessment_version_id(assessment_version_id);
		}

		String overall_current = (String)attributes.get("overall_current");

		if (overall_current != null) {
			setOverall_current(overall_current);
		}

		Long threat_rating = (Long)attributes.get("threat_rating");

		if (threat_rating != null) {
			setThreat_rating(threat_rating);
		}
	}

	/**
	* Returns the primary key of this threat_summary_current.
	*
	* @return the primary key of this threat_summary_current
	*/
	public long getPrimaryKey() {
		return _threat_summary_current.getPrimaryKey();
	}

	/**
	* Sets the primary key of this threat_summary_current.
	*
	* @param primaryKey the primary key of this threat_summary_current
	*/
	public void setPrimaryKey(long primaryKey) {
		_threat_summary_current.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the threat_sum_cur_id of this threat_summary_current.
	*
	* @return the threat_sum_cur_id of this threat_summary_current
	*/
	public long getThreat_sum_cur_id() {
		return _threat_summary_current.getThreat_sum_cur_id();
	}

	/**
	* Sets the threat_sum_cur_id of this threat_summary_current.
	*
	* @param threat_sum_cur_id the threat_sum_cur_id of this threat_summary_current
	*/
	public void setThreat_sum_cur_id(long threat_sum_cur_id) {
		_threat_summary_current.setThreat_sum_cur_id(threat_sum_cur_id);
	}

	/**
	* Returns the assessment_version_id of this threat_summary_current.
	*
	* @return the assessment_version_id of this threat_summary_current
	*/
	public long getAssessment_version_id() {
		return _threat_summary_current.getAssessment_version_id();
	}

	/**
	* Sets the assessment_version_id of this threat_summary_current.
	*
	* @param assessment_version_id the assessment_version_id of this threat_summary_current
	*/
	public void setAssessment_version_id(long assessment_version_id) {
		_threat_summary_current.setAssessment_version_id(assessment_version_id);
	}

	/**
	* Returns the overall_current of this threat_summary_current.
	*
	* @return the overall_current of this threat_summary_current
	*/
	public java.lang.String getOverall_current() {
		return _threat_summary_current.getOverall_current();
	}

	/**
	* Sets the overall_current of this threat_summary_current.
	*
	* @param overall_current the overall_current of this threat_summary_current
	*/
	public void setOverall_current(java.lang.String overall_current) {
		_threat_summary_current.setOverall_current(overall_current);
	}

	/**
	* Returns the threat_rating of this threat_summary_current.
	*
	* @return the threat_rating of this threat_summary_current
	*/
	public long getThreat_rating() {
		return _threat_summary_current.getThreat_rating();
	}

	/**
	* Sets the threat_rating of this threat_summary_current.
	*
	* @param threat_rating the threat_rating of this threat_summary_current
	*/
	public void setThreat_rating(long threat_rating) {
		_threat_summary_current.setThreat_rating(threat_rating);
	}

	public boolean isNew() {
		return _threat_summary_current.isNew();
	}

	public void setNew(boolean n) {
		_threat_summary_current.setNew(n);
	}

	public boolean isCachedModel() {
		return _threat_summary_current.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_threat_summary_current.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _threat_summary_current.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _threat_summary_current.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_threat_summary_current.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _threat_summary_current.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_threat_summary_current.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new threat_summary_currentWrapper((threat_summary_current)_threat_summary_current.clone());
	}

	public int compareTo(
		com.iucn.whp.dbservice.model.threat_summary_current threat_summary_current) {
		return _threat_summary_current.compareTo(threat_summary_current);
	}

	@Override
	public int hashCode() {
		return _threat_summary_current.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.iucn.whp.dbservice.model.threat_summary_current> toCacheModel() {
		return _threat_summary_current.toCacheModel();
	}

	public com.iucn.whp.dbservice.model.threat_summary_current toEscapedModel() {
		return new threat_summary_currentWrapper(_threat_summary_current.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _threat_summary_current.toString();
	}

	public java.lang.String toXmlString() {
		return _threat_summary_current.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_threat_summary_current.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public threat_summary_current getWrappedthreat_summary_current() {
		return _threat_summary_current;
	}

	public threat_summary_current getWrappedModel() {
		return _threat_summary_current;
	}

	public void resetOriginalValues() {
		_threat_summary_current.resetOriginalValues();
	}

	private threat_summary_current _threat_summary_current;
}