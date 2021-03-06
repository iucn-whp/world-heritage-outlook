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

package com.iucn.whp.dbservice.model.impl;

import com.iucn.whp.dbservice.model.effective_prot_mgmt_iothreats;
import com.iucn.whp.dbservice.model.effective_prot_mgmt_iothreatsModel;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the effective_prot_mgmt_iothreats service. Represents a row in the &quot;whp_effective_prot_mgmt_iothreats&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.iucn.whp.dbservice.model.effective_prot_mgmt_iothreatsModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link effective_prot_mgmt_iothreatsImpl}.
 * </p>
 *
 * @author alok.sen
 * @see effective_prot_mgmt_iothreatsImpl
 * @see com.iucn.whp.dbservice.model.effective_prot_mgmt_iothreats
 * @see com.iucn.whp.dbservice.model.effective_prot_mgmt_iothreatsModel
 * @generated
 */
public class effective_prot_mgmt_iothreatsModelImpl extends BaseModelImpl<effective_prot_mgmt_iothreats>
	implements effective_prot_mgmt_iothreatsModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a effective_prot_mgmt_iothreats model instance should use the {@link com.iucn.whp.dbservice.model.effective_prot_mgmt_iothreats} interface instead.
	 */
	public static final String TABLE_NAME = "whp_effective_prot_mgmt_iothreats";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id_", Types.BIGINT },
			{ "assessment_version_id", Types.BIGINT },
			{ "justification", Types.VARCHAR },
			{ "rating", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table whp_effective_prot_mgmt_iothreats (id_ LONG not null primary key,assessment_version_id LONG,justification STRING null,rating LONG)";
	public static final String TABLE_SQL_DROP = "drop table whp_effective_prot_mgmt_iothreats";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.iucn.whp.dbservice.model.effective_prot_mgmt_iothreats"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.iucn.whp.dbservice.model.effective_prot_mgmt_iothreats"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.iucn.whp.dbservice.model.effective_prot_mgmt_iothreats"),
			true);
	public static long ASSESSMENT_VERSION_ID_COLUMN_BITMASK = 1L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.iucn.whp.dbservice.model.effective_prot_mgmt_iothreats"));

	public effective_prot_mgmt_iothreatsModelImpl() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	public Class<?> getModelClass() {
		return effective_prot_mgmt_iothreats.class;
	}

	public String getModelClassName() {
		return effective_prot_mgmt_iothreats.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("assessment_version_id", getAssessment_version_id());
		attributes.put("justification", getJustification());
		attributes.put("rating", getRating());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long assessment_version_id = (Long)attributes.get(
				"assessment_version_id");

		if (assessment_version_id != null) {
			setAssessment_version_id(assessment_version_id);
		}

		String justification = (String)attributes.get("justification");

		if (justification != null) {
			setJustification(justification);
		}

		Long rating = (Long)attributes.get("rating");

		if (rating != null) {
			setRating(rating);
		}
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public long getAssessment_version_id() {
		return _assessment_version_id;
	}

	public void setAssessment_version_id(long assessment_version_id) {
		_columnBitmask |= ASSESSMENT_VERSION_ID_COLUMN_BITMASK;

		if (!_setOriginalAssessment_version_id) {
			_setOriginalAssessment_version_id = true;

			_originalAssessment_version_id = _assessment_version_id;
		}

		_assessment_version_id = assessment_version_id;
	}

	public long getOriginalAssessment_version_id() {
		return _originalAssessment_version_id;
	}

	public String getJustification() {
		if (_justification == null) {
			return StringPool.BLANK;
		}
		else {
			return _justification;
		}
	}

	public void setJustification(String justification) {
		_justification = justification;
	}

	public long getRating() {
		return _rating;
	}

	public void setRating(long rating) {
		_rating = rating;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			effective_prot_mgmt_iothreats.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public effective_prot_mgmt_iothreats toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (effective_prot_mgmt_iothreats)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public Object clone() {
		effective_prot_mgmt_iothreatsImpl effective_prot_mgmt_iothreatsImpl = new effective_prot_mgmt_iothreatsImpl();

		effective_prot_mgmt_iothreatsImpl.setId(getId());
		effective_prot_mgmt_iothreatsImpl.setAssessment_version_id(getAssessment_version_id());
		effective_prot_mgmt_iothreatsImpl.setJustification(getJustification());
		effective_prot_mgmt_iothreatsImpl.setRating(getRating());

		effective_prot_mgmt_iothreatsImpl.resetOriginalValues();

		return effective_prot_mgmt_iothreatsImpl;
	}

	public int compareTo(
		effective_prot_mgmt_iothreats effective_prot_mgmt_iothreats) {
		long primaryKey = effective_prot_mgmt_iothreats.getPrimaryKey();

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

		effective_prot_mgmt_iothreats effective_prot_mgmt_iothreats = null;

		try {
			effective_prot_mgmt_iothreats = (effective_prot_mgmt_iothreats)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = effective_prot_mgmt_iothreats.getPrimaryKey();

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
	public void resetOriginalValues() {
		effective_prot_mgmt_iothreatsModelImpl effective_prot_mgmt_iothreatsModelImpl =
			this;

		effective_prot_mgmt_iothreatsModelImpl._originalAssessment_version_id = effective_prot_mgmt_iothreatsModelImpl._assessment_version_id;

		effective_prot_mgmt_iothreatsModelImpl._setOriginalAssessment_version_id = false;

		effective_prot_mgmt_iothreatsModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<effective_prot_mgmt_iothreats> toCacheModel() {
		effective_prot_mgmt_iothreatsCacheModel effective_prot_mgmt_iothreatsCacheModel =
			new effective_prot_mgmt_iothreatsCacheModel();

		effective_prot_mgmt_iothreatsCacheModel.id = getId();

		effective_prot_mgmt_iothreatsCacheModel.assessment_version_id = getAssessment_version_id();

		effective_prot_mgmt_iothreatsCacheModel.justification = getJustification();

		String justification = effective_prot_mgmt_iothreatsCacheModel.justification;

		if ((justification != null) && (justification.length() == 0)) {
			effective_prot_mgmt_iothreatsCacheModel.justification = null;
		}

		effective_prot_mgmt_iothreatsCacheModel.rating = getRating();

		return effective_prot_mgmt_iothreatsCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", assessment_version_id=");
		sb.append(getAssessment_version_id());
		sb.append(", justification=");
		sb.append(getJustification());
		sb.append(", rating=");
		sb.append(getRating());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.effective_prot_mgmt_iothreats");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>assessment_version_id</column-name><column-value><![CDATA[");
		sb.append(getAssessment_version_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>justification</column-name><column-value><![CDATA[");
		sb.append(getJustification());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>rating</column-name><column-value><![CDATA[");
		sb.append(getRating());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = effective_prot_mgmt_iothreats.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			effective_prot_mgmt_iothreats.class
		};
	private long _id;
	private long _assessment_version_id;
	private long _originalAssessment_version_id;
	private boolean _setOriginalAssessment_version_id;
	private String _justification;
	private long _rating;
	private long _columnBitmask;
	private effective_prot_mgmt_iothreats _escapedModelProxy;
}