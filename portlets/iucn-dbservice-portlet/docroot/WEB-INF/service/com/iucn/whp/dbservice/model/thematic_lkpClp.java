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

import com.iucn.whp.dbservice.service.thematic_lkpLocalServiceUtil;

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
public class thematic_lkpClp extends BaseModelImpl<thematic_lkp>
	implements thematic_lkp {
	public thematic_lkpClp() {
	}

	public Class<?> getModelClass() {
		return thematic_lkp.class;
	}

	public String getModelClassName() {
		return thematic_lkp.class.getName();
	}

	public long getPrimaryKey() {
		return _thematicid;
	}

	public void setPrimaryKey(long primaryKey) {
		setThematicid(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_thematicid);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("thematicid", getThematicid());
		attributes.put("thematic", getThematic());
		attributes.put("description", getDescription());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long thematicid = (Long)attributes.get("thematicid");

		if (thematicid != null) {
			setThematicid(thematicid);
		}

		String thematic = (String)attributes.get("thematic");

		if (thematic != null) {
			setThematic(thematic);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}
	}

	public long getThematicid() {
		return _thematicid;
	}

	public void setThematicid(long thematicid) {
		_thematicid = thematicid;
	}

	public String getThematic() {
		return _thematic;
	}

	public void setThematic(String thematic) {
		_thematic = thematic;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public BaseModel<?> getthematic_lkpRemoteModel() {
		return _thematic_lkpRemoteModel;
	}

	public void setthematic_lkpRemoteModel(BaseModel<?> thematic_lkpRemoteModel) {
		_thematic_lkpRemoteModel = thematic_lkpRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			thematic_lkpLocalServiceUtil.addthematic_lkp(this);
		}
		else {
			thematic_lkpLocalServiceUtil.updatethematic_lkp(this);
		}
	}

	@Override
	public thematic_lkp toEscapedModel() {
		return (thematic_lkp)Proxy.newProxyInstance(thematic_lkp.class.getClassLoader(),
			new Class[] { thematic_lkp.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		thematic_lkpClp clone = new thematic_lkpClp();

		clone.setThematicid(getThematicid());
		clone.setThematic(getThematic());
		clone.setDescription(getDescription());

		return clone;
	}

	public int compareTo(thematic_lkp thematic_lkp) {
		long primaryKey = thematic_lkp.getPrimaryKey();

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

		thematic_lkpClp thematic_lkp = null;

		try {
			thematic_lkp = (thematic_lkpClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = thematic_lkp.getPrimaryKey();

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

		sb.append("{thematicid=");
		sb.append(getThematicid());
		sb.append(", thematic=");
		sb.append(getThematic());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.thematic_lkp");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>thematicid</column-name><column-value><![CDATA[");
		sb.append(getThematicid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thematic</column-name><column-value><![CDATA[");
		sb.append(getThematic());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _thematicid;
	private String _thematic;
	private String _description;
	private BaseModel<?> _thematic_lkpRemoteModel;
}