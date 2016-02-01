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

import com.iucn.whp.dbservice.model.active_conservation_projects;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing active_conservation_projects in entity cache.
 *
 * @author alok.sen
 * @see active_conservation_projects
 * @generated
 */
public class active_conservation_projectsCacheModel implements CacheModel<active_conservation_projects>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{acpid=");
		sb.append(acpid);
		sb.append(", assessment_version_id=");
		sb.append(assessment_version_id);
		sb.append(", organization_individual=");
		sb.append(organization_individual);
		sb.append(", description=");
		sb.append(description);
		sb.append(", contact_details=");
		sb.append(contact_details);
		sb.append("}");

		return sb.toString();
	}

	public active_conservation_projects toEntityModel() {
		active_conservation_projectsImpl active_conservation_projectsImpl = new active_conservation_projectsImpl();

		active_conservation_projectsImpl.setAcpid(acpid);
		active_conservation_projectsImpl.setAssessment_version_id(assessment_version_id);

		if (organization_individual == null) {
			active_conservation_projectsImpl.setOrganization_individual(StringPool.BLANK);
		}
		else {
			active_conservation_projectsImpl.setOrganization_individual(organization_individual);
		}

		if (description == null) {
			active_conservation_projectsImpl.setDescription(StringPool.BLANK);
		}
		else {
			active_conservation_projectsImpl.setDescription(description);
		}

		if (contact_details == null) {
			active_conservation_projectsImpl.setContact_details(StringPool.BLANK);
		}
		else {
			active_conservation_projectsImpl.setContact_details(contact_details);
		}

		active_conservation_projectsImpl.resetOriginalValues();

		return active_conservation_projectsImpl;
	}

	public long acpid;
	public long assessment_version_id;
	public String organization_individual;
	public String description;
	public String contact_details;
}