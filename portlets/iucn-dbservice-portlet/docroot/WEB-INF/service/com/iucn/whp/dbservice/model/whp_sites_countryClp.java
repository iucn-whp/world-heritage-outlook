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

import com.iucn.whp.dbservice.service.whp_sites_countryLocalServiceUtil;

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
public class whp_sites_countryClp extends BaseModelImpl<whp_sites_country>
	implements whp_sites_country {
	public whp_sites_countryClp() {
	}

	public Class<?> getModelClass() {
		return whp_sites_country.class;
	}

	public String getModelClassName() {
		return whp_sites_country.class.getName();
	}

	public long getPrimaryKey() {
		return _whp_sites_country_id;
	}

	public void setPrimaryKey(long primaryKey) {
		setWhp_sites_country_id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_whp_sites_country_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("whp_sites_country_id", getWhp_sites_country_id());
		attributes.put("site_id", getSite_id());
		attributes.put("countryid", getCountryid());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long whp_sites_country_id = (Long)attributes.get("whp_sites_country_id");

		if (whp_sites_country_id != null) {
			setWhp_sites_country_id(whp_sites_country_id);
		}

		Long site_id = (Long)attributes.get("site_id");

		if (site_id != null) {
			setSite_id(site_id);
		}

		Integer countryid = (Integer)attributes.get("countryid");

		if (countryid != null) {
			setCountryid(countryid);
		}
	}

	public long getWhp_sites_country_id() {
		return _whp_sites_country_id;
	}

	public void setWhp_sites_country_id(long whp_sites_country_id) {
		_whp_sites_country_id = whp_sites_country_id;
	}

	public long getSite_id() {
		return _site_id;
	}

	public void setSite_id(long site_id) {
		_site_id = site_id;
	}

	public int getCountryid() {
		return _countryid;
	}

	public void setCountryid(int countryid) {
		_countryid = countryid;
	}

	public BaseModel<?> getwhp_sites_countryRemoteModel() {
		return _whp_sites_countryRemoteModel;
	}

	public void setwhp_sites_countryRemoteModel(
		BaseModel<?> whp_sites_countryRemoteModel) {
		_whp_sites_countryRemoteModel = whp_sites_countryRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			whp_sites_countryLocalServiceUtil.addwhp_sites_country(this);
		}
		else {
			whp_sites_countryLocalServiceUtil.updatewhp_sites_country(this);
		}
	}

	@Override
	public whp_sites_country toEscapedModel() {
		return (whp_sites_country)Proxy.newProxyInstance(whp_sites_country.class.getClassLoader(),
			new Class[] { whp_sites_country.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		whp_sites_countryClp clone = new whp_sites_countryClp();

		clone.setWhp_sites_country_id(getWhp_sites_country_id());
		clone.setSite_id(getSite_id());
		clone.setCountryid(getCountryid());

		return clone;
	}

	public int compareTo(whp_sites_country whp_sites_country) {
		long primaryKey = whp_sites_country.getPrimaryKey();

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

		whp_sites_countryClp whp_sites_country = null;

		try {
			whp_sites_country = (whp_sites_countryClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = whp_sites_country.getPrimaryKey();

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

		sb.append("{whp_sites_country_id=");
		sb.append(getWhp_sites_country_id());
		sb.append(", site_id=");
		sb.append(getSite_id());
		sb.append(", countryid=");
		sb.append(getCountryid());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.whp_sites_country");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>whp_sites_country_id</column-name><column-value><![CDATA[");
		sb.append(getWhp_sites_country_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>site_id</column-name><column-value><![CDATA[");
		sb.append(getSite_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>countryid</column-name><column-value><![CDATA[");
		sb.append(getCountryid());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _whp_sites_country_id;
	private long _site_id;
	private int _countryid;
	private BaseModel<?> _whp_sites_countryRemoteModel;
}