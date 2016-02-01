<%@include file="/init_import.jsp" %>

<%

long assessmentVersionId=0;


List<benefits_summary> lst_benefits_summary=null;



try
{

	long assesmentVersionId=Long.parseLong(request.getAttribute("versionId").toString());
 	lst_benefits_summary=benefits_summaryLocalServiceUtil.getEntriesFromAssessmentId(assesmentVersionId);
 
	
}catch(Exception e )
{
	out.println("Ex------------"+e.getMessage());	
	
}



%>



<c:set var="UpdateUrl" value="/assessment_jsp/popup/step7_benefits_summ_pop.jsp"/>
 <c:set var="currentDiv" value="step7bDiv"/> 
 
 
<table class="tab_data" cellpadding="0" cellspacing="0">
<tbody>

				
<tr>
<% if(lst_benefits_summary.isEmpty()){ %>
<th align="left"> Summary of benefits</th>
 <th class="editIcons hideAdminAction">
<div class="editDelete">
<a href="#" onclick="javascript:dynamicPopup('${UpdateUrl}','${benefitssummary.getBenefits_summary_id()}','Summary of benefits',event); return false;" class="edit">edit</a>
</div>
</th>

<%} %>

<c:forEach items="<%=lst_benefits_summary %>" var="benefitssummary" varStatus="status">
 <tr>
 <th align="left"> Summary of benefits</th>
 <th class="editIcons hideAdminAction">
<div class="editDelete">
<a href="#" onclick="javascript:dynamicPopup('${UpdateUrl}','${benefitssummary.getBenefits_summary_id()}','Summary of benefits',event); return false;" class="edit">edit</a>
</div>
</th>
 </tr>
 <tr>	
 <td colspan="2" id="${benefitssummary.getBenefits_summary_id()}BSS_TD" ><c:out value="${benefitssummary.getSummary()}" /></td>
</tr>
</c:forEach> 
</tr>
</tbody>
</table>






















