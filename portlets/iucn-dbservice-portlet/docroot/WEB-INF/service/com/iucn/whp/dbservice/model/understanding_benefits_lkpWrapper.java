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
 * This class is a wrapper for {@link understanding_benefits_lkp}.
 * </p>
 *
 * @author    alok.sen
 * @see       understanding_benefits_lkp
 * @generated
 */
public class understanding_benefits_lkpWrapper
	implements understanding_benefits_lkp,
		ModelWrapper<understanding_benefits_lkp> {
	public understanding_benefits_lkpWrapper(
		understanding_benefits_lkp understanding_benefits_lkp) {
		_understanding_benefits_lkp = understanding_benefits_lkp;
	}

	public Class<?> getModelClass() {
		return understanding_benefits_lkp.class;
	}

	public String getModelClassName() {
		return understanding_benefits_lkp.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("benefits_id", getBenefits_id());
		attributes.put("selected_benefit", getSelected_benefit());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long benefits_id = (Long)attributes.get("benefits_id");

		if (benefits_id != null) {
			setBenefits_id(benefits_id);
		}

		String selected_benefit = (String)attributes.get("selected_benefit");

		if (selected_benefit != null) {
			setSelected_benefit(selected_benefit);
		}
	}

	/**
	* Returns the primary key of this understanding_benefits_lkp.
	*
	* @return the primary key of this understanding_benefits_lkp
	*/
	public long getPrimaryKey() {
		return _understanding_benefits_lkp.getPrimaryKey();
	}

	/**
	* Sets the primary key of this understanding_benefits_lkp.
	*
	* @param primaryKey the primary key of this understanding_benefits_lkp
	*/
	public void setPrimaryKey(long primaryKey) {
		_understanding_benefits_lkp.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the benefits_id of this understanding_benefits_lkp.
	*
	* @return the benefits_id of this understanding_benefits_lkp
	*/
	public long getBenefits_id() {
		return _understanding_benefits_lkp.getBenefits_id();
	}

	/**
	* Sets the benefits_id of this understanding_benefits_lkp.
	*
	* @param benefits_id the benefits_id of this understanding_benefits_lkp
	*/
	public void setBenefits_id(long benefits_id) {
		_understanding_benefits_lkp.setBenefits_id(benefits_id);
	}

	/**
	* Returns the selected_benefit of this understanding_benefits_lkp.
	*
	* @return the selected_benefit of this understanding_benefits_lkp
	*/
	public java.lang.String getSelected_benefit() {
		return _understanding_benefits_lkp.getSelected_benefit();
	}

	/**
	* Sets the selected_benefit of this understanding_benefits_lkp.
	*
	* @param selected_benefit the selected_benefit of this understanding_benefits_lkp
	*/
	public void setSelected_benefit(java.lang.String selected_benefit) {
		_understanding_benefits_lkp.setSelected_benefit(selected_benefit);
	}

	public boolean isNew() {
		return _understanding_benefits_lkp.isNew();
	}

	public void setNew(boolean n) {
		_understanding_benefits_lkp.setNew(n);
	}

	public boolean isCachedModel() {
		return _understanding_benefits_lkp.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_understanding_benefits_lkp.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _understanding_benefits_lkp.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _understanding_benefits_lkp.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_understanding_benefits_lkp.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _understanding_benefits_lkp.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_understanding_benefits_lkp.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new understanding_benefits_lkpWrapper((understanding_benefits_lkp)_understanding_benefits_lkp.clone());
	}

	public int compareTo(
		com.iucn.whp.dbservice.model.understanding_benefits_lkp understanding_benefits_lkp) {
		return _understanding_benefits_lkp.compareTo(understanding_benefits_lkp);
	}

	@Override
	public int hashCode() {
		return _understanding_benefits_lkp.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.iucn.whp.dbservice.model.understanding_benefits_lkp> toCacheModel() {
		return _understanding_benefits_lkp.toCacheModel();
	}

	public com.iucn.whp.dbservice.model.understanding_benefits_lkp toEscapedModel() {
		return new understanding_benefits_lkpWrapper(_understanding_benefits_lkp.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _understanding_benefits_lkp.toString();
	}

	public java.lang.String toXmlString() {
		return _understanding_benefits_lkp.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_understanding_benefits_lkp.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public understanding_benefits_lkp getWrappedunderstanding_benefits_lkp() {
		return _understanding_benefits_lkp;
	}

	public understanding_benefits_lkp getWrappedModel() {
		return _understanding_benefits_lkp;
	}

	public void resetOriginalValues() {
		_understanding_benefits_lkp.resetOriginalValues();
	}

	private understanding_benefits_lkp _understanding_benefits_lkp;
}