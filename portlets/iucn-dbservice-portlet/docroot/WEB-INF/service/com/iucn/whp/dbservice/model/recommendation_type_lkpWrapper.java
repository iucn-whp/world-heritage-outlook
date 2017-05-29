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
 * This class is a wrapper for {@link recommendation_type_lkp}.
 * </p>
 *
 * @author    alok.sen
 * @see       recommendation_type_lkp
 * @generated
 */
public class recommendation_type_lkpWrapper implements recommendation_type_lkp,
	ModelWrapper<recommendation_type_lkp> {
	public recommendation_type_lkpWrapper(
		recommendation_type_lkp recommendation_type_lkp) {
		_recommendation_type_lkp = recommendation_type_lkp;
	}

	public Class<?> getModelClass() {
		return recommendation_type_lkp.class;
	}

	public String getModelClassName() {
		return recommendation_type_lkp.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("rec_type_id", getRec_type_id());
		attributes.put("recommendation", getRecommendation());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Integer rec_type_id = (Integer)attributes.get("rec_type_id");

		if (rec_type_id != null) {
			setRec_type_id(rec_type_id);
		}

		String recommendation = (String)attributes.get("recommendation");

		if (recommendation != null) {
			setRecommendation(recommendation);
		}
	}

	/**
	* Returns the primary key of this recommendation_type_lkp.
	*
	* @return the primary key of this recommendation_type_lkp
	*/
	public int getPrimaryKey() {
		return _recommendation_type_lkp.getPrimaryKey();
	}

	/**
	* Sets the primary key of this recommendation_type_lkp.
	*
	* @param primaryKey the primary key of this recommendation_type_lkp
	*/
	public void setPrimaryKey(int primaryKey) {
		_recommendation_type_lkp.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the rec_type_id of this recommendation_type_lkp.
	*
	* @return the rec_type_id of this recommendation_type_lkp
	*/
	public int getRec_type_id() {
		return _recommendation_type_lkp.getRec_type_id();
	}

	/**
	* Sets the rec_type_id of this recommendation_type_lkp.
	*
	* @param rec_type_id the rec_type_id of this recommendation_type_lkp
	*/
	public void setRec_type_id(int rec_type_id) {
		_recommendation_type_lkp.setRec_type_id(rec_type_id);
	}

	/**
	* Returns the recommendation of this recommendation_type_lkp.
	*
	* @return the recommendation of this recommendation_type_lkp
	*/
	public java.lang.String getRecommendation() {
		return _recommendation_type_lkp.getRecommendation();
	}

	/**
	* Sets the recommendation of this recommendation_type_lkp.
	*
	* @param recommendation the recommendation of this recommendation_type_lkp
	*/
	public void setRecommendation(java.lang.String recommendation) {
		_recommendation_type_lkp.setRecommendation(recommendation);
	}

	public boolean isNew() {
		return _recommendation_type_lkp.isNew();
	}

	public void setNew(boolean n) {
		_recommendation_type_lkp.setNew(n);
	}

	public boolean isCachedModel() {
		return _recommendation_type_lkp.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_recommendation_type_lkp.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _recommendation_type_lkp.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _recommendation_type_lkp.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_recommendation_type_lkp.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _recommendation_type_lkp.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_recommendation_type_lkp.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new recommendation_type_lkpWrapper((recommendation_type_lkp)_recommendation_type_lkp.clone());
	}

	public int compareTo(
		com.iucn.whp.dbservice.model.recommendation_type_lkp recommendation_type_lkp) {
		return _recommendation_type_lkp.compareTo(recommendation_type_lkp);
	}

	@Override
	public int hashCode() {
		return _recommendation_type_lkp.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.iucn.whp.dbservice.model.recommendation_type_lkp> toCacheModel() {
		return _recommendation_type_lkp.toCacheModel();
	}

	public com.iucn.whp.dbservice.model.recommendation_type_lkp toEscapedModel() {
		return new recommendation_type_lkpWrapper(_recommendation_type_lkp.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _recommendation_type_lkp.toString();
	}

	public java.lang.String toXmlString() {
		return _recommendation_type_lkp.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_recommendation_type_lkp.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public recommendation_type_lkp getWrappedrecommendation_type_lkp() {
		return _recommendation_type_lkp;
	}

	public recommendation_type_lkp getWrappedModel() {
		return _recommendation_type_lkp;
	}

	public void resetOriginalValues() {
		_recommendation_type_lkp.resetOriginalValues();
	}

	private recommendation_type_lkp _recommendation_type_lkp;
}