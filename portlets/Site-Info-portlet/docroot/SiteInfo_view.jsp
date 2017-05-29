<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.iucn.whp.dbservice.service.persistence.docs_sitedataUtil"%>
<%@page import="com.iucn.whp.dbservice.service.persistence.whp_sitesUtil"%>
<%@page import="com.iucn.whp.dbservice.service.persistence.boundary_modification_type_lkpPersistence"%>
<%@page import="com.liferay.portal.model.ContactConstants"%>
<%@page import="com.iucn.whp.dbservice.model.whp_contact"%>
<%@page import="com.iucn.whp.dbservice.service.persistence.whp_sites_visitorsUtil"%>
<%@page import="com.liferay.portal.PortalException"%>

<%@page import="com.iucn.whp.dbservice.service.*"%>
<%@page import="com.iucn.whp.dbservice.model.*"%>
<%@page import="com.iucn.whp.dto.*"%>
<%@ page import="com.liferay.portal.util.PortalUtil" %>
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
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.*"%>
<%@ page import="com.iucn.whp.dbservice.model.*" %>

<portlet:defineObjects />

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<title>Site Information</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<!-- %@ include file="/siteinfo_jsp/init.jsp" %-->
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/style_main.css" type="text/css" />

<%-- <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.4.1.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.jqtransform.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.lightbox_me.js"></script>


  <link href="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8/themes/base/jquery-ui.css" rel="stylesheet" type="text/css"/>
  <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.4/jquery.min.js"></script>
  <script src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8/jquery-ui.min.js"></script>		
 --%>
</head>
<!-- Below file included for save the popup form data and refresh the div -->


<%
long siteid=0;
String mode="view";
try{
	String tempSiteID=String.valueOf(request.getAttribute("siteId"));
	String tempmode=String.valueOf(request.getAttribute("mode"));
	if(tempSiteID==null || tempSiteID.equalsIgnoreCase("null")){
		tempSiteID=ParamUtil.getString(request, "siteId");
		
		request.setAttribute("siteId",tempSiteID);
	}
	if(tempmode==null || tempmode.equalsIgnoreCase("null")){
		tempmode=ParamUtil.getString(request, "mode");
	}
	request.setAttribute("mode",tempmode);
	mode=tempmode;
	siteid=Long.parseLong(tempSiteID);
}
catch(Exception ex){
	ex.printStackTrace();
}

/* String param = PortalUtil.getOriginalServletRequest(request).getParameter("_myVal"); 
System.out.println("#########"+ param);
System.out.println("####siteidfromResopnce#####"+ siteid);
HttpServletRequest r = PortalUtil.getHttpServletRequest(renderRequest);
String wellHole =  PortalUtil.getOriginalServletRequest(r).getParameter("_myVal");
System.out.println("#####>>>>>####"+ wellHole);
 */

whp_sites objwhp_sites=null;
List<whp_sites_country> lstwhp_sites_country=null;

