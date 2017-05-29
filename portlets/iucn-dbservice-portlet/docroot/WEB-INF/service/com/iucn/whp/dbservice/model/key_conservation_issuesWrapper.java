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
 * This class is a wrapper for {@link key_conservation_issues}.
 * </p>
 *
 * @author    alok.sen
 * @see       key_conservation_issues
 * @generated
 */
public class key_conservation_issuesWrapper implements key_conservation_issues,
	ModelWrapper<key_conservation_issues> {
	public key_conservation_issuesWrapper(
		key_conservation_issues key_conservation_issues) {
		_key_conservation_issues = key_conservation_issues;
	}

	public Class<?> getModelClass() {
		return key_conservation_issues.class;
	}

	public String getModelClassName() {
		return key_conservation_issues.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("key_conservation_issues_id",
			getKey_conservation_issues_id());
		attributes.put("assessment_version_id", getAssessment_version_id());
		attributes.put("cn", getCn());
		attributes.put("key_conservation_issues", getKey_conservation_issues());
		attributes.put("description", getDescription());
		attributes.put("scale", getScale());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long key_conservation_issues_id = (Long)attributes.get(
				"key_conservation_issues_id");

		if (key_conservation_issues_id != null) {
			setKey_conservation_issues_id(key_conservation_issues_id);
		}

		Long assessment_version_id = (Long)attributes.get(
				"assessment_version_id");

		if (assessment_version_id != null) {
			setAssessment_version_id(assessment_version_id);
		}

		String cn = (String)attributes.get("cn");

		if (cn != null) {
			setCn(cn);
		}

		String key_conservation_issues = (String)attributes.get(
				"key_conservation_issues");

		if (key_conservation_issues != null) {
			setKey_conservation_issues(key_conservation_issues);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Long scale = (Long)attributes.get("scale");

		if (scale != null) {
			setScale(scale);
		}
	}

	/**
	* Returns the primary key of this key_conservation_issues.
	*
	* @return the primary key of this key_conservation_issues
	*/
	public long getPrimaryKey() {
		return _key_conservation_issues.getPrimaryKey();
	}

	/**
	* Sets the primary key of this key_conservation_issues.
	*
	* @param primaryKey the primary key of this key_conservation_issues
	*/
	public void setPrimaryKey(long primaryKey) {
		_key_conservation_issues.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the key_conservation_issues_id of this key_conservation_issues.
	*
	* @return the key_conservation_issues_id of this key_conservation_issues
	*/
	public long getKey_conservation_issues_id() {
		return _key_conservation_issues.getKey_conservation_issues_id();
	}

	/**
	* Sets the key_conservation_issues_id of this key_conservation_issues.
	*
	* @param key_conservation_issues_id the key_conservation_issues_id of this key_conservation_issues
	*/
	public void setKey_conservation_issues_id(long key_conservation_issues_id) {
		_key_conservation_issues.setKey_conservation_issues_id(key_conservation_issues_id);
	}

	/**
	* Returns the assessment_version_id of this key_conservation_issues.
	*
	* @return the assessment_version_id of this key_conservation_issues
	*/
	public long getAssessment_version_id() {
		return _key_conservation_issues.getAssessment_version_id();
	}

	/**
	* Sets the assessment_version_id of this key_conservation_issues.
	*
	* @param assessment_version_id the assessment_version_id of this key_conservation_issues
	*/
	public void setAssessment_version_id(long assessment_version_id) {
		_key_conservation_issues.setAssessment_version_id(assessment_version_id);
	}

	/**
	* Returns the cn of this key_conservation_issues.
	*
	* @return the cn of this key_conservation_issues
	*/
	public java.lang.String getCn() {
		return _key_conservation_issues.getCn();
	}

	/**
	* Sets the cn of this key_conservation_issues.
	*
	* @param cn the cn of this key_conservation_issues
	*/
	public void setCn(java.lang.String cn) {
		_key_conservation_issues.setCn(cn);
	}

	/**
	* Returns the key_conservation_issues of this key_conservation_issues.
	*
	* @return the key_conservation_issues of this key_conservation_issues
	*/
	public java.lang.String getKey_conservation_issues() {
		return _key_conservation_issues.getKey_conservation_issues();
	}

	/**
	* Sets the key_conservation_issues of this key_conservation_issues.
	*
	* @param key_conservation_issues the key_conservation_issues of this key_conservation_issues
	*/
	public void setKey_conservation_issues(
		java.lang.String key_conservation_issues) {
		_key_conservation_issues.setKey_conservation_issues(key_conservation_issues);
	}

	/**
	* Returns the description of this key_conservation_issues.
	*
	* @return the description of this key_conservation_issues
	*/
	public java.lang.String getDescription() {
		return _key_conservation_issues.getDescription();
	}

	/**
	* Sets the description of this key_conservation_issues.
	*
	* @param description the description of this key_conservation_issues
	*/
	public void setDescription(java.lang.String description) {
		_key_conservation_issues.setDescription(description);
	}

	/**
	* Returns the scale of this key_conservation_issues.
	*
	* @return the scale of this key_conservation_issues
	*/
	public long getScale() {
		return _key_conservation_issues.getScale();
	}

	/**
	* Sets the scale of this key_conservation_issues.
	*
	* @param scale the scale of this key_conservation_issues
	*/
	public void setScale(long scale) {
		_key_conservation_issues.setScale(scale);
	}

	public boolean isNew() {
		return _key_conservation_issues.isNew();
	}

	public void setNew(boolean n) {
		_key_conservation_issues.setNew(n);
	}

	public boolean isCachedModel() {
		return _key_conservation_issues.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_key_conservation_issues.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _key_conservation_issues.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _key_conservation_issues.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_key_conservation_issues.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _key_conservation_issues.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_key_conservation_issues.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new key_conservation_issuesWrapper((key_conservation_issues)_key_conservation_issues.clone());
	}

	public int compareTo(
		com.iucn.whp.dbservice.model.key_conservation_issues key_conservation_issues) {
		return _key_conservation_issues.compareTo(key_conservation_issues);
	}

	@Override
	public int hashCode() {
		return _key_conservation_issues.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.iucn.whp.dbservice.model.key_conservation_issues> toCacheModel() {
		return _key_conservation_issues.toCacheModel();
	}

	public com.iucn.whp.dbservice.model.key_conservation_issues toEscapedModel() {
		return new key_conservation_issuesWrapper(_key_conservation_issues.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _key_conservation_issues.toString();
	}

	public java.lang.String toXmlString() {
		return _key_conservation_issues.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_key_conservation_issues.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public key_conservation_issues getWrappedkey_conservation_issues() {
		return _key_conservation_issues;
	}

	public key_conservation_issues getWrappedModel() {
		return _key_conservation_issues;
	}

	public void resetOriginalValues() {
		_key_conservation_issues.resetOriginalValues();
	}

	private key_conservation_issues _key_conservation_issues;
}