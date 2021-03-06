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
 * The base model interface for the current_state_trend_values service. Represents a row in the &quot;whp_current_state_trend_values&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.iucn.whp.dbservice.model.impl.current_state_trend_valuesModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.iucn.whp.dbservice.model.impl.current_state_trend_valuesImpl}.
 * </p>
 *
 * @author alok.sen
 * @see current_state_trend_values
 * @see com.iucn.whp.dbservice.model.impl.current_state_trend_valuesImpl
 * @see com.iucn.whp.dbservice.model.impl.current_state_trend_valuesModelImpl
 * @generated
 */
public interface current_state_trend_valuesModel extends BaseModel<current_state_trend_values> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a current_state_trend_values model instance should use the {@link current_state_trend_values} interface instead.
	 */

	/**
	 * Returns the primary key of this current_state_trend_values.
	 *
	 * @return the primary key of this current_state_trend_values
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this current_state_trend_values.
	 *
	 * @param primaryKey the primary key of this current_state_trend_values
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this current_state_trend_values.
	 *
	 * @return the ID of this current_state_trend_values
	 */
	public long getId();

	/**
	 * Sets the ID of this current_state_trend_values.
	 *
	 * @param id the ID of this current_state_trend_values
	 */
	public void setId(long id);

	/**
	 * Returns the vn of this current_state_trend_values.
	 *
	 * @return the vn of this current_state_trend_values
	 */
	public long getVn();

	/**
	 * Sets the vn of this current_state_trend_values.
	 *
	 * @param vn the vn of this current_state_trend_values
	 */
	public void setVn(long vn);

	/**
	 * Returns the whvalues_id of this current_state_trend_values.
	 *
	 * @return the whvalues_id of this current_state_trend_values
	 */
	public long getWhvalues_id();

	/**
	 * Sets the whvalues_id of this current_state_trend_values.
	 *
	 * @param whvalues_id the whvalues_id of this current_state_trend_values
	 */
	public void setWhvalues_id(long whvalues_id);

	/**
	 * Returns the state_trend_id of this current_state_trend_values.
	 *
	 * @return the state_trend_id of this current_state_trend_values
	 */
	public long getState_trend_id();

	/**
	 * Sets the state_trend_id of this current_state_trend_values.
	 *
	 * @param state_trend_id the state_trend_id of this current_state_trend_values
	 */
	public void setState_trend_id(long state_trend_id);

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

	public int compareTo(current_state_trend_values current_state_trend_values);

	public int hashCode();

	public CacheModel<current_state_trend_values> toCacheModel();

	public current_state_trend_values toEscapedModel();

	public String toString();

	public String toXmlString();
}