<%@ include file="/init.jsp" %>

<%

potential_project_needs  potential_project = new potential_project_needsClp();


long assessmentVersionId=0;

try{   

	

	 String selectedPkey=request.getParameter("keyVal");
	    assessmentVersionId = Long.parseLong(request.getParameter("versionIdVal"));
	    if(selectedPkey!=null && !selectedPkey.isEmpty())
	    {
 	    	potential_project= potential_project_needsLocalServiceUtil.getpotential_project_needs(Long.parseLong(selectedPkey));
 	    	
	    }
	    else
	    	
	    {
	    	potential_project.setContact_details("");
	    	potential_project.setDescription("");
	    	potential_project.setOrganization_individual("");
	    	
	    	potential_project.setAssessment_version_id(assessmentVersionId);
	    	
	    	potential_project.setPpn_id(0);  	
	    	
	    	
	    	
	    }
}catch(Exception ex){
    out.println("Ex------------"+ex.getMessage());
}



%>


<portlet:defineObjects /> 
   
    <portlet:actionURL name="compilationofpotentialpro" var="step8" />
    
<c:set var="versionid2" value="<%= assessmentVersionId %>"/>
<c:set var="UpdateUrl" value="<%=step8 %>"/>
<c:set var="RefreshUrl" value="/assessment_jsp/innerJsp/step8_coppn.jsp"/>


<aui:form 
    id="step8Form2" 
	name="step8Form2" 
	action=""
	method="post"
>
		
	<table class="formBlock">
	<aui:input
	        name="ppnid"
	        id="ppnid"
	        value="<%=potential_project.getPpn_id() %>"
	        type="hidden"
	    />
	    <aui:input
	        name="assessmentVersionId"
	        id="assessmentVersionId"
	        value="<%= assessmentVersionId %>"
	        type="hidden"
	    />
	<tr>
	<td class="lblTD">
		<label class="popuplbl">Organisation: </label>
	</td>
	<td>
		<aui:input 
			type="text" 
			label="" 
			id="organisation" 
			name= "organisation" 
			value= "<%=potential_project.getOrganization_individual() %>"
			style="width:440px;"/>
	</td>
	</tr>
	
	<tr>
	<td class="lblTD">
		<label class="popuplbl"> Brief Description: </label>
	</td>
	<td spellcheck="true" class="valueTD">
		<aui:input 
			type="textarea" 
			label="" 
			id="description" 
			name= "description" 
			value= "<%=potential_project.getDescription() %>"
			/>
	</td>
	</tr>
	<tr>
	<td class="lblTD">
		<label class="popuplbl">contact Detail: </label>
	</td>
	
	<td spellcheck="true" class="valueTD">
	<aui:input 
			type="textarea" 
			label="" 
			id="contactdetail" 
			name= "contactdetail" 
			value= "<%=potential_project.getContact_details() %>"
			/>	
	</td>
	</tr>
	
	<tr>
	<td class="btnTD" colspan="2" >
		<aui:button type="button" value="Submit" onclick="javascript:validatestep8bForm();"/>
		<aui:button name="cancelButton" type="button" value="Cancel" onclick="javascript:top.document.getElementById('closethick').click();"/>
	</td>
	</tr>
	</table>
</aui:form>


<script>

	function validatestep8bForm(){
	
		var isValid = true;
	
	 var isValid = true;
	var organisation = $('#<portlet:namespace/>organisation').val();
	var description = $('#<portlet:namespace/>description').val();	
	var contactdetail = $('#<portlet:namespace/>contactdetail').val();	
	
	
	if(organisation==""){
		isValid =false;
		alert("Organisation is required.");
	}
	else if(description==""){
		isValid =false;
		alert("Description is required.");
	} 
	
	/* else if(contactdetail=="")
	{
	isValid =false;
		alert("Contact is required.");
	} */
	
	if(isValid){

   		$("input[type=button]").attr("disabled", "disabled");
		submitPopupForm('${versionid2 }','${RefreshUrl}','coppDiv','step8Form2','${UpdateUrl }',8);
		
	}
}
</script>