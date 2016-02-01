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
 * The base model interface for the benefit_checksubtype_lkp service. Represents a row in the &quot;whp_benefit_checksubtype_lkp&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.iucn.whp.dbservice.model.impl.benefit_checksubtype_lkpModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.iucn.whp.dbservice.model.impl.benefit_checksubtype_lkpImpl}.
 * </p>
 *
 * @author alok.sen
 * @see benefit_checksubtype_lkp
 * @see com.iucn.whp.dbservice.model.impl.benefit_checksubtype_lkpImpl
 * @see com.iucn.whp.dbservice.model.impl.benefit_checksubtype_lkpModelImpl
 * @generated
 */
public interface benefit_checksubtype_lkpModel extends BaseModel<benefit_checksubtype_lkp> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a benefit_checksubtype_lkp model instance should use the {@link benefit_checksubtype_lkp} interface instead.
	 */

	/**
	 * Returns the primary key of this benefit_checksubtype_lkp.
	 *
	 * @return the primary key of this benefit_checksubtype_lkp
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this benefit_checksubtype_lkp.
	 *
	 * @param primaryKey the primary key of this benefit_checksubtype_lkp
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the subbenefit_id of this benefit_checksubtype_lkp.
	 *
	 * @return the subbenefit_id of this benefit_checksubtype_lkp
	 */
	public long getSubbenefit_id();

	/**
	 * Sets the subbenefit_id of this benefit_checksubtype_lkp.
	 *
	 * @param subbenefit_id the subbenefit_id of this benefit_checksubtype_lkp
	 */
	public void setSubbenefit_id(long subbenefit_id);

	/**
	 * Returns the benefit_checksubtype of this benefit_checksubtype_lkp.
	 *
	 * @return the benefit_checksubtype of this benefit_checksubtype_lkp
	 */
	@AutoEscape
	public String getBenefit_checksubtype();

	/**
	 * Sets the benefit_checksubtype of this benefit_checksubtype_lkp.
	 *
	 * @param benefit_checksubtype the benefit_checksubtype of this benefit_checksubtype_lkp
	 */
	public void setBenefit_checksubtype(String benefit_checksubtype);

	/**
	 * Returns the parent_id of this benefit_checksubtype_lkp.
	 *
	 * @return the parent_id of this benefit_checksubtype_lkp
	 */
	public long getParent_id();

	/**
	 * Sets the parent_id of this benefit_checksubtype_lkp.
	 *
	 * @param parent_id the parent_id of this benefit_checksubtype_lkp
	 */
	public void setParent_id(long parent_id);

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

	public int compareTo(benefit_checksubtype_lkp benefit_checksubtype_lkp);

	public int hashCode();

	public CacheModel<benefit_checksubtype_lkp> toCacheModel();

	public benefit_checksubtype_lkp toEscapedModel();

	public String toString();

	public String toXmlString();
}