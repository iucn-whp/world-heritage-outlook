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

import com.iucn.whp.dbservice.model.benefits;
import com.iucn.whp.dbservice.model.benefitsModel;

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
 * The base model implementation for the benefits service. Represents a row in the &quot;whp_benefits&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.iucn.whp.dbservice.model.benefitsModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link benefitsImpl}.
 * </p>
 *
 * @author alok.sen
 * @see benefitsImpl
 * @see com.iucn.whp.dbservice.model.benefits
 * @see com.iucn.whp.dbservice.model.benefitsModel
 * @generated
 */
public class benefitsModelImpl extends BaseModelImpl<benefits>
	implements benefitsModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a benefits model instance should use the {@link com.iucn.whp.dbservice.model.benefits} interface instead.
	 */
	public static final String TABLE_NAME = "whp_benefits";
	public static final Object[][] TABLE_COLUMNS = {
			{ "benefits_id", Types.BIGINT },
			{ "assessment_version_id", Types.BIGINT },
			{ "selected_benefit", Types.BIGINT },
			{ "summary", Types.VARCHAR },
			{ "data_deficient", Types.BOOLEAN },
			{ "community_within_site", Types.BIGINT },
			{ "community_outside_site", Types.BIGINT },
			{ "wider_community", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table whp_benefits (benefits_id LONG not null primary key,assessment_version_id LONG,selected_benefit LONG,summary STRING null,data_deficient BOOLEAN,community_within_site LONG,community_outside_site LONG,wider_community LONG)";
	public static final String TABLE_SQL_DROP = "drop table whp_benefits";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.iucn.whp.dbservice.model.benefits"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.iucn.whp.dbservice.model.benefits"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.iucn.whp.dbservice.model.benefits"),
			true);
	public static long ASSESSMENT_VERSION_ID_COLUMN_BITMASK = 1L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.iucn.whp.dbservice.model.benefits"));

	public benefitsModelImpl() {
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

	public Class<?> getModelClass() {
		return benefits.class;
	}

	public String getModelClassName() {
		return benefits.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("benefits_id", getBenefits_id());
		attributes.put("assessment_version_id", getAssessment_version_id());
		attributes.put("selected_benefit", getSelected_benefit());
		attributes.put("summary", getSummary());
		attributes.put("data_deficient", getData_deficient());
		attributes.put("community_within_site", getCommunity_within_site());
		attributes.put("community_outside_site", getCommunity_outside_site());
		attributes.put("wider_community", getWider_community());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long benefits_id = (Long)attributes.get("benefits_id");

		if (benefits_id != null) {
			setBenefits_id(benefits_id);
		}

		Long assessment_version_id = (Long)attributes.get(
				"assessment_version_id");

		if (assessment_version_id != null) {
			setAssessment_version_id(assessment_version_id);
		}

		Long selected_benefit = (Long)attributes.get("selected_benefit");

		if (selected_benefit != null) {
			setSelected_benefit(selected_benefit);
		}

		String summary = (String)attributes.get("summary");

		if (summary != null) {
			setSummary(summary);
		}

		Boolean data_deficient = (Boolean)attributes.get("data_deficient");

		if (data_deficient != null) {
			setData_deficient(data_deficient);
		}

		Long community_within_site = (Long)attributes.get(
				"community_within_site");

		if (community_within_site != null) {
			setCommunity_within_site(community_within_site);
		}

		Long community_outside_site = (Long)attributes.get(
				"community_outside_site");

		if (community_outside_site != null) {
			setCommunity_outside_site(community_outside_site);
		}

		Long wider_community = (Long)attributes.get("wider_community");

		if (wider_community != null) {
			setWider_community(wider_community);
		}
	}

	public long getBenefits_id() {
		return _benefits_id;
	}

	public void setBenefits_id(long benefits_id) {
		_benefits_id = benefits_id;
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

	public long getSelected_benefit() {
		return _selected_benefit;
	}

	public void setSelected_benefit(long selected_benefit) {
		_selected_benefit = selected_benefit;
	}

	public String getSummary() {
		if (_summary == null) {
			return StringPool.BLANK;
		}
		else {
			return _summary;
		}
	}

	public void setSummary(String summary) {
		_summary = summary;
	}

	public boolean getData_deficient() {
		return _data_deficient;
	}

	public boolean isData_deficient() {
		return _data_deficient;
	}

	public void setData_deficient(boolean data_deficient) {
		_data_deficient = data_deficient;
	}

	public long getCommunity_within_site() {
		return _community_within_site;
	}

	public void setCommunity_within_site(long community_within_site) {
		_community_within_site = community_within_site;
	}

	public long getCommunity_outside_site() {
		return _community_outside_site;
	}

	public void setCommunity_outside_site(long community_outside_site) {
		_community_outside_site = community_outside_site;
	}

	public long getWider_community() {
		return _wider_community;
	}

	public void setWider_community(long wider_community) {
		_wider_community = wider_community;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			benefits.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public benefits toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (benefits)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public Object clone() {
		benefitsImpl benefitsImpl = new benefitsImpl();

		benefitsImpl.setBenefits_id(getBenefits_id());
		benefitsImpl.setAssessment_version_id(getAssessment_version_id());
		benefitsImpl.setSelected_benefit(getSelected_benefit());
		benefitsImpl.setSummary(getSummary());
		benefitsImpl.setData_deficient(getData_deficient());
		benefitsImpl.setCommunity_within_site(getCommunity_within_site());
		benefitsImpl.setCommunity_outside_site(getCommunity_outside_site());
		benefitsImpl.setWider_community(getWider_community());

		benefitsImpl.resetOriginalValues();

		return benefitsImpl;
	}

	public int compareTo(benefits benefits) {
		long primaryKey = benefits.getPrimaryKey();

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

		benefits benefits = null;

		try {
			benefits = (benefits)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = benefits.getPrimaryKey();

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
		benefitsModelImpl benefitsModelImpl = this;

		benefitsModelImpl._originalAssessment_version_id = benefitsModelImpl._assessment_version_id;

		benefitsModelImpl._setOriginalAssessment_version_id = false;

		benefitsModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<benefits> toCacheModel() {
		benefitsCacheModel benefitsCacheModel = new benefitsCacheModel();

		benefitsCacheModel.benefits_id = getBenefits_id();

		benefitsCacheModel.assessment_version_id = getAssessment_version_id();

		benefitsCacheModel.selected_benefit = getSelected_benefit();

		benefitsCacheModel.summary = getSummary();

		String summary = benefitsCacheModel.summary;

		if ((summary != null) && (summary.length() == 0)) {
			benefitsCacheModel.summary = null;
		}

		benefitsCacheModel.data_deficient = getData_deficient();

		benefitsCacheModel.community_within_site = getCommunity_within_site();

		benefitsCacheModel.community_outside_site = getCommunity_outside_site();

		benefitsCacheModel.wider_community = getWider_community();

		return benefitsCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{benefits_id=");
		sb.append(getBenefits_id());
		sb.append(", assessment_version_id=");
		sb.append(getAssessment_version_id());
		sb.append(", selected_benefit=");
		sb.append(getSelected_benefit());
		sb.append(", summary=");
		sb.append(getSummary());
		sb.append(", data_deficient=");
		sb.append(getData_deficient());
		sb.append(", community_within_site=");
		sb.append(getCommunity_within_site());
		sb.append(", community_outside_site=");
		sb.append(getCommunity_outside_site());
		sb.append(", wider_community=");
		sb.append(getWider_community());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.benefits");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>benefits_id</column-name><column-value><![CDATA[");
		sb.append(getBenefits_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>assessment_version_id</column-name><column-value><![CDATA[");
		sb.append(getAssessment_version_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>selected_benefit</column-name><column-value><![CDATA[");
		sb.append(getSelected_benefit());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>summary</column-name><column-value><![CDATA[");
		sb.append(getSummary());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>data_deficient</column-name><column-value><![CDATA[");
		sb.append(getData_deficient());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>community_within_site</column-name><column-value><![CDATA[");
		sb.append(getCommunity_within_site());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>community_outside_site</column-name><column-value><![CDATA[");
		sb.append(getCommunity_outside_site());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>wider_community</column-name><column-value><![CDATA[");
		sb.append(getWider_community());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = benefits.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			benefits.class
		};
	private long _benefits_id;
	private long _assessment_version_id;
	private long _originalAssessment_version_id;
	private boolean _setOriginalAssessment_version_id;
	private long _selected_benefit;
	private String _summary;
	private boolean _data_deficient;
	private long _community_within_site;
	private long _community_outside_site;
	private long _wider_community;
	private long _columnBitmask;
	private benefits _escapedModelProxy;
}