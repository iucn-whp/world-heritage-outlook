
<%@include file="/siteinfo_jsp/init.jsp" %>
<%@page import="com.iucn.whp.dbservice.service.whp_sitesLocalServiceUtil"%>
<%@page import="com.iucn.whp.dbservice.model.whp_sites"%>
<%

String site_description="";
long siteid=Long.parseLong(request.getAttribute("siteId").toString());

whp_sites objsite = whp_sitesLocalServiceUtil.getSiteBySiteId(siteid);

%>

<c:set var="UpdateUrl" value="/siteinfo_jsp/popups/edit_site_description.jsp"/>
<c:set var="RefreshUrl" value="/siteinfo_jsp/innerJSP/site_description.jsp"/>
<c:set var="currentDiv" value="SitedescDiv"/>
<div class="mainBlockSiteInfo">



<!--infoWrapper Starts Here-->
<div class="infoWrapper">
<div class="header01">
<h3 class="basicInfoPageTitle">Site Description</h3>

<div class="floatRight01">	<%
%>
 	<a href="#" onclick="javascript:dynamicPopup('/siteinfo_jsp/popups/edit_site_description.jsp','<%=objsite.getSite_id()%>','Site Description',event);return false;" class="addBtn hideAdminAction">Edit</a>
 	<%//} %></div>
</div>
<div class="rowWrapper">

<table class="tabData" cellpadding="0" cellspacing="0">
<tbody>
<tr>
<th>Description</th>
</tr>
<tr>
<td>
<%=objsite.getDescription() %>
</td>
</tr>
</tbody>
</table>

</div>

</div>
<!--infoWrapper Ends Here-->
</div>