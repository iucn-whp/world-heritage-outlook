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

import com.iucn.whp.dbservice.service.whp_site_danger_listLocalServiceUtil;

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
public class whp_site_danger_listClp extends BaseModelImpl<whp_site_danger_list>
	implements whp_site_danger_list {
	public whp_site_danger_listClp() {
	}

	public Class<?> getModelClass() {
		return whp_site_danger_list.class;
	}

	public String getModelClassName() {
		return whp_site_danger_list.class.getName();
	}

	public long getPrimaryKey() {
		return _whp_site_danger_list_id;
	}

	public void setPrimaryKey(long primaryKey) {
		setWhp_site_danger_list_id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_whp_site_danger_list_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("whp_site_danger_list_id", getWhp_site_danger_list_id());
		attributes.put("site_id", getSite_id());
		attributes.put("status_id", getStatus_id());
		attributes.put("year", getYear());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long whp_site_danger_list_id = (Long)attributes.get(
				"whp_site_danger_list_id");

		if (whp_site_danger_list_id != null) {
			setWhp_site_danger_list_id(whp_site_danger_list_id);
		}

		Long site_id = (Long)attributes.get("site_id");

		if (site_id != null) {
			setSite_id(site_id);
		}

		Integer status_id = (Integer)attributes.get("status_id");

		if (status_id != null) {
			setStatus_id(status_id);
		}

		Date year = (Date)attributes.get("year");

		if (year != null) {
			setYear(year);
		}
	}

	public long getWhp_site_danger_list_id() {
		return _whp_site_danger_list_id;
	}

	public void setWhp_site_danger_list_id(long whp_site_danger_list_id) {
		_whp_site_danger_list_id = whp_site_danger_list_id;
	}

	public long getSite_id() {
		return _site_id;
	}

	public void setSite_id(long site_id) {
		_site_id = site_id;
	}

	public int getStatus_id() {
		return _status_id;
	}

	public void setStatus_id(int status_id) {
		_status_id = status_id;
	}

	public Date getYear() {
		return _year;
	}

	public void setYear(Date year) {
		_year = year;
	}

	public BaseModel<?> getwhp_site_danger_listRemoteModel() {
		return _whp_site_danger_listRemoteModel;
	}

	public void setwhp_site_danger_listRemoteModel(
		BaseModel<?> whp_site_danger_listRemoteModel) {
		_whp_site_danger_listRemoteModel = whp_site_danger_listRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			whp_site_danger_listLocalServiceUtil.addwhp_site_danger_list(this);
		}
		else {
			whp_site_danger_listLocalServiceUtil.updatewhp_site_danger_list(this);
		}
	}

	@Override
	public whp_site_danger_list toEscapedModel() {
		return (whp_site_danger_list)Proxy.newProxyInstance(whp_site_danger_list.class.getClassLoader(),
			new Class[] { whp_site_danger_list.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		whp_site_danger_listClp clone = new whp_site_danger_listClp();

		clone.setWhp_site_danger_list_id(getWhp_site_danger_list_id());
		clone.setSite_id(getSite_id());
		clone.setStatus_id(getStatus_id());
		clone.setYear(getYear());

		return clone;
	}

	public int compareTo(whp_site_danger_list whp_site_danger_list) {
		long primaryKey = whp_site_danger_list.getPrimaryKey();

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

		whp_site_danger_listClp whp_site_danger_list = null;

		try {
			whp_site_danger_list = (whp_site_danger_listClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = whp_site_danger_list.getPrimaryKey();

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
		StringBundler sb = new StringBundler(9);

		sb.append("{whp_site_danger_list_id=");
		sb.append(getWhp_site_danger_list_id());
		sb.append(", site_id=");
		sb.append(getSite_id());
		sb.append(", status_id=");
		sb.append(getStatus_id());
		sb.append(", year=");
		sb.append(getYear());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.whp_site_danger_list");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>whp_site_danger_list_id</column-name><column-value><![CDATA[");
		sb.append(getWhp_site_danger_list_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>site_id</column-name><column-value><![CDATA[");
		sb.append(getSite_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status_id</column-name><column-value><![CDATA[");
		sb.append(getStatus_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>year</column-name><column-value><![CDATA[");
		sb.append(getYear());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _whp_site_danger_list_id;
	private long _site_id;
	private int _status_id;
	private Date _year;
	private BaseModel<?> _whp_site_danger_listRemoteModel;
}