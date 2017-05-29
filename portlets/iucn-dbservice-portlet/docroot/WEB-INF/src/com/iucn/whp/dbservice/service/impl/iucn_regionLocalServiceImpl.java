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

import com.iucn.whp.dbservice.model.iucn_region;
import com.iucn.whp.dbservice.service.iucn_regionLocalServiceUtil;
import com.iucn.whp.dbservice.service.base.iucn_regionLocalServiceBaseImpl;

/**
 * The implementation of the iucn_region local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.iucn.whp.dbservice.service.iucn_regionLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author alok.sen
 * @see com.iucn.whp.dbservice.service.base.iucn_regionLocalServiceBaseImpl
 * @see com.iucn.whp.dbservice.service.iucn_regionLocalServiceUtil
 */
public class iucn_regionLocalServiceImpl extends iucn_regionLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.iucn.whp.dbservice.service.iucn_regionLocalServiceUtil} to access the iucn_region local service.
	 */
	
	//// added by Sonil for regions ..
	
	public java.util.List<iucn_region> getAllRegionNames(){
		
//		List<String> lstRegions = new ArrayList<String>();
		java.util.List<iucn_region> lst_iucn_reg = new ArrayList<iucn_region>();
		try{
			/*int regionCount = iucn_regionLocalServiceUtil.getiucn_regionsCount();
			lst_iucn_reg = iucn_regionLocalServiceUtil.getiucn_regions(1, regionCount);*/
			
			lst_iucn_reg=iucn_regionPersistence.findAll();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return lst_iucn_reg;
	}
	
	
	/*public List<String> getAllRegionNames(){
		
		List<String> lstRegions = new ArrayList<String>();
		try{
			int regionCount = iucn_regionLocalServiceUtil.getiucn_regionsCount();
			java.util.List<iucn_region> lst_iucn_reg = iucn_regionLocalServiceUtil.getiucn_regions(1, regionCount);
			
			int region_size = lst_iucn_reg.size();
			for(int k=0;k<region_size;k++){
				lstRegions.add(lst_iucn_reg.get(k).getName()); 
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return lstRegions;
	}*/

	
	
	
}