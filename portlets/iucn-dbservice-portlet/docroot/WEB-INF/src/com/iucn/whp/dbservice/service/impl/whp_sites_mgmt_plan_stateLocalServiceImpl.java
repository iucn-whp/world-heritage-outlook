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

import com.iucn.whp.dbservice.NoSuch_sites_mgmt_plan_stateException;
import com.iucn.whp.dbservice.model.whp_sites_mgmt_plan_state;
import com.iucn.whp.dbservice.service.base.whp_sites_mgmt_plan_stateLocalServiceBaseImpl;
import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;


/**
 * The implementation of the whp_sites_mgmt_plan_state local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.iucn.whp.dbservice.service.whp_sites_mgmt_plan_stateLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author alok.sen
 * @see com.iucn.whp.dbservice.service.base.whp_sites_mgmt_plan_stateLocalServiceBaseImpl
 * @see com.iucn.whp.dbservice.service.whp_sites_mgmt_plan_stateLocalServiceUtil
 */
public class whp_sites_mgmt_plan_stateLocalServiceImpl
	extends whp_sites_mgmt_plan_stateLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.iucn.whp.dbservice.service.whp_sites_mgmt_plan_stateLocalServiceUtil} to access the whp_sites_mgmt_plan_state local service.
	 */
	public whp_sites_mgmt_plan_state addwhp_sites_mgmt_plan_state( long siteid,String doclink,Date date_published,long fileentryid,String docName){
		
		try {
			whp_sites_mgmt_plan_state newwhpsites_ext_docs =whp_sites_mgmt_plan_statePersistence.fetchByfileId(fileentryid);
			if(newwhpsites_ext_docs==null)
			newwhpsites_ext_docs=whp_sites_mgmt_plan_statePersistence.create(CounterLocalServiceUtil.increment(whp_sites_mgmt_plan_state.class.getName()));
			 newwhpsites_ext_docs.setSite_id(siteid);
				 newwhpsites_ext_docs.setDocument_link(doclink);
				 newwhpsites_ext_docs.setDate_published(date_published);
				 newwhpsites_ext_docs.setFileentryid(fileentryid);
				 newwhpsites_ext_docs.setDoc_name(docName);	
			
			
			return whp_sites_mgmt_plan_statePersistence.update(newwhpsites_ext_docs, false);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("check for docs null exception");
			e.printStackTrace();
			return null;
		}
		
	}
	public whp_sites_mgmt_plan_state removewhp_sites_mgmt_plan_state(long fileentryid){
		whp_sites_mgmt_plan_state whp_obj=null;
		try {
			 whp_obj=whp_sites_mgmt_plan_statePersistence.findByfileId(fileentryid);
			if(whp_obj!=null)
			{
//				System.out.println("fileid found " + whp_obj.getPrimaryKey());
//				System.out.println("fileid found " + whp_obj.getDocument_link());
//				System.out.println("fileid found " + whp_obj.getFileentryid());
//				System.out.println("fileid found " + whp_obj.getSite_id());
//				System.out.println("fileid found " + whp_obj.getModelClassName());
//				System.out.println("fileid found " + whp_obj.getWhp_sites_mgmt_plan_state_id());
//				System.out.println("fileid found " + whp_obj.getDate_published());
			    return whp_sites_mgmt_plan_statePersistence.remove(whp_obj);
			   
			}
			//System.out.println("fileid not found " + whp_obj.getPrimaryKey());
			return null;
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			//System.out.println("fileid not found exception " + whp_obj.getPrimaryKey());
			//e.printStackTrace();
			return null;
		} catch (NoSuch_sites_mgmt_plan_stateException e) {
			//System.out.println("fileid not found exception " + whp_obj.getPrimaryKey());
			// TODO Auto-generated catch block
			//e.printStackTrace();
			return null;
		}
		
	}

}