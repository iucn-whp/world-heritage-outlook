<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="com.iucn.whp.dto.SiteNameComparatorUtil"%>
<%@page import="com.liferay.portal.kernel.util.OrderByComparator"%>
<%@page import="com.liferay.portlet.PortalPreferences"%>
<%-- <%@page import="com.liferay.portal.model.PortalPreferences"%> --%>
<%@page import="com.liferay.portlet.PortletPreferencesFactoryUtil"%>
<%@page import="com.liferay.portal.service.RoleServiceUtil"%>
<%@page import="com.iucn.whp.assesment.utils.AssessmentActionUtil"%>
<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@page import="com.liferay.portal.PortalException"%>
<%@page import="com.iucn.whp.dbservice.service.*"%>
<%@page import="com.liferay.portal.kernel.portlet.*"%>
<%@page import="org.apache.commons.*"%>
<%@page import="javax.portlet.*"%>
<%@page import="com.iucn.whp.dbservice.model.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ page import="java.util.*"%>
<%@ page import="com.iucn.whp.dbservice.model.*" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@include file="/init.jsp" %>
<%@page import="com.iucn.whp.dto.SiteAssessmentDTO" %>
<%@page import="com.liferay.portal.model.PortalPreferencesModel"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>


<portlet:defineObjects />
<liferay-theme:defineObjects />

<link rel="stylesheet" href="${pageContext.request.contextPath}/css/style_main.css">
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.4.1.js"></script>
<!-- Wrapper Starts here-->



<h2 class="pageHeaderTitle">Site Assessment</h2>
<form class="formSiteAssessmentAdmin" action="">

<div id="sitesearchDiv">
<%@include file="/assessment_jsp/search/search.jsp" %>
<!-- <a id="advance_search" style="float:right;" onClick="javascript:advanceSearchPopup('Assessment Query Builder');" href="#" >Advance Search</a> -->

</div>


<!--MainBlock starts here-->
<div style="margin: 0px auto;">
<div id="backButtonDiv" >
<a id="backHref" href="/web/iucn/manage-assessment" class="roundedwhiteBTN" style="display:none; float:right;"><span><p>Back</p></span></a>
</div>


<%
String assessmentIds = "";

