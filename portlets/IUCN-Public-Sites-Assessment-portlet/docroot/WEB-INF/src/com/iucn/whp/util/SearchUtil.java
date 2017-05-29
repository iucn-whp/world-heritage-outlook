package com.iucn.whp.util;

import com.iucn.whp.dbservice.model.country_lkp;
import com.iucn.whp.dbservice.model.whp_sites;
import com.iucn.whp.dbservice.model.whp_sites_country;
import com.iucn.whp.dbservice.service.ClpSerializer;
import com.iucn.whp.dbservice.service.whp_sitesLocalServiceUtil;
import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.*;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;




public class SearchUtil {
	
	public static List<whp_sites>getsiteList(String keyword) throws PortalException, SystemException{
		
		
		String searchPattern = keyword.replace("*", "%");
		
		ClassLoader classLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),"portletClassLoader");

		//Dynamic query to get sites based on site name
		//DynamicQuery dqGetSitesFromSiteNames = DynamicQueryFactoryUtil.forClass(whp_sites.class, "whpSites", classLoader)
		//.add(RestrictionsFactoryUtil.ilike("whpSites.name_en","%"+searchPattern+"%"));
		
	/*	
		DynamicQuery dqGetSitesFromSiteNames = DynamicQueryFactoryUtil.forClass(whp_sites.class, "whpSites",classLoader)
<<<<<<< .mine
		.add(PropertyFactoryUtil.forName("whpSites.active").eq(true))	
		.add(RestrictionsFactoryUtil.ilike("whpSites.name_en","%"+searchPattern+"%"));
=======
		.add(RestrictionsFactoryUtil.ilike("whpSites.name_en","%"+searchPattern+"%")).add(RestrictionsFactoryUtil.eq("whpSites.active", "true"));*/
		
		DynamicQuery dqGetSitesFromSiteNames = DynamicQueryFactoryUtil.forClass(whp_sites.class,"whpSites",classLoader)
		.add(PropertyFactoryUtil.forName("whpSites.active").eq(true))	 
		.add(RestrictionsFactoryUtil.ilike("whpSites.name_en","%"+searchPattern+"%"));
	
		//Dynamic queries to get sites based on country name
		DynamicQuery dqGetCountryId = DynamicQueryFactoryUtil.forClass(country_lkp.class, "countryLkp",classLoader)
		.add(RestrictionsFactoryUtil.ilike("countryLkp.name", "%"+searchPattern+"%")) 
		.setProjection(ProjectionFactoryUtil.property("countryLkp.countryid")); 
		
		DynamicQuery dqGetSiteId = DynamicQueryFactoryUtil.forClass(whp_sites_country.class, "siteCountry",classLoader)
		.add(PropertyFactoryUtil.forName("siteCountry.countryid").in(dqGetCountryId))
		.setProjection(ProjectionFactoryUtil.property("siteCountry.site_id"));
		
		
		DynamicQuery dqGetSiteFromCountryName = DynamicQueryFactoryUtil.forClass(whp_sites.class, "whpSites",classLoader)
		.add(PropertyFactoryUtil.forName("whpSites.active").eq(true))
		.add(PropertyFactoryUtil.forName("whpSites.site_id").in(dqGetSiteId));
		
		
			@SuppressWarnings("unchecked")
			List<whp_sites> sitesFromName = whp_sitesLocalServiceUtil.dynamicQuery(dqGetSitesFromSiteNames);
			@SuppressWarnings("unchecked")
			List<whp_sites> sitesFromCountry = whp_sitesLocalServiceUtil.dynamicQuery(dqGetSiteFromCountryName);
			
			Set<whp_sites> setMergedSites = new HashSet<whp_sites>(sitesFromName);
			setMergedSites.addAll(sitesFromCountry);
			
			 
			 List<whp_sites> finalresult = new ArrayList<whp_sites>(setMergedSites);
			 return finalresult;

	
}
	
}