package com.iucn.whp.sites;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.PortletRequestDispatcher;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import com.iucn.whp.dbservice.model.assessing_threats_current;
import com.iucn.whp.dbservice.model.assessment_lang_version;
import com.iucn.whp.dbservice.model.benefit_checktype_lkp;
import com.iucn.whp.dbservice.model.benefits;
import com.iucn.whp.dbservice.model.conservation_outlook;
import com.iucn.whp.dbservice.model.conservation_outlook_rating_lkp;
import com.iucn.whp.dbservice.model.country_lkp;
import com.iucn.whp.dbservice.model.current_threat_assessment_cat;
import com.iucn.whp.dbservice.model.inscription_criteria_lkp;
import com.iucn.whp.dbservice.model.other_designation_lkp;
import com.iucn.whp.dbservice.model.site_assessment;
import com.iucn.whp.dbservice.model.thematic_lkp;
import com.iucn.whp.dbservice.model.threat_categories_lkp;
import com.iucn.whp.dbservice.model.threat_rating_lkp;
import com.iucn.whp.dbservice.model.threat_subcategories_lkp;
import com.iucn.whp.dbservice.model.threat_summary_overall;
import com.iucn.whp.dbservice.model.unesco_region;
import com.iucn.whp.dbservice.model.whp_sites;
import com.iucn.whp.dbservice.model.whp_sites_country;
import com.iucn.whp.dbservice.model.whp_sites_inscription_criteria;
import com.iucn.whp.dbservice.service.assessing_threats_currentLocalServiceUtil;
import com.iucn.whp.dbservice.service.assessment_lang_versionLocalServiceUtil;
import com.iucn.whp.dbservice.service.benefit_checktype_lkpLocalServiceUtil;
import com.iucn.whp.dbservice.service.benefitsLocalServiceUtil;
import com.iucn.whp.dbservice.service.conservation_outlookLocalServiceUtil;
import com.iucn.whp.dbservice.service.conservation_outlook_rating_lkpLocalServiceUtil;
import com.iucn.whp.dbservice.service.current_threat_assessment_catLocalServiceUtil;
import com.iucn.whp.dbservice.service.inscription_criteria_lkpLocalServiceUtil;
import com.iucn.whp.dbservice.service.iucn_region_countryLocalServiceUtil;
import com.iucn.whp.dbservice.service.other_designation_lkpLocalServiceUtil;
import com.iucn.whp.dbservice.service.site_assessmentLocalServiceUtil;
import com.iucn.whp.dbservice.service.thematic_lkpLocalServiceUtil;
import com.iucn.whp.dbservice.service.threat_summary_overallLocalServiceUtil;
import com.iucn.whp.dbservice.service.unesco_regionLocalServiceUtil;
import com.iucn.whp.dbservice.service.unesco_region_countryLocalServiceUtil;
import com.iucn.whp.dbservice.service.whp_sitesLocalServiceUtil;
import com.iucn.whp.dbservice.service.whp_sites_countryLocalServiceUtil;
import com.iucn.whp.dbservice.service.whp_sites_inscription_criteriaLocalServiceUtil;
import com.iucn.whp.util.ExportUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

public class SearchAction extends MVCPortlet {
	
	 String region="";
	 String criteria="";
	 String rating="";
	 String threat="";
	 String benefit="";
	 String designations="";
	 String thematic="";
	
	   List<Long> lstsiteId_region = new ArrayList<Long>();
	   List<Long> lstsiteId_rating=new ArrayList<Long>();
	   List<Long> lstsiteId_benefit=new ArrayList<Long>();
	   List<Long> lstsiteId_threat=new ArrayList<Long>();
	   List<Long> lstsiteId_criteria=new ArrayList<Long>();
	   List<Long> lstsiteId_designation=new ArrayList<Long>();
	   List<Long> lstsiteId_thematic=new ArrayList<Long>();
	   
