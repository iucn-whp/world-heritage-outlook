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

import com.iucn.whp.dbservice.service.site_assessment_versionsLocalServiceUtil;

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
public class site_assessment_versionsClp extends BaseModelImpl<site_assessment_versions>
	implements site_assessment_versions {
	public site_assessment_versionsClp() {
	}

	public Class<?> getModelClass() {
		return site_assessment_versions.class;
	}

	public String getModelClassName() {
		return site_assessment_versions.class.getName();
	}

	public long getPrimaryKey() {
		return _assessment_version_id;
	}

	public void setPrimaryKey(long primaryKey) {
		setAssessment_version_id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_assessment_version_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("assessment_version_id", getAssessment_version_id());
		attributes.put("stage_id", getStage_id());
		attributes.put("assessment_id", getAssessment_id());
		attributes.put("start_date", getStart_date());
		attributes.put("end_date", getEnd_date());
		attributes.put("userid", getUserid());
		attributes.put("initiation_date", getInitiation_date());
		attributes.put("language", getLanguage());
		attributes.put("version_code", getVersion_code());
		attributes.put("is_translated", getIs_translated());
		attributes.put("parent_assessment_versionid",
			getParent_assessment_versionid());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long assessment_version_id = (Long)attributes.get(
				"assessment_version_id");

		if (assessment_version_id != null) {
			setAssessment_version_id(assessment_version_id);
		}

		Long stage_id = (Long)attributes.get("stage_id");

		if (stage_id != null) {
			setStage_id(stage_id);
		}

		Long assessment_id = (Long)attributes.get("assessment_id");

		if (assessment_id != null) {
			setAssessment_id(assessment_id);
		}

		Date start_date = (Date)attributes.get("start_date");

		if (start_date != null) {
			setStart_date(start_date);
		}

		Date end_date = (Date)attributes.get("end_date");

		if (end_date != null) {
			setEnd_date(end_date);
		}

		Long userid = (Long)attributes.get("userid");

		if (userid != null) {
			setUserid(userid);
		}

		Date initiation_date = (Date)attributes.get("initiation_date");

		if (initiation_date != null) {
			setInitiation_date(initiation_date);
		}

		Long language = (Long)attributes.get("language");

		if (language != null) {
			setLanguage(language);
		}

		Double version_code = (Double)attributes.get("version_code");

		if (version_code != null) {
			setVersion_code(version_code);
		}

		Boolean is_translated = (Boolean)attributes.get("is_translated");

		if (is_translated != null) {
			setIs_translated(is_translated);
		}

		Long parent_assessment_versionid = (Long)attributes.get(
				"parent_assessment_versionid");

		if (parent_assessment_versionid != null) {
			setParent_assessment_versionid(parent_assessment_versionid);
		}
	}

	public long getAssessment_version_id() {
		return _assessment_version_id;
	}

	public void setAssessment_version_id(long assessment_version_id) {
		_assessment_version_id = assessment_version_id;
	}

	public long getStage_id() {
		return _stage_id;
	}

	public void setStage_id(long stage_id) {
		_stage_id = stage_id;
	}

	public long getAssessment_id() {
		return _assessment_id;
	}

	public void setAssessment_id(long assessment_id) {
		_assessment_id = assessment_id;
	}

	public Date getStart_date() {
		return _start_date;
	}

	public void setStart_date(Date start_date) {
		_start_date = start_date;
	}

	public Date getEnd_date() {
		return _end_date;
	}

	public void setEnd_date(Date end_date) {
		_end_date = end_date;
	}

	public long getUserid() {
		return _userid;
	}

	public void setUserid(long userid) {
		_userid = userid;
	}

	public Date getInitiation_date() {
		return _initiation_date;
	}

	public void setInitiation_date(Date initiation_date) {
		_initiation_date = initiation_date;
	}

	public long getLanguage() {
		return _language;
	}

	public void setLanguage(long language) {
		_language = language;
	}

	public double getVersion_code() {
		return _version_code;
	}

	public void setVersion_code(double version_code) {
		_version_code = version_code;
	}

	public boolean getIs_translated() {
		return _is_translated;
	}

	public boolean isIs_translated() {
		return _is_translated;
	}

	public void setIs_translated(boolean is_translated) {
		_is_translated = is_translated;
	}

	public long getParent_assessment_versionid() {
		return _parent_assessment_versionid;
	}

	public void setParent_assessment_versionid(long parent_assessment_versionid) {
		_parent_assessment_versionid = parent_assessment_versionid;
	}

	public BaseModel<?> getsite_assessment_versionsRemoteModel() {
		return _site_assessment_versionsRemoteModel;
	}

	public void setsite_assessment_versionsRemoteModel(
		BaseModel<?> site_assessment_versionsRemoteModel) {
		_site_assessment_versionsRemoteModel = site_assessment_versionsRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			site_assessment_versionsLocalServiceUtil.addsite_assessment_versions(this);
		}
		else {
			site_assessment_versionsLocalServiceUtil.updatesite_assessment_versions(this);
		}
	}

	@Override
	public site_assessment_versions toEscapedModel() {
		return (site_assessment_versions)Proxy.newProxyInstance(site_assessment_versions.class.getClassLoader(),
			new Class[] { site_assessment_versions.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		site_assessment_versionsClp clone = new site_assessment_versionsClp();

		clone.setAssessment_version_id(getAssessment_version_id());
		clone.setStage_id(getStage_id());
		clone.setAssessment_id(getAssessment_id());
		clone.setStart_date(getStart_date());
		clone.setEnd_date(getEnd_date());
		clone.setUserid(getUserid());
		clone.setInitiation_date(getInitiation_date());
		clone.setLanguage(getLanguage());
		clone.setVersion_code(getVersion_code());
		clone.setIs_translated(getIs_translated());
		clone.setParent_assessment_versionid(getParent_assessment_versionid());

		return clone;
	}

	public int compareTo(site_assessment_versions site_assessment_versions) {
		long primaryKey = site_assessment_versions.getPrimaryKey();

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

		site_assessment_versionsClp site_assessment_versions = null;

		try {
			site_assessment_versions = (site_assessment_versionsClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = site_assessment_versions.getPrimaryKey();

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
		StringBundler sb = new StringBundler(23);

		sb.append("{assessment_version_id=");
		sb.append(getAssessment_version_id());
		sb.append(", stage_id=");
		sb.append(getStage_id());
		sb.append(", assessment_id=");
		sb.append(getAssessment_id());
		sb.append(", start_date=");
		sb.append(getStart_date());
		sb.append(", end_date=");
		sb.append(getEnd_date());
		sb.append(", userid=");
		sb.append(getUserid());
		sb.append(", initiation_date=");
		sb.append(getInitiation_date());
		sb.append(", language=");
		sb.append(getLanguage());
		sb.append(", version_code=");
		sb.append(getVersion_code());
		sb.append(", is_translated=");
		sb.append(getIs_translated());
		sb.append(", parent_assessment_versionid=");
		sb.append(getParent_assessment_versionid());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(37);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.site_assessment_versions");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>assessment_version_id</column-name><column-value><![CDATA[");
		sb.append(getAssessment_version_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>stage_id</column-name><column-value><![CDATA[");
		sb.append(getStage_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>assessment_id</column-name><column-value><![CDATA[");
		sb.append(getAssessment_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>start_date</column-name><column-value><![CDATA[");
		sb.append(getStart_date());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>end_date</column-name><column-value><![CDATA[");
		sb.append(getEnd_date());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userid</column-name><column-value><![CDATA[");
		sb.append(getUserid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>initiation_date</column-name><column-value><![CDATA[");
		sb.append(getInitiation_date());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>language</column-name><column-value><![CDATA[");
		sb.append(getLanguage());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>version_code</column-name><column-value><![CDATA[");
		sb.append(getVersion_code());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>is_translated</column-name><column-value><![CDATA[");
		sb.append(getIs_translated());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>parent_assessment_versionid</column-name><column-value><![CDATA[");
		sb.append(getParent_assessment_versionid());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _assessment_version_id;
	private long _stage_id;
	private long _assessment_id;
	private Date _start_date;
	private Date _end_date;
	private long _userid;
	private Date _initiation_date;
	private long _language;
	private double _version_code;
	private boolean _is_translated;
	private long _parent_assessment_versionid;
	private BaseModel<?> _site_assessment_versionsRemoteModel;
}