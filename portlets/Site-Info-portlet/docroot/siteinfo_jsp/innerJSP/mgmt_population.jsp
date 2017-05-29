<%@include file="/siteinfo_jsp/init.jsp" %>

<%
whp_sites objwhp_sites=null;
try{
	
	long siteid=Long.parseLong(request.getAttribute("siteId").toString());
	objwhp_sites=whp_sitesLocalServiceUtil.getwhp_sites(siteid);
	
}catch(Exception ex){
	ex.printStackTrace();
	
}

%>

<div class="tblBlockHeader">
<h2 class="header02">Population</h2>
</div>

<table class="tabData" cellpadding="0" cellspacing="0">
<tbody>
<tr>
<td class="tableHeading">Count</td>
<td><c:out value="<%=objwhp_sites.getPopulation() %>" /></td>
<td class="editIcons hideAdminAction">
<div class="singleIconContainer">
<c:set var="populationSiteId" value="<%= objwhp_sites.getSite_id()%>"/>
<a href="#" onclick="javascript:dynamicPopup('/siteinfo_jsp/popups/edit_mgmt_population.jsp','${populationSiteId}','Population',event);return false;" class="edit">edit</a>
</div>
</td>
</tr>
</tbody>
</table>
