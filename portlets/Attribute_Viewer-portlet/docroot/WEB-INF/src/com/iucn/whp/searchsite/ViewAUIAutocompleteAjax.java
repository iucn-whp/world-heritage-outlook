package com.iucn.whp.searchsite;

	//import it.dontesta.liferay.portlet.util.ActionKeys;

	import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
	import java.util.List;
import java.util.Set;

	import javax.portlet.PortletException;
	import javax.portlet.ResourceRequest;
	import javax.portlet.ResourceResponse;

import com.iucn.whp.dbservice.model.country_lkp;
import com.iucn.whp.dbservice.model.whp_sites;
import com.iucn.whp.dbservice.model.whp_sites_country;
import com.iucn.whp.dbservice.service.ClpSerializer;
import com.iucn.whp.dbservice.service.country_lkpLocalServiceUtil;
import com.iucn.whp.dbservice.service.whp_sitesLocalServiceUtil;
import com.iucn.whp.dbservice.service.whp_sites_countryLocalServiceUtil;
import com.iucn.whp.searchsite.util.ActionKeys;
import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
	import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactory;
	import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ProjectionFactoryUtil;
	import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
	import com.liferay.portal.kernel.dao.search.DisplayTerms;
	import com.liferay.portal.kernel.exception.PortalException;
	import com.liferay.portal.kernel.exception.SystemException;
	import com.liferay.portal.kernel.json.JSONArray;
	import com.liferay.portal.kernel.json.JSONFactoryUtil;
	import com.liferay.portal.kernel.json.JSONObject;
	import com.liferay.portal.kernel.log.Log;
	import com.liferay.portal.kernel.log.LogFactoryUtil;
	import com.liferay.portal.kernel.util.Constants;
	import com.liferay.portal.kernel.util.DigesterUtil;
	import com.liferay.portal.kernel.util.ParamUtil;
	import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
	import com.liferay.portal.kernel.util.Validator;
	import com.liferay.portal.model.Role;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portlet.documentlibrary.util.DLUtil;
