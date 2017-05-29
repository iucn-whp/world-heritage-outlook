<%@ include file="/init.jsp" %>

<%
	
	biodiversity_values biovalues= new biodiversity_valuesClp();
	long assessmentVersionId=0;
	
	try{
	    String selectedPkey=request.getParameter("keyVal");
	    assessmentVersionId = Long.parseLong(request.getParameter("versionIdVal"));
	    if(selectedPkey!=null && !selectedPkey.isEmpty()){
	    	biovalues = biodiversity_valuesLocalServiceUtil.getbiodiversity_values(Long.parseLong(selectedPkey));
	    		
	    }else {
	    	biovalues.setDescription("");
	    	biovalues.setValue("");
	    	biovalues.setAssessment_version_id(assessmentVersionId);
	    	List<biodiversity_values> lstbioValues = site_assessmentLocalServiceUtil.getBiodiversityValuesByVersion(assessmentVersionId);
	    	long vnCount=0;
	    	for(int i=0;i<lstbioValues.size();i++){
	    		long maxVn = lstbioValues.get(i).getVn();
	    		if(maxVn>vnCount)
	    			vnCount=maxVn;
	    	}
	    	biovalues.setVn(vnCount+1);
	    }
	}
	catch(Exception ex){
	    out.println("Ex------------"+ex.getMessage());
	}

%>
<portlet:defineObjects /> 
   
    <portlet:actionURL name="step1biodetails" var="step1" />

<c:set var="versionId" value="<%= assessmentVersionId %>"/>
<c:set var="UpdateUrl" value="<%=step1 %>"/>
<c:set var="RefreshUrl" value="/assessment_jsp/innerJsp/step1_oib.jsp"/>

<aui:form 
    id="step1bioForm" 
	name="step1bioForm" 
	action=""
	method="post"
>
		
	<table class="formBlock">
	<aui:input
	        name="assessmentVersionId"
	        id="assessmentVersionId"
	        value="<%= biovalues.getAssessment_version_id() %>"
	        type="hidden"
	    />
	    <aui:input
	        name="assessmentVn"
	        id="assessmentVn"
	        value="<%= biovalues.getVn() %>"
	        type="hidden"
	    />
	    
	    <aui:input
	        name="bioId"
	        id="bioId"
	        value="<%= biovalues.getId() %>"
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
			value= "<%=biovalues.getValue() %>"
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
			value= "<%=biovalues.getDescription() %>"
			/>
			
	</td>
	</tr>
	
	
	<tr>
	<td colspan="2" class="btnTD">
		<aui:button type="button" value="Submit" onclick="javascript:validatestep1bioForm();"/>
		<aui:button name="cancelButton" type="button" value="Cancel" onclick="javascript:top.document.getElementById('closethick').click();"/>
	</td>
	</tr>
	</table>
</aui:form>


<script>

	function validatestep1bioForm(){
	
	var isValid = true;
	var value = $('#<portlet:namespace/>values').val();
	var description = $('#<portlet:namespace/>description').val();	
	
	if(value==""){
		isValid =false;
		alert("Please fill Values.");
	}
	else if(description==""){
		isValid =false;
		alert("Please fill Description field of Values.");
	}
	
	if(isValid){

		$("input[type=button]").attr("disabled", "disabled");
		submitPopupForm('${versionId }','${RefreshUrl}','oibDiv','step1bioForm','${UpdateUrl }',1);
	}
}
</script>
