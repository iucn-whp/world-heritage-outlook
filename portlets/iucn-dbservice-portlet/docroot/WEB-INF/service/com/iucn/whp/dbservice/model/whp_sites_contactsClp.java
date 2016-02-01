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

import com.iucn.whp.dbservice.service.whp_sites_contactsLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author alok.sen
 */
public class whp_sites_contactsClp extends BaseModelImpl<whp_sites_contacts>
	implements whp_sites_contacts {
	public whp_sites_contactsClp() {
	}

	public Class<?> getModelClass() {
		return whp_sites_contacts.class;
	}

	public String getModelClassName() {
		return whp_sites_contacts.class.getName();
	}

	public long getPrimaryKey() {
		return _whp_sites_contacts_id;
	}

	public void setPrimaryKey(long primaryKey) {
		setWhp_sites_contacts_id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_whp_sites_contacts_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("whp_sites_contacts_id", getWhp_sites_contacts_id());
		attributes.put("site_id", getSite_id());
		attributes.put("contactid", getContactid());

		return attributes;
	}

	@Override
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

	public long getWhp_sites_contacts_id() {
		return _whp_sites_contacts_id;
	}

	public void setWhp_sites_contacts_id(long whp_sites_contacts_id) {
		_whp_sites_contacts_id = whp_sites_contacts_id;
	}

	public long getSite_id() {
		return _site_id;
	}

	public void setSite_id(long site_id) {
		_site_id = site_id;
	}

	public int getContactid() {
		return _contactid;
	}

	public void setContactid(int contactid) {
		_contactid = contactid;
	}

	public BaseModel<?> getwhp_sites_contactsRemoteModel() {
		return _whp_sites_contactsRemoteModel;
	}

	public void setwhp_sites_contactsRemoteModel(
		BaseModel<?> whp_sites_contactsRemoteModel) {
		_whp_sites_contactsRemoteModel = whp_sites_contactsRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			whp_sites_contactsLocalServiceUtil.addwhp_sites_contacts(this);
		}
		else {
			whp_sites_contactsLocalServiceUtil.updatewhp_sites_contacts(this);
		}
	}

	@Override
	public whp_sites_contacts toEscapedModel() {
		return (whp_sites_contacts)Proxy.newProxyInstance(whp_sites_contacts.class.getClassLoader(),
			new Class[] { whp_sites_contacts.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		whp_sites_contactsClp clone = new whp_sites_contactsClp();

		clone.setWhp_sites_contacts_id(getWhp_sites_contacts_id());
		clone.setSite_id(getSite_id());
		clone.setContactid(getContactid());

		return clone;
	}

	public int compareTo(whp_sites_contacts whp_sites_contacts) {
		long primaryKey = whp_sites_contacts.getPrimaryKey();

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

		whp_sites_contactsClp whp_sites_contacts = null;

		try {
			whp_sites_contacts = (whp_sites_contactsClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = whp_sites_contacts.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{whp_sites_contacts_id=");
		sb.append(getWhp_sites_contacts_id());
		sb.append(", site_id=");
		sb.append(getSite_id());
		sb.append(", contactid=");
		sb.append(getContactid());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.whp_sites_contacts");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>whp_sites_contacts_id</column-name><column-value><![CDATA[");
		sb.append(getWhp_sites_contacts_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>site_id</column-name><column-value><![CDATA[");
		sb.append(getSite_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>contactid</column-name><column-value><![CDATA[");
		sb.append(getContactid());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _whp_sites_contacts_id;
	private long _site_id;
	private int _contactid;
	private BaseModel<?> _whp_sites_contactsRemoteModel;
}