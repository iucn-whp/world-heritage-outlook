<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.repository.model.Folder"%>
<%@page import="com.liferay.portal.theme.ThemeDisplay"%>
<%@page import="com.liferay.portlet.documentlibrary.service.DLAppServiceUtil"%>
<%@page import="com.liferay.portal.kernel.repository.model.FileEntry"%>
<%@page import="com.liferay.portlet.documentlibrary.util.DLUtil"%>
<%@page import="com.iucn.whp.sites.utils"%>
<%@page import="com.iucn.whp.dbservice.service.persistence.site_assessmentUtil"%>
<%@page import="com.iucn.whp.dbservice.service.persistence.benefits_type_refUtil"%>
<%@page import="com.iucn.whp.dbservice.service.persistence.assessing_threats_potentialUtil"%>
<%@page import="com.iucn.whp.dbservice.service.persistence.current_threat_assessment_catUtil"%>
<%@page import="com.iucn.whp.dbservice.service.persistence.assessing_threats_currentUtil"%>
<%@page import="com.iucn.whp.dbservice.service.persistence.benefits_summaryPersistence"%>
<%@page import="com.iucn.whp.dbservice.service.persistence.benefits_summaryUtil"%>
<%@page import="com.iucn.whp.dbservice.service.persistence.active_conservation_projectsUtil"%>
<%@page import="com.iucn.whp.dbservice.service.persistence.state_trend_biodivvalsUtil"%>
<%@page import="com.iucn.whp.dbservice.service.persistence.state_lkpUtil"%>
<%@page import="com.iucn.whp.dbservice.service.persistence.referencesUtil"%>
<%@page import="com.iucn.whp.dbservice.service.persistence.assessment_whvaluesUtil"%>
<%@page import="com.iucn.whp.dbservice.service.persistence.threat_rating_lkpUtil"%>
<%@page import="com.iucn.whp.dbservice.service.persistence.prot_mgmt_overallPersistence"%>
<%@page import="com.iucn.whp.dbservice.service.persistence.prot_mgmt_overallUtil"%>
<%@page import="com.iucn.whp.dbservice.service.persistence.state_trend_whvaluesUtil"%>
<%@page import="com.iucn.whp.dbservice.service.persistence.conservation_outlookUtil"%>
<%@page import="com.iucn.whp.dbservice.service.persistence.conservation_outlookPersistence"%>
<%@page import="com.iucn.whp.dbservice.service.persistence.site_assessment_versionsPersistence"%>
<%@page import="com.iucn.whp.dbservice.service.persistence.site_assessmentPersistence"%>
<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@page import="com.iucn.whp.dbservice.service.whp_sitesLocalServiceUtil"%>
<%@page import="com.iucn.whp.dbservice.service.country_lkpLocalServiceUtil"%>
<%@page import="com.iucn.whp.dbservice.service.site_assessment_versionsLocalServiceUtil" %>
<%@page import="java.util.List"%>
<%@page import="java.lang.String"%>

<%@ page import="com.iucn.whp.dbservice.model.country_lkp"%>
<%@ page import="com.iucn.whp.dbservice.model.whp_sites"%>
<%@page import="java.io.*"%>
<%@page import="javax.servlet.*"%>
<%@page import="javax.servlet.http.*"%>
<%@page import="java.util.Locale"%>
<%@ page import="com.iucn.whp.dbservice.service.iucn_regionLocalServiceUtil" %>
<%@ page import="com.iucn.whp.dbservice.service.iucn_region_countryLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.upgrade.util.*"%>
<%@ include file="/init.jsp"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
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
<portlet:defineObjects />
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.4.1.js"></script> 

<portlet:defineObjects />

<head>
<title></title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/AssesmentSummary.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/Jquery-standard.css" />
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.7.1.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.nestedAccordion.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/expand.js"></script>


<script>
	// Wait until the DOM has loaded before querying the document
	$(document).ready(function(){
		$('ul.tabs').each(function(){
			// For each set of tabs, we want to keep track of
			// which tab is active and it's associated content
			var $active, $content, $links = $(this).find('a');

			// If the location.hash matches one of the links, use that as the active tab.
			// If no match is found, use the first link as the initial active tab.
			$active = $($links.filter('[href="'+location.hash+'"]')[0] || $links[0]);
			$active.addClass('active');
			$content = $($active.attr('href'));

			// Hide the remaining content
			$links.not($active).each(function () {
				$($(this).attr('href')).hide();
			});

			// Bind the click event handler
			$(this).on('click', 'a', function(e){
				// Make the old tab inactive.
				$active.removeClass('active');
				$content.hide();

				// Update the variables with the new link and content
				$active = $(this);
				$content = $($(this).attr('href'));

				// Make the tab active.
				$active.addClass('active');
				$content.show();

				// Prevent the anchor's default click action
				e.preventDefault();
			});
		});
		
	});	
	
</script>





<script type="text/javascript">
<!--//--><![CDATA[//><!--
$("html").addClass("js");
$(function() {
  $("#side").accordion({initShow : "#current"});
  $("#mainPageSummary").accordion({
      objID: "#acc1", 
      el: ".h", 
      head: "h3, h4", 
      next: "div", 
      initShow : "div.shown",
      standardExpansible : true
  });
  $("#mainPageSummary").accordion({
      objID: "#acc2", 
      obj: "div", 
      wrapper: "div", 
      el: ".h", 
      head: "h3, h4", 
      next: "div", 
      initShow : "div.shown",
      standardExpansible : true
    });
  //* ---
  $("#mainPageSummary .accordion").expandAll({
      trigger: ".h", 
      ref: "h4.h", 
      cllpsEl : "div.outer",
      speed: 200,
      oneSwitch : false,
      instantHide: false
  });
  //--- */
  /* -----------------------  
  $("#side ul.accordion").expandAll({
      trigger: "li", 
      ref: "", 
      cllpsEl : "ul", 
      state : '',
      oneSwitch : false
  });
  ------------------------ */ 
  $("html").removeClass("js");
});
//--><!]]>
</script>

<script>
	$(document).ready(function(){
		
		$('#footerContents').css('margin-bottom','10px');	
		
		
		
		$('.tabs li a').focus(function(){
			$(this).addClass('tabSelected').removeClass('tabNotSelected');
			$(this).parent('li').css('z-index','9999');
			$(this).parent('li').siblings().css('z-index','0');
			$(this).parent('li').next('li').css('z-index','1');
			
			
			$(this).find('.leftCorner').addClass('leftCornerBlue').removeClass('leftCornerGrey');
			$(this).find('.rightCorner').addClass('rightCornerBlue').removeClass('rightCornerGrey');
			
			
			$(this).parent('li').nextAll('li').find('a').addClass('tabNotSelected');
			$(this).parent('li').prevAll('li').find('a').addClass('tabNotSelected');
			
			
			$(this).parent('li').nextAll('li').children('a').find('.leftCorner').addClass('tabShadow').removeClass('leftCornerGrey leftCornerBlue');
			$(this).parent('li').nextAll('li').children('a').find('.rightCorner').addClass('rightCornerGrey').removeClass('rightCornerBlue');
			
			$(this).parent('li').prevAll('li').children('a').find('.leftCorner').addClass('leftCornerGrey').removeClass('leftCornerBlue tabShadow');
			$(this).parent('li').prevAll('li').children('a').find('.rightCorner').addClass('rightCornerGrey').removeClass('rightCornerBlue');
				
			$(this).find('.leftCorner').addClass('leftCornerBlue').removeClass('tabShadow');
						
		});
		
	
		
		
		
		$('<div class="borderHider"></div>').appendTo('h4.h');
			
		
		
		$('#map').css({'width':'100%','height':'100%'});
	});
</script>


</head>
<%

	//get the site_id based on wdpaid
	long selWdpaid = -1;
	boolean boolValidWDPA_ID = true;
	boolean boolEn = false;
	boolean boolFr = false;
	boolean boolEs = false;
	
	String siteddescription="";
	String Incdate="";
	String coutry_name="";
	String  site_ids="";
	String version_id="";
	
	String criteria="";
	String Sitecriteria="";
	String finalcriteria="";
	Date Date_publish=null;

	boolean isAssessmentInProgress = false;
	
	String rParameter_wdpaid = request.getParameter("wdpaid");
	String rParameter_language = request.getParameter("language");
	
	if(rParameter_language.toString().equalsIgnoreCase("en")){
		boolEn = true;
	}else if(rParameter_language.toString().equalsIgnoreCase("fr")){
		boolFr = true;
	}else if(rParameter_language.toString().equalsIgnoreCase("es")){
		boolEs = true;
	}
	
	try{
		selWdpaid = Long.parseLong(rParameter_wdpaid);
	}catch(NumberFormatException e){
		boolValidWDPA_ID = false;
		e.printStackTrace();
	}
	
	String ass_conser_outlook_str = "";
	String Imagefinalstring = "";	
	String siteName_en = "";
	Date dateOfCreation = null;
	Date dateOfInscription = null;
	long lastass_version_id=0;
	Map<String, Long> assessmntVersionLangMap = new HashMap<String, Long>();
	
	if(boolValidWDPA_ID){
		
		whp_sites selectedSite = whp_sitesLocalServiceUtil.getSiteByWdpaId(selWdpaid);
		assessmntVersionLangMap = utils.getLangVersionDetails(selectedSite.getSite_id());
		// See 'whp_assessment_status' table - 'In progress' status

		if(selectedSite.isInformation_updating()){
			isAssessmentInProgress = true;
		}

		
		site_ids=  Long.toString(selectedSite.getSite_id()); 
		
		if (assessmntVersionLangMap.containsKey(rParameter_language)) {
			lastass_version_id = assessmntVersionLangMap.get(rParameter_language);
			version_id=Long.toString(lastass_version_id);
			
		}
		siteName_en = selectedSite.getName_en();
		
		if(selectedSite.getCreation_date() != null){
			dateOfCreation = selectedSite.getCreation_date();
		}else{
			dateOfCreation = new Date("");
		}
		
		if(selectedSite.getInscription_date() != null){
			dateOfInscription = selectedSite.getInscription_date();
			 
/* 			Incdate=	selectedSite.getInscription_date().toString().substring(23);
 */			
		}else{
			dateOfInscription = new Date("");
		}
		
		List<country_lkp> lkpcntry=whp_sitesLocalServiceUtil.getCountryListBySiteId(selectedSite.getSite_id());
		
		
		whp_sites objwhp_sitesBasic=null;
		objwhp_sitesBasic=whp_sitesLocalServiceUtil.getwhp_sites(selectedSite.getSite_id());
		     
		
	  Incdate=	objwhp_sitesBasic.getInscription_date().toString().substring(23);
		
		for(int i=0;i<lkpcntry.size();i++)
		{
			coutry_name=lkpcntry.get(i).getName();
		}
        
		// to get criteria against a site 
		
		long Sid=objwhp_sitesBasic.getSite_id();
		

		List<whp_sites_inscription_criteria> lstcriteria=whp_sites_inscription_criteriaLocalServiceUtil.findbysite_id(Sid);
		
		inscription_criteria_lkp obj= new inscription_criteria_lkpClp(); 
		
		if(lstcriteria!=null && !lstcriteria.isEmpty())
		{
			for(int n=0;n<lstcriteria.size();n++)
			{
				obj=inscription_criteria_lkpLocalServiceUtil.getinscription_criteria_lkp(lstcriteria.get(n).getCriteria_id());
				criteria=obj.getCriteria();
				Sitecriteria = Sitecriteria+", "+criteria;

			}
			 finalcriteria=Sitecriteria.substring(1);
			 finalcriteria = "Criteria : "+finalcriteria;
		}
		
		
		
		//dateOfCreation = selectedSite.getCreation_date();
		//dateOfInscription = selectedSite.getInscription_date();
		
		/// code added on 23rd Mar2013
		
	/* 	if(lastass_version_id > 0){
			if(!conservation_outlookLocalServiceUtil.getconservationOutllokByVersion(lastass_version_id).isEmpty()){
				List<conservation_outlook> conserv_outlook_lst = conservation_outlookLocalServiceUtil.getconservationOutllokByVersion(lastass_version_id);
				conservation_outlook conservation_outlook_obj = conserv_outlook_lst.get(0);
				long conservation_outlook_rating = conservation_outlook_obj.getRating();
				if(conservation_outlook_rating > 0){
					conservation_outlook_rating_lkp obj_conservation_outlook_rating_lkp = conservation_outlook_rating_lkpLocalServiceUtil.getRatingByConservation_outlookId(conservation_outlook_rating);
					ass_conser_outlook_str = obj_conservation_outlook_rating_lkp.getCo_rating();
				}else{
					ass_conser_outlook_str = "Significant Concern";
				}
			}
		}else{
			ass_conser_outlook_str = "Significant Concern";
		} */

		
		/// code added on 8th Feb 2012
		
		//DLFolderConstants.DEFAULT_PARENT_FOLDER_ID;
		//ThemeDisplay themeDisplay = new ThemeDisplay();
		
		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		
		FileEntry fe = null;
		long thumbnailId = 0;
		
		if(selectedSite.getThumbnailid() !=0 && selectedSite.getThumbnailid() > 0){
			thumbnailId = selectedSite.getThumbnailid();
			try{
				if(DLAppServiceUtil.getFileEntry(thumbnailId)!=null){
					fe = DLAppServiceUtil.getFileEntry(thumbnailId);
				}
			}catch(Exception e){
				e.printStackTrace();
			}
			
			try {
				if(DLUtil.getFileEntryImage(fe,themeDisplay) != null){
					String feString = DLUtil.getFileEntryImage(fe,themeDisplay);
					String feUuid = fe.getUuid();
					
					String strPortalURL = themeDisplay.getPortalURL();
					String strScopeGroupId = String.valueOf(themeDisplay.getScopeGroupId()); 
					
					Imagefinalstring = "";
					Imagefinalstring = strPortalURL + "/c/document_library/get_file?uuid=" + feUuid + "&groupId=" + strScopeGroupId;
				}
			} catch(NullPointerException npe) {
				npe.printStackTrace();
			}
			
		}
	}
	
