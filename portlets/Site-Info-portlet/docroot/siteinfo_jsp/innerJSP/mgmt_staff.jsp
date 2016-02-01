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
		<h2 class="header02">Staff</h2>
		</div>
	

<table class="tabData" cellpadding="0" cellspacing="0">
<tbody>

<tr>
<td class="tableHeading">Update Date</td>
<td ><fmt:formatDate pattern="dd/MM/yyyy" value="<%=objwhp_sites.getStaff_update_date() %>" />
<td class="tableHeading">Count</td>
<td><c:out value="<%=objwhp_sites.getStaff() %>" /></td>
<td class="editIcons hideAdminAction">
<div class="singleIconContainer">
<c:set var="staffSiteId" value="<%= objwhp_sites.getSite_id()%>"/>
<a href="#" onclick="javascript:dynamicPopup('/siteinfo_jsp/popups/edit_mgmt_staff.jsp','${staffSiteId}','Staff',event);return false;" class="edit">edit</a>

</div>
</td>
</tr>
</tbody>
</table>

