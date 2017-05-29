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
public class benefits_summaryPK implements Comparable<benefits_summaryPK>,
	Serializable {
	public long benefits_summary_id;
	public long assessment_version_id;

	public benefits_summaryPK() {
	}

	public benefits_summaryPK(long benefits_summary_id,
		long assessment_version_id) {
		this.benefits_summary_id = benefits_summary_id;
		this.assessment_version_id = assessment_version_id;
	}

	public long getBenefits_summary_id() {
		return benefits_summary_id;
	}

	public void setBenefits_summary_id(long benefits_summary_id) {
		this.benefits_summary_id = benefits_summary_id;
	}

	public long getAssessment_version_id() {
		return assessment_version_id;
	}

	public void setAssessment_version_id(long assessment_version_id) {
		this.assessment_version_id = assessment_version_id;
	}

	public int compareTo(benefits_summaryPK pk) {
		if (pk == null) {
			return -1;
		}

		int value = 0;

		if (benefits_summary_id < pk.benefits_summary_id) {
			value = -1;
		}
		else if (benefits_summary_id > pk.benefits_summary_id) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		if (assessment_version_id < pk.assessment_version_id) {
			value = -1;
		}
		else if (assessment_version_id > pk.assessment_version_id) {
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

		benefits_summaryPK pk = null;

		try {
			pk = (benefits_summaryPK)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		if ((benefits_summary_id == pk.benefits_summary_id) &&
				(assessment_version_id == pk.assessment_version_id)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (String.valueOf(benefits_summary_id) +
		String.valueOf(assessment_version_id)).hashCode();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(10);

		sb.append(StringPool.OPEN_CURLY_BRACE);

		sb.append("benefits_summary_id");
		sb.append(StringPool.EQUAL);
		sb.append(benefits_summary_id);

		sb.append(StringPool.COMMA);
		sb.append(StringPool.SPACE);
		sb.append("assessment_version_id");
		sb.append(StringPool.EQUAL);
		sb.append(assessment_version_id);

		sb.append(StringPool.CLOSE_CURLY_BRACE);

		return sb.toString();
	}
}