%>

<% 

List<whp_sites> lst_whp_sites2=new ArrayList<whp_sites>();
lst_whp_sites2= (List<whp_sites>)session.getAttribute("lst_whp_sites");

PortletURL backURL = liferayPortletResponse.createRenderURL();
backURL.setParameter("jspPage", "/view.jsp");
backURL.setParameter("isSearch", "Y");
pageContext.setAttribute("lst_whp_sites", lst_whp_sites2,PageContext.REQUEST_SCOPE);
%>	               

<c:set var="site_id" value="<%=site_ids %>"/> 	

<portlet:resourceURL var="pdfURL">
<portlet:param name="ACTION_CMD" value= "GETPDF" />
<portlet:param name="SITE_ID" value= "<%=site_ids %>" />
<portlet:param name="VERSION_ID" value="<%=version_id %>" />
</portlet:resourceURL>

<!-- Wrapper Starts here-->
<div id="wrapper">



<div class="siteDescriptionPageBannerContent">


	
<div class="siteimage">
<%--
<img src="<%=Imagefinalstring%>"/>
--%>
<% if(Imagefinalstring.isEmpty()){ %>

 <img src="${pageContext.request.contextPath}/images/sampleimg22.jpg" />
 
 <%}else{ %>
  
  <img src="<%=Imagefinalstring%>"/>
  
  <%} %>
</div>


<div class="SiteassesementImage">
<h2 class="siteHeading"><%=siteName_en%>
<div class="siteadditionalinfo">
<span class="countryname"><%=coutry_name%></span>,&nbsp;Inscribed in&nbsp;<span class="authorInfo"><%=Incdate%></span>
<br/>
<Span class="countryname"><%=finalcriteria%></Span>

</div>
</h2>
<%
if(lastass_version_id > 0){
	if(!conservation_outlookLocalServiceUtil.getconservationOutllokByVersion(lastass_version_id).isEmpty()){
		List<conservation_outlook> conserv_outlook_lst = conservation_outlookLocalServiceUtil.getconservationOutllokByVersion(lastass_version_id);
		conservation_outlook conservation_outlook_obj = conserv_outlook_lst.get(0);
		long conservation_outlook_rating = conservation_outlook_obj.getRating();
		if(conservation_outlook_rating > 0){
			conservation_outlook_rating_lkp obj_conservation_outlook_rating_lkp = conservation_outlook_rating_lkpLocalServiceUtil.getRatingByConservation_outlookId(conservation_outlook_rating);
			ass_conser_outlook_str = obj_conservation_outlook_rating_lkp.getCo_rating();
		}

%>

<% if(ass_conser_outlook_str.equals("Good")){ %>

  <div class="goodAssesment"></div>

<% } else if(ass_conser_outlook_str.equals("Good with some concerns")) {%>
  
  <div class="gwscAssesment"></div>
  
<% } else if(ass_conser_outlook_str.equals("Significant Concern")) {%>
  
  <div class="significantCAssesment"></div>
<% } else if(ass_conser_outlook_str.equals("Critical")) {%>
  
  <div class="critical"></div>
<% } else if(ass_conser_outlook_str.equals("Data Deficient")) {%>
  
  <div class="DDAssesment"></div>
  
<%} %>
<%} %>
<%} %>

</div>


</div>



<!--mainBlockSiteAssessmentPublicPages starts here-->
	<div class="mainBlockSiteAssessmentPublicPages">
	
	
<!--siteAssessmentPublicPageLeftBlock starts here-->
		<div class="siteAssessmentPublicPageLeftBlock">

			<div class="left">
				<h1 class="pageHeaderTitle"><%=siteName_en %></h1>
			</div>
			<div>
				<% if ( isAssessmentInProgress ) { %>
				<p class="siteAssessmentNotificationBlock">* New information has been received for this site. Update due soon.</p>
				<% } %>
			</div>

			<p class="siteAssessmentPublicPageInfo">
				Learn more about the state of conservation of this natural World Heritage site by scrolling down to
				read assessment summaries.More details can be found by navigating to the "Full references" tab,
				where conservation issues, benefits and projects are cited alongside values, threats, and protection
				and management.Sources of information are listed under references.
			</p>

			<ul class='tabs'>
				<li class="selectedTabLi">
					<a href='#tab1' class="tab tabSelected tabIndex" tabindex="1000">
						<span class="leftCorner leftCornerBlue"></span>
						<span class="rightCorner rightCornerBlue"></span>
						Summary
					</a>
				</li>

				<li>
					<a href='#tab2' class="tab" tabindex="1001">
						<span class="leftCorner tabShadow"></span>
						<span class="rightCorner rightCornerGrey"></span>
						Full assessment
					</a>
				</li>

				<li>
					<a href='#tab3' class="tab" tabindex="1002">
						<span class="leftCorner tabShadow"></span>
						<span class="rightCorner rightCornerGrey"></span>
						References
					</a>
				</li>
			</ul>
	<div class="backBtnHolder">
	<a href="<%= backURL%>" class="backBtn">Back to Search</a>
		
		 	 	
			
		</div>
		
		
<div class="siteAssessmentInfoWrapper">
<!-- 	<ul class='tabs'>	
		 <li><a href="#" class="tab tabSelected tabIndex" tabindex="1000">Summary</a><span class="bottomRoundedCorner"></span></li>
		 <li><a href="#" class="tab" tabindex="2000">Full assessment</a><span class="bottomRoundedCorner"></span></li>
		 <li><a href="#" class="tab" tabindex="3000">References</a><span class="bottomRoundedCorner"></span></li>
	</ul> -->	
	
	
	
	
	
	
	
	
<div id='tab1'>

<div class="innerSection">

<div class="tab1InnerSection">


		
	<h2 class="conservationOutlookH2">
	
		<div id="publish_date">
		<%
		String publish_date = "";
		System.out.println("Version ID = "+version_id);

		if (!version_id.isEmpty()) {
			List<assessment_lang_version> lstlangversion = assessment_lang_versionLocalServiceUtil.findByAssessmentIdByAssessmentVersionId(Long.parseLong(version_id));

			for(assessment_lang_version varpublishdate:lstlangversion) {

				if(varpublishdate.isPublished()) {
					publish_date = varpublishdate.getPublished_date().toGMTString().substring(0,11);
				}

				break;
			}
		}

		%>
		
	   <span class="Publishdateclass">Finalised on <%=publish_date%></span>
	
		</div>
	
	Conservation Outlook</h2>
	<%
		if(!conservation_outlookLocalServiceUtil.getconservationOutllokByVersion(lastass_version_id).isEmpty()){
			
					
						List<conservation_outlook> lst_conserv_outlook = conservation_outlookLocalServiceUtil.getconservationOutllokByVersion(lastass_version_id);
						conservation_outlook obj_conservation_outlook = lst_conserv_outlook.get(0);
						String justification = obj_conservation_outlook.getJustification();
						
						long conservation_outlook_rating = obj_conservation_outlook.getRating();
						String str_conservation_outlook_rating = "";
						if(conservation_outlook_rating > 0){
							conservation_outlook_rating_lkp obj_conservation_outlook_rating_lkp = conservation_outlook_rating_lkpLocalServiceUtil.getRatingByConservation_outlookId(conservation_outlook_rating);
							str_conservation_outlook_rating = obj_conservation_outlook_rating_lkp.getCo_rating();
						}
		%>			
	<h4><%=str_conservation_outlook_rating %></h4>	
	<p><%=justification%></p>
 		<%	} else{%>
 	<h4></h4>	
	<p></p>
	<%
 		}
	%>
