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
 * This class is a wrapper for {@link whp_sites_inscription_date}.
 * </p>
 *
 * @author    alok.sen
 * @see       whp_sites_inscription_date
 * @generated
 */
public class whp_sites_inscription_dateWrapper
	implements whp_sites_inscription_date,
		ModelWrapper<whp_sites_inscription_date> {
	public whp_sites_inscription_dateWrapper(
		whp_sites_inscription_date whp_sites_inscription_date) {
		_whp_sites_inscription_date = whp_sites_inscription_date;
	}

	public Class<?> getModelClass() {
		return whp_sites_inscription_date.class;
	}

	public String getModelClassName() {
		return whp_sites_inscription_date.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("whp_sites_inscription_date_id",
			getWhp_sites_inscription_date_id());
		attributes.put("site_id", getSite_id());
		attributes.put("inscription_type_id", getInscription_type_id());
		attributes.put("reference_no", getReference_no());
		attributes.put("inscription_date", getInscription_date());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long whp_sites_inscription_date_id = (Long)attributes.get(
				"whp_sites_inscription_date_id");

		if (whp_sites_inscription_date_id != null) {
			setWhp_sites_inscription_date_id(whp_sites_inscription_date_id);
		}

		Long site_id = (Long)attributes.get("site_id");

		if (site_id != null) {
			setSite_id(site_id);
		}

		Integer inscription_type_id = (Integer)attributes.get(
				"inscription_type_id");

		if (inscription_type_id != null) {
			setInscription_type_id(inscription_type_id);
		}

		String reference_no = (String)attributes.get("reference_no");

		if (reference_no != null) {
			setReference_no(reference_no);
		}

		Date inscription_date = (Date)attributes.get("inscription_date");

		if (inscription_date != null) {
			setInscription_date(inscription_date);
		}
	}

	/**
	* Returns the primary key of this whp_sites_inscription_date.
	*
	* @return the primary key of this whp_sites_inscription_date
	*/
	public long getPrimaryKey() {
		return _whp_sites_inscription_date.getPrimaryKey();
	}

	/**
	* Sets the primary key of this whp_sites_inscription_date.
	*
	* @param primaryKey the primary key of this whp_sites_inscription_date
	*/
	public void setPrimaryKey(long primaryKey) {
		_whp_sites_inscription_date.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the whp_sites_inscription_date_id of this whp_sites_inscription_date.
	*
	* @return the whp_sites_inscription_date_id of this whp_sites_inscription_date
	*/
	public long getWhp_sites_inscription_date_id() {
		return _whp_sites_inscription_date.getWhp_sites_inscription_date_id();
	}

	/**
	* Sets the whp_sites_inscription_date_id of this whp_sites_inscription_date.
	*
	* @param whp_sites_inscription_date_id the whp_sites_inscription_date_id of this whp_sites_inscription_date
	*/
	public void setWhp_sites_inscription_date_id(
		long whp_sites_inscription_date_id) {
		_whp_sites_inscription_date.setWhp_sites_inscription_date_id(whp_sites_inscription_date_id);
	}

	/**
	* Returns the site_id of this whp_sites_inscription_date.
	*
	* @return the site_id of this whp_sites_inscription_date
	*/
	public long getSite_id() {
		return _whp_sites_inscription_date.getSite_id();
	}

	/**
	* Sets the site_id of this whp_sites_inscription_date.
	*
	* @param site_id the site_id of this whp_sites_inscription_date
	*/
	public void setSite_id(long site_id) {
		_whp_sites_inscription_date.setSite_id(site_id);
	}

	/**
	* Returns the inscription_type_id of this whp_sites_inscription_date.
	*
	* @return the inscription_type_id of this whp_sites_inscription_date
	*/
	public int getInscription_type_id() {
		return _whp_sites_inscription_date.getInscription_type_id();
	}

	/**
	* Sets the inscription_type_id of this whp_sites_inscription_date.
	*
	* @param inscription_type_id the inscription_type_id of this whp_sites_inscription_date
	*/
	public void setInscription_type_id(int inscription_type_id) {
		_whp_sites_inscription_date.setInscription_type_id(inscription_type_id);
	}

	/**
	* Returns the reference_no of this whp_sites_inscription_date.
	*
	* @return the reference_no of this whp_sites_inscription_date
	*/
	public java.lang.String getReference_no() {
		return _whp_sites_inscription_date.getReference_no();
	}

	/**
	* Sets the reference_no of this whp_sites_inscription_date.
	*
	* @param reference_no the reference_no of this whp_sites_inscription_date
	*/
	public void setReference_no(java.lang.String reference_no) {
		_whp_sites_inscription_date.setReference_no(reference_no);
	}

	/**
	* Returns the inscription_date of this whp_sites_inscription_date.
	*
	* @return the inscription_date of this whp_sites_inscription_date
	*/
	public java.util.Date getInscription_date() {
		return _whp_sites_inscription_date.getInscription_date();
	}

	/**
	* Sets the inscription_date of this whp_sites_inscription_date.
	*
	* @param inscription_date the inscription_date of this whp_sites_inscription_date
	*/
	public void setInscription_date(java.util.Date inscription_date) {
		_whp_sites_inscription_date.setInscription_date(inscription_date);
	}

	public boolean isNew() {
		return _whp_sites_inscription_date.isNew();
	}

	public void setNew(boolean n) {
		_whp_sites_inscription_date.setNew(n);
	}

	public boolean isCachedModel() {
		return _whp_sites_inscription_date.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_whp_sites_inscription_date.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _whp_sites_inscription_date.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _whp_sites_inscription_date.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_whp_sites_inscription_date.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _whp_sites_inscription_date.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_whp_sites_inscription_date.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new whp_sites_inscription_dateWrapper((whp_sites_inscription_date)_whp_sites_inscription_date.clone());
	}

	public int compareTo(
		com.iucn.whp.dbservice.model.whp_sites_inscription_date whp_sites_inscription_date) {
		return _whp_sites_inscription_date.compareTo(whp_sites_inscription_date);
	}

	@Override
	public int hashCode() {
		return _whp_sites_inscription_date.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.iucn.whp.dbservice.model.whp_sites_inscription_date> toCacheModel() {
		return _whp_sites_inscription_date.toCacheModel();
	}

	public com.iucn.whp.dbservice.model.whp_sites_inscription_date toEscapedModel() {
		return new whp_sites_inscription_dateWrapper(_whp_sites_inscription_date.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _whp_sites_inscription_date.toString();
	}

	public java.lang.String toXmlString() {
		return _whp_sites_inscription_date.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_whp_sites_inscription_date.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public whp_sites_inscription_date getWrappedwhp_sites_inscription_date() {
		return _whp_sites_inscription_date;
	}

	public whp_sites_inscription_date getWrappedModel() {
		return _whp_sites_inscription_date;
	}

	public void resetOriginalValues() {
		_whp_sites_inscription_date.resetOriginalValues();
	}

	private whp_sites_inscription_date _whp_sites_inscription_date;
}