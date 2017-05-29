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
<%@ page import="java.text.SimpleDateFormat" %>
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

	List<Assessment_VersionDTO> assessment_VersionDTOList=new ArrayList<Assessment_VersionDTO>();
	List<site_assessment_versions> lstsite_assessment_versions=site_assessment_versionsLocalServiceUtil.findByAssessmentId(assessmentId);
	
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
				tempAssessment_VersionDTO.setAssessmentId(objsite_assessment_versions.getAssessment_id());
				tempAssessment_VersionDTO.setVersionCode(String.valueOf(objsite_assessment_versions.getVersion_code()));
				tempAssessment_VersionDTO.setStartDate(objsite_assessment_versions.getStart_date());
				tempAssessment_VersionDTO.setEndDate(objsite_assessment_versions.getEnd_date());
				tempAssessment_VersionDTO.setVersionId(objsite_assessment_versions.getAssessment_version_id());
				if(objsite_assessment_versions.getLanguage()>0){
					tempAssessment_VersionDTO.setLanguages(assessment_lang_lkpMap.get(objsite_assessment_versions.getLanguage()));
				}
				
				assessment_VersionDTOList.add(tempAssessment_VersionDTO);
			}
		}
		
//		small fix for sorting version.
		Collections.sort(assessment_VersionDTOList, new Comparator<Assessment_VersionDTO>(){
		    public int compare(Assessment_VersionDTO one, Assessment_VersionDTO other) {
				int compareVersion = String.valueOf(one.getVersionCode()).compareTo(String.valueOf(other.getVersionCode()));
		        if (compareVersion == 0){
					return Long.compare(one.getSite_AssessmentVersions().getAssessment_version_id(), other
							.getSite_AssessmentVersions().getAssessment_version_id());
				}
				return compareVersion;
		    }
		});
		
	    /* whp_sitesSearchURL = (PortletURL)liferayPortletResponse.createRenderURL();
	    whp_sitesSearchURL.setParameter("jspPage", "/assessment_dashboard.jsp");
	    whp_sitesSearchURL.setParameter("isSearch", pageUrl);
	    pageContext.setAttribute("site_assessment", site_assessmentList,PageContext.SESSION_SCOPE); */

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
		
		//System.out.println("rowURL----"+rowURL);
		//renderResponse.
		//rowURL.getWindowState();
		//rowURL.setProperty("name","normal");
		
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
          name="User"
           property="currentUser"
           value="<%= assessment_VersionDTO.getCurrentUser() %>" />
          
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
          href="<%=rowURL.toString() %>" 
          align="center"
           target="_blank"
          >
          <%= assessment_VersionDTO.getVersionCode()!=null ? assessment_VersionDTO.getVersionCode() : "0.0" %>
          </liferay-ui:search-container-column-text>
          
        <liferay-ui:search-container-column-text
          name="Language" align="center"
         >
  		<%=assessment_VersionDTO.getLanguages()!=null ? assessment_VersionDTO.getLanguages() : "N.A"  %></liferay-ui:search-container-column-text>        


	     <liferay-ui:search-container-column-text name="Download Word" align="center">

			 <%
				 Long versionId = ((Assessment_VersionDTO) assessment_VersionDTO).getVersionId();

				 Date initiationDate = objsite_assessment.getInitiation_date();

				 SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

				 String formattedDate = dateFormat.format(initiationDate);

			 %>

			 <portlet:resourceURL var="wordURL">
				 <portlet:param name="ACTION_CMD" value="DOWNLOAD_WORD_DOCUMENT"/>
				 <portlet:param name="INITIATION_DATE" value="<%= formattedDate %>"/>
				 <portlet:param name="SITE_ID" value="<%= String.valueOf(objsite_assessment.getSite_id()) %>"/>
				 <portlet:param name="VERSION_ID" value="<%= String.valueOf(versionId) %>"/>
			 </portlet:resourceURL>

			 <a href="<%=wordURL %>"><%=AssessmentContstant.ACTION_WORD %></a>
			 <%--<liferay-ui:icon image="edit" message="<%=AssessmentContstant.ACTION_WORD %>" url="<%= wordURL.toString() %>" />--%>

			 <%--<%=assessment_VersionDTO.getLanguages()!=null ? assessment_VersionDTO.getLanguages() : "N.A"  %>--%>
		 </liferay-ui:search-container-column-text>

    </liferay-ui:search-container-row>

    <liferay-ui:search-iterator paginate="false" />

  </liferay-ui:search-container >

   
