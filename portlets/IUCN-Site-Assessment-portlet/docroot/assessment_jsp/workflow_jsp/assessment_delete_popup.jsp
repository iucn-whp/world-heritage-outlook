<%@ include file="/init.jsp" %>
<portlet:defineObjects />
<liferay-theme:defineObjects />

<%
String assessmentId="";
	
	
	try{
	    assessmentId=request.getParameter("keyVal");

	}catch(Exception e )
	{
		e.printStackTrace();
	}
	    
	    %>
	    
	    
	    
<portlet:defineObjects /> 
   
    <portlet:actionURL name="deleteassessmentAction" var="deleteAssessmentURL" />




<aui:form 
    id="translateLangForm" 
	name="translateLangForm" 
	action="<%=deleteAssessmentURL %>"
	method="post"
>
		
	<table class="formBlock">
	
	    <aui:input
	        name="assessmentId"
	        id="assessmentId"
	        value="<%=assessmentId %>"
	        type="hidden"
	    />
	    
	    <aui:input
	        name="userId"
	        id="userId"
	        value="<%=user.getUserId() %>"
	        type="hidden"
	    />
	
	
	<tr>
	<td>
		<label class="popuplbl">Are you sure to Delete this Assessment?</label>
	</td>
	
	
	</tr>
	<tr ><td></td>
	<td style="text-align:right;" >
		<aui:button type="Submit" value="Delete Assessment" />
		<aui:button name="cancelButton" type="button" value="Cancel" onclick="javascript:top.document.getElementById('closethick').click();"/>
	</td>
	</tr>
	</table>
</aui:form>