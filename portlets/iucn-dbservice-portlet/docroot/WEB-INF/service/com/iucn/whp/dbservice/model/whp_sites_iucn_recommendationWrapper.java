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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link whp_sites_iucn_recommendation}.
 * </p>
 *
 * @author    alok.sen
 * @see       whp_sites_iucn_recommendation
 * @generated
 */
public class whp_sites_iucn_recommendationWrapper
	implements whp_sites_iucn_recommendation,
		ModelWrapper<whp_sites_iucn_recommendation> {
	public whp_sites_iucn_recommendationWrapper(
		whp_sites_iucn_recommendation whp_sites_iucn_recommendation) {
		_whp_sites_iucn_recommendation = whp_sites_iucn_recommendation;
	}

	public Class<?> getModelClass() {
		return whp_sites_iucn_recommendation.class;
	}

	public String getModelClassName() {
		return whp_sites_iucn_recommendation.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("whp_sites_iucn_recommendation_id",
			getWhp_sites_iucn_recommendation_id());
		attributes.put("site_id", getSite_id());
		attributes.put("recommendation_type", getRecommendation_type());
		attributes.put("rec_date", getRec_date());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long whp_sites_iucn_recommendation_id = (Long)attributes.get(
				"whp_sites_iucn_recommendation_id");

		if (whp_sites_iucn_recommendation_id != null) {
			setWhp_sites_iucn_recommendation_id(whp_sites_iucn_recommendation_id);
		}

		Long site_id = (Long)attributes.get("site_id");

		if (site_id != null) {
			setSite_id(site_id);
		}

		Integer recommendation_type = (Integer)attributes.get(
				"recommendation_type");

		if (recommendation_type != null) {
			setRecommendation_type(recommendation_type);
		}

		Date rec_date = (Date)attributes.get("rec_date");

		if (rec_date != null) {
			setRec_date(rec_date);
		}
	}

	/**
	* Returns the primary key of this whp_sites_iucn_recommendation.
	*
	* @return the primary key of this whp_sites_iucn_recommendation
	*/
	public long getPrimaryKey() {
		return _whp_sites_iucn_recommendation.getPrimaryKey();
	}

	/**
	* Sets the primary key of this whp_sites_iucn_recommendation.
	*
	* @param primaryKey the primary key of this whp_sites_iucn_recommendation
	*/
	public void setPrimaryKey(long primaryKey) {
		_whp_sites_iucn_recommendation.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the whp_sites_iucn_recommendation_id of this whp_sites_iucn_recommendation.
	*
	* @return the whp_sites_iucn_recommendation_id of this whp_sites_iucn_recommendation
	*/
	public long getWhp_sites_iucn_recommendation_id() {
		return _whp_sites_iucn_recommendation.getWhp_sites_iucn_recommendation_id();
	}

	/**
	* Sets the whp_sites_iucn_recommendation_id of this whp_sites_iucn_recommendation.
	*
	* @param whp_sites_iucn_recommendation_id the whp_sites_iucn_recommendation_id of this whp_sites_iucn_recommendation
	*/
	public void setWhp_sites_iucn_recommendation_id(
		long whp_sites_iucn_recommendation_id) {
		_whp_sites_iucn_recommendation.setWhp_sites_iucn_recommendation_id(whp_sites_iucn_recommendation_id);
	}

	/**
	* Returns the site_id of this whp_sites_iucn_recommendation.
	*
	* @return the site_id of this whp_sites_iucn_recommendation
	*/
	public long getSite_id() {
		return _whp_sites_iucn_recommendation.getSite_id();
	}

	/**
	* Sets the site_id of this whp_sites_iucn_recommendation.
	*
	* @param site_id the site_id of this whp_sites_iucn_recommendation
	*/
	public void setSite_id(long site_id) {
		_whp_sites_iucn_recommendation.setSite_id(site_id);
	}

	/**
	* Returns the recommendation_type of this whp_sites_iucn_recommendation.
	*
	* @return the recommendation_type of this whp_sites_iucn_recommendation
	*/
	public int getRecommendation_type() {
		return _whp_sites_iucn_recommendation.getRecommendation_type();
	}

	/**
	* Sets the recommendation_type of this whp_sites_iucn_recommendation.
	*
	* @param recommendation_type the recommendation_type of this whp_sites_iucn_recommendation
	*/
	public void setRecommendation_type(int recommendation_type) {
		_whp_sites_iucn_recommendation.setRecommendation_type(recommendation_type);
	}

	/**
	* Returns the rec_date of this whp_sites_iucn_recommendation.
	*
	* @return the rec_date of this whp_sites_iucn_recommendation
	*/
	public java.util.Date getRec_date() {
		return _whp_sites_iucn_recommendation.getRec_date();
	}

	/**
	* Sets the rec_date of this whp_sites_iucn_recommendation.
	*
	* @param rec_date the rec_date of this whp_sites_iucn_recommendation
	*/
	public void setRec_date(java.util.Date rec_date) {
		_whp_sites_iucn_recommendation.setRec_date(rec_date);
	}

	public boolean isNew() {
		return _whp_sites_iucn_recommendation.isNew();
	}

	public void setNew(boolean n) {
		_whp_sites_iucn_recommendation.setNew(n);
	}

	public boolean isCachedModel() {
		return _whp_sites_iucn_recommendation.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_whp_sites_iucn_recommendation.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _whp_sites_iucn_recommendation.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _whp_sites_iucn_recommendation.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_whp_sites_iucn_recommendation.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _whp_sites_iucn_recommendation.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_whp_sites_iucn_recommendation.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new whp_sites_iucn_recommendationWrapper((whp_sites_iucn_recommendation)_whp_sites_iucn_recommendation.clone());
	}

	public int compareTo(
		com.iucn.whp.dbservice.model.whp_sites_iucn_recommendation whp_sites_iucn_recommendation) {
		return _whp_sites_iucn_recommendation.compareTo(whp_sites_iucn_recommendation);
	}

	@Override
	public int hashCode() {
		return _whp_sites_iucn_recommendation.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.iucn.whp.dbservice.model.whp_sites_iucn_recommendation> toCacheModel() {
		return _whp_sites_iucn_recommendation.toCacheModel();
	}

	public com.iucn.whp.dbservice.model.whp_sites_iucn_recommendation toEscapedModel() {
		return new whp_sites_iucn_recommendationWrapper(_whp_sites_iucn_recommendation.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _whp_sites_iucn_recommendation.toString();
	}

	public java.lang.String toXmlString() {
		return _whp_sites_iucn_recommendation.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_whp_sites_iucn_recommendation.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public whp_sites_iucn_recommendation getWrappedwhp_sites_iucn_recommendation() {
		return _whp_sites_iucn_recommendation;
	}

	public whp_sites_iucn_recommendation getWrappedModel() {
		return _whp_sites_iucn_recommendation;
	}

	public void resetOriginalValues() {
		_whp_sites_iucn_recommendation.resetOriginalValues();
	}

	private whp_sites_iucn_recommendation _whp_sites_iucn_recommendation;
}