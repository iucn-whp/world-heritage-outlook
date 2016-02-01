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
import com.iucn.whp.dbservice.service.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.iucn.whp.dbservice.model.conservation_outlook_rating_lkp;
import com.iucn.whp.dbservice.model.docs_customData;
import com.iucn.whp.dbservice.service.base.docs_customDataLocalServiceBaseImpl;
import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the docs_custom data local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.iucn.whp.dbservice.service.docs_customDataLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author alok.sen
 * @see com.iucn.whp.dbservice.service.base.docs_customDataLocalServiceBaseImpl
 * @see com.iucn.whp.dbservice.service.docs_customDataLocalServiceUtil
 */
public class docs_customDataLocalServiceImpl
	extends docs_customDataLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.iucn.whp.dbservice.service.docs_customDataLocalServiceUtil} to access the docs_custom data local service.
	 */
	
	public docs_customData adddocs_customData( long fileentryid,long versionid,Date publish_date,Date upload_date, String type,String category,String author)
	throws SystemException, PortalException{
		
		docs_customData newdocs_customData = docs_customDataPersistence.fetchByfileobj(fileentryid);
		if(newdocs_customData==null)
		newdocs_customData = docs_customDataPersistence.create((int)CounterLocalServiceUtil.increment(docs_customData.class.getName()));
		newdocs_customData.setFileentryid(fileentryid);
		newdocs_customData.setFileversionid(versionid);
		newdocs_customData.setAuthor(author);
		newdocs_customData.setPublish_date(publish_date);
		newdocs_customData.setUpload_date(upload_date);
		newdocs_customData.setType(type);
		newdocs_customData.setCategory(category);
		return docs_customDataPersistence.update(newdocs_customData, false);
		
	}
	
	public docs_customData adddocs_customData1( long fileentryid,long versionid,Date publish_date,Date upload_date, String type,String category,String author,String site,String com,String full_com,String copyright,String language,String title)
	throws SystemException, PortalException{
		
		docs_customData newdocs_customData = docs_customDataPersistence.fetchByfileobj(fileentryid);
		if(newdocs_customData==null)
		newdocs_customData = docs_customDataPersistence.create((int)CounterLocalServiceUtil.increment(docs_customData.class.getName()));
		newdocs_customData.setFileentryid(fileentryid);
		newdocs_customData.setFileversionid(versionid);
		newdocs_customData.setAuthor(author);
		newdocs_customData.setPublish_date(publish_date);
		newdocs_customData.setUpload_date(upload_date);
		newdocs_customData.setType(type);
		newdocs_customData.setCategory(category);
		newdocs_customData.setCom(com);
		newdocs_customData.setCopyright(copyright);
		newdocs_customData.setFull_com(full_com);
	   newdocs_customData.setLanguage(language);
	   newdocs_customData.setSite(site);
	   newdocs_customData.setTitle(title);
		return docs_customDataPersistence.update(newdocs_customData, false);
		
	}
	public docs_customData removedocs_customData(long fileentryid){
		try {
			docs_customData whp_obj=docs_customDataPersistence.fetchByfileobj(fileentryid);
			if(whp_obj!=null){

			return docs_customDataPersistence.remove(whp_obj);
			}
			
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return null;
	}

	
	public  java.util.List<docs_customData> findBypulicDate(
			java.util.Date publish_date)
			throws com.liferay.portal.kernel.exception.SystemException {
				List<docs_customData> pubdatecustobj= docs_customDataPersistence.findByfileid(publish_date);
			 return pubdatecustobj;
		}
	public  java.util.List<docs_customData> findBytype(
			String type)
			throws com.liferay.portal.kernel.exception.SystemException {
				List<docs_customData> pubdatecustobj= docs_customDataPersistence.findByfiletype(type);
			 return pubdatecustobj;
		}
	public  java.util.List<docs_customData> findBycategory(
			String category)
			throws com.liferay.portal.kernel.exception.SystemException {
				List<docs_customData> pubdatecustobj= docs_customDataPersistence.findByfilecategory(category);
			 return pubdatecustobj;
		}
	public  java.util.List<docs_customData> findByuploaddate(
			java.util.Date upload_date)
			throws com.liferay.portal.kernel.exception.SystemException {
			List<docs_customData> uploadcustobj= docs_customDataPersistence.findByfileidupload(upload_date);
			return uploadcustobj;
			}
	public java.util.List<docs_customData> findbyquery(String query,int begin,int end){
		List<docs_customData> docsList=new ArrayList<docs_customData>();
		try {
			docsList=docs_customDataFinderUtil.findByCustomQuery(query, begin, end);
		} catch (com.liferay.portal.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return docsList;
	}

	
	public docs_customData getfileEntry(long fileEntryId)
	throws PortalException, SystemException {
		
		return docs_customDataPersistence.findByFileEntryId(fileEntryId);
	
	}
}