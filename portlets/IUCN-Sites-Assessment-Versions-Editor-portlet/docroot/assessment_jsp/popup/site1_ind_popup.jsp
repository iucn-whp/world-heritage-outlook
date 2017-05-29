<%@ include file="/init.jsp" %>

<%
	List<inscription_criteria_lkp> lstwhCriteria=null;
	assessment_whvalues whvalues= new assessment_whvaluesClp();
	List<Long>   lstWhCriteria = new ArrayList<Long>();
	long assessmentVersionId=0;
	
	try{
	    String selectedPkey=request.getParameter("keyVal");
	    assessmentVersionId = Long.parseLong(request.getParameter("versionIdVal"));
	    lstwhCriteria= inscription_criteria_lkpLocalServiceUtil.getAllInscriptionCriteria();
	    if(selectedPkey!=null && !selectedPkey.isEmpty()){
	    	whvalues = assessment_whvaluesLocalServiceUtil.getassessment_whvalues(Long.parseLong(selectedPkey));
	    	List<assessment_whvalues_whcriterion> templstWhcriterion = assessment_whvalues_whcriterionLocalServiceUtil.getAssessment_whvalues_whcriterionsBywhValue(whvalues.getWhvalues_id());
	    	for(assessment_whvalues_whcriterion criteria :templstWhcriterion){
	    		lstWhCriteria.add(criteria.getCriterion());
	    	}
	    		
	    }else {
	    	whvalues.setAssessment_version_id(assessmentVersionId);
	    	whvalues.setDescription("");
	    	whvalues.setValues("");
	    	whvalues.setWhvalues_id(0);
	    	List<assessment_whvalues> lstwhValues = site_assessmentLocalServiceUtil.getAssessment_whvaluesByVersion(assessmentVersionId);
	    	long vnCount=0;
	    	for(int i=0;i<lstwhValues.size();i++){
	    		long maxVn = lstwhValues.get(i).getVn();
	    		if(maxVn>vnCount)
	    			vnCount=maxVn;
	    	}
	    	whvalues.setVn(vnCount+1);	
	    }
	}
	catch(Exception ex){
	    out.println("Ex------------"+ex.getMessage());
	}


%>
<portlet:defineObjects /> 
   
    <portlet:actionURL name="step1details" var="step1" />

<c:set var="versionId" value="<%= assessmentVersionId %>"/>
<c:set var="UpdateUrl" value="<%=step1 %>"/>
<c:set var="RefreshUrl" value="/assessment_jsp/innerJsp/step1_ind.jsp"/>

<aui:form 
    id="step1Form" 
	name="step1Form" 
	action=""
	method="post"
>
		
	<table class="formBlock">
	
	    <aui:input
	        name="assessmentVersionId"
	        id="assessmentVersionId"
	        value="<%= whvalues.getAssessment_version_id() %>"
	        type="hidden"
	    />
	    <aui:input
	        name="assessmentwhValueId"
	        id="assessmentwhValueId"
	        value="<%= whvalues.getWhvalues_id() %>"
	        type="hidden"
	    />
	    
	    <aui:input
	        name="assessmentVn"
	        id="assessmentVn"
	        value="<%= whvalues.getVn() %>"
	        type="hidden"
	    />
	<tr>
	<td class="lblTD">
		<label class="popuplbl">Values: </label>
	</td>
	<td>
		<aui:input 
			type="text" 
			label="" 
			id="values" 
			name= "values" 
			value= "<%=whvalues.getValues() %>"
			style = "width:400px;"/>
	</td>
	</tr>
	
	<tr>
	<td class="lblTD">
		<label class="popuplbl">Description: </label>
	</td>
	<td spellcheck="true" class="valueTD">
		<aui:input 
			type="textarea" 
			label="" 
			id="description" 
			name= "description" 
			value= "<%=whvalues.getDescription() %>"
			
			/>
	</td>
	</tr>
	
	<tr>
	<td class="lblTD">
		<label class="popuplbl">WH Criteria: </label>
	</td>
	
	<td>
	<div class="checkboxListforThreat" id="criteriaDiv">
							
			
		<!-- <select  multiple size="5" name="listCriteria" id="listCriteria" class="selctinputtxt"> -->
			<%
			for(int i=0;i<lstwhCriteria.size();i++){
				inscription_criteria_lkp temp_criteria_lkp= lstwhCriteria.get(i);
				if(lstWhCriteria.contains(Long.parseLong(temp_criteria_lkp.getCriteria_id()+"") )){
					
			%>
		<input type="checkbox" name = "listCriteria" id = "listCriteria" checked value = "<%=temp_criteria_lkp.getCriteria_id() %>"> &nbsp;&nbsp; <%=temp_criteria_lkp.getCriteria() %><br>
			<%-- <option  selected="true" id="<%=temp_criteria_lkp.getCriteria_id() %>" value="<%=temp_criteria_lkp.getCriteria_id() %>">
				<%=temp_criteria_lkp.getCriteria() %>
			</option> --%>
			
			<%}else { %>
			<input type="checkbox" name = "listCriteria" id = "listCriteria" value = "<%=temp_criteria_lkp.getCriteria_id() %>" >&nbsp;&nbsp; <%=temp_criteria_lkp.getCriteria() %><br>
			<%-- <option  id="<%=temp_criteria_lkp.getCriteria_id() %>" value="<%=temp_criteria_lkp.getCriteria_id() %>">
				<%=temp_criteria_lkp.getCriteria() %>
			</option> --%>
			<%}} %>
	</div>
	</td>
	
	</tr>
	<tr >
	<td colspan="2" class="btnTD" >
		<aui:button type="button" value="Submit" onclick="javascript:validatestep1Form();"/>
		<aui:button name="cancelButton" type="button" value="Cancel" onclick="javascript:top.document.getElementById('closethick').click();"/>
	</td>
	</tr>
	</table>
</aui:form>

<script>

	function validatestep1Form(){
	
	var isValid = true;
	var values = $('#<portlet:namespace/>values').val();
	var listCriteria = [];
	var description = $('#<portlet:namespace/>description').val();
	
    $('#criteriaDiv :checked').each(function() {
    	listCriteria.push($(this).val());
    });
    $('#t').val(listCriteria);
	if(values==""){
		isValid = false;
		alert("Please fill Values.");
	}else if(description==""){
		isValid = false;
		alert("Please fill Description field of Values.");
	}else if(listCriteria==""){
		isValid = false;
		alert("Please select at least one criteria value");
	}

	if(isValid){
		$("input[type=button]").attr("disabled", "disabled");
		submitPopupForm('${versionId }','${RefreshUrl}','indDiv','step1Form','${UpdateUrl }',1);
	}
}
</script>
