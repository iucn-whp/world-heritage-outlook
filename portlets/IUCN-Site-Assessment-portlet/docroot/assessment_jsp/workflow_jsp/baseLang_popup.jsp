<%@ include file="/init.jsp" %>


<%
	List<assessment_lang_lkp> assessment_lang_lkpList=assessment_lang_lkpLocalServiceUtil.findAll();
	long assessmentVersionId=0;
	String assessmentId="";
	
	try{
	    assessmentId=request.getParameter("keyVal");
	    assessmentVersionId = Long.parseLong(request.getParameter("versionIdVal"));
	}
	catch(Exception ex){
	    ex.printStackTrace();
	}


%>
<portlet:defineObjects /> 
   
    <portlet:actionURL name="updateBaseLanguage" var="baseLangURL" />

<aui:form 
    id="baseLangForm" 
	name="baseLangForm" 
	action="<%=baseLangURL %>"
	method="post"
>
		
	<table class="formBlock">
	
	    <aui:input
	        name="assessmentVerId"
	        id="assessmentVerId"
	        value="<%= assessmentVersionId %>"
	        type="hidden"
	    />
	    
	    <aui:input
	        name="assessmentId"
	        id="assessmentId"
	        value="<%=assessmentId %>"
	        type="hidden"
	    />
	
	
	<tr>
	<td>
		<label class="popuplbl">Base Language: </label>
	</td>
	
	<td>
	
		<select  name="baseLangId" id="baseLangId" style="width:200px;">
			<%
			for(int i=0;i<assessment_lang_lkpList.size();i++){
				assessment_lang_lkp tempassessment_lang_lkp= assessment_lang_lkpList.get(i);
				%>
			
			<option  id="<%=tempassessment_lang_lkp.getLanguageid() %>" value="<%=tempassessment_lang_lkp.getLanguageid() %>">
				<%=tempassessment_lang_lkp.getLanguagename() %>
			</option>
			<%} %>
		</select>
	</td>
	
	</tr>
	<tr ><td></td>
	<td style="text-align:right;" >
		<aui:button type="Submit" value="Submit" />
		<aui:button name="cancelButton" type="button" value="Cancel" onclick="javascript:top.document.getElementById('closethick').click();"/>
	</td>
	</tr>
	</table>
</aui:form>

<script>

	function validatestep1Form(){
	
	var isValid = true;
	var type = $('#<portlet:namespace/>type').val();

	if(isValid){
		submitPopupForm('${versionId }','${RefreshUrl}','indDiv','step1Form','${UpdateUrl }');
	}
}
</script>
