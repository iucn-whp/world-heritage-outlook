<%@page import="java.util.HashSet"%>
<%@page import="java.util.Set"%>
<%@page import="com.iucn.whp.dto.WhpSiteCountry"%>
<%@page import="com.iucn.whp.dto.WhpSiteInscriptionCriteria"%>
<%@page import="java.util.ArrayList"%>
<%@include file="/siteinfo_jsp/init.jsp" %>

<%
Set<unesco_region> setUnescoRegion=new HashSet<unesco_region>();
Set<iucn_region> setIucnRegion=new HashSet<iucn_region>();
List<whp_sites_country> lstwhp_sites_country=null;
List<WhpSiteCountry> lstSiteCountry = new ArrayList<WhpSiteCountry>();
try{
long site_id=Long.parseLong(request.getAttribute("siteId").toString());
List<unesco_region> lstUnescoRegion=null;
List<iucn_region> lstIucnRegion=null;
try{
lstIucnRegion=whp_sitesLocalServiceUtil.getIucnRegionBySiteId(site_id);
}catch(Exception e){
    e.printStackTrace();	
}
lstwhp_sites_country=whp_sitesLocalServiceUtil.getSiteCountryBySiteId(site_id);  
lstUnescoRegion=whp_sitesLocalServiceUtil.getUnescoRegionBySiteId(site_id);
WhpSiteCountry whpSitesCountryObj = null;
for(int j=0;j<lstwhp_sites_country.size();j++){   	
	
	try{
		
		whpSitesCountryObj=new WhpSiteCountry();
		
		whpSitesCountryObj.setCountryList(lstwhp_sites_country.get(j));        		
		     		
		whpSitesCountryObj.setCountryName(country_lkpLocalServiceUtil.fetchcountry_lkp(lstwhp_sites_country.get(j).getCountryid() ));        		
		        	
		lstSiteCountry.add(whpSitesCountryObj);
		        		
		
	}catch(Exception ex){
		System.out.println("EXCEPTION:"+ ex.getStackTrace());
	}
	
}
for(int i=0;i<lstIucnRegion.size();i++){
	setIucnRegion.add(lstIucnRegion.get(i));
}

for(int i=0;i<lstUnescoRegion.size();i++){
	setUnescoRegion.add(lstUnescoRegion.get(i));
}
}catch(Exception ex){
	System.out.println("EXCEPTION:"+ ex.getStackTrace());
}
%>
<c:set var="UpdateUrl" value="/siteinfo_jsp/popups/edit_basic_country_information.jsp"/>
<c:set var="RefreshUrl" value="/siteinfo_jsp/innerJSP/basic_information_country_edit.jsp"/>
<c:set var="currentDiv" value="basicInfoCountryAdd"/>
<!--mainBlockSiteInfo starts here-->
<div class="mainBlockSiteInfo">
<!--infoWrapper Starts Here-->
<div class="infoWrapper">
	<div class="header01">
	<h3 class="basicInfoPageTitle">Region Information</h3>
	<div class="floatRight01">
	<a href="#" onclick="javascript:dynamicPopup('${UpdateUrl}','','Country',event); return false;" class="addBtn hideAdminAction">+Add</a>
	</div>
	</div>

<!-- <table cellpadding="0" cellspacing="0" class="siteinfoGrid"> -->
<table class="tabData" cellpadding="0" cellspacing="0">
<tbody>
<tr>
<th>Country</th>
<th class="hideAdminAction">Delete</th>
</tr>
<c:forEach items="<%=lstSiteCountry %>" var="country" varStatus="status">	
<tr>
<td>
<c:out value="${country.getCountryName().getName()}" />
</td>
<td class="editIcons hideAdminAction">
<div class="singleIconContainer">
<a href="javascript:deletePopup('${RefreshUrl}','${currentDiv}','${country.getCountryList().getWhp_sites_country_id()}','Country');" class="delete">delete</a>
</div>
</td>
</tr>
</c:forEach>
</tbody>
</table>

<div class="rowWrapper">
<div class="row">
	<span class="inputLeft">IUCN Region</span>
	<span class="inputRight">
	<c:set var="Isize" value="<%=setIucnRegion.size() %>"></c:set>
	<c:forEach items="<%=setIucnRegion %>" var="iucnRegion" varStatus="status">		
				
		<c:out value="${iucnRegion.getName()}" />
		<c:out value="${status.count < Isize ? ',' : '' }" />
		
	</c:forEach>	
	
	</span>
</div>

<div class="row altColor lastRow">
	<span class="inputLeft">UNESCO Region</span>
	<span class="inputRight">
	<c:set var="Usize" value="<%=setUnescoRegion.size() %>"></c:set>
	<c:forEach items="<%=setUnescoRegion %>" var="unescoRegion" varStatus="status">		
				
		<c:out value="${unescoRegion.getName()}" />
		<c:out value="${status.count < Usize ? ',' : '' }" />
		
	</c:forEach>
	</span>
</div>
</div>

<%-- <h3> Thumbnail Information </h3>
<div class="rowBasicInfo altColor"> 
	<span class="inputLeft">Change Thumbnail</span>
	<span class="inputRight">
		<a href="javascript:dynamicPopup('/siteinfo_jsp/popups/','${objwhp_sites.getSite_id()}','Upload Thumbnail in Basic Information');" class="uploadbtn">Upload</a>
	</span>
</div> --%>


</div>
<!--infoWrapper ends Here-->
</div>
<!--mainBlockSiteInfo ends here-->
<script>
	$(document).ready(function(){
		$('td').css({'text-align':'left','padding-left':'0.5em'});
	});
</script>
