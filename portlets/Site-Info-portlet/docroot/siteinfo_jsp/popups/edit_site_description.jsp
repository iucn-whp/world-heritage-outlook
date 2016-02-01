<%@page import="java.util.Date"%>
<%@ include file="/siteinfo_jsp/init.jsp" %>

<%
String currentSiteId = "";
whp_sites objsites = new whp_sitesClp();
try{
    currentSiteId = request.getParameter("siteIdVal");
    long curr_siteId = Long.parseLong(currentSiteId);
    objsites = whp_sitesLocalServiceUtil.getSiteBySiteId(curr_siteId);
   
    
}
catch(Exception e )
{
	e.printStackTrace();
}
%>
<portlet:defineObjects /> 
 <liferay-ui:success key="success" message="Indiginous Communities added successfully!" /> 
 
     <portlet:actionURL name="addsiteDesc" var="addsiteDesc"/>
 
 
<c:set var="site_id" value="<%=currentSiteId %>"/>
<c:set var="UpdateUrl" value="<%=addsiteDesc %>"/>
<c:set var="RefreshUrl" value="/siteinfo_jsp/innerJSP/site_description.jsp"/> 

<aui:form 
	name="sitedescForm" 
	
	action="" 
	method="post">
	  <table class="formBlock"> 
	
	
	<aui:input
        name="siteID"
        id="siteID"
        value="<%=objsites.getSite_id() %>"
        type="hidden"
	    />
	     <tr>
	<td>
	<label class="popuplbl">Description</label>
	</td>
	<td spellcheck="true">
	<aui:input 
		label="" 
		style="width:355px; height:90px;"
		name="textDescription" 
		value="<%=objsites.getDescription() %>" 
		id="textDescription"
		type="textarea">
		<aui:validator name="required" />
		</aui:input>
	</td>
	</tr>
		
	<tr>
	<td colspan="2" style="text-align:right;" >
			<aui:button name="saveButton" type="button" value="Submit" onclick="javascript:validateIndiComm();"/>
			<aui:button name="cancelButton" type="button" value="Cancel" onclick="javascript:top.document.getElementById('closethick').click();"/>
		</td>
		</tr>
		</table>	
</aui:form>

<script>
function validateIndiComm(){
	var isValid = true;
	var description = $('#<portlet:namespace/>textDescription').val();
	
	if(description==""){
		alert("Description should not be empty.");
		isValid = false;
	}

	if(isValid){
		submitPopupForm('${site_id }','${RefreshUrl}','SitedescDiv','sitedescForm','${UpdateUrl }');
	}
}

</script>		



