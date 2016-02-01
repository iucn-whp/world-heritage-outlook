<%@page import="com.iucn.whp.dto.WhpSiteRecommendationType"%>
<%@include file="/siteinfo_jsp/init_ie.jsp" %>


<%
List<whp_sites_iucn_recommendation> lstRecommendation=null;
List<WhpSiteRecommendationType> lstSiteRecommendationType=new ArrayList<WhpSiteRecommendationType>();

try{
	long siteid=Long.parseLong(request.getAttribute("siteId").toString());
	lstRecommendation=whp_sitesLocalServiceUtil.getWhpSiterecommendationListBySiteId(siteid);
	WhpSiteRecommendationType siteRecommendationType=null;
	
	for(int j=0;j<lstRecommendation.size();j++){   	
		
    	try{
    		
    		siteRecommendationType=new WhpSiteRecommendationType();
    		
    		siteRecommendationType.setWhpRecommendation(lstRecommendation.get(j));        		
    		        		
    		siteRecommendationType.setRecommendationType(recommendation_type_lkpLocalServiceUtil.fetchrecommendation_type_lkp(lstRecommendation.get(j).getRecommendation_type()));        		
    		        	
    		
    		lstSiteRecommendationType.add(siteRecommendationType);
    		         		
    		
    	}catch(Exception ex){
    		System.out.println("EXCEPTION:"+ ex.getStackTrace()+"------"+ex.getStackTrace());
    	}
    	
    	
    	
	}
}catch(Exception ex){
	
}

%>

<c:set var="UpdateUrl" value="/siteinfo_jsp/popups/edit_official_IUCN_Recomendation.jsp"/>
<c:set var="RefreshUrl" value="/siteinfo_jsp/innerJSP/official_iucn_recommendation.jsp"/>
<c:set var="currentDiv" value="iucnRecomDiv"/>

	<div class="tblBlockHeader">
		<h2 class="header02">IUCN Recommendation :</h2>
		<div class="floatRight01">
		<a href="#" onclick="javascript:dynamicPopup('${UpdateUrl }','','IUCN Recommendation',event);return false;" class="addBtn hideAdminAction">+Add</a>
		</div>
	</div>


<table class="tabData" cellpadding="0" cellspacing="0">
<tbody>
<tr>
<th class="twoColumnTableBlock1">Date</th>
<th class="twoColumnTableBlock2">Type</th>
<th class="hideAdminAction">Edit / Delete</th>
</tr>


<c:forEach items="<%= lstSiteRecommendationType%>" var="recommendation" varStatus="status">		
				
<tr>
<td><fmt:formatDate pattern="dd/MM/yyyy" value="${recommendation.getWhpRecommendation().getRec_date()}" /></td>
<td><c:out value="${recommendation.getRecommendationType().getRecommendation()}" /></td>
<td class="editIcons hideAdminAction">
<div class="editDelete">
<a href="#" onclick="javascript:dynamicPopup('${UpdateUrl}','${recommendation.getWhpRecommendation().getWhp_sites_iucn_recommendation_id() }','IUCN Recomendation',event);return false;" class="edit">edit</a>
<a href="javascript:deletePopup('${RefreshUrl}','${currentDiv}','${recommendation.getWhpRecommendation().getWhp_sites_iucn_recommendation_id() }','IUCN Recomendation');" class="delete">delete</a>
</div>
</td>
</tr>
		
</c:forEach>

</tbody>
</table>