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
 * This class is a wrapper for {@link whp_sites_contacts}.
 * </p>
 *
 * @author    alok.sen
 * @see       whp_sites_contacts
 * @generated
 */
public class whp_sites_contactsWrapper implements whp_sites_contacts,
	ModelWrapper<whp_sites_contacts> {
	public whp_sites_contactsWrapper(whp_sites_contacts whp_sites_contacts) {
		_whp_sites_contacts = whp_sites_contacts;
	}

	public Class<?> getModelClass() {
		return whp_sites_contacts.class;
	}

	public String getModelClassName() {
		return whp_sites_contacts.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("whp_sites_contacts_id", getWhp_sites_contacts_id());
		attributes.put("site_id", getSite_id());
		attributes.put("contactid", getContactid());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long whp_sites_contacts_id = (Long)attributes.get(
				"whp_sites_contacts_id");

		if (whp_sites_contacts_id != null) {
			setWhp_sites_contacts_id(whp_sites_contacts_id);
		}

		Long site_id = (Long)attributes.get("site_id");

		if (site_id != null) {
			setSite_id(site_id);
		}

		Integer contactid = (Integer)attributes.get("contactid");

		if (contactid != null) {
			setContactid(contactid);
		}
	}

	/**
	* Returns the primary key of this whp_sites_contacts.
	*
	* @return the primary key of this whp_sites_contacts
	*/
	public long getPrimaryKey() {
		return _whp_sites_contacts.getPrimaryKey();
	}

	/**
	* Sets the primary key of this whp_sites_contacts.
	*
	* @param primaryKey the primary key of this whp_sites_contacts
	*/
	public void setPrimaryKey(long primaryKey) {
		_whp_sites_contacts.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the whp_sites_contacts_id of this whp_sites_contacts.
	*
	* @return the whp_sites_contacts_id of this whp_sites_contacts
	*/
	public long getWhp_sites_contacts_id() {
		return _whp_sites_contacts.getWhp_sites_contacts_id();
	}

	/**
	* Sets the whp_sites_contacts_id of this whp_sites_contacts.
	*
	* @param whp_sites_contacts_id the whp_sites_contacts_id of this whp_sites_contacts
	*/
	public void setWhp_sites_contacts_id(long whp_sites_contacts_id) {
		_whp_sites_contacts.setWhp_sites_contacts_id(whp_sites_contacts_id);
	}

	/**
	* Returns the site_id of this whp_sites_contacts.
	*
	* @return the site_id of this whp_sites_contacts
	*/
	public long getSite_id() {
		return _whp_sites_contacts.getSite_id();
	}

	/**
	* Sets the site_id of this whp_sites_contacts.
	*
	* @param site_id the site_id of this whp_sites_contacts
	*/
	public void setSite_id(long site_id) {
		_whp_sites_contacts.setSite_id(site_id);
	}

	/**
	* Returns the contactid of this whp_sites_contacts.
	*
	* @return the contactid of this whp_sites_contacts
	*/
	public int getContactid() {
		return _whp_sites_contacts.getContactid();
	}

	/**
	* Sets the contactid of this whp_sites_contacts.
	*
	* @param contactid the contactid of this whp_sites_contacts
	*/
	public void setContactid(int contactid) {
		_whp_sites_contacts.setContactid(contactid);
	}

	public boolean isNew() {
		return _whp_sites_contacts.isNew();
	}

	public void setNew(boolean n) {
		_whp_sites_contacts.setNew(n);
	}

	public boolean isCachedModel() {
		return _whp_sites_contacts.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_whp_sites_contacts.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _whp_sites_contacts.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _whp_sites_contacts.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_whp_sites_contacts.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _whp_sites_contacts.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_whp_sites_contacts.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new whp_sites_contactsWrapper((whp_sites_contacts)_whp_sites_contacts.clone());
	}

	public int compareTo(
		com.iucn.whp.dbservice.model.whp_sites_contacts whp_sites_contacts) {
		return _whp_sites_contacts.compareTo(whp_sites_contacts);
	}

	@Override
	public int hashCode() {
		return _whp_sites_contacts.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.iucn.whp.dbservice.model.whp_sites_contacts> toCacheModel() {
		return _whp_sites_contacts.toCacheModel();
	}

	public com.iucn.whp.dbservice.model.whp_sites_contacts toEscapedModel() {
		return new whp_sites_contactsWrapper(_whp_sites_contacts.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _whp_sites_contacts.toString();
	}

	public java.lang.String toXmlString() {
		return _whp_sites_contacts.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_whp_sites_contacts.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public whp_sites_contacts getWrappedwhp_sites_contacts() {
		return _whp_sites_contacts;
	}

	public whp_sites_contacts getWrappedModel() {
		return _whp_sites_contacts;
	}

	public void resetOriginalValues() {
		_whp_sites_contacts.resetOriginalValues();
	}

	private whp_sites_contacts _whp_sites_contacts;
}