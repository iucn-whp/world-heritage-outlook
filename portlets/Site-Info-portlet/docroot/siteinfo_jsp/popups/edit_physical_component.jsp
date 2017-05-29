<%@page import="com.iucn.whp.dbservice.model.whp_sites_component"%>
<%@include file="/siteinfo_jsp/init.jsp" %>

<%

whp_sites_component whp_sites_component_obj= new whp_sites_componentClp();
String currentSiteId="";
try{
	String selectedPkey=request.getParameter("keyVal");
	currentSiteId = request.getParameter("siteIdVal");
	System.out.println("->"+ selectedPkey);
	
	if(selectedPkey!=null && !selectedPkey.equalsIgnoreCase("")){
		
		whp_sites_component_obj=whp_sites_componentLocalServiceUtil.getwhp_sites_component(Long.parseLong(selectedPkey));
	}
	else{
		whp_sites_component_obj.setSite_id(Long.parseLong(currentSiteId));
		
	}
	
}
catch(Exception ex){
	out.println("Ex------------"+ex.getMessage());
}
%>
<portlet:defineObjects /> 
 <liferay-ui:success key="success" message="Inscription Criteria saved successfully!" /> 
    <portlet:actionURL name="addPhysicalComponent" var="addPhysicalComponent" />
    
<c:set var="site_id" value="<%=currentSiteId %>"/>
<c:set var="UpdateUrl" value="<%=addPhysicalComponent %>"/>
<c:set var="RefreshUrl" value="/siteinfo_jsp/innerJSP/physical_component.jsp"/>
<aui:form 
	id="physicalComponentForm" 
	name="physicalComponentForm" 	
	action=""
	method="post"> 
	<table class="formBlock">
	
    <aui:input
        name="siteID"
        id="siteID"
        value="<%= whp_sites_component_obj.getSite_id() %>"
        type="hidden"
    />
	
	<aui:input
        name="siteComponentID"
        id="siteComponentID"
        value="<%= whp_sites_component_obj.getWhp_sites_component_id() %>"
        type="hidden"
    />
	
	<tr>
		<td>
		<label class="popuplbl">Component</label>
		</td>
		<td>
		<aui:input
	        label=""
	        name="phyComponent"
	        id="phyComponent"
	        value="<%= whp_sites_component_obj.getComponent() %>"
	        type="text" 
	        style="width:355px;">
		<aui:validator name="required" />
	</aui:input>
		</td>
	</tr>
	<tr>
		<td colspan="2" style="text-align:right;" >
			<aui:button name="" type="button" value="Submit" onclick="javascript:validatedComponent();"/>
			<aui:button name="" type="button" value="Cancel" onclick="javascript:top.document.getElementById('closethick').click();" />
		</td>
	</tr>
</table>
</aui:form>
<script>
function validatedComponent(){
	var isValid = true;
	var phyComponent = $('#<portlet:namespace/>phyComponent').val();
	
	if(phyComponent==""){
		alert("Component is empty");
		isValid = false;
	}

	if(isValid){
		submitPopupForm('${site_id }','${RefreshUrl }','physicalComponentDiv','physicalComponentForm','${UpdateUrl }');
	}
}

</script>