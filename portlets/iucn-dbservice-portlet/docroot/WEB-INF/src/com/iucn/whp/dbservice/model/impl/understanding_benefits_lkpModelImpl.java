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

import com.iucn.whp.dbservice.model.understanding_benefits_lkp;
import com.iucn.whp.dbservice.model.understanding_benefits_lkpModel;

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
 * The base model implementation for the understanding_benefits_lkp service. Represents a row in the &quot;whp_understanding_benefits_lkp&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.iucn.whp.dbservice.model.understanding_benefits_lkpModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link understanding_benefits_lkpImpl}.
 * </p>
 *
 * @author alok.sen
 * @see understanding_benefits_lkpImpl
 * @see com.iucn.whp.dbservice.model.understanding_benefits_lkp
 * @see com.iucn.whp.dbservice.model.understanding_benefits_lkpModel
 * @generated
 */
public class understanding_benefits_lkpModelImpl extends BaseModelImpl<understanding_benefits_lkp>
	implements understanding_benefits_lkpModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a understanding_benefits_lkp model instance should use the {@link com.iucn.whp.dbservice.model.understanding_benefits_lkp} interface instead.
	 */
	public static final String TABLE_NAME = "whp_understanding_benefits_lkp";
	public static final Object[][] TABLE_COLUMNS = {
			{ "benefits_id", Types.BIGINT },
			{ "selected_benefit", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table whp_understanding_benefits_lkp (benefits_id LONG not null primary key,selected_benefit VARCHAR(100) null)";
	public static final String TABLE_SQL_DROP = "drop table whp_understanding_benefits_lkp";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.iucn.whp.dbservice.model.understanding_benefits_lkp"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.iucn.whp.dbservice.model.understanding_benefits_lkp"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.iucn.whp.dbservice.model.understanding_benefits_lkp"));

	public understanding_benefits_lkpModelImpl() {
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
		return understanding_benefits_lkp.class;
	}

	public String getModelClassName() {
		return understanding_benefits_lkp.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("benefits_id", getBenefits_id());
		attributes.put("selected_benefit", getSelected_benefit());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long benefits_id = (Long)attributes.get("benefits_id");

		if (benefits_id != null) {
			setBenefits_id(benefits_id);
		}

		String selected_benefit = (String)attributes.get("selected_benefit");

		if (selected_benefit != null) {
			setSelected_benefit(selected_benefit);
		}
	}

	public long getBenefits_id() {
		return _benefits_id;
	}

	public void setBenefits_id(long benefits_id) {
		_benefits_id = benefits_id;
	}

	public String getSelected_benefit() {
		if (_selected_benefit == null) {
			return StringPool.BLANK;
		}
		else {
			return _selected_benefit;
		}
	}

	public void setSelected_benefit(String selected_benefit) {
		_selected_benefit = selected_benefit;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			understanding_benefits_lkp.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public understanding_benefits_lkp toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (understanding_benefits_lkp)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public Object clone() {
		understanding_benefits_lkpImpl understanding_benefits_lkpImpl = new understanding_benefits_lkpImpl();

		understanding_benefits_lkpImpl.setBenefits_id(getBenefits_id());
		understanding_benefits_lkpImpl.setSelected_benefit(getSelected_benefit());

		understanding_benefits_lkpImpl.resetOriginalValues();

		return understanding_benefits_lkpImpl;
	}

	public int compareTo(understanding_benefits_lkp understanding_benefits_lkp) {
		long primaryKey = understanding_benefits_lkp.getPrimaryKey();

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

		understanding_benefits_lkp understanding_benefits_lkp = null;

		try {
			understanding_benefits_lkp = (understanding_benefits_lkp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = understanding_benefits_lkp.getPrimaryKey();

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
	}

	@Override
	public CacheModel<understanding_benefits_lkp> toCacheModel() {
		understanding_benefits_lkpCacheModel understanding_benefits_lkpCacheModel =
			new understanding_benefits_lkpCacheModel();

		understanding_benefits_lkpCacheModel.benefits_id = getBenefits_id();

		understanding_benefits_lkpCacheModel.selected_benefit = getSelected_benefit();

		String selected_benefit = understanding_benefits_lkpCacheModel.selected_benefit;

		if ((selected_benefit != null) && (selected_benefit.length() == 0)) {
			understanding_benefits_lkpCacheModel.selected_benefit = null;
		}

		return understanding_benefits_lkpCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{benefits_id=");
		sb.append(getBenefits_id());
		sb.append(", selected_benefit=");
		sb.append(getSelected_benefit());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.understanding_benefits_lkp");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>benefits_id</column-name><column-value><![CDATA[");
		sb.append(getBenefits_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>selected_benefit</column-name><column-value><![CDATA[");
		sb.append(getSelected_benefit());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = understanding_benefits_lkp.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			understanding_benefits_lkp.class
		};
	private long _benefits_id;
	private String _selected_benefit;
	private understanding_benefits_lkp _escapedModelProxy;
}