List<SiteAssessmentDTO> siteAssessmentDTOList=new ArrayList<SiteAssessmentDTO>();
List<site_assessment> site_assessmentList=null;
	String isSearch=ParamUtil.getString(request, "isSearch");
	String assessmentCycleID=ParamUtil.getString(request, "assessmentCycleID");
	//setting value of iterator of search container
    PortletURL assessmentPageURL=null;
	String pageUrl="N";
	
	if(isSearch==null || isSearch.isEmpty() || isSearch.equalsIgnoreCase(pageUrl)){
		 site_assessmentList =AssessmentActionUtil.getSiteAssessmentByUserId(user.getUserId());
	
	
	//setting value of site assessment
	List<assessment_stages> assessment_stagesList=assessment_stagesLocalServiceUtil.findAll();
	List<assessment_status> assessment_statusList=assessment_statusLocalServiceUtil.findAll();
	List<assessment_lang_lkp> assessment_langLkpList=assessment_lang_lkpLocalServiceUtil.findAll();
	
	Map<Long,String> assessment_statusMap=new HashMap<Long,String>();
	for(assessment_status objAssessment_status : assessment_statusList){
		assessment_statusMap.put(objAssessment_status.getStatusid(),objAssessment_status.getStatus());
	}
	
	Map<Long,String> assessment_stagesMap=new HashMap<Long,String>();
	for(assessment_stages objassessment_stages : assessment_stagesList){
		assessment_stagesMap.put(objassessment_stages.getStageid(),objassessment_stages.getStage());
	}
	
	Map<Long,String> assessment_lang_lkpMap=new HashMap<Long,String>();
	for(assessment_lang_lkp objassessment_lang_lkp : assessment_langLkpList){
		assessment_lang_lkpMap.put(objassessment_lang_lkp.getLanguageid(),objassessment_lang_lkp.getLanguagecode());
	}
	
	String currentVersionCode="0.0";
	
	for(site_assessment objSite_assessment : site_assessmentList){
		
		site_assessment_versions currentSite_assessment_versions=null;
		 
		long siteAssessmentId=objSite_assessment.getAssessment_id();
		List<site_assessment_versions> site_assessment_versionsList= new ArrayList();
		   site_assessment_versionsList.addAll(site_assessment_versionsLocalServiceUtil.findByAssessmentId(siteAssessmentId));
		
		if(site_assessment_versionsList!=null && site_assessment_versionsList.size()>0){
			Collections.sort(site_assessment_versionsList, new Comparator<site_assessment_versions>(){
			    public int compare(site_assessment_versions one, site_assessment_versions other) {
			        return String.valueOf(other.getAssessment_version_id()).compareTo(String.valueOf(one.getAssessment_version_id()));
			    }
			});
			if(site_assessment_versionsList!=null){
				currentSite_assessment_versions=site_assessment_versionsList.get(0);
				currentVersionCode=currentSite_assessment_versions.getVersion_code()+"";
			}
			
		}
		whp_sites objwhp_sites=whp_sitesLocalServiceUtil.getSiteBySiteId(objSite_assessment.getSite_id());
		
		List<assessment_lang_version> lstassessment_lang_version=assessment_lang_versionLocalServiceUtil.findByAssessmentId(siteAssessmentId);
		
		String assessmentLang=null;
		if(lstassessment_lang_version!=null){
			for(assessment_lang_version  objassessment_lang_version:lstassessment_lang_version){
				if(assessmentLang==null){
					assessmentLang=assessment_lang_lkpMap.get(objassessment_lang_version.getLanguageid());
				}else{
					assessmentLang=assessmentLang+", "+assessment_lang_lkpMap.get(objassessment_lang_version.getLanguageid());
				}
			}
		}else{
			if(objSite_assessment.getBase_langid()>0)
			assessmentLang=assessment_lang_lkpMap.get(objSite_assessment.getBase_langid());
			else
				assessmentLang="";
		}
		
		
		SiteAssessmentDTO tempSiteAssessmentDTO=new SiteAssessmentDTO();
		tempSiteAssessmentDTO.setSite_Assessment(objSite_assessment);
		tempSiteAssessmentDTO.setSite_AssessmentVersions(currentSite_assessment_versions);
		tempSiteAssessmentDTO.setCurrent_Stage(assessment_stagesMap.get(objSite_assessment.getCurrent_stageid()));
		tempSiteAssessmentDTO.setCurrent_Status(assessment_statusMap.get(objSite_assessment.getStatus_id()));
		tempSiteAssessmentDTO.setCurrentUser(AssessmentActionUtil.getUserNameByUserId(objSite_assessment.getCurrent_userid()));
		tempSiteAssessmentDTO.setAssessmentId(objSite_assessment.getAssessment_id());
		tempSiteAssessmentDTO.setSiteName(objwhp_sites.getName_en());
		tempSiteAssessmentDTO.setLanguages(assessmentLang);
		tempSiteAssessmentDTO.setCurrentVersion(currentVersionCode);
		siteAssessmentDTOList.add(tempSiteAssessmentDTO);
		
	}

//		List<SiteAssessmentDTO> siteAssessmentDTOListTemp=new ArrayList<SiteAssessmentDTO>();
//		for(SiteAssessmentDTO siteAssessmentDTOListObj : siteAssessmentDTOList){
			// siteAssessmentDTOListObj.getSite_Assessment().getAssessment_cycle().equals("2016")
//			if(siteAssessmentDTOListObj.getSite_Assessment().getAssessment_cycle().equals("2017") ){
//				siteAssessmentDTOListTemp.add(siteAssessmentDTOListObj);
//			}
//		}
//		siteAssessmentDTOList=siteAssessmentDTOListTemp;


	}else{
		siteAssessmentDTOList= (List<SiteAssessmentDTO>)session.getAttribute("siteAssessmentDTOList");
		pageUrl="Y";
	}
	assessmentPageURL = liferayPortletResponse.createRenderURL();
	assessmentPageURL.setParameter("jspPage", "/assessment_dashboard.jsp");
	assessmentPageURL.setParameter("isSearch", pageUrl);
	assessmentPageURL.setParameter("assessmentCycleID", assessmentCycleID);
	//assessmentPageURL.setWindowState(WindowState.NORMAL);
	pageContext.setAttribute("siteAssessmentDTOList", siteAssessmentDTOList,PageContext.SESSION_SCOPE);

