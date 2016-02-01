<%@ include file="/siteinfo_jsp/init.jsp" %>
<%
whp_sites _whpSite= new whp_sitesClp();
String currentSiteId="";
    try{
        String selectedPkey=request.getParameter("keyVal");
        currentSiteId = request.getParameter("siteIdVal");
        //lstContactCategory = whp_sites_contactsLocalServiceUtil.getAllContactCategories();
        System.out.println("#####"+ currentSiteId);
        if(selectedPkey!=null && !selectedPkey.isEmpty()){
        	_whpSite = whp_sitesLocalServiceUtil.getwhp_sites(Long.parseLong(selectedPkey));
        	System.out.println("^^^^^Area "+_whpSite.getArea() );
        }
        _whpSite.setSite_id(Long.parseLong(currentSiteId));
    }
    
    catch(Exception ex){
        out.println("Ex------------"+ex.getMessage());
    }
%>
<portlet:defineObjects /> 
 <liferay-ui:success key="success" message="Physical Information saved successfully!" /> 
    <portlet:actionURL name="addPhysicalInformation" var="addPhysicalInformation" />
    
<c:set var="site_id" value="<%=currentSiteId %>"/>
<c:set var="UpdateUrl" value="<%=addPhysicalInformation %>"/>
<c:set var="RefreshUrl" value="/siteinfo_jsp/innerJSP/physical_info.jsp"/>

<aui:form 	
	action=""
	method="post" 
	id="physicalInfoForm" 
	name="physicalInfoForm" >
			        
<table class="formBlock">
	<aui:input
        name="siteID"
        id="siteID"
        value="<%= _whpSite.getSite_id()%>"
        type="hidden"
    />
	
	<tr>
	<td><label class="popuplbl">Area (Ha) :</label></td>
		<td>	
			<aui:input 
				label="" 
				style="width:340px;"
				type="text" 
				name="area" 
				value="<%=_whpSite.getArea() %>"
				id="area">
			</aui:input>
		</td>
	</tr>
	<tr>
		<td><label class="popuplbl">Buffer Zone Area (Ha) :</label></td>
		<td>	
			<aui:input 
				label="" 
				style="width:340px;"
				type="text" 
				name="bzArea" 
				value="<%=_whpSite.getBuffer_zone_area() %>"
				id="bzArea">
			</aui:input>
		</td>
	</tr>
	<tr>
		<td><label class="popuplbl">Transboundry:</label></td>
		<td>
		<label class="popuplbl"><%=(_whpSite.getTransboundary()==true)? "Yes": "No" %></label>
		<c:set var="Transboundry" value="<%= _whpSite.getTransboundary()%>"/>		
			<aui:input name="transboundry" id="transboundry" style="width:200px;"
			value = "<%= _whpSite.getTransboundary()%>"
			type = "hidden"/>
				
		</td>
	</tr>
	<tr>
		<td><label class="popuplbl">Buffer Zone :</label></td>
		<td>	
		<c:set var="bufferZone" value="<%= _whpSite.getBuffer_zone()%>"/>		
			<aui:select label="" name="bufferZone" id="bufferZone" style="width:200px;">
				<aui:option selected="${bufferZone== true}"
					value="1">
					<c:out value="Yes"/>
				</aui:option>
				<aui:option selected="${bufferZone== false}"
					value="2">
					<c:out value="No"/>
				</aui:option>
		</aui:select></td>
	</tr>

	<tr>
		<td><label class="popuplbl">Serial :</label></td>
		<td>	
		<c:set var="serialVal" value="<%= _whpSite.getSerial()%>"/>		
			<aui:select label="" name="serial" id="serial" style="width:200px;">
				<aui:option selected="${serialVal== true}"
					value="1">
					<c:out value="Yes"/>
				</aui:option>
				<aui:option selected="${serialVal== false}"
					value="2">
					<c:out value="No"/>
				</aui:option>
		</aui:select></td>
	</tr>

	<tr>
		<td colspan="2" style="text-align:right;" >
			<aui:button name="saveButton" type="button" value="Submit" onclick="javascript:validatePhysicalForm();" />
		
			<aui:button name="cancelButton" type="button" value="Cancel" onclick="javascript:top.document.getElementById('closethick').click();"/>
		</td>
	</tr>
	
</table>
</aui:form>

<script>

function validatePhysicalForm(){
	
	var isValid = true;
	var area = $('#<portlet:namespace/>area').val();
	var bzArea = $('#<portlet:namespace/>bzArea').val();
	var bufferZone = $('#<portlet:namespace/>bufferZone').val();
	
	if( area=="" || parseFloat(area)<=0.0 ){
		alert('Please enter valid Area value');
		isValid = false;
	}
	
	else if(bufferZone=="1" && (bzArea=="" ||parseFloat(bzArea)<=0.0)){
		
		alert('Please enter valid buffer zone area');
		isValid = false;
		
	}
	
	
	if(isValid){
		submitPopupForm('${site_id }','${RefreshUrl }','physicalInfoDiv','physicalInfoForm','${UpdateUrl }');
	}
	
	}
</script>