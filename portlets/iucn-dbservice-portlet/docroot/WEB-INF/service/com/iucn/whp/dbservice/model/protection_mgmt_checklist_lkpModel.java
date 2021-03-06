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
 * The base model interface for the protection_mgmt_checklist_lkp service. Represents a row in the &quot;whp_protection_mgmt_checklist_lkp&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.iucn.whp.dbservice.model.impl.protection_mgmt_checklist_lkpModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.iucn.whp.dbservice.model.impl.protection_mgmt_checklist_lkpImpl}.
 * </p>
 *
 * @author alok.sen
 * @see protection_mgmt_checklist_lkp
 * @see com.iucn.whp.dbservice.model.impl.protection_mgmt_checklist_lkpImpl
 * @see com.iucn.whp.dbservice.model.impl.protection_mgmt_checklist_lkpModelImpl
 * @generated
 */
public interface protection_mgmt_checklist_lkpModel extends BaseModel<protection_mgmt_checklist_lkp> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a protection_mgmt_checklist_lkp model instance should use the {@link protection_mgmt_checklist_lkp} interface instead.
	 */

	/**
	 * Returns the primary key of this protection_mgmt_checklist_lkp.
	 *
	 * @return the primary key of this protection_mgmt_checklist_lkp
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this protection_mgmt_checklist_lkp.
	 *
	 * @param primaryKey the primary key of this protection_mgmt_checklist_lkp
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the topic_id of this protection_mgmt_checklist_lkp.
	 *
	 * @return the topic_id of this protection_mgmt_checklist_lkp
	 */
	public long getTopic_id();

	/**
	 * Sets the topic_id of this protection_mgmt_checklist_lkp.
	 *
	 * @param topic_id the topic_id of this protection_mgmt_checklist_lkp
	 */
	public void setTopic_id(long topic_id);

	/**
	 * Returns the topic of this protection_mgmt_checklist_lkp.
	 *
	 * @return the topic of this protection_mgmt_checklist_lkp
	 */
	@AutoEscape
	public String getTopic();

	/**
	 * Sets the topic of this protection_mgmt_checklist_lkp.
	 *
	 * @param topic the topic of this protection_mgmt_checklist_lkp
	 */
	public void setTopic(String topic);

	/**
	 * Returns the topic_sort of this protection_mgmt_checklist_lkp.
	 *
	 * @return the topic_sort of this protection_mgmt_checklist_lkp
	 */
	public int getTopic_sort();

	/**
	 * Sets the topic_sort of this protection_mgmt_checklist_lkp.
	 *
	 * @param topic_sort the topic_sort of this protection_mgmt_checklist_lkp
	 */
	public void setTopic_sort(int topic_sort);

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

	public int compareTo(
		protection_mgmt_checklist_lkp protection_mgmt_checklist_lkp);

	public int hashCode();

	public CacheModel<protection_mgmt_checklist_lkp> toCacheModel();

	public protection_mgmt_checklist_lkp toEscapedModel();

	public String toString();

	public String toXmlString();
}