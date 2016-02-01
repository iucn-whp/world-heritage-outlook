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

import com.iucn.whp.dbservice.service.whp_criteria_lkpLocalServiceUtil;

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
public class whp_criteria_lkpClp extends BaseModelImpl<whp_criteria_lkp>
	implements whp_criteria_lkp {
	public whp_criteria_lkpClp() {
	}

	public Class<?> getModelClass() {
		return whp_criteria_lkp.class;
	}

	public String getModelClassName() {
		return whp_criteria_lkp.class.getName();
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
		attributes.put("criterion", getCriterion());
		attributes.put("description", getDescription());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String criterion = (String)attributes.get("criterion");

		if (criterion != null) {
			setCriterion(criterion);
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

	public String getCriterion() {
		return _criterion;
	}

	public void setCriterion(String criterion) {
		_criterion = criterion;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public BaseModel<?> getwhp_criteria_lkpRemoteModel() {
		return _whp_criteria_lkpRemoteModel;
	}

	public void setwhp_criteria_lkpRemoteModel(
		BaseModel<?> whp_criteria_lkpRemoteModel) {
		_whp_criteria_lkpRemoteModel = whp_criteria_lkpRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			whp_criteria_lkpLocalServiceUtil.addwhp_criteria_lkp(this);
		}
		else {
			whp_criteria_lkpLocalServiceUtil.updatewhp_criteria_lkp(this);
		}
	}

	@Override
	public whp_criteria_lkp toEscapedModel() {
		return (whp_criteria_lkp)Proxy.newProxyInstance(whp_criteria_lkp.class.getClassLoader(),
			new Class[] { whp_criteria_lkp.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		whp_criteria_lkpClp clone = new whp_criteria_lkpClp();

		clone.setId(getId());
		clone.setCriterion(getCriterion());
		clone.setDescription(getDescription());

		return clone;
	}

	public int compareTo(whp_criteria_lkp whp_criteria_lkp) {
		long primaryKey = whp_criteria_lkp.getPrimaryKey();

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

		whp_criteria_lkpClp whp_criteria_lkp = null;

		try {
			whp_criteria_lkp = (whp_criteria_lkpClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = whp_criteria_lkp.getPrimaryKey();

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
		sb.append(", criterion=");
		sb.append(getCriterion());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.whp_criteria_lkp");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>criterion</column-name><column-value><![CDATA[");
		sb.append(getCriterion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _criterion;
	private String _description;
	private BaseModel<?> _whp_criteria_lkpRemoteModel;
}