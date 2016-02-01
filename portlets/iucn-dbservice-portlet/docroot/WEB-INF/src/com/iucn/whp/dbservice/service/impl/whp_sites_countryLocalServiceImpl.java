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
import com.iucn.whp.dbservice.service.whp_sites_countryLocalServiceUtil;
import com.iucn.whp.dbservice.service.base.whp_sites_countryLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
/**
 * The implementation of the whp_sites_country local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.iucn.whp.dbservice.service.whp_sites_countryLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author alok.sen
 * @see com.iucn.whp.dbservice.service.base.whp_sites_countryLocalServiceBaseImpl
 * @see com.iucn.whp.dbservice.service.whp_sites_countryLocalServiceUtil
 */
public class whp_sites_countryLocalServiceImpl
	extends whp_sites_countryLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.iucn.whp.dbservice.service.whp_sites_countryLocalServiceUtil} to access the whp_sites_country local service.
	 */
	/**
	 * Returns the Countries associated with the siteID.
	 *
	 * @param  
	 * @return 
	 * @throws 
	 * @throws 
	 */
	@SuppressWarnings("null")
	public List<country_lkp> getCountryBySiteCountryList(List<whp_sites_country> siteCountries)
		throws PortalException, SystemException {
		List<country_lkp> countryLkp=new ArrayList<country_lkp>();
		
		
		for (whp_sites_country siteCountry : siteCountries) {
			countryLkp.add(country_lkpPersistence.fetchByPrimaryKey(siteCountry.getCountryid()));			
		}
			
		return countryLkp;
		
	}
	
	/// Added by Sonil 
	
	public int getTotalSites(int countryid){
		
		int count=0;
		try {
			count = whp_sites_countryPersistence.countBycountryid(countryid);
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return count;
	}
	
	/// Added by Sonil
	
	public List<whp_sites_country> getSitesbyCountryId(int countryId){
		
		List<whp_sites_country> lstSites = new ArrayList<whp_sites_country>();
		try {
			lstSites = whp_sites_countryPersistence.findBycountryid(countryId);
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return lstSites;
	}

}