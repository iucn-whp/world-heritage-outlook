package com.iucn.contact;

import java.io.IOException;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.PortletRequestDispatcher;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import com.iucn.whp.dbservice.model.country_lkp;
import com.iucn.whp.dbservice.model.whp_contact;
import com.iucn.whp.dbservice.model.whp_sites;
import com.iucn.whp.dbservice.model.whp_sites_country;
import com.iucn.whp.dbservice.service.ClpSerializer;
import com.iucn.whp.dbservice.service.whp_contactLocalServiceUtil;
import com.iucn.whp.dbservice.service.whp_sitesLocalServiceUtil;
import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ProjectionFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.portlet.LiferayWindowState;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

public class ContactController extends MVCPortlet {
	
	public void addContactInformation(ActionRequest request, ActionResponse response)
    throws Exception {
    	try{
    		int contact_id = ParamUtil.getInteger(request, "contactID");
           	int newContactId = 0;
        	whp_contact objwhp_contact = null;
        	//whp_sites_contacts objwhp_sites_contacts = null;
        	if(contact_id>0){
        		objwhp_contact =whp_contactLocalServiceUtil.getwhp_contact(contact_id);
        	
        	}else {
        		newContactId = (int) CounterLocalServiceUtil.increment(whp_contact.class.getName());
        		//newContactId = (int) CounterLocalServiceUtil.getCounter(whp_contactClp.class.getName()).getCurrentId();
        		objwhp_contact = whp_contactLocalServiceUtil.createwhp_contact(newContactId);
        		//objwhp_sites_contacts = whp_sites_contactsLocalServiceUtil.createwhp_sites_contacts(CounterLocalServiceUtil.increment(whp_sites_contacts.class.getName()));    
        	}
        	if(objwhp_contact!=null){
        		System.out.println("new Contact id:"+newContactId +"andOld Contact Id:"+contact_id);
        		objwhp_contact.setPrefix(ParamUtil.getString(request, "Prefix"));
        		objwhp_contact.setFirst_name(ParamUtil.getString(request, "FName"));
        		objwhp_contact.setLast_name(ParamUtil.getString(request, "LName"));
        		objwhp_contact.setEmail(ParamUtil.getString(request, "email"));
        		objwhp_contact.setPosition(ParamUtil.getString(request, "position"));
        		objwhp_contact.setOrganization(ParamUtil.getString(request, "organisation"));
        		objwhp_contact.setCategoryid(ParamUtil.getInteger(request, "category"));
        		objwhp_contact.setTelephone(ParamUtil.getString(request,"telephone"));
        		objwhp_contact.setLast_updated(new Date());
        		objwhp_contact.setAddress(ParamUtil.getString(request, "address"));
        		whp_contact persisteObj=whp_contactLocalServiceUtil.addwhp_contact(objwhp_contact);
        		/*if(objwhp_sites_contacts!=null){
        			objwhp_sites_contacts.setSite_id(siteID);
        			objwhp_sites_contacts.setContactid(persisteObj.getContact_id());
            		whp_sites_contactsLocalServiceUtil.addwhp_sites_contacts(objwhp_sites_contacts);
        		}*/
        	}
            response.setWindowState(LiferayWindowState.NORMAL);
    	}catch(Exception ex){
    		System.out.println("ex---------"+ex.getCause());
    		
    	}
    	
    }
	
	
	protected String editContactJSP = "/view.jsp";
	
	
	public void serveResource(ResourceRequest resourceRequest,ResourceResponse resourceResponse) throws IOException,PortletException {
		
		
		
		String cmd = resourceRequest.getParameter("ACTION_CMD");
		
		if(cmd != null && cmd.equalsIgnoreCase("AUTOCOMPLETE")){
			autocomplete(resourceRequest, resourceResponse);
		}
		else if(cmd != null && cmd.equalsIgnoreCase("CONTACT_SEARCH")) {
			
			String jspPage = resourceRequest.getParameter("jspPageDiv");
			PortletRequestDispatcher dispatcher = getPortletContext().getRequestDispatcher(jspPage);
			dispatcher.include(resourceRequest, resourceResponse);		
				
		}
		
	}
	
	
	
	 private void autocomplete(ResourceRequest resourceRequest,ResourceResponse resourceResponse) throws IOException {


	    	JSONObject json = JSONFactoryUtil.createJSONObject();
			JSONArray results = JSONFactoryUtil.createJSONArray();
			json.put("response", results);
			
			
			String keyword = ParamUtil.getString(resourceRequest, "keys");
			String searchPattern = keyword.replace("*", "%");
			
			
				ClassLoader classLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),"portletClassLoader");

				//Dynamic query to get sites based on site name
				DynamicQuery dqGetSitesFromSiteNames = DynamicQueryFactoryUtil.forClass(whp_sites.class, "whpSites", classLoader)
					 .add(RestrictionsFactoryUtil.ilike("whpSites.name_en","%"+searchPattern+"%"));
				
				List<whp_sites> whp_sitesList=null;
				
				String base = "SELECT (whp_whp_sites.*) FROM whp_whp_sites WHERE ";
				String whereCondition="";
				whereCondition=" lower(whp_whp_sites.name_en) like '%"+ searchPattern.toLowerCase()+"%'AND  whp_whp_sites.active_=true";
				
				String sql = base+ whereCondition;
		        System.out.println("sql--"+sql);
		        try {
					whp_sitesList=whp_sitesLocalServiceUtil.getWhp_sitesByCustomQuery(sql, 0, whp_sitesLocalServiceUtil.getwhp_sitesesCount());
				} catch (PortalException e1) {
					
					e1.printStackTrace();
				} catch (SystemException e1) {
					
					e1.printStackTrace();
				}
		        
				
				
				//Dynamic queries to get sites based on country name
				DynamicQuery dqGetCountryId = DynamicQueryFactoryUtil.forClass(country_lkp.class, "countryLkp",classLoader)
				.add(RestrictionsFactoryUtil.ilike("countryLkp.name", ""+searchPattern+"%")) 
				.setProjection(ProjectionFactoryUtil.property("countryLkp.countryid")); 
				
				DynamicQuery dqGetSiteId = DynamicQueryFactoryUtil.forClass(whp_sites_country.class, "siteCountry",classLoader)
				.add(PropertyFactoryUtil.forName("siteCountry.countryid").in(dqGetCountryId))
				.setProjection(ProjectionFactoryUtil.property("siteCountry.site_id"));
				
				
				DynamicQuery dqGetSiteFromCountryName = DynamicQueryFactoryUtil.forClass(whp_sites.class, "whpSites",classLoader)
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
					
					for (whp_sites site : whp_sitesList) {
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
				
			
			
		}
	
	
}
