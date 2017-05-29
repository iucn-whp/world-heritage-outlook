<%@include file="/siteinfo_jsp/init.jsp" %>

<%
List<whp_sites_visitors> lstVisitor=null;
try{
	
	long siteid=Long.parseLong(request.getAttribute("siteId").toString());
	lstVisitor=whp_sitesLocalServiceUtil.getwhpSitesVisitorsBySiteId(siteid);
	
}catch(Exception ex){
	ex.printStackTrace();
	
}

%>

<c:set var="UpdateUrl" value="/siteinfo_jsp/popups/edit_mgmt_visitor.jsp"/>
<c:set var="RefreshUrl" value="/siteinfo_jsp/innerJSP/mgmt_visitor.jsp"/>
<c:set var="currentDiv" value="mgmtVisitorDiv"/>

		<div class="tblBlockHeader">
				<h2 class="header02">Visitors</h2>
				<div class="floatRight01">
				<a href="#" onclick="javascript:dynamicPopup('${UpdateUrl}','','Visitors',event);return false;" class="addBtn hideAdminAction">+Add</a>
				</div>
		</div>


<table class="tabData" cellpadding="0" cellspacing="0">
<tbody>
<tr>
<th>Date</th>
<th>Count</th>
<th class="hideAdminAction">Edit / Delete</th>
</tr>
<c:forEach items="<%=lstVisitor %>" var="visitor" varStatus="status">		
				
<tr>
	<td class="twoColumnTableBlock1">
	<fmt:formatDate pattern="dd/MM/yyyy" value="${visitor.getRecord_date()}" />	
	
	</td>
	<td class="twoColumnTableBlock2"><c:out value="${visitor.getVisitor_count()}" /></td>
	<td class="editIcons hideAdminAction">
	<div class="editDelete">
	<a href="#" onclick="javascript:dynamicPopup('${UpdateUrl}','${visitor.getWhp_sites_visitors_id()}','Visitors',event);return false;" class="edit">edit</a>
	<a href="javascript:deletePopup('${RefreshUrl}','${currentDiv}','${visitor.getWhp_sites_visitors_id()}','Visitors');" class="delete">delete</a>
	</div>
	</td>
</tr>
		
</c:forEach>

</tbody>
</table>
