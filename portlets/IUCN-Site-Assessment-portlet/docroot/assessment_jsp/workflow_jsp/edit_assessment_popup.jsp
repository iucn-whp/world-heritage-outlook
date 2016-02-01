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
	long assessmentId=0;
	try{
		String selectedPkey=request.getParameter("keyVal");
		assessmentId=Long.parseLong(selectedPkey);
		
		String currUserIdKey=request.getParameter("curruserIdVal");
		//currUserId=Long.parseLong(currUserIdKey);
	}
	catch(Exception ex){
	    ex.printStackTrace();
	}

	site_assessment objsite_assessment=site_assessmentLocalServiceUtil.getsite_assessment(assessmentId);

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
	List<assessment_lang_version> lstassessment_lang_version=assessment_lang_versionLocalServiceUtil.findByAssessmentId(assessmentId);
	
	
%>

<liferay-ui:search-container
      emptyResultsMessage="there-are-no-Site-Assessments-Version"  
      delta="5">

    <liferay-ui:search-container-results>
    <%
   
	if(lstassessment_lang_version!=null && lstassessment_lang_version.size()>0){
		results = ListUtil.subList(
				lstassessment_lang_version, searchContainer.getStart(), searchContainer.getEnd());
	    total = lstassessment_lang_version.size();
	}else{
		results =null;
	    total = 0;
	}
	    

    pageContext.setAttribute("results", results);
    pageContext.setAttribute("total", total);
    
    
    
    %>
    </liferay-ui:search-container-results>

    <liferay-ui:search-container-row
        className="com.iucn.whp.dbservice.model.assessment_lang_version"
        keyProperty="assessment_version_id"
        modelVar="assessment_lang_versionObj">
        
        <%
        long tempVersionID=assessment_lang_versionObj.getAssessment_version_id();
            
        PortletURL rowURL = liferayPortletResponse.createActionURL();
		rowURL.setParameter("assesmentId",assessment_lang_versionObj.getAssessmentid()+"");
		rowURL.setParameter("versionId",tempVersionID+"");
		rowURL.setParameter("langId",assessment_lang_versionObj.getLanguageid()+"");
		rowURL.setParameter("mode","view");
		
		//finding assessment version for stage 
		site_assessment_versions assessment_versions = site_assessment_versionsLocalServiceUtil.getsite_assessment_versions(tempVersionID);
		
		String stage=assessment_stagesMap.get(assessment_versions.getStage_id());
      
      %>
      
       <liferay-ui:search-container-column-text
          name="Version Id"
          value="<%= String.valueOf(tempVersionID) %>"
         
           />
             
          
      <liferay-ui:search-container-column-text
          name="Language" 
          >
          <%= assessment_lang_lkpMap.get(assessment_lang_versionObj.getLanguageid()) %>
          </liferay-ui:search-container-column-text>
          
          <liferay-ui:search-container-column-text
          name="Stage" 
          >
          <%= stage %>
          </liferay-ui:search-container-column-text>
          
          <liferay-ui:search-container-column-jsp
          name="Actions"
          path="/assessment_jsp/workflow_jsp/assessment_edit_actions.jsp"
          align="right" />
          
          <%-- 
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
          name="Version"
          >
          <%= assessment_VersionDTO.getVersionCode()!=null ? assessment_VersionDTO.getVersionCode() : "0.0" %>
          </liferay-ui:search-container-column-text>
          
        <liferay-ui:search-container-column-text
          name="Language"
          property="languages"
          value="<%=assessment_VersionDTO.getLanguages() %>" />
          
        --%>                 
                        
     <%--  
     <liferay-ui:search-container-column-jsp
       name="Actions"
          path="/assessment_jsp/dashboard_actions.jsp"
          align="right" />  --%>
       
    </liferay-ui:search-container-row>

    <liferay-ui:search-iterator />

  </liferay-ui:search-container>
  
  
  
  