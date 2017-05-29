<%@page import="com.iucn.whp.dto.WhpSiteInscriptionHistoryType"%>
<%@include file="/siteinfo_jsp/init_ie.jsp" %>


<%

List<whp_sites_inscription_date> lstInscriptionDate=null;
List<WhpSiteInscriptionHistoryType> lstSiteInscriptionHistoryType=new ArrayList<WhpSiteInscriptionHistoryType>();
try{
	long siteid=Long.parseLong(request.getAttribute("siteId").toString());
	WhpSiteInscriptionHistoryType SiteInscriptionHistoryType=null;
	lstInscriptionDate = whp_sitesLocalServiceUtil.getWhpSitesInscriptionHistoryBySiteId(siteid);
	for(int j=0;j<lstInscriptionDate.size();j++){   	
		
    	try{
    		
    		SiteInscriptionHistoryType=new WhpSiteInscriptionHistoryType();
    		
    		SiteInscriptionHistoryType.setInscription_date(lstInscriptionDate.get(j));        		
    		        		
    		SiteInscriptionHistoryType.setInscriptionType(inscription_type_lkpLocalServiceUtil.fetchinscription_type_lkp(lstInscriptionDate.get(j).getInscription_type_id()));        		
    		        	
    		
    		lstSiteInscriptionHistoryType.add(SiteInscriptionHistoryType);
    		        		
    		
    	}catch(Exception ex){
    		System.out.println("EXCEPTION:"+ ex.getStackTrace()+"------"+ex.getStackTrace());
    	}
    	
    	
    	
	}	
    	
    	
	
}catch(Exception ex){
	
}

%>
<c:set var="UpdateUrl" value="/siteinfo_jsp/popups/edit_official_Inscription_History.jsp"/>
<c:set var="RefreshUrl" value="/siteinfo_jsp/innerJSP/official_inscription_history.jsp"/>
<c:set var="currentDiv" value="inscriptionDateDiv"/>

	<div class="tblBlockHeader">
		<h2 class="header02">Inscription History</h2>
		<div class="floatRight01">
		<a href="#" onclick="javascript:dynamicPopup('${UpdateUrl}','','Inscription History',event);return false;" class="addBtn hideAdminAction">+Add</a>
		</div>
	</div>
	
<table class="tabData" cellpadding="0" cellspacing="0" id="InscHist">
<tbody>
<tr>
<th>Date</th>
<th>Type</th>
<th>Reference No</th>
<th class="hideAdminAction">Edit / delete</th>
</tr>
<tr>
<c:forEach items="<%=lstSiteInscriptionHistoryType %>" var="inscriptionDate" varStatus="status">		
				
<tr>
    	
<td><fmt:formatDate pattern="dd/MM/yyyy" value="${inscriptionDate.getInscription_date().getInscription_date()}"/></td>
<td><c:out value="${inscriptionDate.getInscriptionType().getType()}" /></td>
<td><c:out value="${inscriptionDate.getInscription_date().getReference_no()}" /></td>

<td class="editIcons hideAdminAction" >
<div class="editDelete">
<a href="#" onclick="javascript:dynamicPopup('${UpdateUrl}','${inscriptionDate.getInscription_date().getWhp_sites_inscription_date_id()}','Inscription History',event);return false;" class="edit">edit</a>
<a href="javascript:deletePopup('${RefreshUrl}','${currentDiv}','${inscriptionDate.getInscription_date().getWhp_sites_inscription_date_id()}','Inscription History');" class="delete">delete</a>
</div>
</td>
</tr>
		
</c:forEach>
</tr>
</tbody>
</table>

