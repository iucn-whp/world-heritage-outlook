<div class="mainBlock siteInfoMainBlock">
<div class="tableWrapper infoWrapperBorder">

<div class="header01">
<h3 class="basicInfoPageTitle">Documents</h3>
</div>

<div class="tblBlockHeader">
<h2 class="header02">Mission</h2>
</div>
<table cellpadding="0" cellspacing="0" class="tabData">
<tbody>
<tr>
<th>Publish Date</th>
<th>Link</th>

</tr>

<c:forEach items="${lstMissions}" var="SiteMission" varStatus="status">
<tr>
<td>
<fmt:formatDate pattern="dd/MM/yyyy" value="${SiteMission.getDate_published()}" />
</td>
<td>
<a href="${SiteMission.getDocument_link()}"  target="_blank"><c:out value="${SiteMission.getDocument_link()}"></c:out></a></td>
</tr>

</c:forEach> 


</tbody>
</table>

<div class="tblBlockHeader">
<h2 class="header02">SOC Reports</h2>
</div>
<table cellpadding="0" cellspacing="0" class="tabData">
<tbody>
<tr>
<th>Publish Date</th>
<th>Link</th>

</tr>

<c:forEach items="${lstSoc_reports}" var="SiteSOCReports" varStatus="status">
<tr>
<td>
<fmt:formatDate pattern="dd/MM/yyyy" value="${SiteSOCReports.getDate_published()}" />
</td>
<td>
<a href="${SiteSOCReports.getDocument_link()}"  target="_blank"><c:out value="${SiteSOCReports.getDocument_link()}"></c:out></a></td>
</tr>

</c:forEach> 


</tbody>
</table>
<div class="tblBlockHeader">
<h2 class="header02">Management Plan</h2>
</div>
<table cellpadding="0" cellspacing="0" class="tabData">
<tbody>
<tr>
<th>Publish Date</th>
<th>Link</th>

</tr>

<c:forEach items="${lstMgmt_plan_states}" var="SiteMgmt_plan" varStatus="status">
<tr>
<td>
<fmt:formatDate pattern="dd/MM/yyyy" value="${SiteMgmt_plan.getDate_published()}" />
</td>
<td>
<a href="${SiteMgmt_plan.getDocument_link()}"  target="_blank"><c:out value="${SiteMgmt_plan.getDocument_link()}"></c:out></a></td>
</tr>

</c:forEach>


</tbody>
</table>

<div class="tblBlockHeader">
<h2 class="header02">MEE</h2>
</div>
<table cellpadding="0" cellspacing="0" class="tabData">
<tbody>
<tr>
<th>Publish Date</th>
<th>Link</th>

</tr>

<c:forEach items="${lstMees}" var="SiteMee" varStatus="status">
<tr>
<td>
<fmt:formatDate pattern="dd/MM/yyyy" value="${SiteMee.getDate_published()}" />
</td>
<td>
<a href="${SiteMee.getDocument_link()}"  target="_blank"><c:out value="${SiteMee.getDocument_link()}"></c:out></a></td>
</tr>

</c:forEach> 


</tbody>
</table>

<div class="tblBlockHeader">
<h2 class="header02">Others</h2>
</div>
<table cellpadding="0" cellspacing="0" class="tabData">
<tbody>
<tr>
<th>Publish Date</th>
<th>Link</th>

</tr>

<c:forEach items="${lstSiteDocs}" var="SiteDocs" varStatus="status">
<tr>
<td>
<fmt:formatDate pattern="dd/MM/yyyy" value="${SiteDocs.getDate_published()}" />
</td>
<td>
<a href="${SiteDocs.getDocument_link()}"  target="_blank"><c:out value="${SiteDocs.getDocument_link()}"></c:out></a></td>
</tr>

</c:forEach> 


</tbody>
</table>

</div>

</div>