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

import com.iucn.whp.dbservice.model.whp_sites_boundary_modification;
import com.iucn.whp.dbservice.model.whp_sites_boundary_modificationModel;

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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the whp_sites_boundary_modification service. Represents a row in the &quot;whp_whp_sites_boundary_modification&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.iucn.whp.dbservice.model.whp_sites_boundary_modificationModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link whp_sites_boundary_modificationImpl}.
 * </p>
 *
 * @author alok.sen
 * @see whp_sites_boundary_modificationImpl
 * @see com.iucn.whp.dbservice.model.whp_sites_boundary_modification
 * @see com.iucn.whp.dbservice.model.whp_sites_boundary_modificationModel
 * @generated
 */
public class whp_sites_boundary_modificationModelImpl extends BaseModelImpl<whp_sites_boundary_modification>
	implements whp_sites_boundary_modificationModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a whp_sites_boundary_modification model instance should use the {@link com.iucn.whp.dbservice.model.whp_sites_boundary_modification} interface instead.
	 */
	public static final String TABLE_NAME = "whp_whp_sites_boundary_modification";
	public static final Object[][] TABLE_COLUMNS = {
			{ "whp_sites_boundary_modification_id", Types.BIGINT },
			{ "site_id", Types.BIGINT },
			{ "bmid", Types.INTEGER },
			{ "description", Types.VARCHAR },
			{ "mod_date", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table whp_whp_sites_boundary_modification (whp_sites_boundary_modification_id LONG not null primary key,site_id LONG,bmid INTEGER,description VARCHAR(200) null,mod_date DATE null)";
	public static final String TABLE_SQL_DROP = "drop table whp_whp_sites_boundary_modification";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.iucn.whp.dbservice.model.whp_sites_boundary_modification"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.iucn.whp.dbservice.model.whp_sites_boundary_modification"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.iucn.whp.dbservice.model.whp_sites_boundary_modification"),
			true);
	public static long BMID_COLUMN_BITMASK = 1L;
	public static long SITE_ID_COLUMN_BITMASK = 2L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.iucn.whp.dbservice.model.whp_sites_boundary_modification"));

	public whp_sites_boundary_modificationModelImpl() {
	}

	public long getPrimaryKey() {
		return _whp_sites_boundary_modification_id;
	}

	public void setPrimaryKey(long primaryKey) {
		setWhp_sites_boundary_modification_id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_whp_sites_boundary_modification_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	public Class<?> getModelClass() {
		return whp_sites_boundary_modification.class;
	}

	public String getModelClassName() {
		return whp_sites_boundary_modification.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("whp_sites_boundary_modification_id",
			getWhp_sites_boundary_modification_id());
		attributes.put("site_id", getSite_id());
		attributes.put("bmid", getBmid());
		attributes.put("description", getDescription());
		attributes.put("mod_date", getMod_date());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long whp_sites_boundary_modification_id = (Long)attributes.get(
				"whp_sites_boundary_modification_id");

		if (whp_sites_boundary_modification_id != null) {
			setWhp_sites_boundary_modification_id(whp_sites_boundary_modification_id);
		}

		Long site_id = (Long)attributes.get("site_id");

		if (site_id != null) {
			setSite_id(site_id);
		}

		Integer bmid = (Integer)attributes.get("bmid");

		if (bmid != null) {
			setBmid(bmid);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Date mod_date = (Date)attributes.get("mod_date");

		if (mod_date != null) {
			setMod_date(mod_date);
		}
	}

	public long getWhp_sites_boundary_modification_id() {
		return _whp_sites_boundary_modification_id;
	}

	public void setWhp_sites_boundary_modification_id(
		long whp_sites_boundary_modification_id) {
		_whp_sites_boundary_modification_id = whp_sites_boundary_modification_id;
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

	public int getBmid() {
		return _bmid;
	}

	public void setBmid(int bmid) {
		_columnBitmask |= BMID_COLUMN_BITMASK;

		if (!_setOriginalBmid) {
			_setOriginalBmid = true;

			_originalBmid = _bmid;
		}

		_bmid = bmid;
	}

	public int getOriginalBmid() {
		return _originalBmid;
	}

	public String getDescription() {
		if (_description == null) {
			return StringPool.BLANK;
		}
		else {
			return _description;
		}
	}

	public void setDescription(String description) {
		_description = description;
	}

	public Date getMod_date() {
		return _mod_date;
	}

	public void setMod_date(Date mod_date) {
		_mod_date = mod_date;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			whp_sites_boundary_modification.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public whp_sites_boundary_modification toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (whp_sites_boundary_modification)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public Object clone() {
		whp_sites_boundary_modificationImpl whp_sites_boundary_modificationImpl = new whp_sites_boundary_modificationImpl();

		whp_sites_boundary_modificationImpl.setWhp_sites_boundary_modification_id(getWhp_sites_boundary_modification_id());
		whp_sites_boundary_modificationImpl.setSite_id(getSite_id());
		whp_sites_boundary_modificationImpl.setBmid(getBmid());
		whp_sites_boundary_modificationImpl.setDescription(getDescription());
		whp_sites_boundary_modificationImpl.setMod_date(getMod_date());

		whp_sites_boundary_modificationImpl.resetOriginalValues();

		return whp_sites_boundary_modificationImpl;
	}

	public int compareTo(
		whp_sites_boundary_modification whp_sites_boundary_modification) {
		long primaryKey = whp_sites_boundary_modification.getPrimaryKey();

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

		whp_sites_boundary_modification whp_sites_boundary_modification = null;

		try {
			whp_sites_boundary_modification = (whp_sites_boundary_modification)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = whp_sites_boundary_modification.getPrimaryKey();

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
		whp_sites_boundary_modificationModelImpl whp_sites_boundary_modificationModelImpl =
			this;

		whp_sites_boundary_modificationModelImpl._originalSite_id = whp_sites_boundary_modificationModelImpl._site_id;

		whp_sites_boundary_modificationModelImpl._setOriginalSite_id = false;

		whp_sites_boundary_modificationModelImpl._originalBmid = whp_sites_boundary_modificationModelImpl._bmid;

		whp_sites_boundary_modificationModelImpl._setOriginalBmid = false;

		whp_sites_boundary_modificationModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<whp_sites_boundary_modification> toCacheModel() {
		whp_sites_boundary_modificationCacheModel whp_sites_boundary_modificationCacheModel =
			new whp_sites_boundary_modificationCacheModel();

		whp_sites_boundary_modificationCacheModel.whp_sites_boundary_modification_id = getWhp_sites_boundary_modification_id();

		whp_sites_boundary_modificationCacheModel.site_id = getSite_id();

		whp_sites_boundary_modificationCacheModel.bmid = getBmid();

		whp_sites_boundary_modificationCacheModel.description = getDescription();

		String description = whp_sites_boundary_modificationCacheModel.description;

		if ((description != null) && (description.length() == 0)) {
			whp_sites_boundary_modificationCacheModel.description = null;
		}

		Date mod_date = getMod_date();

		if (mod_date != null) {
			whp_sites_boundary_modificationCacheModel.mod_date = mod_date.getTime();
		}
		else {
			whp_sites_boundary_modificationCacheModel.mod_date = Long.MIN_VALUE;
		}

		return whp_sites_boundary_modificationCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{whp_sites_boundary_modification_id=");
		sb.append(getWhp_sites_boundary_modification_id());
		sb.append(", site_id=");
		sb.append(getSite_id());
		sb.append(", bmid=");
		sb.append(getBmid());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", mod_date=");
		sb.append(getMod_date());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append(
			"com.iucn.whp.dbservice.model.whp_sites_boundary_modification");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>whp_sites_boundary_modification_id</column-name><column-value><![CDATA[");
		sb.append(getWhp_sites_boundary_modification_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>site_id</column-name><column-value><![CDATA[");
		sb.append(getSite_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>bmid</column-name><column-value><![CDATA[");
		sb.append(getBmid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>mod_date</column-name><column-value><![CDATA[");
		sb.append(getMod_date());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = whp_sites_boundary_modification.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			whp_sites_boundary_modification.class
		};
	private long _whp_sites_boundary_modification_id;
	private long _site_id;
	private long _originalSite_id;
	private boolean _setOriginalSite_id;
	private int _bmid;
	private int _originalBmid;
	private boolean _setOriginalBmid;
	private String _description;
	private Date _mod_date;
	private long _columnBitmask;
	private whp_sites_boundary_modification _escapedModelProxy;
}