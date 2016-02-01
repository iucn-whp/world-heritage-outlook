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

import com.iucn.whp.dbservice.service.country_lkpLocalServiceUtil;

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
public class country_lkpClp extends BaseModelImpl<country_lkp>
	implements country_lkp {
	public country_lkpClp() {
	}

	public Class<?> getModelClass() {
		return country_lkp.class;
	}

	public String getModelClassName() {
		return country_lkp.class.getName();
	}

	public int getPrimaryKey() {
		return _countryid;
	}

	public void setPrimaryKey(int primaryKey) {
		setCountryid(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Integer(_countryid);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("countryid", getCountryid());
		attributes.put("name", getName());
		attributes.put("a2", getA2());
		attributes.put("a3", getA3());
		attributes.put("number", getNumber());
		attributes.put("idd", getIdd());
		attributes.put("currency", getCurrency());
		attributes.put("ziprequired", getZiprequired());
		attributes.put("active", getActive());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer countryid = (Integer)attributes.get("countryid");

		if (countryid != null) {
			setCountryid(countryid);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String a2 = (String)attributes.get("a2");

		if (a2 != null) {
			setA2(a2);
		}

		String a3 = (String)attributes.get("a3");

		if (a3 != null) {
			setA3(a3);
		}

		String number = (String)attributes.get("number");

		if (number != null) {
			setNumber(number);
		}

		String idd = (String)attributes.get("idd");

		if (idd != null) {
			setIdd(idd);
		}

		String currency = (String)attributes.get("currency");

		if (currency != null) {
			setCurrency(currency);
		}

		Boolean ziprequired = (Boolean)attributes.get("ziprequired");

		if (ziprequired != null) {
			setZiprequired(ziprequired);
		}

		Boolean active = (Boolean)attributes.get("active");

		if (active != null) {
			setActive(active);
		}
	}

	public int getCountryid() {
		return _countryid;
	}

	public void setCountryid(int countryid) {
		_countryid = countryid;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getA2() {
		return _a2;
	}

	public void setA2(String a2) {
		_a2 = a2;
	}

	public String getA3() {
		return _a3;
	}

	public void setA3(String a3) {
		_a3 = a3;
	}

	public String getNumber() {
		return _number;
	}

	public void setNumber(String number) {
		_number = number;
	}

	public String getIdd() {
		return _idd;
	}

	public void setIdd(String idd) {
		_idd = idd;
	}

	public String getCurrency() {
		return _currency;
	}

	public void setCurrency(String currency) {
		_currency = currency;
	}

	public boolean getZiprequired() {
		return _ziprequired;
	}

	public boolean isZiprequired() {
		return _ziprequired;
	}

	public void setZiprequired(boolean ziprequired) {
		_ziprequired = ziprequired;
	}

	public boolean getActive() {
		return _active;
	}

	public boolean isActive() {
		return _active;
	}

	public void setActive(boolean active) {
		_active = active;
	}

	public BaseModel<?> getcountry_lkpRemoteModel() {
		return _country_lkpRemoteModel;
	}

	public void setcountry_lkpRemoteModel(BaseModel<?> country_lkpRemoteModel) {
		_country_lkpRemoteModel = country_lkpRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			country_lkpLocalServiceUtil.addcountry_lkp(this);
		}
		else {
			country_lkpLocalServiceUtil.updatecountry_lkp(this);
		}
	}

	@Override
	public country_lkp toEscapedModel() {
		return (country_lkp)Proxy.newProxyInstance(country_lkp.class.getClassLoader(),
			new Class[] { country_lkp.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		country_lkpClp clone = new country_lkpClp();

		clone.setCountryid(getCountryid());
		clone.setName(getName());
		clone.setA2(getA2());
		clone.setA3(getA3());
		clone.setNumber(getNumber());
		clone.setIdd(getIdd());
		clone.setCurrency(getCurrency());
		clone.setZiprequired(getZiprequired());
		clone.setActive(getActive());

		return clone;
	}

	public int compareTo(country_lkp country_lkp) {
		int value = 0;

		value = getName().compareTo(country_lkp.getName());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		country_lkpClp country_lkp = null;

		try {
			country_lkp = (country_lkpClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		int primaryKey = country_lkp.getPrimaryKey();

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
		StringBundler sb = new StringBundler(19);

		sb.append("{countryid=");
		sb.append(getCountryid());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", a2=");
		sb.append(getA2());
		sb.append(", a3=");
		sb.append(getA3());
		sb.append(", number=");
		sb.append(getNumber());
		sb.append(", idd=");
		sb.append(getIdd());
		sb.append(", currency=");
		sb.append(getCurrency());
		sb.append(", ziprequired=");
		sb.append(getZiprequired());
		sb.append(", active=");
		sb.append(getActive());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.country_lkp");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>countryid</column-name><column-value><![CDATA[");
		sb.append(getCountryid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>a2</column-name><column-value><![CDATA[");
		sb.append(getA2());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>a3</column-name><column-value><![CDATA[");
		sb.append(getA3());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>number</column-name><column-value><![CDATA[");
		sb.append(getNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>idd</column-name><column-value><![CDATA[");
		sb.append(getIdd());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>currency</column-name><column-value><![CDATA[");
		sb.append(getCurrency());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ziprequired</column-name><column-value><![CDATA[");
		sb.append(getZiprequired());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>active</column-name><column-value><![CDATA[");
		sb.append(getActive());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _countryid;
	private String _name;
	private String _a2;
	private String _a3;
	private String _number;
	private String _idd;
	private String _currency;
	private boolean _ziprequired;
	private boolean _active;
	private BaseModel<?> _country_lkpRemoteModel;
}