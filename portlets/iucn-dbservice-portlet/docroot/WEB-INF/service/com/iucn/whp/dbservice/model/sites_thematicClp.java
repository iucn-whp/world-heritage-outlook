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

import com.iucn.whp.dbservice.service.sites_thematicLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author alok.sen
 */
public class sites_thematicClp extends BaseModelImpl<sites_thematic>
	implements sites_thematic {
	public sites_thematicClp() {
	}

	public Class<?> getModelClass() {
		return sites_thematic.class;
	}

	public String getModelClassName() {
		return sites_thematic.class.getName();
	}

	public long getPrimaryKey() {
		return _sitethematicid;
	}

	public void setPrimaryKey(long primaryKey) {
		setSitethematicid(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_sitethematicid);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("sitethematicid", getSitethematicid());
		attributes.put("site_id", getSite_id());
		attributes.put("thematicid", getThematicid());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long sitethematicid = (Long)attributes.get("sitethematicid");

		if (sitethematicid != null) {
			setSitethematicid(sitethematicid);
		}

		Long site_id = (Long)attributes.get("site_id");

		if (site_id != null) {
			setSite_id(site_id);
		}

		Long thematicid = (Long)attributes.get("thematicid");

		if (thematicid != null) {
			setThematicid(thematicid);
		}
	}

	public long getSitethematicid() {
		return _sitethematicid;
	}

	public void setSitethematicid(long sitethematicid) {
		_sitethematicid = sitethematicid;
	}

	public long getSite_id() {
		return _site_id;
	}

	public void setSite_id(long site_id) {
		_site_id = site_id;
	}

	public long getThematicid() {
		return _thematicid;
	}

	public void setThematicid(long thematicid) {
		_thematicid = thematicid;
	}

	public BaseModel<?> getsites_thematicRemoteModel() {
		return _sites_thematicRemoteModel;
	}

	public void setsites_thematicRemoteModel(
		BaseModel<?> sites_thematicRemoteModel) {
		_sites_thematicRemoteModel = sites_thematicRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			sites_thematicLocalServiceUtil.addsites_thematic(this);
		}
		else {
			sites_thematicLocalServiceUtil.updatesites_thematic(this);
		}
	}

	@Override
	public sites_thematic toEscapedModel() {
		return (sites_thematic)Proxy.newProxyInstance(sites_thematic.class.getClassLoader(),
			new Class[] { sites_thematic.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		sites_thematicClp clone = new sites_thematicClp();

		clone.setSitethematicid(getSitethematicid());
		clone.setSite_id(getSite_id());
		clone.setThematicid(getThematicid());

		return clone;
	}

	public int compareTo(sites_thematic sites_thematic) {
		long primaryKey = sites_thematic.getPrimaryKey();

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

		sites_thematicClp sites_thematic = null;

		try {
			sites_thematic = (sites_thematicClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = sites_thematic.getPrimaryKey();

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
		StringBundler sb = new StringBundler(7);

		sb.append("{sitethematicid=");
		sb.append(getSitethematicid());
		sb.append(", site_id=");
		sb.append(getSite_id());
		sb.append(", thematicid=");
		sb.append(getThematicid());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.sites_thematic");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>sitethematicid</column-name><column-value><![CDATA[");
		sb.append(getSitethematicid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>site_id</column-name><column-value><![CDATA[");
		sb.append(getSite_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thematicid</column-name><column-value><![CDATA[");
		sb.append(getThematicid());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _sitethematicid;
	private long _site_id;
	private long _thematicid;
	private BaseModel<?> _sites_thematicRemoteModel;
}