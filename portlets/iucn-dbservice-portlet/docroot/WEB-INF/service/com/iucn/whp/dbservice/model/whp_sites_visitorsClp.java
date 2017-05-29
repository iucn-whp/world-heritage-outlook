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

import com.iucn.whp.dbservice.service.whp_sites_visitorsLocalServiceUtil;

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
public class whp_sites_visitorsClp extends BaseModelImpl<whp_sites_visitors>
	implements whp_sites_visitors {
	public whp_sites_visitorsClp() {
	}

	public Class<?> getModelClass() {
		return whp_sites_visitors.class;
	}

	public String getModelClassName() {
		return whp_sites_visitors.class.getName();
	}

	public long getPrimaryKey() {
		return _whp_sites_visitors_id;
	}

	public void setPrimaryKey(long primaryKey) {
		setWhp_sites_visitors_id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_whp_sites_visitors_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("whp_sites_visitors_id", getWhp_sites_visitors_id());
		attributes.put("site_id", getSite_id());
		attributes.put("visitor_count", getVisitor_count());
		attributes.put("record_date", getRecord_date());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long whp_sites_visitors_id = (Long)attributes.get(
				"whp_sites_visitors_id");

		if (whp_sites_visitors_id != null) {
			setWhp_sites_visitors_id(whp_sites_visitors_id);
		}

		Long site_id = (Long)attributes.get("site_id");

		if (site_id != null) {
			setSite_id(site_id);
		}

		Long visitor_count = (Long)attributes.get("visitor_count");

		if (visitor_count != null) {
			setVisitor_count(visitor_count);
		}

		Date record_date = (Date)attributes.get("record_date");

		if (record_date != null) {
			setRecord_date(record_date);
		}
	}

	public long getWhp_sites_visitors_id() {
		return _whp_sites_visitors_id;
	}

	public void setWhp_sites_visitors_id(long whp_sites_visitors_id) {
		_whp_sites_visitors_id = whp_sites_visitors_id;
	}

	public long getSite_id() {
		return _site_id;
	}

	public void setSite_id(long site_id) {
		_site_id = site_id;
	}

	public long getVisitor_count() {
		return _visitor_count;
	}

	public void setVisitor_count(long visitor_count) {
		_visitor_count = visitor_count;
	}

	public Date getRecord_date() {
		return _record_date;
	}

	public void setRecord_date(Date record_date) {
		_record_date = record_date;
	}

	public BaseModel<?> getwhp_sites_visitorsRemoteModel() {
		return _whp_sites_visitorsRemoteModel;
	}

	public void setwhp_sites_visitorsRemoteModel(
		BaseModel<?> whp_sites_visitorsRemoteModel) {
		_whp_sites_visitorsRemoteModel = whp_sites_visitorsRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			whp_sites_visitorsLocalServiceUtil.addwhp_sites_visitors(this);
		}
		else {
			whp_sites_visitorsLocalServiceUtil.updatewhp_sites_visitors(this);
		}
	}

	@Override
	public whp_sites_visitors toEscapedModel() {
		return (whp_sites_visitors)Proxy.newProxyInstance(whp_sites_visitors.class.getClassLoader(),
			new Class[] { whp_sites_visitors.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		whp_sites_visitorsClp clone = new whp_sites_visitorsClp();

		clone.setWhp_sites_visitors_id(getWhp_sites_visitors_id());
		clone.setSite_id(getSite_id());
		clone.setVisitor_count(getVisitor_count());
		clone.setRecord_date(getRecord_date());

		return clone;
	}

	public int compareTo(whp_sites_visitors whp_sites_visitors) {
		long primaryKey = whp_sites_visitors.getPrimaryKey();

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

		whp_sites_visitorsClp whp_sites_visitors = null;

		try {
			whp_sites_visitors = (whp_sites_visitorsClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = whp_sites_visitors.getPrimaryKey();

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

		sb.append("{whp_sites_visitors_id=");
		sb.append(getWhp_sites_visitors_id());
		sb.append(", site_id=");
		sb.append(getSite_id());
		sb.append(", visitor_count=");
		sb.append(getVisitor_count());
		sb.append(", record_date=");
		sb.append(getRecord_date());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.whp_sites_visitors");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>whp_sites_visitors_id</column-name><column-value><![CDATA[");
		sb.append(getWhp_sites_visitors_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>site_id</column-name><column-value><![CDATA[");
		sb.append(getSite_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>visitor_count</column-name><column-value><![CDATA[");
		sb.append(getVisitor_count());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>record_date</column-name><column-value><![CDATA[");
		sb.append(getRecord_date());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _whp_sites_visitors_id;
	private long _site_id;
	private long _visitor_count;
	private Date _record_date;
	private BaseModel<?> _whp_sites_visitorsRemoteModel;
}