<%@ include file="/siteinfo_jsp/init.jsp" %>
<%
    whp_sites sitePopulationId= new whp_sitesClp();
String currentSiteId = "";
    try{
        String selectedPkey=request.getParameter("keyVal");
        currentSiteId = request.getParameter("siteIdVal");
        if(selectedPkey!=null && !selectedPkey.isEmpty()){
        	sitePopulationId = whp_sitesLocalServiceUtil.getwhp_sites(Long.parseLong(selectedPkey));
        }
        else {
        	sitePopulationId.setSite_id(Long.parseLong(currentSiteId));
        	sitePopulationId.setPopulation(0);
        }
    }
    catch(Exception ex){
        out.println("Ex------------"+ex.getMessage());
    }
%>
<portlet:defineObjects /> 
 <liferay-ui:success key="success" message="Population added successfully!" /> 
  
<portlet:actionURL name="addmgmtPopulation" var="addmgmtPopulation"/>
	
<c:set var="site_id" value="<%=currentSiteId %>"/>
<c:set var="UpdateUrl" value="<%=addmgmtPopulation %>"/>
<c:set var="RefreshUrl" value="/siteinfo_jsp/innerJSP/mgmt_population.jsp"/>

<aui:form 
	name="populationForm" 
	action="" 
	method="post">
	 <table class="formBlock"> 
	<aui:input
        name="siteID"
        id="siteID"
        value="<%= sitePopulationId.getSite_id() %>"
        type="hidden"
	    />
	    <tr>
	<td>
	<label class="popuplbl"> Count</label>
	</td>
	<td>
	 <aui:input
	 	label="" 
	 	style="width:390px;"
	 	name="populationCount" 
		value="<%=sitePopulationId.getPopulation() %>" 
		id="populationCount">
		<aui:validator name="required" />
		<aui:validator name="digits" />
		
   		</aui:input>
   		</td>
	</tr>
		
	<tr>
	<td colspan="2" style="text-align:right;" >
		<aui:button name="saveButton" type="button" value="Submit" onclick="javascript:validatePopulation();"/>
		<aui:button name="cancelButton" type="button" value="Cancel" onclick="javascript:top.document.getElementById('closethick').click();"/>
	</td>
		</tr>
		</table>				
</aui:form>

<script>
function validatePopulation(){
	var isValid = true;
	var count = $('#<portlet:namespace/>populationCount').val();
	
	if(count=="" ||!count.match(/^[0-9]*$/) || parseInt(count)<0){
		alert("Please enter valid count.");
		isValid = false;
	}

	if(isValid){
		submitPopupForm('${site_id }','${RefreshUrl}','mgmtpopulationDiv','populationForm','${UpdateUrl }');
	}
}

</script>	