<%@include file="/siteinfo_jsp/init_ie.jsp" %>
<%
whp_sites objwhp_sites=null;

try{
	long siteid=Long.parseLong(request.getAttribute("siteId").toString());
	objwhp_sites=whp_sitesLocalServiceUtil.getwhp_sites(siteid);
	

}catch(Exception ex){
	
}
%>


	 <div class="header01">
		<h3 class="basicInfoPageTitle">Physical Information</h3>
		<div class="floatRight01"><a href="#" onclick="javascript:dynamicPopup('/siteinfo_jsp/popups/edit_physical_information.jsp','<%= objwhp_sites.getSite_id()%>','physical Information',event);return false;" class="addBtn hideAdminAction">Edit</a></div>
	</div>

<div class="rowWrapper">
<div class="row firstRow">
	<span class="inputLeft">Area (Ha)</span>
	<span class="inputRight"><%= objwhp_sites.getArea()%></span>
</div>

<div class="row altColor">
	<span class="inputLeft">Buffer Zone Area (Ha)</span>
	<span class="inputRight"><%= objwhp_sites.getBuffer_zone_area()%></span>
</div>

<div class="row altColor">
	<span class="inputLeft">Buffer Zone</span>
	<span class="inputRight"><%= objwhp_sites.getBuffer_zone() ? "Yes" : "No"%></span>
</div>

<div class="row">
	<span class="inputLeft">Transboundary</span>
	<span class="inputRight"><%= objwhp_sites.getTransboundary() ? "Yes" : "No"%></span>
</div>

<div class="row lastRow">
	<span class="inputLeft">Serial</span>
	<span class="inputRight"><%= objwhp_sites.getSerial() ? "Yes" : "No"%></span>
</div>

</div>
 

