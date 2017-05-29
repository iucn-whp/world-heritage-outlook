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

import com.iucn.whp.dbservice.service.whp_sites_iucn_recommendationLocalServiceUtil;

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
public class whp_sites_iucn_recommendationClp extends BaseModelImpl<whp_sites_iucn_recommendation>
	implements whp_sites_iucn_recommendation {
	public whp_sites_iucn_recommendationClp() {
	}

	public Class<?> getModelClass() {
		return whp_sites_iucn_recommendation.class;
	}

	public String getModelClassName() {
		return whp_sites_iucn_recommendation.class.getName();
	}

	public long getPrimaryKey() {
		return _whp_sites_iucn_recommendation_id;
	}

	public void setPrimaryKey(long primaryKey) {
		setWhp_sites_iucn_recommendation_id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_whp_sites_iucn_recommendation_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("whp_sites_iucn_recommendation_id",
			getWhp_sites_iucn_recommendation_id());
		attributes.put("site_id", getSite_id());
		attributes.put("recommendation_type", getRecommendation_type());
		attributes.put("rec_date", getRec_date());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long whp_sites_iucn_recommendation_id = (Long)attributes.get(
				"whp_sites_iucn_recommendation_id");

		if (whp_sites_iucn_recommendation_id != null) {
			setWhp_sites_iucn_recommendation_id(whp_sites_iucn_recommendation_id);
		}

		Long site_id = (Long)attributes.get("site_id");

		if (site_id != null) {
			setSite_id(site_id);
		}

		Integer recommendation_type = (Integer)attributes.get(
				"recommendation_type");

		if (recommendation_type != null) {
			setRecommendation_type(recommendation_type);
		}

		Date rec_date = (Date)attributes.get("rec_date");

		if (rec_date != null) {
			setRec_date(rec_date);
		}
	}

	public long getWhp_sites_iucn_recommendation_id() {
		return _whp_sites_iucn_recommendation_id;
	}

	public void setWhp_sites_iucn_recommendation_id(
		long whp_sites_iucn_recommendation_id) {
		_whp_sites_iucn_recommendation_id = whp_sites_iucn_recommendation_id;
	}

	public long getSite_id() {
		return _site_id;
	}

	public void setSite_id(long site_id) {
		_site_id = site_id;
	}

	public int getRecommendation_type() {
		return _recommendation_type;
	}

	public void setRecommendation_type(int recommendation_type) {
		_recommendation_type = recommendation_type;
	}

	public Date getRec_date() {
		return _rec_date;
	}

	public void setRec_date(Date rec_date) {
		_rec_date = rec_date;
	}

	public BaseModel<?> getwhp_sites_iucn_recommendationRemoteModel() {
		return _whp_sites_iucn_recommendationRemoteModel;
	}

	public void setwhp_sites_iucn_recommendationRemoteModel(
		BaseModel<?> whp_sites_iucn_recommendationRemoteModel) {
		_whp_sites_iucn_recommendationRemoteModel = whp_sites_iucn_recommendationRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			whp_sites_iucn_recommendationLocalServiceUtil.addwhp_sites_iucn_recommendation(this);
		}
		else {
			whp_sites_iucn_recommendationLocalServiceUtil.updatewhp_sites_iucn_recommendation(this);
		}
	}

	@Override
	public whp_sites_iucn_recommendation toEscapedModel() {
		return (whp_sites_iucn_recommendation)Proxy.newProxyInstance(whp_sites_iucn_recommendation.class.getClassLoader(),
			new Class[] { whp_sites_iucn_recommendation.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		whp_sites_iucn_recommendationClp clone = new whp_sites_iucn_recommendationClp();

		clone.setWhp_sites_iucn_recommendation_id(getWhp_sites_iucn_recommendation_id());
		clone.setSite_id(getSite_id());
		clone.setRecommendation_type(getRecommendation_type());
		clone.setRec_date(getRec_date());

		return clone;
	}

	public int compareTo(
		whp_sites_iucn_recommendation whp_sites_iucn_recommendation) {
		long primaryKey = whp_sites_iucn_recommendation.getPrimaryKey();

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

		whp_sites_iucn_recommendationClp whp_sites_iucn_recommendation = null;

		try {
			whp_sites_iucn_recommendation = (whp_sites_iucn_recommendationClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = whp_sites_iucn_recommendation.getPrimaryKey();

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
		StringBundler sb = new StringBundler(9);

		sb.append("{whp_sites_iucn_recommendation_id=");
		sb.append(getWhp_sites_iucn_recommendation_id());
		sb.append(", site_id=");
		sb.append(getSite_id());
		sb.append(", recommendation_type=");
		sb.append(getRecommendation_type());
		sb.append(", rec_date=");
		sb.append(getRec_date());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.whp_sites_iucn_recommendation");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>whp_sites_iucn_recommendation_id</column-name><column-value><![CDATA[");
		sb.append(getWhp_sites_iucn_recommendation_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>site_id</column-name><column-value><![CDATA[");
		sb.append(getSite_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>recommendation_type</column-name><column-value><![CDATA[");
		sb.append(getRecommendation_type());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>rec_date</column-name><column-value><![CDATA[");
		sb.append(getRec_date());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _whp_sites_iucn_recommendation_id;
	private long _site_id;
	private int _recommendation_type;
	private Date _rec_date;
	private BaseModel<?> _whp_sites_iucn_recommendationRemoteModel;
}