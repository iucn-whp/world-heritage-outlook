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

import com.iucn.whp.dbservice.model.potential_project_needs;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing potential_project_needs in entity cache.
 *
 * @author alok.sen
 * @see potential_project_needs
 * @generated
 */
public class potential_project_needsCacheModel implements CacheModel<potential_project_needs>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{ppn_id=");
		sb.append(ppn_id);
		sb.append(", assessment_version_id=");
		sb.append(assessment_version_id);
		sb.append(", organization_individual=");
		sb.append(organization_individual);
		sb.append(", description=");
		sb.append(description);
		sb.append(", contact_details=");
		sb.append(contact_details);
		sb.append(", projectDurationFrom=");
		sb.append(projectDurationFrom);
		sb.append(", projectDurationTo=");
		sb.append(projectDurationTo);
		sb.append("}");

		return sb.toString();
	}

	public potential_project_needs toEntityModel() {
		potential_project_needsImpl potential_project_needsImpl = new potential_project_needsImpl();

		potential_project_needsImpl.setPpn_id(ppn_id);
		potential_project_needsImpl.setAssessment_version_id(assessment_version_id);

		if (organization_individual == null) {
			potential_project_needsImpl.setOrganization_individual(StringPool.BLANK);
		}
		else {
			potential_project_needsImpl.setOrganization_individual(organization_individual);
		}

		if (description == null) {
			potential_project_needsImpl.setDescription(StringPool.BLANK);
		}
		else {
			potential_project_needsImpl.setDescription(description);
		}

		if (contact_details == null) {
			potential_project_needsImpl.setContact_details(StringPool.BLANK);
		}
		else {
			potential_project_needsImpl.setContact_details(contact_details);
		}

		if (projectDurationFrom == null) {
			potential_project_needsImpl.setProjectDurationFrom(StringPool.BLANK);
		}
		else {
			potential_project_needsImpl.setProjectDurationFrom(projectDurationFrom);
		}

		if (projectDurationTo == null) {
			potential_project_needsImpl.setProjectDurationTo(StringPool.BLANK);
		}
		else {
			potential_project_needsImpl.setProjectDurationTo(projectDurationTo);
		}

		potential_project_needsImpl.resetOriginalValues();

		return potential_project_needsImpl;
	}

	public long ppn_id;
	public long assessment_version_id;
	public String organization_individual;
	public String description;
	public String contact_details;
	public String projectDurationFrom;
	public String projectDurationTo;
}