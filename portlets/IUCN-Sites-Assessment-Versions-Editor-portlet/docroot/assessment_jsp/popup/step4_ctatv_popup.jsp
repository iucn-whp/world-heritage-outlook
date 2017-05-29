<%@ include file="/init.jsp" %>

<%
	List<state_lkp> lstStates = site_assessmentLocalServiceUtil.getAllStates();
	List<trend_lkp> lstTrends = site_assessmentLocalServiceUtil.getAllTrends();
	List<assessment_whvalues> lstWhvalues= null;
	long assessmentVersionId = 0;
	current_state_trend curr_state_trend = new current_state_trendClp();
	try{
	 	String selectedPkey=request.getParameter("keyVal");
	    assessmentVersionId = Long.parseLong(request.getParameter("versionIdVal"));
	    lstWhvalues = site_assessmentLocalServiceUtil.getAssessment_whvaluesByVersion(assessmentVersionId);
	    if(selectedPkey!=null && !selectedPkey.isEmpty()){
	    	curr_state_trend = current_state_trendLocalServiceUtil.getcurrent_state_trend(Long.parseLong(selectedPkey));
	    	
	    }else {
	    	curr_state_trend.setAssessment_version_id(assessmentVersionId);
	    	curr_state_trend.setJustification("");
	    	curr_state_trend.setState_id(0);
	    	curr_state_trend.setState_trend_id(0);
	    	curr_state_trend.setTrend_id(0);
	    	curr_state_trend.setVn(0);
	    }
	}
	catch(Exception ex){
	    ex.printStackTrace();
	}
%>
<portlet:defineObjects /> 
   
    <portlet:actionURL name="updateCurrentStateTrend" var="step4" />

<c:set var="versionId" value="<%= assessmentVersionId %>"/>
<c:set var="UpdateUrl" value="<%=step4 %>"/>
<c:set var="RefreshUrl" value="/assessment_jsp/innerJsp/step4_ctatv.jsp"/>

<aui:form 
    id="step4ctatvForm" 
	name="step4ctatvForm" 
	action=""
	method="post"
>
	<aui:input
	        name="assessmentVersionId"
	        id="assessmentVersionId"
	        value="<%= curr_state_trend.getAssessment_version_id() %>"
	        type="hidden"
	    />
	    <aui:input
	        name="stateTrendId"
	        id="stateTrendId"
	        value="<%= curr_state_trend.getState_trend_id() %>"
	        type="hidden"
	    />	
	<table class="formBlock">
	<tr>
	<td>
		<label class="popuplbl">Values :</label>
	</td>
	<td>
	<% 
	String value = "";
	if(curr_state_trend.getIs_biodiv_whval())
		value = biodiversity_valuesLocalServiceUtil.getbiodiversity_values(curr_state_trend.getVn()).getValue();
	else 
		value = assessment_whvaluesLocalServiceUtil.getassessment_whvalues(curr_state_trend.getVn()).getValues();
	%>
		<label class="popuplbl" style="width:400px;"><%=value %></label>
		<aui:input
	        name="currentWhValue"
	        id="currentWhValue"
	        value="<%= curr_state_trend.getVn() %>"
	        type="hidden"
	    />	
	</td>
	</tr>
	
	<tr>
	<td class="lblTD">
		<label class="popuplbl">Justification of Assessment :</label>
	</td>
	<td spellcheck="true" class="valueTD">
		<aui:input type= "textarea" 
		name = "justificationAssessment" 
		id= "justificationAssessment" 
		value = "<%=curr_state_trend.getJustification() %>"
		label= ""
		
		/>
	</td>
	</tr>
	
	<tr>
	<td class="lblTD">
		<label class="popuplbl">Assessment: </label>
	</td>
	<td>
		<aui:select name = "currentAssessment" label= "" id = "currentAssessment" style="width:400px;">
			<aui:option value = "0" >Select</aui:option>
			<%
			for(int i=0;i<lstStates.size();i++){
				state_lkp state= lstStates.get(i);
				if(state.getState_id()==curr_state_trend.getState_id()){
					
			%>
		
			<aui:option  selected="true" value="<%=state.getState_id() %>">
				<%=state.getState() %>
			</aui:option>
			
			<%}else { %>
			
			<aui:option  value="<%=state.getState_id() %>">
				<%=state.getState() %>
			</aui:option>
			<%}} %>
		</aui:select>
	</td>
	</tr>
	
	<tr>
	<td class="lblTD">
		<label class="popuplbl">Trend: </label>
	</td>
	<td>
		<aui:select name = "currentTrend" label= "" id = "currentTrend" style="width:400px;">
			<aui:option value = "0" >Select</aui:option>
			<%
			for(int i=0;i<lstTrends.size();i++){
				trend_lkp trend= lstTrends.get(i);
				if(trend.getTrend_id()==curr_state_trend.getTrend_id()){
					
			%>
		
			<aui:option  selected="true" value="<%=trend.getTrend_id() %>">
				<%=trend.getTrend() %>
			</aui:option>
			
			<%}else { %>
			
			<aui:option  value="<%=trend.getTrend_id() %>">
				<%=trend.getTrend() %>
			</aui:option>
			<%}} %>
		</aui:select>
	</td>
	</tr>
	
	
	
	<tr>
	<td class="btnTD" colspan="2" >
		<aui:button type="button" value="Submit" onclick="javascript:validatestep4ctatvForm();"/>
		<aui:button name="cancelButton" type="button" value="Cancel" onclick="javascript:top.document.getElementById('closethick').click();"/>
	</td>
	</tr>
	</table>
</aui:form>


<script>

	function validatestep4ctatvForm(){
	
	var isValid = true;
	var assessment = $('#<portlet:namespace/>currentAssessment').val();
	var trends = $('#<portlet:namespace/>currentTrend').val();
	var justification = $('#<portlet:namespace/>justificationAssessment').val();	
	
	
	if(justification==""){
		isValid =false;
		alert("Justification is required.");
		
	}else if(justification != "" && assessment==0){
		isValid =false;
		alert("Assessment Value is required.");
	}else if(justification != "" && trends==0){
		isValid =false;
		alert("Trend Value is required.");
	}
	 
	if(isValid){
		$("input[type=button]").attr("disabled", "disabled");
		submitPopupForm('${versionId }','${RefreshUrl}','step4MainDiv','step4ctatvForm','${UpdateUrl }',4);
	}
}
</script>
