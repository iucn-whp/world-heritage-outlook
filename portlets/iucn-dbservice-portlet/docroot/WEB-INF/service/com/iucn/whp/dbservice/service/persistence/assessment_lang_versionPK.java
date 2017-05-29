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

package com.iucn.whp.dbservice.service.persistence;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

/**
 * @author alok.sen
 */
public class assessment_lang_versionPK implements Comparable<assessment_lang_versionPK>,
	Serializable {
	public long assessmentid;
	public long languageid;

	public assessment_lang_versionPK() {
	}

	public assessment_lang_versionPK(long assessmentid, long languageid) {
		this.assessmentid = assessmentid;
		this.languageid = languageid;
	}

	public long getAssessmentid() {
		return assessmentid;
	}

	public void setAssessmentid(long assessmentid) {
		this.assessmentid = assessmentid;
	}

	public long getLanguageid() {
		return languageid;
	}

	public void setLanguageid(long languageid) {
		this.languageid = languageid;
	}

	public int compareTo(assessment_lang_versionPK pk) {
		if (pk == null) {
			return -1;
		}

		int value = 0;

		if (assessmentid < pk.assessmentid) {
			value = -1;
		}
		else if (assessmentid > pk.assessmentid) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		if (languageid < pk.languageid) {
			value = -1;
		}
		else if (languageid > pk.languageid) {
			value = 1;
		}
		else {
			value = 0;
		}

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

		assessment_lang_versionPK pk = null;

		try {
			pk = (assessment_lang_versionPK)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		if ((assessmentid == pk.assessmentid) && (languageid == pk.languageid)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (String.valueOf(assessmentid) + String.valueOf(languageid)).hashCode();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(10);

		sb.append(StringPool.OPEN_CURLY_BRACE);

		sb.append("assessmentid");
		sb.append(StringPool.EQUAL);
		sb.append(assessmentid);

		sb.append(StringPool.COMMA);
		sb.append(StringPool.SPACE);
		sb.append("languageid");
		sb.append(StringPool.EQUAL);
		sb.append(languageid);

		sb.append(StringPool.CLOSE_CURLY_BRACE);

		return sb.toString();
	}
}