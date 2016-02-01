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
 * The extended model interface for the whp_contact service. Represents a row in the &quot;whp_whp_contact&quot; database table, with each column mapped to a property of this class.
 *
 * @author alok.sen
 * @see whp_contactModel
 * @see com.iucn.whp.dbservice.model.impl.whp_contactImpl
 * @see com.iucn.whp.dbservice.model.impl.whp_contactModelImpl
 * @generated
 */
public interface whp_contact extends whp_contactModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.iucn.whp.dbservice.model.impl.whp_contactImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public com.iucn.whp.dbservice.model.contact_category getContactCategory();

	public void setContactCategory(
		com.iucn.whp.dbservice.model.contact_category contactCategory);
}