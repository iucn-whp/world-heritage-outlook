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
 * This class is a wrapper for {@link benefits_summary}.
 * </p>
 *
 * @author    alok.sen
 * @see       benefits_summary
 * @generated
 */
public class benefits_summaryWrapper implements benefits_summary,
	ModelWrapper<benefits_summary> {
	public benefits_summaryWrapper(benefits_summary benefits_summary) {
		_benefits_summary = benefits_summary;
	}

	public Class<?> getModelClass() {
		return benefits_summary.class;
	}

	public String getModelClassName() {
		return benefits_summary.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("benefits_summary_id", getBenefits_summary_id());
		attributes.put("assessment_version_id", getAssessment_version_id());
		attributes.put("summary", getSummary());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long benefits_summary_id = (Long)attributes.get("benefits_summary_id");

		if (benefits_summary_id != null) {
			setBenefits_summary_id(benefits_summary_id);
		}

		Long assessment_version_id = (Long)attributes.get(
				"assessment_version_id");

		if (assessment_version_id != null) {
			setAssessment_version_id(assessment_version_id);
		}

		String summary = (String)attributes.get("summary");

		if (summary != null) {
			setSummary(summary);
		}
	}

	/**
	* Returns the primary key of this benefits_summary.
	*
	* @return the primary key of this benefits_summary
	*/
	public long getPrimaryKey() {
		return _benefits_summary.getPrimaryKey();
	}

	/**
	* Sets the primary key of this benefits_summary.
	*
	* @param primaryKey the primary key of this benefits_summary
	*/
	public void setPrimaryKey(long primaryKey) {
		_benefits_summary.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the benefits_summary_id of this benefits_summary.
	*
	* @return the benefits_summary_id of this benefits_summary
	*/
	public long getBenefits_summary_id() {
		return _benefits_summary.getBenefits_summary_id();
	}

	/**
	* Sets the benefits_summary_id of this benefits_summary.
	*
	* @param benefits_summary_id the benefits_summary_id of this benefits_summary
	*/
	public void setBenefits_summary_id(long benefits_summary_id) {
		_benefits_summary.setBenefits_summary_id(benefits_summary_id);
	}

	/**
	* Returns the assessment_version_id of this benefits_summary.
	*
	* @return the assessment_version_id of this benefits_summary
	*/
	public long getAssessment_version_id() {
		return _benefits_summary.getAssessment_version_id();
	}

	/**
	* Sets the assessment_version_id of this benefits_summary.
	*
	* @param assessment_version_id the assessment_version_id of this benefits_summary
	*/
	public void setAssessment_version_id(long assessment_version_id) {
		_benefits_summary.setAssessment_version_id(assessment_version_id);
	}

	/**
	* Returns the summary of this benefits_summary.
	*
	* @return the summary of this benefits_summary
	*/
	public java.lang.String getSummary() {
		return _benefits_summary.getSummary();
	}

	/**
	* Sets the summary of this benefits_summary.
	*
	* @param summary the summary of this benefits_summary
	*/
	public void setSummary(java.lang.String summary) {
		_benefits_summary.setSummary(summary);
	}

	public boolean isNew() {
		return _benefits_summary.isNew();
	}

	public void setNew(boolean n) {
		_benefits_summary.setNew(n);
	}

	public boolean isCachedModel() {
		return _benefits_summary.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_benefits_summary.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _benefits_summary.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _benefits_summary.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_benefits_summary.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _benefits_summary.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_benefits_summary.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new benefits_summaryWrapper((benefits_summary)_benefits_summary.clone());
	}

	public int compareTo(
		com.iucn.whp.dbservice.model.benefits_summary benefits_summary) {
		return _benefits_summary.compareTo(benefits_summary);
	}

	@Override
	public int hashCode() {
		return _benefits_summary.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.iucn.whp.dbservice.model.benefits_summary> toCacheModel() {
		return _benefits_summary.toCacheModel();
	}

	public com.iucn.whp.dbservice.model.benefits_summary toEscapedModel() {
		return new benefits_summaryWrapper(_benefits_summary.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _benefits_summary.toString();
	}

	public java.lang.String toXmlString() {
		return _benefits_summary.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_benefits_summary.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public benefits_summary getWrappedbenefits_summary() {
		return _benefits_summary;
	}

	public benefits_summary getWrappedModel() {
		return _benefits_summary;
	}

	public void resetOriginalValues() {
		_benefits_summary.resetOriginalValues();
	}

	private benefits_summary _benefits_summary;
}