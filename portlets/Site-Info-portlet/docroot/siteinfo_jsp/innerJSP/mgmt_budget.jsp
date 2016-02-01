<%@include file="/siteinfo_jsp/init.jsp" %>

<%
List<whp_sites_budget> lstBudget=null;
try{
	
	long siteid=Long.parseLong(request.getAttribute("siteId").toString());
	lstBudget=whp_sitesLocalServiceUtil.getwhpSitesBudgetBySiteId(siteid);
	
}catch(Exception ex){
	ex.printStackTrace();
	
}

%>

<c:set var="UpdateUrl" value="/siteinfo_jsp/popups/edit_mgmt_budget.jsp"/>
<c:set var="RefreshUrl" value="/siteinfo_jsp/innerJSP/mgmt_budget.jsp"/>
<c:set var="currentDiv" value="mgmtBudgetDiv"/>
	<div class="tblBlockHeader">
		<h2 class="header02">Annual Budget</h2>
		<div class="floatRight01"><a href="#" onclick="javascript:dynamicPopup('${UpdateUrl}','','Budget',event);return false;" class="addBtn hideAdminAction" >+Add</a>
		</div>
	</div>
<table class="tabData" cellpadding="0" cellspacing="0">
<tbody>
<tr>
<th>Date</th>
<th>National Currency</th>
<th>Value in USD($)</th>
<th class="hideAdminAction">Edit / Delete</th>
</tr>

<c:forEach items="<%=lstBudget%>" var="budget" varStatus="status">		
				
<tr>

<td>
<fmt:formatDate pattern="dd/MM/yyyy" value="${budget.getDate()}" />

</td>
<td><c:out value="${budget.getCurrency_local()}" /><c:out value="  ${budget.getCurrency()}" /></td>
<td><c:out value="${budget.getCurrency_usd()}" /></td>
<td class="editIcons hideAdminAction">
<div class="editDelete">
<a href="#" onclick="javascript:dynamicPopup('${UpdateUrl}','${budget.getWhp_sites_budget_id()}','Budget',event);return false;" class="edit">edit</a>
<a href="javascript:deletePopup('${RefreshUrl}','${currentDiv}','${budget.getWhp_sites_budget_id()}','Budget');" class="delete">delete</a>
</div>
</td>
</tr>
		
</c:forEach>


</tbody>
</table>

