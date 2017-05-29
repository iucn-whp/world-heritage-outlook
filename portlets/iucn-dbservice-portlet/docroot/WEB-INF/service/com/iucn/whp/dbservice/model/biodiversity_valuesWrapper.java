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
 * This class is a wrapper for {@link biodiversity_values}.
 * </p>
 *
 * @author    alok.sen
 * @see       biodiversity_values
 * @generated
 */
public class biodiversity_valuesWrapper implements biodiversity_values,
	ModelWrapper<biodiversity_values> {
	public biodiversity_valuesWrapper(biodiversity_values biodiversity_values) {
		_biodiversity_values = biodiversity_values;
	}

	public Class<?> getModelClass() {
		return biodiversity_values.class;
	}

	public String getModelClassName() {
		return biodiversity_values.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("vn", getVn());
		attributes.put("assessment_version_id", getAssessment_version_id());
		attributes.put("value", getValue());
		attributes.put("description", getDescription());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long vn = (Long)attributes.get("vn");

		if (vn != null) {
			setVn(vn);
		}

		Long assessment_version_id = (Long)attributes.get(
				"assessment_version_id");

		if (assessment_version_id != null) {
			setAssessment_version_id(assessment_version_id);
		}

		String value = (String)attributes.get("value");

		if (value != null) {
			setValue(value);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}
	}

	/**
	* Returns the primary key of this biodiversity_values.
	*
	* @return the primary key of this biodiversity_values
	*/
	public long getPrimaryKey() {
		return _biodiversity_values.getPrimaryKey();
	}

	/**
	* Sets the primary key of this biodiversity_values.
	*
	* @param primaryKey the primary key of this biodiversity_values
	*/
	public void setPrimaryKey(long primaryKey) {
		_biodiversity_values.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this biodiversity_values.
	*
	* @return the ID of this biodiversity_values
	*/
	public long getId() {
		return _biodiversity_values.getId();
	}

	/**
	* Sets the ID of this biodiversity_values.
	*
	* @param id the ID of this biodiversity_values
	*/
	public void setId(long id) {
		_biodiversity_values.setId(id);
	}

	/**
	* Returns the vn of this biodiversity_values.
	*
	* @return the vn of this biodiversity_values
	*/
	public long getVn() {
		return _biodiversity_values.getVn();
	}

	/**
	* Sets the vn of this biodiversity_values.
	*
	* @param vn the vn of this biodiversity_values
	*/
	public void setVn(long vn) {
		_biodiversity_values.setVn(vn);
	}

	/**
	* Returns the assessment_version_id of this biodiversity_values.
	*
	* @return the assessment_version_id of this biodiversity_values
	*/
	public long getAssessment_version_id() {
		return _biodiversity_values.getAssessment_version_id();
	}

	/**
	* Sets the assessment_version_id of this biodiversity_values.
	*
	* @param assessment_version_id the assessment_version_id of this biodiversity_values
	*/
	public void setAssessment_version_id(long assessment_version_id) {
		_biodiversity_values.setAssessment_version_id(assessment_version_id);
	}

	/**
	* Returns the value of this biodiversity_values.
	*
	* @return the value of this biodiversity_values
	*/
	public java.lang.String getValue() {
		return _biodiversity_values.getValue();
	}

	/**
	* Sets the value of this biodiversity_values.
	*
	* @param value the value of this biodiversity_values
	*/
	public void setValue(java.lang.String value) {
		_biodiversity_values.setValue(value);
	}

	/**
	* Returns the description of this biodiversity_values.
	*
	* @return the description of this biodiversity_values
	*/
	public java.lang.String getDescription() {
		return _biodiversity_values.getDescription();
	}

	/**
	* Sets the description of this biodiversity_values.
	*
	* @param description the description of this biodiversity_values
	*/
	public void setDescription(java.lang.String description) {
		_biodiversity_values.setDescription(description);
	}

	public boolean isNew() {
		return _biodiversity_values.isNew();
	}

	public void setNew(boolean n) {
		_biodiversity_values.setNew(n);
	}

	public boolean isCachedModel() {
		return _biodiversity_values.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_biodiversity_values.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _biodiversity_values.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _biodiversity_values.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_biodiversity_values.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _biodiversity_values.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_biodiversity_values.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new biodiversity_valuesWrapper((biodiversity_values)_biodiversity_values.clone());
	}

	public int compareTo(
		com.iucn.whp.dbservice.model.biodiversity_values biodiversity_values) {
		return _biodiversity_values.compareTo(biodiversity_values);
	}

	@Override
	public int hashCode() {
		return _biodiversity_values.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.iucn.whp.dbservice.model.biodiversity_values> toCacheModel() {
		return _biodiversity_values.toCacheModel();
	}

	public com.iucn.whp.dbservice.model.biodiversity_values toEscapedModel() {
		return new biodiversity_valuesWrapper(_biodiversity_values.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _biodiversity_values.toString();
	}

	public java.lang.String toXmlString() {
		return _biodiversity_values.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_biodiversity_values.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public biodiversity_values getWrappedbiodiversity_values() {
		return _biodiversity_values;
	}

	public biodiversity_values getWrappedModel() {
		return _biodiversity_values;
	}

	public void resetOriginalValues() {
		_biodiversity_values.resetOriginalValues();
	}

	private biodiversity_values _biodiversity_values;
}