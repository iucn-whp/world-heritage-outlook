<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
<%
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
%>
<%@page import="com.liferay.portal.PortalException"%>
<%@page import="com.iucn.whp.dbservice.service.*"%>
<%@page import="com.liferay.portal.kernel.portlet.*"%>
<%@page import="com.iucn.whp.dbservice.model.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ page import="java.util.*"%>
<%@ page import="com.iucn.whp.dbservice.model.*" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@include file="/siteinfo_jsp/init.jsp" %>
<%@page import="javax.portlet.*"%>
<%@page import="com.liferay.portal.kernel.util.Validator" %>

<portlet:defineObjects />


<%
//	String assessmentCycleID=ParamUtil.getString(request, "assessmentCycle");
	String searchType=ParamUtil.getString(request, "searchType");
    int iucnRegionId=ParamUtil.getInteger(request, "iucnRegionId");
    int countryId=ParamUtil.getInteger(request, "countryID");
    String  sitename =ParamUtil.getString(request,"sitename");

    
    List<country_lkp> countryList=null;
    List<whp_sites> whp_sitesList=null;
	List<site_assessment> site_assessmentList=null;

	site_assessmentList = site_assessmentLocalServiceUtil.getAllActiveSiteAssessment();

    if(searchType.equalsIgnoreCase("advanceSearch")){
    	long[] lstSiteId = ParamUtil.getLongValues(request, "siteIds");
 	   //String lstassessmentIdstr =request.getAttribute("assessmentIdList").toString();
 	  // String[] lstassessmentId = lstassessmentIdstr.split(",");
 	   whp_sitesList = new ArrayList<whp_sites>();
 	   if(lstSiteId!=null && lstSiteId.length!=0){
    		for(long siteId:lstSiteId){
    		try {
    			whp_sites siteInfo = whp_sitesLocalServiceUtil.getSiteBySiteId(siteId);
    				if(siteInfo!=null)
    					whp_sitesList.add(siteInfo);
 			} catch (PortalException e) {
 				// TODO Auto-generated catch block
 				e.printStackTrace();
 			} catch (SystemException e) {
 				// TODO Auto-generated catch block
 				e.printStackTrace();
 			}
 		}
    	}
    }
    else if(searchType.equalsIgnoreCase("filterSearch")){
    	String startYear=ParamUtil.getString(request, "startYear");
    	String to=ParamUtil.getString(request, "to");
    	/* String yearOpt=ParamUtil.getString(request, "yearOpt"); */
    	
    	
    	String yearOpt="AND";
    		
    		
    	String criteria=ParamUtil.getString(request, "criteria");
/*     	String criteriaOpt=ParamUtil.getString(request, "criteriaOpt");
 */    	
 
         String criteriaOpt="AND";
 
    	String threat=ParamUtil.getString(request, "threat");
    	String threatOpt=ParamUtil.getString(request, "threatOpt");
    	
    	
    	String serial=resourceRequest.getParameter("serial");
/*     	String serialOpt=ParamUtil.getString(request, "serialOpt");
 */    	
 
        String serialOpt="AND";
 
 
    	
    	
    	String transboundary=resourceRequest.getParameter("transboundary");
/*     	String isTranOpt=ParamUtil.getString(request, "isTranOpt");
 */    	
           String isTranOpt="AND";	
    	
 
    	String concernOutlook=resourceRequest.getParameter("concernOutlook");
    	String isConcern=ParamUtil.getString(request, "isConcern");
    	
    	
    	String mixed=ParamUtil.getString(request, "mixed");
/*     	String isMixedOpt=ParamUtil.getString(request, "isMixedOpt");
 */    	
 
     	String isMixedOpt="AND";
 
    	
        String endangeredList=ParamUtil.getString(request, "endangeredList");
    	/* String isendangeredListOpt=ParamUtil.getString(request, "isendangeredListOpt"); */
    	
    	String isendangeredListOpt="AND";
    	
    	 List<String> andCriteria = new ArrayList<String>();
    	 List<String> orCriteria = new ArrayList<String>();
    	 
    	 //adding sites active
    	 andCriteria.add("whp_whp_sites.active_=true ");
    	 
    	 String inscription_date=" EXTRACT(year FROM whp_whp_sites.inscription_date)";
    	 if (Validator.isNotNull(startYear) && Validator.isNotNull(to)){
    		 inscription_date=inscription_date+" BETWEEN "+startYear+" AND "+to;
    	 }else if(Validator.isNotNull(startYear)){
    		 inscription_date=inscription_date+" = "+startYear;
    	 }else if(Validator.isNotNull(to)){
    		 inscription_date=inscription_date+" = "+to;
    	 }else{
    		 inscription_date=null;
    	 }
    	 
         if (Validator.isNotNull(yearOpt) && yearOpt.equalsIgnoreCase("AND") && inscription_date!=null) {
        	 andCriteria.add(inscription_date);
         }/* else if (Validator.isNotNull(yearOpt) && yearOpt.equalsIgnoreCase("OR") && inscription_date!=null){
        	 orCriteria.add(inscription_date);
         } */
         
         /* if (Validator.isNotNull(threat)) {
         	if(Validator.isNotNull(threatOpt)){
         		 if(threatOpt.equalsIgnoreCase("AND")){
         			 andCriteria.add("");
         		 }else{
         			 orCriteria.add("");
         		 }
         	 }
         	 
          } */
         
         if (Validator.isNotNull(serial)) {
          	if(Validator.isNotNull(serialOpt)){
          		 if(serialOpt.equalsIgnoreCase("AND")){
          			 andCriteria.add("whp_whp_sites.serial ="+serial);
          		 }/* else{
          			 orCriteria.add("whp_whp_sites.serial ="+serial);
          		 } */
          	 }
          	 
           }
 		  
 		  if (Validator.isNotNull(endangeredList)) {
          	if(Validator.isNotNull(isendangeredListOpt)){
          		 if(isendangeredListOpt.equalsIgnoreCase("AND")){
          			 andCriteria.add("whp_whp_sites.danger_list ="+endangeredList);
          		 }/* else{
          			 orCriteria.add("whp_whp_sites.danger_list ="+endangeredList);
          		 } */
          	 }
          	 
           }
 		 
 		  
 		  if (Validator.isNotNull(transboundary)) {
          	if(Validator.isNotNull(isTranOpt)){
          		 if(isTranOpt.equalsIgnoreCase("AND")){
          			 andCriteria.add("whp_whp_sites.transboundary ="+transboundary);
          		 }/* else{
          			 orCriteria.add("whp_whp_sites.transboundary ="+transboundary);
          		 } */
          	 }
          	 
           }
 		  
 		 if (Validator.isNotNull(mixed)) {
          	if(Validator.isNotNull(isMixedOpt)){
          		 if(isMixedOpt.equalsIgnoreCase("AND")){
          			 andCriteria.add("whp_whp_sites.mixed_site ="+mixed);
          		 }/* else{
          			 orCriteria.add("whp_whp_sites.mixed_site ="+mixed);
          		 } */
          	 }
          }
 		String join=null;
 	 	if (Validator.isNotNull(criteria)) {
 	 		join=" left join whp_whp_sites_inscription_criteria on whp_whp_sites.site_id=whp_whp_sites_inscription_criteria.site_id ";
       	 
 	 		String[] tempcriteria=criteria.split(",");
 	 		String criteriaList="";
 	 		
 	 		for(int i=0;i<tempcriteria.length;i++){
 	 			if(i==0)
 	 				criteriaList="'"+tempcriteria[i]+"'";
 	 			else
 	 				criteriaList=criteriaList+",'"+tempcriteria[i]+"'";
 	 		}
 	 		
 	 		
       	 if(Validator.isNotNull(criteriaOpt)){
       		 if(criteriaOpt.equalsIgnoreCase("AND")){
       			 andCriteria.add("whp_whp_sites_inscription_criteria.criteria_id in (select criteria_id from whp_inscription_criteria_lkp where criteria in ("+criteriaList+"))");
       		 }/* else{
       			 orCriteria.add("whp_whp_sites_inscription_criteria.criteria_id in (select criteria_id from whp_inscription_criteria_lkp where criteria in ("+criteriaList+"))");
       		 } */
       	 }
       	 
        }  		  
         
        /*  if (Validator.isNotNull(criteria)) {
        	 
        	 if(Validator.isNotNull(criteriaOpt)){
        		 if(criteriaOpt.equalsIgnoreCase("AND")){
        			 andCriteria.add("");
        		 }else{
        			 orCriteria.add("");
        		 }
        	 }
        	 
         }

		if (Validator.isNotNull(threat)) {
        	if(Validator.isNotNull(threatOpt)){
        		 if(threatOpt.equalsIgnoreCase("AND")){
        			 andCriteria.add("");
        		 }else{
        			 orCriteria.add("");
        		 }
        	 }
        	 
         } 
		if (Validator.isNotNull(concernOutlook)) {
          	if(Validator.isNotNull(isConcern)){
          		 if(serialOpt.equalsIgnoreCase("AND")){
          			 andCriteria.add("serial ="+isConcern);
          		 }else{
          			 orCriteria.add("serial ="+isConcern);
          		 }
          	 }
          	 
           }
		
		*/
		
		//creating query
		String base = "SELECT (whp_whp_sites.*) FROM whp_whp_sites ";
                   //+ "JOIN ExampleBlog_Author " +
                    //"ON ExampleBlog_Post.authorId = ExampleBlog_Author.authorId ";
       StringBuffer sqlBuilder = new StringBuffer(base);
       
       if(join!=null){
    	   sqlBuilder.append(join);
       }
       
       StringBuffer sqlBuilder_AND =null;
       StringBuffer sqlBuilder_OR = null;
         
       
         if (!andCriteria.isEmpty() && andCriteria.size()>0) {
        	 sqlBuilder_AND=new StringBuffer();
           	 sqlBuilder_AND.append(andCriteria.remove(0) + " ");
             for (String criterion : andCriteria) {
            	 sqlBuilder_AND.append(" AND "+criterion);
             }
         }
         
         if (!orCriteria.isEmpty() && orCriteria.size()>0) {
        	 sqlBuilder_OR=new StringBuffer();
        	 sqlBuilder_OR.append(orCriteria.remove(0) + " ");
             for (String criterion : orCriteria) {
            	 sqlBuilder_OR.append(" OR "+criterion);
             }
         }
         
         if(sqlBuilder_AND!=null || sqlBuilder_OR!=null){
        	 sqlBuilder.append(" WHERE ");
        	 if(sqlBuilder_AND!=null && sqlBuilder_OR!=null){
        		 sqlBuilder.append(" ( ");
        		 sqlBuilder.append(sqlBuilder_AND);
        		 sqlBuilder.append(")  ");
        		// sqlBuilder.append(sqlBuilder_OR);
        		// sqlBuilder.append(" ) ");
        	 }
        	 else if(sqlBuilder_AND!=null){
        		 sqlBuilder.append(sqlBuilder_AND);
        	 }
        	 /* else if(sqlBuilder_OR!=null){
        		 sqlBuilder.append(sqlBuilder_OR);
        	 } */
        	 
         }
         
       try{
	         String sql = sqlBuilder.toString();
	         System.out.println("sql--"+sql);
	         List<whp_sites> tempwhp_sitesList=whp_sitesLocalServiceUtil.getWhp_sitesByCustomQuery(sql, 0, whp_sitesLocalServiceUtil.getwhp_sitesesCount());
	         Map<Long,whp_sites> tempSiteMap=new HashMap<Long,whp_sites>();
	         if(tempwhp_sitesList!=null){
	        	 int size=tempwhp_sitesList.size();
	        	 whp_sitesList=new ArrayList<whp_sites>();
	        	 for(int i=0;i<size;i++){
	        		 whp_sites tempSite=tempwhp_sitesList.get(i);
	        		 long tempID=tempSite.getPrimaryKey();
	        		 if(!tempSiteMap.containsKey(tempID)){
	        			 tempSiteMap.put(tempID,tempSite);
	        			 whp_sitesList.add(tempSite);
	        		 }
	        		 
	        	 }
	        	 
	         }else{
	        	 whp_sitesList=null;
	         }
	         
 		}catch(Exception ex){
 			ex.printStackTrace();
 		}
    	
    }
    else if(searchType.equalsIgnoreCase("sitenameSearch")&& !sitename.isEmpty()){
   
    	
    
		
		List<whp_sites> lst_whp_sites = new ArrayList<whp_sites>();
		
		String base = "SELECT (whp_whp_sites.*) FROM whp_whp_sites WHERE ";
		String whereCondition="";
		if(sitename!=null || !sitename.isEmpty()){
			
			if(sitename.length()>50)
			{
				sitename=sitename.substring(0,30);
				
			}
			if (sitename.contains("'"))
			{
				sitename=sitename.replace("'","''");
			
			}
			whereCondition=" lower(whp_whp_sites.name_en) like '"+ sitename.toLowerCase()+"%' AND whp_whp_sites.active_=true";
		}
		String sql = base+ whereCondition;
        System.out.println("sql--"+sql);
        whp_sitesList=whp_sitesLocalServiceUtil.getWhp_sitesByCustomQuery(sql, 0, whp_sitesLocalServiceUtil.getwhp_sitesesCount());
        
		
    }
    
    else if(iucnRegionId>0 || countryId>0  && sitename==null ){
    	   whp_sitesList=new ArrayList<whp_sites>();
    	   countryList=new ArrayList<country_lkp>();
    	    if(countryId>0){
    	    	countryList.add(country_lkpLocalServiceUtil.getcountry_lkp(countryId));
    	    }
    	    else{
    	    	/* countryList= iucn_region_countryLocalServiceUtil.getCountryObject(iucnRegionId); */
    	    	countryList=unesco_region_countryLocalServiceUtil.getCountryObject(iucnRegionId);
    	    }



    	   			int size = countryList.size();
    				for(int i=0;i<size;i++){
    					country_lkp countryObj=countryList.get(i);
    					List<whp_sites_country> lstSites = whp_sites_countryLocalServiceUtil.getSitesbyCountryId(countryObj.getCountryid());
    		    		for(whp_sites_country site_country : lstSites){	
    						long siteId = site_country.getSite_id();
    						whp_sites whp_sites_obj = whp_sitesLocalServiceUtil.getSiteBySiteId(siteId);
    						if(whp_sites_obj.getActive())
    						whp_sitesList.add(whp_sites_obj);

    		    		}
    				}
    				
    				Collections.sort(whp_sitesList);
    }
   
    
    else if(iucnRegionId==0 || countryId>0  && sitename==null ){
    	
    	
    	whp_sitesList=new ArrayList<whp_sites>();
 	   countryList=new ArrayList<country_lkp>();
 	    if(countryId>0){
 	    	countryList.add(country_lkpLocalServiceUtil.getcountry_lkp(countryId));
 	    }
 	   
 	   			int size = countryList.size();
 				for(int i=0;i<size;i++){
 					country_lkp countryObj=countryList.get(i);
 					List<whp_sites_country> lstSites = whp_sites_countryLocalServiceUtil.getSitesbyCountryId(countryObj.getCountryid());
 		    		for(whp_sites_country site_country : lstSites){	
 						long siteId = site_country.getSite_id();
 						whp_sites whp_sites_obj = whp_sitesLocalServiceUtil.getSiteBySiteId(siteId);
 						if(whp_sites_obj.getActive())
 						whp_sitesList.add(whp_sites_obj);

 		    		}
 				}
 				
 				Collections.sort(whp_sitesList);
    	
      }
    
    else{
    	whp_sitesList= ActionUtil.getActiveSites(renderRequest);
    }
    
    
    //setting value of iterator of search container
    PortletURL whp_sitesSearchURL=null;
	try{
	    	whp_sitesSearchURL = (PortletURL)liferayPortletResponse.createRenderURL();
	  	    whp_sitesSearchURL.setParameter("jspPage", "/view.jsp");
	  	  	whp_sitesSearchURL.setParameter("isSearch", "Y");
	  	  whp_sitesSearchURL.setWindowState(WindowState.NORMAL);
	  	  
	  	 
	  	    //whp_sitesSearchURL.setParameter("cur", "1");
	  	  // actionRequest.setAttribute("cur", "1");
	  	 //whp_sitesSearchURL.setProperty("cur", "1");
	  	//whp_sitesSearchURL.addProperty("cur", "1");
	  	  
	  	   	pageContext.setAttribute("whp_sitesList", whp_sitesList,PageContext.SESSION_SCOPE);
      }catch(Exception ex){
  	  ex.getStackTrace();
  	  
    }
          
