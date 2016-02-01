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
 * This class is a wrapper for {@link thematic_lkp}.
 * </p>
 *
 * @author    alok.sen
 * @see       thematic_lkp
 * @generated
 */
public class thematic_lkpWrapper implements thematic_lkp,
	ModelWrapper<thematic_lkp> {
	public thematic_lkpWrapper(thematic_lkp thematic_lkp) {
		_thematic_lkp = thematic_lkp;
	}

	public Class<?> getModelClass() {
		return thematic_lkp.class;
	}

	public String getModelClassName() {
		return thematic_lkp.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("thematicid", getThematicid());
		attributes.put("thematic", getThematic());
		attributes.put("description", getDescription());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long thematicid = (Long)attributes.get("thematicid");

		if (thematicid != null) {
			setThematicid(thematicid);
		}

		String thematic = (String)attributes.get("thematic");

		if (thematic != null) {
			setThematic(thematic);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}
	}

	/**
	* Returns the primary key of this thematic_lkp.
	*
	* @return the primary key of this thematic_lkp
	*/
	public long getPrimaryKey() {
		return _thematic_lkp.getPrimaryKey();
	}

	/**
	* Sets the primary key of this thematic_lkp.
	*
	* @param primaryKey the primary key of this thematic_lkp
	*/
	public void setPrimaryKey(long primaryKey) {
		_thematic_lkp.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the thematicid of this thematic_lkp.
	*
	* @return the thematicid of this thematic_lkp
	*/
	public long getThematicid() {
		return _thematic_lkp.getThematicid();
	}

	/**
	* Sets the thematicid of this thematic_lkp.
	*
	* @param thematicid the thematicid of this thematic_lkp
	*/
	public void setThematicid(long thematicid) {
		_thematic_lkp.setThematicid(thematicid);
	}

	/**
	* Returns the thematic of this thematic_lkp.
	*
	* @return the thematic of this thematic_lkp
	*/
	public java.lang.String getThematic() {
		return _thematic_lkp.getThematic();
	}

	/**
	* Sets the thematic of this thematic_lkp.
	*
	* @param thematic the thematic of this thematic_lkp
	*/
	public void setThematic(java.lang.String thematic) {
		_thematic_lkp.setThematic(thematic);
	}

	/**
	* Returns the description of this thematic_lkp.
	*
	* @return the description of this thematic_lkp
	*/
	public java.lang.String getDescription() {
		return _thematic_lkp.getDescription();
	}

	/**
	* Sets the description of this thematic_lkp.
	*
	* @param description the description of this thematic_lkp
	*/
	public void setDescription(java.lang.String description) {
		_thematic_lkp.setDescription(description);
	}

	public boolean isNew() {
		return _thematic_lkp.isNew();
	}

	public void setNew(boolean n) {
		_thematic_lkp.setNew(n);
	}

	public boolean isCachedModel() {
		return _thematic_lkp.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_thematic_lkp.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _thematic_lkp.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _thematic_lkp.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_thematic_lkp.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _thematic_lkp.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_thematic_lkp.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new thematic_lkpWrapper((thematic_lkp)_thematic_lkp.clone());
	}

	public int compareTo(thematic_lkp thematic_lkp) {
		return _thematic_lkp.compareTo(thematic_lkp);
	}

	@Override
	public int hashCode() {
		return _thematic_lkp.hashCode();
	}

	public com.liferay.portal.model.CacheModel<thematic_lkp> toCacheModel() {
		return _thematic_lkp.toCacheModel();
	}

	public thematic_lkp toEscapedModel() {
		return new thematic_lkpWrapper(_thematic_lkp.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _thematic_lkp.toString();
	}

	public java.lang.String toXmlString() {
		return _thematic_lkp.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_thematic_lkp.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public thematic_lkp getWrappedthematic_lkp() {
		return _thematic_lkp;
	}

	public thematic_lkp getWrappedModel() {
		return _thematic_lkp;
	}

	public void resetOriginalValues() {
		_thematic_lkp.resetOriginalValues();
	}

	private thematic_lkp _thematic_lkp;
}