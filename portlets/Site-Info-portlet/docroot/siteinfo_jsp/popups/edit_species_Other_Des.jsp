<%@page import="com.iucn.whp.dto.WhpSiteOtherDesignations"%>
<%@page import="java.util.ArrayList"%>
<%@ include file="/siteinfo_jsp/init.jsp" %>
<%
    whp_sites_other_designations siteOtherDesignationId= new whp_sites_other_designationsClp();
	other_designation_lkp otherDesignationDetail = new other_designation_lkpClp();
	List<other_designation_lkp> lstOtherDesignation=null;
	long OtherDesignationId= 0;
	String currentSiteId = "";
	try{
        String selectedPkey=request.getParameter("keyVal");
        currentSiteId = request.getParameter("siteIdVal");
        lstOtherDesignation=other_designation_lkpLocalServiceUtil.getAllOtherDesignation();        
        if(selectedPkey!=null && !selectedPkey.isEmpty()){
        	siteOtherDesignationId = whp_sites_other_designationsLocalServiceUtil.getwhp_sites_other_designations(Long.parseLong(selectedPkey));
        	otherDesignationDetail = other_designation_lkpLocalServiceUtil.getother_designation_lkp(siteOtherDesignationId.getOther_designation_id());
        	OtherDesignationId=otherDesignationDetail.getOther_designations_id();
        }
        else {
        	siteOtherDesignationId.setSite_id(Long.parseLong(currentSiteId));
        	siteOtherDesignationId.setWhp_sites_other_designations_id(0);
        	siteOtherDesignationId.setOther_designation_id(0);
        	otherDesignationDetail.setDesignation("");
        }
    }
    catch(Exception ex){
        out.println("Ex------------"+ex.getMessage());
    }
%>
<portlet:defineObjects /> 
 <liferay-ui:success key="success" message="Other Designations updated successfully!" /> 
  
<portlet:actionURL name="AddSiteSpeciesOtherDesignation" var="editSpeciesOtherDesignation"/>

<c:set var="site_id" value="<%=currentSiteId %>"/>
<c:set var="UpdateUrl" value="<%=editSpeciesOtherDesignation %>"/>
<c:set var="RefreshUrl" value="/siteinfo_jsp/innerJSP/species_other_designation.jsp"/>

<aui:form 
	name="otherDesignationForm" 
	id="otherDesignationForm"
	action="" 
	method="post">
		<table class="formBlock"> 
	
	<aui:input
        name="siteID"
        id="siteID"
        value="<%= siteOtherDesignationId.getSite_id() %>"
        type="hidden"
	/>
    <aui:input
        name="siteOtherDesignationId"
        id="siteOtherDesignationId"
        value="<%= siteOtherDesignationId.getWhp_sites_other_designations_id() %>"
        type="hidden"
    />
	 <%-- <aui:input
	 	label="Other Designations" 
		name="OtherDesignations" 
		value="<%=otherDesignationDetail.getDesignation() %>" 
		id="OtherDesignations"/> --%>
	<tr>
	<td>
	<label class="popuplbl"> Other Designations</label>
	</td>
	<td>
	<aui:select 
	label="" 
	id="OtherDesignations" 
	style="width:350px;"
	name="OtherDesignations">
			<option value="0">Select</option>
			<c:set var="OtherDesignationId" value="<%= OtherDesignationId %>"/>
			<c:forEach items="<%=lstOtherDesignation %>" var="otherDesignation" varStatus="status">
				<aui:option selected="${otherDesignation.getOther_designations_id()== OtherDesignationId}"
					value="${otherDesignation.getOther_designations_id()}">
					<c:out value="${otherDesignation.getDesignation()}"/>
				</aui:option>
			</c:forEach>
							
	</aui:select>
		</td>
	</tr>
		
	<tr>
	<td colspan="2" style="text-align:right;" >
		<aui:button name="saveButton" type="button" value="Submit" onclick="javascript:validateDesignation();"/>
		<aui:button name="cancelButton" type="button" value="Cancel" onclick="javascript:top.document.getElementById('closethick').click();"/>
	</td>
		</tr>
		</table>					
</aui:form>

<script>
function validateDesignation(){
	
	var isValid = true;
	var OtherDesignations = $('#<portlet:namespace/>OtherDesignations').val();
	
	if(OtherDesignations==0){
		alert("Please select any Designations");
		isValid= false;
	}else {
		<%
		
		List<whp_sites_other_designations> lstotherDesignations=whp_sites_other_designationsLocalServiceUtil.getWhpSiteOtherDesignationsBySiteId(Long.parseLong(currentSiteId));
		for(int j=0;j<lstotherDesignations.size();j++){   	
			
	    	try{
	    		
	    		
	    		
	    		int other_designation_id = lstotherDesignations.get(j).getOther_designation_id();        		
	    	%>
	    	var other_designation = <%= other_designation_id %>;
	    	if(OtherDesignations==other_designation){
	    		alert("Selected designation already added");
	    		isValid= false;
	    	}
	    	<%	        		
	    		    		
	    		
	    	}catch(Exception ex){
	    		System.out.println("EXCEPTION:"+ ex.getStackTrace()+"------"+ex.getStackTrace());
	    	}
	    	
	    	
	    	
		}
		%>
	}
	if(isValid)
		submitPopupForm('${site_id }','${RefreshUrl}','speciesOtherDesigDiv','otherDesignationForm','${UpdateUrl }');
}
</script>