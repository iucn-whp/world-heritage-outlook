<%@page import="com.iucn.whp.dbservice.service.country_lkpLocalServiceUtil"%>
<%@page import="com.iucn.whp.dto.SiteAssessmentDTO" %>
<%@page import="com.iucn.whp.assesment.utils.*" %>
<%@page import="javax.portlet.*"%>
<%@include file="/init.jsp" %>
<portlet:defineObjects />
<liferay-theme:defineObjects />

<%

ResultRow row = (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
SiteAssessmentDTO objSiteAssessmentDTO = (SiteAssessmentDTO) row.getObject();
// long groupId = themeDisplay.getLayout().getGroupId(); 
String name = SiteAssessmentDTO.class.getName();
String primKey = String.valueOf(objSiteAssessmentDTO.getAssessmentId()); 
long assessment_id= Long.parseLong(primKey);
boolean isLoggedUserIsCurrentUser=AssessmentActionUtil.isLoggedUserIsCurrentUser(assessment_id,user.getUserId());


//String rowURL="javascript:viewContactPopup('/contact_jsp/contactForm.jsp','"+primKey+"','Add Contact Information')";
String jspPage="/assessment_jsp/workflow_jsp/assign_assessor_popup.jsp";

request.setAttribute("assessment_id", assessment_id);

String fillAssessmentURL="";
String assessmentPhase="";


//check for user logged in
if(AssessmentActionUtil.isAssessorAssigned(assessment_id) && !AssessmentActionUtil.isInitiated(assessment_id)){
		if(isLoggedUserIsCurrentUser){
			assessmentPhase="render";
		}else{
			fillAssessmentURL="javascript:alert('You must be allocated as Assessor to fill Assessment Questionnaire of this site.');";
		}
}else{
		fillAssessmentURL="javascript:alert('Please assign Reviewer before filling the Assessment Questionnaire');";
}

if(AssessmentActionUtil.isInitiated(assessment_id)){
	if(AssessmentActionUtil.isAssessorAssigned(assessment_id)){
		if(isLoggedUserIsCurrentUser){
			if(AssessmentActionUtil.hasBaseLang(assessment_id)){
				assessmentPhase="render";
			}else{
				String selectBaseLangJSP="/assessment_jsp/workflow_jsp/baseLang_popup.jsp";
				fillAssessmentURL="javascript:assessmentActionPopup('"+selectBaseLangJSP+"','"+primKey+"','1','Select Base Language')";
			}
		}else{
			fillAssessmentURL="javascript:alert('You must be allocated as Assessor to fill Assessment Questionnaire of this site.');";
		}
		
	}else{
		fillAssessmentURL="javascript:alert('Please assign Assessor before filling the Assessment Questionnaire');";
	}
}


String jspReviewPage="/assessment_jsp/workflow_jsp/assign_reviewer_popup.jsp";
String assignAssessorURL="javascript:assessmentActionPopup('"+jspPage+"','"+primKey+"','1','Assign Assessor','"+AssessmentContstant.ACTION_ASSIGN_ASSESSOR+"')";
String assignReviewerURL="javascript:assessmentActionPopup('"+jspReviewPage+"','"+primKey+"','1','Assign Reviewer','"+AssessmentContstant.ACTION_ASSIGN_REVIEWER+"')";

String jspVersionPage="/assessment_jsp/workflow_jsp/assessment_version_popup.jsp";
String viewVersionURL="javascript:assessmentActionPopup('"+jspVersionPage+"','"+primKey+"','1','View Assessment Versions','"+AssessmentContstant.ACTION_VIEW_VERSION+"')";
%>

<liferay-ui:icon-menu>

   	<c:if test="<%= AssessmentActionUtil.hasLinkVisible(assessment_id,user.getUserId(),AssessmentContstant.ACTION_FILLASSESSMENT) %>"> 
  
	<%if(assessmentPhase.equalsIgnoreCase("render")){ %>
	<portlet:actionURL var="renderAssessmentURL" name="fillAssessmentAction">
         <portlet:param name="assessment_id" value="<%= primKey %>" />
         <portlet:param name="userId" value="<%= String.valueOf(user.getUserId()) %>" />
    </portlet:actionURL>
	
	 <liferay-ui:icon image="edit" message="<%=AssessmentContstant.ACTION_FILLASSESSMENT %>" url="<%=renderAssessmentURL.toString() %>" />
	<%}else {%>
    <liferay-ui:icon image="edit" message="<%=AssessmentContstant.ACTION_FILLASSESSMENT %>" url="#" onClick="<%=fillAssessmentURL %>" />
  	<%} %>
 	 </c:if>
 	 
 	<c:if test="<%= AssessmentActionUtil.hasLinkVisible(assessment_id,user.getUserId(),AssessmentContstant.ACTION_ASSIGN_ASSESSOR) %>">
    <liferay-ui:icon image="edit" message="<%=AssessmentContstant.ACTION_ASSIGN_ASSESSOR %>" url="#" onClick="<%=assignAssessorURL %>" />
     </c:if>
 	
 	<c:if test="<%= AssessmentActionUtil.hasLinkVisible(assessment_id,user.getUserId(),AssessmentContstant.ACTION_ASSIGN_REVIEWER) %>">
      <liferay-ui:icon image="edit" message="<%=AssessmentContstant.ACTION_ASSIGN_REVIEWER %>" url="#" onClick="<%=assignReviewerURL %>" />
     </c:if>
     
     
    <c:if test="<%= AssessmentActionUtil.hasLinkVisible(assessment_id,user.getUserId(),AssessmentContstant.ACTION_REVIEW) %>">
     <portlet:actionURL var="reviewAssessmentURL" name="reviewAssessmentAction" >
         <portlet:param name="assessmentId" value="<%= primKey %>" />
         <portlet:param name="userId" value="<%= String.valueOf(user.getUserId()) %>" />
    </portlet:actionURL>
    
    <liferay-ui:icon image="edit" message="<%=AssessmentContstant.ACTION_REVIEW %>" url="<%= reviewAssessmentURL.toString() %>" />
    
     </c:if>
    <c:if test="<%= AssessmentActionUtil.hasLinkVisible(assessment_id,user.getUserId(),AssessmentContstant.ACTION_APPROVE) %>">
   
    
    <portlet:actionURL var="approveAssessmentURL" name="approveAssessmentAction" >
         <portlet:param name="assessmentId" value="<%= primKey %>" />
         <portlet:param name="userId" value="<%= String.valueOf(user.getUserId()) %>" />
    </portlet:actionURL>
    
    <liferay-ui:icon image="edit" message="<%=AssessmentContstant.ACTION_APPROVE %>" url="<%= approveAssessmentURL.toString() %>" />
    
     </c:if>
     
    <c:if test="<%= AssessmentActionUtil.hasLinkVisible(assessment_id,user.getUserId(),AssessmentContstant.ACTION_PUBLISH) %>">
   
    
    <%-- <portlet:actionURL var="publishAssessmentURL" name="publishAssessmentAction" >
         <portlet:param name="assessmentId" value="<%= primKey %>" />
         <portlet:param name="userId" value="<%= String.valueOf(user.getUserId()) %>" />
    </portlet:actionURL> --%>
    
    <%
    String jspPublishPage="/assessment_jsp/workflow_jsp/publish_assessment_popup.jsp";
    String publishAssessmentURL="javascript:assessmentActionPopup('"+jspPublishPage+"','"+primKey+"','1','Publish Assessment','"+AssessmentContstant.ACTION_ASSIGN_TRANSLATOR+"')";
    %>
    
    <liferay-ui:icon image="edit" message="<%=AssessmentContstant.ACTION_PUBLISH %>" url="#" onClick="<%=publishAssessmentURL %>" />
     <%
    String jspeditPage="/assessment_jsp/workflow_jsp/edit_assessment_popup.jsp";
    String editAssessmentURL="javascript:assessmentActionPopup('"+jspeditPage+"','"+primKey+"','1','edit Assessment','"+AssessmentContstant.ACTION_ASSIGN_TRANSLATOR+"')";
    %>
     <liferay-ui:icon image="edit" message="<%=AssessmentContstant.ACTION_EDIT_PUBLISHED %>" url="<%=editAssessmentURL.toString() %>"  />
     </c:if>
     
    
    <c:if test="<%= AssessmentActionUtil.hasLinkVisible(assessment_id,user.getUserId(),AssessmentContstant.ACTION_TRANSLATE) && !AssessmentActionUtil.isAllTranslated(assessment_id) %>"> 
   
     <%
     
     long curr_assessment_lang_versionId=AssessmentActionUtil.getAssessentCurrTranslationVersion(Long.parseLong(primKey));
     
     String assignTranslatorURL="javascript:assessmentActionPopup('"+jspPage+"','"+primKey+"','"+curr_assessment_lang_versionId+"','Assign Translator','"+AssessmentContstant.ACTION_ASSIGN_TRANSLATOR+"')";
     if(curr_assessment_lang_versionId>0){
     %>
   
     <liferay-ui:icon image="edit" message="<%=AssessmentContstant.ACTION_ASSIGN_TRANSLATOR %>" url="#" onClick="<%=assignTranslatorURL %>" />
   
    
    <portlet:actionURL var="translateURL" name="translateAssessmentAction" >
         <portlet:param name="assessmentId" value="<%= primKey %>" />
         <portlet:param name="versionId" value="<%= String.valueOf(curr_assessment_lang_versionId) %>" />
         <portlet:param name="userId" value="<%= String.valueOf(user.getUserId()) %>" />
    </portlet:actionURL>
    
    <liferay-ui:icon image="edit" message="<%=AssessmentContstant.ACTION_TRANSLATE %>" url="<%= translateURL.toString() %>" />
    <%
    } else {
    	String assementTranslateJSP="/assessment_jsp/workflow_jsp/translationLang_popup.jsp";
    	String tranlateAssessmentURL="javascript:assessmentActionPopup('"+assementTranslateJSP+"','"+primKey+"','1','Select Translation Language')";
    %>
    <liferay-ui:icon image="edit" message="<%=AssessmentContstant.ACTION_TRANSLATE %>" url="#" onClick="<%=tranlateAssessmentURL %>" />
    <%} %>
   
     </c:if>
    <%-- <c:if test="<%= AssessmentActionUtil.hasLinkVisible(assessment_id,user.getUserId(),AssessmentContstant.ACTION_ASSIGN_ASSESSOR) %>"> --%>
    
    
    <%
    //check for assessment has some values
    long currVersionId=AssessmentActionUtil.getWoarkingVersion(assessment_id);
    if(currVersionId>0){
    %>
    
     <portlet:actionURL var="viewAssessmentURL" name="viewAssessmentAction" >
         <portlet:param name="assessment_id" value="<%= primKey %>" />
         <portlet:param name="userId" value="<%= String.valueOf(user.getUserId()) %>" />
         <portlet:param name="mode" value="view" />
    </portlet:actionURL>
    
    <liferay-ui:icon image="edit" message="View" url="<%=viewAssessmentURL.toString() %>" />
    
    <liferay-ui:icon image="edit" message="<%=AssessmentContstant.ACTION_VIEW_VERSION %>" url="#" onClick="<%= viewVersionURL %>" />
      <% }
    else{
    	
    	String viewURL="javascript:alert('Assessment Questionnaire is not available.');";
    %>
    <liferay-ui:icon image="edit" message="View" url="#" onClick="<%=viewURL.toString() %>" />
    <%} %>
    
   
   <!-- delete assessment added by kamal  -->
  
   <c:if test="<%= AssessmentActionUtil.hasLinkVisible(assessment_id,user.getUserId(),AssessmentContstant.ACTION_DELETE_ASSESSMENT) %>" >
   
   <%
   String assementdeleteJSP="/assessment_jsp/workflow_jsp/assessment_delete_popup.jsp";
   String deleteAssessmentURL="javascript:assessmentActionPopup('"+assementdeleteJSP+"','"+primKey+"','1','Delete Assessment')";
   	
   %>
   
    <liferay-ui:icon image="edit" message="<%=AssessmentContstant.ACTION_DELETE_ASSESSMENT %>" url="#" onClick="<%=deleteAssessmentURL %>" />
   
   </c:if>
     
  
</liferay-ui:icon-menu>