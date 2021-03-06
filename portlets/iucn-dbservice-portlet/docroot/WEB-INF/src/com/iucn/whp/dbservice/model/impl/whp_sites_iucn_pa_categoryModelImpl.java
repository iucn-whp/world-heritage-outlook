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

import com.iucn.whp.dbservice.model.whp_sites_iucn_pa_category;
import com.iucn.whp.dbservice.model.whp_sites_iucn_pa_categoryModel;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
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
 * The base model implementation for the whp_sites_iucn_pa_category service. Represents a row in the &quot;whp_whp_sites_iucn_pa_category&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.iucn.whp.dbservice.model.whp_sites_iucn_pa_categoryModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link whp_sites_iucn_pa_categoryImpl}.
 * </p>
 *
 * @author alok.sen
 * @see whp_sites_iucn_pa_categoryImpl
 * @see com.iucn.whp.dbservice.model.whp_sites_iucn_pa_category
 * @see com.iucn.whp.dbservice.model.whp_sites_iucn_pa_categoryModel
 * @generated
 */
public class whp_sites_iucn_pa_categoryModelImpl extends BaseModelImpl<whp_sites_iucn_pa_category>
	implements whp_sites_iucn_pa_categoryModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a whp_sites_iucn_pa_category model instance should use the {@link com.iucn.whp.dbservice.model.whp_sites_iucn_pa_category} interface instead.
	 */
	public static final String TABLE_NAME = "whp_whp_sites_iucn_pa_category";
	public static final Object[][] TABLE_COLUMNS = {
			{ "whp_sites_iucn_pa_category_id", Types.BIGINT },
			{ "site_id", Types.BIGINT },
			{ "iucn_pa_category_id", Types.INTEGER }
		};
	public static final String TABLE_SQL_CREATE = "create table whp_whp_sites_iucn_pa_category (whp_sites_iucn_pa_category_id LONG not null primary key,site_id LONG,iucn_pa_category_id INTEGER)";
	public static final String TABLE_SQL_DROP = "drop table whp_whp_sites_iucn_pa_category";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.iucn.whp.dbservice.model.whp_sites_iucn_pa_category"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.iucn.whp.dbservice.model.whp_sites_iucn_pa_category"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.iucn.whp.dbservice.model.whp_sites_iucn_pa_category"),
			true);
	public static long IUCN_PA_CATEGORY_ID_COLUMN_BITMASK = 1L;
	public static long SITE_ID_COLUMN_BITMASK = 2L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.iucn.whp.dbservice.model.whp_sites_iucn_pa_category"));

	public whp_sites_iucn_pa_categoryModelImpl() {
	}

	public long getPrimaryKey() {
		return _whp_sites_iucn_pa_category_id;
	}

	public void setPrimaryKey(long primaryKey) {
		setWhp_sites_iucn_pa_category_id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_whp_sites_iucn_pa_category_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	public Class<?> getModelClass() {
		return whp_sites_iucn_pa_category.class;
	}

	public String getModelClassName() {
		return whp_sites_iucn_pa_category.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("whp_sites_iucn_pa_category_id",
			getWhp_sites_iucn_pa_category_id());
		attributes.put("site_id", getSite_id());
		attributes.put("iucn_pa_category_id", getIucn_pa_category_id());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long whp_sites_iucn_pa_category_id = (Long)attributes.get(
				"whp_sites_iucn_pa_category_id");

		if (whp_sites_iucn_pa_category_id != null) {
			setWhp_sites_iucn_pa_category_id(whp_sites_iucn_pa_category_id);
		}

		Long site_id = (Long)attributes.get("site_id");

		if (site_id != null) {
			setSite_id(site_id);
		}

		Integer iucn_pa_category_id = (Integer)attributes.get(
				"iucn_pa_category_id");

		if (iucn_pa_category_id != null) {
			setIucn_pa_category_id(iucn_pa_category_id);
		}
	}

	public long getWhp_sites_iucn_pa_category_id() {
		return _whp_sites_iucn_pa_category_id;
	}

	public void setWhp_sites_iucn_pa_category_id(
		long whp_sites_iucn_pa_category_id) {
		_whp_sites_iucn_pa_category_id = whp_sites_iucn_pa_category_id;
	}

	public long getSite_id() {
		return _site_id;
	}

	public void setSite_id(long site_id) {
		_columnBitmask |= SITE_ID_COLUMN_BITMASK;

		if (!_setOriginalSite_id) {
			_setOriginalSite_id = true;

			_originalSite_id = _site_id;
		}

		_site_id = site_id;
	}

	public long getOriginalSite_id() {
		return _originalSite_id;
	}

	public int getIucn_pa_category_id() {
		return _iucn_pa_category_id;
	}

	public void setIucn_pa_category_id(int iucn_pa_category_id) {
		_columnBitmask |= IUCN_PA_CATEGORY_ID_COLUMN_BITMASK;

		if (!_setOriginalIucn_pa_category_id) {
			_setOriginalIucn_pa_category_id = true;

			_originalIucn_pa_category_id = _iucn_pa_category_id;
		}

		_iucn_pa_category_id = iucn_pa_category_id;
	}

	public int getOriginalIucn_pa_category_id() {
		return _originalIucn_pa_category_id;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			whp_sites_iucn_pa_category.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public whp_sites_iucn_pa_category toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (whp_sites_iucn_pa_category)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public Object clone() {
		whp_sites_iucn_pa_categoryImpl whp_sites_iucn_pa_categoryImpl = new whp_sites_iucn_pa_categoryImpl();

		whp_sites_iucn_pa_categoryImpl.setWhp_sites_iucn_pa_category_id(getWhp_sites_iucn_pa_category_id());
		whp_sites_iucn_pa_categoryImpl.setSite_id(getSite_id());
		whp_sites_iucn_pa_categoryImpl.setIucn_pa_category_id(getIucn_pa_category_id());

		whp_sites_iucn_pa_categoryImpl.resetOriginalValues();

		return whp_sites_iucn_pa_categoryImpl;
	}

	public int compareTo(whp_sites_iucn_pa_category whp_sites_iucn_pa_category) {
		long primaryKey = whp_sites_iucn_pa_category.getPrimaryKey();

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

		whp_sites_iucn_pa_category whp_sites_iucn_pa_category = null;

		try {
			whp_sites_iucn_pa_category = (whp_sites_iucn_pa_category)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = whp_sites_iucn_pa_category.getPrimaryKey();

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
		whp_sites_iucn_pa_categoryModelImpl whp_sites_iucn_pa_categoryModelImpl = this;

		whp_sites_iucn_pa_categoryModelImpl._originalSite_id = whp_sites_iucn_pa_categoryModelImpl._site_id;

		whp_sites_iucn_pa_categoryModelImpl._setOriginalSite_id = false;

		whp_sites_iucn_pa_categoryModelImpl._originalIucn_pa_category_id = whp_sites_iucn_pa_categoryModelImpl._iucn_pa_category_id;

		whp_sites_iucn_pa_categoryModelImpl._setOriginalIucn_pa_category_id = false;

		whp_sites_iucn_pa_categoryModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<whp_sites_iucn_pa_category> toCacheModel() {
		whp_sites_iucn_pa_categoryCacheModel whp_sites_iucn_pa_categoryCacheModel =
			new whp_sites_iucn_pa_categoryCacheModel();

		whp_sites_iucn_pa_categoryCacheModel.whp_sites_iucn_pa_category_id = getWhp_sites_iucn_pa_category_id();

		whp_sites_iucn_pa_categoryCacheModel.site_id = getSite_id();

		whp_sites_iucn_pa_categoryCacheModel.iucn_pa_category_id = getIucn_pa_category_id();

		return whp_sites_iucn_pa_categoryCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{whp_sites_iucn_pa_category_id=");
		sb.append(getWhp_sites_iucn_pa_category_id());
		sb.append(", site_id=");
		sb.append(getSite_id());
		sb.append(", iucn_pa_category_id=");
		sb.append(getIucn_pa_category_id());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.whp_sites_iucn_pa_category");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>whp_sites_iucn_pa_category_id</column-name><column-value><![CDATA[");
		sb.append(getWhp_sites_iucn_pa_category_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>site_id</column-name><column-value><![CDATA[");
		sb.append(getSite_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>iucn_pa_category_id</column-name><column-value><![CDATA[");
		sb.append(getIucn_pa_category_id());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = whp_sites_iucn_pa_category.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			whp_sites_iucn_pa_category.class
		};
	private long _whp_sites_iucn_pa_category_id;
	private long _site_id;
	private long _originalSite_id;
	private boolean _setOriginalSite_id;
	private int _iucn_pa_category_id;
	private int _originalIucn_pa_category_id;
	private boolean _setOriginalIucn_pa_category_id;
	private long _columnBitmask;
	private whp_sites_iucn_pa_category _escapedModelProxy;
}