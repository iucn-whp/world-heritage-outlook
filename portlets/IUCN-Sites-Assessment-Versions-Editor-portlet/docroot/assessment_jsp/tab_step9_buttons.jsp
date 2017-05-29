<%@include file="/init.jsp" %>
<%@page import="com.iucn.whp.assesment.utils.*" %>
<portlet:defineObjects />
<liferay-theme:defineObjects />

<%
String tempAssementId=ParamUtil.getString(request, "assesmentId");
String tempmode=String.valueOf(request.getAttribute("mode"));
String tempVersionId = String.valueOf(request.getAttribute("versionId"));
long assessmentId=0;
if(!tempAssementId.isEmpty()){
	assessmentId =Long.parseLong(tempAssementId);
}else{
	assessmentId=site_assessment_versionsLocalServiceUtil.getsite_assessment_versions(Long.parseLong(ParamUtil.getString(request, "assessment_versionId"))).getAssessment_id();		
	
}
long versionId =Long.parseLong(tempVersionId);
//long curruserId=user.getUserId();
if(!"view".equalsIgnoreCase(tempmode)){
%>

 
    <portlet:actionURL  name="submitForReviewAction" var="submitForReviewURL" >
         <portlet:param name="assessmentId" value="<%= String.valueOf(assessmentId) %>" />
         <portlet:param name="versionId" value="<%= String.valueOf(versionId) %>" />
         <portlet:param name="userId" value="<%= String.valueOf(user.getUserId()) %>" />
    </portlet:actionURL>
    
     <portlet:actionURL  name="reviewCompletedAction" var="reviewCompletedURL" >
         <portlet:param name="assessmentId" value="<%= String.valueOf(assessmentId) %>" />
         <portlet:param name="versionId" value="<%= String.valueOf(versionId) %>" />
         <portlet:param name="userId" value="<%= String.valueOf(user.getUserId()) %>" />
         <portlet:param name="jspPage" value="success.jsp"/>
    </portlet:actionURL>
    
    <portlet:actionURL  name="approveAssessmentAction" var="assessmetApproveURL" >
         <portlet:param name="assessmentId" value="<%= String.valueOf(assessmentId) %>" />
         <portlet:param name="versionId" value="<%= String.valueOf(versionId) %>" />
         <portlet:param name="userId" value="<%= String.valueOf(user.getUserId()) %>" />
    </portlet:actionURL>
    
        <portlet:actionURL  name="translationCompleateAction" var="translationCompleateURL" >
         <portlet:param name="assessmentId" value="<%= String.valueOf(assessmentId) %>" />
         <portlet:param name="versionId" value="<%= String.valueOf(versionId) %>" />
         <portlet:param name="userId" value="<%= String.valueOf(user.getUserId()) %>" />
    </portlet:actionURL>


<c:if test="<%= AssessmentActionUtil.hasButtonVisible(assessmentId,user.getUserId(),AssessmentContstant.ACTION_SUBMIT_ASSESSMENT ) %>">
<input type="button" value="<%=AssessmentContstant.ACTION_SUBMIT_ASSESSMENT %>" onClick="javascript:validatePopup('submitForReviewAction','Are you sure to submit the Assessment Questionnaire for review?','Review');" />

</c:if>

<c:if test="<%= AssessmentActionUtil.hasButtonVisible(assessmentId,user.getUserId(),AssessmentContstant.ACTION_SUBMIT_REVIEW) %>">
<input type="button" value="<%=AssessmentContstant.ACTION_SUBMIT_REVIEW %>" onClick="javascript:validatePopup('reviewCompletedAction','Are you sure to submit the Assessment Questionnaire for approve?','Approve');" />
</c:if>

<c:if test="<%= AssessmentActionUtil.hasButtonVisible(assessmentId,user.getUserId(),AssessmentContstant.ACTION_APPROVE) %>">
<input type="button" value="<%=AssessmentContstant.ACTION_APPROVE %>" onClick="javascript:validatePopup('approveAssessmentAction','Are you sure to submit the Assessment Questionnaire for publish?','Publish');" />
</c:if>

<c:if test="<%= AssessmentActionUtil.hasButtonVisible(assessmentId,user.getUserId(),AssessmentContstant.ACTION_SUBMIT_TRANSLATION) %>">
<input type="button" value="<%=AssessmentContstant.ACTION_SUBMIT_TRANSLATION %>" onClick="javascript:validatePopup('translationCompleateAction','Are you sure to submit the Assessment Questionnaire?');" />
</c:if>

 <jsp:include page="/assessment_jsp/tab_buttons.jsp" /> 
<%-- <portlet:renderURL var="viewAssessmentURL" >
		 <portlet:param name="assesmentId" value="<%= String.valueOf(assessmentId) %>" />
         <portlet:param name="versionId" value="<%= String.valueOf(versionId) %>" />
         <portlet:param name="userId" value="<%= String.valueOf(user.getUserId()) %>" />
         <portlet:param name="jspPage" value="/view.jsp" />
         <portlet:param name="mode" value="view" />
         <portlet:param name="mode" value="view" />
    </portlet:renderURL>
<input type="button"  value="<%=AssessmentContstant.ACTION_VIEW_PREVIOUS_VERSION %>" onClick="window.open('<%=viewAssessmentURL.toString() %>')"  /> 
 --%>
 
 <%-- <a href="<%=viewAssessmentURL.toString() %>"  target="_blank" ><%=AssessmentContstant.ACTION_VIEW_PREVIOUS_VERSION %></a> --%>

<%} %>


