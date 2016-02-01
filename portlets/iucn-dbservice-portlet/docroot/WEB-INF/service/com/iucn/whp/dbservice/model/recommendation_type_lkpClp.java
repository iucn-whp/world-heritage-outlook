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

import com.iucn.whp.dbservice.service.recommendation_type_lkpLocalServiceUtil;

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
public class recommendation_type_lkpClp extends BaseModelImpl<recommendation_type_lkp>
	implements recommendation_type_lkp {
	public recommendation_type_lkpClp() {
	}

	public Class<?> getModelClass() {
		return recommendation_type_lkp.class;
	}

	public String getModelClassName() {
		return recommendation_type_lkp.class.getName();
	}

	public int getPrimaryKey() {
		return _rec_type_id;
	}

	public void setPrimaryKey(int primaryKey) {
		setRec_type_id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Integer(_rec_type_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("rec_type_id", getRec_type_id());
		attributes.put("recommendation", getRecommendation());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer rec_type_id = (Integer)attributes.get("rec_type_id");

		if (rec_type_id != null) {
			setRec_type_id(rec_type_id);
		}

		String recommendation = (String)attributes.get("recommendation");

		if (recommendation != null) {
			setRecommendation(recommendation);
		}
	}

	public int getRec_type_id() {
		return _rec_type_id;
	}

	public void setRec_type_id(int rec_type_id) {
		_rec_type_id = rec_type_id;
	}

	public String getRecommendation() {
		return _recommendation;
	}

	public void setRecommendation(String recommendation) {
		_recommendation = recommendation;
	}

	public BaseModel<?> getrecommendation_type_lkpRemoteModel() {
		return _recommendation_type_lkpRemoteModel;
	}

	public void setrecommendation_type_lkpRemoteModel(
		BaseModel<?> recommendation_type_lkpRemoteModel) {
		_recommendation_type_lkpRemoteModel = recommendation_type_lkpRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			recommendation_type_lkpLocalServiceUtil.addrecommendation_type_lkp(this);
		}
		else {
			recommendation_type_lkpLocalServiceUtil.updaterecommendation_type_lkp(this);
		}
	}

	@Override
	public recommendation_type_lkp toEscapedModel() {
		return (recommendation_type_lkp)Proxy.newProxyInstance(recommendation_type_lkp.class.getClassLoader(),
			new Class[] { recommendation_type_lkp.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		recommendation_type_lkpClp clone = new recommendation_type_lkpClp();

		clone.setRec_type_id(getRec_type_id());
		clone.setRecommendation(getRecommendation());

		return clone;
	}

	public int compareTo(recommendation_type_lkp recommendation_type_lkp) {
		int primaryKey = recommendation_type_lkp.getPrimaryKey();

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

		recommendation_type_lkpClp recommendation_type_lkp = null;

		try {
			recommendation_type_lkp = (recommendation_type_lkpClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		int primaryKey = recommendation_type_lkp.getPrimaryKey();

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

		sb.append("{rec_type_id=");
		sb.append(getRec_type_id());
		sb.append(", recommendation=");
		sb.append(getRecommendation());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.recommendation_type_lkp");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>rec_type_id</column-name><column-value><![CDATA[");
		sb.append(getRec_type_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>recommendation</column-name><column-value><![CDATA[");
		sb.append(getRecommendation());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _rec_type_id;
	private String _recommendation;
	private BaseModel<?> _recommendation_type_lkpRemoteModel;
}