%>
<div class="formLinks">


<a href="/web/iucn/sites-data" >&lt;&lt;back</a>
<a href="javascript:viewSitePopup('/siteinfo_jsp/popups/add_basic_information.jsp','Add New Site');">+ Add new site</a>
<%
String siteIds="";
	    for(int k=0;k<whp_sitesList.size();k++){
	    	if(siteIds.equalsIgnoreCase("")){
	    		siteIds=whp_sitesList.get(k).getSite_id()+"";
	    	}else{
	    		siteIds = siteIds +","+ Long.toString(whp_sitesList.get(k).getSite_id());
	    	}
	    	
	    }
	    	
	    /* if(siteIds.endsWith(","))
	    	siteIds=siteIds.substring(0,siteIds.length()); */
        
%>
<portlet:resourceURL var="exportType">
<portlet:param name="whp_sitesList" value= "<%=siteIds %>" />
<portlet:param name="ACTION_CMD" value= "EXPORT" />
</portlet:resourceURL>
<a href="<%=exportType%>">+ Export</a>

</div>
<liferay-ui:search-container
      emptyResultsMessage="there-are-no-Sites" iteratorURL="<%=whp_sitesSearchURL %>"  
      delta="5">

    <liferay-ui:search-container-results>
    <%
    List<whp_sites> tempResults = whp_sitesList;
	int cur=1;
    if(tempResults!=null){
    	//searchContainer.
    	results = ListUtil.subList(
    	        tempResults, searchContainer.getStart(), searchContainer.getEnd());
    	    total = tempResults.size();
    }else{
    		results = null;
    	    total = 0;
    }
    

    pageContext.setAttribute("results", results);
    pageContext.setAttribute("total", total);
    
    
    
    %>
    </liferay-ui:search-container-results>

    <liferay-ui:search-container-row
        className="com.iucn.whp.dbservice.model.whp_sites"
        keyProperty="site_id"
        modelVar="sites">
        
        <%
        long tempSiteID=sites.getSite_id();

			String assessment_cycle =  "";

			site_assessment site_assessmentObj = null;

			List<site_assessment> tempSiteAssessmentArr = new ArrayList<site_assessment>();

			if(site_assessmentList != null){
				int assessmentCycleCount = 0;
				for (site_assessment aSite_assessmentList : site_assessmentList) {
					if (aSite_assessmentList.getSite_id() == tempSiteID) {
						tempSiteAssessmentArr.add(aSite_assessmentList);
					}
				}
			}

			/*if site has more than one assessment - check all versions */
			if(tempSiteAssessmentArr.size() > 1){
				String cycle2014 = "";
				// 22.07.2016 - We changed version from 2016 to 2017 (why? - I don't know, but I need to rename this ugly variables)
				String cycle2016 = "";
				for(site_assessment bSite_assessmentList :  tempSiteAssessmentArr){
					if(bSite_assessmentList.getAssessment_cycle().equals("2014")){
						cycle2014 = bSite_assessmentList.getAssessment_cycle();
					}
					// changed from '2016'
					if(bSite_assessmentList.getAssessment_cycle().equals("2017")){
						cycle2016 = bSite_assessmentList.getAssessment_cycle();
					}
				}
				assessment_cycle = cycle2014;
				if(!cycle2016.equals(null) && !cycle2016.equals("")){
					assessment_cycle = assessment_cycle + ", " + cycle2016;
				}
			}else if(tempSiteAssessmentArr.size() == 1){
				assessment_cycle = tempSiteAssessmentArr.get(0).getAssessment_cycle();
			}

			Date inscription_date=sites.getInscription_date();
        String year="";
        if(inscription_date!=null){
        	year=(inscription_date.getYear()+1900)+"";
        }
        
        
        //String Serial=sites.getSerial()?"Yes" :"No";
       // String mixed=sites.getMixed_site()?"Yes" :"No";
        
        //getting country Name
       List<country_lkp> lstCountry = lstCountry=whp_sitesLocalServiceUtil.getCountryListBySiteId(sites.getSite_id());
       String countriesName="";
        if(lstCountry!=null && lstCountry.size()>0){
        	for(int i=0;i<lstCountry.size();i++){
        		country_lkp tempcountry_lkp=lstCountry.get(i);
        		if(countriesName!="")
            		countriesName=countriesName+", "+tempcountry_lkp.getName();
            	else
            		countriesName=tempcountry_lkp.getName();
        	}
        }
        //getting
        
        PortletURL rowURL = liferayPortletResponse.createRenderURL();
		rowURL.setParameter("jspPage", "/SiteInfo_view.jsp");
		rowURL.setParameter("siteId",tempSiteID+"");
		rowURL.setParameter("mode","view");
		
        
	/* //lstInscriptionCiteria=whp_sitesLocalServiceUtil.getInscriptionBySiteId(siteid);
	List<whp_sites_inscription_criteria> lstwhpInscriptionCiteria =whp_sitesLocalServiceUtil.getWhpSitesInscriptionCriteriaBySiteId(sites.getSite_id());
	String criteria="";
    if(lstwhpInscriptionCiteria!=null && lstwhpInscriptionCiteria.size()>0){
    	for(int i=0;i<lstwhpInscriptionCiteria.size();i++){
    		whp_sites_inscription_criteria temp=lstwhpInscriptionCiteria.get(i);
    		inscription_criteria_lkp objinscription_criteria_lkp=inscription_criteria_lkpLocalServiceUtil.getinscription_criteria_lkp(temp.getCriteria_id());
    		if(criteria!="")
    			criteria=criteria+", "+objinscription_criteria_lkp.getCriteria_type();
        	else
        		criteria=objinscription_criteria_lkp.getCriteria_type();
    	}
    	
    }
         */
      %>
      <liferay-ui:search-container-column-text
          name="Site Name"
          property="name_en"
          href="<%= rowURL%>" />
          
      <liferay-ui:search-container-column-text
          name="Country"
          value='<%= countriesName %>' />
          
        <liferay-ui:search-container-column-text
          name="Inscription Year"
          value='<%= year %>' />

		<liferay-ui:search-container-column-text
				name="Assessment Cycles"
				value='<%= assessment_cycle %>' />
                        
      <liferay-ui:search-container-column-jsp
       name="Actions"
          path="/siteinfo_jsp/admin_actions.jsp"
          align="right" />
      
    </liferay-ui:search-container-row>

    <liferay-ui:search-iterator paginate="<%= true %>" />

  </liferay-ui:search-container>


<script type="text/javascript">
	$(document).ready(function(){
		$('tr:even').css('background-color','#f2fafc');
		$('tr:odd').css('background-color','#fff');
		
	});
</script>