%>

 <!-- Assessment export code --> 

<%

for(int k=0;k<siteAssessmentDTOList.size();k++){
	if(assessmentIds.equalsIgnoreCase("")){
		assessmentIds=siteAssessmentDTOList.get(k).getAssessmentId()+"";
	}else{
		assessmentIds = assessmentIds +","+ Long.toString(siteAssessmentDTOList.get(k).getAssessmentId());
	}
	
}

%>
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


<div id="siteAssessmentDashboardDiv" class="siteAssessmentTableContainer">


<div id="export" style="float:right;">
<portlet:resourceURL var="exportType">
<portlet:param name="whp_assessmentList" value= "<%=assessmentIds %>" />
<portlet:param name="ACTION_CMD" value= "EXPORT" />
</portlet:resourceURL>
<a  href="<%=exportType %>" class="roundedwhiteBTN"  float:right;"><span><p>Export</p></span></a>
</div>


<liferay-ui:search-container
      emptyResultsMessage="there-are-no-Site-Assessments" iteratorURL="<%=assessmentPageURL %>" 
      delta="30" orderByCol="<%= orderByCol %>" orderByType="<%= orderByType %>">

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
          orderable="<%= true %>"
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
				name="Assessment Cycle"
				value="<%=siteAssessmentDTO.getSite_Assessment().getAssessment_cycle()%>">
		</liferay-ui:search-container-column-text>

          
          <liferay-ui:search-container-column-text
          name="Version"
          
          >
          <%= siteAssessmentDTO.getCurrentVersion()!=null ? siteAssessmentDTO.getCurrentVersion() : "0.0" %>
          </liferay-ui:search-container-column-text>
          
        <liferay-ui:search-container-column-text
          name="Language" >
        <%= siteAssessmentDTO.getLanguages()!=null ? siteAssessmentDTO.getLanguages() : "N.A" %>
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
<!--MainBlock Ends here-->
</form>



