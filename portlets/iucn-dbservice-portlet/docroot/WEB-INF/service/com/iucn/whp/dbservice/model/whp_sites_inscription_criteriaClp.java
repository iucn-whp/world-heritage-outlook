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

import com.iucn.whp.dbservice.service.whp_sites_inscription_criteriaLocalServiceUtil;

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
public class whp_sites_inscription_criteriaClp extends BaseModelImpl<whp_sites_inscription_criteria>
	implements whp_sites_inscription_criteria {
	public whp_sites_inscription_criteriaClp() {
	}

	public Class<?> getModelClass() {
		return whp_sites_inscription_criteria.class;
	}

	public String getModelClassName() {
		return whp_sites_inscription_criteria.class.getName();
	}

	public long getPrimaryKey() {
		return _whp_sites_inscription_criteria_id;
	}

	public void setPrimaryKey(long primaryKey) {
		setWhp_sites_inscription_criteria_id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_whp_sites_inscription_criteria_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("whp_sites_inscription_criteria_id",
			getWhp_sites_inscription_criteria_id());
		attributes.put("site_id", getSite_id());
		attributes.put("criteria_id", getCriteria_id());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long whp_sites_inscription_criteria_id = (Long)attributes.get(
				"whp_sites_inscription_criteria_id");

		if (whp_sites_inscription_criteria_id != null) {
			setWhp_sites_inscription_criteria_id(whp_sites_inscription_criteria_id);
		}

		Long site_id = (Long)attributes.get("site_id");

		if (site_id != null) {
			setSite_id(site_id);
		}

		Integer criteria_id = (Integer)attributes.get("criteria_id");

		if (criteria_id != null) {
			setCriteria_id(criteria_id);
		}
	}

	public long getWhp_sites_inscription_criteria_id() {
		return _whp_sites_inscription_criteria_id;
	}

	public void setWhp_sites_inscription_criteria_id(
		long whp_sites_inscription_criteria_id) {
		_whp_sites_inscription_criteria_id = whp_sites_inscription_criteria_id;
	}

	public long getSite_id() {
		return _site_id;
	}

	public void setSite_id(long site_id) {
		_site_id = site_id;
	}

	public int getCriteria_id() {
		return _criteria_id;
	}

	public void setCriteria_id(int criteria_id) {
		_criteria_id = criteria_id;
	}

	public BaseModel<?> getwhp_sites_inscription_criteriaRemoteModel() {
		return _whp_sites_inscription_criteriaRemoteModel;
	}

	public void setwhp_sites_inscription_criteriaRemoteModel(
		BaseModel<?> whp_sites_inscription_criteriaRemoteModel) {
		_whp_sites_inscription_criteriaRemoteModel = whp_sites_inscription_criteriaRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			whp_sites_inscription_criteriaLocalServiceUtil.addwhp_sites_inscription_criteria(this);
		}
		else {
			whp_sites_inscription_criteriaLocalServiceUtil.updatewhp_sites_inscription_criteria(this);
		}
	}

	@Override
	public whp_sites_inscription_criteria toEscapedModel() {
		return (whp_sites_inscription_criteria)Proxy.newProxyInstance(whp_sites_inscription_criteria.class.getClassLoader(),
			new Class[] { whp_sites_inscription_criteria.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		whp_sites_inscription_criteriaClp clone = new whp_sites_inscription_criteriaClp();

		clone.setWhp_sites_inscription_criteria_id(getWhp_sites_inscription_criteria_id());
		clone.setSite_id(getSite_id());
		clone.setCriteria_id(getCriteria_id());

		return clone;
	}

	public int compareTo(
		whp_sites_inscription_criteria whp_sites_inscription_criteria) {
		long primaryKey = whp_sites_inscription_criteria.getPrimaryKey();

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

		whp_sites_inscription_criteriaClp whp_sites_inscription_criteria = null;

		try {
			whp_sites_inscription_criteria = (whp_sites_inscription_criteriaClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = whp_sites_inscription_criteria.getPrimaryKey();

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

		sb.append("{whp_sites_inscription_criteria_id=");
		sb.append(getWhp_sites_inscription_criteria_id());
		sb.append(", site_id=");
		sb.append(getSite_id());
		sb.append(", criteria_id=");
		sb.append(getCriteria_id());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.whp_sites_inscription_criteria");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>whp_sites_inscription_criteria_id</column-name><column-value><![CDATA[");
		sb.append(getWhp_sites_inscription_criteria_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>site_id</column-name><column-value><![CDATA[");
		sb.append(getSite_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>criteria_id</column-name><column-value><![CDATA[");
		sb.append(getCriteria_id());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _whp_sites_inscription_criteria_id;
	private long _site_id;
	private int _criteria_id;
	private BaseModel<?> _whp_sites_inscription_criteriaRemoteModel;
}