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
import com.iucn.whp.dbservice.model.iucn_region_country;
import com.iucn.whp.dbservice.service.country_lkpLocalServiceUtil;
import com.iucn.whp.dbservice.service.iucn_region_countryLocalServiceUtil;
import com.iucn.whp.dbservice.service.base.iucn_region_countryLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the iucn_region_country local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.iucn.whp.dbservice.service.iucn_region_countryLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author alok.sen
 * @see com.iucn.whp.dbservice.service.base.iucn_region_countryLocalServiceBaseImpl
 * @see com.iucn.whp.dbservice.service.iucn_region_countryLocalServiceUtil
 */
public class iucn_region_countryLocalServiceImpl
	extends iucn_region_countryLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.iucn.whp.dbservice.service.iucn_region_countryLocalServiceUtil} to access the iucn_region_country local service.
	 */
	
	
	/// Added by Sonil 
	
	
	public int getTotalCountriesCount(){
		
		int count=0;
		try{
			count = iucn_region_countryLocalServiceUtil.getiucn_region_countriesCount();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return count;
	}
	
	
	public List<String> getCountryName(int region_id){
		
		List<String> lstCountryNames_regions = new ArrayList<String>();
		try {
			List<iucn_region_country> lstRegion_countries = iucn_region_countryPersistence.findByiucnregionid(region_id);
			for(int index=0;index<lstRegion_countries.size();index++){
				iucn_region_country i_region_country = lstRegion_countries.get(index);
				int countryId = i_region_country.getCountryid();
				country_lkp countryObj = country_lkpLocalServiceUtil.getcountry_lkp(countryId);
				lstCountryNames_regions.add(countryObj.getName());
			}
		} catch (SystemException e) {
			e.printStackTrace();
		} catch (PortalException e) {
			e.printStackTrace();
		}
		return lstCountryNames_regions;
	}
	
	public List<country_lkp> getCountryObject(int region_id){
		
		List<country_lkp> lstCountryObject = new ArrayList<country_lkp>();
		try {
			List<iucn_region_country> lstRegion_countries = iucn_region_countryPersistence.findByiucnregionid(region_id);
			for(int index=0;index<lstRegion_countries.size();index++){
				iucn_region_country i_region_country = lstRegion_countries.get(index);
				int countryId = i_region_country.getCountryid();
				country_lkp countryObj = country_lkpLocalServiceUtil.getcountry_lkp(countryId);
				lstCountryObject.add(countryObj);
			}
		} catch (SystemException e) {
			e.printStackTrace();
		} catch (PortalException e) {
			e.printStackTrace();
		}
		return lstCountryObject;
	}
	
}