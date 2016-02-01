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

import com.iucn.whp.dbservice.service.assessment_lang_versionLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author alok.sen
 */
public class assessment_lang_versionClp extends BaseModelImpl<assessment_lang_version>
	implements assessment_lang_version {
	public assessment_lang_versionClp() {
	}

	public Class<?> getModelClass() {
		return assessment_lang_version.class;
	}

	public String getModelClassName() {
		return assessment_lang_version.class.getName();
	}

	public long getPrimaryKey() {
		return _lang_ver_id;
	}

	public void setPrimaryKey(long primaryKey) {
		setLang_ver_id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_lang_ver_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("lang_ver_id", getLang_ver_id());
		attributes.put("assessmentid", getAssessmentid());
		attributes.put("assessment_version_id", getAssessment_version_id());
		attributes.put("languageid", getLanguageid());
		attributes.put("published", getPublished());
		attributes.put("published_date", getPublished_date());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long lang_ver_id = (Long)attributes.get("lang_ver_id");

		if (lang_ver_id != null) {
			setLang_ver_id(lang_ver_id);
		}

		Long assessmentid = (Long)attributes.get("assessmentid");

		if (assessmentid != null) {
			setAssessmentid(assessmentid);
		}

		Long assessment_version_id = (Long)attributes.get(
				"assessment_version_id");

		if (assessment_version_id != null) {
			setAssessment_version_id(assessment_version_id);
		}

		Long languageid = (Long)attributes.get("languageid");

		if (languageid != null) {
			setLanguageid(languageid);
		}

		Boolean published = (Boolean)attributes.get("published");

		if (published != null) {
			setPublished(published);
		}

		Date published_date = (Date)attributes.get("published_date");

		if (published_date != null) {
			setPublished_date(published_date);
		}
	}

	public long getLang_ver_id() {
		return _lang_ver_id;
	}

	public void setLang_ver_id(long lang_ver_id) {
		_lang_ver_id = lang_ver_id;
	}

	public long getAssessmentid() {
		return _assessmentid;
	}

	public void setAssessmentid(long assessmentid) {
		_assessmentid = assessmentid;
	}

	public long getAssessment_version_id() {
		return _assessment_version_id;
	}

	public void setAssessment_version_id(long assessment_version_id) {
		_assessment_version_id = assessment_version_id;
	}

	public long getLanguageid() {
		return _languageid;
	}

	public void setLanguageid(long languageid) {
		_languageid = languageid;
	}

	public boolean getPublished() {
		return _published;
	}

	public boolean isPublished() {
		return _published;
	}

	public void setPublished(boolean published) {
		_published = published;
	}

	public Date getPublished_date() {
		return _published_date;
	}

	public void setPublished_date(Date published_date) {
		_published_date = published_date;
	}

	public BaseModel<?> getassessment_lang_versionRemoteModel() {
		return _assessment_lang_versionRemoteModel;
	}

	public void setassessment_lang_versionRemoteModel(
		BaseModel<?> assessment_lang_versionRemoteModel) {
		_assessment_lang_versionRemoteModel = assessment_lang_versionRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			assessment_lang_versionLocalServiceUtil.addassessment_lang_version(this);
		}
		else {
			assessment_lang_versionLocalServiceUtil.updateassessment_lang_version(this);
		}
	}

	@Override
	public assessment_lang_version toEscapedModel() {
		return (assessment_lang_version)Proxy.newProxyInstance(assessment_lang_version.class.getClassLoader(),
			new Class[] { assessment_lang_version.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		assessment_lang_versionClp clone = new assessment_lang_versionClp();

		clone.setLang_ver_id(getLang_ver_id());
		clone.setAssessmentid(getAssessmentid());
		clone.setAssessment_version_id(getAssessment_version_id());
		clone.setLanguageid(getLanguageid());
		clone.setPublished(getPublished());
		clone.setPublished_date(getPublished_date());

		return clone;
	}

	public int compareTo(assessment_lang_version assessment_lang_version) {
		long primaryKey = assessment_lang_version.getPrimaryKey();

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

		assessment_lang_versionClp assessment_lang_version = null;

		try {
			assessment_lang_version = (assessment_lang_versionClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = assessment_lang_version.getPrimaryKey();

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
		StringBundler sb = new StringBundler(13);

		sb.append("{lang_ver_id=");
		sb.append(getLang_ver_id());
		sb.append(", assessmentid=");
		sb.append(getAssessmentid());
		sb.append(", assessment_version_id=");
		sb.append(getAssessment_version_id());
		sb.append(", languageid=");
		sb.append(getLanguageid());
		sb.append(", published=");
		sb.append(getPublished());
		sb.append(", published_date=");
		sb.append(getPublished_date());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(22);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.assessment_lang_version");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>lang_ver_id</column-name><column-value><![CDATA[");
		sb.append(getLang_ver_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>assessmentid</column-name><column-value><![CDATA[");
		sb.append(getAssessmentid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>assessment_version_id</column-name><column-value><![CDATA[");
		sb.append(getAssessment_version_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>languageid</column-name><column-value><![CDATA[");
		sb.append(getLanguageid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>published</column-name><column-value><![CDATA[");
		sb.append(getPublished());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>published_date</column-name><column-value><![CDATA[");
		sb.append(getPublished_date());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _lang_ver_id;
	private long _assessmentid;
	private long _assessment_version_id;
	private long _languageid;
	private boolean _published;
	private Date _published_date;
	private BaseModel<?> _assessment_lang_versionRemoteModel;
}