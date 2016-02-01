<%@page import="java.util.Date"%>
<%@ include file="/siteinfo_jsp/init.jsp" %>
<%
    whp_sites_indigenous_communities siteIndiCommId= new whp_sites_indigenous_communitiesClp();
String currentSiteId = "";
    try{
        String selectedPkey=request.getParameter("keyVal");
        currentSiteId = request.getParameter("siteIdVal");
        if(selectedPkey!=null && !selectedPkey.isEmpty()){
        	siteIndiCommId = whp_sites_indigenous_communitiesLocalServiceUtil.getwhp_sites_indigenous_communities(Long.parseLong(selectedPkey));
        }
        else {
        	siteIndiCommId.setWhp_sites_indigenous_communities_id(0);
        	siteIndiCommId.setSite_id(Long.parseLong(currentSiteId));
        	siteIndiCommId.setDescription("");
        }
    }
    catch(Exception ex){
        out.println("Ex------------"+ex.getMessage());
    }
%>
<portlet:defineObjects /> 
 <liferay-ui:success key="success" message="Indiginous Communities added successfully!" /> 
 
    <portlet:actionURL name="addmgmtIndiComm" var="addmgmtIndiComm"/>
    
<c:set var="site_id" value="<%=currentSiteId %>"/>
<c:set var="UpdateUrl" value="<%=addmgmtIndiComm %>"/>
<c:set var="RefreshUrl" value="/siteinfo_jsp/innerJSP/mgmt_indeginious_communities.jsp"/>     
<aui:form 
	name="indiCommForm" 
	action="" 
	method="post">
	  <table class="formBlock"> 
	
	<aui:input
        name="siteIndiCommId"
        id="siteIndiCommId"
        value="<%= siteIndiCommId.getWhp_sites_indigenous_communities_id() %>"
        type="hidden"
	    />
	<aui:input
        name="siteID"
        id="siteID"
        value="<%= siteIndiCommId.getSite_id() %>"
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
		value="<%= siteIndiCommId.getDescription() %>" 
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
		submitPopupForm('${site_id }','${RefreshUrl}','mgmtIndeCommDiv','indiCommForm','${UpdateUrl }');
	}
}

</script>		



