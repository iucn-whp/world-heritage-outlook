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

import com.iucn.whp.dbservice.service.assessment_lang_lkpLocalServiceUtil;

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
public class assessment_lang_lkpClp extends BaseModelImpl<assessment_lang_lkp>
	implements assessment_lang_lkp {
	public assessment_lang_lkpClp() {
	}

	public Class<?> getModelClass() {
		return assessment_lang_lkp.class;
	}

	public String getModelClassName() {
		return assessment_lang_lkp.class.getName();
	}

	public long getPrimaryKey() {
		return _languageid;
	}

	public void setPrimaryKey(long primaryKey) {
		setLanguageid(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_languageid);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("languageid", getLanguageid());
		attributes.put("languagecode", getLanguagecode());
		attributes.put("languagename", getLanguagename());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long languageid = (Long)attributes.get("languageid");

		if (languageid != null) {
			setLanguageid(languageid);
		}

		String languagecode = (String)attributes.get("languagecode");

		if (languagecode != null) {
			setLanguagecode(languagecode);
		}

		String languagename = (String)attributes.get("languagename");

		if (languagename != null) {
			setLanguagename(languagename);
		}
	}

	public long getLanguageid() {
		return _languageid;
	}

	public void setLanguageid(long languageid) {
		_languageid = languageid;
	}

	public String getLanguagecode() {
		return _languagecode;
	}

	public void setLanguagecode(String languagecode) {
		_languagecode = languagecode;
	}

	public String getLanguagename() {
		return _languagename;
	}

	public void setLanguagename(String languagename) {
		_languagename = languagename;
	}

	public BaseModel<?> getassessment_lang_lkpRemoteModel() {
		return _assessment_lang_lkpRemoteModel;
	}

	public void setassessment_lang_lkpRemoteModel(
		BaseModel<?> assessment_lang_lkpRemoteModel) {
		_assessment_lang_lkpRemoteModel = assessment_lang_lkpRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			assessment_lang_lkpLocalServiceUtil.addassessment_lang_lkp(this);
		}
		else {
			assessment_lang_lkpLocalServiceUtil.updateassessment_lang_lkp(this);
		}
	}

	@Override
	public assessment_lang_lkp toEscapedModel() {
		return (assessment_lang_lkp)Proxy.newProxyInstance(assessment_lang_lkp.class.getClassLoader(),
			new Class[] { assessment_lang_lkp.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		assessment_lang_lkpClp clone = new assessment_lang_lkpClp();

		clone.setLanguageid(getLanguageid());
		clone.setLanguagecode(getLanguagecode());
		clone.setLanguagename(getLanguagename());

		return clone;
	}

	public int compareTo(assessment_lang_lkp assessment_lang_lkp) {
		long primaryKey = assessment_lang_lkp.getPrimaryKey();

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

		assessment_lang_lkpClp assessment_lang_lkp = null;

		try {
			assessment_lang_lkp = (assessment_lang_lkpClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = assessment_lang_lkp.getPrimaryKey();

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

		sb.append("{languageid=");
		sb.append(getLanguageid());
		sb.append(", languagecode=");
		sb.append(getLanguagecode());
		sb.append(", languagename=");
		sb.append(getLanguagename());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.assessment_lang_lkp");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>languageid</column-name><column-value><![CDATA[");
		sb.append(getLanguageid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>languagecode</column-name><column-value><![CDATA[");
		sb.append(getLanguagecode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>languagename</column-name><column-value><![CDATA[");
		sb.append(getLanguagename());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _languageid;
	private String _languagecode;
	private String _languagename;
	private BaseModel<?> _assessment_lang_lkpRemoteModel;
}