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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the key_conservation_scale_lkp service. Represents a row in the &quot;whp_key_conservation_scale_lkp&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.iucn.whp.dbservice.model.impl.key_conservation_scale_lkpModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.iucn.whp.dbservice.model.impl.key_conservation_scale_lkpImpl}.
 * </p>
 *
 * @author alok.sen
 * @see key_conservation_scale_lkp
 * @see com.iucn.whp.dbservice.model.impl.key_conservation_scale_lkpImpl
 * @see com.iucn.whp.dbservice.model.impl.key_conservation_scale_lkpModelImpl
 * @generated
 */
public interface key_conservation_scale_lkpModel extends BaseModel<key_conservation_scale_lkp> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a key_conservation_scale_lkp model instance should use the {@link key_conservation_scale_lkp} interface instead.
	 */

	/**
	 * Returns the primary key of this key_conservation_scale_lkp.
	 *
	 * @return the primary key of this key_conservation_scale_lkp
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this key_conservation_scale_lkp.
	 *
	 * @param primaryKey the primary key of this key_conservation_scale_lkp
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the scale_id of this key_conservation_scale_lkp.
	 *
	 * @return the scale_id of this key_conservation_scale_lkp
	 */
	public long getScale_id();

	/**
	 * Sets the scale_id of this key_conservation_scale_lkp.
	 *
	 * @param scale_id the scale_id of this key_conservation_scale_lkp
	 */
	public void setScale_id(long scale_id);

	/**
	 * Returns the scale of this key_conservation_scale_lkp.
	 *
	 * @return the scale of this key_conservation_scale_lkp
	 */
	@AutoEscape
	public String getScale();

	/**
	 * Sets the scale of this key_conservation_scale_lkp.
	 *
	 * @param scale the scale of this key_conservation_scale_lkp
	 */
	public void setScale(String scale);

	/**
	 * Returns the description of this key_conservation_scale_lkp.
	 *
	 * @return the description of this key_conservation_scale_lkp
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this key_conservation_scale_lkp.
	 *
	 * @param description the description of this key_conservation_scale_lkp
	 */
	public void setDescription(String description);

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

	public int compareTo(key_conservation_scale_lkp key_conservation_scale_lkp);

	public int hashCode();

	public CacheModel<key_conservation_scale_lkp> toCacheModel();

	public key_conservation_scale_lkp toEscapedModel();

	public String toString();

	public String toXmlString();
}