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
 * This class is a wrapper for {@link whp_sites_soouv}.
 * </p>
 *
 * @author    alok.sen
 * @see       whp_sites_soouv
 * @generated
 */
public class whp_sites_soouvWrapper implements whp_sites_soouv,
	ModelWrapper<whp_sites_soouv> {
	public whp_sites_soouvWrapper(whp_sites_soouv whp_sites_soouv) {
		_whp_sites_soouv = whp_sites_soouv;
	}

	public Class<?> getModelClass() {
		return whp_sites_soouv.class;
	}

	public String getModelClassName() {
		return whp_sites_soouv.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("whp_sites_soouv_id", getWhp_sites_soouv_id());
		attributes.put("site_id", getSite_id());
		attributes.put("description_en", getDescription_en());
		attributes.put("description_fr", getDescription_fr());
		attributes.put("soouv_date", getSoouv_date());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long whp_sites_soouv_id = (Long)attributes.get("whp_sites_soouv_id");

		if (whp_sites_soouv_id != null) {
			setWhp_sites_soouv_id(whp_sites_soouv_id);
		}

		Long site_id = (Long)attributes.get("site_id");

		if (site_id != null) {
			setSite_id(site_id);
		}

		String description_en = (String)attributes.get("description_en");

		if (description_en != null) {
			setDescription_en(description_en);
		}

		String description_fr = (String)attributes.get("description_fr");

		if (description_fr != null) {
			setDescription_fr(description_fr);
		}

		Date soouv_date = (Date)attributes.get("soouv_date");

		if (soouv_date != null) {
			setSoouv_date(soouv_date);
		}
	}

	/**
	* Returns the primary key of this whp_sites_soouv.
	*
	* @return the primary key of this whp_sites_soouv
	*/
	public long getPrimaryKey() {
		return _whp_sites_soouv.getPrimaryKey();
	}

	/**
	* Sets the primary key of this whp_sites_soouv.
	*
	* @param primaryKey the primary key of this whp_sites_soouv
	*/
	public void setPrimaryKey(long primaryKey) {
		_whp_sites_soouv.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the whp_sites_soouv_id of this whp_sites_soouv.
	*
	* @return the whp_sites_soouv_id of this whp_sites_soouv
	*/
	public long getWhp_sites_soouv_id() {
		return _whp_sites_soouv.getWhp_sites_soouv_id();
	}

	/**
	* Sets the whp_sites_soouv_id of this whp_sites_soouv.
	*
	* @param whp_sites_soouv_id the whp_sites_soouv_id of this whp_sites_soouv
	*/
	public void setWhp_sites_soouv_id(long whp_sites_soouv_id) {
		_whp_sites_soouv.setWhp_sites_soouv_id(whp_sites_soouv_id);
	}

	/**
	* Returns the site_id of this whp_sites_soouv.
	*
	* @return the site_id of this whp_sites_soouv
	*/
	public long getSite_id() {
		return _whp_sites_soouv.getSite_id();
	}

	/**
	* Sets the site_id of this whp_sites_soouv.
	*
	* @param site_id the site_id of this whp_sites_soouv
	*/
	public void setSite_id(long site_id) {
		_whp_sites_soouv.setSite_id(site_id);
	}

	/**
	* Returns the description_en of this whp_sites_soouv.
	*
	* @return the description_en of this whp_sites_soouv
	*/
	public java.lang.String getDescription_en() {
		return _whp_sites_soouv.getDescription_en();
	}

	/**
	* Sets the description_en of this whp_sites_soouv.
	*
	* @param description_en the description_en of this whp_sites_soouv
	*/
	public void setDescription_en(java.lang.String description_en) {
		_whp_sites_soouv.setDescription_en(description_en);
	}

	/**
	* Returns the description_fr of this whp_sites_soouv.
	*
	* @return the description_fr of this whp_sites_soouv
	*/
	public java.lang.String getDescription_fr() {
		return _whp_sites_soouv.getDescription_fr();
	}

	/**
	* Sets the description_fr of this whp_sites_soouv.
	*
	* @param description_fr the description_fr of this whp_sites_soouv
	*/
	public void setDescription_fr(java.lang.String description_fr) {
		_whp_sites_soouv.setDescription_fr(description_fr);
	}

	/**
	* Returns the soouv_date of this whp_sites_soouv.
	*
	* @return the soouv_date of this whp_sites_soouv
	*/
	public java.util.Date getSoouv_date() {
		return _whp_sites_soouv.getSoouv_date();
	}

	/**
	* Sets the soouv_date of this whp_sites_soouv.
	*
	* @param soouv_date the soouv_date of this whp_sites_soouv
	*/
	public void setSoouv_date(java.util.Date soouv_date) {
		_whp_sites_soouv.setSoouv_date(soouv_date);
	}

	public boolean isNew() {
		return _whp_sites_soouv.isNew();
	}

	public void setNew(boolean n) {
		_whp_sites_soouv.setNew(n);
	}

	public boolean isCachedModel() {
		return _whp_sites_soouv.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_whp_sites_soouv.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _whp_sites_soouv.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _whp_sites_soouv.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_whp_sites_soouv.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _whp_sites_soouv.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_whp_sites_soouv.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new whp_sites_soouvWrapper((whp_sites_soouv)_whp_sites_soouv.clone());
	}

	public int compareTo(
		com.iucn.whp.dbservice.model.whp_sites_soouv whp_sites_soouv) {
		return _whp_sites_soouv.compareTo(whp_sites_soouv);
	}

	@Override
	public int hashCode() {
		return _whp_sites_soouv.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.iucn.whp.dbservice.model.whp_sites_soouv> toCacheModel() {
		return _whp_sites_soouv.toCacheModel();
	}

	public com.iucn.whp.dbservice.model.whp_sites_soouv toEscapedModel() {
		return new whp_sites_soouvWrapper(_whp_sites_soouv.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _whp_sites_soouv.toString();
	}

	public java.lang.String toXmlString() {
		return _whp_sites_soouv.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_whp_sites_soouv.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public whp_sites_soouv getWrappedwhp_sites_soouv() {
		return _whp_sites_soouv;
	}

	public whp_sites_soouv getWrappedModel() {
		return _whp_sites_soouv;
	}

	public void resetOriginalValues() {
		_whp_sites_soouv.resetOriginalValues();
	}

	private whp_sites_soouv _whp_sites_soouv;
}