</div>	
	
	<div class="assessmentBlock">
	
		<div class="assessmentSubBlock">
			<div class="assessmentType">
				<h3>Values</h3>
				<%
				if(!state_trend_whvaluesLocalServiceUtil.getstateValueEntriesByassessmentId(lastass_version_id).isEmpty()){
					
					
					List<state_trend_whvalues> lst_state_trend_whvalues = state_trend_whvaluesLocalServiceUtil.getstateValueEntriesByassessmentId(lastass_version_id);
					state_trend_whvalues obj_state_trend_whvalues = lst_state_trend_whvalues.get(0);
					String stateValuejustification = obj_state_trend_whvalues.getJustification();
					
					state_lkp objstate_lkp = state_lkpLocalServiceUtil.getStateFromstate_id(obj_state_trend_whvalues.getState_id());
					trend_lkp objtrend_lkp = trend_lkpLocalServiceUtil.getTrendFromtrend_id(obj_state_trend_whvalues.getTrend_id());
				%>
				
				<% if(objstate_lkp.getState().equals("Good")){ %>
				
				
				<div class="darkgreen"></div>
				<span><%=objstate_lkp.getState() %></span>
				<span>Trend: <%=objtrend_lkp.getTrend() %></span>
				
				
				<%}else if(objstate_lkp.getState().equals("Low Concern")){ %>
				
				
				<div class="lightgreen"></div>
				<span><%=objstate_lkp.getState() %></span>
				<span>Trend: <%=objtrend_lkp.getTrend() %></span>
				
				
			   <%}else if(objstate_lkp.getState().equals("High Concern")){ %>
			   
			   
				<div class="orange"></div>
				<span><%=objstate_lkp.getState() %></span>
				<span>Trend: <%=objtrend_lkp.getTrend() %></span>
				
				
			   <%}else if(objstate_lkp.getState().equals("Critical")){ %>
			   
			   
			    <div class="red"></div>
				<span><%=objstate_lkp.getState() %></span>
				<span>Trend: <%=objtrend_lkp.getTrend() %></span>
				
	  
	    	   <%}else if(objstate_lkp.getState().equals("Data deficient")){ %>
	    	   
	    	    <div class="gray"></div>
				<span><%=objstate_lkp.getState() %></span>
				<span>Trend: <%=objtrend_lkp.getTrend() %></span>
				
				<%} %>
				
				<%} %>
				
				
				
			</div>
			<div class="assessmentDescription">
			<%
			if(!state_trend_whvaluesLocalServiceUtil.getstateValueEntriesByassessmentId(lastass_version_id).isEmpty()){
	
				
					List<state_trend_whvalues> lst_state_trend_whvalues = state_trend_whvaluesLocalServiceUtil.getstateValueEntriesByassessmentId(lastass_version_id);
					state_trend_whvalues obj_state_trend_whvalues = lst_state_trend_whvalues.get(0);
					String stateValuejustification = obj_state_trend_whvalues.getJustification();
					
					state_lkp objstate_lkp = state_lkpLocalServiceUtil.getStateFromstate_id(obj_state_trend_whvalues.getState_id());
					trend_lkp objtrend_lkp = trend_lkpLocalServiceUtil.getTrendFromtrend_id(obj_state_trend_whvalues.getTrend_id());
				%>
				<h6>Current state and Trend of values</h6>
				<span><%=objstate_lkp.getState()%></span>
				<p><%=stateValuejustification%>	</p>
				<%	} else{%>
				<h6>Current state and Trend of values</h6>
				<span class="natxt">NA</span>
				<p>	</p>
				<%
				}
				%>
			</div>
		</div>
		
		
		
		<div class="assessmentSubBlock">
			<div class="assessmentType">
				<h3>Threats</h3>
				<%
			if(!threat_summary_overallLocalServiceUtil.getthreatoverallByAssessmentId(lastass_version_id).isEmpty()){
				List<threat_summary_overall> lst_threat_summary_overall = threat_summary_overallLocalServiceUtil.getthreatoverallByAssessmentId(lastass_version_id);
				threat_summary_overall obj_threat_summary_overall = lst_threat_summary_overall.get(0);
				
				long overall_rating = obj_threat_summary_overall.getThreat_rating();
				threat_rating_lkp objOverall_rating= new threat_rating_lkpClp();
				if(overall_rating > 0){
					 objOverall_rating= threat_rating_lkpLocalServiceUtil.getRatingBythreat_ratingId(overall_rating);
					
				}
							
		%>
		
		<%if(objOverall_rating.getRating().equals("Very Low Threat")){ %>
	
			<div class="darkgreen"></div>
			<span><%=objOverall_rating.getRating() %></span>
				
		<%}else if(objOverall_rating.getRating().equals("Low Threat")){ %>
		    
		    <div class="lightgreen"></div>
			<span><%=objOverall_rating.getRating() %></span>
		
		<%}else if(objOverall_rating.getRating().equals("High Threat")){ %>
		    
		    <div class="orange"></div>
			<span><%=objOverall_rating.getRating() %></span>
			
			
		<%}else if(objOverall_rating.getRating().equals("Very High Threat")){ %>
		    
		    <div class="red"></div>
			<span><%=objOverall_rating.getRating() %></span>
			
		<%}else if(objOverall_rating.getRating().equals("Data Deficient")){ %>
		    
		    <div class="gray"></div>
			<span><%=objOverall_rating.getRating() %></span>
			
		<%} %>
			
			<%} %>
			
					
			</div>
			
			<div class="assessmentDescription">
			<%
			if(!threat_summary_overallLocalServiceUtil.getthreatoverallByAssessmentId(lastass_version_id).isEmpty()){
				List<threat_summary_overall> lst_threat_summary_overall = threat_summary_overallLocalServiceUtil.getthreatoverallByAssessmentId(lastass_version_id);
				threat_summary_overall obj_threat_summary_overall = lst_threat_summary_overall.get(0);
				String threat_overall_summary = obj_threat_summary_overall.getOverall_threat();
				
				long overall_rating = obj_threat_summary_overall.getThreat_rating();
				String str_overall_rating = "";
				if(overall_rating > 0){
					threat_rating_lkp objOverall_threat_rating_lkp = threat_rating_lkpLocalServiceUtil.getRatingBythreat_ratingId(overall_rating);
					str_overall_rating = objOverall_threat_rating_lkp.getRating();
				}
		%>
				<h6>Overall Threats</h6>
				<span><%=str_overall_rating %></span>
				<p><%=threat_overall_summary %></p>
				<%	} else{%>
				<h6>Overall Threats</h6>
				<span></span>
				<p>	</p>
				<%
				}
				%>
			</div>
		</div>
		
		<div class="assessmentSubBlock">
				<div class="assessmentType">
				<h3>Protection and Management</h3>
				<% 
				if(!prot_mgmt_overallLocalServiceUtil.getprotmgmtoverallByVersion(lastass_version_id).isEmpty()){
					
					List<prot_mgmt_overall> lst_prot_mgmt_overall = prot_mgmt_overallLocalServiceUtil.getprotmgmtoverallByVersion(lastass_version_id);
					prot_mgmt_overall obj_prot_mgmt_overall = lst_prot_mgmt_overall.get(0);
                 
					long prot_overall_rating = obj_prot_mgmt_overall.getRating();
					
					protection_management_ratings_lkp objprot_ratings_lkp = new protection_management_ratings_lkpClp();
					
					if(prot_overall_rating > 0){
						objprot_ratings_lkp = protection_management_ratings_lkpLocalServiceUtil.getRatingByProtRating(prot_overall_rating);
					}
					%>
					
		    	<%if(objprot_ratings_lkp.getPm_rating().equals("Highly Effective")){ %>
		    	
					
				<div class="darkgreen"></div>
				<span><%=objprot_ratings_lkp.getPm_rating() %></span>
 		    	
 		    	<%}else if(objprot_ratings_lkp.getPm_rating().equals("Effective")){ %>
 
 				<div class="lightgreen"></div>
				<span><%=objprot_ratings_lkp.getPm_rating() %></span>
                
				
				<%}else if(objprot_ratings_lkp.getPm_rating().equals("Some Concern")){ %>
 
 				<div class="orange"></div>
				<span><%=objprot_ratings_lkp.getPm_rating() %></span>                 
                 
                
                 <%}else if(objprot_ratings_lkp.getPm_rating().equals("Serious Concern")){ %>
 
 				<div class="red"></div>
				<span><%=objprot_ratings_lkp.getPm_rating() %></span>
				
				<%}else if(objprot_ratings_lkp.getPm_rating().equals("Data Deficient")){ %>
 
 				<div class="gray"></div>
				<span><%=objprot_ratings_lkp.getPm_rating() %></span>
				
				<%} %>
				<%} %>
				
    			</div>
			<div class="assessmentDescription">
			<% 
				if(!prot_mgmt_overallLocalServiceUtil.getprotmgmtoverallByVersion(lastass_version_id).isEmpty()){
					
					List<prot_mgmt_overall> lst_prot_mgmt_overall = prot_mgmt_overallLocalServiceUtil.getprotmgmtoverallByVersion(lastass_version_id);
					prot_mgmt_overall obj_prot_mgmt_overall = lst_prot_mgmt_overall.get(0);
					String prot_overall_justification = obj_prot_mgmt_overall.getJustification();
										long prot_overall_rating = obj_prot_mgmt_overall.getRating();
					String str_prot_overall_rating = "";
					if(prot_overall_rating > 0){
						protection_management_ratings_lkp objprotection_management_ratings_lkp = protection_management_ratings_lkpLocalServiceUtil.getRatingByProtRating(prot_overall_rating);
						str_prot_overall_rating = objprotection_management_ratings_lkp.getPm_rating();
					}
				%>
				<h6>Overall Protection and management</h6>
				<span><%=str_prot_overall_rating %></span>
				<p><%=prot_overall_justification %>
				</p>
				<%	} else{%>
				<h6>Overall Protection and management</h6>
				<span></span>
				<p>	</p>
				<%
				}
				%>
			</div>
		</div>
	</div>
</div>	
</div>



