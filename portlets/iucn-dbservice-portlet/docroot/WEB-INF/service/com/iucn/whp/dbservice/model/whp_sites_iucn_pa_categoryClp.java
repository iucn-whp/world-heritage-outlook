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

import com.iucn.whp.dbservice.service.whp_sites_iucn_pa_categoryLocalServiceUtil;

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
public class whp_sites_iucn_pa_categoryClp extends BaseModelImpl<whp_sites_iucn_pa_category>
	implements whp_sites_iucn_pa_category {
	public whp_sites_iucn_pa_categoryClp() {
	}

	public Class<?> getModelClass() {
		return whp_sites_iucn_pa_category.class;
	}

	public String getModelClassName() {
		return whp_sites_iucn_pa_category.class.getName();
	}

	public long getPrimaryKey() {
		return _whp_sites_iucn_pa_category_id;
	}

	public void setPrimaryKey(long primaryKey) {
		setWhp_sites_iucn_pa_category_id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_whp_sites_iucn_pa_category_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("whp_sites_iucn_pa_category_id",
			getWhp_sites_iucn_pa_category_id());
		attributes.put("site_id", getSite_id());
		attributes.put("iucn_pa_category_id", getIucn_pa_category_id());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long whp_sites_iucn_pa_category_id = (Long)attributes.get(
				"whp_sites_iucn_pa_category_id");

		if (whp_sites_iucn_pa_category_id != null) {
			setWhp_sites_iucn_pa_category_id(whp_sites_iucn_pa_category_id);
		}

		Long site_id = (Long)attributes.get("site_id");

		if (site_id != null) {
			setSite_id(site_id);
		}

		Integer iucn_pa_category_id = (Integer)attributes.get(
				"iucn_pa_category_id");

		if (iucn_pa_category_id != null) {
			setIucn_pa_category_id(iucn_pa_category_id);
		}
	}

	public long getWhp_sites_iucn_pa_category_id() {
		return _whp_sites_iucn_pa_category_id;
	}

	public void setWhp_sites_iucn_pa_category_id(
		long whp_sites_iucn_pa_category_id) {
		_whp_sites_iucn_pa_category_id = whp_sites_iucn_pa_category_id;
	}

	public long getSite_id() {
		return _site_id;
	}

	public void setSite_id(long site_id) {
		_site_id = site_id;
	}

	public int getIucn_pa_category_id() {
		return _iucn_pa_category_id;
	}

	public void setIucn_pa_category_id(int iucn_pa_category_id) {
		_iucn_pa_category_id = iucn_pa_category_id;
	}

	public BaseModel<?> getwhp_sites_iucn_pa_categoryRemoteModel() {
		return _whp_sites_iucn_pa_categoryRemoteModel;
	}

	public void setwhp_sites_iucn_pa_categoryRemoteModel(
		BaseModel<?> whp_sites_iucn_pa_categoryRemoteModel) {
		_whp_sites_iucn_pa_categoryRemoteModel = whp_sites_iucn_pa_categoryRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			whp_sites_iucn_pa_categoryLocalServiceUtil.addwhp_sites_iucn_pa_category(this);
		}
		else {
			whp_sites_iucn_pa_categoryLocalServiceUtil.updatewhp_sites_iucn_pa_category(this);
		}
	}

	@Override
	public whp_sites_iucn_pa_category toEscapedModel() {
		return (whp_sites_iucn_pa_category)Proxy.newProxyInstance(whp_sites_iucn_pa_category.class.getClassLoader(),
			new Class[] { whp_sites_iucn_pa_category.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		whp_sites_iucn_pa_categoryClp clone = new whp_sites_iucn_pa_categoryClp();

		clone.setWhp_sites_iucn_pa_category_id(getWhp_sites_iucn_pa_category_id());
		clone.setSite_id(getSite_id());
		clone.setIucn_pa_category_id(getIucn_pa_category_id());

		return clone;
	}

	public int compareTo(whp_sites_iucn_pa_category whp_sites_iucn_pa_category) {
		long primaryKey = whp_sites_iucn_pa_category.getPrimaryKey();

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

		whp_sites_iucn_pa_categoryClp whp_sites_iucn_pa_category = null;

		try {
			whp_sites_iucn_pa_category = (whp_sites_iucn_pa_categoryClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = whp_sites_iucn_pa_category.getPrimaryKey();

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

		sb.append("{whp_sites_iucn_pa_category_id=");
		sb.append(getWhp_sites_iucn_pa_category_id());
		sb.append(", site_id=");
		sb.append(getSite_id());
		sb.append(", iucn_pa_category_id=");
		sb.append(getIucn_pa_category_id());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.whp_sites_iucn_pa_category");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>whp_sites_iucn_pa_category_id</column-name><column-value><![CDATA[");
		sb.append(getWhp_sites_iucn_pa_category_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>site_id</column-name><column-value><![CDATA[");
		sb.append(getSite_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>iucn_pa_category_id</column-name><column-value><![CDATA[");
		sb.append(getIucn_pa_category_id());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _whp_sites_iucn_pa_category_id;
	private long _site_id;
	private int _iucn_pa_category_id;
	private BaseModel<?> _whp_sites_iucn_pa_categoryRemoteModel;
}