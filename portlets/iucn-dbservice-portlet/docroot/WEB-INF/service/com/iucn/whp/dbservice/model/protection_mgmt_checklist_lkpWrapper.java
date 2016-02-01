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
 * This class is a wrapper for {@link protection_mgmt_checklist_lkp}.
 * </p>
 *
 * @author    alok.sen
 * @see       protection_mgmt_checklist_lkp
 * @generated
 */
public class protection_mgmt_checklist_lkpWrapper
	implements protection_mgmt_checklist_lkp,
		ModelWrapper<protection_mgmt_checklist_lkp> {
	public protection_mgmt_checklist_lkpWrapper(
		protection_mgmt_checklist_lkp protection_mgmt_checklist_lkp) {
		_protection_mgmt_checklist_lkp = protection_mgmt_checklist_lkp;
	}

	public Class<?> getModelClass() {
		return protection_mgmt_checklist_lkp.class;
	}

	public String getModelClassName() {
		return protection_mgmt_checklist_lkp.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("topic_id", getTopic_id());
		attributes.put("topic", getTopic());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long topic_id = (Long)attributes.get("topic_id");

		if (topic_id != null) {
			setTopic_id(topic_id);
		}

		String topic = (String)attributes.get("topic");

		if (topic != null) {
			setTopic(topic);
		}
	}

	/**
	* Returns the primary key of this protection_mgmt_checklist_lkp.
	*
	* @return the primary key of this protection_mgmt_checklist_lkp
	*/
	public long getPrimaryKey() {
		return _protection_mgmt_checklist_lkp.getPrimaryKey();
	}

	/**
	* Sets the primary key of this protection_mgmt_checklist_lkp.
	*
	* @param primaryKey the primary key of this protection_mgmt_checklist_lkp
	*/
	public void setPrimaryKey(long primaryKey) {
		_protection_mgmt_checklist_lkp.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the topic_id of this protection_mgmt_checklist_lkp.
	*
	* @return the topic_id of this protection_mgmt_checklist_lkp
	*/
	public long getTopic_id() {
		return _protection_mgmt_checklist_lkp.getTopic_id();
	}

	/**
	* Sets the topic_id of this protection_mgmt_checklist_lkp.
	*
	* @param topic_id the topic_id of this protection_mgmt_checklist_lkp
	*/
	public void setTopic_id(long topic_id) {
		_protection_mgmt_checklist_lkp.setTopic_id(topic_id);
	}

	/**
	* Returns the topic of this protection_mgmt_checklist_lkp.
	*
	* @return the topic of this protection_mgmt_checklist_lkp
	*/
	public java.lang.String getTopic() {
		return _protection_mgmt_checklist_lkp.getTopic();
	}

	/**
	* Sets the topic of this protection_mgmt_checklist_lkp.
	*
	* @param topic the topic of this protection_mgmt_checklist_lkp
	*/
	public void setTopic(java.lang.String topic) {
		_protection_mgmt_checklist_lkp.setTopic(topic);
	}

	public boolean isNew() {
		return _protection_mgmt_checklist_lkp.isNew();
	}

	public void setNew(boolean n) {
		_protection_mgmt_checklist_lkp.setNew(n);
	}

	public boolean isCachedModel() {
		return _protection_mgmt_checklist_lkp.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_protection_mgmt_checklist_lkp.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _protection_mgmt_checklist_lkp.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _protection_mgmt_checklist_lkp.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_protection_mgmt_checklist_lkp.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _protection_mgmt_checklist_lkp.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_protection_mgmt_checklist_lkp.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new protection_mgmt_checklist_lkpWrapper((protection_mgmt_checklist_lkp)_protection_mgmt_checklist_lkp.clone());
	}

	public int compareTo(
		com.iucn.whp.dbservice.model.protection_mgmt_checklist_lkp protection_mgmt_checklist_lkp) {
		return _protection_mgmt_checklist_lkp.compareTo(protection_mgmt_checklist_lkp);
	}

	@Override
	public int hashCode() {
		return _protection_mgmt_checklist_lkp.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.iucn.whp.dbservice.model.protection_mgmt_checklist_lkp> toCacheModel() {
		return _protection_mgmt_checklist_lkp.toCacheModel();
	}

	public com.iucn.whp.dbservice.model.protection_mgmt_checklist_lkp toEscapedModel() {
		return new protection_mgmt_checklist_lkpWrapper(_protection_mgmt_checklist_lkp.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _protection_mgmt_checklist_lkp.toString();
	}

	public java.lang.String toXmlString() {
		return _protection_mgmt_checklist_lkp.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_protection_mgmt_checklist_lkp.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public protection_mgmt_checklist_lkp getWrappedprotection_mgmt_checklist_lkp() {
		return _protection_mgmt_checklist_lkp;
	}

	public protection_mgmt_checklist_lkp getWrappedModel() {
		return _protection_mgmt_checklist_lkp;
	}

	public void resetOriginalValues() {
		_protection_mgmt_checklist_lkp.resetOriginalValues();
	}

	private protection_mgmt_checklist_lkp _protection_mgmt_checklist_lkp;
}