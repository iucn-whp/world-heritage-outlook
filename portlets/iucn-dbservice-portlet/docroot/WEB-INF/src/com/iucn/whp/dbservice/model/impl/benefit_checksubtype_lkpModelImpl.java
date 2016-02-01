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

import com.iucn.whp.dbservice.model.benefit_checksubtype_lkp;
import com.iucn.whp.dbservice.model.benefit_checksubtype_lkpModel;

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
 * The base model implementation for the benefit_checksubtype_lkp service. Represents a row in the &quot;whp_benefit_checksubtype_lkp&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.iucn.whp.dbservice.model.benefit_checksubtype_lkpModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link benefit_checksubtype_lkpImpl}.
 * </p>
 *
 * @author alok.sen
 * @see benefit_checksubtype_lkpImpl
 * @see com.iucn.whp.dbservice.model.benefit_checksubtype_lkp
 * @see com.iucn.whp.dbservice.model.benefit_checksubtype_lkpModel
 * @generated
 */
public class benefit_checksubtype_lkpModelImpl extends BaseModelImpl<benefit_checksubtype_lkp>
	implements benefit_checksubtype_lkpModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a benefit_checksubtype_lkp model instance should use the {@link com.iucn.whp.dbservice.model.benefit_checksubtype_lkp} interface instead.
	 */
	public static final String TABLE_NAME = "whp_benefit_checksubtype_lkp";
	public static final Object[][] TABLE_COLUMNS = {
			{ "subbenefit_id", Types.BIGINT },
			{ "benefit_checksubtype", Types.VARCHAR },
			{ "parent_id", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table whp_benefit_checksubtype_lkp (subbenefit_id LONG not null primary key,benefit_checksubtype VARCHAR(200) null,parent_id LONG)";
	public static final String TABLE_SQL_DROP = "drop table whp_benefit_checksubtype_lkp";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.iucn.whp.dbservice.model.benefit_checksubtype_lkp"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.iucn.whp.dbservice.model.benefit_checksubtype_lkp"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.iucn.whp.dbservice.model.benefit_checksubtype_lkp"));

	public benefit_checksubtype_lkpModelImpl() {
	}

	public long getPrimaryKey() {
		return _subbenefit_id;
	}

	public void setPrimaryKey(long primaryKey) {
		setSubbenefit_id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_subbenefit_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	public Class<?> getModelClass() {
		return benefit_checksubtype_lkp.class;
	}

	public String getModelClassName() {
		return benefit_checksubtype_lkp.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("subbenefit_id", getSubbenefit_id());
		attributes.put("benefit_checksubtype", getBenefit_checksubtype());
		attributes.put("parent_id", getParent_id());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long subbenefit_id = (Long)attributes.get("subbenefit_id");

		if (subbenefit_id != null) {
			setSubbenefit_id(subbenefit_id);
		}

		String benefit_checksubtype = (String)attributes.get(
				"benefit_checksubtype");

		if (benefit_checksubtype != null) {
			setBenefit_checksubtype(benefit_checksubtype);
		}

		Long parent_id = (Long)attributes.get("parent_id");

		if (parent_id != null) {
			setParent_id(parent_id);
		}
	}

	public long getSubbenefit_id() {
		return _subbenefit_id;
	}

	public void setSubbenefit_id(long subbenefit_id) {
		_subbenefit_id = subbenefit_id;
	}

	public String getBenefit_checksubtype() {
		if (_benefit_checksubtype == null) {
			return StringPool.BLANK;
		}
		else {
			return _benefit_checksubtype;
		}
	}

	public void setBenefit_checksubtype(String benefit_checksubtype) {
		_benefit_checksubtype = benefit_checksubtype;
	}

	public long getParent_id() {
		return _parent_id;
	}

	public void setParent_id(long parent_id) {
		_parent_id = parent_id;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			benefit_checksubtype_lkp.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public benefit_checksubtype_lkp toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (benefit_checksubtype_lkp)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public Object clone() {
		benefit_checksubtype_lkpImpl benefit_checksubtype_lkpImpl = new benefit_checksubtype_lkpImpl();

		benefit_checksubtype_lkpImpl.setSubbenefit_id(getSubbenefit_id());
		benefit_checksubtype_lkpImpl.setBenefit_checksubtype(getBenefit_checksubtype());
		benefit_checksubtype_lkpImpl.setParent_id(getParent_id());

		benefit_checksubtype_lkpImpl.resetOriginalValues();

		return benefit_checksubtype_lkpImpl;
	}

	public int compareTo(benefit_checksubtype_lkp benefit_checksubtype_lkp) {
		long primaryKey = benefit_checksubtype_lkp.getPrimaryKey();

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

		benefit_checksubtype_lkp benefit_checksubtype_lkp = null;

		try {
			benefit_checksubtype_lkp = (benefit_checksubtype_lkp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = benefit_checksubtype_lkp.getPrimaryKey();

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
	public CacheModel<benefit_checksubtype_lkp> toCacheModel() {
		benefit_checksubtype_lkpCacheModel benefit_checksubtype_lkpCacheModel = new benefit_checksubtype_lkpCacheModel();

		benefit_checksubtype_lkpCacheModel.subbenefit_id = getSubbenefit_id();

		benefit_checksubtype_lkpCacheModel.benefit_checksubtype = getBenefit_checksubtype();

		String benefit_checksubtype = benefit_checksubtype_lkpCacheModel.benefit_checksubtype;

		if ((benefit_checksubtype != null) &&
				(benefit_checksubtype.length() == 0)) {
			benefit_checksubtype_lkpCacheModel.benefit_checksubtype = null;
		}

		benefit_checksubtype_lkpCacheModel.parent_id = getParent_id();

		return benefit_checksubtype_lkpCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{subbenefit_id=");
		sb.append(getSubbenefit_id());
		sb.append(", benefit_checksubtype=");
		sb.append(getBenefit_checksubtype());
		sb.append(", parent_id=");
		sb.append(getParent_id());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.benefit_checksubtype_lkp");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>subbenefit_id</column-name><column-value><![CDATA[");
		sb.append(getSubbenefit_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>benefit_checksubtype</column-name><column-value><![CDATA[");
		sb.append(getBenefit_checksubtype());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>parent_id</column-name><column-value><![CDATA[");
		sb.append(getParent_id());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = benefit_checksubtype_lkp.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			benefit_checksubtype_lkp.class
		};
	private long _subbenefit_id;
	private String _benefit_checksubtype;
	private long _parent_id;
	private benefit_checksubtype_lkp _escapedModelProxy;
}