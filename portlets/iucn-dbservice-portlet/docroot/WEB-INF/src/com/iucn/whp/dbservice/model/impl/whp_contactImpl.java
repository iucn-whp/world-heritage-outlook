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

import com.iucn.whp.dbservice.model.contact_category;

/**
 * The extended model implementation for the whp_contact service. Represents a row in the &quot;whp_whp_contact&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * Helper methods and all application logic should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.iucn.whp.dbservice.model.whp_contact} interface.
 * </p>
 *
 * @author alok.sen
 */
public class whp_contactImpl extends whp_contactBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. All methods that expect a whp_contact model instance should use the {@link com.iucn.whp.dbservice.model.whp_contact} interface instead.
	 */
	
	public contact_category contactCategory;

	

	public contact_category getContactCategory() {
		return contactCategory;
	}



	public void setContactCategory(contact_category contactCategory) {
		this.contactCategory = contactCategory;
	}



	public whp_contactImpl() {
		
	}
}