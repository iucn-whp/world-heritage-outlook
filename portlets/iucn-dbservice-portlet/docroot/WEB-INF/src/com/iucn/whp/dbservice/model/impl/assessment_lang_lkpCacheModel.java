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

import com.iucn.whp.dbservice.model.assessment_lang_lkp;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing assessment_lang_lkp in entity cache.
 *
 * @author alok.sen
 * @see assessment_lang_lkp
 * @generated
 */
public class assessment_lang_lkpCacheModel implements CacheModel<assessment_lang_lkp>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{languageid=");
		sb.append(languageid);
		sb.append(", languagecode=");
		sb.append(languagecode);
		sb.append(", languagename=");
		sb.append(languagename);
		sb.append("}");

		return sb.toString();
	}

	public assessment_lang_lkp toEntityModel() {
		assessment_lang_lkpImpl assessment_lang_lkpImpl = new assessment_lang_lkpImpl();

		assessment_lang_lkpImpl.setLanguageid(languageid);

		if (languagecode == null) {
			assessment_lang_lkpImpl.setLanguagecode(StringPool.BLANK);
		}
		else {
			assessment_lang_lkpImpl.setLanguagecode(languagecode);
		}

		if (languagename == null) {
			assessment_lang_lkpImpl.setLanguagename(StringPool.BLANK);
		}
		else {
			assessment_lang_lkpImpl.setLanguagename(languagename);
		}

		assessment_lang_lkpImpl.resetOriginalValues();

		return assessment_lang_lkpImpl;
	}

	public long languageid;
	public String languagecode;
	public String languagename;
}