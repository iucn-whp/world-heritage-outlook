<%@page import="java.util.ArrayList"%>
<%@page import="com.iucn.whp.dto.WhpSiteOtherDesignations"%>
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
List<whp_sites_other_designations> lstotherDesignations=null;
List<WhpSiteOtherDesignations> lstSiteOtherDesignation=new ArrayList<WhpSiteOtherDesignations>();
try{
	long siteid=Long.parseLong(request.getAttribute("siteId").toString());
	lstotherDesignations = whp_sites_other_designationsLocalServiceUtil.getWhpSiteOtherDesignationsBySiteId(siteid);
	WhpSiteOtherDesignations SiteOtherDesignations=null;
	for(int j=0;j<lstotherDesignations.size();j++){   	
		
		try{
			
			SiteOtherDesignations=new WhpSiteOtherDesignations();
			
			SiteOtherDesignations.setOther_designations(lstotherDesignations.get(j));        		
			        		
			SiteOtherDesignations.setOther_designationType(other_designation_lkpLocalServiceUtil.fetchother_designation_lkp(lstotherDesignations.get(j).getOther_designation_id()));
					     		
			        	        		
			lstSiteOtherDesignation.add(SiteOtherDesignations);
			//System.out.println("###>>>BM: "+ lstSiteOtherDesignation.get(j).getOther_designationType().getOther_designations_id()+ "-"+ lstSiteOtherDesignation.get(j).getOther_designationType().getDesignation());          		
			
		}catch(Exception ex){
			System.out.println("EXCEPTION:"+ ex.getStackTrace()+"------"+ex.getStackTrace());
		}
	}
	
}catch(Exception ex){
	
}

%>
<c:set var="UpdateUrl" value="/siteinfo_jsp/popups/edit_species_Other_Des.jsp"/>
<c:set var="RefreshUrl" value="/siteinfo_jsp/innerJSP/species_other_designation.jsp"/>
<c:set var="currentDiv" value="speciesOtherDesigDiv"/>
	<div class="tblBlockHeader">
		<h2 class="header02">Other Designations</h2>
		<div class="floatRight01">
		<a href="#" onclick="javascript:dynamicPopup('${UpdateUrl}','','Other Designations',event);return false;" class="addBtn hideAdminAction">+Add</a>
		</div>
	</div>

<table class="tabData" cellpadding="0" cellspacing="0">
<tbody>

<tr>
<th>Designation</th>
<th class="hideAdminAction">Edit / Delete</th>
</tr>

<c:forEach items="<%=lstSiteOtherDesignation %>" var="siteOtherDesignation" varStatus="status">
<tr>
<td><c:out value="${siteOtherDesignation.getOther_designationType().getDesignation()}" /></td>
<td class="editIcons hideAdminAction">
<div class="editDelete">
<a href="#" onclick="javascript:dynamicPopup('${UpdateUrl}','${siteOtherDesignation.getOther_designations().getWhp_sites_other_designations_id()}','Other Designations',event);return false;" class="edit">edit</a>
<a href="javascript:deletePopup('${RefreshUrl}','${currentDiv}','${siteOtherDesignation.getOther_designations().getWhp_sites_other_designations_id()}','Other Designations');" class="delete">delete</a>
</div>
</td>
</tr>
</c:forEach>
</tbody>
</table>