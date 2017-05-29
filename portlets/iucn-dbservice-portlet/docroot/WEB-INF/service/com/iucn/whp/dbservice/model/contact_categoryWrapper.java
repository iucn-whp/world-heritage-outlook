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
 * This class is a wrapper for {@link contact_category}.
 * </p>
 *
 * @author    alok.sen
 * @see       contact_category
 * @generated
 */
public class contact_categoryWrapper implements contact_category,
	ModelWrapper<contact_category> {
	public contact_categoryWrapper(contact_category contact_category) {
		_contact_category = contact_category;
	}

	public Class<?> getModelClass() {
		return contact_category.class;
	}

	public String getModelClassName() {
		return contact_category.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("contact_category_id", getContact_category_id());
		attributes.put("category_name", getCategory_name());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Integer contact_category_id = (Integer)attributes.get(
				"contact_category_id");

		if (contact_category_id != null) {
			setContact_category_id(contact_category_id);
		}

		String category_name = (String)attributes.get("category_name");

		if (category_name != null) {
			setCategory_name(category_name);
		}
	}

	/**
	* Returns the primary key of this contact_category.
	*
	* @return the primary key of this contact_category
	*/
	public int getPrimaryKey() {
		return _contact_category.getPrimaryKey();
	}

	/**
	* Sets the primary key of this contact_category.
	*
	* @param primaryKey the primary key of this contact_category
	*/
	public void setPrimaryKey(int primaryKey) {
		_contact_category.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the contact_category_id of this contact_category.
	*
	* @return the contact_category_id of this contact_category
	*/
	public int getContact_category_id() {
		return _contact_category.getContact_category_id();
	}

	/**
	* Sets the contact_category_id of this contact_category.
	*
	* @param contact_category_id the contact_category_id of this contact_category
	*/
	public void setContact_category_id(int contact_category_id) {
		_contact_category.setContact_category_id(contact_category_id);
	}

	/**
	* Returns the category_name of this contact_category.
	*
	* @return the category_name of this contact_category
	*/
	public java.lang.String getCategory_name() {
		return _contact_category.getCategory_name();
	}

	/**
	* Sets the category_name of this contact_category.
	*
	* @param category_name the category_name of this contact_category
	*/
	public void setCategory_name(java.lang.String category_name) {
		_contact_category.setCategory_name(category_name);
	}

	public boolean isNew() {
		return _contact_category.isNew();
	}

	public void setNew(boolean n) {
		_contact_category.setNew(n);
	}

	public boolean isCachedModel() {
		return _contact_category.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_contact_category.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _contact_category.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _contact_category.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_contact_category.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _contact_category.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_contact_category.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new contact_categoryWrapper((contact_category)_contact_category.clone());
	}

	public int compareTo(
		com.iucn.whp.dbservice.model.contact_category contact_category) {
		return _contact_category.compareTo(contact_category);
	}

	@Override
	public int hashCode() {
		return _contact_category.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.iucn.whp.dbservice.model.contact_category> toCacheModel() {
		return _contact_category.toCacheModel();
	}

	public com.iucn.whp.dbservice.model.contact_category toEscapedModel() {
		return new contact_categoryWrapper(_contact_category.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _contact_category.toString();
	}

	public java.lang.String toXmlString() {
		return _contact_category.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_contact_category.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public contact_category getWrappedcontact_category() {
		return _contact_category;
	}

	public contact_category getWrappedModel() {
		return _contact_category;
	}

	public void resetOriginalValues() {
		_contact_category.resetOriginalValues();
	}

	private contact_category _contact_category;
}