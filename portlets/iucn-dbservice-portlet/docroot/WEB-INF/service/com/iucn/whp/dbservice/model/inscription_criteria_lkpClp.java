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

import com.iucn.whp.dbservice.service.inscription_criteria_lkpLocalServiceUtil;

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
public class inscription_criteria_lkpClp extends BaseModelImpl<inscription_criteria_lkp>
	implements inscription_criteria_lkp {
	public inscription_criteria_lkpClp() {
	}

	public Class<?> getModelClass() {
		return inscription_criteria_lkp.class;
	}

	public String getModelClassName() {
		return inscription_criteria_lkp.class.getName();
	}

	public int getPrimaryKey() {
		return _criteria_id;
	}

	public void setPrimaryKey(int primaryKey) {
		setCriteria_id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Integer(_criteria_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("criteria_id", getCriteria_id());
		attributes.put("criteria", getCriteria());
		attributes.put("criteria_type", getCriteria_type());
		attributes.put("criteria_desc", getCriteria_desc());
		attributes.put("criteria_title", getCriteria_title());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer criteria_id = (Integer)attributes.get("criteria_id");

		if (criteria_id != null) {
			setCriteria_id(criteria_id);
		}

		String criteria = (String)attributes.get("criteria");

		if (criteria != null) {
			setCriteria(criteria);
		}

		String criteria_type = (String)attributes.get("criteria_type");

		if (criteria_type != null) {
			setCriteria_type(criteria_type);
		}

		String criteria_desc = (String)attributes.get("criteria_desc");

		if (criteria_desc != null) {
			setCriteria_desc(criteria_desc);
		}

		String criteria_title = (String)attributes.get("criteria_title");

		if (criteria_title != null) {
			setCriteria_title(criteria_title);
		}
	}

	public int getCriteria_id() {
		return _criteria_id;
	}

	public void setCriteria_id(int criteria_id) {
		_criteria_id = criteria_id;
	}

	public String getCriteria() {
		return _criteria;
	}

	public void setCriteria(String criteria) {
		_criteria = criteria;
	}

	public String getCriteria_type() {
		return _criteria_type;
	}

	public void setCriteria_type(String criteria_type) {
		_criteria_type = criteria_type;
	}

	public String getCriteria_desc() {
		return _criteria_desc;
	}

	public void setCriteria_desc(String criteria_desc) {
		_criteria_desc = criteria_desc;
	}

	public String getCriteria_title() {
		return _criteria_title;
	}

	public void setCriteria_title(String criteria_title) {
		_criteria_title = criteria_title;
	}

	public BaseModel<?> getinscription_criteria_lkpRemoteModel() {
		return _inscription_criteria_lkpRemoteModel;
	}

	public void setinscription_criteria_lkpRemoteModel(
		BaseModel<?> inscription_criteria_lkpRemoteModel) {
		_inscription_criteria_lkpRemoteModel = inscription_criteria_lkpRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			inscription_criteria_lkpLocalServiceUtil.addinscription_criteria_lkp(this);
		}
		else {
			inscription_criteria_lkpLocalServiceUtil.updateinscription_criteria_lkp(this);
		}
	}

	@Override
	public inscription_criteria_lkp toEscapedModel() {
		return (inscription_criteria_lkp)Proxy.newProxyInstance(inscription_criteria_lkp.class.getClassLoader(),
			new Class[] { inscription_criteria_lkp.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		inscription_criteria_lkpClp clone = new inscription_criteria_lkpClp();

		clone.setCriteria_id(getCriteria_id());
		clone.setCriteria(getCriteria());
		clone.setCriteria_type(getCriteria_type());
		clone.setCriteria_desc(getCriteria_desc());
		clone.setCriteria_title(getCriteria_title());

		return clone;
	}

	public int compareTo(inscription_criteria_lkp inscription_criteria_lkp) {
		int primaryKey = inscription_criteria_lkp.getPrimaryKey();

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

		inscription_criteria_lkpClp inscription_criteria_lkp = null;

		try {
			inscription_criteria_lkp = (inscription_criteria_lkpClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		int primaryKey = inscription_criteria_lkp.getPrimaryKey();

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
		StringBundler sb = new StringBundler(11);

		sb.append("{criteria_id=");
		sb.append(getCriteria_id());
		sb.append(", criteria=");
		sb.append(getCriteria());
		sb.append(", criteria_type=");
		sb.append(getCriteria_type());
		sb.append(", criteria_desc=");
		sb.append(getCriteria_desc());
		sb.append(", criteria_title=");
		sb.append(getCriteria_title());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.inscription_criteria_lkp");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>criteria_id</column-name><column-value><![CDATA[");
		sb.append(getCriteria_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>criteria</column-name><column-value><![CDATA[");
		sb.append(getCriteria());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>criteria_type</column-name><column-value><![CDATA[");
		sb.append(getCriteria_type());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>criteria_desc</column-name><column-value><![CDATA[");
		sb.append(getCriteria_desc());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>criteria_title</column-name><column-value><![CDATA[");
		sb.append(getCriteria_title());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _criteria_id;
	private String _criteria;
	private String _criteria_type;
	private String _criteria_desc;
	private String _criteria_title;
	private BaseModel<?> _inscription_criteria_lkpRemoteModel;
}