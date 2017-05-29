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

import com.iucn.whp.dbservice.model.threat_summary_current;
import com.iucn.whp.dbservice.model.threat_summary_currentModel;

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
 * The base model implementation for the threat_summary_current service. Represents a row in the &quot;whp_threat_summary_current&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.iucn.whp.dbservice.model.threat_summary_currentModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link threat_summary_currentImpl}.
 * </p>
 *
 * @author alok.sen
 * @see threat_summary_currentImpl
 * @see com.iucn.whp.dbservice.model.threat_summary_current
 * @see com.iucn.whp.dbservice.model.threat_summary_currentModel
 * @generated
 */
public class threat_summary_currentModelImpl extends BaseModelImpl<threat_summary_current>
	implements threat_summary_currentModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a threat_summary_current model instance should use the {@link com.iucn.whp.dbservice.model.threat_summary_current} interface instead.
	 */
	public static final String TABLE_NAME = "whp_threat_summary_current";
	public static final Object[][] TABLE_COLUMNS = {
			{ "threat_sum_cur_id", Types.BIGINT },
			{ "assessment_version_id", Types.BIGINT },
			{ "overall_current", Types.VARCHAR },
			{ "threat_rating", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table whp_threat_summary_current (threat_sum_cur_id LONG not null primary key,assessment_version_id LONG,overall_current STRING null,threat_rating LONG)";
	public static final String TABLE_SQL_DROP = "drop table whp_threat_summary_current";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.iucn.whp.dbservice.model.threat_summary_current"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.iucn.whp.dbservice.model.threat_summary_current"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.iucn.whp.dbservice.model.threat_summary_current"),
			true);
	public static long ASSESSMENT_VERSION_ID_COLUMN_BITMASK = 1L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.iucn.whp.dbservice.model.threat_summary_current"));

	public threat_summary_currentModelImpl() {
	}

	public long getPrimaryKey() {
		return _threat_sum_cur_id;
	}

	public void setPrimaryKey(long primaryKey) {
		setThreat_sum_cur_id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_threat_sum_cur_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	public Class<?> getModelClass() {
		return threat_summary_current.class;
	}

	public String getModelClassName() {
		return threat_summary_current.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("threat_sum_cur_id", getThreat_sum_cur_id());
		attributes.put("assessment_version_id", getAssessment_version_id());
		attributes.put("overall_current", getOverall_current());
		attributes.put("threat_rating", getThreat_rating());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long threat_sum_cur_id = (Long)attributes.get("threat_sum_cur_id");

		if (threat_sum_cur_id != null) {
			setThreat_sum_cur_id(threat_sum_cur_id);
		}

		Long assessment_version_id = (Long)attributes.get(
				"assessment_version_id");

		if (assessment_version_id != null) {
			setAssessment_version_id(assessment_version_id);
		}

		String overall_current = (String)attributes.get("overall_current");

		if (overall_current != null) {
			setOverall_current(overall_current);
		}

		Long threat_rating = (Long)attributes.get("threat_rating");

		if (threat_rating != null) {
			setThreat_rating(threat_rating);
		}
	}

	public long getThreat_sum_cur_id() {
		return _threat_sum_cur_id;
	}

	public void setThreat_sum_cur_id(long threat_sum_cur_id) {
		_threat_sum_cur_id = threat_sum_cur_id;
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

	public String getOverall_current() {
		if (_overall_current == null) {
			return StringPool.BLANK;
		}
		else {
			return _overall_current;
		}
	}

	public void setOverall_current(String overall_current) {
		_overall_current = overall_current;
	}

	public long getThreat_rating() {
		return _threat_rating;
	}

	public void setThreat_rating(long threat_rating) {
		_threat_rating = threat_rating;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			threat_summary_current.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public threat_summary_current toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (threat_summary_current)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public Object clone() {
		threat_summary_currentImpl threat_summary_currentImpl = new threat_summary_currentImpl();

		threat_summary_currentImpl.setThreat_sum_cur_id(getThreat_sum_cur_id());
		threat_summary_currentImpl.setAssessment_version_id(getAssessment_version_id());
		threat_summary_currentImpl.setOverall_current(getOverall_current());
		threat_summary_currentImpl.setThreat_rating(getThreat_rating());

		threat_summary_currentImpl.resetOriginalValues();

		return threat_summary_currentImpl;
	}

	public int compareTo(threat_summary_current threat_summary_current) {
		long primaryKey = threat_summary_current.getPrimaryKey();

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

		threat_summary_current threat_summary_current = null;

		try {
			threat_summary_current = (threat_summary_current)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = threat_summary_current.getPrimaryKey();

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
		threat_summary_currentModelImpl threat_summary_currentModelImpl = this;

		threat_summary_currentModelImpl._originalAssessment_version_id = threat_summary_currentModelImpl._assessment_version_id;

		threat_summary_currentModelImpl._setOriginalAssessment_version_id = false;

		threat_summary_currentModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<threat_summary_current> toCacheModel() {
		threat_summary_currentCacheModel threat_summary_currentCacheModel = new threat_summary_currentCacheModel();

		threat_summary_currentCacheModel.threat_sum_cur_id = getThreat_sum_cur_id();

		threat_summary_currentCacheModel.assessment_version_id = getAssessment_version_id();

		threat_summary_currentCacheModel.overall_current = getOverall_current();

		String overall_current = threat_summary_currentCacheModel.overall_current;

		if ((overall_current != null) && (overall_current.length() == 0)) {
			threat_summary_currentCacheModel.overall_current = null;
		}

		threat_summary_currentCacheModel.threat_rating = getThreat_rating();

		return threat_summary_currentCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{threat_sum_cur_id=");
		sb.append(getThreat_sum_cur_id());
		sb.append(", assessment_version_id=");
		sb.append(getAssessment_version_id());
		sb.append(", overall_current=");
		sb.append(getOverall_current());
		sb.append(", threat_rating=");
		sb.append(getThreat_rating());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.threat_summary_current");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>threat_sum_cur_id</column-name><column-value><![CDATA[");
		sb.append(getThreat_sum_cur_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>assessment_version_id</column-name><column-value><![CDATA[");
		sb.append(getAssessment_version_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>overall_current</column-name><column-value><![CDATA[");
		sb.append(getOverall_current());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>threat_rating</column-name><column-value><![CDATA[");
		sb.append(getThreat_rating());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = threat_summary_current.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			threat_summary_current.class
		};
	private long _threat_sum_cur_id;
	private long _assessment_version_id;
	private long _originalAssessment_version_id;
	private boolean _setOriginalAssessment_version_id;
	private String _overall_current;
	private long _threat_rating;
	private long _columnBitmask;
	private threat_summary_current _escapedModelProxy;
}