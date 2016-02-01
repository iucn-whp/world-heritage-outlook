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
 * This class is a wrapper for {@link benefits_type_ref}.
 * </p>
 *
 * @author    alok.sen
 * @see       benefits_type_ref
 * @generated
 */
public class benefits_type_refWrapper implements benefits_type_ref,
	ModelWrapper<benefits_type_ref> {
	public benefits_type_refWrapper(benefits_type_ref benefits_type_ref) {
		_benefits_type_ref = benefits_type_ref;
	}

	public Class<?> getModelClass() {
		return benefits_type_ref.class;
	}

	public String getModelClassName() {
		return benefits_type_ref.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("benefits_type_ref_id", getBenefits_type_ref_id());
		attributes.put("benefits_id", getBenefits_id());
		attributes.put("benefit_checktype", getBenefit_checktype());
		attributes.put("benefit_checksubtype", getBenefit_checksubtype());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long benefits_type_ref_id = (Long)attributes.get("benefits_type_ref_id");

		if (benefits_type_ref_id != null) {
			setBenefits_type_ref_id(benefits_type_ref_id);
		}

		Long benefits_id = (Long)attributes.get("benefits_id");

		if (benefits_id != null) {
			setBenefits_id(benefits_id);
		}

		Long benefit_checktype = (Long)attributes.get("benefit_checktype");

		if (benefit_checktype != null) {
			setBenefit_checktype(benefit_checktype);
		}

		Long benefit_checksubtype = (Long)attributes.get("benefit_checksubtype");

		if (benefit_checksubtype != null) {
			setBenefit_checksubtype(benefit_checksubtype);
		}
	}

	/**
	* Returns the primary key of this benefits_type_ref.
	*
	* @return the primary key of this benefits_type_ref
	*/
	public long getPrimaryKey() {
		return _benefits_type_ref.getPrimaryKey();
	}

	/**
	* Sets the primary key of this benefits_type_ref.
	*
	* @param primaryKey the primary key of this benefits_type_ref
	*/
	public void setPrimaryKey(long primaryKey) {
		_benefits_type_ref.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the benefits_type_ref_id of this benefits_type_ref.
	*
	* @return the benefits_type_ref_id of this benefits_type_ref
	*/
	public long getBenefits_type_ref_id() {
		return _benefits_type_ref.getBenefits_type_ref_id();
	}

	/**
	* Sets the benefits_type_ref_id of this benefits_type_ref.
	*
	* @param benefits_type_ref_id the benefits_type_ref_id of this benefits_type_ref
	*/
	public void setBenefits_type_ref_id(long benefits_type_ref_id) {
		_benefits_type_ref.setBenefits_type_ref_id(benefits_type_ref_id);
	}

	/**
	* Returns the benefits_id of this benefits_type_ref.
	*
	* @return the benefits_id of this benefits_type_ref
	*/
	public long getBenefits_id() {
		return _benefits_type_ref.getBenefits_id();
	}

	/**
	* Sets the benefits_id of this benefits_type_ref.
	*
	* @param benefits_id the benefits_id of this benefits_type_ref
	*/
	public void setBenefits_id(long benefits_id) {
		_benefits_type_ref.setBenefits_id(benefits_id);
	}

	/**
	* Returns the benefit_checktype of this benefits_type_ref.
	*
	* @return the benefit_checktype of this benefits_type_ref
	*/
	public long getBenefit_checktype() {
		return _benefits_type_ref.getBenefit_checktype();
	}

	/**
	* Sets the benefit_checktype of this benefits_type_ref.
	*
	* @param benefit_checktype the benefit_checktype of this benefits_type_ref
	*/
	public void setBenefit_checktype(long benefit_checktype) {
		_benefits_type_ref.setBenefit_checktype(benefit_checktype);
	}

	/**
	* Returns the benefit_checksubtype of this benefits_type_ref.
	*
	* @return the benefit_checksubtype of this benefits_type_ref
	*/
	public long getBenefit_checksubtype() {
		return _benefits_type_ref.getBenefit_checksubtype();
	}

	/**
	* Sets the benefit_checksubtype of this benefits_type_ref.
	*
	* @param benefit_checksubtype the benefit_checksubtype of this benefits_type_ref
	*/
	public void setBenefit_checksubtype(long benefit_checksubtype) {
		_benefits_type_ref.setBenefit_checksubtype(benefit_checksubtype);
	}

	public boolean isNew() {
		return _benefits_type_ref.isNew();
	}

	public void setNew(boolean n) {
		_benefits_type_ref.setNew(n);
	}

	public boolean isCachedModel() {
		return _benefits_type_ref.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_benefits_type_ref.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _benefits_type_ref.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _benefits_type_ref.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_benefits_type_ref.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _benefits_type_ref.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_benefits_type_ref.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new benefits_type_refWrapper((benefits_type_ref)_benefits_type_ref.clone());
	}

	public int compareTo(
		com.iucn.whp.dbservice.model.benefits_type_ref benefits_type_ref) {
		return _benefits_type_ref.compareTo(benefits_type_ref);
	}

	@Override
	public int hashCode() {
		return _benefits_type_ref.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.iucn.whp.dbservice.model.benefits_type_ref> toCacheModel() {
		return _benefits_type_ref.toCacheModel();
	}

	public com.iucn.whp.dbservice.model.benefits_type_ref toEscapedModel() {
		return new benefits_type_refWrapper(_benefits_type_ref.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _benefits_type_ref.toString();
	}

	public java.lang.String toXmlString() {
		return _benefits_type_ref.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_benefits_type_ref.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public benefits_type_ref getWrappedbenefits_type_ref() {
		return _benefits_type_ref;
	}

	public benefits_type_ref getWrappedModel() {
		return _benefits_type_ref;
	}

	public void resetOriginalValues() {
		_benefits_type_ref.resetOriginalValues();
	}

	private benefits_type_ref _benefits_type_ref;
}