<!-- Wrapper Ends here-->
<script type="text/javascript">

	function assessmentActionPopup(renderJSPURL,assessmentId,versionId,popupTitle,p_type) {
		//creating url
		//alert('assessmentId'+assessmentId);
		var customUrl="<portlet:renderURL  windowState='<%= LiferayWindowState.POP_UP.toString() %>'><portlet:param name='jspPage' value='jspURL' /><portlet:param name='keyVal' value='keyValue' /><portlet:param name='assigne_type' value='typeValue' /><portlet:param name='versionIdVal' value='versionValue' /></portlet:renderURL>";
	    var tempUrl=customUrl.replace("keyValue",assessmentId);
	    var tempSiteId = tempUrl.replace("versionValue",versionId);
	    var tempType = tempSiteId.replace("typeValue",p_type);
	    var finalUrl=tempType.replace("jspURL",renderJSPURL);
	    
	    var left = (screen.width/2-350);
	    var top = (screen.height/2-300);
	    AUI().use('aui-dialog', 'aui-io', 'event', 'event-custom', function(A) {
		     var dialog = new A.Dialog({
		            title: popupTitle,		            
		            modal: true,		           
		            xy: [left, top]
		        }).plug(A.Plugin.IO, {uri: finalUrl}).render();
		        
		        dialog.show();
		        
		  });
	}

	function deletePopup(refreshURL,currentDiv,id,popupTitle) {
		//creating url
		var strVersionId = "";
		var customUrl="<portlet:renderURL  windowState='<%= LiferayWindowState.POP_UP.toString() %>'><portlet:param name='jspPage' value='jspURL' /><portlet:param name='refreshPage' value='refURL' /><portlet:param name='divVal' value='divValue' /><portlet:param name='keyVal' value='keyValue' /><portlet:param name='versionIdVal' value='versionIdValue' /><portlet:param name='tableName' value='tableNameValue' /></portlet:renderURL>";
	    var tempUrl=customUrl.replace("keyValue",id);
	    var tempDiv=tempUrl.replace("divValue",currentDiv);
	    var temptabName = tempDiv.replace("tableNameValue", popupTitle);
	    var tempSiteId = temptabName.replace("versionIdValue",strVersionId);
	    var refreshPageUrl=tempSiteId.replace("jspURL","/assessment_jsp/popup/delete_records.jsp");
	    var finalUrl=refreshPageUrl.replace("refURL",refreshURL);
		
	    Liferay.Util.openWindow(
				{
					cache: false,
					
					dialog: {
						model:true,
						align: Liferay.Util.Window.ALIGN_CENTER,
						after: {
							render: function(event) {
								this.set('y', this.get('y') + 50);
							}
						},
						//width: 475,
						resizable:false
						
					},
					dialogIframe: {
						id: 'My_Iframe',
						uri: finalUrl
					},
					title: popupTitle,
					uri: finalUrl
				}
			);
	
	['liferay-util-window']

	}

	
	function advanceSearchPopup(popupTitle) {
		//creating url
		var customUrl="<portlet:renderURL  windowState='<%= LiferayWindowState.EXCLUSIVE.toString() %>'><portlet:param name='jspPage' value='jspURL' /></portlet:renderURL>";
	    var finalUrl=customUrl.replace("jspURL","/assessment_jsp/search/query_builder.jsp");
	    var left = (screen.width/2-350);
	    var top = (screen.height/2-300);
	    AUI().use('aui-dialog', 'aui-io', 'event', 'event-custom', function(A) {
		     var dialog = new A.Dialog({
		            title: popupTitle,		            
		            modal: true,		           
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
			$('table.taglib-search-iterator th').css({'color':'#1a1a1a','word-wrap':'normal','white-space':'nowrap','text-align':'center'});
			$('th.col-actions').css('width','100px');
			$('.lfr-actions').css('margin-right','3px');
			$('.delta-selector').addClass('deltaSelectorWidth').css({'width':'135px','margin-top':'0.5em'});
			$('.page-selector').addClass('pageSelectorWidth').css({'width':'108px','margin-top':'0.5em'});
			$('.page-links').css('margin-top','0.8em');
			$('table.taglib-search-iterator tr:odd').css('background-color','#ffffff');
			$('table.taglib-search-iterator tr:even').css('background-color','#f2fafc');
			
			//#f2fafc
			//f5f8fb
			//$('.taglib-page-iterator').css('margin-top','0.5em');
			<%
			if(isSearch.equalsIgnoreCase("Y")) {%>
			  $("#backHref").show();
		  <%} %>
		  
		 
	});

	function getXhrRequest(url, success, error) {
		var xhr = new XMLHttpRequest();
		xhr.open('GET', url, true);
		xhr.send();
		xhr.onreadystatechange = function() {
			if (this.readyState != 4) return;
			if (this.status != 200) {
				if (error && typeof error === 'function') error();
			} else {
				if (success && typeof success === 'function') success();
			}

		};
	}
	
	
</script>