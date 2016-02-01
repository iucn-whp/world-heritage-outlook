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
 * This class is a wrapper for {@link benefits}.
 * </p>
 *
 * @author    alok.sen
 * @see       benefits
 * @generated
 */
public class benefitsWrapper implements benefits, ModelWrapper<benefits> {
	public benefitsWrapper(benefits benefits) {
		_benefits = benefits;
	}

	public Class<?> getModelClass() {
		return benefits.class;
	}

	public String getModelClassName() {
		return benefits.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("benefits_id", getBenefits_id());
		attributes.put("assessment_version_id", getAssessment_version_id());
		attributes.put("selected_benefit", getSelected_benefit());
		attributes.put("summary", getSummary());
		attributes.put("data_deficient", getData_deficient());
		attributes.put("community_within_site", getCommunity_within_site());
		attributes.put("community_outside_site", getCommunity_outside_site());
		attributes.put("wider_community", getWider_community());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long benefits_id = (Long)attributes.get("benefits_id");

		if (benefits_id != null) {
			setBenefits_id(benefits_id);
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

		Boolean data_deficient = (Boolean)attributes.get("data_deficient");

		if (data_deficient != null) {
			setData_deficient(data_deficient);
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
	* Returns the primary key of this benefits.
	*
	* @return the primary key of this benefits
	*/
	public long getPrimaryKey() {
		return _benefits.getPrimaryKey();
	}

	/**
	* Sets the primary key of this benefits.
	*
	* @param primaryKey the primary key of this benefits
	*/
	public void setPrimaryKey(long primaryKey) {
		_benefits.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the benefits_id of this benefits.
	*
	* @return the benefits_id of this benefits
	*/
	public long getBenefits_id() {
		return _benefits.getBenefits_id();
	}

	/**
	* Sets the benefits_id of this benefits.
	*
	* @param benefits_id the benefits_id of this benefits
	*/
	public void setBenefits_id(long benefits_id) {
		_benefits.setBenefits_id(benefits_id);
	}

	/**
	* Returns the assessment_version_id of this benefits.
	*
	* @return the assessment_version_id of this benefits
	*/
	public long getAssessment_version_id() {
		return _benefits.getAssessment_version_id();
	}

	/**
	* Sets the assessment_version_id of this benefits.
	*
	* @param assessment_version_id the assessment_version_id of this benefits
	*/
	public void setAssessment_version_id(long assessment_version_id) {
		_benefits.setAssessment_version_id(assessment_version_id);
	}

	/**
	* Returns the selected_benefit of this benefits.
	*
	* @return the selected_benefit of this benefits
	*/
	public long getSelected_benefit() {
		return _benefits.getSelected_benefit();
	}

	/**
	* Sets the selected_benefit of this benefits.
	*
	* @param selected_benefit the selected_benefit of this benefits
	*/
	public void setSelected_benefit(long selected_benefit) {
		_benefits.setSelected_benefit(selected_benefit);
	}

	/**
	* Returns the summary of this benefits.
	*
	* @return the summary of this benefits
	*/
	public java.lang.String getSummary() {
		return _benefits.getSummary();
	}

	/**
	* Sets the summary of this benefits.
	*
	* @param summary the summary of this benefits
	*/
	public void setSummary(java.lang.String summary) {
		_benefits.setSummary(summary);
	}

	/**
	* Returns the data_deficient of this benefits.
	*
	* @return the data_deficient of this benefits
	*/
	public boolean getData_deficient() {
		return _benefits.getData_deficient();
	}

	/**
	* Returns <code>true</code> if this benefits is data_deficient.
	*
	* @return <code>true</code> if this benefits is data_deficient; <code>false</code> otherwise
	*/
	public boolean isData_deficient() {
		return _benefits.isData_deficient();
	}

	/**
	* Sets whether this benefits is data_deficient.
	*
	* @param data_deficient the data_deficient of this benefits
	*/
	public void setData_deficient(boolean data_deficient) {
		_benefits.setData_deficient(data_deficient);
	}

	/**
	* Returns the community_within_site of this benefits.
	*
	* @return the community_within_site of this benefits
	*/
	public long getCommunity_within_site() {
		return _benefits.getCommunity_within_site();
	}

	/**
	* Sets the community_within_site of this benefits.
	*
	* @param community_within_site the community_within_site of this benefits
	*/
	public void setCommunity_within_site(long community_within_site) {
		_benefits.setCommunity_within_site(community_within_site);
	}

	/**
	* Returns the community_outside_site of this benefits.
	*
	* @return the community_outside_site of this benefits
	*/
	public long getCommunity_outside_site() {
		return _benefits.getCommunity_outside_site();
	}

	/**
	* Sets the community_outside_site of this benefits.
	*
	* @param community_outside_site the community_outside_site of this benefits
	*/
	public void setCommunity_outside_site(long community_outside_site) {
		_benefits.setCommunity_outside_site(community_outside_site);
	}

	/**
	* Returns the wider_community of this benefits.
	*
	* @return the wider_community of this benefits
	*/
	public long getWider_community() {
		return _benefits.getWider_community();
	}

	/**
	* Sets the wider_community of this benefits.
	*
	* @param wider_community the wider_community of this benefits
	*/
	public void setWider_community(long wider_community) {
		_benefits.setWider_community(wider_community);
	}

	public boolean isNew() {
		return _benefits.isNew();
	}

	public void setNew(boolean n) {
		_benefits.setNew(n);
	}

	public boolean isCachedModel() {
		return _benefits.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_benefits.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _benefits.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _benefits.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_benefits.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _benefits.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_benefits.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new benefitsWrapper((benefits)_benefits.clone());
	}

	public int compareTo(com.iucn.whp.dbservice.model.benefits benefits) {
		return _benefits.compareTo(benefits);
	}

	@Override
	public int hashCode() {
		return _benefits.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.iucn.whp.dbservice.model.benefits> toCacheModel() {
		return _benefits.toCacheModel();
	}

	public com.iucn.whp.dbservice.model.benefits toEscapedModel() {
		return new benefitsWrapper(_benefits.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _benefits.toString();
	}

	public java.lang.String toXmlString() {
		return _benefits.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_benefits.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public benefits getWrappedbenefits() {
		return _benefits;
	}

	public benefits getWrappedModel() {
		return _benefits;
	}

	public void resetOriginalValues() {
		_benefits.resetOriginalValues();
	}

	private benefits _benefits;
}