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

import com.iucn.whp.dbservice.model.iucn_region;
import com.iucn.whp.dbservice.model.unesco_region;
import com.iucn.whp.dbservice.service.base.unesco_regionLocalServiceBaseImpl;

/**
 * The implementation of the unesco_region local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.iucn.whp.dbservice.service.unesco_regionLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author alok.sen
 * @see com.iucn.whp.dbservice.service.base.unesco_regionLocalServiceBaseImpl
 * @see com.iucn.whp.dbservice.service.unesco_regionLocalServiceUtil
 */
public class unesco_regionLocalServiceImpl
	extends unesco_regionLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.iucn.whp.dbservice.service.unesco_regionLocalServiceUtil} to access the unesco_region local service.
	 */
	public java.util.List<unesco_region> getAllRegionNames(){
		
//		List<String> lstRegions = new ArrayList<String>();
		java.util.List<unesco_region> lst_unesco_reg = new ArrayList<unesco_region>();
		try{
			/*int regionCount = iucn_regionLocalServiceUtil.getiucn_regionsCount();
			lst_iucn_reg = iucn_regionLocalServiceUtil.getiucn_regions(1, regionCount);*/
			
			lst_unesco_reg=unesco_regionPersistence.findAll();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return lst_unesco_reg;
	}
}