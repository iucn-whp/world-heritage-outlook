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

import com.iucn.whp.dbservice.service.key_conservation_scale_lkpLocalServiceUtil;

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
public class key_conservation_scale_lkpClp extends BaseModelImpl<key_conservation_scale_lkp>
	implements key_conservation_scale_lkp {
	public key_conservation_scale_lkpClp() {
	}

	public Class<?> getModelClass() {
		return key_conservation_scale_lkp.class;
	}

	public String getModelClassName() {
		return key_conservation_scale_lkp.class.getName();
	}

	public long getPrimaryKey() {
		return _scale_id;
	}

	public void setPrimaryKey(long primaryKey) {
		setScale_id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_scale_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("scale_id", getScale_id());
		attributes.put("scale", getScale());
		attributes.put("description", getDescription());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long scale_id = (Long)attributes.get("scale_id");

		if (scale_id != null) {
			setScale_id(scale_id);
		}

		String scale = (String)attributes.get("scale");

		if (scale != null) {
			setScale(scale);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}
	}

	public long getScale_id() {
		return _scale_id;
	}

	public void setScale_id(long scale_id) {
		_scale_id = scale_id;
	}

	public String getScale() {
		return _scale;
	}

	public void setScale(String scale) {
		_scale = scale;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public BaseModel<?> getkey_conservation_scale_lkpRemoteModel() {
		return _key_conservation_scale_lkpRemoteModel;
	}

	public void setkey_conservation_scale_lkpRemoteModel(
		BaseModel<?> key_conservation_scale_lkpRemoteModel) {
		_key_conservation_scale_lkpRemoteModel = key_conservation_scale_lkpRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			key_conservation_scale_lkpLocalServiceUtil.addkey_conservation_scale_lkp(this);
		}
		else {
			key_conservation_scale_lkpLocalServiceUtil.updatekey_conservation_scale_lkp(this);
		}
	}

	@Override
	public key_conservation_scale_lkp toEscapedModel() {
		return (key_conservation_scale_lkp)Proxy.newProxyInstance(key_conservation_scale_lkp.class.getClassLoader(),
			new Class[] { key_conservation_scale_lkp.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		key_conservation_scale_lkpClp clone = new key_conservation_scale_lkpClp();

		clone.setScale_id(getScale_id());
		clone.setScale(getScale());
		clone.setDescription(getDescription());

		return clone;
	}

	public int compareTo(key_conservation_scale_lkp key_conservation_scale_lkp) {
		long primaryKey = key_conservation_scale_lkp.getPrimaryKey();

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

		key_conservation_scale_lkpClp key_conservation_scale_lkp = null;

		try {
			key_conservation_scale_lkp = (key_conservation_scale_lkpClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = key_conservation_scale_lkp.getPrimaryKey();

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

		sb.append("{scale_id=");
		sb.append(getScale_id());
		sb.append(", scale=");
		sb.append(getScale());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.key_conservation_scale_lkp");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>scale_id</column-name><column-value><![CDATA[");
		sb.append(getScale_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>scale</column-name><column-value><![CDATA[");
		sb.append(getScale());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _scale_id;
	private String _scale;
	private String _description;
	private BaseModel<?> _key_conservation_scale_lkpRemoteModel;
}