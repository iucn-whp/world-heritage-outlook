<%@page import="java.util.ArrayList"%>
<%@ include file="/siteinfo_jsp/init.jsp" %>
<%
    List<flagship_species_lkp> lstFlagshipSpecies = null;
	whp_sites_flagship_species siteflagShipId = new whp_sites_flagship_speciesClp();
	String currentSiteId ="";
    try{
        String selectedPkey=request.getParameter("keyVal");
        currentSiteId = request.getParameter("siteIdVal");
        lstFlagshipSpecies = flagship_species_lkpLocalServiceUtil.getAllFlagshipSpecies();
        if(selectedPkey!=null && !selectedPkey.isEmpty()){
        	siteflagShipId = whp_sites_flagship_speciesLocalServiceUtil.getwhp_sites_flagship_species(Long.parseLong(selectedPkey));
        }
        else {
        	siteflagShipId.setFlagship_species_id(0);
        	siteflagShipId.setSite_id(Long.parseLong(currentSiteId));
        	siteflagShipId.setWhp_sites_flagship_species_id(0);
        

        }
    }
    catch(Exception ex){
        out.println("Ex------------"+ex.getMessage());
    }
%>
<portlet:defineObjects /> 
 <liferay-ui:success key="success" message="species added successfully!" /> 
  
<portlet:actionURL name="addSiteFlagshipSpecies" var="FlagshipSpecies"/>
	

<c:set var="site_id" value="<%=currentSiteId %>"/>
<c:set var="UpdateUrl" value="<%=FlagshipSpecies %>"/>
<c:set var="RefreshUrl" value="/siteinfo_jsp/innerJSP/species_flagship.jsp"/>

<aui:form 
	id="flagshipForm" 
	name="flagshipForm" 
	action=""
	method="post"> 
		 <table class="formBlock"> 
	
	<aui:input
        name="flagshipSpeciesId"
        id="flagshipSpeciesId"
        value="<%= siteflagShipId.getWhp_sites_flagship_species_id() %>"
        type="hidden"
    />
    <aui:input
        name="siteID"
        id="siteID"
        value="<%= siteflagShipId.getSite_id() %>"
        type="hidden"
    /> 
 <tr>
	<td>
	<label class="popuplbl"> Redlist Species Id:</label>
	</td>
	<td>
	
	<aui:input
        name="redlistSpeciesID"
        id="redlistSpeciesID" label=""
        value="<%= siteflagShipId.getFlagship_species_id() %>"
        style="width:375px;"
		type="text" 
    /> 
	</td>
	</tr>
		
	<tr>
	<td colspan="2" style="text-align:right;" >
		<aui:button name="" type="button" value="Submit" onclick="javascript:validateFlagship()"/>
		<aui:button name="" type="button" value="Cancel" onclick="javascript:top.document.getElementById('closethick').click();"/>
	</td>
		</tr>
		</table>						
</aui:form>
<script>
function validateFlagship(){
	
	var isValid = true;
	var flag_Species_id = $('#<portlet:namespace/>redlistSpeciesID').val();
	
	if(!flag_Species_id.match(/^[0-9]*$/) || flag_Species_id=="" ||flag_Species_id==0){
		alert("Please enter valid species");
		isValid= false;
	}else {
		<%
		List<whp_sites_flagship_species> lstflagship_species=whp_sitesLocalServiceUtil.getWhpSiteFlagshipSpeciesBySiteId(Long.parseLong(currentSiteId));
		for(int j=0;j<lstflagship_species.size();j++){   	
			
	    	try{
	    		int species_id = lstflagship_species.get(j).getFlagship_species_id();        		
	    	%>
	    	var flagSpecies = <%= species_id %>;
	    	if(flagSpecies==flag_Species_id){
	    		alert("Flagship Species already added");
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
		submitPopupForm('${site_id }','${RefreshUrl}','speciesFlagshipDiv','flagshipForm','${UpdateUrl }');
}
</script>		