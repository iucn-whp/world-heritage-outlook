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

import com.iucn.whp.dbservice.model.unesco_region_country;
import com.iucn.whp.dbservice.model.unesco_region_countryModel;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the unesco_region_country service. Represents a row in the &quot;whp_unesco_region_country&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.iucn.whp.dbservice.model.unesco_region_countryModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link unesco_region_countryImpl}.
 * </p>
 *
 * @author alok.sen
 * @see unesco_region_countryImpl
 * @see com.iucn.whp.dbservice.model.unesco_region_country
 * @see com.iucn.whp.dbservice.model.unesco_region_countryModel
 * @generated
 */
public class unesco_region_countryModelImpl extends BaseModelImpl<unesco_region_country>
	implements unesco_region_countryModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a unesco_region_country model instance should use the {@link com.iucn.whp.dbservice.model.unesco_region_country} interface instead.
	 */
	public static final String TABLE_NAME = "whp_unesco_region_country";
	public static final Object[][] TABLE_COLUMNS = {
			{ "whp_unesco_region_country_id", Types.INTEGER },
			{ "countryid", Types.INTEGER },
			{ "unesco_region_id", Types.INTEGER }
		};
	public static final String TABLE_SQL_CREATE = "create table whp_unesco_region_country (whp_unesco_region_country_id INTEGER not null primary key,countryid INTEGER,unesco_region_id INTEGER)";
	public static final String TABLE_SQL_DROP = "drop table whp_unesco_region_country";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.iucn.whp.dbservice.model.unesco_region_country"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.iucn.whp.dbservice.model.unesco_region_country"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.iucn.whp.dbservice.model.unesco_region_country"),
			true);
	public static long COUNTRYID_COLUMN_BITMASK = 1L;
	public static long UNESCO_REGION_ID_COLUMN_BITMASK = 2L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.iucn.whp.dbservice.model.unesco_region_country"));

	public unesco_region_countryModelImpl() {
	}

	public int getPrimaryKey() {
		return _whp_unesco_region_country_id;
	}

	public void setPrimaryKey(int primaryKey) {
		setWhp_unesco_region_country_id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Integer(_whp_unesco_region_country_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	public Class<?> getModelClass() {
		return unesco_region_country.class;
	}

	public String getModelClassName() {
		return unesco_region_country.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("whp_unesco_region_country_id",
			getWhp_unesco_region_country_id());
		attributes.put("countryid", getCountryid());
		attributes.put("unesco_region_id", getUnesco_region_id());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer whp_unesco_region_country_id = (Integer)attributes.get(
				"whp_unesco_region_country_id");

		if (whp_unesco_region_country_id != null) {
			setWhp_unesco_region_country_id(whp_unesco_region_country_id);
		}

		Integer countryid = (Integer)attributes.get("countryid");

		if (countryid != null) {
			setCountryid(countryid);
		}

		Integer unesco_region_id = (Integer)attributes.get("unesco_region_id");

		if (unesco_region_id != null) {
			setUnesco_region_id(unesco_region_id);
		}
	}

	public int getWhp_unesco_region_country_id() {
		return _whp_unesco_region_country_id;
	}

	public void setWhp_unesco_region_country_id(
		int whp_unesco_region_country_id) {
		_whp_unesco_region_country_id = whp_unesco_region_country_id;
	}

	public int getCountryid() {
		return _countryid;
	}

	public void setCountryid(int countryid) {
		_columnBitmask |= COUNTRYID_COLUMN_BITMASK;

		if (!_setOriginalCountryid) {
			_setOriginalCountryid = true;

			_originalCountryid = _countryid;
		}

		_countryid = countryid;
	}

	public int getOriginalCountryid() {
		return _originalCountryid;
	}

	public int getUnesco_region_id() {
		return _unesco_region_id;
	}

	public void setUnesco_region_id(int unesco_region_id) {
		_columnBitmask |= UNESCO_REGION_ID_COLUMN_BITMASK;

		if (!_setOriginalUnesco_region_id) {
			_setOriginalUnesco_region_id = true;

			_originalUnesco_region_id = _unesco_region_id;
		}

		_unesco_region_id = unesco_region_id;
	}

	public int getOriginalUnesco_region_id() {
		return _originalUnesco_region_id;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public unesco_region_country toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (unesco_region_country)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public Object clone() {
		unesco_region_countryImpl unesco_region_countryImpl = new unesco_region_countryImpl();

		unesco_region_countryImpl.setWhp_unesco_region_country_id(getWhp_unesco_region_country_id());
		unesco_region_countryImpl.setCountryid(getCountryid());
		unesco_region_countryImpl.setUnesco_region_id(getUnesco_region_id());

		unesco_region_countryImpl.resetOriginalValues();

		return unesco_region_countryImpl;
	}

	public int compareTo(unesco_region_country unesco_region_country) {
		int primaryKey = unesco_region_country.getPrimaryKey();

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

		unesco_region_country unesco_region_country = null;

		try {
			unesco_region_country = (unesco_region_country)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		int primaryKey = unesco_region_country.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
		unesco_region_countryModelImpl unesco_region_countryModelImpl = this;

		unesco_region_countryModelImpl._originalCountryid = unesco_region_countryModelImpl._countryid;

		unesco_region_countryModelImpl._setOriginalCountryid = false;

		unesco_region_countryModelImpl._originalUnesco_region_id = unesco_region_countryModelImpl._unesco_region_id;

		unesco_region_countryModelImpl._setOriginalUnesco_region_id = false;

		unesco_region_countryModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<unesco_region_country> toCacheModel() {
		unesco_region_countryCacheModel unesco_region_countryCacheModel = new unesco_region_countryCacheModel();

		unesco_region_countryCacheModel.whp_unesco_region_country_id = getWhp_unesco_region_country_id();

		unesco_region_countryCacheModel.countryid = getCountryid();

		unesco_region_countryCacheModel.unesco_region_id = getUnesco_region_id();

		return unesco_region_countryCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{whp_unesco_region_country_id=");
		sb.append(getWhp_unesco_region_country_id());
		sb.append(", countryid=");
		sb.append(getCountryid());
		sb.append(", unesco_region_id=");
		sb.append(getUnesco_region_id());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.unesco_region_country");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>whp_unesco_region_country_id</column-name><column-value><![CDATA[");
		sb.append(getWhp_unesco_region_country_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>countryid</column-name><column-value><![CDATA[");
		sb.append(getCountryid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>unesco_region_id</column-name><column-value><![CDATA[");
		sb.append(getUnesco_region_id());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = unesco_region_country.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			unesco_region_country.class
		};
	private int _whp_unesco_region_country_id;
	private int _countryid;
	private int _originalCountryid;
	private boolean _setOriginalCountryid;
	private int _unesco_region_id;
	private int _originalUnesco_region_id;
	private boolean _setOriginalUnesco_region_id;
	private long _columnBitmask;
	private unesco_region_country _escapedModelProxy;
}