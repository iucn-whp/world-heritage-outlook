<%@ include file="/init.jsp" %>

<%
String tableName="";
String selectedPkey="";
String assessmentVersionId="";
String refURL="";
String currentDiv="";
       try{
           selectedPkey=request.getParameter("keyVal");
           assessmentVersionId = request.getParameter("versionIdVal");
           tableName = request.getParameter("tableName");
           refURL = request.getParameter("refreshPage");
           currentDiv = request.getParameter("divVal");
           
           
       }
       catch(Exception ex){
           out.println("Ex------------"+ex.getMessage());
       }
%>
 <portlet:defineObjects /> 
 <liferay-ui:success key="success" message="Record deleted successfully!" /> 
  
    <portlet:actionURL name="deleteCurrentRecordFromTable" var="deleteRecord"/>
    
<c:set var="tableName" value="<%= tableName %>"/>
<c:set var="versionId" value="<%=assessmentVersionId %>"/>
<c:set var="UpdateUrl" value="<%=deleteRecord %>"/>
<c:set var="RefreshUrl" value="<%=refURL %>"/>
<c:set var="currentDiv" value="<%=currentDiv %>"/>
<%-- <h5>Are you sure to delete <c:out value="${tableName}"/></h5>   --%>
  
<aui:form
	id="deleteConfirmForm"
	cssClass="popupForm"
	name="deleteConfirmForm" 
	action = "javascript:submitPopupForm('${versionId }','${RefreshUrl}','${currentDiv}','deleteConfirmForm','${UpdateUrl}','0');"
	method="post"> 
<table class="formBlock">
<aui:input
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
	    />
	<tr align="center">
	<td><p>Are you sure to delete the selected <c:out value="${tableName}"/></p></td>
	</tr>
	<tr >
	<td style="text-align:center;">
	
		<aui:button name="" type="submit" value="&nbsp;Yes&nbsp;" />
		<aui:button name="" type="button" value="&nbsp;&nbsp;No&nbsp;&nbsp;" onclick="javascript:top.document.getElementById('closethick').click();"/>
	
	</td>
	
	</tr>
</table>
</aui:form>
