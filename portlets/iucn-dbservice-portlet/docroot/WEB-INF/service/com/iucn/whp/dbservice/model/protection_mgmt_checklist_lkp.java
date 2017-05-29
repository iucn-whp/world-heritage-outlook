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

import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the protection_mgmt_checklist_lkp service. Represents a row in the &quot;whp_protection_mgmt_checklist_lkp&quot; database table, with each column mapped to a property of this class.
 *
 * @author alok.sen
 * @see protection_mgmt_checklist_lkpModel
 * @see com.iucn.whp.dbservice.model.impl.protection_mgmt_checklist_lkpImpl
 * @see com.iucn.whp.dbservice.model.impl.protection_mgmt_checklist_lkpModelImpl
 * @generated
 */
public interface protection_mgmt_checklist_lkp
	extends protection_mgmt_checklist_lkpModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.iucn.whp.dbservice.model.impl.protection_mgmt_checklist_lkpImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public int getTopic_sort();

	public void setTopic_sort(int topic_sort);
}