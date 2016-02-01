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

import com.iucn.whp.dbservice.service.iucn_region_countryLocalServiceUtil;

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
public class iucn_region_countryClp extends BaseModelImpl<iucn_region_country>
	implements iucn_region_country {
	public iucn_region_countryClp() {
	}

	public Class<?> getModelClass() {
		return iucn_region_country.class;
	}

	public String getModelClassName() {
		return iucn_region_country.class.getName();
	}

	public int getPrimaryKey() {
		return _whp_iucn_region_country_id;
	}

	public void setPrimaryKey(int primaryKey) {
		setWhp_iucn_region_country_id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Integer(_whp_iucn_region_country_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("whp_iucn_region_country_id",
			getWhp_iucn_region_country_id());
		attributes.put("countryid", getCountryid());
		attributes.put("iucn_region_id", getIucn_region_id());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer whp_iucn_region_country_id = (Integer)attributes.get(
				"whp_iucn_region_country_id");

		if (whp_iucn_region_country_id != null) {
			setWhp_iucn_region_country_id(whp_iucn_region_country_id);
		}

		Integer countryid = (Integer)attributes.get("countryid");

		if (countryid != null) {
			setCountryid(countryid);
		}

		Integer iucn_region_id = (Integer)attributes.get("iucn_region_id");

		if (iucn_region_id != null) {
			setIucn_region_id(iucn_region_id);
		}
	}

	public int getWhp_iucn_region_country_id() {
		return _whp_iucn_region_country_id;
	}

	public void setWhp_iucn_region_country_id(int whp_iucn_region_country_id) {
		_whp_iucn_region_country_id = whp_iucn_region_country_id;
	}

	public int getCountryid() {
		return _countryid;
	}

	public void setCountryid(int countryid) {
		_countryid = countryid;
	}

	public int getIucn_region_id() {
		return _iucn_region_id;
	}

	public void setIucn_region_id(int iucn_region_id) {
		_iucn_region_id = iucn_region_id;
	}

	public BaseModel<?> getiucn_region_countryRemoteModel() {
		return _iucn_region_countryRemoteModel;
	}

	public void setiucn_region_countryRemoteModel(
		BaseModel<?> iucn_region_countryRemoteModel) {
		_iucn_region_countryRemoteModel = iucn_region_countryRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			iucn_region_countryLocalServiceUtil.addiucn_region_country(this);
		}
		else {
			iucn_region_countryLocalServiceUtil.updateiucn_region_country(this);
		}
	}

	@Override
	public iucn_region_country toEscapedModel() {
		return (iucn_region_country)Proxy.newProxyInstance(iucn_region_country.class.getClassLoader(),
			new Class[] { iucn_region_country.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		iucn_region_countryClp clone = new iucn_region_countryClp();

		clone.setWhp_iucn_region_country_id(getWhp_iucn_region_country_id());
		clone.setCountryid(getCountryid());
		clone.setIucn_region_id(getIucn_region_id());

		return clone;
	}

	public int compareTo(iucn_region_country iucn_region_country) {
		int primaryKey = iucn_region_country.getPrimaryKey();

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

		iucn_region_countryClp iucn_region_country = null;

		try {
			iucn_region_country = (iucn_region_countryClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		int primaryKey = iucn_region_country.getPrimaryKey();

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

		sb.append("{whp_iucn_region_country_id=");
		sb.append(getWhp_iucn_region_country_id());
		sb.append(", countryid=");
		sb.append(getCountryid());
		sb.append(", iucn_region_id=");
		sb.append(getIucn_region_id());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.iucn_region_country");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>whp_iucn_region_country_id</column-name><column-value><![CDATA[");
		sb.append(getWhp_iucn_region_country_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>countryid</column-name><column-value><![CDATA[");
		sb.append(getCountryid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>iucn_region_id</column-name><column-value><![CDATA[");
		sb.append(getIucn_region_id());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _whp_iucn_region_country_id;
	private int _countryid;
	private int _iucn_region_id;
	private BaseModel<?> _iucn_region_countryRemoteModel;
}