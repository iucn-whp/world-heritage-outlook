<%@ include file="/siteinfo_jsp/init.jsp" %>

<%
String tableName="";
String selectedPkey="";
String currentSiteId="";
String refURL="";
String currentDiv="";
       try{
           selectedPkey=request.getParameter("keyVal");
           currentSiteId = request.getParameter("siteIdVal");
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
<c:set var="site_id" value="<%=currentSiteId %>"/>
<c:set var="UpdateUrl" value="<%=deleteRecord %>"/>
<c:set var="RefreshUrl" value="<%=refURL %>"/>
<c:set var="currentDiv" value="<%=currentDiv %>"/>
<%-- <h5>Are you sure to delete <c:out value="${tableName}"/></h5>   --%>
  
<aui:form 
	id="deleteConfirmForm" 
	name="deleteConfirmForm" 
	action = "javascript:submitPopupForm('${site_id }','${RefreshUrl}','${currentDiv}','deleteConfirmForm','${UpdateUrl}');"
	method="post"> 
<table class="formBlock">
<aui:input
	        name="selectedPkey"
	        id="sitebudgetId"
	        value="<%= selectedPkey %>"
	        type="hidden"
	    />
	    <aui:input
	        name="siteID"
	        id="siteID"
	        value="<%= currentSiteId %>"
	        type="hidden"
	    />
	    <aui:input
	        name="tableName"
	        id="tableName"
	        value="<%= tableName %>"
	        type="hidden"
	    />
	<tr align="center">
	<td><p>Are you sure to delete <c:out value="${tableName}"/></p></td>
	</tr>
	<tr >
	<td style="text-align:center;">
	
		<aui:button name="" type="submit" value="&nbsp;Yes&nbsp;" />
		<aui:button name="" type="button" value="&nbsp;&nbsp;No&nbsp;&nbsp;" onclick="javascript:top.document.getElementById('closethick').click();"/>
	
	</td>
	
	</tr>
</table>
</aui:form>