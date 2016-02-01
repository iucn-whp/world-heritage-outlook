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

import com.iucn.whp.dbservice.service.unesco_region_countryLocalServiceUtil;

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
public class unesco_region_countryClp extends BaseModelImpl<unesco_region_country>
	implements unesco_region_country {
	public unesco_region_countryClp() {
	}

	public Class<?> getModelClass() {
		return unesco_region_country.class;
	}

	public String getModelClassName() {
		return unesco_region_country.class.getName();
	}

	public int getPrimaryKey() {
		return _whp_unesco_region_country_id;
	}

	public void setPrimaryKey(int primaryKey) {
		setWhp_unesco_region_country_id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Integer(_whp_unesco_region_country_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("whp_unesco_region_country_id",
			getWhp_unesco_region_country_id());
		attributes.put("countryid", getCountryid());
		attributes.put("unesco_region_id", getUnesco_region_id());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer whp_unesco_region_country_id = (Integer)attributes.get(
				"whp_unesco_region_country_id");

		if (whp_unesco_region_country_id != null) {
			setWhp_unesco_region_country_id(whp_unesco_region_country_id);
		}

		Integer countryid = (Integer)attributes.get("countryid");

		if (countryid != null) {
			setCountryid(countryid);
		}

		Integer unesco_region_id = (Integer)attributes.get("unesco_region_id");

		if (unesco_region_id != null) {
			setUnesco_region_id(unesco_region_id);
		}
	}

	public int getWhp_unesco_region_country_id() {
		return _whp_unesco_region_country_id;
	}

	public void setWhp_unesco_region_country_id(
		int whp_unesco_region_country_id) {
		_whp_unesco_region_country_id = whp_unesco_region_country_id;
	}

	public int getCountryid() {
		return _countryid;
	}

	public void setCountryid(int countryid) {
		_countryid = countryid;
	}

	public int getUnesco_region_id() {
		return _unesco_region_id;
	}

	public void setUnesco_region_id(int unesco_region_id) {
		_unesco_region_id = unesco_region_id;
	}

	public BaseModel<?> getunesco_region_countryRemoteModel() {
		return _unesco_region_countryRemoteModel;
	}

	public void setunesco_region_countryRemoteModel(
		BaseModel<?> unesco_region_countryRemoteModel) {
		_unesco_region_countryRemoteModel = unesco_region_countryRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			unesco_region_countryLocalServiceUtil.addunesco_region_country(this);
		}
		else {
			unesco_region_countryLocalServiceUtil.updateunesco_region_country(this);
		}
	}

	@Override
	public unesco_region_country toEscapedModel() {
		return (unesco_region_country)Proxy.newProxyInstance(unesco_region_country.class.getClassLoader(),
			new Class[] { unesco_region_country.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		unesco_region_countryClp clone = new unesco_region_countryClp();

		clone.setWhp_unesco_region_country_id(getWhp_unesco_region_country_id());
		clone.setCountryid(getCountryid());
		clone.setUnesco_region_id(getUnesco_region_id());

		return clone;
	}

	public int compareTo(unesco_region_country unesco_region_country) {
		int primaryKey = unesco_region_country.getPrimaryKey();

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

		unesco_region_countryClp unesco_region_country = null;

		try {
			unesco_region_country = (unesco_region_countryClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		int primaryKey = unesco_region_country.getPrimaryKey();

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
		StringBundler sb = new StringBundler(7);

		sb.append("{whp_unesco_region_country_id=");
		sb.append(getWhp_unesco_region_country_id());
		sb.append(", countryid=");
		sb.append(getCountryid());
		sb.append(", unesco_region_id=");
		sb.append(getUnesco_region_id());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.unesco_region_country");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>whp_unesco_region_country_id</column-name><column-value><![CDATA[");
		sb.append(getWhp_unesco_region_country_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>countryid</column-name><column-value><![CDATA[");
		sb.append(getCountryid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>unesco_region_id</column-name><column-value><![CDATA[");
		sb.append(getUnesco_region_id());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _whp_unesco_region_country_id;
	private int _countryid;
	private int _unesco_region_id;
	private BaseModel<?> _unesco_region_countryRemoteModel;
}