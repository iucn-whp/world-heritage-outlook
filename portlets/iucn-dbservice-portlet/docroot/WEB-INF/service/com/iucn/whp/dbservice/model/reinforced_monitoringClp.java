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

import com.iucn.whp.dbservice.service.reinforced_monitoringLocalServiceUtil;

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
public class reinforced_monitoringClp extends BaseModelImpl<reinforced_monitoring>
	implements reinforced_monitoring {
	public reinforced_monitoringClp() {
	}

	public Class<?> getModelClass() {
		return reinforced_monitoring.class;
	}

	public String getModelClassName() {
		return reinforced_monitoring.class.getName();
	}

	public long getPrimaryKey() {
		return _whp_sites_reinforced_monitoring_id;
	}

	public void setPrimaryKey(long primaryKey) {
		setWhp_sites_reinforced_monitoring_id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_whp_sites_reinforced_monitoring_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("whp_sites_reinforced_monitoring_id",
			getWhp_sites_reinforced_monitoring_id());
		attributes.put("site_id", getSite_id());
		attributes.put("reinforced_date", getReinforced_date());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long whp_sites_reinforced_monitoring_id = (Long)attributes.get(
				"whp_sites_reinforced_monitoring_id");

		if (whp_sites_reinforced_monitoring_id != null) {
			setWhp_sites_reinforced_monitoring_id(whp_sites_reinforced_monitoring_id);
		}

		Long site_id = (Long)attributes.get("site_id");

		if (site_id != null) {
			setSite_id(site_id);
		}

		Date reinforced_date = (Date)attributes.get("reinforced_date");

		if (reinforced_date != null) {
			setReinforced_date(reinforced_date);
		}
	}

	public long getWhp_sites_reinforced_monitoring_id() {
		return _whp_sites_reinforced_monitoring_id;
	}

	public void setWhp_sites_reinforced_monitoring_id(
		long whp_sites_reinforced_monitoring_id) {
		_whp_sites_reinforced_monitoring_id = whp_sites_reinforced_monitoring_id;
	}

	public long getSite_id() {
		return _site_id;
	}

	public void setSite_id(long site_id) {
		_site_id = site_id;
	}

	public Date getReinforced_date() {
		return _reinforced_date;
	}

	public void setReinforced_date(Date reinforced_date) {
		_reinforced_date = reinforced_date;
	}

	public BaseModel<?> getreinforced_monitoringRemoteModel() {
		return _reinforced_monitoringRemoteModel;
	}

	public void setreinforced_monitoringRemoteModel(
		BaseModel<?> reinforced_monitoringRemoteModel) {
		_reinforced_monitoringRemoteModel = reinforced_monitoringRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			reinforced_monitoringLocalServiceUtil.addreinforced_monitoring(this);
		}
		else {
			reinforced_monitoringLocalServiceUtil.updatereinforced_monitoring(this);
		}
	}

	@Override
	public reinforced_monitoring toEscapedModel() {
		return (reinforced_monitoring)Proxy.newProxyInstance(reinforced_monitoring.class.getClassLoader(),
			new Class[] { reinforced_monitoring.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		reinforced_monitoringClp clone = new reinforced_monitoringClp();

		clone.setWhp_sites_reinforced_monitoring_id(getWhp_sites_reinforced_monitoring_id());
		clone.setSite_id(getSite_id());
		clone.setReinforced_date(getReinforced_date());

		return clone;
	}

	public int compareTo(reinforced_monitoring reinforced_monitoring) {
		long primaryKey = reinforced_monitoring.getPrimaryKey();

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

		reinforced_monitoringClp reinforced_monitoring = null;

		try {
			reinforced_monitoring = (reinforced_monitoringClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = reinforced_monitoring.getPrimaryKey();

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

		sb.append("{whp_sites_reinforced_monitoring_id=");
		sb.append(getWhp_sites_reinforced_monitoring_id());
		sb.append(", site_id=");
		sb.append(getSite_id());
		sb.append(", reinforced_date=");
		sb.append(getReinforced_date());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.reinforced_monitoring");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>whp_sites_reinforced_monitoring_id</column-name><column-value><![CDATA[");
		sb.append(getWhp_sites_reinforced_monitoring_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>site_id</column-name><column-value><![CDATA[");
		sb.append(getSite_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>reinforced_date</column-name><column-value><![CDATA[");
		sb.append(getReinforced_date());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _whp_sites_reinforced_monitoring_id;
	private long _site_id;
	private Date _reinforced_date;
	private BaseModel<?> _reinforced_monitoringRemoteModel;
}