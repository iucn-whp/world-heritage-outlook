<%@ include file="/init.jsp" %>

<%
	List<state_lkp> lstStates = site_assessmentLocalServiceUtil.getAllStates();
	List<trend_lkp> lstTrends = site_assessmentLocalServiceUtil.getAllTrends();
	List<current_state_trend> lstStateTrends = null;
	long assessmentVersionId = 0;
	String msg="";
	state_trend_biodivvals state_trendBio = new state_trend_biodivvalsClp();
	try{
	 	String selectedPkey=request.getParameter("keyVal");
	    assessmentVersionId = Long.parseLong(request.getParameter("versionIdVal"));
	    lstStateTrends = site_assessmentLocalServiceUtil.getCurrent_state_trendByVersion(assessmentVersionId);
	    if(selectedPkey!=null && !selectedPkey.equalsIgnoreCase("0")){
	    	state_trendBio = state_trend_biodivvalsLocalServiceUtil.getstate_trend_biodivvals(Long.parseLong(selectedPkey));
	    	for(current_state_trend st:lstStateTrends){
	    		long state = st.getState_id();
	    		if(state==0 && st.getIs_biodiv_whval()){
	    			msg="Please fill Assessment of Current State And Trend Of Values before filling Other important biodiversity values.";
	    			break;
	    		}
	    	}
	    }
	}
	catch(Exception ex){
	    ex.printStackTrace();
	}
%>
<portlet:defineObjects /> 
   
    <portlet:actionURL name="updateStateTrendBio" var="step4bio" />

<c:set var="versionId" value="<%= assessmentVersionId %>"/>
<c:set var="UpdateUrl" value="<%=step4bio %>"/>
<c:set var="RefreshUrl" value="/assessment_jsp/innerJsp/step4_whvalue_overall.jsp"/>

<aui:form 
    id="step4bioForm" 
	name="step4bioForm" 
	action=""
	method="post"
>
	<% if(true){ %>
	<aui:input
	        name="assessmentVersionId"
	        id="assessmentVersionId"
	        value="<%= state_trendBio.getAssessment_version_id() %>"
	        type="hidden"
	    />
	    <aui:input
	        name="stateTrendId"
	        id="stateTrendId"
	        value="<%= state_trendBio.getState_trend_biodivvals_id() %>"
	        type="hidden"
	    />	
	<table class="formBlock">
	<tr>
		<td>
			<label class="popuplbl">Values :</label>
		</td>
		<td>
			<label class="popuplbl">Assessment of the current state and trend of other important biodiversity values </label>
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
		value = "<%=state_trendBio.getJustification() %>"
		label= ""
		
		/>
	</td>
	</tr>
	
	<tr>
	<td class="lblTD">
		<label class="popuplbl">Assessment: </label>
	</td>
	<td>
		<aui:select name = "currentAssessment" 
			label= "" 
			id = "currentAssessment"
			style="width:400px;">
			<aui:option value = "0">Select</aui:option>
			<%
			for(int i=0;i<lstStates.size();i++){
				state_lkp state= lstStates.get(i);
				if(state.getState_id()==state_trendBio.getState_id()){
					
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
		<aui:select name = "currentTrend" 
			label= "" 
			id = "currentTrend"
			style="width:400px;">
			<aui:option value = "0">Select</aui:option>
			<%
			for(int i=0;i<lstTrends.size();i++){
				trend_lkp trend= lstTrends.get(i);
				if(trend.getTrend_id()==state_trendBio.getTrend_id()){
					
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
		<aui:button type="button" value="Submit" onclick="javascript:validatestep4bioForm();"/>
		<aui:button name="cancelButton" type="button" value="Cancel" onclick="javascript:top.document.getElementById('closethick').click();"/>
	</td>
	</tr>
	</table>
	<%}else
	{ %>
	<table class="formBlock">
	
		
				
	<tr>
		<td>
			<label "><%=msg %></label>
		</td>
		
	</tr>
	
	<tr>
		<td style="text-align:center;">
			
			<aui:button name="cancelButton" type="button" value="OK" onclick="javascript:top.document.getElementById('closethick').click();"/>
		</td>
	</tr>
		
	</table>
	<%}%>
</aui:form>


<script>

	function validatestep4bioForm(){
	
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
		submitPopupForm('${versionId }','${RefreshUrl}','step4whDiv','step4bioForm','${UpdateUrl }',4);
	}
}
</script>
