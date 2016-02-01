<%@include file="/siteinfo_jsp/init_ie.jsp" %>

<%
List<whp_sites_component> lstComponent=null;
try{
	
	long siteid=Long.parseLong(request.getAttribute("siteId").toString());	
	System.out.println("1>>><<"+siteid );
	lstComponent=whp_sitesLocalServiceUtil.getwhpSitesComponentBySiteId(siteid);	
	System.out.println("2>>><<"+lstComponent.size());
}catch(Exception ex){
	
}
%>

<c:set var="UpdateUrl" value="/siteinfo_jsp/popups/edit_physical_component.jsp"/>
<c:set var="RefreshUrl" value="/siteinfo_jsp/innerJSP/physical_component.jsp"/>
<c:set var="currentDiv" value="physicalComponentDiv"/>

<div class="mainBlockSiteInfo">

	<div class="header01">
	<h3 class="basicInfoPageTitle">Components</h3>
			<div class="floatRight01">
			<a href="#" onclick="javascript:dynamicPopup('${UpdateUrl}','','Components',event);return false;" class="addBtn hideAdminAction">+Add</a>
			</div>
	</div>


	

<table class="tabData" cellpadding="0" cellspacing="0">
<tbody>
<tr>
<th>Components</th>
<th class="hideAdminAction">Edit / delete</th>
</tr>
<c:forEach items="<%=lstComponent %>" var="component" varStatus="status">
<tr>
<td>
<c:out value="${component.getComponent()}" />
</td>
<td class="editIcons hideAdminAction">
<div class="editDelete">
<a href="#" onclick="javascript:dynamicPopup('${UpdateUrl}','${component.getWhp_sites_component_id()}','Component',event);return false;" class="edit">edit</a>
<a href="javascript:deletePopup('${RefreshUrl}','${currentDiv}','${component.getWhp_sites_component_id()}','Component');" class="delete">delete</a>
</div>
</td>
</tr>
</c:forEach>
</tbody>
</table>
</div>