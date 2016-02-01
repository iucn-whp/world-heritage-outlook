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

import com.iucn.whp.dbservice.service.whp_sites_dsocrLocalServiceUtil;

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
public class whp_sites_dsocrClp extends BaseModelImpl<whp_sites_dsocr>
	implements whp_sites_dsocr {
	public whp_sites_dsocrClp() {
	}

	public Class<?> getModelClass() {
		return whp_sites_dsocr.class;
	}

	public String getModelClassName() {
		return whp_sites_dsocr.class.getName();
	}

	public long getPrimaryKey() {
		return _whp_sites_dsocr_id;
	}

	public void setPrimaryKey(long primaryKey) {
		setWhp_sites_dsocr_id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_whp_sites_dsocr_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("whp_sites_dsocr_id", getWhp_sites_dsocr_id());
		attributes.put("site_id", getSite_id());
		attributes.put("state_description", getState_description());
		attributes.put("dsocr_date", getDsocr_date());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long whp_sites_dsocr_id = (Long)attributes.get("whp_sites_dsocr_id");

		if (whp_sites_dsocr_id != null) {
			setWhp_sites_dsocr_id(whp_sites_dsocr_id);
		}

		Long site_id = (Long)attributes.get("site_id");

		if (site_id != null) {
			setSite_id(site_id);
		}

		String state_description = (String)attributes.get("state_description");

		if (state_description != null) {
			setState_description(state_description);
		}

		Date dsocr_date = (Date)attributes.get("dsocr_date");

		if (dsocr_date != null) {
			setDsocr_date(dsocr_date);
		}
	}

	public long getWhp_sites_dsocr_id() {
		return _whp_sites_dsocr_id;
	}

	public void setWhp_sites_dsocr_id(long whp_sites_dsocr_id) {
		_whp_sites_dsocr_id = whp_sites_dsocr_id;
	}

	public long getSite_id() {
		return _site_id;
	}

	public void setSite_id(long site_id) {
		_site_id = site_id;
	}

	public String getState_description() {
		return _state_description;
	}

	public void setState_description(String state_description) {
		_state_description = state_description;
	}

	public Date getDsocr_date() {
		return _dsocr_date;
	}

	public void setDsocr_date(Date dsocr_date) {
		_dsocr_date = dsocr_date;
	}

	public BaseModel<?> getwhp_sites_dsocrRemoteModel() {
		return _whp_sites_dsocrRemoteModel;
	}

	public void setwhp_sites_dsocrRemoteModel(
		BaseModel<?> whp_sites_dsocrRemoteModel) {
		_whp_sites_dsocrRemoteModel = whp_sites_dsocrRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			whp_sites_dsocrLocalServiceUtil.addwhp_sites_dsocr(this);
		}
		else {
			whp_sites_dsocrLocalServiceUtil.updatewhp_sites_dsocr(this);
		}
	}

	@Override
	public whp_sites_dsocr toEscapedModel() {
		return (whp_sites_dsocr)Proxy.newProxyInstance(whp_sites_dsocr.class.getClassLoader(),
			new Class[] { whp_sites_dsocr.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		whp_sites_dsocrClp clone = new whp_sites_dsocrClp();

		clone.setWhp_sites_dsocr_id(getWhp_sites_dsocr_id());
		clone.setSite_id(getSite_id());
		clone.setState_description(getState_description());
		clone.setDsocr_date(getDsocr_date());

		return clone;
	}

	public int compareTo(whp_sites_dsocr whp_sites_dsocr) {
		long primaryKey = whp_sites_dsocr.getPrimaryKey();

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

		whp_sites_dsocrClp whp_sites_dsocr = null;

		try {
			whp_sites_dsocr = (whp_sites_dsocrClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = whp_sites_dsocr.getPrimaryKey();

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

		sb.append("{whp_sites_dsocr_id=");
		sb.append(getWhp_sites_dsocr_id());
		sb.append(", site_id=");
		sb.append(getSite_id());
		sb.append(", state_description=");
		sb.append(getState_description());
		sb.append(", dsocr_date=");
		sb.append(getDsocr_date());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.whp_sites_dsocr");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>whp_sites_dsocr_id</column-name><column-value><![CDATA[");
		sb.append(getWhp_sites_dsocr_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>site_id</column-name><column-value><![CDATA[");
		sb.append(getSite_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>state_description</column-name><column-value><![CDATA[");
		sb.append(getState_description());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dsocr_date</column-name><column-value><![CDATA[");
		sb.append(getDsocr_date());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _whp_sites_dsocr_id;
	private long _site_id;
	private String _state_description;
	private Date _dsocr_date;
	private BaseModel<?> _whp_sites_dsocrRemoteModel;
}