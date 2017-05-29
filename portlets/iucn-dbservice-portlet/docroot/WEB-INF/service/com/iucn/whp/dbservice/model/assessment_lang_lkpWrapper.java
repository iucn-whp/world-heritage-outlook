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
 * This class is a wrapper for {@link assessment_lang_lkp}.
 * </p>
 *
 * @author    alok.sen
 * @see       assessment_lang_lkp
 * @generated
 */
public class assessment_lang_lkpWrapper implements assessment_lang_lkp,
	ModelWrapper<assessment_lang_lkp> {
	public assessment_lang_lkpWrapper(assessment_lang_lkp assessment_lang_lkp) {
		_assessment_lang_lkp = assessment_lang_lkp;
	}

	public Class<?> getModelClass() {
		return assessment_lang_lkp.class;
	}

	public String getModelClassName() {
		return assessment_lang_lkp.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("languageid", getLanguageid());
		attributes.put("languagecode", getLanguagecode());
		attributes.put("languagename", getLanguagename());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long languageid = (Long)attributes.get("languageid");

		if (languageid != null) {
			setLanguageid(languageid);
		}

		String languagecode = (String)attributes.get("languagecode");

		if (languagecode != null) {
			setLanguagecode(languagecode);
		}

		String languagename = (String)attributes.get("languagename");

		if (languagename != null) {
			setLanguagename(languagename);
		}
	}

	/**
	* Returns the primary key of this assessment_lang_lkp.
	*
	* @return the primary key of this assessment_lang_lkp
	*/
	public long getPrimaryKey() {
		return _assessment_lang_lkp.getPrimaryKey();
	}

	/**
	* Sets the primary key of this assessment_lang_lkp.
	*
	* @param primaryKey the primary key of this assessment_lang_lkp
	*/
	public void setPrimaryKey(long primaryKey) {
		_assessment_lang_lkp.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the languageid of this assessment_lang_lkp.
	*
	* @return the languageid of this assessment_lang_lkp
	*/
	public long getLanguageid() {
		return _assessment_lang_lkp.getLanguageid();
	}

	/**
	* Sets the languageid of this assessment_lang_lkp.
	*
	* @param languageid the languageid of this assessment_lang_lkp
	*/
	public void setLanguageid(long languageid) {
		_assessment_lang_lkp.setLanguageid(languageid);
	}

	/**
	* Returns the languagecode of this assessment_lang_lkp.
	*
	* @return the languagecode of this assessment_lang_lkp
	*/
	public java.lang.String getLanguagecode() {
		return _assessment_lang_lkp.getLanguagecode();
	}

	/**
	* Sets the languagecode of this assessment_lang_lkp.
	*
	* @param languagecode the languagecode of this assessment_lang_lkp
	*/
	public void setLanguagecode(java.lang.String languagecode) {
		_assessment_lang_lkp.setLanguagecode(languagecode);
	}

	/**
	* Returns the languagename of this assessment_lang_lkp.
	*
	* @return the languagename of this assessment_lang_lkp
	*/
	public java.lang.String getLanguagename() {
		return _assessment_lang_lkp.getLanguagename();
	}

	/**
	* Sets the languagename of this assessment_lang_lkp.
	*
	* @param languagename the languagename of this assessment_lang_lkp
	*/
	public void setLanguagename(java.lang.String languagename) {
		_assessment_lang_lkp.setLanguagename(languagename);
	}

	public boolean isNew() {
		return _assessment_lang_lkp.isNew();
	}

	public void setNew(boolean n) {
		_assessment_lang_lkp.setNew(n);
	}

	public boolean isCachedModel() {
		return _assessment_lang_lkp.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_assessment_lang_lkp.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _assessment_lang_lkp.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _assessment_lang_lkp.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_assessment_lang_lkp.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _assessment_lang_lkp.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_assessment_lang_lkp.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new assessment_lang_lkpWrapper((assessment_lang_lkp)_assessment_lang_lkp.clone());
	}

	public int compareTo(
		com.iucn.whp.dbservice.model.assessment_lang_lkp assessment_lang_lkp) {
		return _assessment_lang_lkp.compareTo(assessment_lang_lkp);
	}

	@Override
	public int hashCode() {
		return _assessment_lang_lkp.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.iucn.whp.dbservice.model.assessment_lang_lkp> toCacheModel() {
		return _assessment_lang_lkp.toCacheModel();
	}

	public com.iucn.whp.dbservice.model.assessment_lang_lkp toEscapedModel() {
		return new assessment_lang_lkpWrapper(_assessment_lang_lkp.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _assessment_lang_lkp.toString();
	}

	public java.lang.String toXmlString() {
		return _assessment_lang_lkp.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_assessment_lang_lkp.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public assessment_lang_lkp getWrappedassessment_lang_lkp() {
		return _assessment_lang_lkp;
	}

	public assessment_lang_lkp getWrappedModel() {
		return _assessment_lang_lkp;
	}

	public void resetOriginalValues() {
		_assessment_lang_lkp.resetOriginalValues();
	}

	private assessment_lang_lkp _assessment_lang_lkp;
}