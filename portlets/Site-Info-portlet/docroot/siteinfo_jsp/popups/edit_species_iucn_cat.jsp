<%@page import="java.util.ArrayList"%>
<%@page import="com.iucn.whp.dbservice.service.persistence.iucn_pa_lkp_categoryPersistence"%>
<%@page import="com.iucn.whp.dto.WhpSiteIUCNPACategories"%>
<%@ include file="/siteinfo_jsp/init.jsp" %>
<%

	List<whp_sites_iucn_pa_category> lstsiteIucnPaCategories = null;
	List<iucn_pa_lkp_category> lstIucnPaCategory=null;
	List<Integer> lstCategories = new ArrayList<Integer>();
	String currentSiteId="";
	try{
	   	currentSiteId = request.getParameter("siteIdVal");
	    lstIucnPaCategory=iucn_pa_lkp_categoryLocalServiceUtil.getAllIucnPaCategory();
	    lstsiteIucnPaCategories = whp_sites_iucn_pa_categoryLocalServiceUtil.getWhpSiteIUCNPACategoryBySiteId(Long.parseLong(currentSiteId));
	    for(whp_sites_iucn_pa_category pa_cat:lstsiteIucnPaCategories){
	    	lstCategories.add(pa_cat.getIucn_pa_category_id());
	    }
	    
	}
	catch(Exception ex){
	    out.println("Ex------------"+ex.getMessage());
	}
%>
<portlet:defineObjects /> 
 <liferay-ui:success key="success" message="IUCN PA Category saved successfully!" /> 
  
<portlet:actionURL name="AddSiteIUCNPACategory" var="editIUCNPACategory"/>
	

<c:set var="site_id" value="<%=currentSiteId %>"/>
<c:set var="UpdateUrl" value="<%=editIUCNPACategory %>"/>
<c:set var="RefreshUrl" value="/siteinfo_jsp/innerJSP/species_iucn_pacategory.jsp"/>

<aui:script>
function validateCategory(){
	
	var isValid = true;
	var category = $('#<portlet:namespace/>IUCNPACategory').val();
	
	if(category==0){
		alert("Please select any category");
		isValid= false;
	}
	
	if(isValid)
		submitPopupForm('${site_id }','${RefreshUrl}','speciesPaCategoryDiv','paCategoryForm','${UpdateUrl }');
		}
</aui:script>


<aui:form 
	name="paCategoryForm" 
	id="paCategoryForm" 
	action=""
	method="post">
	<table class="formBlock"> 
	
	<aui:input
        name="siteID"
        id="siteID"
        value="<%= currentSiteId %>"
        type="hidden"
	    />
	<tr>
	<td>
	<label class="popuplbl"> IUCN PA Category</label>
	</td>
	</tr>
	<tr>
	<td>
		<select  multiple size="6" name="IUCNPACategory" id="IUCNPACategory" style="width:430px;">
			<%
			for(int i=0;i<lstIucnPaCategory.size();i++){
				iucn_pa_lkp_category temp_category_lkp= lstIucnPaCategory.get(i);
				if(lstCategories.contains(temp_category_lkp.getIucn_pa_category_id())) {
					
			%>
		
			<option  selected="true" value="<%=temp_category_lkp.getIucn_pa_category_id() %>">
				<%=temp_category_lkp.getCategory() %>
			</option>
			
			<%}else { %>
			
			<option  value="<%=temp_category_lkp.getIucn_pa_category_id() %>">
				<%=temp_category_lkp.getCategory() %>
			</option>
			<%}} %>
		</select>
		</td>
	</tr>
		
	<tr>
	<td colspan="2" style="text-align:right;" >
		<aui:button name="saveButton" type="button" value="Submit" onclick="javascript:validateCategory();"/>
		<aui:button name="cancelButton" type="button" value="Cancel" onclick="javascript:top.document.getElementById('closethick').click();"/>
	</td>
		</tr>
		</table>						
</aui:form>