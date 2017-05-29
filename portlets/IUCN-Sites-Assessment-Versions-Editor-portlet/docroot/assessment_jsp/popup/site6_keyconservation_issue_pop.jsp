<%@ include file="/init.jsp" %>
<%





long assessmentVersionId=0;

List<key_conservation_scale_lkp> lstkeyconservationscallkp=null;

key_conservation_issues key_conservation_obj = new key_conservation_issuesClp();




try{

	String selectedPkey=request.getParameter("keyVal");
    assessmentVersionId = Long.parseLong(request.getParameter("versionIdVal"));
    lstkeyconservationscallkp= key_conservation_issuesLocalServiceUtil.getAllconversionScale();
    
    if(selectedPkey!=null && !selectedPkey.isEmpty())
    {
    	key_conservation_obj=key_conservation_issuesLocalServiceUtil.getkey_conservation_issues(Long.parseLong(selectedPkey));
    	
    	
    }
    else
    {
    	key_conservation_obj.setKey_conservation_issues("");
    	key_conservation_obj.setDescription("");
    	key_conservation_obj.setScale(0);
    	key_conservation_obj.setAssessment_version_id(assessmentVersionId);
    	key_conservation_obj.setKey_conservation_issues_id(0);
    	
    }


}
	catch(Exception ex){
	
		    out.println("Ex------------"+ex.getMessage());
		    
	}

%>	
	
	
<portlet:defineObjects /> 
   
    <portlet:actionURL name="understandingkeyconservation" var="step6" />
    
    <c:set var="versionId" value="<%= assessmentVersionId %>"/>
<c:set var="UpdateUrl" value="<%=step6 %>"/>
<c:set var="RefreshUrl" value="/assessment_jsp/innerJsp/step6_key_cois.jsp"/>


<aui:form 
    id="step6Form" 
	name="step6Form" 
	action=""
	method="post"
>
		
	<table class="formBlock">
	
	    <aui:input
	        name="conservation_issues_id"
	        id="conservation_issues_id"
	        value="<%=key_conservation_obj.getKey_conservation_issues_id() %>"
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
		<label class="popuplbl">Key Conservation Issue: </label>
	</td>
	<td>
		<aui:input 
			type="text" 
			label="" 
			id="keyconissue" 
			name= "keyconissue" 
			value= "<%=key_conservation_obj.getKey_conservation_issues()%>"
			style="width:400px;"/>
	</td>
	</tr>
	
	<tr>
	<td class="lblTD">
		<label class="popuplbl">  Description: </label>
	</td>
	<td spellcheck="true" class="valueTD">
		<aui:input 
			type="textarea" 
			label="" 
			id="description" 
			name= "description" 
			value= "<%=key_conservation_obj.getDescription()%>"
			/>
	</td>
	</tr>
	<tr>
	<td class="lblTD">
		<label class="popuplbl">Scale: </label>
	</td>
	
	<td>
	<aui:select label="" id="scale" name= "scale" style="width:205px;" >
			<aui:option value="">Select scale</aui:option>
			<%
			for(int i=0;i<lstkeyconservationscallkp.size();i++){
				key_conservation_scale_lkp keyconservationscallkp= lstkeyconservationscallkp.get(i);
				//System.out.println("key_conservation_obj.getScale()--"+key_conservation_obj.getScale());
				System.out.println("keyconservationscallkp.getScale_id()--"+keyconservationscallkp.getScale_id());
				
				if(keyconservationscallkp.getScale_id()==key_conservation_obj.getScale()){
					System.out.println("inside if --"+key_conservation_obj.getScale());
			%>
			
				<aui:option selected="true"	value="<%=keyconservationscallkp.getScale_id() %>">
					<%=keyconservationscallkp.getScale() %>
				</aui:option>
			
			<%} else { %> 
				<aui:option
					value="<%=keyconservationscallkp.getScale_id() %>">
					<%=keyconservationscallkp.getScale() %>
				</aui:option>
				
				<%}} %>
		</aui:select>
	</td>
	</tr>
	
	<tr>
	<td class="btnTD" colspan="2" >
		<aui:button type="button" value="Submit" onclick="javascript:validatestep6Form();"/>
		<aui:button name="cancelButton" type="button" value="Cancel" onclick="javascript:top.document.getElementById('closethick').click();"/>
	</td>
	</tr>
	</table>
</aui:form>




<aui:script>

	function validatestep6Form(){
	
var isValid = true;
	
	
 var isValid = true;
	
	var keyconissue = $('#<portlet:namespace/>keyconissue').val();
	var description = $('#<portlet:namespace/>description').val();	
	var scale = $('#<portlet:namespace/>scale').val();	
	
	
	
	if(keyconissue==""){
		isValid =false;
		alert("Key Conservation Issue is required.");
	}
	else if(description==""){
		isValid =false;
		alert("Description is required.");
	} 
	
	else if(scale==0)
	{
	isValid =false;
		alert("scale is required.");
	}
	
	
	if(isValid){

       
		submitPopupForm('${versionId }','${RefreshUrl}','step6Div','step6Form','${UpdateUrl }',6);
		
	}
}
</aui:script>














