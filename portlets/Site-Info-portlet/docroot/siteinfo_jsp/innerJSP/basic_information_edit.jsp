<%-- <%@page import="com.iucn.whp.dto.WhpSiteInscriptionCriteria"%>
<%@page import="java.util.ArrayList"%> --%>
<%@include file="/siteinfo_jsp/init.jsp" %>
<%@page import="com.iucn.whp.dbservice.service.*"%>
<%@page import="com.iucn.whp.dbservice.model.*"%>

<%

whp_sites objwhp_sitesBasic=null;
/* //long site_id=1;//Long.parseLong(request.getParameter("siteId").toString());; */
System.out.println("Site Id: "+ request.getAttribute("siteId"));
long site_id=Long.parseLong(request.getAttribute("siteId").toString());
System.out.println("Site Id: "+ site_id);
objwhp_sitesBasic=whp_sitesLocalServiceUtil.getwhp_sites(site_id);

/* Assessmemt value retrieval*/
List<conservation_outlook> lstoutlook=null; 
conservation_outlook_rating_lkp objConservation_outlook_rating_lkp =null;


//getting assessemnt version id

    List<site_assessment> lstsite_assessment=null;
    long assessment_versionid=0;
    try{
   
     lstsite_assessment=site_assessmentLocalServiceUtil.getActiveAssessmentBySiteId(site_id); 
     int size=lstsite_assessment.size();
    	for(int i=0;i<size;i++){
    		site_assessment tempsite_assessment=lstsite_assessment.get(i);
    		
    		List<assessment_lang_version> lstassessment_lang_version=null;
    		lstassessment_lang_version=assessment_lang_versionLocalServiceUtil.
    		findByAssessmentId(tempsite_assessment.getAssessment_id());
    		for(assessment_lang_version tempassessment_lang_version:lstassessment_lang_version){
    		if(tempassessment_lang_version.getPublished()){
    			assessment_versionid=tempassessment_lang_version.getAssessment_version_id();
    			break;
    		}
    	}
    		if(assessment_versionid>0)
    			break;
    	}
    	
      	
     }catch(Exception e){
    	 
    	 
     }

//long assessment_versionid=Long.parseLong(request.getAttribute("versionId").toString());
long ratingId=0;
lstoutlook=conservation_outlookLocalServiceUtil.getconservationOutllokByVersion(assessment_versionid);
if(assessment_versionid>0){
	if(lstoutlook!=null && lstoutlook.size()>0){
		ratingId=lstoutlook.get(0).getRating();
		objConservation_outlook_rating_lkp=conservation_outlook_rating_lkpLocalServiceUtil.getRatingByConservation_outlookId(ratingId);
	}	
}



%>

<c:set var="UpdateUrl" value="/siteinfo_jsp/popups/edit_basic_information.jsp"/>
<c:set var="RefreshUrl" value="/siteinfo_jsp/innerJSP/basic_information_edit.jsp"/>
<c:set var="currentDiv" value="basicInfoEdit"/>
<!--mainBlockSiteInfo starts here-->
<div class="mainBlockSiteInfo">

	<%-- <a href="javascript:dynamicPopup('${UpdateUrl}','<%= objwhp_sites.getSite_id()%>','Edit Basic Information');" class="editLink">Edit</a> --%>


<!--infoWrapper Starts Here-->
<div class="infoWrapper">
<div class="header01">
<h3 class="basicInfoPageTitle">Basic Information</h3>

<div class="floatRight01">	<%
	System.out.println("MODE: "+ request.getAttribute("mode"));
	String mode=request.getAttribute("mode")+"";
	//if(!("view").equalsIgnoreCase(mode)) {%>
	<a href="#" onclick="javascript:dynamicPopup('/siteinfo_jsp/popups/edit_basic_information.jsp','<%= objwhp_sitesBasic.getSite_id()%>','Basic Information',event);return false;" class="addBtn hideAdminAction">Edit</a>
	<%//} %></div>
</div>
<div class="rowWrapper">
<div class="row">
	<span class="inputLeft">IUCN ID</span>
	<span class="inputRight"><%=objwhp_sitesBasic.getSite_id()%></span>
</div>

<div class="row altColor">
	<span class="inputLeft">WDPA ID</span>
	<span class="inputRight"><%=objwhp_sitesBasic.getWdpa_id()%></span>
</div>

<div class="row">
	<span class="inputLeft">UNESCO ID</span>
	<span class="inputRight"><%=objwhp_sitesBasic.getUnesco_id()%></span>
</div>

<div class="row altColor">
	<span class="inputLeft">Site Name(En)</span>
	<span class="inputRight"><%=objwhp_sitesBasic.getName_en()%></span>
</div>


<div class="row">
	<span class="inputLeft">Site Name(Fr)</span>
	<span class="inputRight"><%=objwhp_sitesBasic.getName_fr()%></span>
</div>

<div class="row altColor">
	<span class="inputLeft">Cultural Landscape</span>
	<span class="inputRight"><%= objwhp_sitesBasic.getCultural_landscape() ? "Yes" : "No" %></span>
</div>

<div class="row">
	<span class="inputLeft">Mixed Site</span>
	<span class="inputRight"><%=objwhp_sitesBasic.getMixed_site() ? "Yes" : "No" %></span>
</div>
<div class="row altColor lastRow">
	<span class="inputLeft">Inscription year</span>
	<span class="inputRight"><fmt:formatDate pattern="yyyy" value="<%= objwhp_sitesBasic.getInscription_date() %>"/></span>
</div>

<!-- form asseseement -->
<div class="row">

	<span class="inputLeft">Assessment of Conservation Outlook</span>
	
	<span class="inputRight"><%=objConservation_outlook_rating_lkp!=null ? objConservation_outlook_rating_lkp.getCo_rating() : "N.A."%></span>
	
</div>
</div>

</div>
<!--infoWrapper Ends Here-->
</div>
<!--mainBlockSiteInfo ends here-->


