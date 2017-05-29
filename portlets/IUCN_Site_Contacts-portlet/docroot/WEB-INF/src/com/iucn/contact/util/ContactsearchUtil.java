package com.iucn.contact.util;

import java.util.List;

import com.iucn.whp.dbservice.model.country_lkp;
import com.iucn.whp.dbservice.model.whp_contact;
import com.iucn.whp.dbservice.model.whp_sites;
import com.iucn.whp.dbservice.model.whp_sites_contacts;
import com.iucn.whp.dbservice.model.whp_sites_country;
import com.iucn.whp.dbservice.service.ClpSerializer;
import com.iucn.whp.dbservice.service.whp_contactLocalServiceUtil;
import com.iucn.whp.dbservice.service.whp_sitesLocalServiceUtil;
import com.iucn.whp.dbservice.service.whp_sites_contactsLocalServiceUtil;
import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ProjectionFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;


public class ContactsearchUtil {
	
	
	
	
	public static List<whp_contact> getContactBySitename(String  sitename) throws PortalException, SystemException{
	
	
	    List<whp_contact> lstwhp_contact=null;
    
  
		ClassLoader classLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),"portletClassLoader");
		
		/*DynamicQuery dqGetcontactId = DynamicQueryFactoryUtil.forClass(whp_sites_contacts.class,"whpsitescontacts",classLoader).add(PropertyFactoryUtil.forName("site_id").eq(siteid))
		.setProjection(ProjectionFactoryUtil.property("whpsitescontacts.contactid"));
		 		 
		

		DynamicQuery dqGetSiteId = DynamicQueryFactoryUtil.forClass(whp_contact.class, "whpcontact",classLoader)
		.add(PropertyFactoryUtil.forName("whpcontact.contact_id").in(dqGetcontactId));
		*/
		DynamicQuery dqGetSitesFromSiteNames = DynamicQueryFactoryUtil.forClass(whp_sites.class, "whpSites", classLoader)
		 .add(RestrictionsFactoryUtil.ilike("whpSites.name_en","%"+sitename+"%")).setProjection(ProjectionFactoryUtil.property("whpSites.site_id"));;
		
	    
		 DynamicQuery dqGetContactId = DynamicQueryFactoryUtil.forClass(whp_sites_contacts.class, "whpsitescontacts",classLoader)
			.add(PropertyFactoryUtil.forName("whpsitescontacts.site_id").in(dqGetSitesFromSiteNames))
			.setProjection(ProjectionFactoryUtil.property("whpsitescontacts.contactid"));
		 
		 DynamicQuery dqGetSiteId = DynamicQueryFactoryUtil.forClass(whp_contact.class, "whpcontact",classLoader)
			.add(PropertyFactoryUtil.forName("whpcontact.contact_id").in(dqGetContactId));
		 
		 
		 
		lstwhp_contact=whp_contactLocalServiceUtil.dynamicQuery(dqGetSiteId);
	    
		
	    
		return lstwhp_contact;

}

	public static List<whp_contact> getContactByType(int type) throws SystemException{
		
		
		List<whp_contact> lstwhp_contact=null;
		
		
		ClassLoader classLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),"portletClassLoader");
		
		
		
		DynamicQuery dqGetcontactId = DynamicQueryFactoryUtil.forClass(whp_contact.class, "whpcontact",classLoader)
		.add(PropertyFactoryUtil.forName("categoryid").eq(type));
		
		
		lstwhp_contact=whp_contactLocalServiceUtil.dynamicQuery(dqGetcontactId);
		
		lstwhp_contact.size();
		
		return lstwhp_contact;

}

	
	
	public static List<whp_contact> getContactByjoin(String sitename,int type) throws PortalException, SystemException{
		
		
		List<whp_contact> lstwhp_contact=null;
		
		
		ClassLoader classLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),"portletClassLoader");
		
		DynamicQuery dqGetSitesFromSiteNames = DynamicQueryFactoryUtil.forClass(whp_sites.class, "whpSites", classLoader)
		 .add(RestrictionsFactoryUtil.ilike("whpSites.name_en","%"+sitename+"%")).setProjection(ProjectionFactoryUtil.property("whpSites.site_id"));;
		
	    
		 DynamicQuery dqGetContactId = DynamicQueryFactoryUtil.forClass(whp_sites_contacts.class, "whpsitescontacts",classLoader)
			.add(PropertyFactoryUtil.forName("whpsitescontacts.site_id").in(dqGetSitesFromSiteNames))
			.setProjection(ProjectionFactoryUtil.property("whpsitescontacts.contactid"));
		 
		 DynamicQuery dqGetSiteId = DynamicQueryFactoryUtil.forClass(whp_contact.class, "whpcontact",classLoader)
			.add(PropertyFactoryUtil.forName("whpcontact.contact_id").in(dqGetContactId))
			.add(PropertyFactoryUtil.forName("categoryid").eq(type));
	
		 
		 
		
		 lstwhp_contact=whp_contactLocalServiceUtil.dynamicQuery(dqGetSiteId);
		 
		 
		return lstwhp_contact;

}

	
	
}	
	