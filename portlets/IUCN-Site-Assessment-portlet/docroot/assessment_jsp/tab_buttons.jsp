<%@page import="com.iucn.whp.dbservice.service.site_assessment_versionsLocalServiceUtil"%>
<%@page import="com.iucn.whp.dbservice.model.site_assessment_versions"%>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@page import="com.iucn.whp.assesment.utils.*" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<portlet:defineObjects />
<liferay-theme:defineObjects />

<%

long prevAssesmentVersionId=Long.parseLong(request.getAttribute("previousVersionId").toString());
String tempAssementid=ParamUtil.getString(request, "assesmentId");
String tempMode=String.valueOf(request.getAttribute("mode"));
long assessmentid=0;
	if(!tempAssementid.isEmpty()){
		assessmentid =Long.parseLong(tempAssementid);
	}else{
		assessmentid=site_assessment_versionsLocalServiceUtil.getsite_assessment_versions(Long.parseLong(ParamUtil.getString(request, "assessment_versionId"))).getAssessment_id();		
		
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
<input type="button"  value="<%=AssessmentContstant.ACTION_VIEW_PREVIOUS_VERSION %>" onClick="window.open('<%=viewAssessmentURL.toString() %>')"  /> 
<%-- <a href="<%=viewAssessmentURL.toString() %>"  target="_blank" ><%=AssessmentContstant.ACTION_VIEW_PREVIOUS_VERSION %></a> --%>

<%
 }else{
 %>
 <input type="button"  value="<%=AssessmentContstant.ACTION_VIEW_PREVIOUS_VERSION %>" onClick="javascript:alert('No previuos version of selected site assessment is available.');"  />
 <%
 }
}%>


