<%@page import="com.liferay.portal.theme.ThemeDisplay"%>
<%@page import="com.liferay.portal.model.Role"%>
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
<%@include file="/siteinfo_jsp/init.jsp" %>
<portlet:defineObjects />
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/style_main.css">

<%
/* List<whp_sites> whp_sitesList=null;


    //int countrycnt=country_lkpLocalServiceUtil.getcountry_lkpsCount();
    try{
    	whp_sitesList=whp_sitesLocalServiceUtil.getAllWhp_sites();
    	
    }catch(Exception ex){
    	System.out.print("EX: "+ ex.getMessage());
    }
    request.setAttribute("whp_sitesList", whp_sitesList); */
    //request.setAttribute("whp_sitesList", null);
    List<Role> userRoles = ((ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY)).getUser().getRoles();
    boolean blnAdminUser=false;
    	for(int iUserRole = 0; iUserRole < userRoles.size(); iUserRole++)
    	{
    		if("Administrator".equalsIgnoreCase(userRoles.get(iUserRole).getName()) || ("WHP Staff".equalsIgnoreCase(userRoles.get(iUserRole).getName())))
    		{
    			blnAdminUser = true;
    			break;
    		}else{
    			blnAdminUser = false;
    		}
    	}
 
%>

<!-- Wrapper Starts here-->
<div id="wrapper">

<!-- <div class="breadCrumb">
		<ul>
		<li><a href="#">Home</a></li>
		<li><a href="#">Site Information</a></li>
		</ul>
</div> -->
<liferay-ui:error key="error-assessment" message="Assessment already in process for the selected site!" />
<div class="pageHeadingSiteInfoDashboardWrapper">
	<h2 class="pageHeaderTitle">Site Information</h2>
	
</div>
<form class="formSiteAssessmentAdmin" action="">

<div id="sitesearchDiv">
<%@include file="/siteinfo_jsp/search/search.jsp" %>
</div>
<div id="sitesearchFilterDiv">
<%@include file="/siteinfo_jsp/search/searchFilter.jsp" %>
</div>


<!--MainBlock starts here-->
<div style="margin: 0px auto; width: auto;">

