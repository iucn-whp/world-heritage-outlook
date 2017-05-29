<%@include file="/siteinfo_jsp/init_ie.jsp" %>

<%
List<whp_sites_soouv> lstSoouv=null;

try{
	long siteid=Long.parseLong(request.getAttribute("siteId").toString());
	lstSoouv=whp_sitesLocalServiceUtil.getwhpSitesSoouvBySiteId(siteid);
	
}catch(Exception ex){
	
}

%>
<c:set var="UpdateUrl" value="/siteinfo_jsp/popups/edit_official_soouv.jsp"/>
<c:set var="RefreshUrl" value="/siteinfo_jsp/innerJSP/official_soouv.jsp"/>
<c:set var="currentDiv" value="soouvDiv"/>

	<div class="tblBlockHeader">
	
		<h2 class="header02">Statement Of Outstanding Universal Values :</h2>
		<div class="floatRight01">
		<a href="#" onclick="javascript:dynamicPopup('${UpdateUrl}','','Outstanding Universal Values',event);return false;" class="addBtn hideAdminAction">+Add</a></div>
		
	</div>
	
<table class="tabData" cellpadding="0" cellspacing="0">
<tbody>
<tr>
<th>Date</th>
<th>Adaptation(En)</th>
<th>Adaptation(Fr)</th>
<th class="hideAdminAction">Edit / Delete</th>
</tr>

<c:forEach items="<%= lstSoouv%>" var="Soouv" varStatus="status">		
				
<tr>
<td><fmt:formatDate pattern="dd/MM/yyyy" value="${Soouv.getSoouv_date()}" /></td>
<td><c:out value="${Soouv.getDescription_en()}" /></td>
<td><c:out value="${Soouv.getDescription_fr()}" /></td>
<td class="editIcons hideAdminAction">
<div class="editDelete">
<a href="#" onclick="javascript:dynamicPopup('${UpdateUrl}','${Soouv.getWhp_sites_soouv_id() }','Outstanding Universal Values',event);return false;" class="edit">edit</a>
<a href="javascript:deletePopup('${RefreshUrl}','${currentDiv}','${Soouv.getWhp_sites_soouv_id() }','Outstanding Universal Values');" class="delete">delete</a>
</div>
</td>
</tr>
		
</c:forEach>


</tbody>
</table>