<!--tab2 starts here-->
<div id='tab2'>		 
				 <div class="summarygistbdrHolder">          			
				 <div id="mainPageSummary">              							  
                    <div class="accordion" id="acc2">	

					
					<!-- Values -->	
					
					
					<!-- blockTitleSubHeadingsHolder Starts Here -->	


					
		<div class="blockTitleSubHeadingsHolder">					
                      <div class="inner shown">
						  <div class="titleAssesmentSection">	
			<p>Click the + and - signs to expand or collapse full accounts of information under each topic. You can also view the entire list of information by clicking Expand all on the top left.</p>
					
						</div>	
						  
						<h2 class="blockTitleHeading">Assessment Information

							<div id="publish_date">

								<span class="Publishdateclass">Finalised on <%=publish_date%></span>
							</div>

						</h2>

						<h3>Values</h3>
								
						 
						 
					
					    <div class="summarygistbdr">
				
						<div class="assessmentInfoValueContentHolder">
						
						<div class="summarygistbdr_01">
			   
			   <%
			 			String svJustification = null;
						String state_string = "";
						String trend_string = "";
			 				  	if(!state_trend_whvaluesLocalServiceUtil.getstateValueEntriesByassessmentId(lastass_version_id).isEmpty()){
			 				  		List<state_trend_whvalues> lst_state_trend_whvalues = state_trend_whvaluesLocalServiceUtil.getstateValueEntriesByassessmentId(lastass_version_id);
			 						state_trend_whvalues obj_state_trend_whvalues = lst_state_trend_whvalues.get(0);
			 						svJustification = obj_state_trend_whvalues.getJustification();
			 						
			 						long state_id = obj_state_trend_whvalues.getState_id();
			 						
			 						if(state_id > 0){
			 							state_lkp objstate_lkp = state_lkpLocalServiceUtil.getStateFromstate_id(obj_state_trend_whvalues.getState_id());
			 							state_string = objstate_lkp.getState();
			 						}
			 						long trend_id = obj_state_trend_whvalues.getTrend_id();
			 						if(trend_id > 0){
			 							trend_lkp objtrend_lkp = trend_lkpLocalServiceUtil.getTrendFromtrend_id(obj_state_trend_whvalues.getTrend_id());
			 							trend_string = objtrend_lkp.getTrend();
			 						}
			 				  %>
			 				  
			 				  <p><%=svJustification %> </p>
						<%
						}else{
						%>
						 <p class="natxtl1">
                        No justification avilable
						</p>
						<%
						}
						%>
						</div>	
				
			 
			         <div class="summarygistbdrStatus">
						
						<%if(!state_string.isEmpty()){ %>
						
						<span><%=state_string %></span>
						
						<%}else{ %>
						
						<span class="natxtstatus">NA</span>
						
						<%} %>
						
						</div>
				
						
						</div>
								
						
							<!-- Box 1 -->
													
							<div class="innerAccordionContentHolder">
							
						<h4 class="">World Heritage Values
							  <div class="conclusionh4">
							  
													 
						<%if(!state_string.isEmpty()){ %>
								<span class="lbltxt siteStatusValue"><%= state_string%></span>
								<%}else{ %>
							<span class="lbltxt siteStatusValue">NA</span>
								
								<%} %>
								
								  <%
							  if(!trend_string.isEmpty()){
							  %>
							 <span class="lbltxt"><span class="normal">Trend:</span> <%=trend_string %></span>
							 
							 <%}else{ %>
							 
						 <span class="lbltxt"><span class="normal">Trend:</span> NA</span>
						 <%
						 }
						 %>
										
							  </div>						  
							  
						 </h4>
							  
							  
                              <div class="inner">
							  					
							  						  
							   <!-- <span class="TitleHeadertxt01">Description</span>
								<p class="summarytxt03">
								Overall, the property is currently only affected by low and very low threats, with the exception of poaching. Some of these (grazing, climate change) require further study and enhanced monitoring to ensure that they are and remain within acceptable limits.
								</p> -->
								
													
								
						 <div class="innerAccordionContentHolder_level2">
						 <% 
						    	if(!assessment_whvaluesLocalServiceUtil.getEntriesByAssessmentVersionId(lastass_version_id).isEmpty() && !state_trend_whvaluesLocalServiceUtil.getstateValueEntriesByassessmentId(lastass_version_id).isEmpty()){
						    		List<assessment_whvalues> lst_assessment_whvalues = assessment_whvaluesLocalServiceUtil.getEntriesByAssessmentVersionId(lastass_version_id);
  						    		List<current_state_trend>  	lstcurrent_state_trend = site_assessmentLocalServiceUtil.getCurrent_state_trendByVersion(lastass_version_id);

	                      			
	                      			for(assessment_whvalues objassessment_whvalues : lst_assessment_whvalues){
										String values = objassessment_whvalues.getValues();
										String description_str = objassessment_whvalues.getDescription();
										String justi_of_assessmnt = "";
										//long vnId = objassessment_whvalues.getVn();
										long whvalueid=objassessment_whvalues.getWhvalues_id();
										//long state_trend_whval_id = 0;
										long curre_statevn=0;
										long state_id = 0;
										long trend_id = 0;
										String str_trend_id = "";
										String str_state_id = "";
										
										
										
										 
										 for(current_state_trend  objcur_state_trend:lstcurrent_state_trend)
										 {
										    curre_statevn=objcur_state_trend.getVn();
										 if(whvalueid==curre_statevn)
										 {
											 justi_of_assessmnt = objcur_state_trend.getJustification();
												state_id = objcur_state_trend.getState_id();
												trend_id = objcur_state_trend.getTrend_id();
												break;
										 }
										 }
										 
										
										boolean bool4state = false;
										boolean bool4trend = false;
										if(state_id!=0){
											bool4state = true;
											state_lkp obj_state_lkp = state_lkpLocalServiceUtil.fetchstate_lkp(state_id);
											str_state_id = obj_state_lkp.getState();
										}
										if(trend_id!=0){
											bool4trend = true;
											trend_lkp obj_trend_lkp = trend_lkpLocalServiceUtil.fetchtrend_lkp(trend_id);
											str_trend_id = obj_trend_lkp.getTrend();
										}
								 
										%>
										
					    	 <h5 class=""><span class="lbl2"><%=values %></span>					    	 
					    	  <div class="conclusionh5">
							  
							  <%if(!str_state_id.isEmpty()){ %>
								<span class="lbltxt siteStatusValue"><%=str_state_id %></span>
								<%}else{ %>
								<span class="lbltxt siteStatusValue">NA</span>
								<%} %>
								
								<%if(!str_trend_id.isEmpty()){ %>
								
								<span class="lbltxt siteStatusValue"><%=str_trend_id %></span>
								
								<%}else{ %>
								
								<span class="lbltxt siteStatusValue">NA</span>
								
								<%} %>
								
							  </div>
							   </h5>
							  
                              <div class="inner">
                              	
                              
                              <%if(!description_str.isEmpty()){ %>
                              
								<p class="summarytxt03">
								<%=description_str %>
								</p>
							  
							  <%}else{ %>
							  
							   <p class="natxtl2">
							    
								</p> 
								<%} %>
								
								
                              </div>
                              
                              <%} %>
                              <% }else{%>
                              <div class="notfound">
						     
						   </div>
                              <%} %>
						</div>
					
						
								
								
                              </div>
						</div>
						
						
						
								<div class="innerAccordionContentHolder">
						<h4 class="">Other Biodiversity values
						
							<%
			 			String bioJustification = "";
						String biostate_string = "";
						String biotrend_string = "";
			 				  	if(!state_trend_biodivvalsLocalServiceUtil.getEntriesFromAssessment_versionId(lastass_version_id).isEmpty()){
			 				  		List<state_trend_biodivvals> lst_state_trend_biodivvals =state_trend_biodivvalsLocalServiceUtil.getEntriesFromAssessment_versionId(lastass_version_id);
			 				  		state_trend_biodivvals obj_state_trend_biodivvals=lst_state_trend_biodivvals.get(0);
			 				  		
			 				  		long state_id=obj_state_trend_biodivvals.getState_id();
			 				  		
			 				  		if(state_id > 0){
			 							state_lkp objstate_lkp = state_lkpLocalServiceUtil.getStateFromstate_id(obj_state_trend_biodivvals.getState_id());
			 							biostate_string = objstate_lkp.getState();
			 						}
			 				  		
			 				  		long trend_id=obj_state_trend_biodivvals.getTrend_id();
			 				  		
			 				  		if(trend_id > 0){
			 							trend_lkp objtrend_lkp = trend_lkpLocalServiceUtil.getTrendFromtrend_id(obj_state_trend_biodivvals.getTrend_id());
			 							trend_string = objtrend_lkp.getTrend();
			 						}
			 				  		
			 				  %>
						<%
			 				  	}
						%>
							  <div class="conclusionh4">
							 				  
							  
							  <%if(!biostate_string.isEmpty()){ %>
								<span class="lbltxt siteStatusValue"><%=biostate_string %></span>
								<%}else{ %>
                                <span class="lbltxt siteStatusValue">NA</span>
                                <%} %>
                                
                                 <%if(!biotrend_string.isEmpty()){ %>
							  <span class="lbltxt"><span class="normal">Trend:</span> <%=biotrend_string %></span>
							  <%}else{ %>
							  <span class="lbltxt"><span class="normal">Trend:</span> NA</span>
							  <%} %>
                                											
							  </div>						  
							  
							  </h4>
							  
                              <div class="inner">
							  						  
							 <!--   <span class="TitleHeadertxt01">Description</span>
								<p class="summarytxt03">
								
								
								Overall, the property is currently only affected by low and very low threats, with the exception of poaching. Some of these (grazing, climate change) require further study and enhanced monitoring to ensure that they are and remain within acceptable limits.
								</p> -->
								
													
								
								<div class="innerAccordionContentHolder_level2">
								 <%
						  	if(!biodiversity_valuesLocalServiceUtil.getValeusByAssessment_VersionId(lastass_version_id).isEmpty()){
						  		List<biodiversity_values> lstbiodiversity_values = biodiversity_valuesLocalServiceUtil.getValeusByAssessment_VersionId(lastass_version_id);
					    		List<current_state_trend>  	lstcurrent_state_trend = site_assessmentLocalServiceUtil.getCurrent_state_trendByVersion(lastass_version_id);
					    		
					    		

						  		for(biodiversity_values biodiversity_Values_obj : lstbiodiversity_values){
							  		String biodiversity_descrpt = biodiversity_Values_obj.getDescription();
							  		String value_bio=biodiversity_Values_obj.getValue();
							  		String justificationasmnt="";
							  		 long current_statevn=0;
							  		 
							  		 long satateid=0;
							  		 long tradeid=0;
							  		 
							  		 String strstate_id="";
							  		  String strtrend_id="";
							  		
							  		long bio_id=biodiversity_Values_obj.getId();
							  		
							  		 for(current_state_trend  objcur_state_trend:lstcurrent_state_trend)
									 {
							  			current_statevn=objcur_state_trend.getVn();
									 if(bio_id==current_statevn)
									 {
										 justificationasmnt = objcur_state_trend.getJustification();
										 satateid = objcur_state_trend.getState_id();
										 tradeid = objcur_state_trend.getTrend_id();
											break;
									 }
									 }
							  		 
							  		if(satateid!=0){
										
										state_lkp obj_state_lkp = state_lkpLocalServiceUtil.fetchstate_lkp(satateid);
										strstate_id = obj_state_lkp.getState();
									}
									if(tradeid!=0){
										trend_lkp obj_trend_lkp = trend_lkpLocalServiceUtil.fetchtrend_lkp(tradeid);
										strtrend_id = obj_trend_lkp.getTrend();
									}
							  		
						  %>
						  
						<h5 class=""><span class="lbl2"><%=value_bio %></span>
							  	<div class="conclusionh5">
							 
							 
							    
							    <%if(!strstate_id.isEmpty()){ %>
							    	<span class="lbltxt siteStatusValue"><%=strstate_id %></span>
							     <%}else{ %>
							     <span class="lbltxt siteStatusValue">NA</span>
							     <%} %>
							     
							     
							     <%if(!strtrend_id.isEmpty()){ %> 
							   <span class="lbltxt"><span class="normal">Trend:</span> <%=strtrend_id %></span>
							   <%}else{ %>
							   <span class="lbltxt"><span class="normal">Trend:</span> NA</span>
							   <%} %>
							   
							     
							  </div>					  
							  
							  </h5>
							  
                              <div class="inner">
                              
							 <%if(!justificationasmnt.isEmpty()){ %>
								<p class="summarytxt03">
								<%=justificationasmnt %>
								</p>
							  <%}else{ %>
							  <p class="summarytxt03">
							  
							  
							  </p>
							  <%} %>
							  
							  </div>
                              <%} %>
                              <%}else{ %>
                               <div class="notfound">
						   						   </div>
                            
                            <%} %> 
                              
						</div>
						
						
								
                              </div>
						</div>
						<!-- Box 2 -->  

						</div>
						
						
                                
							
							
							
							
							
							
							<h3>Threats</h3>
					
			
			
						    <div class="summarygistbdr">
					
						<div class="assessmentInfoValueContentHolder">
						
						<div class="summarygistbdr_01">
			   
			     		<%
						String threat_overall_summary ="";
						String str_overall_rating = "";
									if(!threat_summary_overallLocalServiceUtil.getthreatoverallByAssessmentId(lastass_version_id).isEmpty()){
										List<threat_summary_overall> lst_threat_summary_overall = threat_summary_overallLocalServiceUtil.getthreatoverallByAssessmentId(lastass_version_id);
										threat_summary_overall obj_threat_summary_overall = lst_threat_summary_overall.get(0);
										 threat_overall_summary = obj_threat_summary_overall.getOverall_threat();
										
										long overall_rating = obj_threat_summary_overall.getThreat_rating();
							
										if(overall_rating > 0){
											threat_rating_lkp objOverall_threat_rating_lkp = threat_rating_lkpLocalServiceUtil.getRatingBythreat_ratingId(overall_rating);
											str_overall_rating = objOverall_threat_rating_lkp.getRating();
										}
										
								%>
								<%
									}
								%>
			          
			            <%if(!threat_overall_summary.isEmpty()) {%>
			 			  <p>
			   				<%= threat_overall_summary%>		
				   		</p>
				   		
				   		<%}else{ %>
						<p>
						NA
						</p>
                     
                      <%} %>
									
						</div>	
				
			<div class="summarygistbdrStatus">
						
						<%if(!str_overall_rating.isEmpty()){ %>
						
						<span><%= str_overall_rating%></span>
						<%}else{ %>
						
						<span>NA</span>
						
						<%} %>
						
						</div>
				
						
						</div>
								
						
							<!-- Box 1 -->
													
							<div class="innerAccordionContentHolder">
						<h4>Current Threats
							<%
						String tc_summary ="";
						String str_current_rating = "";
						if(!threat_summary_currentLocalServiceUtil.getthreat_summary_currentByAssessmentId(lastass_version_id).isEmpty()){
							List<threat_summary_current> lst_threat_summary_current = threat_summary_currentLocalServiceUtil.getthreat_summary_currentByAssessmentId(lastass_version_id);
							threat_summary_current obj_threat_summary_current = lst_threat_summary_current.get(0);
							tc_summary = obj_threat_summary_current.getOverall_current();
							
							long current_rating = obj_threat_summary_current.getThreat_rating();
							
							if(current_rating > 0){
								threat_rating_lkp objCurrent_threat_rating_lkp = threat_rating_lkpLocalServiceUtil.getRatingBythreat_ratingId(current_rating);
								str_current_rating = objCurrent_threat_rating_lkp.getRating();
							}
					%>
					<%
						}
					%>
							  <div class="conclusionh4">
							  
							  <%if(!str_current_rating.isEmpty()){ %>
							  <span class="lbltxt siteStatusValue"><%=str_current_rating %></span>
								
							<%}else{ %>	
							
							<span class="natxt">NA</span>
							
							<%} %>
											
							  </div>						  
							  
							  </h4>
							  
                              <div class="inner">
							  							  						  
							   <span class="TitleHeadertxt01"></span>
							   
							   <%if(!tc_summary.isEmpty()){ %>
								<p class="summarytxt03">
								<%=tc_summary %>
								</p>
								
								<%}else{ %>
								<p class="natxtl1">
								NA
								</p>
								<%} %>
													
								
								<div class="innerAccordionContentHolder_level2">
										<%
					     	if(!assessing_threats_currentLocalServiceUtil.getEntriesByAssessment_versionId(lastass_version_id).isEmpty()){
					     		List<assessing_threats_current> lst_assessing_threats_current = assessing_threats_currentLocalServiceUtil.getEntriesByAssessment_versionId(lastass_version_id);
								for(assessing_threats_current obj_assessing_threats_current : lst_assessing_threats_current){
									long current_threat_id = obj_assessing_threats_current.getCurrent_threat_id();
									String current_justification = obj_assessing_threats_current.getJustification();
									long curr_threat_rating = obj_assessing_threats_current.getThreat_rating_id();
									
									String str_curr_threat_rating = "";
									if(curr_threat_rating > 0){
										threat_rating_lkp obj_curr_threat_rating_lkp = threat_rating_lkpLocalServiceUtil.fetchthreat_rating_lkp(curr_threat_rating);
										str_curr_threat_rating = obj_curr_threat_rating_lkp.getRating();
									}
									
									List<current_threat_assessment_cat> lst_current_threat_assessment_cat = current_threat_assessment_catLocalServiceUtil.getEntriesByCurrent_threat_id(current_threat_id);
									for(current_threat_assessment_cat obj_current_threat_assessment_cat : lst_current_threat_assessment_cat){
										long curr_sub_cat_id = obj_current_threat_assessment_cat.getSub_cat_id();
										
										String str_curr_sub_cat = "";
										if(curr_sub_cat_id > 0){
											threat_subcategories_lkp obj_curr_threat_subcategories_lkp = threat_subcategories_lkpLocalServiceUtil.getthreat_subcategories_lkp(curr_sub_cat_id);
											str_curr_sub_cat = obj_curr_threat_subcategories_lkp.getThreat_sub_category();
										}
						
						%>
						
						<h5 class=""><span class="lbl2"><%=str_curr_sub_cat %></span>
							  <div class="conclusionh5">
							<span class="lbltxt siteStatusValue"><%=str_curr_threat_rating %></span>
							  </div>						  
						  </h5>
							  
                              <div class="inner">
						  	<p class="summarytxt03">
                            <%=current_justification %>
							</p>
						     </div>
						   <%} %>
						   <%} %>  
						   <%}else{%>
						   <div class="notfound">
						     
						   </div>
						   <%} %>
						  
						</div>
						
					
						
								
								
                              </div>
						</div>
						
						
						
						<div class="innerAccordionContentHolder">
						<h4>Potential Threats	
						 <%
							String tp_summary = "";
						 String str_potential_rating = "";
							if(!threat_summary_potentialLocalServiceUtil.getthreat_summary_potentialByAssessmentId(lastass_version_id).isEmpty()){
								List<threat_summary_potential> lst_threat_summary_potential = threat_summary_potentialLocalServiceUtil.getthreat_summary_potentialByAssessmentId(lastass_version_id);
								threat_summary_potential obj_threat_summary_potential = lst_threat_summary_potential.get(0);
								tp_summary = obj_threat_summary_potential.getOverall_potential();
								long potential_rating = obj_threat_summary_potential.getThreat_rating();
								
								
								if(potential_rating > 0){
									threat_rating_lkp objPotential_threat_rating_lkp = threat_rating_lkpLocalServiceUtil.getRatingBythreat_ratingId(potential_rating);
									str_potential_rating = objPotential_threat_rating_lkp.getRating();
								}
								
						%>
						
						<%}	%>
						
						<div class="conclusionh4">
						<%if(!str_potential_rating.isEmpty()){ %>
						<span class="lbltxt siteStatusValue">Low Concern</span>
						
						<%}else{ %>
						
						<span class="lbltxt siteStatusValue">NA</span>
						
						<%} %>			
				    	  </div>			  
					  </h4>
							  
                              <div class="inner">
							  
							  
							  <%if(!tp_summary.isEmpty()){ %>
							  
								<p class="summarytxt03">
								<%= tp_summary%>
								</p>		
							   <%}else{ %>
							   <p class="natxtl1">
								
								</p>
								
							   <%} %>
							   
							   
							    <div class="innerAccordionContentHolder_level2">
							    	    <%
							    if(!assessing_threats_potentialLocalServiceUtil.getEntriesByAssessmentVersionId(lastass_version_id).isEmpty() ) {
                      			List<assessing_threats_potential> lst_assessing_threats_potential = assessing_threats_potentialLocalServiceUtil.getEntriesByAssessmentVersionId(lastass_version_id);
                      			for(assessing_threats_potential obj_assessing_threats_potential : lst_assessing_threats_potential){
                              		long potential_threat_id = obj_assessing_threats_potential.getPotential_threat_id();
                              		String potential_justification = obj_assessing_threats_potential.getJustification();
                              		long pot_threat_rating = obj_assessing_threats_potential.getThreat_rating();
                              		
                              		String str_pot_threat_rating = "";
                              		if(pot_threat_rating > 0){
                              			threat_rating_lkp obj_pot_threat_rating_lkp = threat_rating_lkpLocalServiceUtil.fetchthreat_rating_lkp(pot_threat_rating);
       									str_pot_threat_rating = obj_pot_threat_rating_lkp.getRating();
                              		}
   									
   									List<potential_threat_assessment_cat> lst_potential_threat_assessment_cat = potential_threat_assessment_catLocalServiceUtil.getEntriesByPotential_threat_id(potential_threat_id);
   	   								for(potential_threat_assessment_cat obj_potential_threat_assessment_cat : lst_potential_threat_assessment_cat){
   	   									long pot_sub_cat_id = obj_potential_threat_assessment_cat.getSub_cat_id();
   	   									
   	   									String str_pot_sub_cat = "";
   	   									if(pot_sub_cat_id > 0){
   	   										threat_subcategories_lkp obj_pot_threat_subcategories_lkp = threat_subcategories_lkpLocalServiceUtil.fetchthreat_subcategories_lkp(pot_sub_cat_id);
   	   										str_pot_sub_cat = obj_pot_threat_subcategories_lkp.getThreat_sub_category();
   	   									}
   	   									
   	   						%> 
   	   						
						<h5 class=""><span class="lbl2"><%=str_pot_sub_cat %></span>
							  <div class="conclusionh5">
							 <span class="lbltxt siteStatusValue"><%=str_pot_threat_rating %></span>
							  </div>						  
					     </h5>
							  
                              <div class="inner">
							<p class="summarytxt03">
							<%=potential_justification %>
							</p>
							   </div>
							 
							 <%} %>
							 <%} %>
							 <%}else{ %>
							 
							 <div class="notfound">
						     
						   </div>
							 <%} %>  
						</div>
						
						
						
							
								
                              </div>
						</div>
						<!-- Box 2 -->  


						</div>
						
						
					
						<h3>Protection and management</h3>
						
						
					

			
						      <div class="summarygistbdr">
						
						<div class="assessmentInfoValueContentHolder">
						
						<div class="summarygistbdr_01">
						 <%
							String str_prot_overall_rating = "";
							String prot_overall_justification ="";
								if(!prot_mgmt_overallLocalServiceUtil.getprotmgmtoverallByVersion(lastass_version_id).isEmpty()){
									List<prot_mgmt_overall> lst_prot_mgmt_overall = prot_mgmt_overallLocalServiceUtil.getprotmgmtoverallByVersion(lastass_version_id);
									prot_mgmt_overall obj_prot_mgmt_overall = lst_prot_mgmt_overall.get(0);
								prot_overall_justification = obj_prot_mgmt_overall.getJustification();
									
									long prot_overall_rating = obj_prot_mgmt_overall.getRating();
									
									if(prot_overall_rating > 0){
										protection_management_ratings_lkp objprotection_management_ratings_lkp = protection_management_ratings_lkpLocalServiceUtil.getRatingByProtRating(prot_overall_rating);
										str_prot_overall_rating = objprotection_management_ratings_lkp.getPm_rating();
									}
									
							%>
			   
			      <%}%>
			   
			   <%if(!prot_overall_justification.isEmpty()){ %>
			        <p>
			        <%= prot_overall_justification%>
					</p>
				<%}else{ %>
				 <p class="natxtl1">
				 NA
				</p>
				<%} %>		

									
				</div>	
				
			<div class="summarygistbdrStatus">
			
			<% if(!str_prot_overall_rating.isEmpty()){ %>
		
			<span><%=str_prot_overall_rating %></span>
					
		    <%}else{ %>
		    
		   <span>NA</span>
		    	
		    <%} %>			
		    </div>
				
						
				</div>
								
						
							<!-- Box 1 -->
													
							<div class="innerAccordionContentHolder">
							
							<h4>Protection and management  
						   </h4>
							  
                              <div class="inner">
							  				
							<%--   <%
						  String prot_mgmt_best_descrp="";
						if(!prot_mgmt_best_practicesLocalServiceUtil.getBestpractEntriesByAssessmentId(lastass_version_id).isEmpty()){
							List<prot_mgmt_best_practices> lst_prot_mgmt_best_practices = prot_mgmt_best_practicesLocalServiceUtil.getBestpractEntriesByAssessmentId(lastass_version_id);
							prot_mgmt_best_practices obj_prot_mgmt_best_practices = lst_prot_mgmt_best_practices.get(0);
							 prot_mgmt_best_descrp = obj_prot_mgmt_best_practices.getDescription();
						%>
							<%} %>	  
							   <span class="TitleHeadertxt01"></span>
							   
							   <%if(!prot_mgmt_best_descrp.isEmpty()){ %>
							   
								<p class="summarytxt03">
								<%=prot_mgmt_best_descrp %>
								</p>
								
								<%}else{ %>
								
								<p class="natxtl1">
								NA
								</p>
								
								<%} %>
											 --%>		
								
								<div class="innerAccordionContentHolder_level2">
								
								  <%
							if(!protection_managementLocalServiceUtil.findByAssessementVersionId(lastass_version_id).isEmpty()){
								List<protection_management> lst_protection_management = protection_managementLocalServiceUtil.findByAssessementVersionId(lastass_version_id);
								for(protection_management obj_protection_management : lst_protection_management){
									long topic_Id = obj_protection_management.getTopic_id();
									String protection_justification = obj_protection_management.getJustification();
									long protection_rating_id = obj_protection_management.getRating();
									
									String str_topic = "";
									if(topic_Id > 0){
										protection_mgmt_checklist_lkp obj_protection_mgmt_checklist_lkp = protection_mgmt_checklist_lkpLocalServiceUtil.fetchprotection_mgmt_checklist_lkp(topic_Id);
										if(obj_protection_mgmt_checklist_lkp !=null){
											str_topic = obj_protection_mgmt_checklist_lkp.getTopic();
										}
									}
									
									String str_protect_rating = "";
									if(protection_rating_id > 0){
										protection_management_ratings_lkp obj_protection_management_ratings_lkp = protection_management_ratings_lkpLocalServiceUtil.fetchprotection_management_ratings_lkp(protection_rating_id);
										str_protect_rating = obj_protection_management_ratings_lkp.getPm_rating();
									}
									
						%> 
						
						<h5 class=""><span class="lbl2"><%=str_topic %></span>
							  <div class="conclusionh5">
							  
								<span class="lbltxt siteStatusValue"><%=str_protect_rating %></span>
							  </div>						  
							   </h5>
							  
                              <div class="inner">
							 	<p class="summarytxt03">
							 	<%=protection_justification %>
								</p>
							  </div>
							  <%} %>
							  <%}else{ %>
							  
							  
						  <div class="notfound">
						     data deficient
						   </div>
							
							<%} %>  
						</div>
						
					
						
								
								
                              </div>
						</div>
						
						<!-- add code here -->
						<div class="innerAccordionContentHolder">
						
						<h4 class="">Overall assessment of protection and management				  
							  </h4>
							  
                              <div class="inner">
							  
							  
							  
										
							  
					 <div class="innerAccordionContentHolder_level2">
					 
						<h5 class="headingassessmenth5">
						<span class="lbl2">
						Assessment of the effectiveness of protection and management in addressing threats outside the site
						</span>	
						
						<%
						
						String outsidejustification="";
						String outsiderating="";
						if(!effective_prot_mgmt_iothreatsLocalServiceUtil.geteffectivemanagthreatByVersion(lastass_version_id).isEmpty())
						{
						 List<effective_prot_mgmt_iothreats> effective_prot_mgmt_iothreatsList=effective_prot_mgmt_iothreatsLocalServiceUtil.geteffectivemanagthreatByVersion(lastass_version_id);
						 effective_prot_mgmt_iothreats objeffective_prot_mgmt_iothreats=effective_prot_mgmt_iothreatsList.get(0);
						 outsidejustification=objeffective_prot_mgmt_iothreats.getJustification();
						  
						 long prot_outside_threat_rating=objeffective_prot_mgmt_iothreats.getRating();
						 
						 if(prot_outside_threat_rating > 0){
								protection_management_ratings_lkp objprotection_management_ratings_lkp = protection_management_ratings_lkpLocalServiceUtil.getRatingByProtRating(prot_outside_threat_rating);
								outsiderating = objprotection_management_ratings_lkp.getPm_rating();
							}
						  
						}
						%>
						
						
						<div class="conclusionh5">
						<%
						if(!outsiderating.isEmpty()){
						%>
						<span class="lbltxt siteStatusValue"><%=outsiderating %></span>
						<%}else{ %>
						<span class="lbltxt siteStatusValue">NA</span>
						<%} %>
						</div>		  
							  
							  </h5>
							  
                              <div class="inner">
							  						  
							   <%if(!outsidejustification.isEmpty()){ %>
							   
								<p class="summarytxt03">
                                <%=outsidejustification %>
								</p>
							  <%}else{ %>
							  <p class="summarytxt03">

							  </p>
							  
							  <%} %>
							    
								
								
								
                              </div>
						</div>
						
						
						<div class="innerAccordionContentHolder_level2">
						
						<h5 class="">
							<span class="lbl2">
						Overall assessment of protection and management
						</span> 
						<% 
						String str_prot_overall_rating2 = "";
						String prot_overall_justification2="";
						
				if(!prot_mgmt_overallLocalServiceUtil.getprotmgmtoverallByVersion(lastass_version_id).isEmpty()){
					
					List<prot_mgmt_overall> lst_prot_mgmt_overall = prot_mgmt_overallLocalServiceUtil.getprotmgmtoverallByVersion(lastass_version_id);
					prot_mgmt_overall obj_prot_mgmt_overall = lst_prot_mgmt_overall.get(0);
					 prot_overall_justification2 = obj_prot_mgmt_overall.getJustification();
										long prot_overall_rating = obj_prot_mgmt_overall.getRating();
					
					if(prot_overall_rating > 0){
						protection_management_ratings_lkp objprotection_management_ratings_lkp = protection_management_ratings_lkpLocalServiceUtil.getRatingByProtRating(prot_overall_rating);
						str_prot_overall_rating2 = objprotection_management_ratings_lkp.getPm_rating();
					}
				%>
				<%
				}
				%>
				<%if(!str_prot_overall_rating.isEmpty()){ %>
				
							  <div class="conclusionh5">
							  
								<span class="lbltxt siteStatusValue"><%=str_prot_overall_rating2 %></span>
							  </div>						  
				    <%}else{ %>
				
				           <div class="conclusionh5">
							  
								<span class="lbltxt siteStatusValue">NA</span>
							  </div>	
							  
                           <%} %>		  
							  </h5>
							  
                              <div class="inner">
							  						  
							   
							  <%if(!prot_overall_justification.isEmpty()){ %>
							   
								<p class="summarytxt03">
								<%= prot_overall_justification2%>
								</p>
							  
							  <%}else{ %>
							    
								<p class="summarytxt03">
								No justification avilable
								</p>
								
								<%} %>
								
								
                              </div>
						</div>
						
						
						<div class="innerAccordionContentHolder_level2">
						
						<h5 class="lbl2">Best Practice Examples
							
							  <!-- <div class="conclusionh5">
							  
							  
								<span class="lbltxt siteStatusValue">Data Deficient</span>
							  </div> -->						  
							  
							  </h5>
							  
                              <div class="inner">
							  		<%
						  String prot_mgmt_best_descrp="";
						if(!prot_mgmt_best_practicesLocalServiceUtil.getBestpractEntriesByAssessmentId(lastass_version_id).isEmpty()){
							List<prot_mgmt_best_practices> lst_prot_mgmt_best_practices = prot_mgmt_best_practicesLocalServiceUtil.getBestpractEntriesByAssessmentId(lastass_version_id);
							prot_mgmt_best_practices obj_prot_mgmt_best_practices = lst_prot_mgmt_best_practices.get(0);
							 prot_mgmt_best_descrp = obj_prot_mgmt_best_practices.getDescription();
						%>
							<%} %>	  
						
						 <%if(!prot_mgmt_best_descrp.isEmpty()){ %>				  
							   
								<p class="summarytxt03">
								<%=prot_mgmt_best_descrp %>
								</p>
						
						<%}else{ %>		
							  
							   <p class="summarytxt03">
								
								</p>
								
								<%} %> 
								
								
								
                              </div>
						</div>
								
                              </div>
						</div>
						
						</div>


						  
                          </div>
						  
	</div>
	
	<!-- blockTitleSubHeadingsHolder Ends Here -->	
	
	
	
	
	
	
	
	
	
		<!-- blockTitleSubHeadingsHolder Starts Here -->	


					
		<div class="blockTitleSubHeadingsHolder">
		
		<h2 class="blockTitleHeading">Additional Information</h2>
		
						
                      <div class="inner shown">
							
		
						<h3>Key Conservation Issues</h3>
								
						    
						    <div class="summarygistbdr">
							
							
							
							
						
						
						
						
						<!-- <div class="assessmentInfoValueContentHolder">
						
						<div class="summarygistbdr_01">
			   
			   
			   <p>
			   
			   Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software.
						
						</p>
								

									
						</div>	
				
			<div class="summarygistbdrStatus">
						
						<span>Low</span>
						<span>Concern</span>
						
						</div>
				
						
						</div> -->
								
						
							<!-- Box 1 -->
													
							<div class="innerAccordionContentHolder">
						<h4 class="">Issues
							  <div class="conclusionh4">
							  
							  </div>						  
							  
							  </h4>
							  
                              <div class="inner">
							  						  
							   
													
								
								<div class="innerAccordionContentHolder_level2">
								<%
					if(!key_conservation_issuesLocalServiceUtil.getkey_conversionissueByVersion(lastass_version_id).isEmpty()){
						List<key_conservation_issues> lst_key_conservation_issues = key_conservation_issuesLocalServiceUtil.getkey_conversionissueByVersion(lastass_version_id);
						Collections.sort(lst_key_conservation_issues);
						for(key_conservation_issues obj_key_conservation_issues : lst_key_conservation_issues){
							String key_conservation_issue = obj_key_conservation_issues.getKey_conservation_issues();
							String key_conser_description = obj_key_conservation_issues.getDescription();
							long key_scale_id = obj_key_conservation_issues.getScale();
							
							String str_scale = "";
							if(key_scale_id > 0){
								key_conservation_scale_lkp obj_key_conservation_scale_lkp = key_conservation_scale_lkpLocalServiceUtil.fetchkey_conservation_scale_lkp(key_scale_id);
								str_scale = obj_key_conservation_scale_lkp.getScale();
							}
				%>
						<h5 class=""><span class="lbl2"><%=key_conservation_issue %></span>
							  <div class="conclusionh5">
							  
								<span class="lbltxt siteStatusValue"><%=str_scale %></span>
							  </div>						  
							  
							  </h5>
							  
                              <div class="inner">
							  <p class="summarytxt03">
								<%=key_conser_description %>
								</p>
							  
                              </div>
                              <%} %>
                              <%}else{ %>
                              	  
						  <div class="notfound">
						     NA
						   </div>
                              
                              <%} %>
						</div>
						
					
								
								
                              </div>
						</div>
						
						
						
						<!-- Box 2 -->  

						</div>
                                
							
							
							
							
							
							<h3>Benefits</h3>
					
			
			
					  <div class="summarygistbdr">
						
						<div class="changeassessmentInfoValueContentHolder">
						
						 <div class="inner">
							  						  
							   
								
													
								
								<div class="innerAccordionContentHolder_level2">
								<%
							if(!benefitsLocalServiceUtil.getbenefitByVersion(lastass_version_id).isEmpty()){
								List<benefits> lst_benefits = benefitsLocalServiceUtil.getbenefitByVersion(lastass_version_id);
								for(benefits obj_benefits : lst_benefits){
									long benefits_id = obj_benefits.getBenefits_id();
									String benefits_summary = obj_benefits.getSummary();
									long com_outsd_site = obj_benefits.getCommunity_outside_site();
									long com_winth_site = obj_benefits.getCommunity_within_site();
									long wider_comm = obj_benefits.getWider_community();
									
									String str_com_outsd_site = "";
									if(com_outsd_site > 0){
										benefit_rating_lkp obj_benefit_rating_lkp_outside = benefit_rating_lkpLocalServiceUtil.fetchbenefit_rating_lkp(com_outsd_site);
										str_com_outsd_site = obj_benefit_rating_lkp_outside.getRating();
									}
									
									String str_com_winth_site = "";
									if(com_winth_site > 0){
										benefit_rating_lkp obj_benefit_rating_lkp_within = benefit_rating_lkpLocalServiceUtil.fetchbenefit_rating_lkp(com_winth_site);
										str_com_winth_site = obj_benefit_rating_lkp_within.getRating();
									}
									
									String str_wider_comm = "";
									if(wider_comm > 0){
										benefit_rating_lkp obj_benefit_rating_lkp_wider = benefit_rating_lkpLocalServiceUtil.fetchbenefit_rating_lkp(wider_comm);
										str_wider_comm = obj_benefit_rating_lkp_wider.getRating();
									}
									
									HashSet<Long> chkk_type = new HashSet<Long>();
									List<benefits_type_ref> lst_benefits_type_ref = benefits_type_refLocalServiceUtil.findByBenefitsId(benefits_id);
									
									
									for(benefits_type_ref obj_benefits_type_ref : lst_benefits_type_ref){
										
										
										long benefit_checktypeId = obj_benefits_type_ref.getBenefit_checktype();
										long benefit_checksubTypeId = obj_benefits_type_ref.getBenefit_checksubtype();
										
										
										String str_bene_checkType = "";
										if(benefit_checktypeId > 0){
											benefit_checktype_lkp obj_benefit_checktype_lkp = benefit_checktype_lkpLocalServiceUtil.fetchbenefit_checktype_lkp(benefit_checktypeId);
											str_bene_checkType = obj_benefit_checktype_lkp.getBenefit_checktype();
										}
									
										
									%>
								
							<h5 class=""><%=str_bene_checkType %>
							  				  
							  
							  </h5>
							  
                              <div class="inner">
                              
                              <%-- <div class="conclusionh5inner">
							  <span class="lbltxt">Community within site:<span class="normal">&nbsp;<%= !str_com_winth_site.isEmpty() ?  str_com_winth_site : "NA" %></span></span>
							  <span class="lbltxt"> Community outside site:<span class="normal">&nbsp;<%=!str_com_outsd_site.isEmpty() ? str_com_outsd_site : "NA"  %></span></span>
							  <span class="lbltxt">Wider Community:<span class="normal">&nbsp;<%=!str_wider_comm.isEmpty() ? str_wider_comm :"NA" %></span></span>
							  
							  
							  </div>  --%>
                              
							 <p class="summarytxt03">
							 <%=benefits_summary %>
							</p>
							  </div>
							  	 <%
							    break;
								}
							    %>
								<%
								}
								%>
								<%
								}else{
								%>
							  
							  <div class="notfound">
						      N.A
						      </div>
							  <%} %>
							  
							  
						</div>
						
						
						
					
								
								
                              </div>
						
						<%-- <div class="Changesummarygistbdr_01">
			   
			   <%
						String benefits_summary_overall="";
								if(!benefits_summaryLocalServiceUtil.getEntriesFromAssessmentId(lastass_version_id).isEmpty()){
									List<benefits_summary> lst_benefits_summary = benefits_summaryLocalServiceUtil.getEntriesFromAssessmentId(lastass_version_id);
									benefits_summary obj_benefits_summary = lst_benefits_summary.get(0);
									 benefits_summary_overall = obj_benefits_summary.getSummary();
							%>
					  <p>
					  <%=benefits_summary_overall %>
					</p>
						<%}else{%>		
                     <p class="natxtl1">
                     
                     </p>
						<%
						}
						%>	
									
						</div>	 --%>
				
						
						<!-- <div class="summarygistbdrStatus">
						
						<span>Low</span>
						<span>Concern</span>
						
						</div> -->
				
						
						</div>
								
						
							<!-- Box 1 -->
													
							<%-- <div class="innerAccordionContentHolder">
							
							
						<h4 class="">Benefits Types
							  <div class="conclusionh4">
							  	
							  </div>						  
							  
							  </h4>
							  
                              <div class="inner">
							  						  
							   
								
													
								
								<div class="innerAccordionContentHolder_level2">
								<%
							if(!benefitsLocalServiceUtil.getbenefitByVersion(lastass_version_id).isEmpty()){
								List<benefits> lst_benefits = benefitsLocalServiceUtil.getbenefitByVersion(lastass_version_id);
								for(benefits obj_benefits : lst_benefits){
									long benefits_id = obj_benefits.getBenefits_id();
									String benefits_summary = obj_benefits.getSummary();
									long com_outsd_site = obj_benefits.getCommunity_outside_site();
									long com_winth_site = obj_benefits.getCommunity_within_site();
									long wider_comm = obj_benefits.getWider_community();
									
									String str_com_outsd_site = "";
									if(com_outsd_site > 0){
										benefit_rating_lkp obj_benefit_rating_lkp_outside = benefit_rating_lkpLocalServiceUtil.fetchbenefit_rating_lkp(com_outsd_site);
										str_com_outsd_site = obj_benefit_rating_lkp_outside.getRating();
									}
									
									String str_com_winth_site = "";
									if(com_winth_site > 0){
										benefit_rating_lkp obj_benefit_rating_lkp_within = benefit_rating_lkpLocalServiceUtil.fetchbenefit_rating_lkp(com_winth_site);
										str_com_winth_site = obj_benefit_rating_lkp_within.getRating();
									}
									
									String str_wider_comm = "";
									if(wider_comm > 0){
										benefit_rating_lkp obj_benefit_rating_lkp_wider = benefit_rating_lkpLocalServiceUtil.fetchbenefit_rating_lkp(wider_comm);
										str_wider_comm = obj_benefit_rating_lkp_wider.getRating();
									}
									
									HashSet<Long> chkk_type = new HashSet<Long>();
									List<benefits_type_ref> lst_benefits_type_ref = benefits_type_refLocalServiceUtil.findByBenefitsId(benefits_id);
									
									
									for(benefits_type_ref obj_benefits_type_ref : lst_benefits_type_ref){
										
										
										long benefit_checktypeId = obj_benefits_type_ref.getBenefit_checktype();
										long benefit_checksubTypeId = obj_benefits_type_ref.getBenefit_checksubtype();
										
										
										String str_bene_checkType = "";
										if(benefit_checktypeId > 0){
											benefit_checktype_lkp obj_benefit_checktype_lkp = benefit_checktype_lkpLocalServiceUtil.fetchbenefit_checktype_lkp(benefit_checktypeId);
											str_bene_checkType = obj_benefit_checktype_lkp.getBenefit_checktype();
										}
									
										
									%>
								
							<h5 class=""><%=str_bene_checkType %>
							  				  
							  
							  </h5>
							  
                              <div class="inner">
                              
                              <div class="conclusionh5inner">
							  <span class="lbltxt">Community within site:<span class="normal">&nbsp;<%= !str_com_winth_site.isEmpty() ?  str_com_winth_site : "NA" %></span></span>
							  <span class="lbltxt"> Community outside site:<span class="normal">&nbsp;<%=!str_com_outsd_site.isEmpty() ? str_com_outsd_site : "NA"  %></span></span>
							  <span class="lbltxt">Wider Community:<span class="normal">&nbsp;<%=!str_wider_comm.isEmpty() ? str_wider_comm :"NA" %></span></span>
							  
							  
							  </div> 
                              
							 <p class="summarytxt03">
							 <%=benefits_summary %>
							</p>
							  </div>
							  	 <%
							    break;
								}
							    %>
								<%
								}
								%>
								<%
								}else{
								%>
							  
							  <div class="notfound">
						     
						      </div>
							  <%} %>
							  
							  
						</div>
						
						
						
					
								
								
                              </div>
						</div> --%>
						
						
					
						<!-- Box 2 -->  

						</div>
						
						
					
						<h3>Projects</h3>
						
					    <div class="summarygistbdr">
							
						
						
						<!-- <div class="assessmentInfoValueContentHolder">
						
						<div class="summarygistbdr_01">
			   
			   
			              <p>
			   
			   
