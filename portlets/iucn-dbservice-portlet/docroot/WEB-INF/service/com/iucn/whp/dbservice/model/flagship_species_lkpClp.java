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

import com.iucn.whp.dbservice.service.flagship_species_lkpLocalServiceUtil;

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
public class flagship_species_lkpClp extends BaseModelImpl<flagship_species_lkp>
	implements flagship_species_lkp {
	public flagship_species_lkpClp() {
	}

	public Class<?> getModelClass() {
		return flagship_species_lkp.class;
	}

	public String getModelClassName() {
		return flagship_species_lkp.class.getName();
	}

	public int getPrimaryKey() {
		return _flagship_species_id;
	}

	public void setPrimaryKey(int primaryKey) {
		setFlagship_species_id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Integer(_flagship_species_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("flagship_species_id", getFlagship_species_id());
		attributes.put("flagship_species_name", getFlagship_species_name());
		attributes.put("redlist_url", getRedlist_url());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer flagship_species_id = (Integer)attributes.get(
				"flagship_species_id");

		if (flagship_species_id != null) {
			setFlagship_species_id(flagship_species_id);
		}

		String flagship_species_name = (String)attributes.get(
				"flagship_species_name");

		if (flagship_species_name != null) {
			setFlagship_species_name(flagship_species_name);
		}

		String redlist_url = (String)attributes.get("redlist_url");

		if (redlist_url != null) {
			setRedlist_url(redlist_url);
		}
	}

	public int getFlagship_species_id() {
		return _flagship_species_id;
	}

	public void setFlagship_species_id(int flagship_species_id) {
		_flagship_species_id = flagship_species_id;
	}

	public String getFlagship_species_name() {
		return _flagship_species_name;
	}

	public void setFlagship_species_name(String flagship_species_name) {
		_flagship_species_name = flagship_species_name;
	}

	public String getRedlist_url() {
		return _redlist_url;
	}

	public void setRedlist_url(String redlist_url) {
		_redlist_url = redlist_url;
	}

	public BaseModel<?> getflagship_species_lkpRemoteModel() {
		return _flagship_species_lkpRemoteModel;
	}

	public void setflagship_species_lkpRemoteModel(
		BaseModel<?> flagship_species_lkpRemoteModel) {
		_flagship_species_lkpRemoteModel = flagship_species_lkpRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			flagship_species_lkpLocalServiceUtil.addflagship_species_lkp(this);
		}
		else {
			flagship_species_lkpLocalServiceUtil.updateflagship_species_lkp(this);
		}
	}

	@Override
	public flagship_species_lkp toEscapedModel() {
		return (flagship_species_lkp)Proxy.newProxyInstance(flagship_species_lkp.class.getClassLoader(),
			new Class[] { flagship_species_lkp.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		flagship_species_lkpClp clone = new flagship_species_lkpClp();

		clone.setFlagship_species_id(getFlagship_species_id());
		clone.setFlagship_species_name(getFlagship_species_name());
		clone.setRedlist_url(getRedlist_url());

		return clone;
	}

	public int compareTo(flagship_species_lkp flagship_species_lkp) {
		int primaryKey = flagship_species_lkp.getPrimaryKey();

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

		flagship_species_lkpClp flagship_species_lkp = null;

		try {
			flagship_species_lkp = (flagship_species_lkpClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		int primaryKey = flagship_species_lkp.getPrimaryKey();

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

		sb.append("{flagship_species_id=");
		sb.append(getFlagship_species_id());
		sb.append(", flagship_species_name=");
		sb.append(getFlagship_species_name());
		sb.append(", redlist_url=");
		sb.append(getRedlist_url());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.flagship_species_lkp");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>flagship_species_id</column-name><column-value><![CDATA[");
		sb.append(getFlagship_species_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>flagship_species_name</column-name><column-value><![CDATA[");
		sb.append(getFlagship_species_name());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>redlist_url</column-name><column-value><![CDATA[");
		sb.append(getRedlist_url());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _flagship_species_id;
	private String _flagship_species_name;
	private String _redlist_url;
	private BaseModel<?> _flagship_species_lkpRemoteModel;
}