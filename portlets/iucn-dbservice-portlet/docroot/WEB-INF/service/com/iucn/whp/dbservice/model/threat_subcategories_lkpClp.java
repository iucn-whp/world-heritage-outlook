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

import com.iucn.whp.dbservice.service.threat_subcategories_lkpLocalServiceUtil;

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
public class threat_subcategories_lkpClp extends BaseModelImpl<threat_subcategories_lkp>
	implements threat_subcategories_lkp {
	public threat_subcategories_lkpClp() {
	}

	public Class<?> getModelClass() {
		return threat_subcategories_lkp.class;
	}

	public String getModelClassName() {
		return threat_subcategories_lkp.class.getName();
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
		attributes.put("threat_sub_category", getThreat_sub_category());
		attributes.put("parent_id", getParent_id());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String threat_sub_category = (String)attributes.get(
				"threat_sub_category");

		if (threat_sub_category != null) {
			setThreat_sub_category(threat_sub_category);
		}

		Long parent_id = (Long)attributes.get("parent_id");

		if (parent_id != null) {
			setParent_id(parent_id);
		}
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public String getThreat_sub_category() {
		return _threat_sub_category;
	}

	public void setThreat_sub_category(String threat_sub_category) {
		_threat_sub_category = threat_sub_category;
	}

	public long getParent_id() {
		return _parent_id;
	}

	public void setParent_id(long parent_id) {
		_parent_id = parent_id;
	}

	public BaseModel<?> getthreat_subcategories_lkpRemoteModel() {
		return _threat_subcategories_lkpRemoteModel;
	}

	public void setthreat_subcategories_lkpRemoteModel(
		BaseModel<?> threat_subcategories_lkpRemoteModel) {
		_threat_subcategories_lkpRemoteModel = threat_subcategories_lkpRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			threat_subcategories_lkpLocalServiceUtil.addthreat_subcategories_lkp(this);
		}
		else {
			threat_subcategories_lkpLocalServiceUtil.updatethreat_subcategories_lkp(this);
		}
	}

	@Override
	public threat_subcategories_lkp toEscapedModel() {
		return (threat_subcategories_lkp)Proxy.newProxyInstance(threat_subcategories_lkp.class.getClassLoader(),
			new Class[] { threat_subcategories_lkp.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		threat_subcategories_lkpClp clone = new threat_subcategories_lkpClp();

		clone.setId(getId());
		clone.setThreat_sub_category(getThreat_sub_category());
		clone.setParent_id(getParent_id());

		return clone;
	}

	public int compareTo(threat_subcategories_lkp threat_subcategories_lkp) {
		long primaryKey = threat_subcategories_lkp.getPrimaryKey();

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

		threat_subcategories_lkpClp threat_subcategories_lkp = null;

		try {
			threat_subcategories_lkp = (threat_subcategories_lkpClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = threat_subcategories_lkp.getPrimaryKey();

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
		sb.append(", threat_sub_category=");
		sb.append(getThreat_sub_category());
		sb.append(", parent_id=");
		sb.append(getParent_id());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.threat_subcategories_lkp");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>threat_sub_category</column-name><column-value><![CDATA[");
		sb.append(getThreat_sub_category());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>parent_id</column-name><column-value><![CDATA[");
		sb.append(getParent_id());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _threat_sub_category;
	private long _parent_id;
	private BaseModel<?> _threat_subcategories_lkpRemoteModel;
}