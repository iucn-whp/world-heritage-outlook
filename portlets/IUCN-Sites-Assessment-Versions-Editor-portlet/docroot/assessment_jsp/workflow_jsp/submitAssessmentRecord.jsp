<%@ include file="/init.jsp" %>

<%

String actionMethod="";
String message="";
String assessmentId="";
String versionId="";
String currUserId="";
       try{
    	   actionMethod=request.getParameter("actionPage");
    	   message = request.getParameter("msgVal");
    	    assessmentId=request.getParameter("assessmentId");
    	    versionId=request.getParameter("versionId");
    	    currUserId = request.getParameter("userId");
       }
       catch(Exception ex){
           out.println("Ex------------"+ex.getMessage());
       }
%>
 <portlet:defineObjects /> 
 <liferay-ui:success key="success" message="Record updated successfully!" /> 
  
    <portlet:actionURL name="<%=actionMethod %>" var="submitRecord"> 
    <portlet:param name="assessmentId" value="<%= assessmentId %>" />
         <portlet:param name="versionId" value="<%= versionId %>" />
         <portlet:param name="userId" value="<%=currUserId %>" />
    </portlet:actionURL>
    
    
  
<aui:form 
	id="ConfirmForm" 
	name="ConfirmForm" 
	action = "<%=submitRecord%>"
	method="post"> 
<table class="formBlock">
<%-- <aui:input
	        name="selectedPkey"
	        id="selectedPkey"
	        value="<%= selectedPkey %>"
	        type="hidden"
	    />
	    <aui:input
	        name="assessmentVersionID"
	        id="assessmentVersionID"
	        value="<%= assessmentVersionId %>"
	        type="hidden"
	    />
	    <aui:input
	        name="tableName"
	        id="tableName"
	        value="<%= tableName %>"
	        type="hidden"
	    /> --%>
	<tr align="center">
	<td><p><%=message  %></p></td>
	</tr>
	<tr >
	<td style="text-align:center;">
	
		<aui:button name="" type="submit" value="&nbsp;Yes&nbsp;" />
		<aui:button name="" type="button" value="&nbsp;&nbsp;No&nbsp;&nbsp;" onclick="javascript:top.document.getElementById('closethick').click();"/>
	
	</td>
	
	</tr>
</table>
</aui:form>