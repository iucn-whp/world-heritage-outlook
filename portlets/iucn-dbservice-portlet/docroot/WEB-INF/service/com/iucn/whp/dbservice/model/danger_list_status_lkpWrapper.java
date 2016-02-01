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
 * This class is a wrapper for {@link danger_list_status_lkp}.
 * </p>
 *
 * @author    alok.sen
 * @see       danger_list_status_lkp
 * @generated
 */
public class danger_list_status_lkpWrapper implements danger_list_status_lkp,
	ModelWrapper<danger_list_status_lkp> {
	public danger_list_status_lkpWrapper(
		danger_list_status_lkp danger_list_status_lkp) {
		_danger_list_status_lkp = danger_list_status_lkp;
	}

	public Class<?> getModelClass() {
		return danger_list_status_lkp.class;
	}

	public String getModelClassName() {
		return danger_list_status_lkp.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("dlstatus_id", getDlstatus_id());
		attributes.put("dl_status", getDl_status());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Integer dlstatus_id = (Integer)attributes.get("dlstatus_id");

		if (dlstatus_id != null) {
			setDlstatus_id(dlstatus_id);
		}

		String dl_status = (String)attributes.get("dl_status");

		if (dl_status != null) {
			setDl_status(dl_status);
		}
	}

	/**
	* Returns the primary key of this danger_list_status_lkp.
	*
	* @return the primary key of this danger_list_status_lkp
	*/
	public int getPrimaryKey() {
		return _danger_list_status_lkp.getPrimaryKey();
	}

	/**
	* Sets the primary key of this danger_list_status_lkp.
	*
	* @param primaryKey the primary key of this danger_list_status_lkp
	*/
	public void setPrimaryKey(int primaryKey) {
		_danger_list_status_lkp.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the dlstatus_id of this danger_list_status_lkp.
	*
	* @return the dlstatus_id of this danger_list_status_lkp
	*/
	public int getDlstatus_id() {
		return _danger_list_status_lkp.getDlstatus_id();
	}

	/**
	* Sets the dlstatus_id of this danger_list_status_lkp.
	*
	* @param dlstatus_id the dlstatus_id of this danger_list_status_lkp
	*/
	public void setDlstatus_id(int dlstatus_id) {
		_danger_list_status_lkp.setDlstatus_id(dlstatus_id);
	}

	/**
	* Returns the dl_status of this danger_list_status_lkp.
	*
	* @return the dl_status of this danger_list_status_lkp
	*/
	public java.lang.String getDl_status() {
		return _danger_list_status_lkp.getDl_status();
	}

	/**
	* Sets the dl_status of this danger_list_status_lkp.
	*
	* @param dl_status the dl_status of this danger_list_status_lkp
	*/
	public void setDl_status(java.lang.String dl_status) {
		_danger_list_status_lkp.setDl_status(dl_status);
	}

	public boolean isNew() {
		return _danger_list_status_lkp.isNew();
	}

	public void setNew(boolean n) {
		_danger_list_status_lkp.setNew(n);
	}

	public boolean isCachedModel() {
		return _danger_list_status_lkp.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_danger_list_status_lkp.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _danger_list_status_lkp.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _danger_list_status_lkp.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_danger_list_status_lkp.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _danger_list_status_lkp.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_danger_list_status_lkp.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new danger_list_status_lkpWrapper((danger_list_status_lkp)_danger_list_status_lkp.clone());
	}

	public int compareTo(
		com.iucn.whp.dbservice.model.danger_list_status_lkp danger_list_status_lkp) {
		return _danger_list_status_lkp.compareTo(danger_list_status_lkp);
	}

	@Override
	public int hashCode() {
		return _danger_list_status_lkp.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.iucn.whp.dbservice.model.danger_list_status_lkp> toCacheModel() {
		return _danger_list_status_lkp.toCacheModel();
	}

	public com.iucn.whp.dbservice.model.danger_list_status_lkp toEscapedModel() {
		return new danger_list_status_lkpWrapper(_danger_list_status_lkp.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _danger_list_status_lkp.toString();
	}

	public java.lang.String toXmlString() {
		return _danger_list_status_lkp.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_danger_list_status_lkp.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public danger_list_status_lkp getWrappeddanger_list_status_lkp() {
		return _danger_list_status_lkp;
	}

	public danger_list_status_lkp getWrappedModel() {
		return _danger_list_status_lkp;
	}

	public void resetOriginalValues() {
		_danger_list_status_lkp.resetOriginalValues();
	}

	private danger_list_status_lkp _danger_list_status_lkp;
}