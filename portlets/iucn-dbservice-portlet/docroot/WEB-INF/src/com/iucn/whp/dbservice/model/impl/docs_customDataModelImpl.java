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

import com.iucn.whp.dbservice.model.docs_customData;
import com.iucn.whp.dbservice.model.docs_customDataModel;

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
 * The base model implementation for the docs_customData service. Represents a row in the &quot;whp_docs_customData&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.iucn.whp.dbservice.model.docs_customDataModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link docs_customDataImpl}.
 * </p>
 *
 * @author alok.sen
 * @see docs_customDataImpl
 * @see com.iucn.whp.dbservice.model.docs_customData
 * @see com.iucn.whp.dbservice.model.docs_customDataModel
 * @generated
 */
public class docs_customDataModelImpl extends BaseModelImpl<docs_customData>
	implements docs_customDataModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a docs_custom data model instance should use the {@link com.iucn.whp.dbservice.model.docs_customData} interface instead.
	 */
	public static final String TABLE_NAME = "whp_docs_customData";
	public static final Object[][] TABLE_COLUMNS = {
			{ "docs_customDataId", Types.INTEGER },
			{ "fileentryid", Types.BIGINT },
			{ "fileversionid", Types.BIGINT },
			{ "publish_date", Types.TIMESTAMP },
			{ "upload_date", Types.TIMESTAMP },
			{ "author", Types.VARCHAR },
			{ "type_", Types.VARCHAR },
			{ "category", Types.VARCHAR },
			{ "com", Types.VARCHAR },
			{ "full_com", Types.VARCHAR },
			{ "site", Types.VARCHAR },
			{ "language", Types.VARCHAR },
			{ "copyright", Types.VARCHAR },
			{ "title", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table whp_docs_customData (docs_customDataId INTEGER not null primary key,fileentryid LONG,fileversionid LONG,publish_date DATE null,upload_date DATE null,author VARCHAR(75) null,type_ VARCHAR(75) null,category VARCHAR(75) null,com VARCHAR(75) null,full_com VARCHAR(75) null,site VARCHAR(200) null,language VARCHAR(75) null,copyright VARCHAR(75) null,title VARCHAR(255) null)";
	public static final String TABLE_SQL_DROP = "drop table whp_docs_customData";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.iucn.whp.dbservice.model.docs_customData"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.iucn.whp.dbservice.model.docs_customData"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.iucn.whp.dbservice.model.docs_customData"),
			true);
	public static long AUTHOR_COLUMN_BITMASK = 1L;
	public static long CATEGORY_COLUMN_BITMASK = 2L;
	public static long FILEENTRYID_COLUMN_BITMASK = 4L;
	public static long PUBLISH_DATE_COLUMN_BITMASK = 8L;
	public static long TYPE_COLUMN_BITMASK = 16L;
	public static long UPLOAD_DATE_COLUMN_BITMASK = 32L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.iucn.whp.dbservice.model.docs_customData"));

	public docs_customDataModelImpl() {
	}

	public int getPrimaryKey() {
		return _docs_customDataId;
	}

	public void setPrimaryKey(int primaryKey) {
		setDocs_customDataId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Integer(_docs_customDataId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	public Class<?> getModelClass() {
		return docs_customData.class;
	}

	public String getModelClassName() {
		return docs_customData.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("docs_customDataId", getDocs_customDataId());
		attributes.put("fileentryid", getFileentryid());
		attributes.put("fileversionid", getFileversionid());
		attributes.put("publish_date", getPublish_date());
		attributes.put("upload_date", getUpload_date());
		attributes.put("author", getAuthor());
		attributes.put("type", getType());
		attributes.put("category", getCategory());
		attributes.put("com", getCom());
		attributes.put("full_com", getFull_com());
		attributes.put("site", getSite());
		attributes.put("language", getLanguage());
		attributes.put("copyright", getCopyright());
		attributes.put("title", getTitle());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer docs_customDataId = (Integer)attributes.get("docs_customDataId");

		if (docs_customDataId != null) {
			setDocs_customDataId(docs_customDataId);
		}

		Long fileentryid = (Long)attributes.get("fileentryid");

		if (fileentryid != null) {
			setFileentryid(fileentryid);
		}

		Long fileversionid = (Long)attributes.get("fileversionid");

		if (fileversionid != null) {
			setFileversionid(fileversionid);
		}

		Date publish_date = (Date)attributes.get("publish_date");

		if (publish_date != null) {
			setPublish_date(publish_date);
		}

		Date upload_date = (Date)attributes.get("upload_date");

		if (upload_date != null) {
			setUpload_date(upload_date);
		}

		String author = (String)attributes.get("author");

		if (author != null) {
			setAuthor(author);
		}

		String type = (String)attributes.get("type");

		if (type != null) {
			setType(type);
		}

		String category = (String)attributes.get("category");

		if (category != null) {
			setCategory(category);
		}

		String com = (String)attributes.get("com");

		if (com != null) {
			setCom(com);
		}

		String full_com = (String)attributes.get("full_com");

		if (full_com != null) {
			setFull_com(full_com);
		}

		String site = (String)attributes.get("site");

		if (site != null) {
			setSite(site);
		}

		String language = (String)attributes.get("language");

		if (language != null) {
			setLanguage(language);
		}

		String copyright = (String)attributes.get("copyright");

		if (copyright != null) {
			setCopyright(copyright);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}
	}

	public int getDocs_customDataId() {
		return _docs_customDataId;
	}

	public void setDocs_customDataId(int docs_customDataId) {
		_docs_customDataId = docs_customDataId;
	}

	public long getFileentryid() {
		return _fileentryid;
	}

	public void setFileentryid(long fileentryid) {
		_columnBitmask |= FILEENTRYID_COLUMN_BITMASK;

		if (!_setOriginalFileentryid) {
			_setOriginalFileentryid = true;

			_originalFileentryid = _fileentryid;
		}

		_fileentryid = fileentryid;
	}

	public long getOriginalFileentryid() {
		return _originalFileentryid;
	}

	public long getFileversionid() {
		return _fileversionid;
	}

	public void setFileversionid(long fileversionid) {
		_fileversionid = fileversionid;
	}

	public Date getPublish_date() {
		return _publish_date;
	}

	public void setPublish_date(Date publish_date) {
		_columnBitmask |= PUBLISH_DATE_COLUMN_BITMASK;

		if (_originalPublish_date == null) {
			_originalPublish_date = _publish_date;
		}

		_publish_date = publish_date;
	}

	public Date getOriginalPublish_date() {
		return _originalPublish_date;
	}

	public Date getUpload_date() {
		return _upload_date;
	}

	public void setUpload_date(Date upload_date) {
		_columnBitmask |= UPLOAD_DATE_COLUMN_BITMASK;

		if (_originalUpload_date == null) {
			_originalUpload_date = _upload_date;
		}

		_upload_date = upload_date;
	}

	public Date getOriginalUpload_date() {
		return _originalUpload_date;
	}

	public String getAuthor() {
		if (_author == null) {
			return StringPool.BLANK;
		}
		else {
			return _author;
		}
	}

	public void setAuthor(String author) {
		_columnBitmask |= AUTHOR_COLUMN_BITMASK;

		if (_originalAuthor == null) {
			_originalAuthor = _author;
		}

		_author = author;
	}

	public String getOriginalAuthor() {
		return GetterUtil.getString(_originalAuthor);
	}

	public String getType() {
		if (_type == null) {
			return StringPool.BLANK;
		}
		else {
			return _type;
		}
	}

	public void setType(String type) {
		_columnBitmask |= TYPE_COLUMN_BITMASK;

		if (_originalType == null) {
			_originalType = _type;
		}

		_type = type;
	}

	public String getOriginalType() {
		return GetterUtil.getString(_originalType);
	}

	public String getCategory() {
		if (_category == null) {
			return StringPool.BLANK;
		}
		else {
			return _category;
		}
	}

	public void setCategory(String category) {
		_columnBitmask |= CATEGORY_COLUMN_BITMASK;

		if (_originalCategory == null) {
			_originalCategory = _category;
		}

		_category = category;
	}

	public String getOriginalCategory() {
		return GetterUtil.getString(_originalCategory);
	}

	public String getCom() {
		if (_com == null) {
			return StringPool.BLANK;
		}
		else {
			return _com;
		}
	}

	public void setCom(String com) {
		_com = com;
	}

	public String getFull_com() {
		if (_full_com == null) {
			return StringPool.BLANK;
		}
		else {
			return _full_com;
		}
	}

	public void setFull_com(String full_com) {
		_full_com = full_com;
	}

	public String getSite() {
		if (_site == null) {
			return StringPool.BLANK;
		}
		else {
			return _site;
		}
	}

	public void setSite(String site) {
		_site = site;
	}

	public String getLanguage() {
		if (_language == null) {
			return StringPool.BLANK;
		}
		else {
			return _language;
		}
	}

	public void setLanguage(String language) {
		_language = language;
	}

	public String getCopyright() {
		if (_copyright == null) {
			return StringPool.BLANK;
		}
		else {
			return _copyright;
		}
	}

	public void setCopyright(String copyright) {
		_copyright = copyright;
	}

	public String getTitle() {
		if (_title == null) {
			return StringPool.BLANK;
		}
		else {
			return _title;
		}
	}

	public void setTitle(String title) {
		_title = title;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public docs_customData toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (docs_customData)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public Object clone() {
		docs_customDataImpl docs_customDataImpl = new docs_customDataImpl();

		docs_customDataImpl.setDocs_customDataId(getDocs_customDataId());
		docs_customDataImpl.setFileentryid(getFileentryid());
		docs_customDataImpl.setFileversionid(getFileversionid());
		docs_customDataImpl.setPublish_date(getPublish_date());
		docs_customDataImpl.setUpload_date(getUpload_date());
		docs_customDataImpl.setAuthor(getAuthor());
		docs_customDataImpl.setType(getType());
		docs_customDataImpl.setCategory(getCategory());
		docs_customDataImpl.setCom(getCom());
		docs_customDataImpl.setFull_com(getFull_com());
		docs_customDataImpl.setSite(getSite());
		docs_customDataImpl.setLanguage(getLanguage());
		docs_customDataImpl.setCopyright(getCopyright());
		docs_customDataImpl.setTitle(getTitle());

		docs_customDataImpl.resetOriginalValues();

		return docs_customDataImpl;
	}

	public int compareTo(docs_customData docs_customData) {
		int primaryKey = docs_customData.getPrimaryKey();

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

		docs_customData docs_customData = null;

		try {
			docs_customData = (docs_customData)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		int primaryKey = docs_customData.getPrimaryKey();

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
		docs_customDataModelImpl docs_customDataModelImpl = this;

		docs_customDataModelImpl._originalFileentryid = docs_customDataModelImpl._fileentryid;

		docs_customDataModelImpl._setOriginalFileentryid = false;

		docs_customDataModelImpl._originalPublish_date = docs_customDataModelImpl._publish_date;

		docs_customDataModelImpl._originalUpload_date = docs_customDataModelImpl._upload_date;

		docs_customDataModelImpl._originalAuthor = docs_customDataModelImpl._author;

		docs_customDataModelImpl._originalType = docs_customDataModelImpl._type;

		docs_customDataModelImpl._originalCategory = docs_customDataModelImpl._category;

		docs_customDataModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<docs_customData> toCacheModel() {
		docs_customDataCacheModel docs_customDataCacheModel = new docs_customDataCacheModel();

		docs_customDataCacheModel.docs_customDataId = getDocs_customDataId();

		docs_customDataCacheModel.fileentryid = getFileentryid();

		docs_customDataCacheModel.fileversionid = getFileversionid();

		Date publish_date = getPublish_date();

		if (publish_date != null) {
			docs_customDataCacheModel.publish_date = publish_date.getTime();
		}
		else {
			docs_customDataCacheModel.publish_date = Long.MIN_VALUE;
		}

		Date upload_date = getUpload_date();

		if (upload_date != null) {
			docs_customDataCacheModel.upload_date = upload_date.getTime();
		}
		else {
			docs_customDataCacheModel.upload_date = Long.MIN_VALUE;
		}

		docs_customDataCacheModel.author = getAuthor();

		String author = docs_customDataCacheModel.author;

		if ((author != null) && (author.length() == 0)) {
			docs_customDataCacheModel.author = null;
		}

		docs_customDataCacheModel.type = getType();

		String type = docs_customDataCacheModel.type;

		if ((type != null) && (type.length() == 0)) {
			docs_customDataCacheModel.type = null;
		}

		docs_customDataCacheModel.category = getCategory();

		String category = docs_customDataCacheModel.category;

		if ((category != null) && (category.length() == 0)) {
			docs_customDataCacheModel.category = null;
		}

		docs_customDataCacheModel.com = getCom();

		String com = docs_customDataCacheModel.com;

		if ((com != null) && (com.length() == 0)) {
			docs_customDataCacheModel.com = null;
		}

		docs_customDataCacheModel.full_com = getFull_com();

		String full_com = docs_customDataCacheModel.full_com;

		if ((full_com != null) && (full_com.length() == 0)) {
			docs_customDataCacheModel.full_com = null;
		}

		docs_customDataCacheModel.site = getSite();

		String site = docs_customDataCacheModel.site;

		if ((site != null) && (site.length() == 0)) {
			docs_customDataCacheModel.site = null;
		}

		docs_customDataCacheModel.language = getLanguage();

		String language = docs_customDataCacheModel.language;

		if ((language != null) && (language.length() == 0)) {
			docs_customDataCacheModel.language = null;
		}

		docs_customDataCacheModel.copyright = getCopyright();

		String copyright = docs_customDataCacheModel.copyright;

		if ((copyright != null) && (copyright.length() == 0)) {
			docs_customDataCacheModel.copyright = null;
		}

		docs_customDataCacheModel.title = getTitle();

		String title = docs_customDataCacheModel.title;

		if ((title != null) && (title.length() == 0)) {
			docs_customDataCacheModel.title = null;
		}

		return docs_customDataCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{docs_customDataId=");
		sb.append(getDocs_customDataId());
		sb.append(", fileentryid=");
		sb.append(getFileentryid());
		sb.append(", fileversionid=");
		sb.append(getFileversionid());
		sb.append(", publish_date=");
		sb.append(getPublish_date());
		sb.append(", upload_date=");
		sb.append(getUpload_date());
		sb.append(", author=");
		sb.append(getAuthor());
		sb.append(", type=");
		sb.append(getType());
		sb.append(", category=");
		sb.append(getCategory());
		sb.append(", com=");
		sb.append(getCom());
		sb.append(", full_com=");
		sb.append(getFull_com());
		sb.append(", site=");
		sb.append(getSite());
		sb.append(", language=");
		sb.append(getLanguage());
		sb.append(", copyright=");
		sb.append(getCopyright());
		sb.append(", title=");
		sb.append(getTitle());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(46);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.docs_customData");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>docs_customDataId</column-name><column-value><![CDATA[");
		sb.append(getDocs_customDataId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fileentryid</column-name><column-value><![CDATA[");
		sb.append(getFileentryid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fileversionid</column-name><column-value><![CDATA[");
		sb.append(getFileversionid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>publish_date</column-name><column-value><![CDATA[");
		sb.append(getPublish_date());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>upload_date</column-name><column-value><![CDATA[");
		sb.append(getUpload_date());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>author</column-name><column-value><![CDATA[");
		sb.append(getAuthor());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>type</column-name><column-value><![CDATA[");
		sb.append(getType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>category</column-name><column-value><![CDATA[");
		sb.append(getCategory());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>com</column-name><column-value><![CDATA[");
		sb.append(getCom());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>full_com</column-name><column-value><![CDATA[");
		sb.append(getFull_com());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>site</column-name><column-value><![CDATA[");
		sb.append(getSite());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>language</column-name><column-value><![CDATA[");
		sb.append(getLanguage());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>copyright</column-name><column-value><![CDATA[");
		sb.append(getCopyright());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>title</column-name><column-value><![CDATA[");
		sb.append(getTitle());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = docs_customData.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			docs_customData.class
		};
	private int _docs_customDataId;
	private long _fileentryid;
	private long _originalFileentryid;
	private boolean _setOriginalFileentryid;
	private long _fileversionid;
	private Date _publish_date;
	private Date _originalPublish_date;
	private Date _upload_date;
	private Date _originalUpload_date;
	private String _author;
	private String _originalAuthor;
	private String _type;
	private String _originalType;
	private String _category;
	private String _originalCategory;
	private String _com;
	private String _full_com;
	private String _site;
	private String _language;
	private String _copyright;
	private String _title;
	private long _columnBitmask;
	private docs_customData _escapedModelProxy;
}