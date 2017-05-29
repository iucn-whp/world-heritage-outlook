<%@page import="com.iucn.whp.dbservice.service.country_lkpLocalServiceUtil"%>
<%@page import="com.iucn.whp.dto.Assessment_VersionDTO" %>
<%@page import="com.iucn.whp.assesment.utils.*" %>
<%@page import="javax.portlet.*"%>
<%@include file="/init.jsp" %>
<portlet:defineObjects />
<liferay-theme:defineObjects />

<%

ResultRow row = (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
Assessment_VersionDTO objAssessment_VersionDTO = (Assessment_VersionDTO) row.getObject();
// long groupId = themeDisplay.getLayout().getGroupId(); 
String name = Assessment_VersionDTO.class.getName();
String selectedPkey=request.getParameter("keyVal");
long current_Assessment_id= objAssessment_VersionDTO.getAssessmentId();
long pversion_id= objAssessment_VersionDTO.getVersionId();
//long passessmentId=objAssessment_VersionDTO.get
String assessmentVersionId = ParamUtil.getString(request, "versionIdVal");
%>

<liferay-ui:icon-menu>
    <portlet:actionURL var="fillFromPrevAssessmentURL" name="fillFromPrevAssessmentAction">
        <portlet:param name="assessmentId" value="<%= selectedPkey %>"/>
        <portlet:param name="pversionId" value="<%= String.valueOf(pversion_id) %>"/>
        <portlet:param name="assessmentVersionId" value="<%= assessmentVersionId %>"/>
    </portlet:actionURL>

    <liferay-ui:icon image="edit" message="FILL" url="<%= fillFromPrevAssessmentURL.toString() %>"/>

</liferay-ui:icon-menu>