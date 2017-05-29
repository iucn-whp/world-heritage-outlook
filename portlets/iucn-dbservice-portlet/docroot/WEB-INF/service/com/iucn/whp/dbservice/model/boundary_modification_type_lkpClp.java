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

import com.iucn.whp.dbservice.service.boundary_modification_type_lkpLocalServiceUtil;

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
public class boundary_modification_type_lkpClp extends BaseModelImpl<boundary_modification_type_lkp>
	implements boundary_modification_type_lkp {
	public boundary_modification_type_lkpClp() {
	}

	public Class<?> getModelClass() {
		return boundary_modification_type_lkp.class;
	}

	public String getModelClassName() {
		return boundary_modification_type_lkp.class.getName();
	}

	public int getPrimaryKey() {
		return _bm_id;
	}

	public void setPrimaryKey(int primaryKey) {
		setBm_id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Integer(_bm_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("bm_id", getBm_id());
		attributes.put("bm_type", getBm_type());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer bm_id = (Integer)attributes.get("bm_id");

		if (bm_id != null) {
			setBm_id(bm_id);
		}

		String bm_type = (String)attributes.get("bm_type");

		if (bm_type != null) {
			setBm_type(bm_type);
		}
	}

	public int getBm_id() {
		return _bm_id;
	}

	public void setBm_id(int bm_id) {
		_bm_id = bm_id;
	}

	public String getBm_type() {
		return _bm_type;
	}

	public void setBm_type(String bm_type) {
		_bm_type = bm_type;
	}

	public BaseModel<?> getboundary_modification_type_lkpRemoteModel() {
		return _boundary_modification_type_lkpRemoteModel;
	}

	public void setboundary_modification_type_lkpRemoteModel(
		BaseModel<?> boundary_modification_type_lkpRemoteModel) {
		_boundary_modification_type_lkpRemoteModel = boundary_modification_type_lkpRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			boundary_modification_type_lkpLocalServiceUtil.addboundary_modification_type_lkp(this);
		}
		else {
			boundary_modification_type_lkpLocalServiceUtil.updateboundary_modification_type_lkp(this);
		}
	}

	@Override
	public boundary_modification_type_lkp toEscapedModel() {
		return (boundary_modification_type_lkp)Proxy.newProxyInstance(boundary_modification_type_lkp.class.getClassLoader(),
			new Class[] { boundary_modification_type_lkp.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		boundary_modification_type_lkpClp clone = new boundary_modification_type_lkpClp();

		clone.setBm_id(getBm_id());
		clone.setBm_type(getBm_type());

		return clone;
	}

	public int compareTo(
		boundary_modification_type_lkp boundary_modification_type_lkp) {
		int primaryKey = boundary_modification_type_lkp.getPrimaryKey();

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

		boundary_modification_type_lkpClp boundary_modification_type_lkp = null;

		try {
			boundary_modification_type_lkp = (boundary_modification_type_lkpClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		int primaryKey = boundary_modification_type_lkp.getPrimaryKey();

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
		StringBundler sb = new StringBundler(5);

		sb.append("{bm_id=");
		sb.append(getBm_id());
		sb.append(", bm_type=");
		sb.append(getBm_type());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.boundary_modification_type_lkp");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>bm_id</column-name><column-value><![CDATA[");
		sb.append(getBm_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>bm_type</column-name><column-value><![CDATA[");
		sb.append(getBm_type());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _bm_id;
	private String _bm_type;
	private BaseModel<?> _boundary_modification_type_lkpRemoteModel;
}