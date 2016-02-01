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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the prot_mgmt_best_practices service. Represents a row in the &quot;whp_prot_mgmt_best_practices&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.iucn.whp.dbservice.model.impl.prot_mgmt_best_practicesModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.iucn.whp.dbservice.model.impl.prot_mgmt_best_practicesImpl}.
 * </p>
 *
 * @author alok.sen
 * @see prot_mgmt_best_practices
 * @see com.iucn.whp.dbservice.model.impl.prot_mgmt_best_practicesImpl
 * @see com.iucn.whp.dbservice.model.impl.prot_mgmt_best_practicesModelImpl
 * @generated
 */
public interface prot_mgmt_best_practicesModel extends BaseModel<prot_mgmt_best_practices> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a prot_mgmt_best_practices model instance should use the {@link prot_mgmt_best_practices} interface instead.
	 */

	/**
	 * Returns the primary key of this prot_mgmt_best_practices.
	 *
	 * @return the primary key of this prot_mgmt_best_practices
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this prot_mgmt_best_practices.
	 *
	 * @param primaryKey the primary key of this prot_mgmt_best_practices
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the best_practice_id of this prot_mgmt_best_practices.
	 *
	 * @return the best_practice_id of this prot_mgmt_best_practices
	 */
	public long getBest_practice_id();

	/**
	 * Sets the best_practice_id of this prot_mgmt_best_practices.
	 *
	 * @param best_practice_id the best_practice_id of this prot_mgmt_best_practices
	 */
	public void setBest_practice_id(long best_practice_id);

	/**
	 * Returns the assessment_version_id of this prot_mgmt_best_practices.
	 *
	 * @return the assessment_version_id of this prot_mgmt_best_practices
	 */
	public long getAssessment_version_id();

	/**
	 * Sets the assessment_version_id of this prot_mgmt_best_practices.
	 *
	 * @param assessment_version_id the assessment_version_id of this prot_mgmt_best_practices
	 */
	public void setAssessment_version_id(long assessment_version_id);

	/**
	 * Returns the description of this prot_mgmt_best_practices.
	 *
	 * @return the description of this prot_mgmt_best_practices
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this prot_mgmt_best_practices.
	 *
	 * @param description the description of this prot_mgmt_best_practices
	 */
	public void setDescription(String description);

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public Serializable getPrimaryKeyObj();

	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(prot_mgmt_best_practices prot_mgmt_best_practices);

	public int hashCode();

	public CacheModel<prot_mgmt_best_practices> toCacheModel();

	public prot_mgmt_best_practices toEscapedModel();

	public String toString();

	public String toXmlString();
}