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
 * The base model interface for the benefits_type_ref service. Represents a row in the &quot;whp_benefits_type_ref&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.iucn.whp.dbservice.model.impl.benefits_type_refModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.iucn.whp.dbservice.model.impl.benefits_type_refImpl}.
 * </p>
 *
 * @author alok.sen
 * @see benefits_type_ref
 * @see com.iucn.whp.dbservice.model.impl.benefits_type_refImpl
 * @see com.iucn.whp.dbservice.model.impl.benefits_type_refModelImpl
 * @generated
 */
public interface benefits_type_refModel extends BaseModel<benefits_type_ref> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a benefits_type_ref model instance should use the {@link benefits_type_ref} interface instead.
	 */

	/**
	 * Returns the primary key of this benefits_type_ref.
	 *
	 * @return the primary key of this benefits_type_ref
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this benefits_type_ref.
	 *
	 * @param primaryKey the primary key of this benefits_type_ref
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the benefits_type_ref_id of this benefits_type_ref.
	 *
	 * @return the benefits_type_ref_id of this benefits_type_ref
	 */
	public long getBenefits_type_ref_id();

	/**
	 * Sets the benefits_type_ref_id of this benefits_type_ref.
	 *
	 * @param benefits_type_ref_id the benefits_type_ref_id of this benefits_type_ref
	 */
	public void setBenefits_type_ref_id(long benefits_type_ref_id);

	/**
	 * Returns the benefits_id of this benefits_type_ref.
	 *
	 * @return the benefits_id of this benefits_type_ref
	 */
	public long getBenefits_id();

	/**
	 * Sets the benefits_id of this benefits_type_ref.
	 *
	 * @param benefits_id the benefits_id of this benefits_type_ref
	 */
	public void setBenefits_id(long benefits_id);

	/**
	 * Returns the benefit_checktype of this benefits_type_ref.
	 *
	 * @return the benefit_checktype of this benefits_type_ref
	 */
	public long getBenefit_checktype();

	/**
	 * Sets the benefit_checktype of this benefits_type_ref.
	 *
	 * @param benefit_checktype the benefit_checktype of this benefits_type_ref
	 */
	public void setBenefit_checktype(long benefit_checktype);

	/**
	 * Returns the benefit_checksubtype of this benefits_type_ref.
	 *
	 * @return the benefit_checksubtype of this benefits_type_ref
	 */
	public long getBenefit_checksubtype();

	/**
	 * Sets the benefit_checksubtype of this benefits_type_ref.
	 *
	 * @param benefit_checksubtype the benefit_checksubtype of this benefits_type_ref
	 */
	public void setBenefit_checksubtype(long benefit_checksubtype);

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

	public int compareTo(benefits_type_ref benefits_type_ref);

	public int hashCode();

	public CacheModel<benefits_type_ref> toCacheModel();

	public benefits_type_ref toEscapedModel();

	public String toString();

	public String toXmlString();
}