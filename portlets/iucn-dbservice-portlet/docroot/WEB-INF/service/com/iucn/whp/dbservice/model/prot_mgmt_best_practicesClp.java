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

import com.iucn.whp.dbservice.service.prot_mgmt_best_practicesLocalServiceUtil;

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
public class prot_mgmt_best_practicesClp extends BaseModelImpl<prot_mgmt_best_practices>
	implements prot_mgmt_best_practices {
	public prot_mgmt_best_practicesClp() {
	}

	public Class<?> getModelClass() {
		return prot_mgmt_best_practices.class;
	}

	public String getModelClassName() {
		return prot_mgmt_best_practices.class.getName();
	}

	public long getPrimaryKey() {
		return _best_practice_id;
	}

	public void setPrimaryKey(long primaryKey) {
		setBest_practice_id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_best_practice_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("best_practice_id", getBest_practice_id());
		attributes.put("assessment_version_id", getAssessment_version_id());
		attributes.put("description", getDescription());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long best_practice_id = (Long)attributes.get("best_practice_id");

		if (best_practice_id != null) {
			setBest_practice_id(best_practice_id);
		}

		Long assessment_version_id = (Long)attributes.get(
				"assessment_version_id");

		if (assessment_version_id != null) {
			setAssessment_version_id(assessment_version_id);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}
	}

	public long getBest_practice_id() {
		return _best_practice_id;
	}

	public void setBest_practice_id(long best_practice_id) {
		_best_practice_id = best_practice_id;
	}

	public long getAssessment_version_id() {
		return _assessment_version_id;
	}

	public void setAssessment_version_id(long assessment_version_id) {
		_assessment_version_id = assessment_version_id;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public BaseModel<?> getprot_mgmt_best_practicesRemoteModel() {
		return _prot_mgmt_best_practicesRemoteModel;
	}

	public void setprot_mgmt_best_practicesRemoteModel(
		BaseModel<?> prot_mgmt_best_practicesRemoteModel) {
		_prot_mgmt_best_practicesRemoteModel = prot_mgmt_best_practicesRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			prot_mgmt_best_practicesLocalServiceUtil.addprot_mgmt_best_practices(this);
		}
		else {
			prot_mgmt_best_practicesLocalServiceUtil.updateprot_mgmt_best_practices(this);
		}
	}

	@Override
	public prot_mgmt_best_practices toEscapedModel() {
		return (prot_mgmt_best_practices)Proxy.newProxyInstance(prot_mgmt_best_practices.class.getClassLoader(),
			new Class[] { prot_mgmt_best_practices.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		prot_mgmt_best_practicesClp clone = new prot_mgmt_best_practicesClp();

		clone.setBest_practice_id(getBest_practice_id());
		clone.setAssessment_version_id(getAssessment_version_id());
		clone.setDescription(getDescription());

		return clone;
	}

	public int compareTo(prot_mgmt_best_practices prot_mgmt_best_practices) {
		long primaryKey = prot_mgmt_best_practices.getPrimaryKey();

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

		prot_mgmt_best_practicesClp prot_mgmt_best_practices = null;

		try {
			prot_mgmt_best_practices = (prot_mgmt_best_practicesClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = prot_mgmt_best_practices.getPrimaryKey();

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

		sb.append("{best_practice_id=");
		sb.append(getBest_practice_id());
		sb.append(", assessment_version_id=");
		sb.append(getAssessment_version_id());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.prot_mgmt_best_practices");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>best_practice_id</column-name><column-value><![CDATA[");
		sb.append(getBest_practice_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>assessment_version_id</column-name><column-value><![CDATA[");
		sb.append(getAssessment_version_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _best_practice_id;
	private long _assessment_version_id;
	private String _description;
	private BaseModel<?> _prot_mgmt_best_practicesRemoteModel;
}