<portlet:resourceURL var="checkStatus"/>
<!-- Wrapper Ends here-->
<script type="text/javascript">

	
	function validatePopup(actionMethodName,msg,popupTitle) {
	
		jQuery.get('<%=checkStatus %>&ACTION_CMD=stepStatusUpdate&STEP_NO=9&VersionId=<%=String.valueOf(versionId) %>',
				function(data) { 
				
				var parsedJSONObject = jQuery.parseJSON(data); 
				var result= parsedJSONObject.rows;
				
				if(result[0].isStatusUpdated==false){
					var steps = result[0].Step;
					var CurrentStep = result[0].CurrentStep;
					if(steps.length==1){
						alert("Please complete step "+steps+" of Assessment before submission of Assessment Questionnaire.");
					}
					else {
						alert("Please complete steps "+steps+" of Assessment before submission of Assessment Questionnaire.");
					}
					$("#step"+CurrentStep).click();
					return false;
				}else{
					submitTabForReview(actionMethodName,msg,popupTitle);
				}	  
			});
			
		
		
	}
	
	function submitTabForReview(actionMethodName,msg,popupTitle){
		
		var customUrl="<portlet:renderURL  windowState='<%= LiferayWindowState.POP_UP.toString() %>'><portlet:param name='jspPage' value='jspURL' /><portlet:param name='actionPage' value='refURL' /><portlet:param name='msgVal' value='msgValue' /><portlet:param name='userId' value='userIdValue' /><portlet:param name='versionId' value='versionIdValue' /><portlet:param name='assessmentId' value='assessmentIdValue' /></portlet:renderURL>";
	    var tempUrl=customUrl.replace("msgValue",msg);
	    var refreshPageUrl=tempUrl.replace("jspURL","/assessment_jsp/workflow_jsp/submitAssessmentRecord.jsp");
	    refreshPageUrl=refreshPageUrl.replace("assessmentIdValue","<%= String.valueOf(assessmentId) %>");
	    refreshPageUrl=refreshPageUrl.replace("versionIdValue","<%= String.valueOf(versionId) %>");
	    refreshPageUrl=refreshPageUrl.replace("userIdValue","<%= String.valueOf(user.getUserId()) %>");
	    
	    var finalUrl=refreshPageUrl.replace("refURL",actionMethodName);
		//alert(istrue);
	    AUI().use('aui-dialog', 'aui-io', 'event', 'event-custom', function(A) {
		     var dialog = new A.Dialog({
		            title: popupTitle,
		            centered: true,
		            draggable: true,
		            modal: true
		        }).plug(A.Plugin.IO, {uri: finalUrl}).render();
		        
		        dialog.show();
		        
		  });
	}
	
</script>

