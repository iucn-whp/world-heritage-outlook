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

package com.iucn.whp.dbservice.model;

import com.iucn.whp.dbservice.service.whp_sites_soouvLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author alok.sen
 */
public class whp_sites_soouvClp extends BaseModelImpl<whp_sites_soouv>
	implements whp_sites_soouv {
	public whp_sites_soouvClp() {
	}

	public Class<?> getModelClass() {
		return whp_sites_soouv.class;
	}

	public String getModelClassName() {
		return whp_sites_soouv.class.getName();
	}

	public long getPrimaryKey() {
		return _whp_sites_soouv_id;
	}

	public void setPrimaryKey(long primaryKey) {
		setWhp_sites_soouv_id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_whp_sites_soouv_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("whp_sites_soouv_id", getWhp_sites_soouv_id());
		attributes.put("site_id", getSite_id());
		attributes.put("description_en", getDescription_en());
		attributes.put("description_fr", getDescription_fr());
		attributes.put("soouv_date", getSoouv_date());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long whp_sites_soouv_id = (Long)attributes.get("whp_sites_soouv_id");

		if (whp_sites_soouv_id != null) {
			setWhp_sites_soouv_id(whp_sites_soouv_id);
		}

		Long site_id = (Long)attributes.get("site_id");

		if (site_id != null) {
			setSite_id(site_id);
		}

		String description_en = (String)attributes.get("description_en");

		if (description_en != null) {
			setDescription_en(description_en);
		}

		String description_fr = (String)attributes.get("description_fr");

		if (description_fr != null) {
			setDescription_fr(description_fr);
		}

		Date soouv_date = (Date)attributes.get("soouv_date");

		if (soouv_date != null) {
			setSoouv_date(soouv_date);
		}
	}

	public long getWhp_sites_soouv_id() {
		return _whp_sites_soouv_id;
	}

	public void setWhp_sites_soouv_id(long whp_sites_soouv_id) {
		_whp_sites_soouv_id = whp_sites_soouv_id;
	}

	public long getSite_id() {
		return _site_id;
	}

	public void setSite_id(long site_id) {
		_site_id = site_id;
	}

	public String getDescription_en() {
		return _description_en;
	}

	public void setDescription_en(String description_en) {
		_description_en = description_en;
	}

	public String getDescription_fr() {
		return _description_fr;
	}

	public void setDescription_fr(String description_fr) {
		_description_fr = description_fr;
	}

	public Date getSoouv_date() {
		return _soouv_date;
	}

	public void setSoouv_date(Date soouv_date) {
		_soouv_date = soouv_date;
	}

	public BaseModel<?> getwhp_sites_soouvRemoteModel() {
		return _whp_sites_soouvRemoteModel;
	}

	public void setwhp_sites_soouvRemoteModel(
		BaseModel<?> whp_sites_soouvRemoteModel) {
		_whp_sites_soouvRemoteModel = whp_sites_soouvRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			whp_sites_soouvLocalServiceUtil.addwhp_sites_soouv(this);
		}
		else {
			whp_sites_soouvLocalServiceUtil.updatewhp_sites_soouv(this);
		}
	}

	@Override
	public whp_sites_soouv toEscapedModel() {
		return (whp_sites_soouv)Proxy.newProxyInstance(whp_sites_soouv.class.getClassLoader(),
			new Class[] { whp_sites_soouv.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		whp_sites_soouvClp clone = new whp_sites_soouvClp();

		clone.setWhp_sites_soouv_id(getWhp_sites_soouv_id());
		clone.setSite_id(getSite_id());
		clone.setDescription_en(getDescription_en());
		clone.setDescription_fr(getDescription_fr());
		clone.setSoouv_date(getSoouv_date());

		return clone;
	}

	public int compareTo(whp_sites_soouv whp_sites_soouv) {
		long primaryKey = whp_sites_soouv.getPrimaryKey();

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

		whp_sites_soouvClp whp_sites_soouv = null;

		try {
			whp_sites_soouv = (whp_sites_soouvClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = whp_sites_soouv.getPrimaryKey();

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
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{whp_sites_soouv_id=");
		sb.append(getWhp_sites_soouv_id());
		sb.append(", site_id=");
		sb.append(getSite_id());
		sb.append(", description_en=");
		sb.append(getDescription_en());
		sb.append(", description_fr=");
		sb.append(getDescription_fr());
		sb.append(", soouv_date=");
		sb.append(getSoouv_date());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.whp_sites_soouv");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>whp_sites_soouv_id</column-name><column-value><![CDATA[");
		sb.append(getWhp_sites_soouv_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>site_id</column-name><column-value><![CDATA[");
		sb.append(getSite_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description_en</column-name><column-value><![CDATA[");
		sb.append(getDescription_en());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description_fr</column-name><column-value><![CDATA[");
		sb.append(getDescription_fr());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soouv_date</column-name><column-value><![CDATA[");
		sb.append(getSoouv_date());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _whp_sites_soouv_id;
	private long _site_id;
	private String _description_en;
	private String _description_fr;
	private Date _soouv_date;
	private BaseModel<?> _whp_sites_soouvRemoteModel;
}