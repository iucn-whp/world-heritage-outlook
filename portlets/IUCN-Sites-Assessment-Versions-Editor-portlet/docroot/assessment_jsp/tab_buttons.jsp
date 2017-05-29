<%@page import="com.iucn.whp.dbservice.service.site_assessment_versionsLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<portlet:defineObjects />
<liferay-theme:defineObjects />

<%

long prevAssesmentVersionId=ParamUtil.getLong(request,"previousVersionId");
Long tempAssementid = ParamUtil.getLong(request, "assesmentId", -1L);
String tempMode=ParamUtil.getString(request, "mode");
Long assessmentid = 0L;
	if(tempAssementid != -1L){
		assessmentid = tempAssementid;
	}else{
		assessmentid = site_assessment_versionsLocalServiceUtil.getsite_assessment_versions(ParamUtil.getLong(request, "assessment_versionId")).getAssessment_id();
		
	}
long curruserId=user.getUserId();
if(!"view".equalsIgnoreCase(tempMode)){ 
	if(prevAssesmentVersionId>0){
%>

<portlet:renderURL var="viewAssessmentURL" >
		 <portlet:param name="assesmentId" value="<%= String.valueOf(assessmentid) %>" />
         <portlet:param name="versionId" value="<%= String.valueOf(prevAssesmentVersionId) %>" />
         <portlet:param name="userId" value="<%= String.valueOf(user.getUserId()) %>" />
         <portlet:param name="jspPage" value="/view.jsp" />
         <portlet:param name="mode" value="view" />
</portlet:renderURL>
<input type="button"  value="View Previous Version" onClick="window.open('<%=viewAssessmentURL.toString() %>')"  />
<%-- <a href="<%=viewAssessmentURL.toString() %>"  target="_blank" ><%=AssessmentContstant.ACTION_VIEW_PREVIOUS_VERSION %></a> --%>

<%
 }else{
 %>
 <input type="button"  value="View Previous Version" onClick="javascript:alert('No previuos version of selected site assessment is available.');"  />
 <%
 }
}%>


