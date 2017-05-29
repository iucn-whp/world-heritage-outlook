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

import java.util.Date;

import com.iucn.whp.dbservice.NoSuch_sites_meeException;
import com.iucn.whp.dbservice.NoSuch_sites_mgmt_plan_stateException;
import com.iucn.whp.dbservice.model.whp_sites_mee;
import com.iucn.whp.dbservice.model.whp_sites_soc_reports;
import com.iucn.whp.dbservice.service.base.whp_sites_meeLocalServiceBaseImpl;
import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the whp_sites_mee local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.iucn.whp.dbservice.service.whp_sites_meeLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author alok.sen
 * @see com.iucn.whp.dbservice.service.base.whp_sites_meeLocalServiceBaseImpl
 * @see com.iucn.whp.dbservice.service.whp_sites_meeLocalServiceUtil
 */
public class whp_sites_meeLocalServiceImpl
	extends whp_sites_meeLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.iucn.whp.dbservice.service.whp_sites_meeLocalServiceUtil} to access the whp_sites_mee local service.
	 */
	public whp_sites_mee addwhp_sites_mee( long siteid,String doclink,Date date,long fileentryid,String docName)
	throws SystemException, PortalException{
		
		whp_sites_mee whp_sites_meedocs = whp_sites_meePersistence.fetchByfileId(fileentryid);
		if(whp_sites_meedocs==null)
	    whp_sites_meedocs = whp_sites_meePersistence.create(CounterLocalServiceUtil.increment(whp_sites_mee.class.getName()));
		whp_sites_meedocs.setSite_id(siteid);
		whp_sites_meedocs.setDocument_link(doclink);
		whp_sites_meedocs.setDate_published(date);
		whp_sites_meedocs.setFileentryid(fileentryid);
		whp_sites_meedocs.setDoc_name(docName);
		return whp_sites_meePersistence.update(whp_sites_meedocs, false);
		
	}
	
	
	public whp_sites_mee removewhp_sites_mee(long fileentryid){
		try {
			whp_sites_mee whp_obj=whp_sites_meePersistence.fetchByfileId(fileentryid);
			if(whp_obj!=null){
//				System.out.println("fileid found " + whp_obj.getPrimaryKey());
//				System.out.println("fileid found " + whp_obj.getDocument_link());
//				System.out.println("fileid found " + whp_obj.getFileentryid());
//				System.out.println("fileid found " + whp_obj.getSite_id());
//				System.out.println("fileid found " + whp_obj.getModelClassName());
//				System.out.println("fileid found " + whp_obj.getWhp_sites_mee_id());
//				System.out.println("fileid found " + whp_obj.getDate_published());
			return whp_sites_meePersistence.remove(whp_obj);
			}
			//whp_sites_mgmt_plan_statePersistence.update(whp_sites_obj, true);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return null;
	}
}