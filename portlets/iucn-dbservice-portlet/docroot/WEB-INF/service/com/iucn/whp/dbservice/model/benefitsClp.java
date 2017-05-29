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

import com.iucn.whp.dbservice.service.benefitsLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author alok.sen
 */
public class benefitsClp extends BaseModelImpl<benefits> implements benefits {
	public benefitsClp() {
	}

	public Class<?> getModelClass() {
		return benefits.class;
	}

	public String getModelClassName() {
		return benefits.class.getName();
	}

	public long getPrimaryKey() {
		return _benefits_id;
	}

	public void setPrimaryKey(long primaryKey) {
		setBenefits_id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_benefits_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
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

	@Override
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

	public long getBenefits_id() {
		return _benefits_id;
	}

	public void setBenefits_id(long benefits_id) {
		_benefits_id = benefits_id;
	}

	public long getAssessment_version_id() {
		return _assessment_version_id;
	}

	public void setAssessment_version_id(long assessment_version_id) {
		_assessment_version_id = assessment_version_id;
	}

	public long getSelected_benefit() {
		return _selected_benefit;
	}

	public void setSelected_benefit(long selected_benefit) {
		_selected_benefit = selected_benefit;
	}

	public String getSummary() {
		return _summary;
	}

	public void setSummary(String summary) {
		_summary = summary;
	}

	public long getHabitatChangeLevel() {
		return _habitatChangeLevel;
	}

	public void setHabitatChangeLevel(long habitatChangeLevel) {
		_habitatChangeLevel = habitatChangeLevel;
	}

	public long getHabitatChangeTrend() {
		return _habitatChangeTrend;
	}

	public void setHabitatChangeTrend(long habitatChangeTrend) {
		_habitatChangeTrend = habitatChangeTrend;
	}

	public long getPollutionLevel() {
		return _pollutionLevel;
	}

	public void setPollutionLevel(long pollutionLevel) {
		_pollutionLevel = pollutionLevel;
	}

	public long getPollutionTrend() {
		return _pollutionTrend;
	}

	public void setPollutionTrend(long pollutionTrend) {
		_pollutionTrend = pollutionTrend;
	}

	public long getOverExploitationLevel() {
		return _overExploitationLevel;
	}

	public void setOverExploitationLevel(long overExploitationLevel) {
		_overExploitationLevel = overExploitationLevel;
	}

	public long getOverExploitationTrend() {
		return _overExploitationTrend;
	}

	public void setOverExploitationTrend(long overExploitationTrend) {
		_overExploitationTrend = overExploitationTrend;
	}

	public long getClimateChangeLevel() {
		return _climateChangeLevel;
	}

	public void setClimateChangeLevel(long climateChangeLevel) {
		_climateChangeLevel = climateChangeLevel;
	}

	public long getClimateChangeTrend() {
		return _climateChangeTrend;
	}

	public void setClimateChangeTrend(long climateChangeTrend) {
		_climateChangeTrend = climateChangeTrend;
	}

	public long getInvasiveSpeciesLevel() {
		return _invasiveSpeciesLevel;
	}

	public void setInvasiveSpeciesLevel(long invasiveSpeciesLevel) {
		_invasiveSpeciesLevel = invasiveSpeciesLevel;
	}

	public long getInvasiveSpeciesTrend() {
		return _invasiveSpeciesTrend;
	}

	public void setInvasiveSpeciesTrend(long invasiveSpeciesTrend) {
		_invasiveSpeciesTrend = invasiveSpeciesTrend;
	}

	public String getComment() {
		return _comment;
	}

	public void setComment(String comment) {
		_comment = comment;
	}

	public boolean getData_deficient() {
		return _data_deficient;
	}

	public boolean isData_deficient() {
		return _data_deficient;
	}

	public void setData_deficient(boolean data_deficient) {
		_data_deficient = data_deficient;
	}

	public long getCommunity_within_site() {
		return _community_within_site;
	}

	public void setCommunity_within_site(long community_within_site) {
		_community_within_site = community_within_site;
	}

	public long getCommunity_outside_site() {
		return _community_outside_site;
	}

	public void setCommunity_outside_site(long community_outside_site) {
		_community_outside_site = community_outside_site;
	}

	public long getWider_community() {
		return _wider_community;
	}

	public void setWider_community(long wider_community) {
		_wider_community = wider_community;
	}

	public BaseModel<?> getbenefitsRemoteModel() {
		return _benefitsRemoteModel;
	}

	public void setbenefitsRemoteModel(BaseModel<?> benefitsRemoteModel) {
		_benefitsRemoteModel = benefitsRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			benefitsLocalServiceUtil.addbenefits(this);
		}
		else {
			benefitsLocalServiceUtil.updatebenefits(this);
		}
	}

