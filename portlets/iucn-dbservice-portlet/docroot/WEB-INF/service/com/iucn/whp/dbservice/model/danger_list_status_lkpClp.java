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

import com.iucn.whp.dbservice.service.danger_list_status_lkpLocalServiceUtil;

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
public class danger_list_status_lkpClp extends BaseModelImpl<danger_list_status_lkp>
	implements danger_list_status_lkp {
	public danger_list_status_lkpClp() {
	}

	public Class<?> getModelClass() {
		return danger_list_status_lkp.class;
	}

	public String getModelClassName() {
		return danger_list_status_lkp.class.getName();
	}

	public int getPrimaryKey() {
		return _dlstatus_id;
	}

	public void setPrimaryKey(int primaryKey) {
		setDlstatus_id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Integer(_dlstatus_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("dlstatus_id", getDlstatus_id());
		attributes.put("dl_status", getDl_status());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer dlstatus_id = (Integer)attributes.get("dlstatus_id");

		if (dlstatus_id != null) {
			setDlstatus_id(dlstatus_id);
		}

		String dl_status = (String)attributes.get("dl_status");

		if (dl_status != null) {
			setDl_status(dl_status);
		}
	}

	public int getDlstatus_id() {
		return _dlstatus_id;
	}

	public void setDlstatus_id(int dlstatus_id) {
		_dlstatus_id = dlstatus_id;
	}

	public String getDl_status() {
		return _dl_status;
	}

	public void setDl_status(String dl_status) {
		_dl_status = dl_status;
	}

	public BaseModel<?> getdanger_list_status_lkpRemoteModel() {
		return _danger_list_status_lkpRemoteModel;
	}

	public void setdanger_list_status_lkpRemoteModel(
		BaseModel<?> danger_list_status_lkpRemoteModel) {
		_danger_list_status_lkpRemoteModel = danger_list_status_lkpRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			danger_list_status_lkpLocalServiceUtil.adddanger_list_status_lkp(this);
		}
		else {
			danger_list_status_lkpLocalServiceUtil.updatedanger_list_status_lkp(this);
		}
	}

	@Override
	public danger_list_status_lkp toEscapedModel() {
		return (danger_list_status_lkp)Proxy.newProxyInstance(danger_list_status_lkp.class.getClassLoader(),
			new Class[] { danger_list_status_lkp.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		danger_list_status_lkpClp clone = new danger_list_status_lkpClp();

		clone.setDlstatus_id(getDlstatus_id());
		clone.setDl_status(getDl_status());

		return clone;
	}

	public int compareTo(danger_list_status_lkp danger_list_status_lkp) {
		int primaryKey = danger_list_status_lkp.getPrimaryKey();

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

		danger_list_status_lkpClp danger_list_status_lkp = null;

		try {
			danger_list_status_lkp = (danger_list_status_lkpClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		int primaryKey = danger_list_status_lkp.getPrimaryKey();

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

		sb.append("{dlstatus_id=");
		sb.append(getDlstatus_id());
		sb.append(", dl_status=");
		sb.append(getDl_status());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.danger_list_status_lkp");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>dlstatus_id</column-name><column-value><![CDATA[");
		sb.append(getDlstatus_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dl_status</column-name><column-value><![CDATA[");
		sb.append(getDl_status());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _dlstatus_id;
	private String _dl_status;
	private BaseModel<?> _danger_list_status_lkpRemoteModel;
}