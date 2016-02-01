<%@page import="com.iucn.whp.dbservice.service.*"%>
<%@page import="com.iucn.whp.dbservice.model.*"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@include file="/siteinfo_jsp/init.jsp" %>
<%
List<assessment_whvalues> lstwhValues=null;
List<biodiversity_values> lstbioValues=null;
List<assessment_lang_version> lstlangversion=null;
long assessment_version_id=0;
 /* List<site_assessment> lstsite_assessment=null;

try{
 long siteid=Long.parseLong(request.getAttribute("siteId").toString());
 lstsite_assessment=site_assessmentLocalServiceUtil.getActiveAssessmentBySiteId(siteid); 
 int size=lstsite_assessment.size();
	for(int i=0;i<size;i++){
		site_assessment tempsite_assessment=lstsite_assessment.get(i);
		
		List<assessment_lang_version> lstassessment_lang_version=null;
		lstassessment_lang_version=assessment_lang_versionLocalServiceUtil.
		findByAssessmentId(tempsite_assessment.getAssessment_id());
		for(assessment_lang_version tempassessment_lang_version:lstassessment_lang_version){
		if(tempassessment_lang_version.getPublished()){
			assessment_version_id=tempassessment_lang_version.getAssessment_version_id();
			break;
		}
	}
		if(assessment_version_id>0)
			break;
	} */
	try{
		assessment_version_id=Long.parseLong((String)request.getAttribute("versionId"));
	//find data
	lstwhValues=assessment_whvaluesLocalServiceUtil.getEntriesByAssessmentVersionId(assessment_version_id);
	lstbioValues=site_assessmentLocalServiceUtil.getBiodiversityValuesByVersion(assessment_version_id);
	
 }catch(Exception e){
	 
	 e.printStackTrace();
 } 

 assessment_version_id=Long.parseLong(request.getAttribute("versionId").toString());
 if(lstwhValues!=null){

%>
<table class="siteInfoRightBlock">

<c:forEach items="<%= lstwhValues%>" var="lstwhValuesobj" varStatus="status">		
<tr><td>${lstwhValuesobj.getValues()}</td></tr>
</c:forEach> 
<%
 }

 if(lstbioValues!=null){
%>

<c:forEach items="<%= lstbioValues%>" var="lstbioValuesobj" varStatus="status">		
<tr><td>${lstbioValuesobj.getValue()}</td></tr>
</c:forEach> 
<%} %>

</table>