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

import com.iucn.whp.dbservice.service.understanding_benefits_lkpLocalServiceUtil;

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
public class understanding_benefits_lkpClp extends BaseModelImpl<understanding_benefits_lkp>
	implements understanding_benefits_lkp {
	public understanding_benefits_lkpClp() {
	}

	public Class<?> getModelClass() {
		return understanding_benefits_lkp.class;
	}

	public String getModelClassName() {
		return understanding_benefits_lkp.class.getName();
	}

	public long getPrimaryKey() {
		return _benefits_id;
	}

	public void setPrimaryKey(long primaryKey) {
		setBenefits_id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_benefits_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("benefits_id", getBenefits_id());
		attributes.put("selected_benefit", getSelected_benefit());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long benefits_id = (Long)attributes.get("benefits_id");

		if (benefits_id != null) {
			setBenefits_id(benefits_id);
		}

		String selected_benefit = (String)attributes.get("selected_benefit");

		if (selected_benefit != null) {
			setSelected_benefit(selected_benefit);
		}
	}

	public long getBenefits_id() {
		return _benefits_id;
	}

	public void setBenefits_id(long benefits_id) {
		_benefits_id = benefits_id;
	}

	public String getSelected_benefit() {
		return _selected_benefit;
	}

	public void setSelected_benefit(String selected_benefit) {
		_selected_benefit = selected_benefit;
	}

	public BaseModel<?> getunderstanding_benefits_lkpRemoteModel() {
		return _understanding_benefits_lkpRemoteModel;
	}

	public void setunderstanding_benefits_lkpRemoteModel(
		BaseModel<?> understanding_benefits_lkpRemoteModel) {
		_understanding_benefits_lkpRemoteModel = understanding_benefits_lkpRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			understanding_benefits_lkpLocalServiceUtil.addunderstanding_benefits_lkp(this);
		}
		else {
			understanding_benefits_lkpLocalServiceUtil.updateunderstanding_benefits_lkp(this);
		}
	}

	@Override
	public understanding_benefits_lkp toEscapedModel() {
		return (understanding_benefits_lkp)Proxy.newProxyInstance(understanding_benefits_lkp.class.getClassLoader(),
			new Class[] { understanding_benefits_lkp.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		understanding_benefits_lkpClp clone = new understanding_benefits_lkpClp();

		clone.setBenefits_id(getBenefits_id());
		clone.setSelected_benefit(getSelected_benefit());

		return clone;
	}

	public int compareTo(understanding_benefits_lkp understanding_benefits_lkp) {
		long primaryKey = understanding_benefits_lkp.getPrimaryKey();

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

		understanding_benefits_lkpClp understanding_benefits_lkp = null;

		try {
			understanding_benefits_lkp = (understanding_benefits_lkpClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = understanding_benefits_lkp.getPrimaryKey();

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
		StringBundler sb = new StringBundler(5);

		sb.append("{benefits_id=");
		sb.append(getBenefits_id());
		sb.append(", selected_benefit=");
		sb.append(getSelected_benefit());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.understanding_benefits_lkp");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>benefits_id</column-name><column-value><![CDATA[");
		sb.append(getBenefits_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>selected_benefit</column-name><column-value><![CDATA[");
		sb.append(getSelected_benefit());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _benefits_id;
	private String _selected_benefit;
	private BaseModel<?> _understanding_benefits_lkpRemoteModel;
}