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

import com.iucn.whp.dbservice.service.protection_management_ratings_lkpLocalServiceUtil;

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
public class protection_management_ratings_lkpClp extends BaseModelImpl<protection_management_ratings_lkp>
	implements protection_management_ratings_lkp {
	public protection_management_ratings_lkpClp() {
	}

	public Class<?> getModelClass() {
		return protection_management_ratings_lkp.class;
	}

	public String getModelClassName() {
		return protection_management_ratings_lkp.class.getName();
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("pm_rating", getPm_rating());
		attributes.put("description", getDescription());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String pm_rating = (String)attributes.get("pm_rating");

		if (pm_rating != null) {
			setPm_rating(pm_rating);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public String getPm_rating() {
		return _pm_rating;
	}

	public void setPm_rating(String pm_rating) {
		_pm_rating = pm_rating;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public BaseModel<?> getprotection_management_ratings_lkpRemoteModel() {
		return _protection_management_ratings_lkpRemoteModel;
	}

	public void setprotection_management_ratings_lkpRemoteModel(
		BaseModel<?> protection_management_ratings_lkpRemoteModel) {
		_protection_management_ratings_lkpRemoteModel = protection_management_ratings_lkpRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			protection_management_ratings_lkpLocalServiceUtil.addprotection_management_ratings_lkp(this);
		}
		else {
			protection_management_ratings_lkpLocalServiceUtil.updateprotection_management_ratings_lkp(this);
		}
	}

	@Override
	public protection_management_ratings_lkp toEscapedModel() {
		return (protection_management_ratings_lkp)Proxy.newProxyInstance(protection_management_ratings_lkp.class.getClassLoader(),
			new Class[] { protection_management_ratings_lkp.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		protection_management_ratings_lkpClp clone = new protection_management_ratings_lkpClp();

		clone.setId(getId());
		clone.setPm_rating(getPm_rating());
		clone.setDescription(getDescription());

		return clone;
	}

	public int compareTo(
		protection_management_ratings_lkp protection_management_ratings_lkp) {
		long primaryKey = protection_management_ratings_lkp.getPrimaryKey();

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

		protection_management_ratings_lkpClp protection_management_ratings_lkp = null;

		try {
			protection_management_ratings_lkp = (protection_management_ratings_lkpClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = protection_management_ratings_lkp.getPrimaryKey();

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

		sb.append("{id=");
		sb.append(getId());
		sb.append(", pm_rating=");
		sb.append(getPm_rating());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append(
			"com.iucn.whp.dbservice.model.protection_management_ratings_lkp");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>pm_rating</column-name><column-value><![CDATA[");
		sb.append(getPm_rating());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _pm_rating;
	private String _description;
	private BaseModel<?> _protection_management_ratings_lkpRemoteModel;
}