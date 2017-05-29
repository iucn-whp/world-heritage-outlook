<!-- created by Sonil for adding country in Basic Information-->

<%@page import="java.util.ArrayList"%>
<%@ include file="/siteinfo_jsp/init.jsp" %>

<%
    whp_sites siteId= new whp_sitesClp();
	List<country_lkp> lstcountry_lkp = new ArrayList<country_lkp>();
	int countryId =0;
	country_lkp country_lkpObj = null;
    try{
        String selectedPkey=request.getParameter("keyVal");
        if(selectedPkey!=null && !selectedPkey.isEmpty()){
        	siteId = whp_sitesLocalServiceUtil.getwhp_sites(Long.parseLong(selectedPkey));
        }
        lstcountry_lkp = country_lkpLocalServiceUtil.getAllCountries();
    }
    
    catch(Exception ex){
        out.println("Ex------------"+ex.getMessage());
    }
%>

<portlet:defineObjects /> 
 <liferay-ui:success key="success" message="Contact saved successfully!" /> 
  
    <portlet:actionURL name="addSiteBasicCountryInfo" var="updateSiteBasicCountryInfo">
    </portlet:actionURL>


<div class="popupForm">
<aui:form 
	action="<%= updateSiteBasicCountryInfo %>" 
	method="post" 
	id="SiteBasicCountryInfo" 
	name="myForm" >
			        
<table style="border:none;">

	<tr>
		<td style="border:none;" align = "right">Country :</td>
		<td style="border:none;">
		<aui:select 
			label="" 
			name="country" 
			id="country">
		<option >select</option>
		<c:set var="siteCountryId" value="<%= country_lkpObj.getCountryid()%>"/>
			<c:forEach items="<%=lstcountry_lkp %>" var="siteCountry" varStatus="status">
				<aui:option value="${country_lkpObj.getCountryid()}">
					<c:out value="${country_lkpObj.getName()}"/>
				</aui:option>
		</c:forEach>
		</aui:select></td>
	</tr>
	

	<tr>
		<td style="border:none;" align="right">
			<aui:button name="saveButton" type="submit" value="Save"  /></td>
		<td style="border:none;">
			<aui:button name="cancelButton" type="button" value="Cancel" onclick="javascript:top.document.getElementById('closethick').click();"/></td>
	</tr>
	
</table>
</aui:form>
</div>