List<whp_sites_mission> lstMissions = null;
List<whp_sites_mee> lstMees = null;
List<whp_sites_soc_reports> lstSoc_reports = null;
List<whp_sites_mgmt_plan_state> lstMgmt_plan_states = null;
List<docs_sitedata> lstSiteDocs = null;

 try{
    	
    	objwhp_sites=whp_sitesLocalServiceUtil.getwhp_sites(siteid);
    	lstwhp_sites_country=whp_sitesLocalServiceUtil.getSiteCountryBySiteId(siteid);    
    	
    	lstMissions = whp_sitesLocalServiceUtil.getWhpSiteMissionBySiteId(siteid);
    	lstMees =  whp_sitesLocalServiceUtil.getWhpSiteMeeBySiteId(siteid);
    	lstSoc_reports = whp_sitesLocalServiceUtil.getWhpSiteSocReportsBySiteId(siteid);
    	lstMgmt_plan_states = whp_sitesLocalServiceUtil.getWhpSiteMgmtPlanStatesBySiteId(siteid);
    	lstSiteDocs = whp_sitesLocalServiceUtil.getDocs_SiteDataBySiteId(siteid);
    	

    }catch(Exception ex){
		System.out.println("EXCEPTION:"+ ex.getStackTrace()+"------"+ex.getStackTrace());
	}	
    
    
    
  
    
    
    
    
    
    List<site_assessment> lstsite_assessment=null;
    long assessment_version_id=0;
    try{
   
     lstsite_assessment=site_assessmentLocalServiceUtil.getActiveAssessmentBySiteId(siteid); 
     int size=lstsite_assessment.size();
    	for(int i=0;i<size;i++){
    		site_assessment tempsite_assessment=lstsite_assessment.get(i);
    		
    		List<assessment_lang_version> lstassessment_lang_version=null;
    		lstassessment_lang_version=assessment_lang_versionLocalServiceUtil.
    		findByAssessmentId(tempsite_assessment.getAssessment_id());
    		for(assessment_lang_version tempassessment_lang_version:lstassessment_lang_version){
    		if(tempassessment_lang_version.getPublished()){
    			assessment_version_id=tempassessment_lang_version.getAssessment_version_id();
    			break;
    		}
    	}
    		if(assessment_version_id>0)
    			break;
    	}
    	
      	
     }catch(Exception e){
    	 
    	 
     }
     
     
     /* managment  assessment benefits type value*/
     
	    List<benefits>  lstbenefit=null;
       List<benefit_rating_lkp> lstbenefitratinglkp=null;
       List<benefit_checktype_lkp> lstbenefit_checktype_lkp =null;
       List<benefit_checksubtype_lkp>  lstbenefit_checksubtype_lkp=null;
       List<String> lstchecktype_lkp=new ArrayList<String>();
       List<benefits_type_ref> lstbenefitstyperef=null;
   
     
     try{
   	   
   	  System.out.println("assessment_versionid-------"+assessment_version_id);
   	   //long assesmentVersionId=Long.parseLong(request.getAttribute("assessment_version_id").toString());
   	   if(assessment_version_id>0){
	  lstbenefit=benefitsLocalServiceUtil.getbenefitByVersion(assessment_version_id);
       
       
		if(lstbenefit!=null && lstbenefit.size()>0){
			long benefitid=0;

	    
	       	lstbenefit=benefitsLocalServiceUtil.getbenefitByVersion(assessment_version_id);
	      	
	       	if(lstbenefit.size()>0)
	       	{
	       	benefitid = lstbenefit.get(0).getBenefits_id();
	       	
	       	
	       	lstbenefitstyperef =benefits_type_refLocalServiceUtil.findByBenefitsId(benefitid);
	       	
	       	for(benefits  lst_benefits   : lstbenefit )
	       	{
	       		
	             	
	       	List<benefit_checksubtype_lkp> objSubTypelkp=new ArrayList<benefit_checksubtype_lkp>();
	       	
	       	//getting subtype list 
	       	 List<benefits_type_ref> objbenefits_type_ref=benefits_type_refLocalServiceUtil.findByBenefitsId(lst_benefits.getBenefits_id());
	       	 long benefitType=0;
	       	 
	       	 for(benefits_type_ref benefits_type_refTemp: objbenefits_type_ref){
	       		 
	       		 benefitType=benefits_type_refTemp.getBenefit_checktype();
	       		 
	       		 long subType=benefits_type_refTemp.getBenefit_checksubtype();
	       		 
	       		 objSubTypelkp.add(benefit_checksubtype_lkpLocalServiceUtil.getbenefit_checksubtype_lkp(subType));
	       	 }
	      
	       	 String subtype="";
	       	 //set type
	       	 if(benefitType>0){
	       		subtype=benefit_checktype_lkpLocalServiceUtil.getbenefit_checktype_lkp(benefitType).getBenefit_checktype();
	       		lstchecktype_lkp.add(subtype);
	       	 }
	       	 
	       	
	      	}
}	
	       	
}
	       	else{
	       		
	       		lstchecktype_lkp.add("");
	       	}
		
   	   }
}
       catch(Exception e)

       {

       	
       	e.printStackTrace();

       } 

       
     /*Management assessment Threat values*/
     
     
    List<assessing_threats_potential> lstpotential_value=null;
     List<assessing_threats_current> lstcurrent_value=null;
      
     try{
     lstcurrent_value= assessing_threats_currentLocalServiceUtil.getEntriesByAssessment_versionId(assessment_version_id);
    	 lstpotential_value=assessing_threats_potentialLocalServiceUtil.getEntriesByAssessmentVersionId(assessment_version_id);
    
 }
     catch(Exception e )
     {
    	 e.printStackTrace();
     }
     
     
    request.setAttribute("currentSiteId", siteid); 
    request.setAttribute("objwhp_sites", objwhp_sites);
    request.setAttribute("versionId", assessment_version_id+"");
    request.setAttribute("lstMissions", lstMissions);
    request.setAttribute("lstMees", lstMees);
    request.setAttribute("lstSoc_reports", lstSoc_reports);
    request.setAttribute("lstMgmt_plan_states", lstMgmt_plan_states);
    request.setAttribute("lstSiteDocs", lstSiteDocs);
  //  request.setAttribute("lstSiteDocs", lstSiteDocs);
    request.setAttribute("lstchecktype_lkp", lstchecktype_lkp);
    request.setAttribute("lstcurrent_value", lstcurrent_value);
    request.setAttribute("lstpotential_value", lstpotential_value);

    %>



