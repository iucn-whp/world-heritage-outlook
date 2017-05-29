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

import com.iucn.whp.dbservice.model.key_conservation_issues;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing key_conservation_issues in entity cache.
 *
 * @author alok.sen
 * @see key_conservation_issues
 * @generated
 */
public class key_conservation_issuesCacheModel implements CacheModel<key_conservation_issues>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{key_conservation_issues_id=");
		sb.append(key_conservation_issues_id);
		sb.append(", assessment_version_id=");
		sb.append(assessment_version_id);
		sb.append(", cn=");
		sb.append(cn);
		sb.append(", key_conservation_issues=");
		sb.append(key_conservation_issues);
		sb.append(", description=");
		sb.append(description);
		sb.append(", scale=");
		sb.append(scale);
		sb.append("}");

		return sb.toString();
	}

	public key_conservation_issues toEntityModel() {
		key_conservation_issuesImpl key_conservation_issuesImpl = new key_conservation_issuesImpl();

		key_conservation_issuesImpl.setKey_conservation_issues_id(key_conservation_issues_id);
		key_conservation_issuesImpl.setAssessment_version_id(assessment_version_id);

		if (cn == null) {
			key_conservation_issuesImpl.setCn(StringPool.BLANK);
		}
		else {
			key_conservation_issuesImpl.setCn(cn);
		}

		if (key_conservation_issues == null) {
			key_conservation_issuesImpl.setKey_conservation_issues(StringPool.BLANK);
		}
		else {
			key_conservation_issuesImpl.setKey_conservation_issues(key_conservation_issues);
		}

		if (description == null) {
			key_conservation_issuesImpl.setDescription(StringPool.BLANK);
		}
		else {
			key_conservation_issuesImpl.setDescription(description);
		}

		key_conservation_issuesImpl.setScale(scale);

		key_conservation_issuesImpl.resetOriginalValues();

		return key_conservation_issuesImpl;
	}

	public long key_conservation_issues_id;
	public long assessment_version_id;
	public String cn;
	public String key_conservation_issues;
	public String description;
	public long scale;
}