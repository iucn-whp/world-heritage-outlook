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
 * This class is a wrapper for {@link prot_mgmt_overall}.
 * </p>
 *
 * @author    alok.sen
 * @see       prot_mgmt_overall
 * @generated
 */
public class prot_mgmt_overallWrapper implements prot_mgmt_overall,
	ModelWrapper<prot_mgmt_overall> {
	public prot_mgmt_overallWrapper(prot_mgmt_overall prot_mgmt_overall) {
		_prot_mgmt_overall = prot_mgmt_overall;
	}

	public Class<?> getModelClass() {
		return prot_mgmt_overall.class;
	}

	public String getModelClassName() {
		return prot_mgmt_overall.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("pmo_id", getPmo_id());
		attributes.put("assessment_version_id", getAssessment_version_id());
		attributes.put("justification", getJustification());
		attributes.put("rating", getRating());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long pmo_id = (Long)attributes.get("pmo_id");

		if (pmo_id != null) {
			setPmo_id(pmo_id);
		}

		Long assessment_version_id = (Long)attributes.get(
				"assessment_version_id");

		if (assessment_version_id != null) {
			setAssessment_version_id(assessment_version_id);
		}

		String justification = (String)attributes.get("justification");

		if (justification != null) {
			setJustification(justification);
		}

		Long rating = (Long)attributes.get("rating");

		if (rating != null) {
			setRating(rating);
		}
	}

	/**
	* Returns the primary key of this prot_mgmt_overall.
	*
	* @return the primary key of this prot_mgmt_overall
	*/
	public long getPrimaryKey() {
		return _prot_mgmt_overall.getPrimaryKey();
	}

	/**
	* Sets the primary key of this prot_mgmt_overall.
	*
	* @param primaryKey the primary key of this prot_mgmt_overall
	*/
	public void setPrimaryKey(long primaryKey) {
		_prot_mgmt_overall.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the pmo_id of this prot_mgmt_overall.
	*
	* @return the pmo_id of this prot_mgmt_overall
	*/
	public long getPmo_id() {
		return _prot_mgmt_overall.getPmo_id();
	}

	/**
	* Sets the pmo_id of this prot_mgmt_overall.
	*
	* @param pmo_id the pmo_id of this prot_mgmt_overall
	*/
	public void setPmo_id(long pmo_id) {
		_prot_mgmt_overall.setPmo_id(pmo_id);
	}

	/**
	* Returns the assessment_version_id of this prot_mgmt_overall.
	*
	* @return the assessment_version_id of this prot_mgmt_overall
	*/
	public long getAssessment_version_id() {
		return _prot_mgmt_overall.getAssessment_version_id();
	}

	/**
	* Sets the assessment_version_id of this prot_mgmt_overall.
	*
	* @param assessment_version_id the assessment_version_id of this prot_mgmt_overall
	*/
	public void setAssessment_version_id(long assessment_version_id) {
		_prot_mgmt_overall.setAssessment_version_id(assessment_version_id);
	}

	/**
	* Returns the justification of this prot_mgmt_overall.
	*
	* @return the justification of this prot_mgmt_overall
	*/
	public java.lang.String getJustification() {
		return _prot_mgmt_overall.getJustification();
	}

	/**
	* Sets the justification of this prot_mgmt_overall.
	*
	* @param justification the justification of this prot_mgmt_overall
	*/
	public void setJustification(java.lang.String justification) {
		_prot_mgmt_overall.setJustification(justification);
	}

	/**
	* Returns the rating of this prot_mgmt_overall.
	*
	* @return the rating of this prot_mgmt_overall
	*/
	public long getRating() {
		return _prot_mgmt_overall.getRating();
	}

	/**
	* Sets the rating of this prot_mgmt_overall.
	*
	* @param rating the rating of this prot_mgmt_overall
	*/
	public void setRating(long rating) {
		_prot_mgmt_overall.setRating(rating);
	}

	public boolean isNew() {
		return _prot_mgmt_overall.isNew();
	}

	public void setNew(boolean n) {
		_prot_mgmt_overall.setNew(n);
	}

	public boolean isCachedModel() {
		return _prot_mgmt_overall.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_prot_mgmt_overall.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _prot_mgmt_overall.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _prot_mgmt_overall.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_prot_mgmt_overall.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _prot_mgmt_overall.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_prot_mgmt_overall.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new prot_mgmt_overallWrapper((prot_mgmt_overall)_prot_mgmt_overall.clone());
	}

	public int compareTo(
		com.iucn.whp.dbservice.model.prot_mgmt_overall prot_mgmt_overall) {
		return _prot_mgmt_overall.compareTo(prot_mgmt_overall);
	}

	@Override
	public int hashCode() {
		return _prot_mgmt_overall.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.iucn.whp.dbservice.model.prot_mgmt_overall> toCacheModel() {
		return _prot_mgmt_overall.toCacheModel();
	}

	public com.iucn.whp.dbservice.model.prot_mgmt_overall toEscapedModel() {
		return new prot_mgmt_overallWrapper(_prot_mgmt_overall.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _prot_mgmt_overall.toString();
	}

	public java.lang.String toXmlString() {
		return _prot_mgmt_overall.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_prot_mgmt_overall.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public prot_mgmt_overall getWrappedprot_mgmt_overall() {
		return _prot_mgmt_overall;
	}

	public prot_mgmt_overall getWrappedModel() {
		return _prot_mgmt_overall;
	}

	public void resetOriginalValues() {
		_prot_mgmt_overall.resetOriginalValues();
	}

	private prot_mgmt_overall _prot_mgmt_overall;
}