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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.iucn.whp.dbservice.service.http.whp_sitesServiceSoap}.
 *
 * @author    alok.sen
 * @see       com.iucn.whp.dbservice.service.http.whp_sitesServiceSoap
 * @generated
 */
public class whp_sitesSoap implements Serializable {
	public static whp_sitesSoap toSoapModel(whp_sites model) {
		whp_sitesSoap soapModel = new whp_sitesSoap();

		soapModel.setSite_id(model.getSite_id());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setWdpa_id(model.getWdpa_id());
		soapModel.setUnesco_id(model.getUnesco_id());
		soapModel.setName_en(model.getName_en());
		soapModel.setName_fr(model.getName_fr());
		soapModel.setTransboundary(model.getTransboundary());
		soapModel.setInscription_date(model.getInscription_date());
		soapModel.setMixed_site(model.getMixed_site());
		soapModel.setCultural_landscape(model.getCultural_landscape());
		soapModel.setDanger_list(model.getDanger_list());
		soapModel.setArea(model.getArea());
		soapModel.setBuffer_zone(model.getBuffer_zone());
		soapModel.setBuffer_zone_area(model.getBuffer_zone_area());
		soapModel.setBoundary_modification(model.getBoundary_modification());
		soapModel.setSerial(model.getSerial());
		soapModel.setMissions(model.getMissions());
		soapModel.setSoc_reports(model.getSoc_reports());
		soapModel.setSoouv(model.getSoouv());
		soapModel.setDsocr(model.getDsocr());
		soapModel.setManagement_plan(model.getManagement_plan());
		soapModel.setMee(model.getMee());
		soapModel.setStaff(model.getStaff());
		soapModel.setStaff_update_date(model.getStaff_update_date());
		soapModel.setIndigenous_communities(model.getIndigenous_communities());
		soapModel.setPopulation(model.getPopulation());
		soapModel.setLast_updated(model.getLast_updated());
		soapModel.setCreation_date(model.getCreation_date());
		soapModel.setCreated_by(model.getCreated_by());
		soapModel.setUpdated_by(model.getUpdated_by());
		soapModel.setActive(model.getActive());
		soapModel.setThumbnailid(model.getThumbnailid());
		soapModel.setThumbnailid_small(model.getThumbnailid_small());
		soapModel.setDescription(model.getDescription());

		return soapModel;
	}

	public static whp_sitesSoap[] toSoapModels(whp_sites[] models) {
		whp_sitesSoap[] soapModels = new whp_sitesSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static whp_sitesSoap[][] toSoapModels(whp_sites[][] models) {
		whp_sitesSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new whp_sitesSoap[models.length][models[0].length];
		}
		else {
			soapModels = new whp_sitesSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static whp_sitesSoap[] toSoapModels(List<whp_sites> models) {
		List<whp_sitesSoap> soapModels = new ArrayList<whp_sitesSoap>(models.size());

		for (whp_sites model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new whp_sitesSoap[soapModels.size()]);
	}

	public whp_sitesSoap() {
	}

	public long getPrimaryKey() {
		return _site_id;
	}

	public void setPrimaryKey(long pk) {
		setSite_id(pk);
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
}