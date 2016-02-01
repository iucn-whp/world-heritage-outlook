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

import com.iucn.whp.dbservice.service.conservation_outlook_rating_lkpLocalServiceUtil;

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
public class conservation_outlook_rating_lkpClp extends BaseModelImpl<conservation_outlook_rating_lkp>
	implements conservation_outlook_rating_lkp {
	public conservation_outlook_rating_lkpClp() {
	}

	public Class<?> getModelClass() {
		return conservation_outlook_rating_lkp.class;
	}

	public String getModelClassName() {
		return conservation_outlook_rating_lkp.class.getName();
	}

	public long getPrimaryKey() {
		return _co_rating_id;
	}

	public void setPrimaryKey(long primaryKey) {
		setCo_rating_id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_co_rating_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("co_rating_id", getCo_rating_id());
		attributes.put("co_rating", getCo_rating());
		attributes.put("description", getDescription());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long co_rating_id = (Long)attributes.get("co_rating_id");

		if (co_rating_id != null) {
			setCo_rating_id(co_rating_id);
		}

		String co_rating = (String)attributes.get("co_rating");

		if (co_rating != null) {
			setCo_rating(co_rating);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}
	}

	public long getCo_rating_id() {
		return _co_rating_id;
	}

	public void setCo_rating_id(long co_rating_id) {
		_co_rating_id = co_rating_id;
	}

	public String getCo_rating() {
		return _co_rating;
	}

	public void setCo_rating(String co_rating) {
		_co_rating = co_rating;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public BaseModel<?> getconservation_outlook_rating_lkpRemoteModel() {
		return _conservation_outlook_rating_lkpRemoteModel;
	}

	public void setconservation_outlook_rating_lkpRemoteModel(
		BaseModel<?> conservation_outlook_rating_lkpRemoteModel) {
		_conservation_outlook_rating_lkpRemoteModel = conservation_outlook_rating_lkpRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			conservation_outlook_rating_lkpLocalServiceUtil.addconservation_outlook_rating_lkp(this);
		}
		else {
			conservation_outlook_rating_lkpLocalServiceUtil.updateconservation_outlook_rating_lkp(this);
		}
	}

	@Override
	public conservation_outlook_rating_lkp toEscapedModel() {
		return (conservation_outlook_rating_lkp)Proxy.newProxyInstance(conservation_outlook_rating_lkp.class.getClassLoader(),
			new Class[] { conservation_outlook_rating_lkp.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		conservation_outlook_rating_lkpClp clone = new conservation_outlook_rating_lkpClp();

		clone.setCo_rating_id(getCo_rating_id());
		clone.setCo_rating(getCo_rating());
		clone.setDescription(getDescription());

		return clone;
	}

	public int compareTo(
		conservation_outlook_rating_lkp conservation_outlook_rating_lkp) {
		long primaryKey = conservation_outlook_rating_lkp.getPrimaryKey();

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

		conservation_outlook_rating_lkpClp conservation_outlook_rating_lkp = null;

		try {
			conservation_outlook_rating_lkp = (conservation_outlook_rating_lkpClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = conservation_outlook_rating_lkp.getPrimaryKey();

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

		sb.append("{co_rating_id=");
		sb.append(getCo_rating_id());
		sb.append(", co_rating=");
		sb.append(getCo_rating());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append(
			"com.iucn.whp.dbservice.model.conservation_outlook_rating_lkp");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>co_rating_id</column-name><column-value><![CDATA[");
		sb.append(getCo_rating_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>co_rating</column-name><column-value><![CDATA[");
		sb.append(getCo_rating());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _co_rating_id;
	private String _co_rating;
	private String _description;
	private BaseModel<?> _conservation_outlook_rating_lkpRemoteModel;
}