The current management of the property is effective in general, but should be improved particularly by strengthening the legal framework, stronger participation of local people in management, improving finances, staff, authorities and institutional capacity particularly of the component Nature Parks, and a more strategic approach to sustainable tourism development.
						
						</p>
								

									
						</div>	
				
			<div class="summarygistbdrStatus">
						
						<span>Mostly</span>
						<span>Effective</span>
						
						</div>
				
						
						</div> -->
										
							<!-- Box 1 -->
							
							
							
							<div class="innerAccordionContentHolder">
						<h4 class="">Active Conservation Projects
						
							<!--   <div class="conclusionh5">
							  <span class="lbltxt"><span class="normal">Trend:</span> Stable</span>
								<span class="lbltxt siteStatusValue">Low Concern</span>			
							  </div> -->
							 
							  </h4>
							  
                              <div class="inner">
							  
							  
							 	<table class="actvConservationPrjctsTable" cellpadding="0" cellspacing="0">
				<tr>
					<th>N<sup class="number">0</sup></th>
					<th>Organization/ individuals</th>
					<th>Brief description of Active Projects</th>
					<th>Contact Details </th>
				</tr>
				<%
				int i=1;
					if(!active_conservation_projectsLocalServiceUtil.getactive_conservation_projectsByVersion(lastass_version_id).isEmpty()){
						List<active_conservation_projects> lst_active_conservation_projects = active_conservation_projectsLocalServiceUtil.getactive_conservation_projectsByVersion(lastass_version_id);
						for(active_conservation_projects obj_active_conservation_projects : lst_active_conservation_projects){
							long acpid = obj_active_conservation_projects.getAcpid();
							String description = obj_active_conservation_projects.getDescription();
							String org_individual = obj_active_conservation_projects.getOrganization_individual();
							String contact_details = obj_active_conservation_projects.getContact_details();
				%>
							<tr>
								<td><%=i %></td>
								<td class="tdindividual"><%=org_individual %></td>
								<td class="tddescription"><%=description %></td>
								<td class="tdcontactDetails"><%=contact_details %></td>
							</tr>
				<%			
		          		i++;
				
						}
				%>
				<%		
					}else{
				%>
					<tr><td>Data is not available</td></tr>
				<%		
					}
				%>
				
			</table>
								
								
                              </div>
						</div>
						
						
						<div class="innerAccordionContentHolder">
						<h4 class="">Compilation of potential project needs				  
							  </h4>
							  
                              <div class="inner">
							  
							  
							  <table class="actvConservationPrjctsTable" cellpadding="0" cellspacing="0">
				<tr>
					<th>N.O<sup class="number">0</sup></th>
					<th>Organization/ individuals</th>
					<th>Brief description of Active Projects</th>
					<th>Contact Details </th>
				</tr>
				
				<%
				
				 int j=1;
				
					if(!potential_project_needsLocalServiceUtil.getpotential_projectsByVersion(lastass_version_id).isEmpty()){
						List<potential_project_needs> lst_potential_project_needs = potential_project_needsLocalServiceUtil.getpotential_projectsByVersion(lastass_version_id);
						for(potential_project_needs obj_potential_project_needs : lst_potential_project_needs){
							long ppn_id = obj_potential_project_needs.getPpn_id();
							String potential_org_individual = obj_potential_project_needs.getOrganization_individual();
							String potential_description = obj_potential_project_needs.getDescription();
							String potential_contactdetails = obj_potential_project_needs.getContact_details();
				%>
						<tr>
							<td><%=j %></td>
							<td class="tdindividual"><%=potential_org_individual %></td>
							<td class="tddescription"><%=potential_description %></td>
							<td class="tdcontactDetails"><%=potential_contactdetails %></td>
						</tr>
				<%			
				            j++;
				
						}
				%>
				<%		
					}else{
				%>
					<tr><td>Data is not available</td></tr>
				<%		
					}
				%>
				
			</table>
								
								
                              </div>
						</div>
                             
							  
							  
							
						
						</div>


						  
                          </div>
						  
	</div>
	
	<!-- blockTitleSubHeadingsHolder Ends Here -->	
	
						  
						  				  
                          
                    </div>  
					
					
					<!-- end Example 2 -->
              </div> 
					
				
 </div> 
