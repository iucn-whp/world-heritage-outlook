<%@page import="com.iucn.whp.dto.WhpSiteIUCNPACategories"%>
<%@page import="java.util.ArrayList"%>
<%-- <%@include file="/siteinfo_jsp/init.jsp" %> --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x" %>

<%@ page import="java.util.List" %>
<%@ page import="java.util.Calendar" %>
<%@ page import="java.util.Collections" %>

<%@ page import="com.iucn.whp.dbservice.model.*" %>
<%@ page import="com.iucn.whp.dbservice.service.*" %>
<%
List<whp_sites_iucn_pa_category> lstiucn_pa_categories=null;
//List<WhpSiteIUCNPACategories> lstSiteIUCNPACategories=new ArrayList<WhpSiteIUCNPACategories>();
String strPaCategories = "";
try{
	long siteid=Long.parseLong(request.getAttribute("siteId").toString());
	lstiucn_pa_categories = whp_sites_iucn_pa_categoryLocalServiceUtil.getWhpSiteIUCNPACategoryBySiteId(siteid);
	
	for(int j=0;j<lstiucn_pa_categories.size();j++){   	
		int paccategoryId =lstiucn_pa_categories.get(j).getIucn_pa_category_id();
    	
		if(strPaCategories.isEmpty())
    		strPaCategories = iucn_pa_lkp_categoryLocalServiceUtil.getiucn_pa_lkp_category(paccategoryId).getCategory();
		else {
    		strPaCategories = strPaCategories+", "+iucn_pa_lkp_categoryLocalServiceUtil.getiucn_pa_lkp_category(paccategoryId).getCategory();
		}
	}
}catch(Exception ex){
	
}

%> 
 <c:set var="UpdateUrl" value="/siteinfo_jsp/popups/edit_species_iucn_cat.jsp"/>
<c:set var="RefreshUrl" value="/siteinfo_jsp/innerJSP/species_iucn_pacategory.jsp"/>
<c:set var="currentDiv" value="speciesPaCategoryDiv"/>

<div class="tblBlockHeader">
<h2 class="header02">IUCN PA Category</h2>
</div>

<table class="tabData" cellpadding="0" cellspacing="0">
<tbody>

<tr>
<th>Category</th>
<th class="hideAdminAction">Edit / Delete</th>
</tr>

<tr>

<td><%=strPaCategories %></td>
<td class="editIcons hideAdminAction">
<div class="editDelete">
<a href="#" onclick="javascript:dynamicPopup('${UpdateUrl}','','IUCN PA Category',event);return false;" class="edit">edit</a>
</div>
</td>
</tr>
</tbody>
</table>