import com.liferay.portlet.documentlibrary.service.DLAppServiceUtil;
import com.liferay.portal.kernel.repository.model.FileEntry;
//import it.dontesta.liferay.portlet.sugarcrm.data.model.Account;
	//import it.dontesta.liferay.portlet.sugarcrm.services.SugarCRMServiceUtil;

	import com.liferay.portal.service.RoleLocalServiceUtil;
	import com.liferay.portal.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

	/**
	 * @author Alok Sen
	 *
	 */
	public class ViewAUIAutocompleteAjax extends MVCPortlet {

		/* (non-Javadoc)
		 * @see com.liferay.util.bridges.mvc.MVCPortlet#serveResource(javax.portlet.ResourceRequest, javax.portlet.ResourceResponse)
		 */
		@Override
		public void serveResource(ResourceRequest resourceRequest,
				ResourceResponse resourceResponse) throws IOException,
				PortletException {
			
			/*if (_log.isInfoEnabled()) {
				_log.info("Call " + "it.dontesta.liferay.portlet.ViewAUIAutocompleteAjax.serveResource(ResourceRequest, ResourceResponse)");
			}*/
			
			/*com.liferay.portal.model.User lfrUser = null;
			try {
				lfrUser = PortalUtil.getUser(resourceRequest);
			} catch (PortalException e1) {
				if (_log.isErrorEnabled()) {
					_log.error(e1.getMessage());
				}
			} catch (SystemException e1) {
				if (_log.isErrorEnabled()) {
					_log.error(e1.getMessage());
				}
			}*/
			
			JSONObject json = JSONFactoryUtil.createJSONObject();
			JSONArray results = JSONFactoryUtil.createJSONArray();
			json.put("response", results);
			
			String cmd = ParamUtil.getString(resourceRequest, Constants.CMD);
			String keyword = ParamUtil.getString(resourceRequest, DisplayTerms.KEYWORDS);
			String searchPattern = keyword.replace("*", "%");
			
			if (cmd.equals(ActionKeys.GET_SITE)) {
				ClassLoader classLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),"portletClassLoader");

				//Dynamic query to get sites based on site name
				DynamicQuery dqGetSitesFromSiteNames = DynamicQueryFactoryUtil.forClass(whp_sites.class, "whpSites", classLoader)
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
				
				try {
					@SuppressWarnings("unchecked")
					List<whp_sites> sitesFromName = whp_sitesLocalServiceUtil.dynamicQuery(dqGetSitesFromSiteNames);
					@SuppressWarnings("unchecked")
					List<whp_sites> sitesFromCountry = whp_sitesLocalServiceUtil.dynamicQuery(dqGetSiteFromCountryName);
					
					//Merge List without duplicates
					Set<whp_sites> setMergedSites = new HashSet<whp_sites>(sitesFromName);
					setMergedSites.addAll(sitesFromCountry);
					sitesFromName.clear();
					sitesFromName.addAll(setMergedSites);
					
					for (whp_sites site : sitesFromName) {
						JSONObject listEntry = JSONFactoryUtil.createJSONObject();
						listEntry.put("key", site.getSite_id());
						listEntry.put("name", site.getName_en());
						listEntry.put("description", "test Alok");
						listEntry.put("type", "test Alok 1");
						listEntry.put("wdpaId", site.getWdpa_id());
						results.put(listEntry);
					}
					
				} catch (Exception e) {
					/*if (_log.isErrorEnabled()) {
						_log.error(e.getMessage());
					}*/
				} finally{
					json.put("response", results);
				}
				
				writeJSON(resourceRequest, resourceResponse, json);
				
			} else if(cmd.equals(ActionKeys.GET_THUMBNAIL)){
				
				String thumbnailID = ParamUtil.getString(resourceRequest, "thumbnailID");
				
				long lngThumbnailid = 0;
				if(!thumbnailID.isEmpty()){
					lngThumbnailid = Long.parseLong(thumbnailID);
				}
				
				String thumbnailUrl= "";
				if(lngThumbnailid != 0 && lngThumbnailid>0){
					ThemeDisplay themeDisplay = new ThemeDisplay();
					boolean boolExcp = false;
					try{
						if(DLAppServiceUtil.getFileEntry(lngThumbnailid)!=null){
							FileEntry fe = DLAppServiceUtil.getFileEntry(lngThumbnailid); 
							thumbnailUrl = DLUtil.getThumbnailSrc(fe, null,themeDisplay);
							boolExcp = false;
							//JSONObject jsonthumbnailObj = JSONFactoryUtil.createJSONObject();
							//jsonthumbnailObj.put("url", thumbnailUrl);
							//results.put(jsonthumbnailObj);
							
							JSONArray jsonresults = JSONFactoryUtil.createJSONArray();
							jsonresults.put(thumbnailUrl);
							writeJSON(resourceRequest, resourceResponse, jsonresults);
							
						}else{
							boolExcp = false;
							JSONArray jsonresults = JSONFactoryUtil.createJSONArray();
							jsonresults.put("");
							writeJSON(resourceRequest, resourceResponse, json);
							
				           // JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
				            
							
						}
						
					} catch(Exception e){
						boolExcp = true;
						e.printStackTrace();
					}finally{
						if(boolExcp){
							//JSONObject jsonthumbnailObj = JSONFactoryUtil.createJSONObject();
							//jsonthumbnailObj.put("url", "Not found");
							
							JSONArray jsonresults = JSONFactoryUtil.createJSONArray();
							jsonresults.put("");
							
							//JSONObject jsonNewObj = JSONFactoryUtil.createJSONObject();
							//jsonNewObj.put("responseData", jsonresults);
							
							writeJSON(resourceRequest, resourceResponse, jsonresults);
						}
					}
					
				}
			}
		}
		
	}