	 public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse) throws PortletException, IOException {
	    	
		
		 
		 	String cmd = resourceRequest.getParameter("ACTION_CMD");
	    	
	    	
			if (cmd != null && cmd.equalsIgnoreCase("GETSITE")|| cmd.equalsIgnoreCase("GETCRITRIA") || cmd.equalsIgnoreCase("GETRATING") || cmd.equalsIgnoreCase("GETTHREAT") || cmd.equalsIgnoreCase("GETBENEFIT")|| cmd.equalsIgnoreCase("DESIGNATION") || cmd.equalsIgnoreCase("THEMATIC")) {
			try {
				getSitelist(resourceRequest, resourceResponse);
			} catch (SystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
			
			
			else if(cmd != null && cmd.equalsIgnoreCase("advanceSearch")) {
				String jspPage = resourceRequest.getParameter("jspPageDiv");
				PortletRequestDispatcher dispatcher = getPortletContext().getRequestDispatcher(jspPage);
				dispatcher.include(resourceRequest, resourceResponse);
			}
			
			else if(cmd != null && cmd.equalsIgnoreCase("keysearch")) {
				String jspPage = resourceRequest.getParameter("jspPage");
				PortletRequestDispatcher dispatcher = getPortletContext().getRequestDispatcher(jspPage);
				dispatcher.include(resourceRequest, resourceResponse);
			}
			
			else if(cmd != null && cmd.equalsIgnoreCase("GETPDF")) {
				
				getpdf(resourceRequest, resourceResponse);

				
			}
			
			
			
}

	



		private void getpdf(ResourceRequest resourceRequest,ResourceResponse resourceResponse) {
		
			
			ExportUtil.exportPdf( resourceRequest, resourceResponse);
			
		 	
	}

		
  
		private void getSitelist(ResourceRequest resourceRequest,ResourceResponse resourceResponse) throws SystemException
		{
			 rating = resourceRequest.getParameter("RATING");
			 benefit = resourceRequest.getParameter("BENEFIT");
			 threat = resourceRequest.getParameter("THREAT");
			 criteria = resourceRequest.getParameter("CRITERIA");
			 region = resourceRequest.getParameter("REGION");
			 designations=resourceRequest.getParameter("DESIGNATION");
			 thematic=resourceRequest.getParameter("THEMATIC");
				 
			   List<whp_sites> lstof_whp_sites = new ArrayList<whp_sites>();

			   lstsiteId_region.clear();
			   lstsiteId_rating.clear();
			   lstsiteId_threat.clear();
			   lstsiteId_benefit.clear();
			   lstsiteId_criteria.clear();
			   lstsiteId_designation.clear();
			   lstsiteId_thematic.clear();
			   
			   
			   
			 if(!region.isEmpty())
		     {
				 String[] varregion = region.split(","); 
				 
				 try
				 {
					 lstsiteId_region.clear();
					 lstsiteId_region=getListregion(varregion);
					 
				 }catch(Exception e)
				 {
					 e.printStackTrace();
				 }
				 
			 }
			
			 if(!rating.isEmpty())
		     {
				 String[] varrating = rating.split(","); 
				 
				 try
				 {
						lstsiteId_rating.clear();
						 lstsiteId_rating=getrating(varrating);
				 }
				 catch(Exception e)
				 {
					 e.printStackTrace();
				 }
				 
		     }
			
			 if(!benefit.isEmpty())
		     {
				 String[] varbenefit = benefit.split(","); 
				 
				 try
				 {
					 lstsiteId_benefit.clear();
					 lstsiteId_benefit=getbenefit(varbenefit);
					 
				 }catch(Exception e )
				 {
					 e.printStackTrace();
				 }
		     }
			 
			 if(!threat.isEmpty())
		     {
				 String[] varthreat = threat.split(",");
				 try
				 {
					 lstsiteId_threat.clear();
					 lstsiteId_threat=getthreat(varthreat);
					 
				 }catch(Exception e)
				 {
					 e.printStackTrace();
				 }
		     }
			 
			 if(!criteria.isEmpty())
		     {
				 String[] varcriteria = criteria.split(","); 
				 
				 try
				 {
					 lstsiteId_criteria.clear();
					 lstsiteId_criteria=getcritria(varcriteria);
				 }
				 catch(Exception e )
				 {
					 e.printStackTrace();
				 }
				 
		     }
			 
			 if(!designations.isEmpty())
			 {
				 String[] vardesignation = designations.split(",");
				 try
				 {
					 lstsiteId_designation.clear();
					 lstsiteId_designation=getdesignation(vardesignation);
				 }
				 catch(Exception e)
				 {
					 e.printStackTrace();
				 }
				 
			 }
			 
			 
			 if(!thematic.isEmpty())
			 {
				 
				 String[] varthematic = thematic.split(",");
				 
				try
				{
					lstsiteId_thematic.clear();
					lstsiteId_thematic=getthematic(varthematic);
					
				}catch(Exception e )
				{
					e.printStackTrace();
				}
			 }
			 
			 
			
			 
			 List<List<Long>> lists = new ArrayList<List<Long>>();
				
			 if(!lstsiteId_region.isEmpty() && lstsiteId_region.size()>0)
			  lists.add(lstsiteId_region);
			 
			 if(!lstsiteId_rating.isEmpty() && lstsiteId_rating.size()>0)
			  lists.add(lstsiteId_rating);
			 
			 if(!lstsiteId_benefit.isEmpty() && lstsiteId_benefit.size()>0)
			  lists.add(lstsiteId_benefit);
			 
			 if(!lstsiteId_threat.isEmpty() && lstsiteId_threat.size()>0)
			  lists.add(lstsiteId_threat);
			 
			 if(!lstsiteId_criteria.isEmpty() && lstsiteId_criteria.size()>0)
			  lists.add(lstsiteId_criteria);
			  	  
			 if(!lstsiteId_designation.isEmpty() && lstsiteId_designation.size()>0)
				 lists.add(lstsiteId_designation);
			 
			 if(!lstsiteId_thematic.isEmpty() && lstsiteId_thematic.size()>0)
				 lists.add(lstsiteId_thematic);

				Set<Long> siteset =getCommonElements(lists);
				List<Long> finalresult = new ArrayList<Long>(siteset);
				
				 if(rating.isEmpty() && benefit.isEmpty() && threat.isEmpty() && criteria.isEmpty() && region.isEmpty() && designations.isEmpty() && thematic.isEmpty())
				 {
					 try {
						lstof_whp_sites = whp_sitesLocalServiceUtil.getAllActiveSites();
					} catch (PortalException e) {
						
						e.printStackTrace();
					} 
					 
				 }
				 else
				 {	 
					 for(int indx=0;indx<finalresult.size();indx++)
					 {
						 whp_sites obj_whp_sites = whp_sitesLocalServiceUtil.fetchwhp_sites(finalresult.get(indx));
						 if(obj_whp_sites!=null)
						 lstof_whp_sites.add(obj_whp_sites);
					 }

				 }
				
			 
				 try
					{
					 JSONObject recordsjsonObject=JSONFactoryUtil.createJSONObject();
				   	 JSONObject cell=null;
				   	 JSONArray recordsjsonArray=JSONFactoryUtil.createJSONArray();
				   	 
				   	 String strSiteIds = "";
				   	 String strSiteNames = "";
				   	 
				   	 if(lstof_whp_sites!=null && lstof_whp_sites.size()>0)
				   	 {
				   		 cell=JSONFactoryUtil.createJSONObject();
				   		 for(int i=0;i<lstof_whp_sites.size();i++){
				   			 whp_sites tempObject=lstof_whp_sites.get(i);
				   			 if (tempObject!=null) 
				   			 {
				   				 String siteName = "";
				   				 Long siteid = 0l;
				   				 try {
				   					 siteName = tempObject.getName_en();
				   					 siteid = tempObject.getSite_id();
				   					 strSiteIds = strSiteIds + "," + siteid;
				   					 strSiteNames = strSiteNames + ","
				   					 + siteName;
				   				 } catch (Exception e) {
				   					 // TODO Auto-generated catch block
				   					 //e.printStackTrace();
				   				 }
				   			 }

				   		 }
				   		 if (!strSiteIds.isEmpty()) 
				   		 {
							String tempsite = strSiteIds.substring(1);
							cell.put("result", tempsite);
							cell.put("strSiteNames", strSiteNames);
							recordsjsonArray.put(cell);
							int size = lstof_whp_sites.size();
							String resultStr = "";
							if (size > 0) {
								resultStr = size + " record found";
								recordsjsonObject.put("search_result",
										resultStr);
								recordsjsonObject.put("rows", recordsjsonArray);
							}
						}
				   		 else
				   		 {
				   			recordsjsonObject.put("search_result","no record found.");
				   		 }
				   	 }
				   	 else
				   	 {
					   		recordsjsonObject.put("search_result","no record found.");
				   	 }
			   	 
				   	 resourceResponse.getWriter().print(recordsjsonObject.toString());

							 }catch(Exception e )
							 {
								 e.printStackTrace();
							 }
			
		}

		
		//get site of selected region
		
		private List<Long> getListregion(String[] varregion) {
			
			
			 String tempRegion[] = new String[varregion.length]; 
		  	   for (int i = 0; i < varregion.length; i++) {
		  		   tempRegion[i]=varregion[i].trim(); 
				}
	  	   
				List<String> lstversion=Arrays.asList(tempRegion);
				 List<whp_sites> lstwhp_sites = null;
				 List<Long> temp_sitelst=new ArrayList<Long>();
				
				try
		    	{
				 List<unesco_region> lstunescoregion = unesco_regionLocalServiceUtil.getAllRegionNames();
				 String UnescoId="";
					
					 for(int i=0;i<lstunescoregion.size();i++)
					 {
						 if( lstversion.contains(lstunescoregion.get(i).getName()))
							 {
							 
							 if(UnescoId.isEmpty())
								 UnescoId="'"+lstunescoregion.get(i).getUnesco_region_id()+"'";
				 	 			else
				 	 				UnescoId=UnescoId+",'"+lstunescoregion.get(i).getUnesco_region_id()+"'";
							 
							}
					 }
					
					 
					 String sql = "select distinct(wsi.site_id) from whp_whp_sites wsi"+ 
				 		" inner join whp_whp_sites_country wsc on wsc.site_id=wsi.site_id"+
				 		" inner join whp_unesco_region_country  wrc on wrc.countryid=wsc.countryid "+ "where wrc.unesco_region_id in("+UnescoId +")and wsi.active_='true' ";
					 
					 System.out.println("sql--"+sql);
			    	 String siteSql="select * from whp_whp_sites where site_id in( "+sql+")";
			 		  lstwhp_sites=whp_sitesLocalServiceUtil.getWhp_sitesByCustomQuery(siteSql,0,1000);
			 		
			 		  
			 		 if(lstwhp_sites!=null && lstwhp_sites.size()>0)
				 		{
			  	 		
					 		for(int i=0;i<lstwhp_sites.size();i++)
							 {
					 			temp_sitelst.add(lstwhp_sites.get(i).getSite_id());
							 }
			 		
				 		}else
				 		{
				 			temp_sitelst.add(0l); // added to handle no site found case
				 		}
			 		
			 		
			 		 
		    	}catch(Exception e )
		    	{
		    		e.printStackTrace();
		    	}
	  	   
			return temp_sitelst;
		
		}

		
		// get siteid of selected rating
		
		private List<Long> getrating(String[] varrating) throws SystemException {
		
			
			String tempRating[] = new String[varrating.length]; 
		 	   for (int i = 0; i < varrating.length; i++) {
		 		  tempRating[i]=varrating[i].trim(); 
				}
			
			List<String>ratinglst=Arrays.asList(tempRating);
	    	List<conservation_outlook_rating_lkp> lstconservation_outlook_rating_lkp =conservation_outlook_rating_lkpLocalServiceUtil.getAllConservationRating();
	    	List<Long> tempsitelist=new ArrayList<Long>();
			String ratingId="";

	    	try
	    	{

	    		
	    	
	    		for(int i=0;i<lstconservation_outlook_rating_lkp.size();i++)
	    		{
	    			
	    			String name=lstconservation_outlook_rating_lkp.get(i).getCo_rating();
	    			if(ratinglst.contains(name))
	    			{
	    				if(ratingId.isEmpty())
	    					ratingId="'"+lstconservation_outlook_rating_lkp.get(i).getCo_rating_id()+"'";
		 	 			else
		 	 				ratingId=ratingId+",'"+lstconservation_outlook_rating_lkp.get(i).getCo_rating_id()+"'";
	    			}
	    		}
	    		List<whp_sites> lstwhp_sites = null;
	    		
	    		String sql=	"select distinct(site_id) from whp_site_assessment wsa"+
			    			" inner join  whp_assessment_lang_version walv on walv.assessmentid = wsa.assessment_id"+
			    			" inner join  whp_conservation_outlook wco on wco.assessment_version_id = walv.assessment_version_id"+
			    			" where wco.rating in ("+ratingId+") and walv.published='true'";

	    		
	    		
	    		System.out.println("sql--"+sql);
	  	    	 String siteSql="select * from whp_whp_sites where site_id in( "+sql+")";
	  	 		
	  	 		lstwhp_sites=whp_sitesLocalServiceUtil.getWhp_sitesByCustomQuery(siteSql,0,1000);
	  	 		
	  	 		if(lstwhp_sites!=null && lstwhp_sites.size()>0)
		 		{
	  	 			for(int i=0;i<lstwhp_sites.size();i++)
		  			 {
		  	 			tempsitelist.add(lstwhp_sites.get(i).getSite_id());
		  			 }
	  	 			
		 		}else
		 		{
		 			tempsitelist.add(0l);
		 		}
	  	 		
	  	 		
	  	 		
	  	 		


	    	}
	    	catch(Exception e)
	    	{
	    		e.printStackTrace();
	    	}
	    	
			return tempsitelist;
			
			
		}
		
		// get siteid of selected benefit
		
		
		private List<Long> getbenefit(String[] varbenefit) throws PortalException, SystemException {
		
			String tempBenefit[] = new String[varbenefit.length]; 
		 	   for (int i = 0; i < varbenefit.length; i++) {
		 		  tempBenefit[i]=varbenefit[i].trim(); 
				}
			
			
			List<String> lstbenefit=Arrays.asList(tempBenefit);
	 		List<benefit_checktype_lkp> lstbenefitchktype=benefit_checktype_lkpLocalServiceUtil.findAll();
	 	    List<Long> temp_siteid=new ArrayList<Long>();
	        String benefitId="";
	 	
	 		try
	 		{
	 			for(int i=0;i<lstbenefitchktype.size();i++)
	 			{
	 				//long id=lstbenefitchktype.get(i).getBenefit_id();
	 				String name=lstbenefitchktype.get(i).getBenefit_checktype();
	 				if(lstbenefit.contains(name))
	 				{
	 					if(benefitId.isEmpty())
	 						benefitId="'"+lstbenefitchktype.get(i).getBenefit_id()+"'";
	 	 	 			else
	 	 	 				benefitId=benefitId+",'"+lstbenefitchktype.get(i).getBenefit_id()+"'";
	 				}
	 			}

	 			
	 			List<whp_sites> lstwhp_sites = null;
	 			
	 			String sql="select distinct(site_id) from whp_site_assessment wsa"+ 
	 			" inner join  whp_assessment_lang_version walv on walv.assessmentid = wsa.assessment_id"+
	 			" inner join   whp_benefits wbs on wbs.assessment_version_id = walv.assessment_version_id"+ 
	 			" where wbs.selected_benefit in ("+benefitId+") and walv.published='true'";

	 			
	 			System.out.println("sql--"+sql);
		    	 String siteSql="select * from whp_whp_sites where site_id in( "+sql+")";
		 		
		 		lstwhp_sites=whp_sitesLocalServiceUtil.getWhp_sitesByCustomQuery(siteSql,0,1000);
		 		
		 		if(lstwhp_sites!=null && lstwhp_sites.size()>0)
		 		{
		 			for(int i=0;i<lstwhp_sites.size();i++)
					 {
			 			temp_siteid.add(lstwhp_sites.get(i).getSite_id());
					 }
		 			
		 		}else
		 		{
		 			temp_siteid.add(0l);
		 		}
		 		
		 		
		 		
	 			
	 		}catch(Exception e)
	 		{
	 			e.printStackTrace();
	 		}
				return temp_siteid;
			
		}

		
		//get siteid of selected Threat
		
		
		private List<Long> getthreat(String[] varthreat) throws PortalException, SystemException {
		
			String tempThreat[] = new String[varthreat.length]; 
		 	   for (int i = 0; i < varthreat.length; i++) 
		 	   {
		 		  tempThreat[i]=varthreat[i].trim(); 
			   }
			
			List<String> lstthreat=Arrays.asList(tempThreat);
	     	List<Long> temp_sitelst=new ArrayList<Long>();
			List<threat_subcategories_lkp> lstThreatSubCategory = site_assessmentLocalServiceUtil.getAllThreatSubCategories();
			String Threatsub="";
			

	 	try
	 	{
	 	 for(int i=0;i<lstThreatSubCategory.size();i++)
			{
				
				String name=lstThreatSubCategory.get(i).getThreat_sub_category();
				if(lstthreat.contains(name))
				{
					if(Threatsub.isEmpty())
						Threatsub="'"+lstThreatSubCategory.get(i).getId()+"'";
		 			else
		 				Threatsub=Threatsub+",'"+lstThreatSubCategory.get(i).getId()+"'";
					
				}
			}
	 	 	
	 	 
	 	 
	 	 String sql="select distinct(site_id) from whp_site_assessment wsa"+
	 	 " inner join  whp_assessment_lang_version walv on walv.assessmentid = wsa.assessment_id"+
	 	 " inner join  whp_assessing_threats_current watc on watc.assessment_version_id = walv.assessment_version_id"+
	 	 " inner join  whp_current_threat_assessment_cat wcta on wcta.current_threat_id = watc.current_threat_id"+
	 	 " where wcta.sub_cat_id in ("+Threatsub+") and walv.published='true'";
	 	 
	 	 

				List<whp_sites> lstwhp_sites = null;
				System.out.println("sql--"+sql);
	 	 String siteSql="select * from whp_whp_sites where site_id in( "+sql+")";
			
			lstwhp_sites=whp_sitesLocalServiceUtil.getWhp_sitesByCustomQuery(siteSql,0,1000);
			
			
			if(lstwhp_sites!=null && lstwhp_sites.size()>0)
	 		{
			
				for(int i=0;i<lstwhp_sites.size();i++)
				 {
					temp_sitelst.add(lstwhp_sites.get(i).getSite_id());
				 }
	 		}else
	 		{
	 			temp_sitelst.add(0l);
	 		}
			
			
			
			
	 	}catch(Exception e)
	 	{
	 		e.printStackTrace();
	 	}
			
			return temp_sitelst;

		}

		
		private List<Long> getcritria(String[] varcriteria) throws PortalException, SystemException {
			

			String tempCritria[] = new String[varcriteria.length]; 
		 	   for (int i = 0; i < varcriteria.length; i++) {
		 		  tempCritria[i]=varcriteria[i].trim(); 
				}
			
			List<String>lstcritria=Arrays.asList(tempCritria);
			List<inscription_criteria_lkp> lsecriterialkp=inscription_criteria_lkpLocalServiceUtil.getAllInscriptionCriteria(); 
	    	List<Long> temp_sitelst=new ArrayList<Long>();
	    	
	    	List<whp_sites> lstwhp_sites = null;
	    	
	    	String CriteriaId="";
			

			try{
				
				for(int i=0;i<lsecriterialkp.size();i++)
				{
					
					String name=lsecriterialkp.get(i).getCriteria_desc();
					if(lstcritria.contains(name))
					{
					
						if(CriteriaId.isEmpty())
							CriteriaId="'"+lsecriterialkp.get(i).getCriteria_id()+"'";
		 	 			else
		 	 				CriteriaId=CriteriaId+",'"+lsecriterialkp.get(i).getCriteria_id()+"'";
			 	 	}
				}
			
							
				String sql ="select distinct(wsa.site_id) from  whp_whp_sites wsa"+
		    	 " inner join  whp_whp_sites_inscription_criteria  wsic on wsic.site_id=wsa.site_id"+ 
		    	 " where wsic.criteria_id in ("+CriteriaId+") and wsa.active_='true'";
				
				System.out.println("sql--"+sql);
		    	 String siteSql="select * from whp_whp_sites where site_id in( "+sql+")";
		 		
		 		lstwhp_sites=whp_sitesLocalServiceUtil.getWhp_sitesByCustomQuery(siteSql,0,1000);
		 		
		 		if(lstwhp_sites!=null && lstwhp_sites.size()>0)
				{
		 		
		 			for(int i=0;i<lstwhp_sites.size();i++)
					 {
			 			temp_sitelst.add(lstwhp_sites.get(i).getSite_id());
					 }
			 		
				}else
				{
					temp_sitelst.add(0l);
				}
		 		
		 		
		 		
				
				
				}catch(Exception e)
				{
					e.printStackTrace();
				}
					return temp_sitelst;
			
			
		}
		
		
		// get siteId of selected designation
		
		private List<Long> getdesignation(String[] vardesignation) throws PortalException, SystemException 
		{
		
			String tempDesignation[] = new String[vardesignation.length]; 
		 	   for (int i = 0; i < vardesignation.length; i++) {
		 		  tempDesignation[i]=vardesignation[i].trim(); 
				}
			
	    List<String>lsttempdesignation=Arrays.asList(tempDesignation);
	    List<other_designation_lkp> lstother_designation= other_designation_lkpLocalServiceUtil.getAllOtherDesignation();
		List<Long> temp_sitelst=new ArrayList<Long>();
	 	List<whp_sites> lstwhp_sites = null;
	 	String Designation="";
			

	 	try
	 	{
	 		
	 		for(int i=0;i<lstother_designation.size();i++)
			{
				
				String name=lstother_designation.get(i).getDesignation();
				if(lsttempdesignation.contains(name))
				{
				
					if(Designation.isEmpty())
						Designation="'"+lstother_designation.get(i).getOther_designations_id()+"'";
	 	 			else
	 	 				Designation=Designation+",'"+lstother_designation.get(i).getOther_designations_id()+"'";
		 	 	}
			}
		
	 		String sql="select distinct(ws.site_id) from whp_whp_sites ws"+
	 		            " inner join whp_whp_sites_other_designations wsod on wsod.site_id =ws.site_id"+ 
	 		            " where ws.active_='true' and wsod.other_designation_id in("+Designation+")";

	 		 String siteSql="select * from whp_whp_sites where site_id in( "+sql+")";
		 		
		 		lstwhp_sites=whp_sitesLocalServiceUtil.getWhp_sitesByCustomQuery(siteSql,0,1000);
	 		
	 		
		 		if(lstwhp_sites!=null && lstwhp_sites.size()>0)
		 		{	
		 		
		 		for(int i=0;i<lstwhp_sites.size();i++)
				 {
		 			temp_sitelst.add(lstwhp_sites.get(i).getSite_id());
				 }
	 		
		 		}
		 		else
		 		{
		 			temp_sitelst.add(0l);
		 		}
	 		
	 		
	 	}catch(Exception e )
	 	{
	 		e.printStackTrace();
	 	}
	 	
			
			return temp_sitelst;
		}

		
		
		// get siteid of selected thematic
		
		private List<Long> getthematic(String[] varthematic) throws PortalException, SystemException {

			
			
			String tempThematic[] = new String[varthematic.length]; 
		 	   for (int i = 0; i < varthematic.length; i++) {
		 		  tempThematic[i]=varthematic[i].trim(); 
				}
			
			   List<String>lsttempThematic=Arrays.asList(tempThematic);
			   List<thematic_lkp>  lstthematic_lkp=thematic_lkpLocalServiceUtil.getAllThematic();
				List<Long> temp_sitelst=new ArrayList<Long>();
				List<whp_sites> lstwhp_sites = null;
				String Thematic="";

		
				try
				{
				
					for(int i=0;i<lstthematic_lkp.size();i++)
					{
						
						String name=lstthematic_lkp.get(i).getThematic();
						if(lsttempThematic.contains(name))
						{
						
							if(Thematic.isEmpty())
								Thematic="'"+lstthematic_lkp.get(i).getThematicid()+"'";
			 	 			else
			 	 				Thematic=Thematic+",'"+lstthematic_lkp.get(i).getThematicid()+"'";
				 	 	}
					}	
					
				
					String sql="select distinct(ws.site_id) from whp_whp_sites ws"+
						" inner join whp_sites_thematic wst on wst.site_id = ws.site_id"+ 
						" where ws.active_='true' and wst.thematicid in("+Thematic+")";

			 String siteSql="select * from whp_whp_sites where site_id in( "+sql+")";
	 		
	 		lstwhp_sites=whp_sitesLocalServiceUtil.getWhp_sitesByCustomQuery(siteSql,0,1000);
			
	 		
			if(lstwhp_sites!=null && lstwhp_sites.size()>0)
			{	
	 		
				for(int i=0;i<lstwhp_sites.size();i++)
				 {
						temp_sitelst.add(lstwhp_sites.get(i).getSite_id());
				 }
			
			}else
			{
				temp_sitelst.add(0l);
			}
			
					
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			
			
			
			
			
			return temp_sitelst;
		}


		
		
				
			private Set  getCommonElements(java.util.Collection  collections) {
					
					Set common = new LinkedHashSet();
				    if (!collections.isEmpty()) {
				       Iterator<? extends java.util.Collection> iterator = collections.iterator();
				       common.addAll(iterator.next());
				       while (iterator.hasNext()) {
				          common.retainAll(iterator.next());
				       }
				    }
				    return common;
								
					}
			
			
			
	
	 public void sendmailURL(ActionRequest request, ActionResponse response)
	    throws Exception{
	

 	
 		String mailFrom=ParamUtil.getString(request, "from");
 		String mailTo=ParamUtil.getString(request, "to");
 		String message=ParamUtil.getString(request, "body");
 		String subject=ParamUtil.getString(request, "subject");
 		String username=ParamUtil.getString(request, "name");
 		
 		
 		String toname="iucn";
 		
		//add name and emailid to message body;
 		StringBuilder sb = new StringBuilder();

		sb.append("Name : ");
		sb.append(username);
		sb.append("\n");
		sb.append("Email : ");
		sb.append(mailFrom);
		sb.append("\n");
		sb.append("Subject : ");
		sb.append(subject);
		sb.append("\n");
		sb.append("Feedback : ");
		sb.append(message);
		 
		SMTPMailServiceUtil.send(username, mailFrom, toname, mailTo, subject, sb.toString());
		 

		 
		 
	 }
}