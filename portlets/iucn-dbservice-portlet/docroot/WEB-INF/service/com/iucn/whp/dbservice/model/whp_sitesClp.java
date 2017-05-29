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

import com.iucn.whp.dbservice.service.whp_sitesLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author alok.sen
 */
public class whp_sitesClp extends BaseModelImpl<whp_sites> implements whp_sites {
	public whp_sitesClp() {
	}

	public Class<?> getModelClass() {
		return whp_sites.class;
	}

	public String getModelClassName() {
		return whp_sites.class.getName();
	}

	public long getPrimaryKey() {
		return _site_id;
	}

	public void setPrimaryKey(long primaryKey) {
		setSite_id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_site_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("site_id", getSite_id());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("wdpa_id", getWdpa_id());
		attributes.put("unesco_id", getUnesco_id());
		attributes.put("name_en", getName_en());
		attributes.put("name_fr", getName_fr());
		attributes.put("transboundary", getTransboundary());
		attributes.put("inscription_date", getInscription_date());
		attributes.put("mixed_site", getMixed_site());
		attributes.put("cultural_landscape", getCultural_landscape());
		attributes.put("danger_list", getDanger_list());
		attributes.put("area", getArea());
		attributes.put("buffer_zone", getBuffer_zone());
		attributes.put("buffer_zone_area", getBuffer_zone_area());
		attributes.put("boundary_modification", getBoundary_modification());
		attributes.put("serial", getSerial());
		attributes.put("missions", getMissions());
		attributes.put("soc_reports", getSoc_reports());
		attributes.put("soouv", getSoouv());
		attributes.put("dsocr", getDsocr());
		attributes.put("management_plan", getManagement_plan());
		attributes.put("mee", getMee());
		attributes.put("staff", getStaff());
		attributes.put("staff_update_date", getStaff_update_date());
		attributes.put("indigenous_communities", getIndigenous_communities());
		attributes.put("population", getPopulation());
		attributes.put("last_updated", getLast_updated());
		attributes.put("creation_date", getCreation_date());
		attributes.put("created_by", getCreated_by());
		attributes.put("updated_by", getUpdated_by());
		attributes.put("active", getActive());
		attributes.put("thumbnailid", getThumbnailid());
		attributes.put("thumbnailid_small", getThumbnailid_small());
		attributes.put("description", getDescription());
		attributes.put("information_updating", getInformation_updating());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long site_id = (Long)attributes.get("site_id");

		if (site_id != null) {
			setSite_id(site_id);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long wdpa_id = (Long)attributes.get("wdpa_id");

		if (wdpa_id != null) {
			setWdpa_id(wdpa_id);
		}

		Long unesco_id = (Long)attributes.get("unesco_id");

		if (unesco_id != null) {
			setUnesco_id(unesco_id);
		}

		String name_en = (String)attributes.get("name_en");

		if (name_en != null) {
			setName_en(name_en);
		}

		String name_fr = (String)attributes.get("name_fr");

		if (name_fr != null) {
			setName_fr(name_fr);
		}

		Boolean transboundary = (Boolean)attributes.get("transboundary");

		if (transboundary != null) {
			setTransboundary(transboundary);
		}

		Date inscription_date = (Date)attributes.get("inscription_date");

		if (inscription_date != null) {
			setInscription_date(inscription_date);
		}

		Boolean mixed_site = (Boolean)attributes.get("mixed_site");

		if (mixed_site != null) {
			setMixed_site(mixed_site);
		}

		Boolean cultural_landscape = (Boolean)attributes.get(
				"cultural_landscape");

		if (cultural_landscape != null) {
			setCultural_landscape(cultural_landscape);
		}

		Boolean danger_list = (Boolean)attributes.get("danger_list");

		if (danger_list != null) {
			setDanger_list(danger_list);
		}

		Double area = (Double)attributes.get("area");

		if (area != null) {
			setArea(area);
		}

		Boolean buffer_zone = (Boolean)attributes.get("buffer_zone");

		if (buffer_zone != null) {
			setBuffer_zone(buffer_zone);
		}

		Double buffer_zone_area = (Double)attributes.get("buffer_zone_area");

		if (buffer_zone_area != null) {
			setBuffer_zone_area(buffer_zone_area);
		}

		Boolean boundary_modification = (Boolean)attributes.get(
				"boundary_modification");

		if (boundary_modification != null) {
			setBoundary_modification(boundary_modification);
		}

		Boolean serial = (Boolean)attributes.get("serial");

		if (serial != null) {
			setSerial(serial);
		}

		Boolean missions = (Boolean)attributes.get("missions");

		if (missions != null) {
			setMissions(missions);
		}

		Boolean soc_reports = (Boolean)attributes.get("soc_reports");

		if (soc_reports != null) {
			setSoc_reports(soc_reports);
		}

		Boolean soouv = (Boolean)attributes.get("soouv");

		if (soouv != null) {
			setSoouv(soouv);
		}

		Boolean dsocr = (Boolean)attributes.get("dsocr");

		if (dsocr != null) {
			setDsocr(dsocr);
		}

		Boolean management_plan = (Boolean)attributes.get("management_plan");

		if (management_plan != null) {
			setManagement_plan(management_plan);
		}

		Boolean mee = (Boolean)attributes.get("mee");

		if (mee != null) {
			setMee(mee);
		}

		Long staff = (Long)attributes.get("staff");

		if (staff != null) {
			setStaff(staff);
		}

		Date staff_update_date = (Date)attributes.get("staff_update_date");

		if (staff_update_date != null) {
			setStaff_update_date(staff_update_date);
		}

		Boolean indigenous_communities = (Boolean)attributes.get(
				"indigenous_communities");

		if (indigenous_communities != null) {
			setIndigenous_communities(indigenous_communities);
		}

		Long population = (Long)attributes.get("population");

		if (population != null) {
			setPopulation(population);
		}

		Date last_updated = (Date)attributes.get("last_updated");

		if (last_updated != null) {
			setLast_updated(last_updated);
		}

		Date creation_date = (Date)attributes.get("creation_date");

		if (creation_date != null) {
			setCreation_date(creation_date);
		}

		Long created_by = (Long)attributes.get("created_by");

		if (created_by != null) {
			setCreated_by(created_by);
		}

		Long updated_by = (Long)attributes.get("updated_by");

		if (updated_by != null) {
			setUpdated_by(updated_by);
		}

		Boolean active = (Boolean)attributes.get("active");

		if (active != null) {
			setActive(active);
		}

		Long thumbnailid = (Long)attributes.get("thumbnailid");

		if (thumbnailid != null) {
			setThumbnailid(thumbnailid);
		}

		Long thumbnailid_small = (Long)attributes.get("thumbnailid_small");

		if (thumbnailid_small != null) {
			setThumbnailid_small(thumbnailid_small);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Boolean information_updating = (Boolean)attributes.get(
				"information_updating");

		if (information_updating != null) {
			setInformation_updating(information_updating);
		}
	}

	public long getSite_id() {
		return _site_id;
	}

	public void setSite_id(long site_id) {
		_site_id = site_id;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getWdpa_id() {
		return _wdpa_id;
	}

	public void setWdpa_id(long wdpa_id) {
		_wdpa_id = wdpa_id;
	}

	public long getUnesco_id() {
		return _unesco_id;
	}

	public void setUnesco_id(long unesco_id) {
		_unesco_id = unesco_id;
	}

	public String getName_en() {
		return _name_en;
	}

	public void setName_en(String name_en) {
		_name_en = name_en;
	}

	public String getName_fr() {
		return _name_fr;
	}

	public void setName_fr(String name_fr) {
		_name_fr = name_fr;
	}

	public boolean getTransboundary() {
		return _transboundary;
	}

	public boolean isTransboundary() {
		return _transboundary;
	}

	public void setTransboundary(boolean transboundary) {
		_transboundary = transboundary;
	}

	public Date getInscription_date() {
		return _inscription_date;
	}

	public void setInscription_date(Date inscription_date) {
		_inscription_date = inscription_date;
	}

	public boolean getMixed_site() {
		return _mixed_site;
	}

	public boolean isMixed_site() {
		return _mixed_site;
	}

	public void setMixed_site(boolean mixed_site) {
		_mixed_site = mixed_site;
	}

	public boolean getCultural_landscape() {
		return _cultural_landscape;
	}

	public boolean isCultural_landscape() {
		return _cultural_landscape;
	}

	public void setCultural_landscape(boolean cultural_landscape) {
		_cultural_landscape = cultural_landscape;
	}

	public boolean getDanger_list() {
		return _danger_list;
	}

	public boolean isDanger_list() {
		return _danger_list;
	}

	public void setDanger_list(boolean danger_list) {
		_danger_list = danger_list;
	}

	public double getArea() {
		return _area;
	}

	public void setArea(double area) {
		_area = area;
	}

	public boolean getBuffer_zone() {
		return _buffer_zone;
	}

	public boolean isBuffer_zone() {
		return _buffer_zone;
	}

	public void setBuffer_zone(boolean buffer_zone) {
		_buffer_zone = buffer_zone;
	}

	public double getBuffer_zone_area() {
		return _buffer_zone_area;
	}

	public void setBuffer_zone_area(double buffer_zone_area) {
		_buffer_zone_area = buffer_zone_area;
	}

	public boolean getBoundary_modification() {
		return _boundary_modification;
	}

	public boolean isBoundary_modification() {
		return _boundary_modification;
	}

	public void setBoundary_modification(boolean boundary_modification) {
		_boundary_modification = boundary_modification;
	}

	public boolean getSerial() {
		return _serial;
	}

	public boolean isSerial() {
		return _serial;
	}

	public void setSerial(boolean serial) {
		_serial = serial;
	}

	public boolean getMissions() {
		return _missions;
	}

	public boolean isMissions() {
		return _missions;
	}

	public void setMissions(boolean missions) {
		_missions = missions;
	}

	public boolean getSoc_reports() {
		return _soc_reports;
	}

	public boolean isSoc_reports() {
		return _soc_reports;
	}

	public void setSoc_reports(boolean soc_reports) {
		_soc_reports = soc_reports;
	}

	public boolean getSoouv() {
		return _soouv;
	}

	public boolean isSoouv() {
		return _soouv;
	}

	public void setSoouv(boolean soouv) {
		_soouv = soouv;
	}

	public boolean getDsocr() {
		return _dsocr;
	}

	public boolean isDsocr() {
		return _dsocr;
	}

	public void setDsocr(boolean dsocr) {
		_dsocr = dsocr;
	}

	public boolean getManagement_plan() {
		return _management_plan;
	}

	public boolean isManagement_plan() {
		return _management_plan;
	}

	public void setManagement_plan(boolean management_plan) {
		_management_plan = management_plan;
	}

	public boolean getMee() {
		return _mee;
	}

	public boolean isMee() {
		return _mee;
	}

	public void setMee(boolean mee) {
		_mee = mee;
	}

	public long getStaff() {
		return _staff;
	}

	public void setStaff(long staff) {
		_staff = staff;
	}

	public Date getStaff_update_date() {
		return _staff_update_date;
	}

	public void setStaff_update_date(Date staff_update_date) {
		_staff_update_date = staff_update_date;
	}

	public boolean getIndigenous_communities() {
		return _indigenous_communities;
	}

	public boolean isIndigenous_communities() {
		return _indigenous_communities;
	}

	public void setIndigenous_communities(boolean indigenous_communities) {
		_indigenous_communities = indigenous_communities;
	}

	public long getPopulation() {
		return _population;
	}

	public void setPopulation(long population) {
		_population = population;
	}

	public Date getLast_updated() {
		return _last_updated;
	}

	public void setLast_updated(Date last_updated) {
		_last_updated = last_updated;
	}

	public Date getCreation_date() {
		return _creation_date;
	}

	public void setCreation_date(Date creation_date) {
		_creation_date = creation_date;
	}

	public long getCreated_by() {
		return _created_by;
	}

	public void setCreated_by(long created_by) {
		_created_by = created_by;
	}

	public long getUpdated_by() {
		return _updated_by;
	}

	public void setUpdated_by(long updated_by) {
		_updated_by = updated_by;
	}

	public boolean getActive() {
		return _active;
	}

	public boolean isActive() {
		return _active;
	}

	public void setActive(boolean active) {
		_active = active;
	}

	public long getThumbnailid() {
		return _thumbnailid;
	}

	public void setThumbnailid(long thumbnailid) {
		_thumbnailid = thumbnailid;
	}

	public long getThumbnailid_small() {
		return _thumbnailid_small;
	}

	public void setThumbnailid_small(long thumbnailid_small) {
		_thumbnailid_small = thumbnailid_small;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public boolean getInformation_updating() {
		return _information_updating;
	}

	public boolean isInformation_updating() {
		return _information_updating;
	}

	public void setInformation_updating(boolean information_updating) {
		_information_updating = information_updating;
	}

	public java.lang.String getThumbnailURL(
		com.liferay.portal.theme.ThemeDisplay themeDisplay) {
		throw new UnsupportedOperationException();
	}

	public BaseModel<?> getwhp_sitesRemoteModel() {
		return _whp_sitesRemoteModel;
	}

	public void setwhp_sitesRemoteModel(BaseModel<?> whp_sitesRemoteModel) {
		_whp_sitesRemoteModel = whp_sitesRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			whp_sitesLocalServiceUtil.addwhp_sites(this);
		}
		else {
			whp_sitesLocalServiceUtil.updatewhp_sites(this);
		}
	}

	@Override
	public whp_sites toEscapedModel() {
		return (whp_sites)Proxy.newProxyInstance(whp_sites.class.getClassLoader(),
			new Class[] { whp_sites.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		whp_sitesClp clone = new whp_sitesClp();

		clone.setSite_id(getSite_id());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setWdpa_id(getWdpa_id());
		clone.setUnesco_id(getUnesco_id());
		clone.setName_en(getName_en());
		clone.setName_fr(getName_fr());
		clone.setTransboundary(getTransboundary());
		clone.setInscription_date(getInscription_date());
		clone.setMixed_site(getMixed_site());
		clone.setCultural_landscape(getCultural_landscape());
		clone.setDanger_list(getDanger_list());
		clone.setArea(getArea());
		clone.setBuffer_zone(getBuffer_zone());
		clone.setBuffer_zone_area(getBuffer_zone_area());
		clone.setBoundary_modification(getBoundary_modification());
		clone.setSerial(getSerial());
		clone.setMissions(getMissions());
		clone.setSoc_reports(getSoc_reports());
		clone.setSoouv(getSoouv());
		clone.setDsocr(getDsocr());
		clone.setManagement_plan(getManagement_plan());
		clone.setMee(getMee());
		clone.setStaff(getStaff());
		clone.setStaff_update_date(getStaff_update_date());
		clone.setIndigenous_communities(getIndigenous_communities());
		clone.setPopulation(getPopulation());
		clone.setLast_updated(getLast_updated());
		clone.setCreation_date(getCreation_date());
		clone.setCreated_by(getCreated_by());
		clone.setUpdated_by(getUpdated_by());
		clone.setActive(getActive());
		clone.setThumbnailid(getThumbnailid());
		clone.setThumbnailid_small(getThumbnailid_small());
		clone.setDescription(getDescription());
		clone.setInformation_updating(getInformation_updating());

		return clone;
	}

	public int compareTo(whp_sites whp_sites) {
		int value = 0;

		value = getName_en().compareTo(whp_sites.getName_en());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		whp_sitesClp whp_sites = null;

		try {
			whp_sites = (whp_sitesClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = whp_sites.getPrimaryKey();

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
		StringBundler sb = new StringBundler(73);

		sb.append("{site_id=");
		sb.append(getSite_id());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", wdpa_id=");
		sb.append(getWdpa_id());
		sb.append(", unesco_id=");
		sb.append(getUnesco_id());
		sb.append(", name_en=");
		sb.append(getName_en());
		sb.append(", name_fr=");
		sb.append(getName_fr());
		sb.append(", transboundary=");
		sb.append(getTransboundary());
		sb.append(", inscription_date=");
		sb.append(getInscription_date());
		sb.append(", mixed_site=");
		sb.append(getMixed_site());
		sb.append(", cultural_landscape=");
		sb.append(getCultural_landscape());
		sb.append(", danger_list=");
		sb.append(getDanger_list());
		sb.append(", area=");
		sb.append(getArea());
		sb.append(", buffer_zone=");
		sb.append(getBuffer_zone());
		sb.append(", buffer_zone_area=");
		sb.append(getBuffer_zone_area());
		sb.append(", boundary_modification=");
		sb.append(getBoundary_modification());
		sb.append(", serial=");
		sb.append(getSerial());
		sb.append(", missions=");
		sb.append(getMissions());
		sb.append(", soc_reports=");
		sb.append(getSoc_reports());
		sb.append(", soouv=");
		sb.append(getSoouv());
		sb.append(", dsocr=");
		sb.append(getDsocr());
		sb.append(", management_plan=");
		sb.append(getManagement_plan());
		sb.append(", mee=");
		sb.append(getMee());
		sb.append(", staff=");
		sb.append(getStaff());
		sb.append(", staff_update_date=");
		sb.append(getStaff_update_date());
		sb.append(", indigenous_communities=");
		sb.append(getIndigenous_communities());
		sb.append(", population=");
		sb.append(getPopulation());
		sb.append(", last_updated=");
		sb.append(getLast_updated());
		sb.append(", creation_date=");
		sb.append(getCreation_date());
		sb.append(", created_by=");
		sb.append(getCreated_by());
		sb.append(", updated_by=");
		sb.append(getUpdated_by());
		sb.append(", active=");
		sb.append(getActive());
		sb.append(", thumbnailid=");
		sb.append(getThumbnailid());
		sb.append(", thumbnailid_small=");
		sb.append(getThumbnailid_small());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", information_updating=");
		sb.append(getInformation_updating());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(112);

		sb.append("<model><model-name>");
		sb.append("com.iucn.whp.dbservice.model.whp_sites");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>site_id</column-name><column-value><![CDATA[");
		sb.append(getSite_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>wdpa_id</column-name><column-value><![CDATA[");
		sb.append(getWdpa_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>unesco_id</column-name><column-value><![CDATA[");
		sb.append(getUnesco_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name_en</column-name><column-value><![CDATA[");
		sb.append(getName_en());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name_fr</column-name><column-value><![CDATA[");
		sb.append(getName_fr());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>transboundary</column-name><column-value><![CDATA[");
		sb.append(getTransboundary());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inscription_date</column-name><column-value><![CDATA[");
		sb.append(getInscription_date());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>mixed_site</column-name><column-value><![CDATA[");
		sb.append(getMixed_site());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cultural_landscape</column-name><column-value><![CDATA[");
		sb.append(getCultural_landscape());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>danger_list</column-name><column-value><![CDATA[");
		sb.append(getDanger_list());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>area</column-name><column-value><![CDATA[");
		sb.append(getArea());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>buffer_zone</column-name><column-value><![CDATA[");
		sb.append(getBuffer_zone());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>buffer_zone_area</column-name><column-value><![CDATA[");
		sb.append(getBuffer_zone_area());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>boundary_modification</column-name><column-value><![CDATA[");
		sb.append(getBoundary_modification());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>serial</column-name><column-value><![CDATA[");
		sb.append(getSerial());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>missions</column-name><column-value><![CDATA[");
		sb.append(getMissions());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soc_reports</column-name><column-value><![CDATA[");
		sb.append(getSoc_reports());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soouv</column-name><column-value><![CDATA[");
		sb.append(getSoouv());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dsocr</column-name><column-value><![CDATA[");
		sb.append(getDsocr());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>management_plan</column-name><column-value><![CDATA[");
		sb.append(getManagement_plan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>mee</column-name><column-value><![CDATA[");
		sb.append(getMee());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>staff</column-name><column-value><![CDATA[");
		sb.append(getStaff());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>staff_update_date</column-name><column-value><![CDATA[");
		sb.append(getStaff_update_date());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>indigenous_communities</column-name><column-value><![CDATA[");
		sb.append(getIndigenous_communities());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>population</column-name><column-value><![CDATA[");
		sb.append(getPopulation());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>last_updated</column-name><column-value><![CDATA[");
		sb.append(getLast_updated());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>creation_date</column-name><column-value><![CDATA[");
		sb.append(getCreation_date());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>created_by</column-name><column-value><![CDATA[");
		sb.append(getCreated_by());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>updated_by</column-name><column-value><![CDATA[");
		sb.append(getUpdated_by());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>active</column-name><column-value><![CDATA[");
		sb.append(getActive());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thumbnailid</column-name><column-value><![CDATA[");
		sb.append(getThumbnailid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thumbnailid_small</column-name><column-value><![CDATA[");
		sb.append(getThumbnailid_small());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>information_updating</column-name><column-value><![CDATA[");
		sb.append(getInformation_updating());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _site_id;
	private long _groupId;
	private long _companyId;
	private long _wdpa_id;
	private long _unesco_id;
	private String _name_en;
	private String _name_fr;
	private boolean _transboundary;
	private Date _inscription_date;
	private boolean _mixed_site;
	private boolean _cultural_landscape;
	private boolean _danger_list;
	private double _area;
	private boolean _buffer_zone;
	private double _buffer_zone_area;
	private boolean _boundary_modification;
	private boolean _serial;
	private boolean _missions;
	private boolean _soc_reports;
	private boolean _soouv;
	private boolean _dsocr;
	private boolean _management_plan;
	private boolean _mee;
	private long _staff;
	private Date _staff_update_date;
	private boolean _indigenous_communities;
	private long _population;
	private Date _last_updated;
	private Date _creation_date;
	private long _created_by;
	private long _updated_by;
	private boolean _active;
	private long _thumbnailid;
	private long _thumbnailid_small;
	private String _description;
	private boolean _information_updating;
	private BaseModel<?> _whp_sitesRemoteModel;
}