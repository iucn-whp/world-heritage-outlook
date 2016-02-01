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
import java.util.Date;
import java.util.List;

import com.iucn.whp.dbservice.NoSuch_sites_external_documentsException;
import com.iucn.whp.dbservice.NoSuch_sites_missionException;
import com.iucn.whp.dbservice.model.mission_lkp;
import com.iucn.whp.dbservice.model.whp_sites_mission;
import com.iucn.whp.dbservice.service.base.whp_sites_missionLocalServiceBaseImpl;
import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the whp_sites_mission local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.iucn.whp.dbservice.service.whp_sites_missionLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author alok.sen
 * @see com.iucn.whp.dbservice.service.base.whp_sites_missionLocalServiceBaseImpl
 * @see com.iucn.whp.dbservice.service.whp_sites_missionLocalServiceUtil
 */
public class whp_sites_missionLocalServiceImpl
	extends whp_sites_missionLocalServiceBaseImpl {
	
	
	
	public whp_sites_mission addwhp_sites_mgmt_mission(long siteid,String doclink,Date date_published,long fileentryid,int missionid,String docName){
		try {
			whp_sites_mission newwhp_sites_missiondoc=whp_sites_missionPersistence.fetchByfileId(fileentryid);
			if(newwhp_sites_missiondoc==null){
				  newwhp_sites_missiondoc=whp_sites_missionPersistence.create(CounterLocalServiceUtil.increment(whp_sites_mission.class.getName()));
			      newwhp_sites_missiondoc.setSite_id(siteid);
			      newwhp_sites_missiondoc.setDocument_link(doclink);
			      newwhp_sites_missiondoc.setDate_published(date_published);
			      newwhp_sites_missiondoc.setFileentryid(fileentryid);
			      newwhp_sites_missiondoc.setMissiontype(missionid);
			      newwhp_sites_missiondoc.setDoc_name(docName);
			      //whp_sites_missionPersistence.addmission_lkp(newwhp_sites_missiondoc.getPrimaryKey(), missionid);
			    
			}
			else{
				  newwhp_sites_missiondoc.setSite_id(siteid);
			      newwhp_sites_missiondoc.setDocument_link(doclink);
			      newwhp_sites_missiondoc.setDate_published(date_published);
			      newwhp_sites_missiondoc.setFileentryid(fileentryid);
			      newwhp_sites_missiondoc.setMissiontype(missionid);
			      newwhp_sites_missiondoc.setDoc_name(docName);
				 /*List<mission_lkp>lkpList1=new ArrayList<mission_lkp>();
				 List<mission_lkp>lkpList = whp_sites_missionPersistence.getmission_lkps(newwhp_sites_missiondoc.getPrimaryKey());
				 mission_lkp mslkp=lkpList.get(0);
				int misslkpid=mslkp.getPrimaryKey();
				mslkp.setPrimaryKey(missionid);
				lkpList1.add(mslkp);*/
				//whp_sites_missionPersistence.setmission_lkps(newwhp_sites_missiondoc.getPrimaryKey(), lkpList1);
				
				
			}
			     
			return  whp_sites_missionPersistence.update(newwhp_sites_missiondoc, false);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	
		
	}
	
	
	public whp_sites_mission removewhp_sites_mission(long fileentryid,int missionid){
		try {
			 whp_sites_mission newwhp_sites_missiondoc=whp_sites_missionPersistence.fetchByfileId(fileentryid);
			 if(newwhp_sites_missiondoc!=null){
			  //whp_sites_missionPersistence.removemission_lkp(newwhp_sites_missiondoc.getPrimaryKey(),missionid);
			   return  whp_sites_missionPersistence.remove(newwhp_sites_missiondoc);
			 }
			
			
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.iucn.whp.dbservice.service.whp_sites_missionLocalServiceUtil} to access the whp_sites_mission local service.
	 */
}