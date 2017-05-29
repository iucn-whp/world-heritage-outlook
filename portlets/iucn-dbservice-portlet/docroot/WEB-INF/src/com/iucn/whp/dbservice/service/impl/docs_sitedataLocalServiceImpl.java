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
import com.iucn.whp.dbservice.model.docs_sitedata;
import com.iucn.whp.dbservice.model.whp_sites_mgmt_plan_state;
import com.iucn.whp.dbservice.service.base.docs_sitedataLocalServiceBaseImpl;
import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;


/**
 * The implementation of the docs_sitedata local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.iucn.whp.dbservice.service.docs_sitedataLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author alok.sen
 * @see com.iucn.whp.dbservice.service.base.docs_sitedataLocalServiceBaseImpl
 * @see com.iucn.whp.dbservice.service.docs_sitedataLocalServiceUtil
 */
public class docs_sitedataLocalServiceImpl
	extends docs_sitedataLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.iucn.whp.dbservice.service.docs_sitedataLocalServiceUtil} to access the docs_sitedata local service.
	 */
	public docs_sitedata adddocs_sitedata( long siteid,String doclink,Date date,long fileentryid,long fileversion,String doc_name)
	throws SystemException, PortalException{
		
		docs_sitedata docs_sitedatadocs = docs_sitedataPersistence.fetchByfileid(fileentryid);
		if(docs_sitedatadocs==null)
		docs_sitedatadocs = docs_sitedataPersistence.create(CounterLocalServiceUtil.increment(docs_sitedata.class.getName()));
		docs_sitedatadocs.setSiteid(siteid);
		docs_sitedatadocs.setDocument_link(doclink);
		docs_sitedatadocs.setDate_published(date);
		docs_sitedatadocs.setFileentryid(fileentryid);
		docs_sitedatadocs.setDoc_name(doc_name);
		return docs_sitedataPersistence.update(docs_sitedatadocs, false);

	}
	public docs_sitedata removedocs_sitedata(long fileentryid){
		docs_sitedata whp_obj=null;
		try {
			 whp_obj=docs_sitedataPersistence.fetchByfileid(fileentryid);
			if(whp_obj!=null)
			{
			    return docs_sitedataPersistence.remove(whp_obj);
			   
			}
			//System.out.println("fileid not found " + whp_obj.getPrimaryKey());
			return null;
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			//System.out.println("fileid not found exception " + whp_obj.getPrimaryKey());
			//e.printStackTrace();
			return null;
		}
	}

}