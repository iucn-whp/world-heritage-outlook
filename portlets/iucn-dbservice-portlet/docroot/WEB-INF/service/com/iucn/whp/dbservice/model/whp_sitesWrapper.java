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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link whp_sites}.
 * </p>
 *
 * @author    alok.sen
 * @see       whp_sites
 * @generated
 */
public class whp_sitesWrapper implements whp_sites, ModelWrapper<whp_sites> {
	public whp_sitesWrapper(whp_sites whp_sites) {
		_whp_sites = whp_sites;
	}

	public Class<?> getModelClass() {
		return whp_sites.class;
	}

	public String getModelClassName() {
		return whp_sites.class.getName();
	}

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

		return attributes;
	}

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
	}

	/**
	* Returns the primary key of this whp_sites.
	*
	* @return the primary key of this whp_sites
	*/
	public long getPrimaryKey() {
		return _whp_sites.getPrimaryKey();
	}

	/**
	* Sets the primary key of this whp_sites.
	*
	* @param primaryKey the primary key of this whp_sites
	*/
	public void setPrimaryKey(long primaryKey) {
		_whp_sites.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the site_id of this whp_sites.
	*
	* @return the site_id of this whp_sites
	*/
	public long getSite_id() {
		return _whp_sites.getSite_id();
	}

	/**
	* Sets the site_id of this whp_sites.
	*
	* @param site_id the site_id of this whp_sites
	*/
	public void setSite_id(long site_id) {
		_whp_sites.setSite_id(site_id);
	}

	/**
	* Returns the group ID of this whp_sites.
	*
	* @return the group ID of this whp_sites
	*/
	public long getGroupId() {
		return _whp_sites.getGroupId();
	}

	/**
	* Sets the group ID of this whp_sites.
	*
	* @param groupId the group ID of this whp_sites
	*/
	public void setGroupId(long groupId) {
		_whp_sites.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this whp_sites.
	*
	* @return the company ID of this whp_sites
	*/
	public long getCompanyId() {
		return _whp_sites.getCompanyId();
	}

	/**
	* Sets the company ID of this whp_sites.
	*
	* @param companyId the company ID of this whp_sites
	*/
	public void setCompanyId(long companyId) {
		_whp_sites.setCompanyId(companyId);
	}

	/**
	* Returns the wdpa_id of this whp_sites.
	*
	* @return the wdpa_id of this whp_sites
	*/
	public long getWdpa_id() {
		return _whp_sites.getWdpa_id();
	}

	/**
	* Sets the wdpa_id of this whp_sites.
	*
	* @param wdpa_id the wdpa_id of this whp_sites
	*/
	public void setWdpa_id(long wdpa_id) {
		_whp_sites.setWdpa_id(wdpa_id);
	}

	/**
	* Returns the unesco_id of this whp_sites.
	*
	* @return the unesco_id of this whp_sites
	*/
	public long getUnesco_id() {
		return _whp_sites.getUnesco_id();
	}

	/**
	* Sets the unesco_id of this whp_sites.
	*
	* @param unesco_id the unesco_id of this whp_sites
	*/
	public void setUnesco_id(long unesco_id) {
		_whp_sites.setUnesco_id(unesco_id);
	}

	/**
	* Returns the name_en of this whp_sites.
	*
	* @return the name_en of this whp_sites
	*/
	public java.lang.String getName_en() {
		return _whp_sites.getName_en();
	}

	/**
	* Sets the name_en of this whp_sites.
	*
	* @param name_en the name_en of this whp_sites
	*/
	public void setName_en(java.lang.String name_en) {
		_whp_sites.setName_en(name_en);
	}

	/**
	* Returns the name_fr of this whp_sites.
	*
	* @return the name_fr of this whp_sites
	*/
	public java.lang.String getName_fr() {
		return _whp_sites.getName_fr();
	}

	/**
	* Sets the name_fr of this whp_sites.
	*
	* @param name_fr the name_fr of this whp_sites
	*/
	public void setName_fr(java.lang.String name_fr) {
		_whp_sites.setName_fr(name_fr);
	}

	/**
	* Returns the transboundary of this whp_sites.
	*
	* @return the transboundary of this whp_sites
	*/
	public boolean getTransboundary() {
		return _whp_sites.getTransboundary();
	}

	/**
	* Returns <code>true</code> if this whp_sites is transboundary.
	*
	* @return <code>true</code> if this whp_sites is transboundary; <code>false</code> otherwise
	*/
	public boolean isTransboundary() {
		return _whp_sites.isTransboundary();
	}

	/**
	* Sets whether this whp_sites is transboundary.
	*
	* @param transboundary the transboundary of this whp_sites
	*/
	public void setTransboundary(boolean transboundary) {
		_whp_sites.setTransboundary(transboundary);
	}

	/**
	* Returns the inscription_date of this whp_sites.
	*
	* @return the inscription_date of this whp_sites
	*/
	public java.util.Date getInscription_date() {
		return _whp_sites.getInscription_date();
	}

	/**
	* Sets the inscription_date of this whp_sites.
	*
	* @param inscription_date the inscription_date of this whp_sites
	*/
	public void setInscription_date(java.util.Date inscription_date) {
		_whp_sites.setInscription_date(inscription_date);
	}

	/**
	* Returns the mixed_site of this whp_sites.
	*
	* @return the mixed_site of this whp_sites
	*/
	public boolean getMixed_site() {
		return _whp_sites.getMixed_site();
	}

	/**
	* Returns <code>true</code> if this whp_sites is mixed_site.
	*
	* @return <code>true</code> if this whp_sites is mixed_site; <code>false</code> otherwise
	*/
	public boolean isMixed_site() {
		return _whp_sites.isMixed_site();
	}

	/**
	* Sets whether this whp_sites is mixed_site.
	*
	* @param mixed_site the mixed_site of this whp_sites
	*/
	public void setMixed_site(boolean mixed_site) {
		_whp_sites.setMixed_site(mixed_site);
	}

	/**
	* Returns the cultural_landscape of this whp_sites.
	*
	* @return the cultural_landscape of this whp_sites
	*/
	public boolean getCultural_landscape() {
		return _whp_sites.getCultural_landscape();
	}

	/**
	* Returns <code>true</code> if this whp_sites is cultural_landscape.
	*
	* @return <code>true</code> if this whp_sites is cultural_landscape; <code>false</code> otherwise
	*/
	public boolean isCultural_landscape() {
		return _whp_sites.isCultural_landscape();
	}

	/**
	* Sets whether this whp_sites is cultural_landscape.
	*
	* @param cultural_landscape the cultural_landscape of this whp_sites
	*/
	public void setCultural_landscape(boolean cultural_landscape) {
		_whp_sites.setCultural_landscape(cultural_landscape);
	}

	/**
	* Returns the danger_list of this whp_sites.
	*
	* @return the danger_list of this whp_sites
	*/
	public boolean getDanger_list() {
		return _whp_sites.getDanger_list();
	}

	/**
	* Returns <code>true</code> if this whp_sites is danger_list.
	*
	* @return <code>true</code> if this whp_sites is danger_list; <code>false</code> otherwise
	*/
	public boolean isDanger_list() {
		return _whp_sites.isDanger_list();
	}

	/**
	* Sets whether this whp_sites is danger_list.
	*
	* @param danger_list the danger_list of this whp_sites
	*/
	public void setDanger_list(boolean danger_list) {
		_whp_sites.setDanger_list(danger_list);
	}

	/**
	* Returns the area of this whp_sites.
	*
	* @return the area of this whp_sites
	*/
	public double getArea() {
		return _whp_sites.getArea();
	}

	/**
	* Sets the area of this whp_sites.
	*
	* @param area the area of this whp_sites
	*/
	public void setArea(double area) {
		_whp_sites.setArea(area);
	}

	/**
	* Returns the buffer_zone of this whp_sites.
	*
	* @return the buffer_zone of this whp_sites
	*/
	public boolean getBuffer_zone() {
		return _whp_sites.getBuffer_zone();
	}

	/**
	* Returns <code>true</code> if this whp_sites is buffer_zone.
	*
	* @return <code>true</code> if this whp_sites is buffer_zone; <code>false</code> otherwise
	*/
	public boolean isBuffer_zone() {
		return _whp_sites.isBuffer_zone();
	}

	/**
	* Sets whether this whp_sites is buffer_zone.
	*
	* @param buffer_zone the buffer_zone of this whp_sites
	*/
	public void setBuffer_zone(boolean buffer_zone) {
		_whp_sites.setBuffer_zone(buffer_zone);
	}

	/**
	* Returns the buffer_zone_area of this whp_sites.
	*
	* @return the buffer_zone_area of this whp_sites
	*/
	public double getBuffer_zone_area() {
		return _whp_sites.getBuffer_zone_area();
	}

	/**
	* Sets the buffer_zone_area of this whp_sites.
	*
	* @param buffer_zone_area the buffer_zone_area of this whp_sites
	*/
	public void setBuffer_zone_area(double buffer_zone_area) {
		_whp_sites.setBuffer_zone_area(buffer_zone_area);
	}

	/**
	* Returns the boundary_modification of this whp_sites.
	*
	* @return the boundary_modification of this whp_sites
	*/
	public boolean getBoundary_modification() {
		return _whp_sites.getBoundary_modification();
	}

	/**
	* Returns <code>true</code> if this whp_sites is boundary_modification.
	*
	* @return <code>true</code> if this whp_sites is boundary_modification; <code>false</code> otherwise
	*/
	public boolean isBoundary_modification() {
		return _whp_sites.isBoundary_modification();
	}

	/**
	* Sets whether this whp_sites is boundary_modification.
	*
	* @param boundary_modification the boundary_modification of this whp_sites
	*/
	public void setBoundary_modification(boolean boundary_modification) {
		_whp_sites.setBoundary_modification(boundary_modification);
	}

	/**
	* Returns the serial of this whp_sites.
	*
	* @return the serial of this whp_sites
	*/
	public boolean getSerial() {
		return _whp_sites.getSerial();
	}

	/**
	* Returns <code>true</code> if this whp_sites is serial.
	*
	* @return <code>true</code> if this whp_sites is serial; <code>false</code> otherwise
	*/
	public boolean isSerial() {
		return _whp_sites.isSerial();
	}

	/**
	* Sets whether this whp_sites is serial.
	*
	* @param serial the serial of this whp_sites
	*/
	public void setSerial(boolean serial) {
		_whp_sites.setSerial(serial);
	}

	/**
	* Returns the missions of this whp_sites.
	*
	* @return the missions of this whp_sites
	*/
	public boolean getMissions() {
		return _whp_sites.getMissions();
	}

	/**
	* Returns <code>true</code> if this whp_sites is missions.
	*
	* @return <code>true</code> if this whp_sites is missions; <code>false</code> otherwise
	*/
	public boolean isMissions() {
		return _whp_sites.isMissions();
	}

	/**
	* Sets whether this whp_sites is missions.
	*
	* @param missions the missions of this whp_sites
	*/
	public void setMissions(boolean missions) {
		_whp_sites.setMissions(missions);
	}

	/**
	* Returns the soc_reports of this whp_sites.
	*
	* @return the soc_reports of this whp_sites
	*/
	public boolean getSoc_reports() {
		return _whp_sites.getSoc_reports();
	}

	/**
	* Returns <code>true</code> if this whp_sites is soc_reports.
	*
	* @return <code>true</code> if this whp_sites is soc_reports; <code>false</code> otherwise
	*/
	public boolean isSoc_reports() {
		return _whp_sites.isSoc_reports();
	}

	/**
	* Sets whether this whp_sites is soc_reports.
	*
	* @param soc_reports the soc_reports of this whp_sites
	*/
	public void setSoc_reports(boolean soc_reports) {
		_whp_sites.setSoc_reports(soc_reports);
	}

	/**
	* Returns the soouv of this whp_sites.
	*
	* @return the soouv of this whp_sites
	*/
	public boolean getSoouv() {
		return _whp_sites.getSoouv();
	}

	/**
	* Returns <code>true</code> if this whp_sites is soouv.
	*
	* @return <code>true</code> if this whp_sites is soouv; <code>false</code> otherwise
	*/
	public boolean isSoouv() {
		return _whp_sites.isSoouv();
	}

	/**
	* Sets whether this whp_sites is soouv.
	*
	* @param soouv the soouv of this whp_sites
	*/
	public void setSoouv(boolean soouv) {
		_whp_sites.setSoouv(soouv);
	}

	/**
	* Returns the dsocr of this whp_sites.
	*
	* @return the dsocr of this whp_sites
	*/
	public boolean getDsocr() {
		return _whp_sites.getDsocr();
	}

	/**
	* Returns <code>true</code> if this whp_sites is dsocr.
	*
	* @return <code>true</code> if this whp_sites is dsocr; <code>false</code> otherwise
	*/
	public boolean isDsocr() {
		return _whp_sites.isDsocr();
	}

	/**
	* Sets whether this whp_sites is dsocr.
	*
	* @param dsocr the dsocr of this whp_sites
	*/
	public void setDsocr(boolean dsocr) {
		_whp_sites.setDsocr(dsocr);
	}

	/**
	* Returns the management_plan of this whp_sites.
	*
	* @return the management_plan of this whp_sites
	*/
	public boolean getManagement_plan() {
		return _whp_sites.getManagement_plan();
	}

	/**
	* Returns <code>true</code> if this whp_sites is management_plan.
	*
	* @return <code>true</code> if this whp_sites is management_plan; <code>false</code> otherwise
	*/
	public boolean isManagement_plan() {
		return _whp_sites.isManagement_plan();
	}

	/**
	* Sets whether this whp_sites is management_plan.
	*
	* @param management_plan the management_plan of this whp_sites
	*/
	public void setManagement_plan(boolean management_plan) {
		_whp_sites.setManagement_plan(management_plan);
	}

	/**
	* Returns the mee of this whp_sites.
	*
	* @return the mee of this whp_sites
	*/
	public boolean getMee() {
		return _whp_sites.getMee();
	}

	/**
	* Returns <code>true</code> if this whp_sites is mee.
	*
	* @return <code>true</code> if this whp_sites is mee; <code>false</code> otherwise
	*/
	public boolean isMee() {
		return _whp_sites.isMee();
	}

	/**
	* Sets whether this whp_sites is mee.
	*
	* @param mee the mee of this whp_sites
	*/
	public void setMee(boolean mee) {
		_whp_sites.setMee(mee);
	}

	/**
	* Returns the staff of this whp_sites.
	*
	* @return the staff of this whp_sites
	*/
	public long getStaff() {
		return _whp_sites.getStaff();
	}

	/**
	* Sets the staff of this whp_sites.
	*
	* @param staff the staff of this whp_sites
	*/
	public void setStaff(long staff) {
		_whp_sites.setStaff(staff);
	}

	/**
	* Returns the staff_update_date of this whp_sites.
	*
	* @return the staff_update_date of this whp_sites
	*/
	public java.util.Date getStaff_update_date() {
		return _whp_sites.getStaff_update_date();
	}

	/**
	* Sets the staff_update_date of this whp_sites.
	*
	* @param staff_update_date the staff_update_date of this whp_sites
	*/
	public void setStaff_update_date(java.util.Date staff_update_date) {
		_whp_sites.setStaff_update_date(staff_update_date);
	}

	/**
	* Returns the indigenous_communities of this whp_sites.
	*
	* @return the indigenous_communities of this whp_sites
	*/
	public boolean getIndigenous_communities() {
		return _whp_sites.getIndigenous_communities();
	}

	/**
	* Returns <code>true</code> if this whp_sites is indigenous_communities.
	*
	* @return <code>true</code> if this whp_sites is indigenous_communities; <code>false</code> otherwise
	*/
	public boolean isIndigenous_communities() {
		return _whp_sites.isIndigenous_communities();
	}

	/**
	* Sets whether this whp_sites is indigenous_communities.
	*
	* @param indigenous_communities the indigenous_communities of this whp_sites
	*/
	public void setIndigenous_communities(boolean indigenous_communities) {
		_whp_sites.setIndigenous_communities(indigenous_communities);
	}

	/**
	* Returns the population of this whp_sites.
	*
	* @return the population of this whp_sites
	*/
	public long getPopulation() {
		return _whp_sites.getPopulation();
	}

	/**
	* Sets the population of this whp_sites.
	*
	* @param population the population of this whp_sites
	*/
	public void setPopulation(long population) {
		_whp_sites.setPopulation(population);
	}

	/**
	* Returns the last_updated of this whp_sites.
	*
	* @return the last_updated of this whp_sites
	*/
	public java.util.Date getLast_updated() {
		return _whp_sites.getLast_updated();
	}

	/**
	* Sets the last_updated of this whp_sites.
	*
	* @param last_updated the last_updated of this whp_sites
	*/
	public void setLast_updated(java.util.Date last_updated) {
		_whp_sites.setLast_updated(last_updated);
	}

	/**
	* Returns the creation_date of this whp_sites.
	*
	* @return the creation_date of this whp_sites
	*/
	public java.util.Date getCreation_date() {
		return _whp_sites.getCreation_date();
	}

	/**
	* Sets the creation_date of this whp_sites.
	*
	* @param creation_date the creation_date of this whp_sites
	*/
	public void setCreation_date(java.util.Date creation_date) {
		_whp_sites.setCreation_date(creation_date);
	}

	/**
	* Returns the created_by of this whp_sites.
	*
	* @return the created_by of this whp_sites
	*/
	public long getCreated_by() {
		return _whp_sites.getCreated_by();
	}

	/**
	* Sets the created_by of this whp_sites.
	*
	* @param created_by the created_by of this whp_sites
	*/
	public void setCreated_by(long created_by) {
		_whp_sites.setCreated_by(created_by);
	}

	/**
	* Returns the updated_by of this whp_sites.
	*
	* @return the updated_by of this whp_sites
	*/
	public long getUpdated_by() {
		return _whp_sites.getUpdated_by();
	}

	/**
	* Sets the updated_by of this whp_sites.
	*
	* @param updated_by the updated_by of this whp_sites
	*/
	public void setUpdated_by(long updated_by) {
		_whp_sites.setUpdated_by(updated_by);
	}

	/**
	* Returns the active of this whp_sites.
	*
	* @return the active of this whp_sites
	*/
	public boolean getActive() {
		return _whp_sites.getActive();
	}

	/**
	* Returns <code>true</code> if this whp_sites is active.
	*
	* @return <code>true</code> if this whp_sites is active; <code>false</code> otherwise
	*/
	public boolean isActive() {
		return _whp_sites.isActive();
	}

	/**
	* Sets whether this whp_sites is active.
	*
	* @param active the active of this whp_sites
	*/
	public void setActive(boolean active) {
		_whp_sites.setActive(active);
	}

	/**
	* Returns the thumbnailid of this whp_sites.
	*
	* @return the thumbnailid of this whp_sites
	*/
	public long getThumbnailid() {
		return _whp_sites.getThumbnailid();
	}

	/**
	* Sets the thumbnailid of this whp_sites.
	*
	* @param thumbnailid the thumbnailid of this whp_sites
	*/
	public void setThumbnailid(long thumbnailid) {
		_whp_sites.setThumbnailid(thumbnailid);
	}

	/**
	* Returns the thumbnailid_small of this whp_sites.
	*
	* @return the thumbnailid_small of this whp_sites
	*/
	public long getThumbnailid_small() {
		return _whp_sites.getThumbnailid_small();
	}

	/**
	* Sets the thumbnailid_small of this whp_sites.
	*
	* @param thumbnailid_small the thumbnailid_small of this whp_sites
	*/
	public void setThumbnailid_small(long thumbnailid_small) {
		_whp_sites.setThumbnailid_small(thumbnailid_small);
	}

	/**
	* Returns the description of this whp_sites.
	*
	* @return the description of this whp_sites
	*/
	public java.lang.String getDescription() {
		return _whp_sites.getDescription();
	}

	/**
	* Sets the description of this whp_sites.
	*
	* @param description the description of this whp_sites
	*/
	public void setDescription(java.lang.String description) {
		_whp_sites.setDescription(description);
	}

	public boolean isNew() {
		return _whp_sites.isNew();
	}

	public void setNew(boolean n) {
		_whp_sites.setNew(n);
	}

	public boolean isCachedModel() {
		return _whp_sites.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_whp_sites.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _whp_sites.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _whp_sites.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_whp_sites.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _whp_sites.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_whp_sites.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new whp_sitesWrapper((whp_sites)_whp_sites.clone());
	}

	public int compareTo(com.iucn.whp.dbservice.model.whp_sites whp_sites) {
		return _whp_sites.compareTo(whp_sites);
	}

	@Override
	public int hashCode() {
		return _whp_sites.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.iucn.whp.dbservice.model.whp_sites> toCacheModel() {
		return _whp_sites.toCacheModel();
	}

	public com.iucn.whp.dbservice.model.whp_sites toEscapedModel() {
		return new whp_sitesWrapper(_whp_sites.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _whp_sites.toString();
	}

	public java.lang.String toXmlString() {
		return _whp_sites.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_whp_sites.persist();
	}

	public java.lang.String getThumbnailURL(
		com.liferay.portal.theme.ThemeDisplay themeDisplay)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _whp_sites.getThumbnailURL(themeDisplay);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public whp_sites getWrappedwhp_sites() {
		return _whp_sites;
	}

	public whp_sites getWrappedModel() {
		return _whp_sites;
	}

	public void resetOriginalValues() {
		_whp_sites.resetOriginalValues();
	}

	private whp_sites _whp_sites;
}