<%@page import="com.iucn.whp.dto.AssessmentValueCssClass"%>
<%@include file="/init_import.jsp" %>
<%
 List<threat_summary_current> lstthreats_current=null;
 List<threat_summary_potential> lstthreats_potential=null;
 List<threat_summary_overall> lstthreats_overall=null;
 AssessmentValueCssClass threatRating = new AssessmentValueCssClass();
 long versionId=0;
 String currentThreat =null;
 String potentialThreat =null;
 String overallThreat =null;

	try{
		versionId=Long.parseLong(request.getAttribute("versionId").toString());
		lstthreats_current = site_assessmentLocalServiceUtil.getThreatSummaryCurrentByVersion(versionId);
		lstthreats_potential = site_assessmentLocalServiceUtil.getThreatSummaryPotentialByVersion(versionId);
		lstthreats_overall = site_assessmentLocalServiceUtil.getThreatSummaryOverallByVersion(versionId);
		
		
		currentThreat = versionId+"_current";
		potentialThreat = versionId+"_potential";
		overallThreat = versionId+"_overall";
	}catch(Exception ex){
	
	} 

%>
<c:set var="UpdateUrl" value="/assessment_jsp/popup/step2_overall_threat.jsp"/>
<c:set var="RefreshUrl" value="/assessment_jsp/innerJsp/step2_ot.jsp"/>
<c:set var="currentDiv" value="step2oltDiv"/> 

<table class="tab_data" cellpadding="0" cellspacing="0">
<tbody>
<tr>
<th>Values</th>
<th>Justification</th>
<th>Assessment</th>
<th class="editIcons hideAdminAction">Edit</th>
</tr>


<tr>
<td class="currentThreat" style="width:250px;" >Overall Assessment of current Threats</td>
<%if(lstthreats_current.isEmpty() || lstthreats_current.get(0).getThreat_rating()==0){
	 %>
	 <td align="center"></td>
	 <td align="center"></td>
	 <%}else{ 
		 long rating = lstthreats_current.get(0).getThreat_rating();
		 threatRating.setCssClass(rating) ;
	     String assessment = threat_rating_lkpLocalServiceUtil.getthreat_rating_lkp(rating).getRating();
	 %>
	 
<td id="<%=lstthreats_current.get(0).getThreat_sum_cur_id() %>_SC_JF_TD"><%=lstthreats_current.get(0).getOverall_current() %></td>

<td id="<%=lstthreats_current.get(0).getThreat_sum_cur_id() %>_SC_RT_TD"><span class ="<%=threatRating.getCssClass() %>"><%=assessment %></span></td>
<%} %>
<td class="editIcons hideAdminAction">
<div class="editDelete">
<a href="#" onclick="javascript:dynamicPopup('${UpdateUrl}','<%=currentThreat %>','Overall Assessment of current Threats',event); return false;" class="edit">edit</a>
</div>
</td>
</tr>

<tr>
<td class="currentThreat" style="width:250px;">Overall Assessment of Potential Threats</td>
<%if(lstthreats_potential.isEmpty() || lstthreats_potential.get(0).getThreat_rating()==0){ %>
	<td align="center"></td>
	 <td align="center"></td>
	 <%}else{
		long rating = lstthreats_potential.get(0).getThreat_rating();
	 	threatRating.setCssClass(rating) ;
     	String assessment = threat_rating_lkpLocalServiceUtil.getthreat_rating_lkp(rating).getRating();
  %>
<td id="<%=lstthreats_potential.get(0).getThreat_sum_potential_id() %>_SP_JF_TD"><%=lstthreats_potential.get(0).getOverall_potential() %></td>
<td id="<%=lstthreats_potential.get(0).getThreat_sum_potential_id() %>_SP_RT_TD"><span class ="<%=threatRating.getCssClass() %>"><%=assessment %></span></td>
<%} %>
<td class="editIcons hideAdminAction">
<div class="editDelete">
<a href="#" onclick="javascript:dynamicPopup('${UpdateUrl}','<%=potentialThreat %>','Overall Assessment of Potential Threats',event); return false;" class="edit">edit</a>
</div>
</td>
</tr>

<tr>
<td class="currentThreat" style="width:205px;">Overall Assessment of Threats</td>
<%if(lstthreats_overall.isEmpty() || lstthreats_overall.get(0).getThreat_rating()==0){ %>
	<td align="center"></td>
	<td align="center"></td>
	 <%}else{ 
	 	long rating = lstthreats_overall.get(0).getThreat_rating();
		 threatRating.setCssClass(rating) ;
	     String assessment = threat_rating_lkpLocalServiceUtil.getthreat_rating_lkp(rating).getRating();
	 %>
<td id="<%=lstthreats_overall.get(0).getThreat_sum_overall_id() %>_SO_JF_TD"><%=lstthreats_overall.get(0).getOverall_threat() %></td>
<td id="<%=lstthreats_overall.get(0).getThreat_sum_overall_id() %>_SO_RT_TD"><span class ="<%=threatRating.getCssClass() %>"><%=assessment %></span></td>
<%} %>
<td class="editIcons hideAdminAction">
<div class="editDelete">
<a href="#" onclick="javascript:dynamicPopup('${UpdateUrl}','<%=overallThreat %>','Overall Assessment of Threats',event); return false;" class="edit">edit</a>
</div>
</td>
</tr>



</tbody>
</table>
