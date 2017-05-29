<%@ include file="/siteinfo_jsp/init.jsp" %>
<%
String currentSiteId="";
whp_sites_inscription_criteria inscriptionCriteriaId= new whp_sites_inscription_criteriaClp();
List<inscription_criteria_lkp> lstInscriptionCriteria=null;
long inscriptionId= 0;
try{
	String selectedPkey=request.getParameter("keyVal");
	currentSiteId = request.getParameter("siteIdVal");
	lstInscriptionCriteria= inscription_criteria_lkpLocalServiceUtil.getAllInscriptionCriteria();
	if(selectedPkey!=null && !selectedPkey.isEmpty()){
		inscriptionCriteriaId = whp_sites_inscription_criteriaLocalServiceUtil.getwhp_sites_inscription_criteria(Long.parseLong(selectedPkey));
		inscriptionId = inscriptionCriteriaId.getCriteria_id();
	}
	else {
		
		inscriptionCriteriaId.setCriteria_id(0);
		inscriptionCriteriaId.setWhp_sites_inscription_criteria_id(0);
		inscriptionCriteriaId.setSite_id(Long.parseLong(currentSiteId));
	}
}
catch(Exception ex){
	/* out.println("Ex------------"+ex.getMessage()); */
}
//whp_sites_inscription_date InscDate = (whp_sites_inscription_date) request.getAttribute("editInscriptionHistoryJSP");
%>
<portlet:defineObjects /> 
 <liferay-ui:success key="success" message="Inscription Criteria saved successfully!" /> 
    <portlet:actionURL name="addSiteInscriptionCriteria" var="addSiteIC" />
    
<c:set var="site_id" value="<%=currentSiteId %>"/>
<c:set var="UpdateUrl" value="<%=addSiteIC %>"/>
<c:set var="RefreshUrl" value="/siteinfo_jsp/innerJSP/official_inscription_criteria.jsp"/>
 
 <div class="popupForm">
<aui:form 
	id="criteriaForm" 
	name="criteriaForm" 
	action="" 
	method="post"> 
	<table class="formBlock">
	<aui:input
        name="inscriptionCriteriaId"
        id="inscriptionCriteriaId"
        value="<%= inscriptionCriteriaId.getWhp_sites_inscription_criteria_id() %>"
        type="hidden"
    />
    <aui:input
        name="siteID"
        id="siteID"
        value="<%= inscriptionCriteriaId.getSite_id() %>"
        type="hidden"
    />
	<tr>
	<td>
	<label class="popuplbl">Criteria</label>
	</td>
	<td >
	<aui:select 
	label="" 
	id="criteriaID" 
	name="criteriaID"
	style="width:370px;">
			<option value="0">Select</option>
			<c:set var="inscriteriaId" value="<%= inscriptionId %>"/>
			<c:forEach items="<%=lstInscriptionCriteria %>" var="inscriptionCriteria" varStatus="status">
				<aui:option selected="${inscriptionCriteria.getCriteria_id()== inscriteriaId}"
					value="${inscriptionCriteria.getCriteria_id()}">
					<c:out value="${inscriptionCriteria.getCriteria()}"/>
				</aui:option>
			</c:forEach>
							
	</aui:select>
	</td>
	</tr>
	<tr>
	<td colspan="2" style="text-align:right;" >
		<aui:button name="" type="button" value="Submit" onclick="javascript:validateCriteria();" />
		<aui:button name="" type="button" value="Cancel" onclick="javascript:top.document.getElementById('closethick').click();" />
	</td>
	</tr>
</table>
</aui:form>
</div>
<script>
function validateCriteria(){
	
	var isValid = true;
	var criteria = $('#<portlet:namespace/>criteriaID').val();
	
	if(criteria==0){
		alert("Please select any criteria");
		isValid= false;
	}else {
		<%
		List<whp_sites_inscription_criteria> lstwhpInscriptionCiteria=whp_sitesLocalServiceUtil.getWhpSitesInscriptionCriteriaBySiteId(Long.parseLong(currentSiteId));
		for(int j=0;j<lstwhpInscriptionCiteria.size();j++){   	
			
	    	try{
	    		
	    		
	    		
	    		int criteria_Id = lstwhpInscriptionCiteria.get(j).getCriteria_id();        		
	    	%>
	    	var criteria_Id = <%= criteria_Id %>;
	    	if(criteria_Id==criteria){
	    		alert("Selected criteria already added");
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
		submitPopupForm('${site_id }','${RefreshUrl }','inscriptionCriteriaDiv','criteriaForm','${UpdateUrl }');
}
</script>