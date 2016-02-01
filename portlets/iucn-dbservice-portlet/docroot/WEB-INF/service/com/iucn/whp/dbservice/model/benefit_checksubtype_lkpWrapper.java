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
 * This class is a wrapper for {@link benefit_checksubtype_lkp}.
 * </p>
 *
 * @author    alok.sen
 * @see       benefit_checksubtype_lkp
 * @generated
 */
public class benefit_checksubtype_lkpWrapper implements benefit_checksubtype_lkp,
	ModelWrapper<benefit_checksubtype_lkp> {
	public benefit_checksubtype_lkpWrapper(
		benefit_checksubtype_lkp benefit_checksubtype_lkp) {
		_benefit_checksubtype_lkp = benefit_checksubtype_lkp;
	}

	public Class<?> getModelClass() {
		return benefit_checksubtype_lkp.class;
	}

	public String getModelClassName() {
		return benefit_checksubtype_lkp.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("subbenefit_id", getSubbenefit_id());
		attributes.put("benefit_checksubtype", getBenefit_checksubtype());
		attributes.put("parent_id", getParent_id());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long subbenefit_id = (Long)attributes.get("subbenefit_id");

		if (subbenefit_id != null) {
			setSubbenefit_id(subbenefit_id);
		}

		String benefit_checksubtype = (String)attributes.get(
				"benefit_checksubtype");

		if (benefit_checksubtype != null) {
			setBenefit_checksubtype(benefit_checksubtype);
		}

		Long parent_id = (Long)attributes.get("parent_id");

		if (parent_id != null) {
			setParent_id(parent_id);
		}
	}

	/**
	* Returns the primary key of this benefit_checksubtype_lkp.
	*
	* @return the primary key of this benefit_checksubtype_lkp
	*/
	public long getPrimaryKey() {
		return _benefit_checksubtype_lkp.getPrimaryKey();
	}

	/**
	* Sets the primary key of this benefit_checksubtype_lkp.
	*
	* @param primaryKey the primary key of this benefit_checksubtype_lkp
	*/
	public void setPrimaryKey(long primaryKey) {
		_benefit_checksubtype_lkp.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the subbenefit_id of this benefit_checksubtype_lkp.
	*
	* @return the subbenefit_id of this benefit_checksubtype_lkp
	*/
	public long getSubbenefit_id() {
		return _benefit_checksubtype_lkp.getSubbenefit_id();
	}

	/**
	* Sets the subbenefit_id of this benefit_checksubtype_lkp.
	*
	* @param subbenefit_id the subbenefit_id of this benefit_checksubtype_lkp
	*/
	public void setSubbenefit_id(long subbenefit_id) {
		_benefit_checksubtype_lkp.setSubbenefit_id(subbenefit_id);
	}

	/**
	* Returns the benefit_checksubtype of this benefit_checksubtype_lkp.
	*
	* @return the benefit_checksubtype of this benefit_checksubtype_lkp
	*/
	public java.lang.String getBenefit_checksubtype() {
		return _benefit_checksubtype_lkp.getBenefit_checksubtype();
	}

	/**
	* Sets the benefit_checksubtype of this benefit_checksubtype_lkp.
	*
	* @param benefit_checksubtype the benefit_checksubtype of this benefit_checksubtype_lkp
	*/
	public void setBenefit_checksubtype(java.lang.String benefit_checksubtype) {
		_benefit_checksubtype_lkp.setBenefit_checksubtype(benefit_checksubtype);
	}

	/**
	* Returns the parent_id of this benefit_checksubtype_lkp.
	*
	* @return the parent_id of this benefit_checksubtype_lkp
	*/
	public long getParent_id() {
		return _benefit_checksubtype_lkp.getParent_id();
	}

	/**
	* Sets the parent_id of this benefit_checksubtype_lkp.
	*
	* @param parent_id the parent_id of this benefit_checksubtype_lkp
	*/
	public void setParent_id(long parent_id) {
		_benefit_checksubtype_lkp.setParent_id(parent_id);
	}

	public boolean isNew() {
		return _benefit_checksubtype_lkp.isNew();
	}

	public void setNew(boolean n) {
		_benefit_checksubtype_lkp.setNew(n);
	}

	public boolean isCachedModel() {
		return _benefit_checksubtype_lkp.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_benefit_checksubtype_lkp.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _benefit_checksubtype_lkp.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _benefit_checksubtype_lkp.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_benefit_checksubtype_lkp.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _benefit_checksubtype_lkp.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_benefit_checksubtype_lkp.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new benefit_checksubtype_lkpWrapper((benefit_checksubtype_lkp)_benefit_checksubtype_lkp.clone());
	}

	public int compareTo(
		com.iucn.whp.dbservice.model.benefit_checksubtype_lkp benefit_checksubtype_lkp) {
		return _benefit_checksubtype_lkp.compareTo(benefit_checksubtype_lkp);
	}

	@Override
	public int hashCode() {
		return _benefit_checksubtype_lkp.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.iucn.whp.dbservice.model.benefit_checksubtype_lkp> toCacheModel() {
		return _benefit_checksubtype_lkp.toCacheModel();
	}

	public com.iucn.whp.dbservice.model.benefit_checksubtype_lkp toEscapedModel() {
		return new benefit_checksubtype_lkpWrapper(_benefit_checksubtype_lkp.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _benefit_checksubtype_lkp.toString();
	}

	public java.lang.String toXmlString() {
		return _benefit_checksubtype_lkp.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_benefit_checksubtype_lkp.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public benefit_checksubtype_lkp getWrappedbenefit_checksubtype_lkp() {
		return _benefit_checksubtype_lkp;
	}

	public benefit_checksubtype_lkp getWrappedModel() {
		return _benefit_checksubtype_lkp;
	}

	public void resetOriginalValues() {
		_benefit_checksubtype_lkp.resetOriginalValues();
	}

	private benefit_checksubtype_lkp _benefit_checksubtype_lkp;
}