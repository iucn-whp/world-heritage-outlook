<%@page import="com.iucn.whp.dto.WhpSiteBoundaryModificationType"%>
<%@include file="/siteinfo_jsp/init_ie.jsp" %>


<%
List<whp_sites_boundary_modification> lstBoundaryModification=null;
List<WhpSiteBoundaryModificationType> lstSiteBoundaryModificationType=new ArrayList<WhpSiteBoundaryModificationType>();

try{
	long siteid=Long.parseLong(request.getAttribute("siteId").toString());
	lstBoundaryModification=whp_sitesLocalServiceUtil.getWhpSiteBoundaryModificationBySiteId(siteid);
	WhpSiteBoundaryModificationType siteBoundaryModificationType=null;
	
	for(int j=0;j<lstBoundaryModification.size();j++){   	
		
    	try{
    		
    		siteBoundaryModificationType=new WhpSiteBoundaryModificationType();
    		
    		siteBoundaryModificationType.setBoundaryModification(lstBoundaryModification.get(j));        		
    		        		
    		siteBoundaryModificationType.setBoundaryModificationType(boundary_modification_type_lkpLocalServiceUtil.fetchboundary_modification_type_lkp(lstBoundaryModification.get(j).getBmid()));        		
    		        	        		
    		lstSiteBoundaryModificationType.add(siteBoundaryModificationType);
    		
    	}catch(Exception ex){
    		System.out.println("EXCEPTION:"+ ex.getStackTrace()+"------"+ex.getStackTrace());
    	}
    	
    	
    	
	}
}catch(Exception ex){
	
}

%>

<c:set var="UpdateUrl" value="/siteinfo_jsp/popups/edit_official_boundary_Modifications.jsp"/>
<c:set var="RefreshUrl" value="/siteinfo_jsp/innerJSP/official_boundary_modification.jsp"/>
<c:set var="currentDiv" value="BounModDiv"/>

	<div class="tblBlockHeader">
		<h2 class="header02">Boundary Modifications :</h2>
		<div class="floatRight01"><a href="#" onclick="javascript:dynamicPopup('${UpdateUrl}','',' Boundary Modifications',event);return false;" class="addBtn hideAdminAction">+Add</a></div>
	</div>
<table class="tabData" cellpadding="0" cellspacing="0">
<tbody>
<tr>
<th>Date</th>
<th>Type</th>
<th>Description</th>
<th class="editIcons hideAdminAction">Edit / Delete</th>
</tr>
<c:forEach items="<%=lstSiteBoundaryModificationType %>" var="boundaryModification" varStatus="status">		
				
<tr>
<td><fmt:formatDate pattern="dd/MM/yyyy" value="${boundaryModification.getBoundaryModification().getMod_date()}" /></td>
<td><c:out value="${boundaryModification.getBoundaryModificationType().getBm_type()}" /></td>
<td><c:out value="${boundaryModification.getBoundaryModification().getDescription()}" /></td>
<td class="editIcons hideAdminAction">
<div class="editDelete">
<a href="#" onclick="javascript:dynamicPopup('${UpdateUrl}','${boundaryModification.getBoundaryModification().getWhp_sites_boundary_modification_id() }','Boundary Modifications',event,'${RefreshUrl}');return false;" class="edit">edit</a>
<a href="javascript:deletePopup('${RefreshUrl}','${currentDiv}','${boundaryModification.getBoundaryModification().getWhp_sites_boundary_modification_id()}','Boundary Modifications');" class="delete">delete</a>
</div>
</td>
</tr>
</c:forEach>
</tbody>
</table>