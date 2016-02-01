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

import com.iucn.whp.dbservice.service.potential_threat_assessment_catLocalServiceUtil;

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
public class potential_threat_assessment_catClp extends BaseModelImpl<potential_threat_assessment_cat>
	implements potential_threat_assessment_cat {
	public potential_threat_assessment_catClp() {
	}

	public Class<?> getModelClass() {
		return potential_threat_assessment_cat.class;
	}

	public String getModelClassName() {
		return potential_threat_assessment_cat.class.getName();
	}

	public long getPrimaryKey() {
		return _pot_threat_cat_id;
	}

	public void setPrimaryKey(long primaryKey) {
		setPot_threat_cat_id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_pot_threat_cat_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("pot_threat_cat_id", getPot_threat_cat_id());
		attributes.put("potential_threat_id", getPotential_threat_id());
		attributes.put("category_id", getCategory_id());
		attributes.put("sub_cat_id", getSub_cat_id());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long pot_threat_cat_id = (Long)attributes.get("pot_threat_cat_id");

		if (pot_threat_cat_id != null) {
			setPot_threat_cat_id(pot_threat_cat_id);
		}

		Long potential_threat_id = (Long)attributes.get("potential_threat_id");

		if (potential_threat_id != null) {
			setPotential_threat_id(potential_threat_id);
		}

		Long category_id = (Long)attributes.get("category_id");

		if (category_id != null) {
			setCategory_id(category_id);
		}

		Long sub_cat_id = (Long)attributes.get("sub_cat_id");

		if (sub_cat_id != null) {
			setSub_cat_id(sub_cat_id);
		}
	}

	public long getPot_threat_cat_id() {
		return _pot_threat_cat_id;
	}

	public void setPot_threat_cat_id(long pot_threat_cat_id) {
		_pot_threat_cat_id = pot_threat_cat_id;
	}

	public long getPotential_threat_id() {
		return _potential_threat_id;
	}

	public void setPotential_threat_id(long potential_threat_id) {
		_potential_threat_id = potential_threat_id;
	}

	public long getCategory_id() {
		return _category_id;
	}

	public void setCategory_id(long category_id) {
		_category_id = category_id;
	}

	public long getSub_cat_id() {
		return _sub_cat_id;
	}

	public void setSub_cat_id(long sub_cat_id) {
		_sub_cat_id = sub_cat_id;
	}

	public BaseModel<?> getpotential_threat_assessment_catRemoteModel() {
		return _potential_threat_assessment_catRemoteModel;
	}

	public void setpotential_threat_assessment_catRemoteModel(
		BaseModel<?> potential_threat_assessment_catRemoteModel) {
		_potential_threat_assessment_catRemoteModel = potential_threat_assessment_catRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			potential_threat_assessment_catLocalServiceUtil.addpotential_threat_assessment_cat(this);
		}
		else {
			potential_threat_assessment_catLocalServiceUtil.updatepotential_threat_assessment_cat(this);
		}
	}

	@Override
	public potential_threat_assessment_cat toEscapedModel() {
		return (potential_threat_assessment_cat)Proxy.newProxyInstance(potential_threat_assessment_cat.class.getClassLoader(),
			new Class[] { potential_threat_assessment_cat.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		potential_threat_assessment_catClp clone = new potential_threat_assessment_catClp();

		clone.setPot_threat_cat_id(getPot_threat_cat_id());
		clone.setPotential_threat_id(getPotential_threat_id());
		clone.setCategory_id(getCategory_id());
		clone.setSub_cat_id(getSub_cat_id());

		return clone;
	}

	public int compareTo(
		potential_threat_assessment_cat potential_threat_assessment_cat) {
		long primaryKey = potential_threat_assessment_cat.getPrimaryKey();

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

		potential_threat_assessment_catClp potential_threat_assessment_cat = null;

		try {
			potential_threat_assessment_cat = (potential_threat_assessment_catClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = potential_threat_assessment_cat.getPrimaryKey();

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
		StringBundler sb = new StringBundler(9);

		sb.append("{pot_threat_cat_id=");
		sb.append(getPot_threat_cat_id());
		sb.append(", potential_threat_id=");
		sb.append(getPotential_threat_id());
		sb.append(", category_id=");
		sb.append(getCategory_id());
		sb.append(", sub_cat_id=");
		sb.append(getSub_cat_id());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append(
			"com.iucn.whp.dbservice.model.potential_threat_assessment_cat");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>pot_threat_cat_id</column-name><column-value><![CDATA[");
		sb.append(getPot_threat_cat_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>potential_threat_id</column-name><column-value><![CDATA[");
		sb.append(getPotential_threat_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>category_id</column-name><column-value><![CDATA[");
		sb.append(getCategory_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sub_cat_id</column-name><column-value><![CDATA[");
		sb.append(getSub_cat_id());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _pot_threat_cat_id;
	private long _potential_threat_id;
	private long _category_id;
	private long _sub_cat_id;
	private BaseModel<?> _potential_threat_assessment_catRemoteModel;
}