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

import java.util.List;

import com.iucn.whp.dbservice.NoSuchadvance_query_assessmentException;
import com.iucn.whp.dbservice.NoSuchadvance_query_siteException;
import com.iucn.whp.dbservice.model.advance_query_assessment;
import com.iucn.whp.dbservice.model.advance_query_site;
import com.iucn.whp.dbservice.service.base.advance_query_siteLocalServiceBaseImpl;
import com.iucn.whp.dbservice.service.persistence.advance_query_assessmentUtil;
import com.iucn.whp.dbservice.service.persistence.advance_query_siteUtil;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the advance_query_site local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.iucn.whp.dbservice.service.advance_query_siteLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author alok.sen
 * @see com.iucn.whp.dbservice.service.base.advance_query_siteLocalServiceBaseImpl
 * @see com.iucn.whp.dbservice.service.advance_query_siteLocalServiceUtil
 */
public class advance_query_siteLocalServiceImpl
	extends advance_query_siteLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.iucn.whp.dbservice.service.advance_query_siteLocalServiceUtil} to access the advance_query_site local service.
	 */
	public List<advance_query_site> findAll() throws SystemException{
		return advance_query_siteUtil.findAll();
		
	}
	
	public List<advance_query_site> findBybase_cat_tab_name(String base_tab_name) throws SystemException{
		return advance_query_siteUtil.findBybase_cat_tab_name(base_tab_name);
		
	}
	
	public advance_query_site findBybase_cat_tab_name(long id) throws SystemException, NoSuchadvance_query_siteException{
		return advance_query_siteUtil.findByPrimaryKey(id);
		
	}
	
	public List<advance_query_site> findBybase_tab_diplay_name(String base_search_val) throws SystemException, NoSuchadvance_query_siteException{
		return advance_query_siteUtil.findBybase_tab_diplay_name(base_search_val);
		
	}
}