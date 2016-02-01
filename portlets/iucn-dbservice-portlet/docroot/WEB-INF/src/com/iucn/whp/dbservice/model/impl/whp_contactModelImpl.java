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

import com.iucn.whp.dbservice.model.whp_contact;
import com.iucn.whp.dbservice.model.whp_contactModel;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the whp_contact service. Represents a row in the &quot;whp_whp_contact&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.iucn.whp.dbservice.model.whp_contactModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link whp_contactImpl}.
 * </p>
 *
 * @author alok.sen
 * @see whp_contactImpl
 * @see com.iucn.whp.dbservice.model.whp_contact
 * @see com.iucn.whp.dbservice.model.whp_contactModel
 * @generated
 */
public class whp_contactModelImpl extends BaseModelImpl<whp_contact>
	implements whp_contactModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a whp_contact model instance should use the {@link com.iucn.whp.dbservice.model.whp_contact} interface instead.
	 */
	public static final String TABLE_NAME = "whp_whp_contact";
	public static final Object[][] TABLE_COLUMNS = {
			{ "contact_id", Types.INTEGER },
			{ "prefix", Types.VARCHAR },
			{ "last_name", Types.VARCHAR },
			{ "first_name", Types.VARCHAR },
			{ "email", Types.VARCHAR },
			{ "position", Types.VARCHAR },
			{ "organization", Types.VARCHAR },
			{ "address", Types.VARCHAR },
			{ "telephone", Types.VARCHAR },
			{ "last_updated", Types.TIMESTAMP },
			{ "categoryid", Types.INTEGER }
		};
	public static final String TABLE_SQL_CREATE = "create table whp_whp_contact (contact_id INTEGER not null primary key,prefix VARCHAR(4) null,last_name VARCHAR(100) null,first_name VARCHAR(100) null,email VARCHAR(100) null,position VARCHAR(200) null,organization VARCHAR(500) null,address VARCHAR(500) null,telephone VARCHAR(20) null,last_updated DATE null,categoryid INTEGER)";
	public static final String TABLE_SQL_DROP = "drop table whp_whp_contact";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.iucn.whp.dbservice.model.whp_contact"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.iucn.whp.dbservice.model.whp_contact"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.iucn.whp.dbservice.model.whp_contact"),
			true);
	public static long CATEGORYID_COLUMN_BITMASK = 1L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.iucn.whp.dbservice.model.whp_contact"));

	public whp_contactModelImpl() {
	}

	public int getPrimaryKey() {
		return _contact_id;
	}

	public void setPrimaryKey(int primaryKey) {
		setContact_id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Integer(_contact_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	public Class<?> getModelClass() {
		return whp_contact.class;
	}

	public String getModelClassName() {
		return whp_contact.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("contact_id", getContact_id());
		attributes.put("prefix", getPrefix());
		attributes.put("last_name", getLast_name());
		attributes.put("first_name", getFirst_name());
		attributes.put("email", getEmail());
		attributes.put("position", getPosition());
		attributes.put("organization", getOrganization());
		attributes.put("address", getAddress());
		attributes.put("telephone", getTelephone());
		attributes.put("last_updated", getLast_updated());
		attributes.put("categoryid", getCategoryid());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer contact_id = (Integer)attributes.get("contact_id");

		if (contact_id != null) {
			setContact_id(contact_id);
		}

		String prefix = (String)attributes.get("prefix");

		if (prefix != null) {
			setPrefix(prefix);
		}

		String last_name = (String)attributes.get("last_name");

		if (last_name != null) {
			setLast_name(last_name);
		}

		String first_name = (String)attributes.get("first_name");

		if (first_name != null) {
			setFirst_name(first_name);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String position = (String)attributes.get("position");

		if (position != null) {
			setPosition(position);
		}

		String organization = (String)attributes.get("organization");

		if (organization != null) {
			setOrganization(organization);
		}

		String address = (String)attributes.get("address");

		if (address != null) {
			setAddress(address);
		}

		String telephone = (String)attributes.get("telephone");

		if (telephone != null) {
			setTelephone(telephone);
		}

		Date last_updated = (Date)attributes.get("last_updated");

		if (last_updated != null) {
			setLast_updated(last_updated);
		}

		Integer categoryid = (Integer)attributes.get("categoryid");

		if (categoryid != null) {
			setCategoryid(categoryid);
		}
	}

	public int getContact_id() {
		return _contact_id;
	}

	public void setContact_id(int contact_id) {
		_contact_id = contact_id;
	}

	public String getPrefix() {
		if (_prefix == null) {
			return StringPool.BLANK;
		}
		else {
			return _prefix;
		}
	}

	public void setPrefix(String prefix) {
		_prefix = prefix;
	}

	public String getLast_name() {
		if (_last_name == null) {
			return StringPool.BLANK;
		}
		else {
			return _last_name;
		}
	}

	public void setLast_name(String last_name) {
		_last_name = last_name;
	}

	public String getFirst_name() {
		if (_first_name == null) {
			return StringPool.BLANK;
		}
		else {
			return _first_name;
		}
	}

	public void setFirst_name(String first_name) {
		_first_name = first_name;
	}

	public String getEmail() {
		if (_email == null) {
			return StringPool.BLANK;
		}
		else {
			return _email;
		}
	}

	public void setEmail(String email) {
		_email = email;
	}

	public String getPosition() {
		if (_position == null) {
			return StringPool.BLANK;
		}
		else {
			return _position;
		}
	}

	public void setPosition(String position) {
		_position = position;
	}

	public String getOrganization() {
		if (_organization == null) {
			return StringPool.BLANK;
		}
		else {
			return _organization;
		}
	}

	public void setOrganization(String organization) {
		_organization = organization;
	}

	public String getAddress() {
		if (_address == null) {
			return StringPool.BLANK;
		}
		else {
			return _address;
		}
	}

	public void setAddress(String address) {
		_address = address;
	}

	public String getTelephone() {
		if (_telephone == null) {
			return StringPool.BLANK;
		}
		else {
			return _telephone;
		}
	}

	public void setTelephone(String telephone) {
		_telephone = telephone;
	}

	public Date getLast_updated() {
		return _last_updated;
	}

	public void setLast_updated(Date last_updated) {
		_last_updated = last_updated;
	}

	public int getCategoryid() {
		return _categoryid;
	}

	public void setCategoryid(int categoryid) {
		_columnBitmask |= CATEGORYID_COLUMN_BITMASK;

		if (!_setOriginalCategoryid) {
			_setOriginalCategoryid = true;

			_originalCategoryid = _categoryid;
		}

		_categoryid = categoryid;
	}

	public int getOriginalCategoryid() {
		return _originalCategoryid;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public whp_contact toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (whp_contact)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public Object clone() {
		whp_contactImpl whp_contactImpl = new whp_contactImpl();

		whp_contactImpl.setContact_id(getContact_id());
		whp_contactImpl.setPrefix(getPrefix());
		whp_contactImpl.setLast_name(getLast_name());
		whp_contactImpl.setFirst_name(getFirst_name());
		whp_contactImpl.setEmail(getEmail());
		whp_contactImpl.setPosition(getPosition());
		whp_contactImpl.setOrganization(getOrganization());
		whp_contactImpl.setAddress(getAddress());
		whp_contactImpl.setTelephone(getTelephone());
		whp_contactImpl.setLast_updated(getLast_updated());
		whp_contactImpl.setCategoryid(getCategoryid());

		whp_contactImpl.resetOriginalValues();

		return whp_contactImpl;
	}

	public int compareTo(whp_contact whp_contact) {
		int primaryKey = whp_contact.getPrimaryKey();

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

		whp_contact whp_contact = null;

		try {
			whp_contact = (whp_contact)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		int primaryKey = whp_contact.getPrimaryKey();

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
		whp_contactModelImpl whp_contactModelImpl = this;

		whp_contactModelImpl._originalCategoryid = whp_contactModelImpl._categoryid;

		whp_contactModelImpl._setOriginalCategoryid = false;

		whp_contactModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<whp_contact> toCacheModel() {
		whp_contactCacheModel whp_contactCacheModel = new whp_contactCacheModel();

		whp_contactCacheModel.contact_id = getContact_id();

		whp_contactCacheModel.prefix = getPrefix();

		String prefix = whp_contactCacheModel.prefix;

		if ((prefix != null) && (prefix.length() == 0)) {
			whp_contactCacheModel.prefix = null;
		}

		whp_contactCacheModel.last_name = getLast_name();

		String last_name = whp_contactCacheModel.last_name;

		if ((last_name != null) && (last_name.length() == 0)) {
			whp_contactCacheModel.last_name = null;
		}

		whp_contactCacheModel.first_name = getFirst_name();

		String first_name = whp_contactCacheModel.first_name;

		if ((first_name != null) && (first_name.length() == 0)) {
			whp_contactCacheModel.first_name = null;
		}

		whp_contactCacheModel.email = getEmail();

		String email = whp_contactCacheModel.email;

		if ((email != null) && (email.length() == 0)) {
			whp_contactCacheModel.email = null;
		}

		whp_contactCacheModel.position = getPosition();

		String position = whp_contactCacheModel.position;

		if ((position != null) && (position.length() == 0)) {
			whp_contactCacheModel.position = null;
		}

		whp_contactCacheModel.organization = getOrganization();

		String organization = whp_contactCacheModel.organization;

		if ((organization != null) && (organization.length() == 0)) {
			whp_contactCacheModel.organization = null;
		}

		whp_contactCacheModel.address = getAddress();

		String address = whp_contactCacheModel.address;

		if ((address != null) && (address.length() == 0)) {
			whp_contactCacheModel.address = null;
		}

		whp_contactCacheModel.telephone = getTelephone();

		String telephone = whp_contactCacheModel.telephone;

		if ((telephone != null) && (telephone.length() == 0)) {
			whp_contactCacheModel.telephone = null;
		}

		Date last_updated = getLast_updated();

		if (last_updated != null) {
			whp_contactCacheModel.last_updated = last_updated.getTime();
		}
		else {
			whp_contactCacheModel.last_updated = Long.MIN_VALUE;
		}

		whp_contactCacheModel.categoryid = getCategoryid();

		return whp_contactCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{contact_id=");
		sb.append(getContact_id());
		sb.append(", prefix=");
		sb.append(getPrefix());
		sb.append(", last_name=");
		sb.append(getLast_name());
		sb.append(", first_name=");
		sb.append(getFirst_name());
		sb.append(", email=");
		sb.append(getEmail());
		sb.append(", position=");
		sb.append(getPosition());
		sb.append(", organization=");
		sb.append(getOrganization());
		sb.append(", address=");
		sb.append(getAddress());
		sb.append(", telephone=");
		sb.append(getTelephone());
		sb.append(", last_updated=");
		sb.append(getLast_updated());
		sb.append(", categoryid=");
		sb.append(getCategoryid());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(37);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.whp_contact");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>contact_id</column-name><column-value><![CDATA[");
		sb.append(getContact_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>prefix</column-name><column-value><![CDATA[");
		sb.append(getPrefix());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>last_name</column-name><column-value><![CDATA[");
		sb.append(getLast_name());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>first_name</column-name><column-value><![CDATA[");
		sb.append(getFirst_name());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>email</column-name><column-value><![CDATA[");
		sb.append(getEmail());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>position</column-name><column-value><![CDATA[");
		sb.append(getPosition());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>organization</column-name><column-value><![CDATA[");
		sb.append(getOrganization());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>address</column-name><column-value><![CDATA[");
		sb.append(getAddress());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>telephone</column-name><column-value><![CDATA[");
		sb.append(getTelephone());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>last_updated</column-name><column-value><![CDATA[");
		sb.append(getLast_updated());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>categoryid</column-name><column-value><![CDATA[");
		sb.append(getCategoryid());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = whp_contact.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			whp_contact.class
		};
	private int _contact_id;
	private String _prefix;
	private String _last_name;
	private String _first_name;
	private String _email;
	private String _position;
	private String _organization;
	private String _address;
	private String _telephone;
	private Date _last_updated;
	private int _categoryid;
	private int _originalCategoryid;
	private boolean _setOriginalCategoryid;
	private long _columnBitmask;
	private whp_contact _escapedModelProxy;
}