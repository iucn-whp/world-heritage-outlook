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
 * This class is a wrapper for {@link prot_mgmt_best_practices}.
 * </p>
 *
 * @author    alok.sen
 * @see       prot_mgmt_best_practices
 * @generated
 */
public class prot_mgmt_best_practicesWrapper implements prot_mgmt_best_practices,
	ModelWrapper<prot_mgmt_best_practices> {
	public prot_mgmt_best_practicesWrapper(
		prot_mgmt_best_practices prot_mgmt_best_practices) {
		_prot_mgmt_best_practices = prot_mgmt_best_practices;
	}

	public Class<?> getModelClass() {
		return prot_mgmt_best_practices.class;
	}

	public String getModelClassName() {
		return prot_mgmt_best_practices.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("best_practice_id", getBest_practice_id());
		attributes.put("assessment_version_id", getAssessment_version_id());
		attributes.put("description", getDescription());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long best_practice_id = (Long)attributes.get("best_practice_id");

		if (best_practice_id != null) {
			setBest_practice_id(best_practice_id);
		}

		Long assessment_version_id = (Long)attributes.get(
				"assessment_version_id");

		if (assessment_version_id != null) {
			setAssessment_version_id(assessment_version_id);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}
	}

	/**
	* Returns the primary key of this prot_mgmt_best_practices.
	*
	* @return the primary key of this prot_mgmt_best_practices
	*/
	public long getPrimaryKey() {
		return _prot_mgmt_best_practices.getPrimaryKey();
	}

	/**
	* Sets the primary key of this prot_mgmt_best_practices.
	*
	* @param primaryKey the primary key of this prot_mgmt_best_practices
	*/
	public void setPrimaryKey(long primaryKey) {
		_prot_mgmt_best_practices.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the best_practice_id of this prot_mgmt_best_practices.
	*
	* @return the best_practice_id of this prot_mgmt_best_practices
	*/
	public long getBest_practice_id() {
		return _prot_mgmt_best_practices.getBest_practice_id();
	}

	/**
	* Sets the best_practice_id of this prot_mgmt_best_practices.
	*
	* @param best_practice_id the best_practice_id of this prot_mgmt_best_practices
	*/
	public void setBest_practice_id(long best_practice_id) {
		_prot_mgmt_best_practices.setBest_practice_id(best_practice_id);
	}

	/**
	* Returns the assessment_version_id of this prot_mgmt_best_practices.
	*
	* @return the assessment_version_id of this prot_mgmt_best_practices
	*/
	public long getAssessment_version_id() {
		return _prot_mgmt_best_practices.getAssessment_version_id();
	}

	/**
	* Sets the assessment_version_id of this prot_mgmt_best_practices.
	*
	* @param assessment_version_id the assessment_version_id of this prot_mgmt_best_practices
	*/
	public void setAssessment_version_id(long assessment_version_id) {
		_prot_mgmt_best_practices.setAssessment_version_id(assessment_version_id);
	}

	/**
	* Returns the description of this prot_mgmt_best_practices.
	*
	* @return the description of this prot_mgmt_best_practices
	*/
	public java.lang.String getDescription() {
		return _prot_mgmt_best_practices.getDescription();
	}

	/**
	* Sets the description of this prot_mgmt_best_practices.
	*
	* @param description the description of this prot_mgmt_best_practices
	*/
	public void setDescription(java.lang.String description) {
		_prot_mgmt_best_practices.setDescription(description);
	}

	public boolean isNew() {
		return _prot_mgmt_best_practices.isNew();
	}

	public void setNew(boolean n) {
		_prot_mgmt_best_practices.setNew(n);
	}

	public boolean isCachedModel() {
		return _prot_mgmt_best_practices.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_prot_mgmt_best_practices.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _prot_mgmt_best_practices.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _prot_mgmt_best_practices.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_prot_mgmt_best_practices.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _prot_mgmt_best_practices.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_prot_mgmt_best_practices.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new prot_mgmt_best_practicesWrapper((prot_mgmt_best_practices)_prot_mgmt_best_practices.clone());
	}

	public int compareTo(
		com.iucn.whp.dbservice.model.prot_mgmt_best_practices prot_mgmt_best_practices) {
		return _prot_mgmt_best_practices.compareTo(prot_mgmt_best_practices);
	}

	@Override
	public int hashCode() {
		return _prot_mgmt_best_practices.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.iucn.whp.dbservice.model.prot_mgmt_best_practices> toCacheModel() {
		return _prot_mgmt_best_practices.toCacheModel();
	}

	public com.iucn.whp.dbservice.model.prot_mgmt_best_practices toEscapedModel() {
		return new prot_mgmt_best_practicesWrapper(_prot_mgmt_best_practices.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _prot_mgmt_best_practices.toString();
	}

	public java.lang.String toXmlString() {
		return _prot_mgmt_best_practices.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_prot_mgmt_best_practices.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public prot_mgmt_best_practices getWrappedprot_mgmt_best_practices() {
		return _prot_mgmt_best_practices;
	}

	public prot_mgmt_best_practices getWrappedModel() {
		return _prot_mgmt_best_practices;
	}

	public void resetOriginalValues() {
		_prot_mgmt_best_practices.resetOriginalValues();
	}

	private prot_mgmt_best_practices _prot_mgmt_best_practices;
}