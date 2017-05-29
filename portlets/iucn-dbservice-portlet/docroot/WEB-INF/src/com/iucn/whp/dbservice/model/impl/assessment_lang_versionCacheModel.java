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

import com.iucn.whp.dbservice.model.assessment_lang_version;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing assessment_lang_version in entity cache.
 *
 * @author alok.sen
 * @see assessment_lang_version
 * @generated
 */
public class assessment_lang_versionCacheModel implements CacheModel<assessment_lang_version>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{lang_ver_id=");
		sb.append(lang_ver_id);
		sb.append(", assessmentid=");
		sb.append(assessmentid);
		sb.append(", assessment_version_id=");
		sb.append(assessment_version_id);
		sb.append(", languageid=");
		sb.append(languageid);
		sb.append(", published=");
		sb.append(published);
		sb.append(", published_date=");
		sb.append(published_date);
		sb.append("}");

		return sb.toString();
	}

	public assessment_lang_version toEntityModel() {
		assessment_lang_versionImpl assessment_lang_versionImpl = new assessment_lang_versionImpl();

		assessment_lang_versionImpl.setLang_ver_id(lang_ver_id);
		assessment_lang_versionImpl.setAssessmentid(assessmentid);
		assessment_lang_versionImpl.setAssessment_version_id(assessment_version_id);
		assessment_lang_versionImpl.setLanguageid(languageid);
		assessment_lang_versionImpl.setPublished(published);

		if (published_date == Long.MIN_VALUE) {
			assessment_lang_versionImpl.setPublished_date(null);
		}
		else {
			assessment_lang_versionImpl.setPublished_date(new Date(
					published_date));
		}

		assessment_lang_versionImpl.resetOriginalValues();

		return assessment_lang_versionImpl;
	}

	public long lang_ver_id;
	public long assessmentid;
	public long assessment_version_id;
	public long languageid;
	public boolean published;
	public long published_date;
}