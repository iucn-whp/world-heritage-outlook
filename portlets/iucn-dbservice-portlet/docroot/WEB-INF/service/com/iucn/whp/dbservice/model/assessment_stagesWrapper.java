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
 * This class is a wrapper for {@link assessment_stages}.
 * </p>
 *
 * @author    alok.sen
 * @see       assessment_stages
 * @generated
 */
public class assessment_stagesWrapper implements assessment_stages,
	ModelWrapper<assessment_stages> {
	public assessment_stagesWrapper(assessment_stages assessment_stages) {
		_assessment_stages = assessment_stages;
	}

	public Class<?> getModelClass() {
		return assessment_stages.class;
	}

	public String getModelClassName() {
		return assessment_stages.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("stageid", getStageid());
		attributes.put("stage", getStage());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long stageid = (Long)attributes.get("stageid");

		if (stageid != null) {
			setStageid(stageid);
		}

		String stage = (String)attributes.get("stage");

		if (stage != null) {
			setStage(stage);
		}
	}

	/**
	* Returns the primary key of this assessment_stages.
	*
	* @return the primary key of this assessment_stages
	*/
	public long getPrimaryKey() {
		return _assessment_stages.getPrimaryKey();
	}

	/**
	* Sets the primary key of this assessment_stages.
	*
	* @param primaryKey the primary key of this assessment_stages
	*/
	public void setPrimaryKey(long primaryKey) {
		_assessment_stages.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the stageid of this assessment_stages.
	*
	* @return the stageid of this assessment_stages
	*/
	public long getStageid() {
		return _assessment_stages.getStageid();
	}

	/**
	* Sets the stageid of this assessment_stages.
	*
	* @param stageid the stageid of this assessment_stages
	*/
	public void setStageid(long stageid) {
		_assessment_stages.setStageid(stageid);
	}

	/**
	* Returns the stage of this assessment_stages.
	*
	* @return the stage of this assessment_stages
	*/
	public java.lang.String getStage() {
		return _assessment_stages.getStage();
	}

	/**
	* Sets the stage of this assessment_stages.
	*
	* @param stage the stage of this assessment_stages
	*/
	public void setStage(java.lang.String stage) {
		_assessment_stages.setStage(stage);
	}

	public boolean isNew() {
		return _assessment_stages.isNew();
	}

	public void setNew(boolean n) {
		_assessment_stages.setNew(n);
	}

	public boolean isCachedModel() {
		return _assessment_stages.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_assessment_stages.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _assessment_stages.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _assessment_stages.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_assessment_stages.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _assessment_stages.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_assessment_stages.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new assessment_stagesWrapper((assessment_stages)_assessment_stages.clone());
	}

	public int compareTo(
		com.iucn.whp.dbservice.model.assessment_stages assessment_stages) {
		return _assessment_stages.compareTo(assessment_stages);
	}

	@Override
	public int hashCode() {
		return _assessment_stages.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.iucn.whp.dbservice.model.assessment_stages> toCacheModel() {
		return _assessment_stages.toCacheModel();
	}

	public com.iucn.whp.dbservice.model.assessment_stages toEscapedModel() {
		return new assessment_stagesWrapper(_assessment_stages.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _assessment_stages.toString();
	}

	public java.lang.String toXmlString() {
		return _assessment_stages.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_assessment_stages.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public assessment_stages getWrappedassessment_stages() {
		return _assessment_stages;
	}

	public assessment_stages getWrappedModel() {
		return _assessment_stages;
	}

	public void resetOriginalValues() {
		_assessment_stages.resetOriginalValues();
	}

	private assessment_stages _assessment_stages;
}