<aui:script>
AUI().ready('aui-tabs', function(A) {
var tabs1=new A.TabView({
 boundingBox: '#tabs1',
listNode: '#docs1',
contentNode: '#docsContent1'
});

tabs1.render();
});



$(document).ready(function () {
$("#tabs1").show();
$("#loadingDiv").remove();

<%
	//System.out.println("mode"+mode);
	if(mode.equalsIgnoreCase("view")) {%>
	//alert('test');
  $(".hideAdminAction").hide();
  <%} %>
});
</aui:script>


<div class="loading-animation" id="loadingDiv"></div>
<div class="pageHeadingSiteInfoDashboardWrapper">
	<h2 class="pageHeaderTitle"><c:out value="${objwhp_sites.getName_en()}" /></h2>
	<div class="formLinksRight">
<a href="#" onclick="javascript:history.go(-1);" style="float:right">&lt;&lt;back</a>
</div>
	
</div>
<div id="tabs1" style="display:none">

<ul class="aui-tabview-list aui-widget-hd" id="docs1">
<li class="aui-tab">
<a class="aui-tab-label" href="javascript:;">Basic</a></li>
<li class="aui-tab">
<a class="aui-tab-label" href="javascript:;">Official</a></li>
<li class="aui-tab">
<a class="aui-tab-label" href="javascript:;">Physical</a></li>
<li class="aui-tab">
<a class="aui-tab-label" href="javascript:;">Management</a></li>

<li class="aui-tab">
<a class="aui-tab-label" href="javascript:;">Species</a></li>
<li class="aui-tab">
<a class="aui-tab-label" href="javascript:;">Contact</a></li>
<li class="aui-tab">
<a class="aui-tab-label" href="javascript:;">Documents</a></li>
	
</ul>

<div class="aui-tabview-content aui-widget-bd" id="docsContent1" >
<div class="aui-tabview-content-item">

 <%-- <jsp:include page="/siteinfo_jsp/block_basic_information.jsp" /> --%>
 <%@ include file="/siteinfo_jsp/block_basic_information.jsp" %>
</div>
<div class="aui-tabview-content-item">

<%-- <jsp:include page="/siteinfo_jsp/block_official_information.jsp" /> </div> --%>
<%@ include file="/siteinfo_jsp/block_official_information.jsp" %>
</div>
 <div class="aui-tabview-content-item">

<%-- <jsp:include page="/siteinfo_jsp/block_physical_information.jsp" /> --%> 
<%@ include file="/siteinfo_jsp/block_physical_information.jsp" %>

</div>
<div class="aui-tabview-content-item">

<%-- <jsp:include page="/siteinfo_jsp/block_management_information.jsp" /> --%>  
<%@ include file="/siteinfo_jsp/block_management_information.jsp" %>
</div>
<div class="aui-tabview-content-item">
<%@ include file="/siteinfo_jsp/block_species_information.jsp" %>
</div>
 <div class="aui-tabview-content-item">

<%-- <jsp:include page="/siteinfo_jsp/block_contacts_information.jsp" /> --%>
<%@ include file="/siteinfo_jsp/block_contacts_information.jsp" %>

</div>
<%-- <div class="aui-tabview-content-item">
<jsp:include page="/siteinfo_jsp/site_static_map.jsp" />
</div> --%>
<div class="aui-tabview-content-item">
<%-- <%@ include file="/siteinfo_jsp/block_documents_information.jsp" %> --%>
<%-- <jsp:include page="/siteinfo_jsp/block_documents_information.jsp" /> --%>
<%@ include file="/siteinfo_jsp/block_documents_information.jsp" %>
</div>
   
</div>
</div>


</html>