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

import com.iucn.whp.dbservice.NoSuch_sites_external_documentsException;
import com.iucn.whp.dbservice.NoSuch_sites_mgmt_plan_stateException;
import com.iucn.whp.dbservice.model.whp_sites_external_documents;
import com.iucn.whp.dbservice.service.base.whp_sites_external_documentsLocalServiceBaseImpl;
import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;
/**
 * The implementation of the whp_sites_external_documents local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.iucn.whp.dbservice.service.whp_sites_external_documentsLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author alok.sen
 * @see com.iucn.whp.dbservice.service.base.whp_sites_external_documentsLocalServiceBaseImpl
 * @see com.iucn.whp.dbservice.service.whp_sites_external_documentsLocalServiceUtil
 */
public class whp_sites_external_documentsLocalServiceImpl
	extends whp_sites_external_documentsLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.iucn.whp.dbservice.service.whp_sites_external_documentsLocalServiceUtil} to access the whp_sites_external_documents local service.
	 */
	public whp_sites_external_documents addwhp_sites_external_documents( long siteid,String doclink,long fileentryid){
		
		try {
			whp_sites_external_documents newwhpsites_ext_docs=whp_sites_external_documentsPersistence.fetchByfileId(fileentryid);
			if(newwhpsites_ext_docs==null)
			  newwhpsites_ext_docs=whp_sites_external_documentsPersistence.create(CounterLocalServiceUtil.increment(whp_sites_external_documents.class.getName()));
			 newwhpsites_ext_docs.setSite_id(siteid);
			 newwhpsites_ext_docs.setDocument_link(doclink);
			 newwhpsites_ext_docs.setFileentryid(fileentryid);
			
			return whp_sites_external_documentsPersistence.update(newwhpsites_ext_docs, false);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}
	
	public whp_sites_external_documents removewhp_sites_external_documents(long fileentryid){
		try {
			whp_sites_external_documents whpsites_ext_docss=whp_sites_external_documentsPersistence.fetchByfileId(fileentryid);
			if(whpsites_ext_docss!=null)
			return whp_sites_external_documentsPersistence.remove(whpsites_ext_docss);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	
}