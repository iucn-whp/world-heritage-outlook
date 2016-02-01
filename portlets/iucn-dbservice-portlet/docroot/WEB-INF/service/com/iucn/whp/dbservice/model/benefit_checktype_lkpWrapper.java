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

import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link benefit_checktype_lkp}.
 * </p>
 *
 * @author    alok.sen
 * @see       benefit_checktype_lkp
 * @generated
 */
public class benefit_checktype_lkpWrapper implements benefit_checktype_lkp,
	ModelWrapper<benefit_checktype_lkp> {
	public benefit_checktype_lkpWrapper(
		benefit_checktype_lkp benefit_checktype_lkp) {
		_benefit_checktype_lkp = benefit_checktype_lkp;
	}

	public Class<?> getModelClass() {
		return benefit_checktype_lkp.class;
	}

	public String getModelClassName() {
		return benefit_checktype_lkp.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("benefit_id", getBenefit_id());
		attributes.put("benefit_checktype", getBenefit_checktype());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long benefit_id = (Long)attributes.get("benefit_id");

		if (benefit_id != null) {
			setBenefit_id(benefit_id);
		}

		String benefit_checktype = (String)attributes.get("benefit_checktype");

		if (benefit_checktype != null) {
			setBenefit_checktype(benefit_checktype);
		}
	}

	/**
	* Returns the primary key of this benefit_checktype_lkp.
	*
	* @return the primary key of this benefit_checktype_lkp
	*/
	public long getPrimaryKey() {
		return _benefit_checktype_lkp.getPrimaryKey();
	}

	/**
	* Sets the primary key of this benefit_checktype_lkp.
	*
	* @param primaryKey the primary key of this benefit_checktype_lkp
	*/
	public void setPrimaryKey(long primaryKey) {
		_benefit_checktype_lkp.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the benefit_id of this benefit_checktype_lkp.
	*
	* @return the benefit_id of this benefit_checktype_lkp
	*/
	public long getBenefit_id() {
		return _benefit_checktype_lkp.getBenefit_id();
	}

	/**
	* Sets the benefit_id of this benefit_checktype_lkp.
	*
	* @param benefit_id the benefit_id of this benefit_checktype_lkp
	*/
	public void setBenefit_id(long benefit_id) {
		_benefit_checktype_lkp.setBenefit_id(benefit_id);
	}

	/**
	* Returns the benefit_checktype of this benefit_checktype_lkp.
	*
	* @return the benefit_checktype of this benefit_checktype_lkp
	*/
	public java.lang.String getBenefit_checktype() {
		return _benefit_checktype_lkp.getBenefit_checktype();
	}

	/**
	* Sets the benefit_checktype of this benefit_checktype_lkp.
	*
	* @param benefit_checktype the benefit_checktype of this benefit_checktype_lkp
	*/
	public void setBenefit_checktype(java.lang.String benefit_checktype) {
		_benefit_checktype_lkp.setBenefit_checktype(benefit_checktype);
	}

	public boolean isNew() {
		return _benefit_checktype_lkp.isNew();
	}

	public void setNew(boolean n) {
		_benefit_checktype_lkp.setNew(n);
	}

	public boolean isCachedModel() {
		return _benefit_checktype_lkp.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_benefit_checktype_lkp.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _benefit_checktype_lkp.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _benefit_checktype_lkp.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_benefit_checktype_lkp.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _benefit_checktype_lkp.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_benefit_checktype_lkp.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new benefit_checktype_lkpWrapper((benefit_checktype_lkp)_benefit_checktype_lkp.clone());
	}

	public int compareTo(
		com.iucn.whp.dbservice.model.benefit_checktype_lkp benefit_checktype_lkp) {
		return _benefit_checktype_lkp.compareTo(benefit_checktype_lkp);
	}

	@Override
	public int hashCode() {
		return _benefit_checktype_lkp.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.iucn.whp.dbservice.model.benefit_checktype_lkp> toCacheModel() {
		return _benefit_checktype_lkp.toCacheModel();
	}

	public com.iucn.whp.dbservice.model.benefit_checktype_lkp toEscapedModel() {
		return new benefit_checktype_lkpWrapper(_benefit_checktype_lkp.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _benefit_checktype_lkp.toString();
	}

	public java.lang.String toXmlString() {
		return _benefit_checktype_lkp.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_benefit_checktype_lkp.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public benefit_checktype_lkp getWrappedbenefit_checktype_lkp() {
		return _benefit_checktype_lkp;
	}

	public benefit_checktype_lkp getWrappedModel() {
		return _benefit_checktype_lkp;
	}

	public void resetOriginalValues() {
		_benefit_checktype_lkp.resetOriginalValues();
	}

	private benefit_checktype_lkp _benefit_checktype_lkp;
}