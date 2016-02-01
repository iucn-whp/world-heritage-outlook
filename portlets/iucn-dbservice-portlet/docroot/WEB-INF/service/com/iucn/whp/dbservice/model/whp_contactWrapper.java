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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link whp_contact}.
 * </p>
 *
 * @author    alok.sen
 * @see       whp_contact
 * @generated
 */
public class whp_contactWrapper implements whp_contact,
	ModelWrapper<whp_contact> {
	public whp_contactWrapper(whp_contact whp_contact) {
		_whp_contact = whp_contact;
	}

	public Class<?> getModelClass() {
		return whp_contact.class;
	}

	public String getModelClassName() {
		return whp_contact.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("contact_id", getContact_id());
		attributes.put("prefix", getPrefix());
		attributes.put("last_name", getLast_name());
		attributes.put("first_name", getFirst_name());
		attributes.put("email", getEmail());
		attributes.put("position", getPosition());
		attributes.put("organization", getOrganization());
		attributes.put("address", getAddress());
		attributes.put("telephone", getTelephone());
		attributes.put("last_updated", getLast_updated());
		attributes.put("categoryid", getCategoryid());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Integer contact_id = (Integer)attributes.get("contact_id");

		if (contact_id != null) {
			setContact_id(contact_id);
		}

		String prefix = (String)attributes.get("prefix");

		if (prefix != null) {
			setPrefix(prefix);
		}

		String last_name = (String)attributes.get("last_name");

		if (last_name != null) {
			setLast_name(last_name);
		}

		String first_name = (String)attributes.get("first_name");

		if (first_name != null) {
			setFirst_name(first_name);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String position = (String)attributes.get("position");

		if (position != null) {
			setPosition(position);
		}

		String organization = (String)attributes.get("organization");

		if (organization != null) {
			setOrganization(organization);
		}

		String address = (String)attributes.get("address");

		if (address != null) {
			setAddress(address);
		}

		String telephone = (String)attributes.get("telephone");

		if (telephone != null) {
			setTelephone(telephone);
		}

		Date last_updated = (Date)attributes.get("last_updated");

		if (last_updated != null) {
			setLast_updated(last_updated);
		}

		Integer categoryid = (Integer)attributes.get("categoryid");

		if (categoryid != null) {
			setCategoryid(categoryid);
		}
	}

	/**
	* Returns the primary key of this whp_contact.
	*
	* @return the primary key of this whp_contact
	*/
	public int getPrimaryKey() {
		return _whp_contact.getPrimaryKey();
	}

	/**
	* Sets the primary key of this whp_contact.
	*
	* @param primaryKey the primary key of this whp_contact
	*/
	public void setPrimaryKey(int primaryKey) {
		_whp_contact.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the contact_id of this whp_contact.
	*
	* @return the contact_id of this whp_contact
	*/
	public int getContact_id() {
		return _whp_contact.getContact_id();
	}

	/**
	* Sets the contact_id of this whp_contact.
	*
	* @param contact_id the contact_id of this whp_contact
	*/
	public void setContact_id(int contact_id) {
		_whp_contact.setContact_id(contact_id);
	}

	/**
	* Returns the prefix of this whp_contact.
	*
	* @return the prefix of this whp_contact
	*/
	public java.lang.String getPrefix() {
		return _whp_contact.getPrefix();
	}

	/**
	* Sets the prefix of this whp_contact.
	*
	* @param prefix the prefix of this whp_contact
	*/
	public void setPrefix(java.lang.String prefix) {
		_whp_contact.setPrefix(prefix);
	}

	/**
	* Returns the last_name of this whp_contact.
	*
	* @return the last_name of this whp_contact
	*/
	public java.lang.String getLast_name() {
		return _whp_contact.getLast_name();
	}

	/**
	* Sets the last_name of this whp_contact.
	*
	* @param last_name the last_name of this whp_contact
	*/
	public void setLast_name(java.lang.String last_name) {
		_whp_contact.setLast_name(last_name);
	}

	/**
	* Returns the first_name of this whp_contact.
	*
	* @return the first_name of this whp_contact
	*/
	public java.lang.String getFirst_name() {
		return _whp_contact.getFirst_name();
	}

	/**
	* Sets the first_name of this whp_contact.
	*
	* @param first_name the first_name of this whp_contact
	*/
	public void setFirst_name(java.lang.String first_name) {
		_whp_contact.setFirst_name(first_name);
	}

	/**
	* Returns the email of this whp_contact.
	*
	* @return the email of this whp_contact
	*/
	public java.lang.String getEmail() {
		return _whp_contact.getEmail();
	}

	/**
	* Sets the email of this whp_contact.
	*
	* @param email the email of this whp_contact
	*/
	public void setEmail(java.lang.String email) {
		_whp_contact.setEmail(email);
	}

	/**
	* Returns the position of this whp_contact.
	*
	* @return the position of this whp_contact
	*/
	public java.lang.String getPosition() {
		return _whp_contact.getPosition();
	}

	/**
	* Sets the position of this whp_contact.
	*
	* @param position the position of this whp_contact
	*/
	public void setPosition(java.lang.String position) {
		_whp_contact.setPosition(position);
	}

	/**
	* Returns the organization of this whp_contact.
	*
	* @return the organization of this whp_contact
	*/
	public java.lang.String getOrganization() {
		return _whp_contact.getOrganization();
	}

	/**
	* Sets the organization of this whp_contact.
	*
	* @param organization the organization of this whp_contact
	*/
	public void setOrganization(java.lang.String organization) {
		_whp_contact.setOrganization(organization);
	}

	/**
	* Returns the address of this whp_contact.
	*
	* @return the address of this whp_contact
	*/
	public java.lang.String getAddress() {
		return _whp_contact.getAddress();
	}

	/**
	* Sets the address of this whp_contact.
	*
	* @param address the address of this whp_contact
	*/
	public void setAddress(java.lang.String address) {
		_whp_contact.setAddress(address);
	}

	/**
	* Returns the telephone of this whp_contact.
	*
	* @return the telephone of this whp_contact
	*/
	public java.lang.String getTelephone() {
		return _whp_contact.getTelephone();
	}

	/**
	* Sets the telephone of this whp_contact.
	*
	* @param telephone the telephone of this whp_contact
	*/
	public void setTelephone(java.lang.String telephone) {
		_whp_contact.setTelephone(telephone);
	}

	/**
	* Returns the last_updated of this whp_contact.
	*
	* @return the last_updated of this whp_contact
	*/
	public java.util.Date getLast_updated() {
		return _whp_contact.getLast_updated();
	}

	/**
	* Sets the last_updated of this whp_contact.
	*
	* @param last_updated the last_updated of this whp_contact
	*/
	public void setLast_updated(java.util.Date last_updated) {
		_whp_contact.setLast_updated(last_updated);
	}

	/**
	* Returns the categoryid of this whp_contact.
	*
	* @return the categoryid of this whp_contact
	*/
	public int getCategoryid() {
		return _whp_contact.getCategoryid();
	}

	/**
	* Sets the categoryid of this whp_contact.
	*
	* @param categoryid the categoryid of this whp_contact
	*/
	public void setCategoryid(int categoryid) {
		_whp_contact.setCategoryid(categoryid);
	}

	public boolean isNew() {
		return _whp_contact.isNew();
	}

	public void setNew(boolean n) {
		_whp_contact.setNew(n);
	}

	public boolean isCachedModel() {
		return _whp_contact.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_whp_contact.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _whp_contact.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _whp_contact.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_whp_contact.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _whp_contact.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_whp_contact.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new whp_contactWrapper((whp_contact)_whp_contact.clone());
	}

	public int compareTo(com.iucn.whp.dbservice.model.whp_contact whp_contact) {
		return _whp_contact.compareTo(whp_contact);
	}

	@Override
	public int hashCode() {
		return _whp_contact.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.iucn.whp.dbservice.model.whp_contact> toCacheModel() {
		return _whp_contact.toCacheModel();
	}

	public com.iucn.whp.dbservice.model.whp_contact toEscapedModel() {
		return new whp_contactWrapper(_whp_contact.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _whp_contact.toString();
	}

	public java.lang.String toXmlString() {
		return _whp_contact.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_whp_contact.persist();
	}

	public com.iucn.whp.dbservice.model.contact_category getContactCategory() {
		return _whp_contact.getContactCategory();
	}

	public void setContactCategory(
		com.iucn.whp.dbservice.model.contact_category contactCategory) {
		_whp_contact.setContactCategory(contactCategory);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public whp_contact getWrappedwhp_contact() {
		return _whp_contact;
	}

	public whp_contact getWrappedModel() {
		return _whp_contact;
	}

	public void resetOriginalValues() {
		_whp_contact.resetOriginalValues();
	}

	private whp_contact _whp_contact;
}