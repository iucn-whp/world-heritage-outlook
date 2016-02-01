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

import com.iucn.whp.dbservice.service.whp_contactLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author alok.sen
 */
public class whp_contactClp extends BaseModelImpl<whp_contact>
	implements whp_contact {
	public whp_contactClp() {
	}

	public Class<?> getModelClass() {
		return whp_contact.class;
	}

	public String getModelClassName() {
		return whp_contact.class.getName();
	}

	public int getPrimaryKey() {
		return _contact_id;
	}

	public void setPrimaryKey(int primaryKey) {
		setContact_id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Integer(_contact_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
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

	@Override
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

	public int getContact_id() {
		return _contact_id;
	}

	public void setContact_id(int contact_id) {
		_contact_id = contact_id;
	}

	public String getPrefix() {
		return _prefix;
	}

	public void setPrefix(String prefix) {
		_prefix = prefix;
	}

	public String getLast_name() {
		return _last_name;
	}

	public void setLast_name(String last_name) {
		_last_name = last_name;
	}

	public String getFirst_name() {
		return _first_name;
	}

	public void setFirst_name(String first_name) {
		_first_name = first_name;
	}

	public String getEmail() {
		return _email;
	}

	public void setEmail(String email) {
		_email = email;
	}

	public String getPosition() {
		return _position;
	}

	public void setPosition(String position) {
		_position = position;
	}

	public String getOrganization() {
		return _organization;
	}

	public void setOrganization(String organization) {
		_organization = organization;
	}

	public String getAddress() {
		return _address;
	}

	public void setAddress(String address) {
		_address = address;
	}

	public String getTelephone() {
		return _telephone;
	}

	public void setTelephone(String telephone) {
		_telephone = telephone;
	}

	public Date getLast_updated() {
		return _last_updated;
	}

	public void setLast_updated(Date last_updated) {
		_last_updated = last_updated;
	}

	public int getCategoryid() {
		return _categoryid;
	}

	public void setCategoryid(int categoryid) {
		_categoryid = categoryid;
	}

	public com.iucn.whp.dbservice.model.contact_category getContactCategory() {
		throw new UnsupportedOperationException();
	}

	public void setContactCategory(
		com.iucn.whp.dbservice.model.contact_category contactCategory) {
		throw new UnsupportedOperationException();
	}

	public BaseModel<?> getwhp_contactRemoteModel() {
		return _whp_contactRemoteModel;
	}

	public void setwhp_contactRemoteModel(BaseModel<?> whp_contactRemoteModel) {
		_whp_contactRemoteModel = whp_contactRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			whp_contactLocalServiceUtil.addwhp_contact(this);
		}
		else {
			whp_contactLocalServiceUtil.updatewhp_contact(this);
		}
	}

	@Override
	public whp_contact toEscapedModel() {
		return (whp_contact)Proxy.newProxyInstance(whp_contact.class.getClassLoader(),
			new Class[] { whp_contact.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		whp_contactClp clone = new whp_contactClp();

		clone.setContact_id(getContact_id());
		clone.setPrefix(getPrefix());
		clone.setLast_name(getLast_name());
		clone.setFirst_name(getFirst_name());
		clone.setEmail(getEmail());
		clone.setPosition(getPosition());
		clone.setOrganization(getOrganization());
		clone.setAddress(getAddress());
		clone.setTelephone(getTelephone());
		clone.setLast_updated(getLast_updated());
		clone.setCategoryid(getCategoryid());

		return clone;
	}

	public int compareTo(whp_contact whp_contact) {
		int primaryKey = whp_contact.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		whp_contactClp whp_contact = null;

		try {
			whp_contact = (whp_contactClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		int primaryKey = whp_contact.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{contact_id=");
		sb.append(getContact_id());
		sb.append(", prefix=");
		sb.append(getPrefix());
		sb.append(", last_name=");
		sb.append(getLast_name());
		sb.append(", first_name=");
		sb.append(getFirst_name());
		sb.append(", email=");
		sb.append(getEmail());
		sb.append(", position=");
		sb.append(getPosition());
		sb.append(", organization=");
		sb.append(getOrganization());
		sb.append(", address=");
		sb.append(getAddress());
		sb.append(", telephone=");
		sb.append(getTelephone());
		sb.append(", last_updated=");
		sb.append(getLast_updated());
		sb.append(", categoryid=");
		sb.append(getCategoryid());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(37);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.whp_contact");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>contact_id</column-name><column-value><![CDATA[");
		sb.append(getContact_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>prefix</column-name><column-value><![CDATA[");
		sb.append(getPrefix());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>last_name</column-name><column-value><![CDATA[");
		sb.append(getLast_name());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>first_name</column-name><column-value><![CDATA[");
		sb.append(getFirst_name());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>email</column-name><column-value><![CDATA[");
		sb.append(getEmail());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>position</column-name><column-value><![CDATA[");
		sb.append(getPosition());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>organization</column-name><column-value><![CDATA[");
		sb.append(getOrganization());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>address</column-name><column-value><![CDATA[");
		sb.append(getAddress());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>telephone</column-name><column-value><![CDATA[");
		sb.append(getTelephone());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>last_updated</column-name><column-value><![CDATA[");
		sb.append(getLast_updated());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>categoryid</column-name><column-value><![CDATA[");
		sb.append(getCategoryid());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _contact_id;
	private String _prefix;
	private String _last_name;
	private String _first_name;
	private String _email;
	private String _position;
	private String _organization;
	private String _address;
	private String _telephone;
	private Date _last_updated;
	private int _categoryid;
	private BaseModel<?> _whp_contactRemoteModel;
}