</div>
<!--tab2 ends here-->



<!--tab3 starts here-->
<div id='tab3'>
	<table class="referencesTable" cellpadding="0" cellspacing="0">
		<tr>
			<th>Rn<sup class="number">0</sup></th>
			<th>References</th>
		</tr>
		<%
		
		int k=1;
			if(!referencesLocalServiceUtil.findByAssessmentId(lastass_version_id).isEmpty()){
				List<references> lst_references = referencesLocalServiceUtil.findByAssessmentId(lastass_version_id);
				Collections.sort(lst_references);
				for(references obj_references : lst_references){
					long rn_value = obj_references.getRn();
					String str_references = obj_references.getReferences();
					//rn_str = rn_str.concat(String.valueOf(rn_value));	
					String rn_value_str = String.valueOf(rn_value);
		%>
					<tr>
 						<td><%=k %></td>
					<td><%=str_references %></td>
					</tr>	
				<%
			   k++;	
				}
				%>			
		<%
			}else{
		%>	
			<tr><td>No references found</td></tr>
		<%
			}
		%>	
	</table>
</div>
<!--tab3 ends here-->

</div>
<!--siteAssessmentInfoWrapper ends here-->

		
		</div>
<!--siteAssessmentPublicPageLeftBlock ends here-->
	
	
	
	
	<div class="siteAssessmentPublicPageRightBlock">
	
	<%
		boolean boolforSummarydiv = false;
		if(boolEn){
			if(assessmntVersionLangMap.containsKey("fr") || assessmntVersionLangMap.containsKey("es")){
				boolforSummarydiv = true;
			}
		}else if(boolFr){
			if(assessmntVersionLangMap.containsKey("en") || assessmntVersionLangMap.containsKey("es")){
				boolforSummarydiv = true;
			}
		}else if(boolEs){
			if(assessmntVersionLangMap.containsKey("en") || assessmntVersionLangMap.containsKey("fr")){
				boolforSummarydiv = true;
			}
		}
	%>
	
	<%
		if(boolforSummarydiv){
	%>
		<div class="summaryLanguages">
		<span class="summaryLanguagesText">Also available in:</span>
		<ul class="rightBlockTopIcons1">
		<%
			if(!boolEn){
				if(assessmntVersionLangMap.containsKey("en")){
					PortletURL rowURLen = liferayPortletResponse.createRenderURL();
					rowURLen.setParameter("jspPage","/site_asssessment_summary.jsp");
					rowURLen.setParameter("language","en" + "");
					rowURLen.setParameter("wdpaid",selWdpaid + "");
					
		%>
					<li><a href="<%=rowURLen %>" class="editIconsPublicPages summary_en">English</a></li>
		<%			
				}
		%>
		<%		
			}
		%>
		<%
			if(!boolFr){
				if(assessmntVersionLangMap.containsKey("fr")){
					PortletURL rowURLfr = liferayPortletResponse.createRenderURL();
					rowURLfr.setParameter("jspPage", "/site_asssessment_summary.jsp");
					rowURLfr.setParameter("language","fr" + "");
					rowURLfr.setParameter("wdpaid", selWdpaid + "");
		%>
					<li><a href="<%= rowURLfr%>" class="editIconsPublicPages summary_fr"> French</a></li>
		<%			
				}
		%>
		<%		
			}
		%>
		<%
			if(!boolEs){
				if(assessmntVersionLangMap.containsKey("es")){
					PortletURL rowURLes = liferayPortletResponse.createRenderURL();
					rowURLes.setParameter("jspPage", "/site_asssessment_summary.jsp");
					rowURLes.setParameter("language","es" + "");
					rowURLes.setParameter("wdpaid", selWdpaid + "");
		%>
					<li><a href="<%=rowURLes %>" class="editIconsPublicPages summary_sp">Spanish</a></li>
		<%			
				}
		%>
		<%		
			}
		%>
	</ul>
	</div>
		
	<%		
		}
	%>
	
		
		<!-- <div class="mapHolder" >
			<iframe frameborder="0" scrolling="no" marginheight="0" marginwidth="0" src="http://maps.google.com/?ie=UTF8&amp;ll=37.0625,-95.677068&amp;spn=57.161276,79.013672&amp;t=h&amp;z=4&amp;output=embed" style="height: 160px"></iframe>
		</div> -->
		<div class="mapHolder" >
			<jsp:include page="/static_map.jsp" />
		</div>
		
	<div class="siteDescription1">
				<h2>Site Description</h2>
				<%
				whp_sites objsite = whp_sitesLocalServiceUtil.getSiteByWdpaId(selWdpaid); 
				siteddescription=objsite.getDescription();
				
				%>
				<%if(!siteddescription.isEmpty()){ %>
				<p>
				<%=siteddescription %>
				</p>

		         <p>&#9426 UNESCO</p>

			   <%}else{ %>
			   	<p>No Description available</p>
			
			<%} %>
			</div>
			
		
			
			<%-- <div class="siteDescription">
			<h2>Benefits</h2>
			                <%
							if(!benefitsLocalServiceUtil.getbenefitByVersion(lastass_version_id).isEmpty()){
								List<benefits> lst_benefits = benefitsLocalServiceUtil.getbenefitByVersion(lastass_version_id);
								for(benefits obj_benefits : lst_benefits){
									long benefits_id = obj_benefits.getBenefits_id();
									String benefits_summary = obj_benefits.getSummary();
									long com_outsd_site = obj_benefits.getCommunity_outside_site();
									long com_winth_site = obj_benefits.getCommunity_within_site();
									long wider_comm = obj_benefits.getWider_community();
									
									String str_com_outsd_site = "";
									if(com_outsd_site > 0){
										benefit_rating_lkp obj_benefit_rating_lkp_outside = benefit_rating_lkpLocalServiceUtil.fetchbenefit_rating_lkp(com_outsd_site);
										str_com_outsd_site = obj_benefit_rating_lkp_outside.getRating();
									}
									
									String str_com_winth_site = "";
									if(com_winth_site > 0){
										benefit_rating_lkp obj_benefit_rating_lkp_within = benefit_rating_lkpLocalServiceUtil.fetchbenefit_rating_lkp(com_winth_site);
										str_com_winth_site = obj_benefit_rating_lkp_within.getRating();
									}
									
									String str_wider_comm = "";
									if(wider_comm > 0){
										benefit_rating_lkp obj_benefit_rating_lkp_wider = benefit_rating_lkpLocalServiceUtil.fetchbenefit_rating_lkp(wider_comm);
										str_wider_comm = obj_benefit_rating_lkp_wider.getRating();
									}
									
									HashSet<Long> chkk_type = new HashSet<Long>();
									List<benefits_type_ref> lst_benefits_type_ref = benefits_type_refLocalServiceUtil.findByBenefitsId(benefits_id);
									
									
									for(benefits_type_ref obj_benefits_type_ref : lst_benefits_type_ref){
										
										
										long benefit_checktypeId = obj_benefits_type_ref.getBenefit_checktype();
										long benefit_checksubTypeId = obj_benefits_type_ref.getBenefit_checksubtype();
										
										
										String str_bene_checkType = "";
										if(benefit_checktypeId > 0){
											benefit_checktype_lkp obj_benefit_checktype_lkp = benefit_checktype_lkpLocalServiceUtil.fetchbenefit_checktype_lkp(benefit_checktypeId);
											str_bene_checkType = obj_benefit_checktype_lkp.getBenefit_checktype();
										}
									
										
									%>
								
									<h3 class="heading_summary"><%=str_bene_checkType %></h3> 				  
								  	    
								  	    <div class="inner_benefit">
                           				 <p >
							                <%=benefits_summary %>
							             </p>
							            </div>
							            
							  	 <%
							    break;
								}
							    %>
								<%
								}
								%>
								<%
								}else{
								%>
							  
							  <div class="notfound">
						     N.A
						      </div>
							  <%} %>

			</div> --%>
			
		<div class="moreInfoContainer">
			<div class="moreInfo">
			
			<%
			String ppnetLink = "http://www.protectedplanet.net/sites/";
			String unescoLink = "http://whc.unesco.org/en/list/";
					
			whp_sites objSite = whp_sitesLocalServiceUtil.getSiteByWdpaId(selWdpaid);
			
			long wdpa_id_first_site = objSite.getWdpa_id();
			long unesco_id_first_site = objSite.getUnesco_id();
			
			String ppnet_url1 = ppnetLink + String.valueOf(wdpa_id_first_site);
			
	        String unesco_url1 = unescoLink	+ String.valueOf(unesco_id_first_site);	        
			%>
				<h3>More on this site</h3>
				<ul>
					<li><a href="<%=ppnet_url1%>"  target="_blank">&gt;&nbsp;Protected Planet Website</a></li>
					<li><a href="<%=unesco_url1%>" target="_blank">&gt;&nbsp;UNESCO World Heritage Centre</a></li>
					<%--href="http://www.iucn.org"--%>
					<%--<li><a target="_blank">&gt;&nbsp;IUCN</a></li>--%>
				</ul>
			</div>
			
			<div class="moreInfo">
				<h3>How are sites assessed</h3>
				<ul>
					<li><a href="http://www.worldheritageoutlook.iucn.org/understanding-ratings">&gt;&nbsp;All about Ratings </a></li>
					<li><a href="http://www.worldheritageoutlook.iucn.org/consultation-process">&gt;&nbsp;Consultation Process</a></li>
					<li><a href="http://www.worldheritageoutlook.iucn.org/methodology">&gt;&nbsp;Methodology</a></li>
				</ul>
			</div>

			<div class="moreInfo">
				<h3>Download pdf</h3>
				<ul>
					<li><a href="<%=pdfURL%>" target="_blank"><span>&gt;&nbsp;Download Pdf</span></a></li>
				</ul>
			</div>
				
			<div class="moreInfo">
				<h3>Give us feedback</h3>
				<ul>
				<li>
				<!-- <a  href="#"   class="message" onclick="javascript:dynamicPopup('/send_mail_pop.jsp','1','Feedback Mail Form',event);return false;"> -->
				<!-- <a  href="#"   class="message" onclick="javascript:feedbackRedirect()"> -->
				<!-- <a  href="#" class="message" onclick="javascript:openFeedback()"> -->
				 <a  href="#"   class="message" onclick="javascript:dynamicPopup('/send_mail_pop.jsp','${site_id}','Feedback Mail Form',event);return false;">
				<span>&gt;&nbsp;Contact us to give additional information on a site</span>
				</a>
				</li>
				</ul>
			</div>
			
		</div>
			
