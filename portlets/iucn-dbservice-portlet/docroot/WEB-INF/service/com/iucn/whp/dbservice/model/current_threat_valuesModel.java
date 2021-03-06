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

import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the current_threat_values service. Represents a row in the &quot;whp_current_threat_values&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.iucn.whp.dbservice.model.impl.current_threat_valuesModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.iucn.whp.dbservice.model.impl.current_threat_valuesImpl}.
 * </p>
 *
 * @author alok.sen
 * @see current_threat_values
 * @see com.iucn.whp.dbservice.model.impl.current_threat_valuesImpl
 * @see com.iucn.whp.dbservice.model.impl.current_threat_valuesModelImpl
 * @generated
 */
public interface current_threat_valuesModel extends BaseModel<current_threat_values> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a current_threat_values model instance should use the {@link current_threat_values} interface instead.
	 */

	/**
	 * Returns the primary key of this current_threat_values.
	 *
	 * @return the primary key of this current_threat_values
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this current_threat_values.
	 *
	 * @param primaryKey the primary key of this current_threat_values
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the current_threat_values_id of this current_threat_values.
	 *
	 * @return the current_threat_values_id of this current_threat_values
	 */
	public long getCurrent_threat_values_id();

	/**
	 * Sets the current_threat_values_id of this current_threat_values.
	 *
	 * @param current_threat_values_id the current_threat_values_id of this current_threat_values
	 */
	public void setCurrent_threat_values_id(long current_threat_values_id);

	/**
	 * Returns the current_threat_id of this current_threat_values.
	 *
	 * @return the current_threat_id of this current_threat_values
	 */
	public long getCurrent_threat_id();

	/**
	 * Sets the current_threat_id of this current_threat_values.
	 *
	 * @param current_threat_id the current_threat_id of this current_threat_values
	 */
	public void setCurrent_threat_id(long current_threat_id);

	/**
	 * Returns the whvalues_id of this current_threat_values.
	 *
	 * @return the whvalues_id of this current_threat_values
	 */
	public long getWhvalues_id();

	/**
	 * Sets the whvalues_id of this current_threat_values.
	 *
	 * @param whvalues_id the whvalues_id of this current_threat_values
	 */
	public void setWhvalues_id(long whvalues_id);

	/**
	 * Returns the is_biodiv_whval of this current_threat_values.
	 *
	 * @return the is_biodiv_whval of this current_threat_values
	 */
	public boolean getIs_biodiv_whval();

	/**
	 * Returns <code>true</code> if this current_threat_values is is_biodiv_whval.
	 *
	 * @return <code>true</code> if this current_threat_values is is_biodiv_whval; <code>false</code> otherwise
	 */
	public boolean isIs_biodiv_whval();

	/**
	 * Sets whether this current_threat_values is is_biodiv_whval.
	 *
	 * @param is_biodiv_whval the is_biodiv_whval of this current_threat_values
	 */
	public void setIs_biodiv_whval(boolean is_biodiv_whval);

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public Serializable getPrimaryKeyObj();

	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(current_threat_values current_threat_values);

	public int hashCode();

	public CacheModel<current_threat_values> toCacheModel();

	public current_threat_values toEscapedModel();

	public String toString();

	public String toXmlString();
}