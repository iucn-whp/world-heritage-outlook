<%@page import="java.util.ArrayList"%>
<%@page import="com.iucn.whp.dto.WhpSiteFlagshipSpecies"%>
<%-- <%@include file="/siteinfo_jsp/init.jsp" %> --%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>


<%@ page import="java.util.List" %>
<%@ page import="java.util.Calendar" %>
<%@ page import="java.util.Collections" %>

<%@ page import="com.iucn.whp.dbservice.model.*" %>
<%@ page import="com.iucn.whp.dbservice.service.*" %>
<%
List<whp_sites_flagship_species> lstflagship_species=null;
String redListSiteURL="http://www.iucnredlist.org/details/";
//List<WhpSiteFlagshipSpecies> lstSiteFlagshipSpecies=new ArrayList<WhpSiteFlagshipSpecies>();
try{
	long siteid=Long.parseLong(request.getAttribute("siteId").toString());
	lstflagship_species=whp_sitesLocalServiceUtil.getWhpSiteFlagshipSpeciesBySiteId(siteid);
	/* WhpSiteFlagshipSpecies SiteFlagshipSpecies=null;
	for(int j=0;j<lstflagship_species.size();j++){   	
		
    	try{
    		
    		SiteFlagshipSpecies=new WhpSiteFlagshipSpecies();
    		
    		SiteFlagshipSpecies.setFlagship_species(lstflagship_species.get(j));        		
    		        		
    		SiteFlagshipSpecies.setFlagship_speciesType(
    				flagship_species_lkpLocalServiceUtil.fetchflagship_species_lkp(
    						lstflagship_species.get(j).getFlagship_species_id()));        		
    		        	        		
    		lstSiteFlagshipSpecies.add(SiteFlagshipSpecies);
    		         		
    		
    	}catch(Exception ex){
    		System.out.println("EXCEPTION:"+ ex.getStackTrace()+"------"+ex.getStackTrace());
    	}
    
	} */
}catch(Exception ex){
	
}

%>
<c:set var="UpdateUrl" value="/siteinfo_jsp/popups/edit_species_flagship_species.jsp"/>
<c:set var="RefreshUrl" value="/siteinfo_jsp/innerJSP/species_flagship.jsp"/>
<c:set var="currentDiv" value="speciesFlagshipDiv"/>
		
		<div class="tblBlockHeader">
			<h2 class="header02">Flagship Species</h2>
			<div class="floatRight01">
			<a href="#" onclick="javascript:dynamicPopup('${UpdateUrl}','','Flagship Species',event);return false;" class="addBtn hideAdminAction">+Add</a>
			</div>
		</div>
<table class="tabData" cellpadding="0" cellspacing="0">
<tbody>
<tr>
<th>Redlist Species ID</th>
<th>Redlist Link</th>
<th class="hideAdminAction">Edit / Delete</th>
</tr>
<c:forEach items="<%=lstflagship_species %>" var="siteFlagshipSpecies" varStatus="status">		
				
<tr>


<td><c:out value="${siteFlagshipSpecies.getFlagship_species_id()}" /></td>

<td>
<a href="<%=redListSiteURL %><c:out value="${siteFlagshipSpecies.getFlagship_species_id()}" />"  target="_blank">
<%=redListSiteURL %><c:out value="${siteFlagshipSpecies.getFlagship_species_id()}" />
</a>
</td>
<td class="editIcons hideAdminAction">
<div class="editDelete">
<a href="#" onclick="javascript:dynamicPopup('${UpdateUrl}','${siteFlagshipSpecies.getWhp_sites_flagship_species_id()}','Flagship Species',event);return false;" class="edit">edit</a>
<a href="javascript:deletePopup('${RefreshUrl}','${currentDiv}','${siteFlagshipSpecies.getWhp_sites_flagship_species_id()}','Flagship Species');" class="delete">delete</a>
</div>
</td>
</tr>
		
</c:forEach>
</tbody>
</table>