	@Override
	public benefits toEscapedModel() {
		return (benefits)Proxy.newProxyInstance(benefits.class.getClassLoader(),
			new Class[] { benefits.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		benefitsClp clone = new benefitsClp();

		clone.setBenefits_id(getBenefits_id());
		clone.setAssessment_version_id(getAssessment_version_id());
		clone.setSelected_benefit(getSelected_benefit());
		clone.setSummary(getSummary());
		clone.setHabitatChangeLevel(getHabitatChangeLevel());
		clone.setHabitatChangeTrend(getHabitatChangeTrend());
		clone.setPollutionLevel(getPollutionLevel());
		clone.setPollutionTrend(getPollutionTrend());
		clone.setOverExploitationLevel(getOverExploitationLevel());
		clone.setOverExploitationTrend(getOverExploitationTrend());
		clone.setClimateChangeLevel(getClimateChangeLevel());
		clone.setClimateChangeTrend(getClimateChangeTrend());
		clone.setInvasiveSpeciesLevel(getInvasiveSpeciesLevel());
		clone.setInvasiveSpeciesTrend(getInvasiveSpeciesTrend());
		clone.setComment(getComment());
		clone.setData_deficient(getData_deficient());
		clone.setCommunity_within_site(getCommunity_within_site());
		clone.setCommunity_outside_site(getCommunity_outside_site());
		clone.setWider_community(getWider_community());

		return clone;
	}

	public int compareTo(benefits benefits) {
		long primaryKey = benefits.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		benefitsClp benefits = null;

		try {
			benefits = (benefitsClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = benefits.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(39);

		sb.append("{benefits_id=");
		sb.append(getBenefits_id());
		sb.append(", assessment_version_id=");
		sb.append(getAssessment_version_id());
		sb.append(", selected_benefit=");
		sb.append(getSelected_benefit());
		sb.append(", summary=");
		sb.append(getSummary());
		sb.append(", habitatChangeLevel=");
		sb.append(getHabitatChangeLevel());
		sb.append(", habitatChangeTrend=");
		sb.append(getHabitatChangeTrend());
		sb.append(", pollutionLevel=");
		sb.append(getPollutionLevel());
		sb.append(", pollutionTrend=");
		sb.append(getPollutionTrend());
		sb.append(", overExploitationLevel=");
		sb.append(getOverExploitationLevel());
		sb.append(", overExploitationTrend=");
		sb.append(getOverExploitationTrend());
		sb.append(", climateChangeLevel=");
		sb.append(getClimateChangeLevel());
		sb.append(", climateChangeTrend=");
		sb.append(getClimateChangeTrend());
		sb.append(", invasiveSpeciesLevel=");
		sb.append(getInvasiveSpeciesLevel());
		sb.append(", invasiveSpeciesTrend=");
		sb.append(getInvasiveSpeciesTrend());
		sb.append(", comment=");
		sb.append(getComment());
		sb.append(", data_deficient=");
		sb.append(getData_deficient());
		sb.append(", community_within_site=");
		sb.append(getCommunity_within_site());
		sb.append(", community_outside_site=");
		sb.append(getCommunity_outside_site());
		sb.append(", wider_community=");
		sb.append(getWider_community());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(61);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.benefits");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>benefits_id</column-name><column-value><![CDATA[");
		sb.append(getBenefits_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>assessment_version_id</column-name><column-value><![CDATA[");
		sb.append(getAssessment_version_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>selected_benefit</column-name><column-value><![CDATA[");
		sb.append(getSelected_benefit());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>summary</column-name><column-value><![CDATA[");
		sb.append(getSummary());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>habitatChangeLevel</column-name><column-value><![CDATA[");
		sb.append(getHabitatChangeLevel());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>habitatChangeTrend</column-name><column-value><![CDATA[");
		sb.append(getHabitatChangeTrend());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>pollutionLevel</column-name><column-value><![CDATA[");
		sb.append(getPollutionLevel());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>pollutionTrend</column-name><column-value><![CDATA[");
		sb.append(getPollutionTrend());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>overExploitationLevel</column-name><column-value><![CDATA[");
		sb.append(getOverExploitationLevel());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>overExploitationTrend</column-name><column-value><![CDATA[");
		sb.append(getOverExploitationTrend());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>climateChangeLevel</column-name><column-value><![CDATA[");
		sb.append(getClimateChangeLevel());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>climateChangeTrend</column-name><column-value><![CDATA[");
		sb.append(getClimateChangeTrend());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>invasiveSpeciesLevel</column-name><column-value><![CDATA[");
		sb.append(getInvasiveSpeciesLevel());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>invasiveSpeciesTrend</column-name><column-value><![CDATA[");
		sb.append(getInvasiveSpeciesTrend());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>comment</column-name><column-value><![CDATA[");
		sb.append(getComment());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>data_deficient</column-name><column-value><![CDATA[");
		sb.append(getData_deficient());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>community_within_site</column-name><column-value><![CDATA[");
		sb.append(getCommunity_within_site());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>community_outside_site</column-name><column-value><![CDATA[");
		sb.append(getCommunity_outside_site());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>wider_community</column-name><column-value><![CDATA[");
		sb.append(getWider_community());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _benefits_id;
	private long _assessment_version_id;
	private long _selected_benefit;
	private String _summary;
	private long _habitatChangeLevel;
	private long _habitatChangeTrend;
	private long _pollutionLevel;
	private long _pollutionTrend;
	private long _overExploitationLevel;
	private long _overExploitationTrend;
	private long _climateChangeLevel;
	private long _climateChangeTrend;
	private long _invasiveSpeciesLevel;
	private long _invasiveSpeciesTrend;
	private String _comment;
	private boolean _data_deficient;
	private long _community_within_site;
	private long _community_outside_site;
	private long _wider_community;
	private BaseModel<?> _benefitsRemoteModel;
}