</div> 
	
	
	
	
<script>

function feedbackRedirect()
{
	var href = window.location.protocol + "//"  + window.location.host+"/web/iucn/feedback";
	window.location = href;	
}

</script>	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
</div>
<!--mainBlockSiteAssessmentPublicPages Ends here-->    




























         

</div>
<!-- Wrapper Ends here-->

<!-- popup function -->

<%-- <script type="text/javascript">

	function dynamicPopup(renderJSPURL,id,popupTitle) {
		//creating url
		var customUrl="<portlet:renderURL  windowState='<%= LiferayWindowState.POP_UP.toString() %>'><portlet:param name='jspPage' value='jspURL' /><portlet:param name='keyVal' value='keyValue' /><portlet:param name='versionIdVal' value='versionValue' /></portlet:renderURL>";
	    var tempUrl=customUrl.replace("keyValue",id);
	    var finalUrl=tempUrl.replace("jspURL",renderJSPURL);
	    
	    //var left = (screen.width/2-150);
	   // var top = (screen.height/2-200);
	    AUI().use('aui-dialog', 'aui-io', 'event', 'event-custom', function(A) {
		     var dialog = new A.Dialog({
		            title: popupTitle,		            
		            modal: true
		           // xy: [left, top]
		        }).plug(A.Plugin.IO, {uri: finalUrl}).render();
		        dialog.show();		        
		  });	    
	}
</script> --%>








