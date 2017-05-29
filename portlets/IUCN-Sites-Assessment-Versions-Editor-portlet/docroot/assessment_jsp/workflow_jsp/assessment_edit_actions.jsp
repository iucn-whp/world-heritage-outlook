<%@include file="/init.jsp" %>
<portlet:defineObjects />
<liferay-theme:defineObjects />
<%@page import="com.iucn.whp.assesment.utils.*" %>



<%
 ResultRow row = (ResultRow) request.getAttribute(
    WebKeys.SEARCH_CONTAINER_RESULT_ROW);
com.iucn.whp.dbservice.model.assessment_lang_version assessment_lang_versionObj = (assessment_lang_version) row.getObject();
// long groupId = themeDisplay.getLayout().getGroupId(); 
String name = whp_contact.class.getName();
String primKey = String.valueOf(assessment_lang_versionObj.getPrimaryKey()); 
//String rowURL="javascript:viewContactPopup('/contact_jsp/contactForm.jsp','"+primKey+"','Add Contact Information')";
%>

<liferay-ui:icon-menu>

  <%-- <c:if test="<%= permissionChecker.hasPermission(groupId, name, primKey, ActionKeys.UPDATE) %>"> --%>
  
  <%-- <%if(!assessment_lang_versionObj.isPublished()){ %> --%>
  <portlet:actionURL var="editPublishesAssessmentURL" name="editPublishesAssessmentAction" >
         <portlet:param name="assesmentId" value="<%= String.valueOf(assessment_lang_versionObj.getAssessmentid()) %>" />
         <portlet:param name="versionId" value="<%= String.valueOf(assessment_lang_versionObj.getAssessment_version_id()) %>" />
         <portlet:param name="userId" value="<%= String.valueOf(user.getUserId()) %>" />
    </portlet:actionURL>

    <liferay-ui:icon image="edit" message="" url="<%=editPublishesAssessmentURL.toString() %>"  />
   <%--  <%} %> --%>
    
    <%-- <%=AssessmentContstant.ACTION_EDIT_PUBLISHED %> --%>
     
 

</liferay-ui:icon-menu> 