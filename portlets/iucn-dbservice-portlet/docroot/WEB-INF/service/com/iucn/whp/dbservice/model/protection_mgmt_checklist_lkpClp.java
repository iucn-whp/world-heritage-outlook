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

import com.iucn.whp.dbservice.service.protection_mgmt_checklist_lkpLocalServiceUtil;

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
public class protection_mgmt_checklist_lkpClp extends BaseModelImpl<protection_mgmt_checklist_lkp>
	implements protection_mgmt_checklist_lkp {
	public protection_mgmt_checklist_lkpClp() {
	}

	public Class<?> getModelClass() {
		return protection_mgmt_checklist_lkp.class;
	}

	public String getModelClassName() {
		return protection_mgmt_checklist_lkp.class.getName();
	}

	public long getPrimaryKey() {
		return _topic_id;
	}

	public void setPrimaryKey(long primaryKey) {
		setTopic_id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_topic_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("topic_id", getTopic_id());
		attributes.put("topic", getTopic());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long topic_id = (Long)attributes.get("topic_id");

		if (topic_id != null) {
			setTopic_id(topic_id);
		}

		String topic = (String)attributes.get("topic");

		if (topic != null) {
			setTopic(topic);
		}
	}

	public long getTopic_id() {
		return _topic_id;
	}

	public void setTopic_id(long topic_id) {
		_topic_id = topic_id;
	}

	public String getTopic() {
		return _topic;
	}

	public void setTopic(String topic) {
		_topic = topic;
	}

	public BaseModel<?> getprotection_mgmt_checklist_lkpRemoteModel() {
		return _protection_mgmt_checklist_lkpRemoteModel;
	}

	public void setprotection_mgmt_checklist_lkpRemoteModel(
		BaseModel<?> protection_mgmt_checklist_lkpRemoteModel) {
		_protection_mgmt_checklist_lkpRemoteModel = protection_mgmt_checklist_lkpRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			protection_mgmt_checklist_lkpLocalServiceUtil.addprotection_mgmt_checklist_lkp(this);
		}
		else {
			protection_mgmt_checklist_lkpLocalServiceUtil.updateprotection_mgmt_checklist_lkp(this);
		}
	}

	@Override
	public protection_mgmt_checklist_lkp toEscapedModel() {
		return (protection_mgmt_checklist_lkp)Proxy.newProxyInstance(protection_mgmt_checklist_lkp.class.getClassLoader(),
			new Class[] { protection_mgmt_checklist_lkp.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		protection_mgmt_checklist_lkpClp clone = new protection_mgmt_checklist_lkpClp();

		clone.setTopic_id(getTopic_id());
		clone.setTopic(getTopic());

		return clone;
	}

	public int compareTo(
		protection_mgmt_checklist_lkp protection_mgmt_checklist_lkp) {
		long primaryKey = protection_mgmt_checklist_lkp.getPrimaryKey();

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

		protection_mgmt_checklist_lkpClp protection_mgmt_checklist_lkp = null;

		try {
			protection_mgmt_checklist_lkp = (protection_mgmt_checklist_lkpClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = protection_mgmt_checklist_lkp.getPrimaryKey();

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

		sb.append("{topic_id=");
		sb.append(getTopic_id());
		sb.append(", topic=");
		sb.append(getTopic());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.protection_mgmt_checklist_lkp");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>topic_id</column-name><column-value><![CDATA[");
		sb.append(getTopic_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>topic</column-name><column-value><![CDATA[");
		sb.append(getTopic());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _topic_id;
	private String _topic;
	private BaseModel<?> _protection_mgmt_checklist_lkpRemoteModel;
}