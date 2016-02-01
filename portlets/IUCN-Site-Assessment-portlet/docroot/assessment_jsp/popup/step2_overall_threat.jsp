<%@ include file="/init.jsp" %>

<%
	long assessmentVersionId = 0;
	String threatType = null;
	List<threat_summary_current> lstCurrentThreatSum = null;
	List<threat_summary_potential> lstPotentialThreatSum = null;
	List<threat_summary_overall> lstOverallThreatSum = null;
	List<threat_rating_lkp> lstThreatRatinglkp = null;
	List<assessing_threats_current> lstCurrentThreat = null;
	List<assessing_threats_potential> lstPotentialThreat = null;
	String msg = "";
	long rating_id = 0;
	String justification = "";
	long threatSummaryId = 0;
	try{
	 	String selectedPkey=request.getParameter("keyVal");
	 	String[] str = selectedPkey.split("_");
	 	threatType = str[1];
	    assessmentVersionId = Long.parseLong(request.getParameter("versionIdVal"));
	    lstThreatRatinglkp = site_assessmentLocalServiceUtil.getAllThreatRating();
	    if(threatType.equalsIgnoreCase("current")){
	    	lstCurrentThreatSum = site_assessmentLocalServiceUtil.getThreatSummaryCurrentByVersion(assessmentVersionId);
	    	lstCurrentThreat = site_assessmentLocalServiceUtil.getAssessingThreatsCurrentByVersion(assessmentVersionId);
	    	if(!lstCurrentThreatSum.isEmpty() && !lstCurrentThreat.isEmpty()){
	    		threatSummaryId = lstCurrentThreatSum.get(0).getThreat_sum_cur_id();
	    		rating_id = lstCurrentThreatSum.get(0).getThreat_rating();
		    	justification = lstCurrentThreatSum.get(0).getOverall_current();
	    	}else{
	    		msg = "Please fill Assessment of Current Threat before filling Overall Assessment of current Threats. ";
	    	}
	    	
	    }else if(threatType.equalsIgnoreCase("potential")){
	    	lstPotentialThreatSum = site_assessmentLocalServiceUtil.getThreatSummaryPotentialByVersion(assessmentVersionId);
	    	lstPotentialThreat = site_assessmentLocalServiceUtil.getAssessingThreatsPotentialByVersion(assessmentVersionId);
	    	if(!lstPotentialThreatSum.isEmpty() && !lstPotentialThreat.isEmpty()){
		    	threatSummaryId = lstPotentialThreatSum.get(0).getThreat_sum_potential_id();
		    	rating_id = lstPotentialThreatSum.get(0).getThreat_rating();
		    	justification = lstPotentialThreatSum.get(0).getOverall_potential();
	    	}
	    	else{
	    		msg = "Please fill Assessment of Potential Threat before filling Overall Assessment of Potential Threats. ";
	    	}
	    }else if(threatType.equalsIgnoreCase("overall")){
	    	lstOverallThreatSum = site_assessmentLocalServiceUtil.getThreatSummaryOverallByVersion(assessmentVersionId);
	    	lstCurrentThreat = site_assessmentLocalServiceUtil.getAssessingThreatsCurrentByVersion(assessmentVersionId);
	    	if(!lstOverallThreatSum.isEmpty() && !lstCurrentThreat.isEmpty()){
		    	threatSummaryId = lstOverallThreatSum.get(0).getThreat_sum_overall_id();
		    	rating_id = lstOverallThreatSum.get(0).getThreat_rating();
		    	justification = lstOverallThreatSum.get(0).getOverall_threat();
	    	}else{
	    		msg = "Please fill Assessment of Current Threat before filling Overall Assessment of Threats. ";
	    	}
	    }
	}
	catch(Exception ex){
	    ex.printStackTrace();
	}
%>
<portlet:defineObjects /> 
   
    <portlet:actionURL name="updateStep2overallThreat" var="step2OverallThreat" />

<c:set var="versionId" value="<%=assessmentVersionId %>"/>
<c:set var="UpdateUrl" value="<%=step2OverallThreat %>"/>
<c:set var="RefreshUrl" value="/assessment_jsp/innerJsp/step2_ot.jsp"/>

<aui:form 
    id="step2OverallForm" 
	name="step2OverallForm" 
	action=""
	method="post"
>
<% if(msg.isEmpty()){ %>
	<aui:input
	        name="threatType"
	        id="threatType"
	        value="<%= threatType %>"
	        type="hidden"
	    />	
	  <aui:input
	        name="threatSummaryId"
	        id="threatSummaryId"
	        value="<%= threatSummaryId %>"
	        type="hidden"
	    />	  
	 <aui:input
	        name="assessmentVersionId"
	        id="assessmentVersionId"
	        value="<%= assessmentVersionId %>"
	        type="hidden"
	    />
<table class="formBlock">

<tr>
		<td class="lblTD">
			<label class="popuplbl">Justification:</label>
		</td>
		<td spellcheck="true" class="valueTD">
			<aui:input type= "textarea" name = "justification" id = "justification"
			value= "<%=justification %>"
			label=""/>
		</td>
	</tr>
	
		
				
	<tr>
		<td class="lblTD">
			<label class="popuplbl">Assessment:</label>
		</td>
		<td>
			<aui:select name = "currentAssessment" label= "" id = "currentAssessment" style="width:205px;">
				<aui:option value = "0">Select</aui:option>
				<%
				for(int i=0;i<lstThreatRatinglkp.size();i++){
					threat_rating_lkp rating= lstThreatRatinglkp.get(i);
					if(rating.getId()==rating_id){
				%>
			
				<aui:option  selected="true" value="<%=rating.getId() %>">
					<%=rating.getRating() %>
				</aui:option>
				
				<%}else { %>
				
				<aui:option  value="<%=rating.getId() %>">
					<%=rating.getRating() %>
				</aui:option>
				<%}} %>
			</aui:select>
		</td>
	</tr>
	
	<tr>
		<td class="btnTD" colspan="2" >
			<aui:button type="button" value="Submit" onclick="javascript:validatestep2otForm();"/>
			<aui:button name="cancelButton" type="button" value="Cancel" onclick="javascript:top.document.getElementById('closethick').click();"/>
		</td>
	</tr>
		
	</table>
	<%}else{ %>
	<table class="formBlock">
	
		
				
	<tr>
		<td>
			<label ><%=msg %></label>
		</td>
		
	</tr>
	
	<tr>
		<td style="text-align:center;">
			
			<aui:button name="cancelButton" type="button" value="OK" onclick="javascript:top.document.getElementById('closethick').click();"/>
		</td>
	</tr>
		
	</table>
	<%} %>
</aui:form>

<script>

	function validatestep2otForm(){
	
		var isValid = true;
		var assessment = $('#<portlet:namespace/>currentAssessment').val();
		var justification = $('#<portlet:namespace/>justification').val();	
		
		if(justification == ""){
			isValid =false;
			alert("Justification is required.");
		}else if(assessment==0){
			isValid =false;
			alert("Assessment Value is required.");
		}
		
	if(isValid){
		submitPopupForm('${versionId }','${RefreshUrl}','step2oltDiv','step2OverallForm','${UpdateUrl }',2);
	}
}
</script>
