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

import com.iucn.whp.dbservice.service.benefits_type_refLocalServiceUtil;

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
public class benefits_type_refClp extends BaseModelImpl<benefits_type_ref>
	implements benefits_type_ref {
	public benefits_type_refClp() {
	}

	public Class<?> getModelClass() {
		return benefits_type_ref.class;
	}

	public String getModelClassName() {
		return benefits_type_ref.class.getName();
	}

	public long getPrimaryKey() {
		return _benefits_type_ref_id;
	}

	public void setPrimaryKey(long primaryKey) {
		setBenefits_type_ref_id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_benefits_type_ref_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("benefits_type_ref_id", getBenefits_type_ref_id());
		attributes.put("benefits_id", getBenefits_id());
		attributes.put("benefit_checktype", getBenefit_checktype());
		attributes.put("benefit_checksubtype", getBenefit_checksubtype());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long benefits_type_ref_id = (Long)attributes.get("benefits_type_ref_id");

		if (benefits_type_ref_id != null) {
			setBenefits_type_ref_id(benefits_type_ref_id);
		}

		Long benefits_id = (Long)attributes.get("benefits_id");

		if (benefits_id != null) {
			setBenefits_id(benefits_id);
		}

		Long benefit_checktype = (Long)attributes.get("benefit_checktype");

		if (benefit_checktype != null) {
			setBenefit_checktype(benefit_checktype);
		}

		Long benefit_checksubtype = (Long)attributes.get("benefit_checksubtype");

		if (benefit_checksubtype != null) {
			setBenefit_checksubtype(benefit_checksubtype);
		}
	}

	public long getBenefits_type_ref_id() {
		return _benefits_type_ref_id;
	}

	public void setBenefits_type_ref_id(long benefits_type_ref_id) {
		_benefits_type_ref_id = benefits_type_ref_id;
	}

	public long getBenefits_id() {
		return _benefits_id;
	}

	public void setBenefits_id(long benefits_id) {
		_benefits_id = benefits_id;
	}

	public long getBenefit_checktype() {
		return _benefit_checktype;
	}

	public void setBenefit_checktype(long benefit_checktype) {
		_benefit_checktype = benefit_checktype;
	}

	public long getBenefit_checksubtype() {
		return _benefit_checksubtype;
	}

	public void setBenefit_checksubtype(long benefit_checksubtype) {
		_benefit_checksubtype = benefit_checksubtype;
	}

	public BaseModel<?> getbenefits_type_refRemoteModel() {
		return _benefits_type_refRemoteModel;
	}

	public void setbenefits_type_refRemoteModel(
		BaseModel<?> benefits_type_refRemoteModel) {
		_benefits_type_refRemoteModel = benefits_type_refRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			benefits_type_refLocalServiceUtil.addbenefits_type_ref(this);
		}
		else {
			benefits_type_refLocalServiceUtil.updatebenefits_type_ref(this);
		}
	}

	@Override
	public benefits_type_ref toEscapedModel() {
		return (benefits_type_ref)Proxy.newProxyInstance(benefits_type_ref.class.getClassLoader(),
			new Class[] { benefits_type_ref.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		benefits_type_refClp clone = new benefits_type_refClp();

		clone.setBenefits_type_ref_id(getBenefits_type_ref_id());
		clone.setBenefits_id(getBenefits_id());
		clone.setBenefit_checktype(getBenefit_checktype());
		clone.setBenefit_checksubtype(getBenefit_checksubtype());

		return clone;
	}

	public int compareTo(benefits_type_ref benefits_type_ref) {
		long primaryKey = benefits_type_ref.getPrimaryKey();

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

		benefits_type_refClp benefits_type_ref = null;

		try {
			benefits_type_ref = (benefits_type_refClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = benefits_type_ref.getPrimaryKey();

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

		sb.append("{benefits_type_ref_id=");
		sb.append(getBenefits_type_ref_id());
		sb.append(", benefits_id=");
		sb.append(getBenefits_id());
		sb.append(", benefit_checktype=");
		sb.append(getBenefit_checktype());
		sb.append(", benefit_checksubtype=");
		sb.append(getBenefit_checksubtype());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.benefits_type_ref");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>benefits_type_ref_id</column-name><column-value><![CDATA[");
		sb.append(getBenefits_type_ref_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>benefits_id</column-name><column-value><![CDATA[");
		sb.append(getBenefits_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>benefit_checktype</column-name><column-value><![CDATA[");
		sb.append(getBenefit_checktype());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>benefit_checksubtype</column-name><column-value><![CDATA[");
		sb.append(getBenefit_checksubtype());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _benefits_type_ref_id;
	private long _benefits_id;
	private long _benefit_checktype;
	private long _benefit_checksubtype;
	private BaseModel<?> _benefits_type_refRemoteModel;
}