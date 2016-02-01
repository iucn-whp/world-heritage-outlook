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

package com.iucn.whp.dbservice.model.impl;

import com.iucn.whp.dbservice.model.whp_sites;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing whp_sites in entity cache.
 *
 * @author alok.sen
 * @see whp_sites
 * @generated
 */
public class whp_sitesCacheModel implements CacheModel<whp_sites>, Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(71);

		sb.append("{site_id=");
		sb.append(site_id);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", wdpa_id=");
		sb.append(wdpa_id);
		sb.append(", unesco_id=");
		sb.append(unesco_id);
		sb.append(", name_en=");
		sb.append(name_en);
		sb.append(", name_fr=");
		sb.append(name_fr);
		sb.append(", transboundary=");
		sb.append(transboundary);
		sb.append(", inscription_date=");
		sb.append(inscription_date);
		sb.append(", mixed_site=");
		sb.append(mixed_site);
		sb.append(", cultural_landscape=");
		sb.append(cultural_landscape);
		sb.append(", danger_list=");
		sb.append(danger_list);
		sb.append(", area=");
		sb.append(area);
		sb.append(", buffer_zone=");
		sb.append(buffer_zone);
		sb.append(", buffer_zone_area=");
		sb.append(buffer_zone_area);
		sb.append(", boundary_modification=");
		sb.append(boundary_modification);
		sb.append(", serial=");
		sb.append(serial);
		sb.append(", missions=");
		sb.append(missions);
		sb.append(", soc_reports=");
		sb.append(soc_reports);
		sb.append(", soouv=");
		sb.append(soouv);
		sb.append(", dsocr=");
		sb.append(dsocr);
		sb.append(", management_plan=");
		sb.append(management_plan);
		sb.append(", mee=");
		sb.append(mee);
		sb.append(", staff=");
		sb.append(staff);
		sb.append(", staff_update_date=");
		sb.append(staff_update_date);
		sb.append(", indigenous_communities=");
		sb.append(indigenous_communities);
		sb.append(", population=");
		sb.append(population);
		sb.append(", last_updated=");
		sb.append(last_updated);
		sb.append(", creation_date=");
		sb.append(creation_date);
		sb.append(", created_by=");
		sb.append(created_by);
		sb.append(", updated_by=");
		sb.append(updated_by);
		sb.append(", active=");
		sb.append(active);
		sb.append(", thumbnailid=");
		sb.append(thumbnailid);
		sb.append(", thumbnailid_small=");
		sb.append(thumbnailid_small);
		sb.append(", description=");
		sb.append(description);
		sb.append("}");

		return sb.toString();
	}

	public whp_sites toEntityModel() {
		whp_sitesImpl whp_sitesImpl = new whp_sitesImpl();

		whp_sitesImpl.setSite_id(site_id);
		whp_sitesImpl.setGroupId(groupId);
		whp_sitesImpl.setCompanyId(companyId);
		whp_sitesImpl.setWdpa_id(wdpa_id);
		whp_sitesImpl.setUnesco_id(unesco_id);

		if (name_en == null) {
			whp_sitesImpl.setName_en(StringPool.BLANK);
		}
		else {
			whp_sitesImpl.setName_en(name_en);
		}

		if (name_fr == null) {
			whp_sitesImpl.setName_fr(StringPool.BLANK);
		}
		else {
			whp_sitesImpl.setName_fr(name_fr);
		}

		whp_sitesImpl.setTransboundary(transboundary);

		if (inscription_date == Long.MIN_VALUE) {
			whp_sitesImpl.setInscription_date(null);
		}
		else {
			whp_sitesImpl.setInscription_date(new Date(inscription_date));
		}

		whp_sitesImpl.setMixed_site(mixed_site);
		whp_sitesImpl.setCultural_landscape(cultural_landscape);
		whp_sitesImpl.setDanger_list(danger_list);
		whp_sitesImpl.setArea(area);
		whp_sitesImpl.setBuffer_zone(buffer_zone);
		whp_sitesImpl.setBuffer_zone_area(buffer_zone_area);
		whp_sitesImpl.setBoundary_modification(boundary_modification);
		whp_sitesImpl.setSerial(serial);
		whp_sitesImpl.setMissions(missions);
		whp_sitesImpl.setSoc_reports(soc_reports);
		whp_sitesImpl.setSoouv(soouv);
		whp_sitesImpl.setDsocr(dsocr);
		whp_sitesImpl.setManagement_plan(management_plan);
		whp_sitesImpl.setMee(mee);
		whp_sitesImpl.setStaff(staff);

		if (staff_update_date == Long.MIN_VALUE) {
			whp_sitesImpl.setStaff_update_date(null);
		}
		else {
			whp_sitesImpl.setStaff_update_date(new Date(staff_update_date));
		}

		whp_sitesImpl.setIndigenous_communities(indigenous_communities);
		whp_sitesImpl.setPopulation(population);

		if (last_updated == Long.MIN_VALUE) {
			whp_sitesImpl.setLast_updated(null);
		}
		else {
			whp_sitesImpl.setLast_updated(new Date(last_updated));
		}

		if (creation_date == Long.MIN_VALUE) {
			whp_sitesImpl.setCreation_date(null);
		}
		else {
			whp_sitesImpl.setCreation_date(new Date(creation_date));
		}

		whp_sitesImpl.setCreated_by(created_by);
		whp_sitesImpl.setUpdated_by(updated_by);
		whp_sitesImpl.setActive(active);
		whp_sitesImpl.setThumbnailid(thumbnailid);
		whp_sitesImpl.setThumbnailid_small(thumbnailid_small);

		if (description == null) {
			whp_sitesImpl.setDescription(StringPool.BLANK);
		}
		else {
			whp_sitesImpl.setDescription(description);
		}

		whp_sitesImpl.resetOriginalValues();

		return whp_sitesImpl;
	}

	public long site_id;
	public long groupId;
	public long companyId;
	public long wdpa_id;
	public long unesco_id;
	public String name_en;
	public String name_fr;
	public boolean transboundary;
	public long inscription_date;
	public boolean mixed_site;
	public boolean cultural_landscape;
	public boolean danger_list;
	public double area;
	public boolean buffer_zone;
	public double buffer_zone_area;
	public boolean boundary_modification;
	public boolean serial;
	public boolean missions;
	public boolean soc_reports;
	public boolean soouv;
	public boolean dsocr;
	public boolean management_plan;
	public boolean mee;
	public long staff;
	public long staff_update_date;
	public boolean indigenous_communities;
	public long population;
	public long last_updated;
	public long creation_date;
	public long created_by;
	public long updated_by;
	public boolean active;
	public long thumbnailid;
	public long thumbnailid_small;
	public String description;
}