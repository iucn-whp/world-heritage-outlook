<%@include file="/siteinfo_jsp/init.jsp" %>

<%
List<whp_sites_indigenous_communities> lstIndigenousCommunities=null;
try{
	
	long siteid=Long.parseLong(request.getAttribute("siteId").toString());
	lstIndigenousCommunities=whp_sitesLocalServiceUtil.getwhpSitesIndigenousCommunitiesBySiteId1(siteid);
	
}catch(Exception ex){
	ex.printStackTrace();
	
}

%>

<c:set var="UpdateUrl" value="/siteinfo_jsp/popups/edit_mgmt_indiginous_communities.jsp"/>
<c:set var="RefreshUrl" value="/siteinfo_jsp/innerJSP/mgmt_indeginious_communities.jsp"/>
<c:set var="currentDiv" value="mgmtIndeCommDiv"/>

	<div class="tblBlockHeader">
		<h2 class="header02">Indigenous Communities</h2>
		<div class="floatRight01">
		<a href="#" onclick="javascript:dynamicPopup('${UpdateUrl}','','Indigenous Communities',event);return false;" class="addBtn hideAdminAction" >+Add</a>
		</div>
	</div>
<table class="tabData" cellpadding="0" cellspacing="0">
<tbody>

<tr>
<th>Description</th>
<th class="hideAdminAction">Edit</th>
</tr>

<c:forEach items="<%= lstIndigenousCommunities%>" var="indigenousCommunities" varStatus="status">		
<tr>
<td>
		<c:out value="${indigenousCommunities.getDescription()}" />
</td>
<td class="editIcons hideAdminAction">
<div class="singleIconContainer">
<a href="#" onclick="javascript:dynamicPopup('${UpdateUrl}','${indigenousCommunities.getWhp_sites_indigenous_communities_id()}','Indiginous Communities',event);return false" class="edit">edit</a>
<a href="javascript:deletePopup('${RefreshUrl}','${currentDiv}','${indigenousCommunities.getWhp_sites_indigenous_communities_id()}','Indiginous Communities');" class="delete">delete</a>
</div>
</td>
</tr>
</c:forEach>
</tbody>
</table>
