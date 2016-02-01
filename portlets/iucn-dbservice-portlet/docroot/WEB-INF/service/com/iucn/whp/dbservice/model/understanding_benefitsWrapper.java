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
 * This class is a wrapper for {@link understanding_benefits}.
 * </p>
 *
 * @author    alok.sen
 * @see       understanding_benefits
 * @generated
 */
public class understanding_benefitsWrapper implements understanding_benefits,
	ModelWrapper<understanding_benefits> {
	public understanding_benefitsWrapper(
		understanding_benefits understanding_benefits) {
		_understanding_benefits = understanding_benefits;
	}

	public Class<?> getModelClass() {
		return understanding_benefits.class;
	}

	public String getModelClassName() {
		return understanding_benefits.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("understanding_benefits_id",
			getUnderstanding_benefits_id());
		attributes.put("assessment_version_id", getAssessment_version_id());
		attributes.put("selected_benefit", getSelected_benefit());
		attributes.put("summary", getSummary());
		attributes.put("community_within_site", getCommunity_within_site());
		attributes.put("community_outside_site", getCommunity_outside_site());
		attributes.put("wider_community", getWider_community());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long understanding_benefits_id = (Long)attributes.get(
				"understanding_benefits_id");

		if (understanding_benefits_id != null) {
			setUnderstanding_benefits_id(understanding_benefits_id);
		}

		Long assessment_version_id = (Long)attributes.get(
				"assessment_version_id");

		if (assessment_version_id != null) {
			setAssessment_version_id(assessment_version_id);
		}

		Long selected_benefit = (Long)attributes.get("selected_benefit");

		if (selected_benefit != null) {
			setSelected_benefit(selected_benefit);
		}

		String summary = (String)attributes.get("summary");

		if (summary != null) {
			setSummary(summary);
		}

		Long community_within_site = (Long)attributes.get(
				"community_within_site");

		if (community_within_site != null) {
			setCommunity_within_site(community_within_site);
		}

		Long community_outside_site = (Long)attributes.get(
				"community_outside_site");

		if (community_outside_site != null) {
			setCommunity_outside_site(community_outside_site);
		}

		Long wider_community = (Long)attributes.get("wider_community");

		if (wider_community != null) {
			setWider_community(wider_community);
		}
	}

	/**
	* Returns the primary key of this understanding_benefits.
	*
	* @return the primary key of this understanding_benefits
	*/
	public long getPrimaryKey() {
		return _understanding_benefits.getPrimaryKey();
	}

	/**
	* Sets the primary key of this understanding_benefits.
	*
	* @param primaryKey the primary key of this understanding_benefits
	*/
	public void setPrimaryKey(long primaryKey) {
		_understanding_benefits.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the understanding_benefits_id of this understanding_benefits.
	*
	* @return the understanding_benefits_id of this understanding_benefits
	*/
	public long getUnderstanding_benefits_id() {
		return _understanding_benefits.getUnderstanding_benefits_id();
	}

	/**
	* Sets the understanding_benefits_id of this understanding_benefits.
	*
	* @param understanding_benefits_id the understanding_benefits_id of this understanding_benefits
	*/
	public void setUnderstanding_benefits_id(long understanding_benefits_id) {
		_understanding_benefits.setUnderstanding_benefits_id(understanding_benefits_id);
	}

	/**
	* Returns the assessment_version_id of this understanding_benefits.
	*
	* @return the assessment_version_id of this understanding_benefits
	*/
	public long getAssessment_version_id() {
		return _understanding_benefits.getAssessment_version_id();
	}

	/**
	* Sets the assessment_version_id of this understanding_benefits.
	*
	* @param assessment_version_id the assessment_version_id of this understanding_benefits
	*/
	public void setAssessment_version_id(long assessment_version_id) {
		_understanding_benefits.setAssessment_version_id(assessment_version_id);
	}

	/**
	* Returns the selected_benefit of this understanding_benefits.
	*
	* @return the selected_benefit of this understanding_benefits
	*/
	public long getSelected_benefit() {
		return _understanding_benefits.getSelected_benefit();
	}

	/**
	* Sets the selected_benefit of this understanding_benefits.
	*
	* @param selected_benefit the selected_benefit of this understanding_benefits
	*/
	public void setSelected_benefit(long selected_benefit) {
		_understanding_benefits.setSelected_benefit(selected_benefit);
	}

	/**
	* Returns the summary of this understanding_benefits.
	*
	* @return the summary of this understanding_benefits
	*/
	public java.lang.String getSummary() {
		return _understanding_benefits.getSummary();
	}

	/**
	* Sets the summary of this understanding_benefits.
	*
	* @param summary the summary of this understanding_benefits
	*/
	public void setSummary(java.lang.String summary) {
		_understanding_benefits.setSummary(summary);
	}

	/**
	* Returns the community_within_site of this understanding_benefits.
	*
	* @return the community_within_site of this understanding_benefits
	*/
	public long getCommunity_within_site() {
		return _understanding_benefits.getCommunity_within_site();
	}

	/**
	* Sets the community_within_site of this understanding_benefits.
	*
	* @param community_within_site the community_within_site of this understanding_benefits
	*/
	public void setCommunity_within_site(long community_within_site) {
		_understanding_benefits.setCommunity_within_site(community_within_site);
	}

	/**
	* Returns the community_outside_site of this understanding_benefits.
	*
	* @return the community_outside_site of this understanding_benefits
	*/
	public long getCommunity_outside_site() {
		return _understanding_benefits.getCommunity_outside_site();
	}

	/**
	* Sets the community_outside_site of this understanding_benefits.
	*
	* @param community_outside_site the community_outside_site of this understanding_benefits
	*/
	public void setCommunity_outside_site(long community_outside_site) {
		_understanding_benefits.setCommunity_outside_site(community_outside_site);
	}

	/**
	* Returns the wider_community of this understanding_benefits.
	*
	* @return the wider_community of this understanding_benefits
	*/
	public long getWider_community() {
		return _understanding_benefits.getWider_community();
	}

	/**
	* Sets the wider_community of this understanding_benefits.
	*
	* @param wider_community the wider_community of this understanding_benefits
	*/
	public void setWider_community(long wider_community) {
		_understanding_benefits.setWider_community(wider_community);
	}

	public boolean isNew() {
		return _understanding_benefits.isNew();
	}

	public void setNew(boolean n) {
		_understanding_benefits.setNew(n);
	}

	public boolean isCachedModel() {
		return _understanding_benefits.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_understanding_benefits.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _understanding_benefits.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _understanding_benefits.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_understanding_benefits.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _understanding_benefits.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_understanding_benefits.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new understanding_benefitsWrapper((understanding_benefits)_understanding_benefits.clone());
	}

	public int compareTo(
		com.iucn.whp.dbservice.model.understanding_benefits understanding_benefits) {
		return _understanding_benefits.compareTo(understanding_benefits);
	}

	@Override
	public int hashCode() {
		return _understanding_benefits.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.iucn.whp.dbservice.model.understanding_benefits> toCacheModel() {
		return _understanding_benefits.toCacheModel();
	}

	public com.iucn.whp.dbservice.model.understanding_benefits toEscapedModel() {
		return new understanding_benefitsWrapper(_understanding_benefits.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _understanding_benefits.toString();
	}

	public java.lang.String toXmlString() {
		return _understanding_benefits.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_understanding_benefits.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public understanding_benefits getWrappedunderstanding_benefits() {
		return _understanding_benefits;
	}

	public understanding_benefits getWrappedModel() {
		return _understanding_benefits;
	}

	public void resetOriginalValues() {
		_understanding_benefits.resetOriginalValues();
	}

	private understanding_benefits _understanding_benefits;
}