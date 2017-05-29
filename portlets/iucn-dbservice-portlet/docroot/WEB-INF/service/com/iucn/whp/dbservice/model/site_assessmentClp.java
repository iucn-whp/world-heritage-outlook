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

import com.iucn.whp.dbservice.service.site_assessmentLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.DateUtil;
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
public class site_assessmentClp extends BaseModelImpl<site_assessment>
	implements site_assessment {
	public site_assessmentClp() {
	}

	public Class<?> getModelClass() {
		return site_assessment.class;
	}

	public String getModelClassName() {
		return site_assessment.class.getName();
	}

	public long getPrimaryKey() {
		return _assessment_id;
	}

	public void setPrimaryKey(long primaryKey) {
		setAssessment_id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_assessment_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("assessment_id", getAssessment_id());
		attributes.put("site_id", getSite_id());
		attributes.put("status_id", getStatus_id());
		attributes.put("initiation_date", getInitiation_date());
		attributes.put("current_userid", getCurrent_userid());
		attributes.put("current_stageid", getCurrent_stageid());
		attributes.put("assessment_initiated_by", getAssessment_initiated_by());
		attributes.put("base_langid", getBase_langid());
		attributes.put("archived", getArchived());
		attributes.put("is_active", getIs_active());
		attributes.put("assessment_cycle", getAssessment_cycle());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long assessment_id = (Long)attributes.get("assessment_id");

		if (assessment_id != null) {
			setAssessment_id(assessment_id);
		}

		Long site_id = (Long)attributes.get("site_id");

		if (site_id != null) {
			setSite_id(site_id);
		}

		Long status_id = (Long)attributes.get("status_id");

		if (status_id != null) {
			setStatus_id(status_id);
		}

		Date initiation_date = (Date)attributes.get("initiation_date");

		if (initiation_date != null) {
			setInitiation_date(initiation_date);
		}

		Long current_userid = (Long)attributes.get("current_userid");

		if (current_userid != null) {
			setCurrent_userid(current_userid);
		}

		Long current_stageid = (Long)attributes.get("current_stageid");

		if (current_stageid != null) {
			setCurrent_stageid(current_stageid);
		}

		Long assessment_initiated_by = (Long)attributes.get(
				"assessment_initiated_by");

		if (assessment_initiated_by != null) {
			setAssessment_initiated_by(assessment_initiated_by);
		}

		Long base_langid = (Long)attributes.get("base_langid");

		if (base_langid != null) {
			setBase_langid(base_langid);
		}

		Boolean archived = (Boolean)attributes.get("archived");

		if (archived != null) {
			setArchived(archived);
		}

		Boolean is_active = (Boolean)attributes.get("is_active");

		if (is_active != null) {
			setIs_active(is_active);
		}

		String assessment_cycle = (String)attributes.get("assessment_cycle");

		if (assessment_cycle != null) {
			setAssessment_cycle(assessment_cycle);
		}
	}

	public long getAssessment_id() {
		return _assessment_id;
	}

	public void setAssessment_id(long assessment_id) {
		_assessment_id = assessment_id;
	}

	public long getSite_id() {
		return _site_id;
	}

	public void setSite_id(long site_id) {
		_site_id = site_id;
	}

	public long getStatus_id() {
		return _status_id;
	}

	public void setStatus_id(long status_id) {
		_status_id = status_id;
	}

	public Date getInitiation_date() {
		return _initiation_date;
	}

	public void setInitiation_date(Date initiation_date) {
		_initiation_date = initiation_date;
	}

	public long getCurrent_userid() {
		return _current_userid;
	}

	public void setCurrent_userid(long current_userid) {
		_current_userid = current_userid;
	}

	public long getCurrent_stageid() {
		return _current_stageid;
	}

	public void setCurrent_stageid(long current_stageid) {
		_current_stageid = current_stageid;
	}

	public long getAssessment_initiated_by() {
		return _assessment_initiated_by;
	}

	public void setAssessment_initiated_by(long assessment_initiated_by) {
		_assessment_initiated_by = assessment_initiated_by;
	}

	public long getBase_langid() {
		return _base_langid;
	}

	public void setBase_langid(long base_langid) {
		_base_langid = base_langid;
	}

	public boolean getArchived() {
		return _archived;
	}

	public boolean isArchived() {
		return _archived;
	}

	public void setArchived(boolean archived) {
		_archived = archived;
	}

	public boolean getIs_active() {
		return _is_active;
	}

	public boolean isIs_active() {
		return _is_active;
	}

	public void setIs_active(boolean is_active) {
		_is_active = is_active;
	}

	public String getAssessment_cycle() {
		return _assessment_cycle;
	}

	public void setAssessment_cycle(String assessment_cycle) {
		_assessment_cycle = assessment_cycle;
	}

	public BaseModel<?> getsite_assessmentRemoteModel() {
		return _site_assessmentRemoteModel;
	}

	public void setsite_assessmentRemoteModel(
		BaseModel<?> site_assessmentRemoteModel) {
		_site_assessmentRemoteModel = site_assessmentRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			site_assessmentLocalServiceUtil.addsite_assessment(this);
		}
		else {
			site_assessmentLocalServiceUtil.updatesite_assessment(this);
		}
	}

	@Override
	public site_assessment toEscapedModel() {
		return (site_assessment)Proxy.newProxyInstance(site_assessment.class.getClassLoader(),
			new Class[] { site_assessment.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		site_assessmentClp clone = new site_assessmentClp();

		clone.setAssessment_id(getAssessment_id());
		clone.setSite_id(getSite_id());
		clone.setStatus_id(getStatus_id());
		clone.setInitiation_date(getInitiation_date());
		clone.setCurrent_userid(getCurrent_userid());
		clone.setCurrent_stageid(getCurrent_stageid());
		clone.setAssessment_initiated_by(getAssessment_initiated_by());
		clone.setBase_langid(getBase_langid());
		clone.setArchived(getArchived());
		clone.setIs_active(getIs_active());
		clone.setAssessment_cycle(getAssessment_cycle());

		return clone;
	}

	public int compareTo(site_assessment site_assessment) {
		int value = 0;

		value = DateUtil.compareTo(getInitiation_date(),
				site_assessment.getInitiation_date());

		value = value * -1;

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		site_assessmentClp site_assessment = null;

		try {
			site_assessment = (site_assessmentClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = site_assessment.getPrimaryKey();

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

		sb.append("{assessment_id=");
		sb.append(getAssessment_id());
		sb.append(", site_id=");
		sb.append(getSite_id());
		sb.append(", status_id=");
		sb.append(getStatus_id());
		sb.append(", initiation_date=");
		sb.append(getInitiation_date());
		sb.append(", current_userid=");
		sb.append(getCurrent_userid());
		sb.append(", current_stageid=");
		sb.append(getCurrent_stageid());
		sb.append(", assessment_initiated_by=");
		sb.append(getAssessment_initiated_by());
		sb.append(", base_langid=");
		sb.append(getBase_langid());
		sb.append(", archived=");
		sb.append(getArchived());
		sb.append(", is_active=");
		sb.append(getIs_active());
		sb.append(", assessment_cycle=");
		sb.append(getAssessment_cycle());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(37);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.site_assessment");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>assessment_id</column-name><column-value><![CDATA[");
		sb.append(getAssessment_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>site_id</column-name><column-value><![CDATA[");
		sb.append(getSite_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status_id</column-name><column-value><![CDATA[");
		sb.append(getStatus_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>initiation_date</column-name><column-value><![CDATA[");
		sb.append(getInitiation_date());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>current_userid</column-name><column-value><![CDATA[");
		sb.append(getCurrent_userid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>current_stageid</column-name><column-value><![CDATA[");
		sb.append(getCurrent_stageid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>assessment_initiated_by</column-name><column-value><![CDATA[");
		sb.append(getAssessment_initiated_by());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>base_langid</column-name><column-value><![CDATA[");
		sb.append(getBase_langid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>archived</column-name><column-value><![CDATA[");
		sb.append(getArchived());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>is_active</column-name><column-value><![CDATA[");
		sb.append(getIs_active());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>assessment_cycle</column-name><column-value><![CDATA[");
		sb.append(getAssessment_cycle());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _assessment_id;
	private long _site_id;
	private long _status_id;
	private Date _initiation_date;
	private long _current_userid;
	private long _current_stageid;
	private long _assessment_initiated_by;
	private long _base_langid;
	private boolean _archived;
	private boolean _is_active;
	private String _assessment_cycle;
	private BaseModel<?> _site_assessmentRemoteModel;
}