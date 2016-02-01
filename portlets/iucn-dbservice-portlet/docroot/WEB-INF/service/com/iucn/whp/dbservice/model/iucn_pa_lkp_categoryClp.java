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

import com.iucn.whp.dbservice.service.iucn_pa_lkp_categoryLocalServiceUtil;

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
public class iucn_pa_lkp_categoryClp extends BaseModelImpl<iucn_pa_lkp_category>
	implements iucn_pa_lkp_category {
	public iucn_pa_lkp_categoryClp() {
	}

	public Class<?> getModelClass() {
		return iucn_pa_lkp_category.class;
	}

	public String getModelClassName() {
		return iucn_pa_lkp_category.class.getName();
	}

	public int getPrimaryKey() {
		return _iucn_pa_category_id;
	}

	public void setPrimaryKey(int primaryKey) {
		setIucn_pa_category_id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Integer(_iucn_pa_category_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("iucn_pa_category_id", getIucn_pa_category_id());
		attributes.put("category", getCategory());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer iucn_pa_category_id = (Integer)attributes.get(
				"iucn_pa_category_id");

		if (iucn_pa_category_id != null) {
			setIucn_pa_category_id(iucn_pa_category_id);
		}

		String category = (String)attributes.get("category");

		if (category != null) {
			setCategory(category);
		}
	}

	public int getIucn_pa_category_id() {
		return _iucn_pa_category_id;
	}

	public void setIucn_pa_category_id(int iucn_pa_category_id) {
		_iucn_pa_category_id = iucn_pa_category_id;
	}

	public String getCategory() {
		return _category;
	}

	public void setCategory(String category) {
		_category = category;
	}

	public BaseModel<?> getiucn_pa_lkp_categoryRemoteModel() {
		return _iucn_pa_lkp_categoryRemoteModel;
	}

	public void setiucn_pa_lkp_categoryRemoteModel(
		BaseModel<?> iucn_pa_lkp_categoryRemoteModel) {
		_iucn_pa_lkp_categoryRemoteModel = iucn_pa_lkp_categoryRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			iucn_pa_lkp_categoryLocalServiceUtil.addiucn_pa_lkp_category(this);
		}
		else {
			iucn_pa_lkp_categoryLocalServiceUtil.updateiucn_pa_lkp_category(this);
		}
	}

	@Override
	public iucn_pa_lkp_category toEscapedModel() {
		return (iucn_pa_lkp_category)Proxy.newProxyInstance(iucn_pa_lkp_category.class.getClassLoader(),
			new Class[] { iucn_pa_lkp_category.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		iucn_pa_lkp_categoryClp clone = new iucn_pa_lkp_categoryClp();

		clone.setIucn_pa_category_id(getIucn_pa_category_id());
		clone.setCategory(getCategory());

		return clone;
	}

	public int compareTo(iucn_pa_lkp_category iucn_pa_lkp_category) {
		int primaryKey = iucn_pa_lkp_category.getPrimaryKey();

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

		iucn_pa_lkp_categoryClp iucn_pa_lkp_category = null;

		try {
			iucn_pa_lkp_category = (iucn_pa_lkp_categoryClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		int primaryKey = iucn_pa_lkp_category.getPrimaryKey();

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

		sb.append("{iucn_pa_category_id=");
		sb.append(getIucn_pa_category_id());
		sb.append(", category=");
		sb.append(getCategory());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.iucn_pa_lkp_category");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>iucn_pa_category_id</column-name><column-value><![CDATA[");
		sb.append(getIucn_pa_category_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>category</column-name><column-value><![CDATA[");
		sb.append(getCategory());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _iucn_pa_category_id;
	private String _category;
	private BaseModel<?> _iucn_pa_lkp_categoryRemoteModel;
}