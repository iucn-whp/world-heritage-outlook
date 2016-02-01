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

import com.iucn.whp.dbservice.service.whp_sites_inscription_dateLocalServiceUtil;

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
public class whp_sites_inscription_dateClp extends BaseModelImpl<whp_sites_inscription_date>
	implements whp_sites_inscription_date {
	public whp_sites_inscription_dateClp() {
	}

	public Class<?> getModelClass() {
		return whp_sites_inscription_date.class;
	}

	public String getModelClassName() {
		return whp_sites_inscription_date.class.getName();
	}

	public long getPrimaryKey() {
		return _whp_sites_inscription_date_id;
	}

	public void setPrimaryKey(long primaryKey) {
		setWhp_sites_inscription_date_id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_whp_sites_inscription_date_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("whp_sites_inscription_date_id",
			getWhp_sites_inscription_date_id());
		attributes.put("site_id", getSite_id());
		attributes.put("inscription_type_id", getInscription_type_id());
		attributes.put("reference_no", getReference_no());
		attributes.put("inscription_date", getInscription_date());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long whp_sites_inscription_date_id = (Long)attributes.get(
				"whp_sites_inscription_date_id");

		if (whp_sites_inscription_date_id != null) {
			setWhp_sites_inscription_date_id(whp_sites_inscription_date_id);
		}

		Long site_id = (Long)attributes.get("site_id");

		if (site_id != null) {
			setSite_id(site_id);
		}

		Integer inscription_type_id = (Integer)attributes.get(
				"inscription_type_id");

		if (inscription_type_id != null) {
			setInscription_type_id(inscription_type_id);
		}

		String reference_no = (String)attributes.get("reference_no");

		if (reference_no != null) {
			setReference_no(reference_no);
		}

		Date inscription_date = (Date)attributes.get("inscription_date");

		if (inscription_date != null) {
			setInscription_date(inscription_date);
		}
	}

	public long getWhp_sites_inscription_date_id() {
		return _whp_sites_inscription_date_id;
	}

	public void setWhp_sites_inscription_date_id(
		long whp_sites_inscription_date_id) {
		_whp_sites_inscription_date_id = whp_sites_inscription_date_id;
	}

	public long getSite_id() {
		return _site_id;
	}

	public void setSite_id(long site_id) {
		_site_id = site_id;
	}

	public int getInscription_type_id() {
		return _inscription_type_id;
	}

	public void setInscription_type_id(int inscription_type_id) {
		_inscription_type_id = inscription_type_id;
	}

	public String getReference_no() {
		return _reference_no;
	}

	public void setReference_no(String reference_no) {
		_reference_no = reference_no;
	}

	public Date getInscription_date() {
		return _inscription_date;
	}

	public void setInscription_date(Date inscription_date) {
		_inscription_date = inscription_date;
	}

	public BaseModel<?> getwhp_sites_inscription_dateRemoteModel() {
		return _whp_sites_inscription_dateRemoteModel;
	}

	public void setwhp_sites_inscription_dateRemoteModel(
		BaseModel<?> whp_sites_inscription_dateRemoteModel) {
		_whp_sites_inscription_dateRemoteModel = whp_sites_inscription_dateRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			whp_sites_inscription_dateLocalServiceUtil.addwhp_sites_inscription_date(this);
		}
		else {
			whp_sites_inscription_dateLocalServiceUtil.updatewhp_sites_inscription_date(this);
		}
	}

	@Override
	public whp_sites_inscription_date toEscapedModel() {
		return (whp_sites_inscription_date)Proxy.newProxyInstance(whp_sites_inscription_date.class.getClassLoader(),
			new Class[] { whp_sites_inscription_date.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		whp_sites_inscription_dateClp clone = new whp_sites_inscription_dateClp();

		clone.setWhp_sites_inscription_date_id(getWhp_sites_inscription_date_id());
		clone.setSite_id(getSite_id());
		clone.setInscription_type_id(getInscription_type_id());
		clone.setReference_no(getReference_no());
		clone.setInscription_date(getInscription_date());

		return clone;
	}

	public int compareTo(whp_sites_inscription_date whp_sites_inscription_date) {
		long primaryKey = whp_sites_inscription_date.getPrimaryKey();

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

		whp_sites_inscription_dateClp whp_sites_inscription_date = null;

		try {
			whp_sites_inscription_date = (whp_sites_inscription_dateClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = whp_sites_inscription_date.getPrimaryKey();

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

		sb.append("{whp_sites_inscription_date_id=");
		sb.append(getWhp_sites_inscription_date_id());
		sb.append(", site_id=");
		sb.append(getSite_id());
		sb.append(", inscription_type_id=");
		sb.append(getInscription_type_id());
		sb.append(", reference_no=");
		sb.append(getReference_no());
		sb.append(", inscription_date=");
		sb.append(getInscription_date());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.whp_sites_inscription_date");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>whp_sites_inscription_date_id</column-name><column-value><![CDATA[");
		sb.append(getWhp_sites_inscription_date_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>site_id</column-name><column-value><![CDATA[");
		sb.append(getSite_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inscription_type_id</column-name><column-value><![CDATA[");
		sb.append(getInscription_type_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>reference_no</column-name><column-value><![CDATA[");
		sb.append(getReference_no());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inscription_date</column-name><column-value><![CDATA[");
		sb.append(getInscription_date());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _whp_sites_inscription_date_id;
	private long _site_id;
	private int _inscription_type_id;
	private String _reference_no;
	private Date _inscription_date;
	private BaseModel<?> _whp_sites_inscription_dateRemoteModel;
}