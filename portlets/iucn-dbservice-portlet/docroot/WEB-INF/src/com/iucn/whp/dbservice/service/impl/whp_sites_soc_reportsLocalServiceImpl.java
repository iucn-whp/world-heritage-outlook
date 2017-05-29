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
import com.iucn.whp.dbservice.NoSuch_sites_soc_reportsException;
import com.iucn.whp.dbservice.model.whp_sites_mgmt_plan_state;
import com.iucn.whp.dbservice.model.whp_sites_soc_reports;
import com.iucn.whp.dbservice.service.base.whp_sites_soc_reportsLocalServiceBaseImpl;
import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the whp_sites_soc_reports local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.iucn.whp.dbservice.service.whp_sites_soc_reportsLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author alok.sen
 * @see com.iucn.whp.dbservice.service.base.whp_sites_soc_reportsLocalServiceBaseImpl
 * @see com.iucn.whp.dbservice.service.whp_sites_soc_reportsLocalServiceUtil
 */
public class whp_sites_soc_reportsLocalServiceImpl
	extends whp_sites_soc_reportsLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.iucn.whp.dbservice.service.whp_sites_soc_reportsLocalServiceUtil} to access the whp_sites_soc_reports local service.
	 */
	
	public whp_sites_soc_reports addwhp_sites_soc_reports( long siteid,String doclink,Date date_published,long fileentryid,String docName){
		
		try {
			whp_sites_soc_reports  whp_sites_soc_reportsdocs=whp_sites_soc_reportsPersistence.fetchByfileId(fileentryid);
		if(whp_sites_soc_reportsdocs==null){
		       long pkid=CounterLocalServiceUtil.increment(whp_sites_soc_reports.class.getName());
		       whp_sites_soc_reportsdocs=whp_sites_soc_reportsPersistence.create(pkid);
		}
			 whp_sites_soc_reportsdocs.setSite_id(siteid);
			 whp_sites_soc_reportsdocs.setDocument_link(doclink);
			 whp_sites_soc_reportsdocs.setDate_published(date_published);
			 whp_sites_soc_reportsdocs.setFileentryid(fileentryid);
			 whp_sites_soc_reportsdocs.setDoc_name(docName);
			
			return whp_sites_soc_reportsPersistence.update(whp_sites_soc_reportsdocs, false);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}
	
	public whp_sites_soc_reports removewhp_sites_soc_reports(long fileentryid){
		try {
			whp_sites_soc_reports whp_obj=whp_sites_soc_reportsPersistence.fetchByfileId(fileentryid);
			if(whp_obj!=null){

//				System.out.println("fileid found " + whp_obj.getPrimaryKey());
//				System.out.println("fileid found " + whp_obj.getDocument_link());
//				System.out.println("fileid found " + whp_obj.getFileentryid());
//				System.out.println("fileid found " + whp_obj.getSite_id());
//				System.out.println("fileid found " + whp_obj.getModelClassName());
//				System.out.println("fileid found " + whp_obj.getWhp_sites_soc_reports_id());
//				System.out.println("fileid found " + whp_obj.getDate_published());
			 return whp_sites_soc_reportsPersistence.remove(whp_obj);
			}
			//whp_sites_mgmt_plan_statePersistence.update(whp_sites_obj, true);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}

}