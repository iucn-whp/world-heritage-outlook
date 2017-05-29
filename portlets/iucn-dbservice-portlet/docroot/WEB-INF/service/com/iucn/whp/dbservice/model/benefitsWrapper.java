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
		attributes.put("habitatChangeLevel", getHabitatChangeLevel());
		attributes.put("habitatChangeTrend", getHabitatChangeTrend());
		attributes.put("pollutionLevel", getPollutionLevel());
		attributes.put("pollutionTrend", getPollutionTrend());
		attributes.put("overExploitationLevel", getOverExploitationLevel());
		attributes.put("overExploitationTrend", getOverExploitationTrend());
		attributes.put("climateChangeLevel", getClimateChangeLevel());
		attributes.put("climateChangeTrend", getClimateChangeTrend());
		attributes.put("invasiveSpeciesLevel", getInvasiveSpeciesLevel());
		attributes.put("invasiveSpeciesTrend", getInvasiveSpeciesTrend());
		attributes.put("comment", getComment());
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

		Long habitatChangeLevel = (Long)attributes.get("habitatChangeLevel");

		if (habitatChangeLevel != null) {
			setHabitatChangeLevel(habitatChangeLevel);
		}

		Long habitatChangeTrend = (Long)attributes.get("habitatChangeTrend");

		if (habitatChangeTrend != null) {
			setHabitatChangeTrend(habitatChangeTrend);
		}

		Long pollutionLevel = (Long)attributes.get("pollutionLevel");

		if (pollutionLevel != null) {
			setPollutionLevel(pollutionLevel);
		}

		Long pollutionTrend = (Long)attributes.get("pollutionTrend");

		if (pollutionTrend != null) {
			setPollutionTrend(pollutionTrend);
		}

		Long overExploitationLevel = (Long)attributes.get(
				"overExploitationLevel");

		if (overExploitationLevel != null) {
			setOverExploitationLevel(overExploitationLevel);
		}

		Long overExploitationTrend = (Long)attributes.get(
				"overExploitationTrend");

		if (overExploitationTrend != null) {
			setOverExploitationTrend(overExploitationTrend);
		}

		Long climateChangeLevel = (Long)attributes.get("climateChangeLevel");

		if (climateChangeLevel != null) {
			setClimateChangeLevel(climateChangeLevel);
		}

		Long climateChangeTrend = (Long)attributes.get("climateChangeTrend");

		if (climateChangeTrend != null) {
			setClimateChangeTrend(climateChangeTrend);
		}

		Long invasiveSpeciesLevel = (Long)attributes.get("invasiveSpeciesLevel");

		if (invasiveSpeciesLevel != null) {
			setInvasiveSpeciesLevel(invasiveSpeciesLevel);
		}

		Long invasiveSpeciesTrend = (Long)attributes.get("invasiveSpeciesTrend");

		if (invasiveSpeciesTrend != null) {
			setInvasiveSpeciesTrend(invasiveSpeciesTrend);
		}

		String comment = (String)attributes.get("comment");

		if (comment != null) {
			setComment(comment);
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
	* Returns the habitat change level of this benefits.
	*
	* @return the habitat change level of this benefits
	*/
	public long getHabitatChangeLevel() {
		return _benefits.getHabitatChangeLevel();
	}

	/**
	* Sets the habitat change level of this benefits.
	*
	* @param habitatChangeLevel the habitat change level of this benefits
	*/
	public void setHabitatChangeLevel(long habitatChangeLevel) {
		_benefits.setHabitatChangeLevel(habitatChangeLevel);
	}

	/**
	* Returns the habitat change trend of this benefits.
	*
	* @return the habitat change trend of this benefits
	*/
	public long getHabitatChangeTrend() {
		return _benefits.getHabitatChangeTrend();
	}

	/**
	* Sets the habitat change trend of this benefits.
	*
	* @param habitatChangeTrend the habitat change trend of this benefits
	*/
	public void setHabitatChangeTrend(long habitatChangeTrend) {
		_benefits.setHabitatChangeTrend(habitatChangeTrend);
	}

	/**
	* Returns the pollution level of this benefits.
	*
	* @return the pollution level of this benefits
	*/
	public long getPollutionLevel() {
		return _benefits.getPollutionLevel();
	}

	/**
	* Sets the pollution level of this benefits.
	*
	* @param pollutionLevel the pollution level of this benefits
	*/
	public void setPollutionLevel(long pollutionLevel) {
		_benefits.setPollutionLevel(pollutionLevel);
	}

	/**
	* Returns the pollution trend of this benefits.
	*
	* @return the pollution trend of this benefits
	*/
	public long getPollutionTrend() {
		return _benefits.getPollutionTrend();
	}

	/**
	* Sets the pollution trend of this benefits.
	*
	* @param pollutionTrend the pollution trend of this benefits
	*/
	public void setPollutionTrend(long pollutionTrend) {
		_benefits.setPollutionTrend(pollutionTrend);
	}

	/**
	* Returns the over exploitation level of this benefits.
	*
	* @return the over exploitation level of this benefits
	*/
	public long getOverExploitationLevel() {
		return _benefits.getOverExploitationLevel();
	}

	/**
	* Sets the over exploitation level of this benefits.
	*
	* @param overExploitationLevel the over exploitation level of this benefits
	*/
	public void setOverExploitationLevel(long overExploitationLevel) {
		_benefits.setOverExploitationLevel(overExploitationLevel);
	}

	/**
	* Returns the over exploitation trend of this benefits.
	*
	* @return the over exploitation trend of this benefits
	*/
	public long getOverExploitationTrend() {
		return _benefits.getOverExploitationTrend();
	}

	/**
	* Sets the over exploitation trend of this benefits.
	*
	* @param overExploitationTrend the over exploitation trend of this benefits
	*/
	public void setOverExploitationTrend(long overExploitationTrend) {
		_benefits.setOverExploitationTrend(overExploitationTrend);
	}

	/**
	* Returns the climate change level of this benefits.
	*
	* @return the climate change level of this benefits
	*/
	public long getClimateChangeLevel() {
		return _benefits.getClimateChangeLevel();
	}

	/**
	* Sets the climate change level of this benefits.
	*
	* @param climateChangeLevel the climate change level of this benefits
	*/
	public void setClimateChangeLevel(long climateChangeLevel) {
		_benefits.setClimateChangeLevel(climateChangeLevel);
	}

	/**
	* Returns the climate change trend of this benefits.
	*
	* @return the climate change trend of this benefits
	*/
	public long getClimateChangeTrend() {
		return _benefits.getClimateChangeTrend();
	}

	/**
	* Sets the climate change trend of this benefits.
	*
	* @param climateChangeTrend the climate change trend of this benefits
	*/
	public void setClimateChangeTrend(long climateChangeTrend) {
		_benefits.setClimateChangeTrend(climateChangeTrend);
	}

	/**
	* Returns the invasive species level of this benefits.
	*
	* @return the invasive species level of this benefits
	*/
	public long getInvasiveSpeciesLevel() {
		return _benefits.getInvasiveSpeciesLevel();
	}

	/**
	* Sets the invasive species level of this benefits.
	*
	* @param invasiveSpeciesLevel the invasive species level of this benefits
	*/
	public void setInvasiveSpeciesLevel(long invasiveSpeciesLevel) {
		_benefits.setInvasiveSpeciesLevel(invasiveSpeciesLevel);
	}

	/**
	* Returns the invasive species trend of this benefits.
	*
	* @return the invasive species trend of this benefits
	*/
	public long getInvasiveSpeciesTrend() {
		return _benefits.getInvasiveSpeciesTrend();
	}

	/**
	* Sets the invasive species trend of this benefits.
	*
	* @param invasiveSpeciesTrend the invasive species trend of this benefits
	*/
	public void setInvasiveSpeciesTrend(long invasiveSpeciesTrend) {
		_benefits.setInvasiveSpeciesTrend(invasiveSpeciesTrend);
	}

	/**
	* Returns the comment of this benefits.
	*
	* @return the comment of this benefits
	*/
	public java.lang.String getComment() {
		return _benefits.getComment();
	}

	/**
	* Sets the comment of this benefits.
	*
	* @param comment the comment of this benefits
	*/
	public void setComment(java.lang.String comment) {
		_benefits.setComment(comment);
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