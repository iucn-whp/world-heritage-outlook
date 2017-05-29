<%@page import="java.util.Date"%>
<%@include file="/siteinfo_jsp/init_ie.jsp" %>


<%

List<whp_sites_dsocr> lstDsocr=null;

try{
	long siteid=Long.parseLong(request.getAttribute("siteId").toString());
	//System.out.println("--------------siteid--------"+siteid);
	lstDsocr=whp_sitesLocalServiceUtil.getwhpSitesDsocrBySiteId(siteid);
	
}catch(Exception ex){
	
}
%>
<c:set var="UpdateUrl" value="/siteinfo_jsp/popups/edit_official_dsocr.jsp"/>
<c:set var="RefreshUrl" value="/siteinfo_jsp/innerJSP/official_dsocr.jsp"/>
<c:set var="currentDiv" value="dscorDiv"/>
	
	<div class="tblBlockHeader">
	<h2 class="header02">DSOCR :</h2>
	<div class="floatRight01"><a href="#" onclick="javascript:dynamicPopup('${UpdateUrl}','','DSOCR',event);return false;" class="addBtn hideAdminAction">+Add</a></div>
	</div>
	
<table class="tabData" cellpadding="0" cellspacing="0">
<tbody>
<tr>
<th>Date</th>
<th>State</th>
<th class="hideAdminAction">Edit / Delete</th>
</tr>

<c:forEach items="<%=lstDsocr %>" var="dsocr" varStatus="status">
<tr>
<td><fmt:formatDate pattern="dd/MM/yyyy" value="${dsocr.getDsocr_date()}" /></td>
<td><c:out value="${dsocr.getState_description()}" /></td>
<td class="editIcons hideAdminAction">
<div class="editDelete">
<a href="#" onclick="javascript:dynamicPopup('${UpdateUrl}','${dsocr.getWhp_sites_dsocr_id() }','DSOCR',event);return false;" class="edit">edit</a>
<a href="javascript:deletePopup('${RefreshUrl}','${currentDiv}','${dsocr.getWhp_sites_dsocr_id() }','DSOCR');" class="delete">delete</a>
</div>
</td>
</tr>
</c:forEach>

</tbody>
</table>

	