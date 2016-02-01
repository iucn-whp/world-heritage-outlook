<%@page import="com.iucn.whp.dto.SitesThematicDto"%>
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

List<sites_thematic> lstsites_thematic=null;
List<SitesThematicDto> lstSitesThematicDto = new ArrayList<SitesThematicDto>();
try{
	long siteid=Long.parseLong(request.getAttribute("siteId").toString());
	lstsites_thematic=sites_thematicLocalServiceUtil.getSitesThematicBySiteId(siteid);

	SitesThematicDto SitesThematicDtoObj=null;
	for(int j=0;j<lstsites_thematic.size();j++)
	{
		try
		{
		SitesThematicDtoObj = new SitesThematicDto();
		SitesThematicDtoObj.setOther_thematic(lstsites_thematic.get(j));
		SitesThematicDtoObj.setOther_thematic_Type(thematic_lkpLocalServiceUtil.fetchthematic_lkp(lstsites_thematic.get(j).getThematicid()));
		lstSitesThematicDto.add(SitesThematicDtoObj);
		
		}catch(Exception ex )
		{
			System.out.println("EXCEPTION:"+ ex.getStackTrace()+"------"+ex.getStackTrace());
		}
	}
	
	
	
}catch(Exception ex){
	
	
	
}
%>
<c:set var="UpdateUrl" value="/siteinfo_jsp/popups/edit_site_thematic.jsp"/>
<c:set var="RefreshUrl" value="/siteinfo_jsp/innerJSP/sites_thematic.jsp"/>
<c:set var="currentDiv" value="sitesThematicsDiv"/>
	<div class="tblBlockHeader">
		<h2 class="header02">Site Theme</h2>
		<div class="floatRight01">
		<a href="#" onclick="javascript:dynamicPopup('${UpdateUrl}','','Site Theme',event);return false;" class="addBtn hideAdminAction">+Add</a>
		</div>
	</div>

<table class="tabData" cellpadding="0" cellspacing="0">
<tbody>

<tr>
<th>Theme</th>
<th class="hideAdminAction">Edit / Delete</th>
</tr>

<c:forEach items="<%=lstSitesThematicDto %>" var="siteThematics" varStatus="status">
<tr>
<td><c:out value="${siteThematics.getOther_thematic_Type().getThematic()}" /></td>
<td class="editIcons hideAdminAction">
<div class="editDelete">
<a href="#" onclick="javascript:dynamicPopup('${UpdateUrl}','${siteThematics.getOther_thematic().getSitethematicid()}','Site Theme',event);return false;" class="edit">edit</a>
<a href="javascript:deletePopup('${RefreshUrl}','${currentDiv}','${siteThematics.getOther_thematic().getSitethematicid()}','Site Theme');" class="delete">delete</a>
</div>
</td>
</tr>
</c:forEach>
</tbody>
</table>