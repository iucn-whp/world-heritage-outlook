<%@page import="com.iucn.whp.assesment.utils.AssessmentActionUtil"%>
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
<%@page import="javax.portlet.*"%>
<%@page import="com.iucn.whp.dbservice.model.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ page import="java.util.*"%>
<%@ page import="com.iucn.whp.dbservice.model.*" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@include file="/init.jsp" %>
<%@page import="com.iucn.whp.dto.SiteAssessmentDTO" %>

<portlet:defineObjects />
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/style_main.css">
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.4.1.js"></script>
<!-- Wrapper Starts here-->
<div id="wrapper">


<h2 class="pageHeadingSiteInfoDashboard">Site Assessment</h2>
<form class="formSiteAssessmentAdmin" action="">

<div id="sitesearchDiv">
<%-- <%@include file="/siteinfo_jsp/search/search.jsp" %> --%>
</div>



<!--MainBlock starts here-->
<div style="margin: 0px auto; width: 968px;">
<div class="formLinks">
<a id="backHref" style="display:none" href="/web/iucn/sites-data" >&lt;&lt;back</a>
</div>
<div id="siteDashboardDiv">

<%


site_assessment site_assessmentList=null;
List<site_assessment_versions> site_assessment_versionslist=null;


String selectedPkey=request.getParameter("keyVal");
long assessmentVersionId = Long.parseLong(request.getParameter("versionIdVal"));
	
if(selectedPkey!=null && !selectedPkey.isEmpty()){
	site_assessment_versionslist=site_assessment_versionsLocalServiceUtil.findByAssessmentId(
			Long.parseLong(selectedPkey));
	site_assessmentList=site_assessmentLocalServiceUtil.getsite_assessment(Long.parseLong(selectedPkey));
	
}
	
%>

<liferay-ui:search-container
      emptyResultsMessage="there-are-no-Site-Assessments" iteratorURL="<%=whp_sitesSearchURL %>" 
      delta="5">

    <liferay-ui:search-container-results>
    <%
   

    results = ListUtil.subList(
    		site_assessment_versionslist, searchContainer.getStart(), searchContainer.getEnd());
    total = site_assessment_versionslist.size();

    pageContext.setAttribute("results", results);
    pageContext.setAttribute("total", total);
    
    
    
    %>
    </liferay-ui:search-container-results>

    <liferay-ui:search-container-row
        className="com.iucn.whp.dbservice.model.site_assessment_versions"
        keyProperty="assessment_version_id"
        modelVar="objSite_assessment_versions">
        
        <%
       
        %>
      
       <liferay-ui:search-container-column-text
          name="Assessment Id"
          value="<%= String.valueOf(objSite_assessment_versions.getAssessment_id()) %>"
           />
   
          
      <liferay-ui:search-container-column-text
          name="Version Code"
          property="version_code"
          value="<%= String.valueOf(objSite_assessment_versions.getVersion_code()) %>" />
          
       <liferay-ui:search-container-column-text
          name="Version Code"
          property="version_code"
          value="<%= String.valueOf(objSite_assessment_versions.getVersion_code()) %>" />
          
          
 <%--           <liferay-ui:search-container-column-text
          name="Initiation Date"
          >
          <fmt:formatDate value="<%=initiation_date %>" pattern="dd/MM/yyyy" />
          </liferay-ui:search-container-column-text>
  --%>         
       </liferay-ui:search-container-row>

    <liferay-ui:search-iterator />

  </liferay-ui:search-container>

</div>

</div>
<!--MainBlock Ends here-->
</form>
</div>

