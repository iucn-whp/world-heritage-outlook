<%@page import="com.iucn.whp.dto.WhpSiteDangerType"%>
<%@include file="/siteinfo_jsp/init_ie.jsp" %>


<%
List<whp_site_danger_list> lstDangerList=null;
List<WhpSiteDangerType> lstSiteDangerType=new ArrayList<WhpSiteDangerType>();

try{
	long siteid=Long.parseLong(request.getAttribute("siteId").toString());
	lstDangerList=whp_sitesLocalServiceUtil.getWhpSiteDangerListBySiteId(siteid);
	WhpSiteDangerType siteDangerStatus=null;
	
	for(int i=0;i<lstDangerList.size();i++){   	
		
    	try{
    		
    		siteDangerStatus=new WhpSiteDangerType();
    		
    		siteDangerStatus.setDangerList(lstDangerList.get(i));
    		
    		siteDangerStatus.setDangerStatus(danger_list_status_lkpLocalServiceUtil.fetchdanger_list_status_lkp(lstDangerList.get(i).getStatus_id()));        		
    		        		
    		lstSiteDangerType.add(siteDangerStatus);
    		         		
    		
    	}catch(Exception ex){
    		System.out.println("EXCEPTION:"+ ex.getStackTrace()+"------"+ex.getStackTrace());
    	}
    	
    	
    	
	}
}catch(Exception ex){
	
}

%>
<c:set var="UpdateUrl" value="/siteinfo_jsp/popups/edit_official_danger_List.jsp"/>
<c:set var="RefreshUrl" value="/siteinfo_jsp/innerJSP/official_danger_list.jsp"/>
<c:set var="currentDiv" value="dangerDiv"/>
	<div class="tblBlockHeader">
		<h2 class="header02">Danger List :</h2>
		<div class="floatRight01"><a href="#" onclick="javascript:dynamicPopup('${UpdateUrl}','','Danger List',event);return false;" class="addBtn hideAdminAction">+Add</a></div>
		</div>
<table class="tabData" cellpadding="0" cellspacing="0">
<tbody>
<tr>
<th>Date</th>
<th>Status</th>
<th class="hideAdminAction">Edit / Delete</th>
</tr>

<c:forEach items="<%=lstSiteDangerType %>" var="dangerlist" varStatus="status">		
				
<tr>
<td><fmt:formatDate pattern="dd/MM/yyyy" value="${dangerlist.getDangerList().getYear()}" /></td>
<td><c:out value="${dangerlist.getDangerStatus().getDl_status()}" /></td>
<td class="editIcons hideAdminAction">
<div class="editDelete">
<a href="#" onclick="javascript:dynamicPopup('${UpdateUrl}','${dangerlist.getDangerList().getWhp_site_danger_list_id()}','Danger List',event);return false;" class="edit" >edit</a>
<a href="javascript:deletePopup('${RefreshUrl}','${currentDiv}','${dangerlist.getDangerList().getWhp_site_danger_list_id()}','Danger List');" class="delete">delete</a>
</div>
</td>
</tr>
		
</c:forEach>

</tbody>
</table>