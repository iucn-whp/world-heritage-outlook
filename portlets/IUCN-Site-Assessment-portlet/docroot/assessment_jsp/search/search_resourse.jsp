<%@page import="com.liferay.portal.kernel.util.OrderByComparator"%>
<%@page import="com.iucn.whp.dto.SiteNameComparatorUtil"%>
<%@page import="com.iucn.whp.dbservice.NoSuchsite_assessmentException"%>
<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@page import="com.liferay.portlet.PortletPreferencesFactoryUtil"%>
<%@page import="com.liferay.portlet.PortalPreferences"%>
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
<%@include file="/init.jsp" %>
<%@page import="javax.portlet.*"%>
<%@page import="com.liferay.portal.kernel.util.Validator" %>
<%@page import="com.iucn.whp.assesment.utils.*" %>

<portlet:defineObjects />
<%@page import="com.iucn.whp.dto.SiteAssessmentDTO" %>

<div style="margin: 0px auto;">

<%

    String assessmentIds = "";
 	List<SiteAssessmentDTO> siteAssessmentDTOList=null;
	String siteName=ParamUtil.getString(request, "siteName");
    int statusID=ParamUtil.getInteger(request, "statusID");
    int stageID=ParamUtil.getInteger(request, "stageID");
    int countryId=ParamUtil.getInteger(request, "iucnRegionId");
    int userId=ParamUtil.getInteger(request, "userId");
    
   if(userId<=0){
	  long[] lstassessmentId = ParamUtil.getLongValues(request, "assessmentIds");
	   //String lstassessmentIdstr =request.getAttribute("assessmentIdList").toString();
	  // String[] lstassessmentId = lstassessmentIdstr.split(",");
	   List<site_assessment> site_assessmentList = new ArrayList<site_assessment>();
	   if(lstassessmentId!=null && lstassessmentId.length!=0){
   		for(long assessmentId:lstassessmentId){
   		try {
   				site_assessment siteAssessment = site_assessmentLocalServiceUtil.getsite_assessment(assessmentId);
   				if(siteAssessment!=null)
					site_assessmentList.add(siteAssessment);
			} catch (PortalException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch (NoSuchsite_assessmentException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
   			}
		}
   	}
	   siteAssessmentDTOList= AssessmentSearchUtil.getSiteAssessmentDTOFromSite_assessmentList(site_assessmentList);
   }else{
    
    siteAssessmentDTOList= AssessmentSearchUtil.getSiteAssessment(siteName,statusID,stageID,countryId,userId);
   }
    /* if(){
    	List<site_assessment> site_assessmentList=new ArrayList<site_assessment>();
    	
    	siteAssessmentDTOList=getSiteAssessmentDTOFromSite_assessmentList(site_assessmentList);
    } */
    //setting value of iterator of search container
    
    for(int k=0;k<siteAssessmentDTOList.size();k++){
	if(assessmentIds.equalsIgnoreCase("")){
		assessmentIds=siteAssessmentDTOList.get(k).getAssessmentId()+"";
	}else{
		assessmentIds = assessmentIds +","+ Long.toString(siteAssessmentDTOList.get(k).getAssessmentId());
	}
	
}
    
    
    
    PortletURL assessmentPageURL=null;
	try{
		assessmentPageURL = (PortletURL)liferayPortletResponse.createRenderURL();
		assessmentPageURL.setParameter("jspPage", "/assessment_dashboard.jsp");
		assessmentPageURL.setParameter("isSearch", "Y");
		assessmentPageURL.setWindowState(WindowState.NORMAL);
		pageContext.setAttribute("siteAssessmentDTOList", siteAssessmentDTOList,PageContext.SESSION_SCOPE);
      }catch(Exception ex){
  	  ex.getStackTrace();
  	  
    }
          
%>




<div id="siteAssessmentDashboardDiv" class="siteAssessmentTableContainer">

<div id="export"  style="float:right;">
<portlet:resourceURL var="exportType">
<portlet:param name="whp_assessmentList" value= "<%=assessmentIds %>" />
<portlet:param name="ACTION_CMD" value= "EXPORT" />
</portlet:resourceURL>
<a  href="<%=exportType %>" class="roundedwhiteBTN"  float:right;"><span><p>Export</p></span></a>
</div>

<%

	PortalPreferences portalPrefs = PortletPreferencesFactoryUtil.getPortalPreferences(request);
	/* String orderByCol;
	String orderByType; */
	String orderByCol = ParamUtil.getString(request, "orderByCol");
	String orderByType = ParamUtil.getString(request, "orderByType");
	
	if (Validator.isNotNull(orderByCol) && Validator.isNotNull(orderByType)){
		portalPrefs.setValue("NAME_SPACE", "sort-by-col", orderByCol); 
		portalPrefs.setValue("NAME_SPACE", "sort-by-type", orderByType);
	} else {
		orderByCol = portalPrefs.getValue("NAME_SPACE", "sort-by-col", "Site Name");
		orderByType = portalPrefs.getValue("NAME_SPACE", "sort-by-type ", "asc");
	}

%>

<liferay-ui:search-container
      emptyResultsMessage="there-are-no-Site-Assessments" iteratorURL="<%=assessmentPageURL %>" 
      delta="30"  orderByCol="<%= orderByCol %>" orderByType="<%= orderByType %>">

    <liferay-ui:search-container-results>
    <%
   
    OrderByComparator orderByComparator =
    	SiteNameComparatorUtil.getSiteNameOrderByComparator(orderByCol, orderByType);
    
    Collections.sort(siteAssessmentDTOList,orderByComparator);
    
    results = ListUtil.subList(
    		siteAssessmentDTOList, searchContainer.getStart(), searchContainer.getEnd());
    total = siteAssessmentDTOList.size();

    pageContext.setAttribute("results", results);
    pageContext.setAttribute("total", total);
    
    
    
    %>
    </liferay-ui:search-container-results>

    <liferay-ui:search-container-row
        className="com.iucn.whp.dto.SiteAssessmentDTO"
        keyProperty="assessmentId"
        modelVar="siteAssessmentDTO">
        
        <%
        long tempsites_assessmentID=siteAssessmentDTO.getAssessmentId();
        Date initiation_date=siteAssessmentDTO.getSite_Assessment().getInitiation_date();
         
        System.out.println("siteAssessmentDTO----"+siteAssessmentDTO);
        
        
      
        /*
        PortletURL rowURL = liferayPortletResponse.createRenderURL();
		rowURL.setParameter("jspPage", "/SiteInfo_view.jsp");
		rowURL.setParameter("siteId",tempSiteID+"");
		rowURL.setParameter("mode","view");
	       */
      %>
      
       <liferay-ui:search-container-column-text
          name="Assessment Id"
          value="<%= String.valueOf(siteAssessmentDTO.getAssessmentId()) %>"
           />
      <liferay-ui:search-container-column-text 
          name="Site Name" 
          property="siteName"
		  orderable="true"          
           />
          
      <liferay-ui:search-container-column-text
          name="Current Status"
          property="current_Status"
          value="<%= siteAssessmentDTO.getCurrent_Status() %>" />
          
      <liferay-ui:search-container-column-text
          name="Current Stage" 
          >
          <%= siteAssessmentDTO.getCurrent_Stage()!=null ? siteAssessmentDTO.getCurrent_Stage() : "" %>
          </liferay-ui:search-container-column-text>
          
          <liferay-ui:search-container-column-text
          name="Current User"
           property="currentUser"
           value="<%= siteAssessmentDTO.getCurrentUser() %>" />
          
           <liferay-ui:search-container-column-text
          name="Initiation Date"
          >
          <fmt:formatDate value="<%=initiation_date %>" pattern="dd/MM/yyyy" />
          </liferay-ui:search-container-column-text>
          
          <liferay-ui:search-container-column-text
          name="Version"
          
          >
          <%= siteAssessmentDTO.getCurrentVersion()!=null ? siteAssessmentDTO.getCurrentVersion() : "0.0" %>
          </liferay-ui:search-container-column-text>
          
        <liferay-ui:search-container-column-text
          name="Language" >
        <%=siteAssessmentDTO.getLanguages()!=null ? siteAssessmentDTO.getLanguages() : "N.A" %>
         </liferay-ui:search-container-column-text>
          
                        
                        
      <liferay-ui:search-container-column-jsp
       name="Actions"
          path="/assessment_jsp/dashboard_actions.jsp"
          align="right" /> 
       
    </liferay-ui:search-container-row>

    <liferay-ui:search-iterator />

  </liferay-ui:search-container>

</div>
</div>

<script type="text/javascript">
	$(document).ready(function(){
		$('tr:even').css('background-color','#f2fafc');
		$('tr:odd').css('background-color','#fff');
		$("#backHref").show();
		
		
	});
</script>

