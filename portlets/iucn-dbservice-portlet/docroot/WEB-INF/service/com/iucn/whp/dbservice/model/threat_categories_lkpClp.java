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

import com.iucn.whp.dbservice.service.threat_categories_lkpLocalServiceUtil;

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
public class threat_categories_lkpClp extends BaseModelImpl<threat_categories_lkp>
	implements threat_categories_lkp {
	public threat_categories_lkpClp() {
	}

	public Class<?> getModelClass() {
		return threat_categories_lkp.class;
	}

	public String getModelClassName() {
		return threat_categories_lkp.class.getName();
	}

	public long getPrimaryKey() {
		return _threatCategoryid;
	}

	public void setPrimaryKey(long primaryKey) {
		setThreatCategoryid(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_threatCategoryid);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("threatCategoryid", getThreatCategoryid());
		attributes.put("threat_category", getThreat_category());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long threatCategoryid = (Long)attributes.get("threatCategoryid");

		if (threatCategoryid != null) {
			setThreatCategoryid(threatCategoryid);
		}

		String threat_category = (String)attributes.get("threat_category");

		if (threat_category != null) {
			setThreat_category(threat_category);
		}
	}

	public long getThreatCategoryid() {
		return _threatCategoryid;
	}

	public void setThreatCategoryid(long threatCategoryid) {
		_threatCategoryid = threatCategoryid;
	}

	public String getThreat_category() {
		return _threat_category;
	}

	public void setThreat_category(String threat_category) {
		_threat_category = threat_category;
	}

	public BaseModel<?> getthreat_categories_lkpRemoteModel() {
		return _threat_categories_lkpRemoteModel;
	}

	public void setthreat_categories_lkpRemoteModel(
		BaseModel<?> threat_categories_lkpRemoteModel) {
		_threat_categories_lkpRemoteModel = threat_categories_lkpRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			threat_categories_lkpLocalServiceUtil.addthreat_categories_lkp(this);
		}
		else {
			threat_categories_lkpLocalServiceUtil.updatethreat_categories_lkp(this);
		}
	}

	@Override
	public threat_categories_lkp toEscapedModel() {
		return (threat_categories_lkp)Proxy.newProxyInstance(threat_categories_lkp.class.getClassLoader(),
			new Class[] { threat_categories_lkp.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		threat_categories_lkpClp clone = new threat_categories_lkpClp();

		clone.setThreatCategoryid(getThreatCategoryid());
		clone.setThreat_category(getThreat_category());

		return clone;
	}

	public int compareTo(threat_categories_lkp threat_categories_lkp) {
		long primaryKey = threat_categories_lkp.getPrimaryKey();

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

		threat_categories_lkpClp threat_categories_lkp = null;

		try {
			threat_categories_lkp = (threat_categories_lkpClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = threat_categories_lkp.getPrimaryKey();

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
		StringBundler sb = new StringBundler(5);

		sb.append("{threatCategoryid=");
		sb.append(getThreatCategoryid());
		sb.append(", threat_category=");
		sb.append(getThreat_category());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.threat_categories_lkp");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>threatCategoryid</column-name><column-value><![CDATA[");
		sb.append(getThreatCategoryid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>threat_category</column-name><column-value><![CDATA[");
		sb.append(getThreat_category());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _threatCategoryid;
	private String _threat_category;
	private BaseModel<?> _threat_categories_lkpRemoteModel;
}