<%@ include file="/init.jsp" %>
<%@page import="com.liferay.portal.service.*" %>
<%@page import="com.iucn.whp.assesment.utils.*" %>
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
<%@page import="com.iucn.whp.dto.Assessment_VersionDTO" %>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState" %>
<portlet:defineObjects /> 

<%
	long currAssessmentId=0;
	long assessmentId=0;
	try{
		String selectedPkey=request.getParameter("keyVal");
		currAssessmentId=Long.parseLong(selectedPkey);
		site_assessment objsite_assessment=site_assessmentLocalServiceUtil.getsite_assessment(currAssessmentId);
		long siteid=objsite_assessment.getSite_id();
		List<site_assessment> lstAssessment=site_assessmentLocalServiceUtil.getActiveAssessmentBySiteId(siteid);
		if(lstAssessment!=null && lstAssessment.size()>1){
			Collections.sort(lstAssessment, new Comparator<site_assessment>(){
			    public int compare(site_assessment one, site_assessment other) {
			        return String.valueOf(one.getAssessment_id()).compareTo(String.valueOf(other.getAssessment_id()));
			    }
			});
			site_assessment tempsite_assessment=lstAssessment.get(0);
			assessmentId=tempsite_assessment.getAssessment_id();
		}else
		{
			site_assessment tempsite_assessment=lstAssessment.get(0);
			assessmentId=tempsite_assessment.getAssessment_id();
		}
		
		String currUserIdKey=request.getParameter("curruserIdVal");
		//currUserId=Long.parseLong(currUserIdKey);
	}
	catch(Exception ex){
	    ex.printStackTrace();
	}

	site_assessment objsite_assessment=site_assessmentLocalServiceUtil.getsite_assessment(assessmentId);
	
	List<assessment_lang_version> lstassessment_lang_version=null;
		if(assessmentId!=currAssessmentId && assessmentId>0){
			lstassessment_lang_version=assessment_lang_versionLocalServiceUtil.findByAssessmentId(assessmentId);
		}
		
	
	List<Assessment_VersionDTO> assessment_VersionDTOList=new ArrayList<Assessment_VersionDTO>();
	List<site_assessment_versions> lstsite_assessment_versions=new ArrayList<site_assessment_versions>();
	
	if(lstassessment_lang_version!=null){
		for(assessment_lang_version objassessment_lang_version:lstassessment_lang_version){
			lstsite_assessment_versions.add(site_assessment_versionsLocalServiceUtil.
					getsite_assessment_versions(objassessment_lang_version.getAssessment_version_id()));
		}
	}	
		//site_assessment_versionsLocalServiceUtil.findByAssessmentId(assessmentId);
	
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
		if(lstsite_assessment_versions!=null){
			for(site_assessment_versions objsite_assessment_versions:lstsite_assessment_versions){
				Assessment_VersionDTO tempAssessment_VersionDTO=new Assessment_VersionDTO();
				//tempSiteAssessmentDTO.setSite_Assessment(objSite_assessment);
				tempAssessment_VersionDTO.setSite_AssessmentVersions(objsite_assessment_versions);
				tempAssessment_VersionDTO.setCurrent_Stage(assessment_stagesMap.get(objsite_assessment_versions.getStage_id()));
				
				if(objsite_assessment_versions.getUserid()>0)
				tempAssessment_VersionDTO.setCurrentUser(AssessmentActionUtil.getUserNameByUserId(objsite_assessment_versions.getUserid()));
				//tempAssessment_VersionDTO.setAssessmentId(objsite_assessment_versions.getAssessment_id());
				tempAssessment_VersionDTO.setVersionCode(String.valueOf(objsite_assessment_versions.getVersion_code()));
				tempAssessment_VersionDTO.setStartDate(objsite_assessment_versions.getStart_date());
				tempAssessment_VersionDTO.setEndDate(objsite_assessment_versions.getEnd_date());
				tempAssessment_VersionDTO.setVersionId(objsite_assessment_versions.getAssessment_version_id());
				//setting current assessemnt id
				tempAssessment_VersionDTO.setAssessmentId(currAssessmentId);
				if(objsite_assessment_versions.getLanguage()>0){
					tempAssessment_VersionDTO.setLanguages(assessment_lang_lkpMap.get(objsite_assessment_versions.getLanguage()));
				}
				
				assessment_VersionDTOList.add(tempAssessment_VersionDTO);
			}
		}
		
		
		Collections.sort(assessment_VersionDTOList, new Comparator<Assessment_VersionDTO>(){
		    public int compare(Assessment_VersionDTO one, Assessment_VersionDTO other) {
		        return String.valueOf(one.getVersionCode()).compareTo(String.valueOf(other.getVersionCode()));
		    }
		});
		
	    /* whp_sitesSearchURL = (PortletURL)liferayPortletResponse.createRenderURL();
	    whp_sitesSearchURL.setParameter("jspPage", "/assessment_dashboard.jsp");
	    whp_sitesSearchURL.setParameter("isSearch", pageUrl);
	    pageContext.setAttribute("site_assessment", site_assessmentList,PageContext.SESSION_SCOPE); */
	  //check for assessment id is not equal to current assessment id 
	    if(assessment_VersionDTOList!=null && assessment_VersionDTOList.size()>0){
%>

<liferay-ui:search-container
      emptyResultsMessage="there-are-no-Site-Assessments-Version"  
      delta="20" curParam="versionPop">

    <liferay-ui:search-container-results>
    <%
   
if(assessment_VersionDTOList!=null && assessment_VersionDTOList.size()>0){
	results = ListUtil.subList(
			assessment_VersionDTOList, searchContainer.getStart(), searchContainer.getEnd());
    total = assessment_VersionDTOList.size();
}else{
	results =null;
    total = 0;
}
    

    pageContext.setAttribute("results", results);
    pageContext.setAttribute("total", total);
    
    
    
    %>
    </liferay-ui:search-container-results>

    <liferay-ui:search-container-row
        className="com.iucn.whp.dto.Assessment_VersionDTO"
        keyProperty="versionId"
        modelVar="assessment_VersionDTO">
        
        <%
        long tempVersionID=assessment_VersionDTO.getVersionId();
            
        PortletURL rowURL = liferayPortletResponse.createRenderURL();
		rowURL.setParameter("jspPage", "/view.jsp");
		rowURL.setParameter("assesmentId",assessment_VersionDTO.getAssessmentId()+"");
		rowURL.setParameter("versionId",tempVersionID+"");
		rowURL.setParameter("mode","view");
		rowURL.setWindowState(LiferayWindowState.EXCLUSIVE);
		rowURL.setWindowState(LiferayWindowState.NORMAL);
		
      %>
      
       <%-- <liferay-ui:search-container-column-text
          name="Version Id"
          value="<%= String.valueOf(assessment_VersionDTO.getVersionId()) %>" 
          href="<%=rowURL.toString() %>"
           /> --%>
             
          
      <liferay-ui:search-container-column-text
          name="Stage" 
          >
          <%= assessment_VersionDTO.getCurrent_Stage()!=null ? assessment_VersionDTO.getCurrent_Stage() : "" %>
          </liferay-ui:search-container-column-text>
          
         <liferay-ui:search-container-column-text
          name="Start Date"
          >
          <fmt:formatDate value="<%=assessment_VersionDTO.getStartDate() %>" pattern="dd/MM/yyyy" />
          </liferay-ui:search-container-column-text>
          
          <liferay-ui:search-container-column-text
          name="End Date"
          >
          <fmt:formatDate value="<%=assessment_VersionDTO.getEndDate() %>" pattern="dd/MM/yyyy" />
          </liferay-ui:search-container-column-text>
          
          <liferay-ui:search-container-column-text
          name="Version Code"
          href="<%=rowURL.toString() %>" align="center"
          >
          <%= assessment_VersionDTO.getVersionCode()!=null ? assessment_VersionDTO.getVersionCode() : "0.0" %>
          </liferay-ui:search-container-column-text>
          
        <liferay-ui:search-container-column-text
          name="Language" align="center"
         >
  		<%=assessment_VersionDTO.getLanguages()!=null ? assessment_VersionDTO.getLanguages() : "N.A"  %></liferay-ui:search-container-column-text>        
   
   <liferay-ui:search-container-column-jsp
       name="Actions"
          path="/assessment_jsp/workflow_jsp/fill_previous_actions.jsp"
          align="right" /> 
       
    </liferay-ui:search-container-row>

    <liferay-ui:search-iterator paginate="false" />

  </liferay-ui:search-container >
<%}
else {
%>

<aui:form 
	id="msgForm" 
	name="msgForm" 
	action = ""
	method="get"> 
<table class="formBlock">

	<tr align="center">
	<td><p>No previous assessment available of selected sites.</p></td>
	</tr>
	<tr >
	<td style="text-align:center;">
		<aui:button name="" type="button" value="&nbsp;&nbsp;OK&nbsp;&nbsp;" onclick="javascript:top.document.getElementById('closethick').click();"/>
	
	</td>
	
	</tr>
</table>
</aui:form>
   <%} %>
