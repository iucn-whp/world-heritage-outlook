<%@ include file="/init.jsp" %>

<%
long assessmentVersionId=0;

List<conservation_outlook_rating_lkp> lstconservationratinglkp=null;

conservation_outlook conservation_obj= new conservation_outlookClp();


try{

	String selectedPkey=request.getParameter("keyVal");
    assessmentVersionId = Long.parseLong(request.getParameter("versionIdVal"));
    
   
    lstconservationratinglkp = conservation_outlookLocalServiceUtil.getconservationoutlookrating();
	  if(selectedPkey!=null && !selectedPkey.isEmpty())
	    {
	    
 		  conservation_obj= conservation_outlookLocalServiceUtil.getconservation_outlook(Long.parseLong(selectedPkey));
 	   }else{
 		  conservation_obj.setAssessment_version_id(assessmentVersionId);
 		  conservation_obj.setConservation_outlook_id(0);
 		  conservation_obj.setJustification("");
 		  conservation_obj.setRating(0);
 	   }
	 
	  
	  
}catch(Exception ex){
    out.println("Ex------------"+ex.getMessage());
}

%>


<portlet:defineObjects /> 
   
    <portlet:actionURL name="justificationofassessment" var="step5" />
    
    <c:set var="versionId" value="<%= assessmentVersionId %>"/>
<c:set var="UpdateUrl" value="<%=step5 %>"/>
<c:set var="RefreshUrl" value="/assessment_jsp/innerJsp/step5_cons_outlook.jsp"/>



<aui:form 
    id="step5Form" 
	name="step5Form" 
	action=""
	method="post"
>
		
	<table class="formBlock">
	
	    <aui:input
	        name="conservation_id"
	        id="conservation_id"
	        value="<%=conservation_obj.getConservation_outlook_id()%>"
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
		<label class="popuplbl">  Justification of Assessment : </label>
	</td>
	<td spellcheck="true" class="valueTD">
		<aui:input 
			type="textarea" 
			label="" 
			id="justification" 
			name= "justification" 
			value= "<%=conservation_obj.getJustification()%>"
			/>
	</td>
	</tr>
	
	
	<tr>
	<td class="lblTD">
		<label class="popuplbl">Assessment: </label>
	</td>
	
	<td>
	<aui:select label="" id="assessment" name= "assessment" style="width:400px;" >
			<aui:option value="">Select Assessment</aui:option>
		<%
		
		for(int i=0;i<lstconservationratinglkp.size();i++)
		{
		
		conservation_outlook_rating_lkp outlook_rating_lkp =lstconservationratinglkp.get(i);
		
		if(outlook_rating_lkp.getCo_rating_id()==conservation_obj.getRating()){
		
		%>
		
			<aui:option selected="true"	value="<%=outlook_rating_lkp.getCo_rating_id() %>">
					<%=outlook_rating_lkp.getCo_rating()%>
				</aui:option>
					<%} else { %> 
					<aui:option
					value="<%=outlook_rating_lkp.getCo_rating_id() %>">
					<%=outlook_rating_lkp.getCo_rating() %>
				</aui:option>
		
		
			<%}} %>
			
		</aui:select>
	</td>
	</tr>
	
	<tr>
	<td class="btnTD" colspan="2" >
		<aui:button type="button" value="Submit" onclick="javascript:validatestep5Form();"/>
		<aui:button name="cancelButton" type="button" value="Cancel" onclick="javascript:top.document.getElementById('closethick').click();"/>
	</td>
	</tr>
	</table>
</aui:form>


<aui:script>

	function validatestep5Form(){
	
	
	
 var isValid = true;
 
 
    var justification = $('#<portlet:namespace/>justification').val();
	var assessment = $('#<portlet:namespace/>assessment').val();	
	
	
	
	if(justification==""){
		isValid =false;
		alert("Justification Of Assessment is required.");
	}
	
	else if(assessment==0)
	{
	isValid =false;
		alert("Assessment is required.");
	} 
	
	
	if(isValid){

        $("input[type=button]").attr("disabled", "disabled");
		submitPopupForm('${versionId }','${RefreshUrl}','step3overAllDiv','step5Form','${UpdateUrl }',5);
		
	}
}
</aui:script>



