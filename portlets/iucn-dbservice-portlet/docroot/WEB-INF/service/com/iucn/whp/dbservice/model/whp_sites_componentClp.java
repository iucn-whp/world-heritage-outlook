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

import com.iucn.whp.dbservice.service.whp_sites_componentLocalServiceUtil;

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
public class whp_sites_componentClp extends BaseModelImpl<whp_sites_component>
	implements whp_sites_component {
	public whp_sites_componentClp() {
	}

	public Class<?> getModelClass() {
		return whp_sites_component.class;
	}

	public String getModelClassName() {
		return whp_sites_component.class.getName();
	}

	public long getPrimaryKey() {
		return _whp_sites_component_id;
	}

	public void setPrimaryKey(long primaryKey) {
		setWhp_sites_component_id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_whp_sites_component_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("whp_sites_component_id", getWhp_sites_component_id());
		attributes.put("site_id", getSite_id());
		attributes.put("component", getComponent());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long whp_sites_component_id = (Long)attributes.get(
				"whp_sites_component_id");

		if (whp_sites_component_id != null) {
			setWhp_sites_component_id(whp_sites_component_id);
		}

		Long site_id = (Long)attributes.get("site_id");

		if (site_id != null) {
			setSite_id(site_id);
		}

		String component = (String)attributes.get("component");

		if (component != null) {
			setComponent(component);
		}
	}

	public long getWhp_sites_component_id() {
		return _whp_sites_component_id;
	}

	public void setWhp_sites_component_id(long whp_sites_component_id) {
		_whp_sites_component_id = whp_sites_component_id;
	}

	public long getSite_id() {
		return _site_id;
	}

	public void setSite_id(long site_id) {
		_site_id = site_id;
	}

	public String getComponent() {
		return _component;
	}

	public void setComponent(String component) {
		_component = component;
	}

	public BaseModel<?> getwhp_sites_componentRemoteModel() {
		return _whp_sites_componentRemoteModel;
	}

	public void setwhp_sites_componentRemoteModel(
		BaseModel<?> whp_sites_componentRemoteModel) {
		_whp_sites_componentRemoteModel = whp_sites_componentRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			whp_sites_componentLocalServiceUtil.addwhp_sites_component(this);
		}
		else {
			whp_sites_componentLocalServiceUtil.updatewhp_sites_component(this);
		}
	}

	@Override
	public whp_sites_component toEscapedModel() {
		return (whp_sites_component)Proxy.newProxyInstance(whp_sites_component.class.getClassLoader(),
			new Class[] { whp_sites_component.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		whp_sites_componentClp clone = new whp_sites_componentClp();

		clone.setWhp_sites_component_id(getWhp_sites_component_id());
		clone.setSite_id(getSite_id());
		clone.setComponent(getComponent());

		return clone;
	}

	public int compareTo(whp_sites_component whp_sites_component) {
		long primaryKey = whp_sites_component.getPrimaryKey();

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

		whp_sites_componentClp whp_sites_component = null;

		try {
			whp_sites_component = (whp_sites_componentClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = whp_sites_component.getPrimaryKey();

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

		sb.append("{whp_sites_component_id=");
		sb.append(getWhp_sites_component_id());
		sb.append(", site_id=");
		sb.append(getSite_id());
		sb.append(", component=");
		sb.append(getComponent());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.whp_sites_component");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>whp_sites_component_id</column-name><column-value><![CDATA[");
		sb.append(getWhp_sites_component_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>site_id</column-name><column-value><![CDATA[");
		sb.append(getSite_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>component</column-name><column-value><![CDATA[");
		sb.append(getComponent());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _whp_sites_component_id;
	private long _site_id;
	private String _component;
	private BaseModel<?> _whp_sites_componentRemoteModel;
}