<div id="siteDashboardDiv">
<div class="formLinks">
<%if(blnAdminUser){ %>
<a href="javascript:viewSitePopup('/siteinfo_jsp/popups/add_basic_information.jsp','Add New Site');">+ Add new site</a>
<%} %>
<%
List<whp_sites> tempResults = null;
	String isSearch=ParamUtil.getString(request, "isSearch");
	String siteIds = "";
	//setting value of iterator of search container
    PortletURL whp_sitesSearchURL=null;
	String pageUrl="N";
	
	if(isSearch==null || isSearch.isEmpty() || isSearch.equalsIgnoreCase("N")){
		tempResults = ActionUtil.getActiveSites(renderRequest);
		
	}else{
		tempResults= (List<whp_sites>)session.getAttribute("whp_sitesList");
		pageUrl="Y";
	}
	
	    whp_sitesSearchURL = (PortletURL)liferayPortletResponse.createRenderURL();
	    whp_sitesSearchURL.setParameter("jspPage", "/view.jsp");
	    whp_sitesSearchURL.setParameter("isSearch", pageUrl);
	    pageContext.setAttribute("whp_sitesList", tempResults,PageContext.SESSION_SCOPE);
	    for(int k=0;k<tempResults.size();k++){
	    	if(siteIds.equalsIgnoreCase("")){
	    		siteIds=tempResults.get(k).getSite_id()+"";
	    	}else{
	    		siteIds = siteIds +","+ Long.toString(tempResults.get(k).getSite_id());
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


<%
/* List<whp_sites> tempResults = null;
	String isSearch=ParamUtil.getString(request, "isSearch");
	
	//setting value of iterator of search container
    PortletURL whp_sitesSearchURL=null;
	String pageUrl="N"; */
	
	if(isSearch==null || isSearch.isEmpty() || isSearch.equalsIgnoreCase("N")){
		tempResults = ActionUtil.getActiveSites(renderRequest);
		
	}else{
		tempResults= (List<whp_sites>)session.getAttribute("whp_sitesList");
		pageUrl="Y";
	}
	
	    whp_sitesSearchURL = (PortletURL)liferayPortletResponse.createRenderURL();
	    whp_sitesSearchURL.setParameter("jspPage", "/view.jsp");
	    whp_sitesSearchURL.setParameter("isSearch", pageUrl);
	    pageContext.setAttribute("whp_sitesList", tempResults,PageContext.SESSION_SCOPE);

%>



<liferay-ui:search-container
      emptyResultsMessage="there-are-no-Sites" iteratorURL="<%=whp_sitesSearchURL %>" 
      delta="5">

    <liferay-ui:search-container-results>
    <%
   

    results = ListUtil.subList(
        tempResults, searchContainer.getStart(), searchContainer.getEnd());
    total = tempResults.size();

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
		
        
	/* 
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
          
      <c:if test="<%= blnAdminUser %>">                  
      <liferay-ui:search-container-column-jsp
       name="Actions"
          path="/siteinfo_jsp/admin_actions.jsp"
          align="right" /> 
      </c:if>
    </liferay-ui:search-container-row>

    <liferay-ui:search-iterator />

  </liferay-ui:search-container>

</div>

</div>
<!--MainBlock Ends here-->
</form>
</div>
<!-- Wrapper Ends here-->
<script type="text/javascript">

	function viewSitePopup(renderJSPURL,popupTitle) {
		//creating url
		
		var customUrl="<portlet:renderURL  windowState='<%= LiferayWindowState.POP_UP.toString() %>'><portlet:param name='jspPage' value='jspURL' /><portlet:param name='keyVal' value='keyValue' /><portlet:param name='siteIdVal' value='currentSiteValue' /></portlet:renderURL>";
	   
	    var finalUrl=customUrl.replace("jspURL",renderJSPURL);
	    
	    AUI().use('aui-dialog', 'aui-io', 'event', 'event-custom', function(A) {
		     var dialog = new A.Dialog({
		            title: popupTitle,
		            //centered: true,
		            //draggable: true,
		            modal: true,
		           // position: [300, 100]
		            xy: [500, 200]
		        }).plug(A.Plugin.IO, {uri: finalUrl}).render();
		        
		        dialog.show();
		        
		  });
	}
	function submitSitePopup(jspPage,formId,actionUrl) {
		//alert(jspPage+"-"+formId+"-"+actionUrl);   
		AUI().use('aui-io-request', function(A) {
		   
		    A.io.request(actionUrl, {
		      method: 'GET',
		      form: { id: '<portlet:namespace />'+formId},
		      on: {
		          success : function() {
		    		//  	  alert(this.get('responseData'));
		        	 top.document.getElementById('closethick').click();
		          }
		      }
		    });
		  });
		}
	function advanceSearchPopup(popupTitle) {
		//creating url
		var customUrl="<portlet:renderURL  windowState='<%= LiferayWindowState.EXCLUSIVE.toString() %>'><portlet:param name='jspPage' value='jspURL' /></portlet:renderURL>";
	    var finalUrl=customUrl.replace("jspURL","/siteinfo_jsp/search/query_builder.jsp");
	    var left = (screen.width/2-350);
	    var top = (screen.height/2-300);
	    AUI().use('aui-dialog', 'aui-io', 'event', 'event-custom', function(A) {
		     var dialog = new A.Dialog({
		            title: popupTitle,
		            modal: true,
		            width:700,
		            xy: [left, top]
		        }).plug(A.Plugin.IO, {uri: finalUrl}).render();
		        
		        dialog.show();
		        
		  });
	}
	$(document).ready(function(){
			/*$('.aui-w35, .aui-w40').addClass('selectRegion');*/
			/*$('.aui-w25').css({'margin':'0.2em 0 0 22em','width':'10%'});*/
			/*$('.aui-field-element ')*/
			$('.portlet-body').css('margin','0 auto');
			$('table.taglib-search-iterator th').css('color','#1a1a1a');
			$('th.col-actions').css('width','100px');
			$('.lfr-actions').css('margin-right','3px');
			$('.delta-selector').addClass('deltaSelectorWidth').css('width','135px');
			$('.page-selector').addClass('pageSelectorWidth').css('width','108px');
			
			$('.taglib-page-iterator').css({'padding':'0.3em','background-color':'#e7e7e7','border':'1px solid #c4c4c4'});


			$('.search-results').css('margin', '0.8em 0 0 0.8em') ;


			$('.taglib-page-iterator .search-pages').css('margin','0.3em 1em 0 0');


			$('.delta-selector').addClass('deltaSelectorWidth').css({'width':'139px','margin-top':'0em'});


			$('.page-selector').addClass('pageSelectorWidth').css({'width':'108px','margin-top':'0em'});


			$('.aui-field-label-inline-label').css('margin','0.2em 0 0 0');

			$('.aui-suffix').css({'display':'inline-block','margin':'0.56em 0 0 0.2em'});


			$('.page-links').css('margin-top','0.5em');
			
			$('.taglib-search-iterator-page-iterator-bottom').css('padding-top','5px');
			
	
			
			  
			  
	
	
	
			//alert(height);
			
			<%
			if(isSearch.equalsIgnoreCase("Y")) {%>
			  $("#backHref").show();
		  <%} %>
		  
		  
	});
	
	
</script>