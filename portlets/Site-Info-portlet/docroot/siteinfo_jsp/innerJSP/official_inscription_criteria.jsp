
<%@include file="/siteinfo_jsp/init_ie2.jsp" %>
<%@page import="com.iucn.whp.dto.WhpSiteInscriptionCriteria"%>


<%
//List<inscription_criteria_lkp> lstInscriptionCiteria=null;
List<whp_sites_inscription_criteria> lstwhpInscriptionCiteria=null;
List<WhpSiteInscriptionCriteria> lstSiteInscriptionCiteria =new ArrayList<WhpSiteInscriptionCriteria>();
try{
	
	long siteid=Long.parseLong(request.getAttribute("siteId").toString());
	WhpSiteInscriptionCriteria siteInscriptionCriteria=null;
	//lstInscriptionCiteria=whp_sitesLocalServiceUtil.getInscriptionBySiteId(siteid);
	lstwhpInscriptionCiteria=whp_sitesLocalServiceUtil.getWhpSitesInscriptionCriteriaBySiteId(siteid);
	
	for(int j=0;j<lstwhpInscriptionCiteria.size();j++){   	
		
    	try{
    		
    		siteInscriptionCriteria=new WhpSiteInscriptionCriteria();
    		
    		siteInscriptionCriteria.setInscription_criteria(lstwhpInscriptionCiteria.get(j));        		
    		        		
    		siteInscriptionCriteria.setInscription_criteria_type(inscription_criteria_lkpLocalServiceUtil.fetchinscription_criteria_lkp(lstwhpInscriptionCiteria.get(j).getCriteria_id()));
    		lstSiteInscriptionCiteria.add(siteInscriptionCriteria) ;     		
    		
    	}catch(Exception ex){
    		System.out.println("EXCEPTION:"+ ex.getStackTrace()+"------"+ex.getStackTrace());
    	}
    	
    	
    	
	}
}catch(Exception ex){
	ex.printStackTrace();
	
}

%>
<c:set var="UpdateUrl" value="/siteinfo_jsp/popups/edit_official_inscription_criteria.jsp"/>
<c:set var="RefreshUrl" value="/siteinfo_jsp/innerJSP/official_inscription_criteria.jsp"/>
<c:set var="currentDiv" value="inscriptionCriteriaDiv"/>
<div class="tblBlockHeader">
<h2 class="header02">Inscription Criteria</h2>
<div class="floatRight01"><a href="#" onclick="javascript:dynamicPopup('${UpdateUrl}','','Inscription Criteria',event);return false;" class="addBtn hideAdminAction">+Add</a></div>
</div>
<table class="tabData" cellpadding="0" cellspacing="0">
<tbody>
<tr>
<th>Criteria</th>
<th>Criteria Type</th>
<th class="hideAdminAction">Edit / delete</th>
</tr>
<c:forEach items="<%=lstSiteInscriptionCiteria %>" var="inscriptionCiteria" varStatus="status">
<tr>
<td>
<c:out value="${inscriptionCiteria.getInscription_criteria_type().getCriteria()}" />
</td>
<td>
<c:out value="${inscriptionCiteria.getInscription_criteria_type().getCriteria_type() }" />
</td>
<td class="editIcons hideAdminAction">
<div class="editDelete">
<a href="#" onclick="javascript:dynamicPopup('${UpdateUrl}','${inscriptionCiteria.getInscription_criteria().getWhp_sites_inscription_criteria_id()}','Inscription Criteria',event);return false;" class="edit">edit</a>
<a href="javascript:deletePopup('${RefreshUrl}','${currentDiv}','${inscriptionCiteria.getInscription_criteria().getWhp_sites_inscription_criteria_id()}','Inscription Criteria');" class="delete">delete</a>
</div>
</td>
</tr>
</c:forEach>
</tbody>
</table>

