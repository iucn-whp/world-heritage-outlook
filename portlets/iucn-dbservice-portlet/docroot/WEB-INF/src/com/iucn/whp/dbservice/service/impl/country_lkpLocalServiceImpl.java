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

package com.iucn.whp.dbservice.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.iucn.whp.dbservice.model.country_lkp;
import com.iucn.whp.dbservice.model.whp_sites_country;
import com.iucn.whp.dbservice.service.base.country_lkpLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the country_lkp local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.iucn.whp.dbservice.service.country_lkpLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author alok.sen
 * @see com.iucn.whp.dbservice.service.base.country_lkpLocalServiceBaseImpl
 * @see com.iucn.whp.dbservice.service.country_lkpLocalServiceUtil
 */
public class country_lkpLocalServiceImpl extends country_lkpLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.iucn.whp.dbservice.service.country_lkpLocalServiceUtil} to access the country_lkp local service.
	 */
	
	@SuppressWarnings("null")
	public List<country_lkp> getAllCountries()
		throws PortalException, SystemException {
		List<country_lkp> countryLkp=new ArrayList<country_lkp>();		
		countryLkp=country_lkpPersistence.findAll();		
		return countryLkp;
		
	}
}