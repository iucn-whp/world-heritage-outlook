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

import com.iucn.whp.dbservice.service.benefit_rating_lkpLocalServiceUtil;

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
public class benefit_rating_lkpClp extends BaseModelImpl<benefit_rating_lkp>
	implements benefit_rating_lkp {
	public benefit_rating_lkpClp() {
	}

	public Class<?> getModelClass() {
		return benefit_rating_lkp.class;
	}

	public String getModelClassName() {
		return benefit_rating_lkp.class.getName();
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
		attributes.put("rating", getRating());
		attributes.put("description", getDescription());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String rating = (String)attributes.get("rating");

		if (rating != null) {
			setRating(rating);
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

	public String getRating() {
		return _rating;
	}

	public void setRating(String rating) {
		_rating = rating;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public BaseModel<?> getbenefit_rating_lkpRemoteModel() {
		return _benefit_rating_lkpRemoteModel;
	}

	public void setbenefit_rating_lkpRemoteModel(
		BaseModel<?> benefit_rating_lkpRemoteModel) {
		_benefit_rating_lkpRemoteModel = benefit_rating_lkpRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			benefit_rating_lkpLocalServiceUtil.addbenefit_rating_lkp(this);
		}
		else {
			benefit_rating_lkpLocalServiceUtil.updatebenefit_rating_lkp(this);
		}
	}

	@Override
	public benefit_rating_lkp toEscapedModel() {
		return (benefit_rating_lkp)Proxy.newProxyInstance(benefit_rating_lkp.class.getClassLoader(),
			new Class[] { benefit_rating_lkp.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		benefit_rating_lkpClp clone = new benefit_rating_lkpClp();

		clone.setId(getId());
		clone.setRating(getRating());
		clone.setDescription(getDescription());

		return clone;
	}

	public int compareTo(benefit_rating_lkp benefit_rating_lkp) {
		long primaryKey = benefit_rating_lkp.getPrimaryKey();

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

		benefit_rating_lkpClp benefit_rating_lkp = null;

		try {
			benefit_rating_lkp = (benefit_rating_lkpClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = benefit_rating_lkp.getPrimaryKey();

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
		sb.append(", rating=");
		sb.append(getRating());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.benefit_rating_lkp");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>rating</column-name><column-value><![CDATA[");
		sb.append(getRating());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _rating;
	private String _description;
	private BaseModel<?> _benefit_rating_lkpRemoteModel;
}