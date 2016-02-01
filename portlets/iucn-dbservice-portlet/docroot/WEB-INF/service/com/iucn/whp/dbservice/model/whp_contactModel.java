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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the whp_contact service. Represents a row in the &quot;whp_whp_contact&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.iucn.whp.dbservice.model.impl.whp_contactModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.iucn.whp.dbservice.model.impl.whp_contactImpl}.
 * </p>
 *
 * @author alok.sen
 * @see whp_contact
 * @see com.iucn.whp.dbservice.model.impl.whp_contactImpl
 * @see com.iucn.whp.dbservice.model.impl.whp_contactModelImpl
 * @generated
 */
public interface whp_contactModel extends BaseModel<whp_contact> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a whp_contact model instance should use the {@link whp_contact} interface instead.
	 */

	/**
	 * Returns the primary key of this whp_contact.
	 *
	 * @return the primary key of this whp_contact
	 */
	public int getPrimaryKey();

	/**
	 * Sets the primary key of this whp_contact.
	 *
	 * @param primaryKey the primary key of this whp_contact
	 */
	public void setPrimaryKey(int primaryKey);

	/**
	 * Returns the contact_id of this whp_contact.
	 *
	 * @return the contact_id of this whp_contact
	 */
	public int getContact_id();

	/**
	 * Sets the contact_id of this whp_contact.
	 *
	 * @param contact_id the contact_id of this whp_contact
	 */
	public void setContact_id(int contact_id);

	/**
	 * Returns the prefix of this whp_contact.
	 *
	 * @return the prefix of this whp_contact
	 */
	@AutoEscape
	public String getPrefix();

	/**
	 * Sets the prefix of this whp_contact.
	 *
	 * @param prefix the prefix of this whp_contact
	 */
	public void setPrefix(String prefix);

	/**
	 * Returns the last_name of this whp_contact.
	 *
	 * @return the last_name of this whp_contact
	 */
	@AutoEscape
	public String getLast_name();

	/**
	 * Sets the last_name of this whp_contact.
	 *
	 * @param last_name the last_name of this whp_contact
	 */
	public void setLast_name(String last_name);

	/**
	 * Returns the first_name of this whp_contact.
	 *
	 * @return the first_name of this whp_contact
	 */
	@AutoEscape
	public String getFirst_name();

	/**
	 * Sets the first_name of this whp_contact.
	 *
	 * @param first_name the first_name of this whp_contact
	 */
	public void setFirst_name(String first_name);

	/**
	 * Returns the email of this whp_contact.
	 *
	 * @return the email of this whp_contact
	 */
	@AutoEscape
	public String getEmail();

	/**
	 * Sets the email of this whp_contact.
	 *
	 * @param email the email of this whp_contact
	 */
	public void setEmail(String email);

	/**
	 * Returns the position of this whp_contact.
	 *
	 * @return the position of this whp_contact
	 */
	@AutoEscape
	public String getPosition();

	/**
	 * Sets the position of this whp_contact.
	 *
	 * @param position the position of this whp_contact
	 */
	public void setPosition(String position);

	/**
	 * Returns the organization of this whp_contact.
	 *
	 * @return the organization of this whp_contact
	 */
	@AutoEscape
	public String getOrganization();

	/**
	 * Sets the organization of this whp_contact.
	 *
	 * @param organization the organization of this whp_contact
	 */
	public void setOrganization(String organization);

	/**
	 * Returns the address of this whp_contact.
	 *
	 * @return the address of this whp_contact
	 */
	@AutoEscape
	public String getAddress();

	/**
	 * Sets the address of this whp_contact.
	 *
	 * @param address the address of this whp_contact
	 */
	public void setAddress(String address);

	/**
	 * Returns the telephone of this whp_contact.
	 *
	 * @return the telephone of this whp_contact
	 */
	@AutoEscape
	public String getTelephone();

	/**
	 * Sets the telephone of this whp_contact.
	 *
	 * @param telephone the telephone of this whp_contact
	 */
	public void setTelephone(String telephone);

	/**
	 * Returns the last_updated of this whp_contact.
	 *
	 * @return the last_updated of this whp_contact
	 */
	public Date getLast_updated();

	/**
	 * Sets the last_updated of this whp_contact.
	 *
	 * @param last_updated the last_updated of this whp_contact
	 */
	public void setLast_updated(Date last_updated);

	/**
	 * Returns the categoryid of this whp_contact.
	 *
	 * @return the categoryid of this whp_contact
	 */
	public int getCategoryid();

	/**
	 * Sets the categoryid of this whp_contact.
	 *
	 * @param categoryid the categoryid of this whp_contact
	 */
	public void setCategoryid(int categoryid);

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public Serializable getPrimaryKeyObj();

	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(whp_contact whp_contact);

	public int hashCode();

	public CacheModel<whp_contact> toCacheModel();

	public whp_contact toEscapedModel();

	public String toString();

	public String toXmlString();
}