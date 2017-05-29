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
 * This class is a wrapper for {@link assessing_threats_current}.
 * </p>
 *
 * @author    alok.sen
 * @see       assessing_threats_current
 * @generated
 */
public class assessing_threats_currentWrapper
	implements assessing_threats_current,
		ModelWrapper<assessing_threats_current> {
	public assessing_threats_currentWrapper(
		assessing_threats_current assessing_threats_current) {
		_assessing_threats_current = assessing_threats_current;
	}

	public Class<?> getModelClass() {
		return assessing_threats_current.class;
	}

	public String getModelClassName() {
		return assessing_threats_current.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("current_threat_id", getCurrent_threat_id());
		attributes.put("assessment_version_id", getAssessment_version_id());
		attributes.put("current_threat", getCurrent_threat());
		attributes.put("justification", getJustification());
		attributes.put("threadExtentValue", getThreadExtentValue());
		attributes.put("inside_site", getInside_site());
		attributes.put("outside_site", getOutside_site());
		attributes.put("threat_rating_id", getThreat_rating_id());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long current_threat_id = (Long)attributes.get("current_threat_id");

		if (current_threat_id != null) {
			setCurrent_threat_id(current_threat_id);
		}

		Long assessment_version_id = (Long)attributes.get(
				"assessment_version_id");

		if (assessment_version_id != null) {
			setAssessment_version_id(assessment_version_id);
		}

		String current_threat = (String)attributes.get("current_threat");

		if (current_threat != null) {
			setCurrent_threat(current_threat);
		}

		String justification = (String)attributes.get("justification");

		if (justification != null) {
			setJustification(justification);
		}

		String threadExtentValue = (String)attributes.get("threadExtentValue");

		if (threadExtentValue != null) {
			setThreadExtentValue(threadExtentValue);
		}

		Boolean inside_site = (Boolean)attributes.get("inside_site");

		if (inside_site != null) {
			setInside_site(inside_site);
		}

		Boolean outside_site = (Boolean)attributes.get("outside_site");

		if (outside_site != null) {
			setOutside_site(outside_site);
		}

		Long threat_rating_id = (Long)attributes.get("threat_rating_id");

		if (threat_rating_id != null) {
			setThreat_rating_id(threat_rating_id);
		}
	}

	/**
	* Returns the primary key of this assessing_threats_current.
	*
	* @return the primary key of this assessing_threats_current
	*/
	public long getPrimaryKey() {
		return _assessing_threats_current.getPrimaryKey();
	}

	/**
	* Sets the primary key of this assessing_threats_current.
	*
	* @param primaryKey the primary key of this assessing_threats_current
	*/
	public void setPrimaryKey(long primaryKey) {
		_assessing_threats_current.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the current_threat_id of this assessing_threats_current.
	*
	* @return the current_threat_id of this assessing_threats_current
	*/
	public long getCurrent_threat_id() {
		return _assessing_threats_current.getCurrent_threat_id();
	}

	/**
	* Sets the current_threat_id of this assessing_threats_current.
	*
	* @param current_threat_id the current_threat_id of this assessing_threats_current
	*/
	public void setCurrent_threat_id(long current_threat_id) {
		_assessing_threats_current.setCurrent_threat_id(current_threat_id);
	}

	/**
	* Returns the assessment_version_id of this assessing_threats_current.
	*
	* @return the assessment_version_id of this assessing_threats_current
	*/
	public long getAssessment_version_id() {
		return _assessing_threats_current.getAssessment_version_id();
	}

	/**
	* Sets the assessment_version_id of this assessing_threats_current.
	*
	* @param assessment_version_id the assessment_version_id of this assessing_threats_current
	*/
	public void setAssessment_version_id(long assessment_version_id) {
		_assessing_threats_current.setAssessment_version_id(assessment_version_id);
	}

	/**
	* Returns the current_threat of this assessing_threats_current.
	*
	* @return the current_threat of this assessing_threats_current
	*/
	public java.lang.String getCurrent_threat() {
		return _assessing_threats_current.getCurrent_threat();
	}

	/**
	* Sets the current_threat of this assessing_threats_current.
	*
	* @param current_threat the current_threat of this assessing_threats_current
	*/
	public void setCurrent_threat(java.lang.String current_threat) {
		_assessing_threats_current.setCurrent_threat(current_threat);
	}

	/**
	* Returns the justification of this assessing_threats_current.
	*
	* @return the justification of this assessing_threats_current
	*/
	public java.lang.String getJustification() {
		return _assessing_threats_current.getJustification();
	}

	/**
	* Sets the justification of this assessing_threats_current.
	*
	* @param justification the justification of this assessing_threats_current
	*/
	public void setJustification(java.lang.String justification) {
		_assessing_threats_current.setJustification(justification);
	}

	/**
	* Returns the thread extent value of this assessing_threats_current.
	*
	* @return the thread extent value of this assessing_threats_current
	*/
	public java.lang.String getThreadExtentValue() {
		return _assessing_threats_current.getThreadExtentValue();
	}

	/**
	* Sets the thread extent value of this assessing_threats_current.
	*
	* @param threadExtentValue the thread extent value of this assessing_threats_current
	*/
	public void setThreadExtentValue(java.lang.String threadExtentValue) {
		_assessing_threats_current.setThreadExtentValue(threadExtentValue);
	}

	/**
	* Returns the inside_site of this assessing_threats_current.
	*
	* @return the inside_site of this assessing_threats_current
	*/
	public boolean getInside_site() {
		return _assessing_threats_current.getInside_site();
	}

	/**
	* Returns <code>true</code> if this assessing_threats_current is inside_site.
	*
	* @return <code>true</code> if this assessing_threats_current is inside_site; <code>false</code> otherwise
	*/
	public boolean isInside_site() {
		return _assessing_threats_current.isInside_site();
	}

	/**
	* Sets whether this assessing_threats_current is inside_site.
	*
	* @param inside_site the inside_site of this assessing_threats_current
	*/
	public void setInside_site(boolean inside_site) {
		_assessing_threats_current.setInside_site(inside_site);
	}

	/**
	* Returns the outside_site of this assessing_threats_current.
	*
	* @return the outside_site of this assessing_threats_current
	*/
	public boolean getOutside_site() {
		return _assessing_threats_current.getOutside_site();
	}

	/**
	* Returns <code>true</code> if this assessing_threats_current is outside_site.
	*
	* @return <code>true</code> if this assessing_threats_current is outside_site; <code>false</code> otherwise
	*/
	public boolean isOutside_site() {
		return _assessing_threats_current.isOutside_site();
	}

	/**
	* Sets whether this assessing_threats_current is outside_site.
	*
	* @param outside_site the outside_site of this assessing_threats_current
	*/
	public void setOutside_site(boolean outside_site) {
		_assessing_threats_current.setOutside_site(outside_site);
	}

	/**
	* Returns the threat_rating_id of this assessing_threats_current.
	*
	* @return the threat_rating_id of this assessing_threats_current
	*/
	public long getThreat_rating_id() {
		return _assessing_threats_current.getThreat_rating_id();
	}

	/**
	* Sets the threat_rating_id of this assessing_threats_current.
	*
	* @param threat_rating_id the threat_rating_id of this assessing_threats_current
	*/
	public void setThreat_rating_id(long threat_rating_id) {
		_assessing_threats_current.setThreat_rating_id(threat_rating_id);
	}

	public boolean isNew() {
		return _assessing_threats_current.isNew();
	}

	public void setNew(boolean n) {
		_assessing_threats_current.setNew(n);
	}

	public boolean isCachedModel() {
		return _assessing_threats_current.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_assessing_threats_current.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _assessing_threats_current.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _assessing_threats_current.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_assessing_threats_current.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _assessing_threats_current.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_assessing_threats_current.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new assessing_threats_currentWrapper((assessing_threats_current)_assessing_threats_current.clone());
	}

	public int compareTo(
		com.iucn.whp.dbservice.model.assessing_threats_current assessing_threats_current) {
		return _assessing_threats_current.compareTo(assessing_threats_current);
	}

	@Override
	public int hashCode() {
		return _assessing_threats_current.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.iucn.whp.dbservice.model.assessing_threats_current> toCacheModel() {
		return _assessing_threats_current.toCacheModel();
	}

	public com.iucn.whp.dbservice.model.assessing_threats_current toEscapedModel() {
		return new assessing_threats_currentWrapper(_assessing_threats_current.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _assessing_threats_current.toString();
	}

	public java.lang.String toXmlString() {
		return _assessing_threats_current.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_assessing_threats_current.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public assessing_threats_current getWrappedassessing_threats_current() {
		return _assessing_threats_current;
	}

	public assessing_threats_current getWrappedModel() {
		return _assessing_threats_current;
	}

	public void resetOriginalValues() {
		_assessing_threats_current.resetOriginalValues();
	}

	private assessing_threats_current _assessing_threats_current;
}