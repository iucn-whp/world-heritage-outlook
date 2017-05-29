<%@page import="com.iucn.whp.dto.AssessmentValueCssClass"%>
<%@include file="/init_import.jsp" %>
<%
List<state_trend_whvalues> lststate_trendWH=null;
String trendwh = "";
String statewh = "";
String justificationwh = "";
long state_trend_idwh = 0;
List<state_trend_biodivvals> lstBiodivvals=null;
String trendbio = "";
String statebio = "";
String justificationbio = "";
long state_trend_idbio = 0;
AssessmentValueCssClass threatRatingwh = new AssessmentValueCssClass();
AssessmentValueCssClass threatRatingbio = new AssessmentValueCssClass();

try{
	long assesmentVersionId=Long.parseLong(request.getAttribute("versionId").toString());
	lststate_trendWH = site_assessmentLocalServiceUtil.getState_trend_whvaluesByVersion(assesmentVersionId);
	
	
	if(lststate_trendWH.size()>0){
		state_trend_idwh = lststate_trendWH.get(0).getState_trend_whval_id();
		if(lststate_trendWH.get(0).getState_id()>0){
			statewh = state_lkpLocalServiceUtil.getstate_lkp(lststate_trendWH.get(0).getState_id()).getState();
			trendwh = trend_lkpLocalServiceUtil.gettrend_lkp(lststate_trendWH.get(0).getTrend_id()).getTrend();
			justificationwh = lststate_trendWH.get(0).getJustification();
			threatRatingwh.setCssClass(lststate_trendWH.get(0).getState_id());
		}
	}
	
lstBiodivvals = site_assessmentLocalServiceUtil.getStatetrendbiodivvalsByVersion(assesmentVersionId);
	 
	
	if(lstBiodivvals.size()>0){
		state_trend_idbio= lstBiodivvals.get(0).getState_trend_biodivvals_id();
		if(lstBiodivvals.get(0).getState_id()>0){
			statebio = state_lkpLocalServiceUtil.getstate_lkp(lstBiodivvals.get(0).getState_id()).getState();
			trendbio = trend_lkpLocalServiceUtil.gettrend_lkp(lstBiodivvals.get(0).getTrend_id()).getTrend();
			justificationbio = lstBiodivvals.get(0).getJustification();
			threatRatingbio.setCssClass(lstBiodivvals.get(0).getState_id()); 
		}
	}
	
	
}catch(Exception ex){
	
}
%>
<c:set var="UpdateUrlwh" value="/assessment_jsp/popup/step4_wh_popup.jsp"/>
<c:set var="UpdateUrlbio" value="/assessment_jsp/popup/step4_biodiv_popup.jsp"/>


<table class="tab_data" cellpadding="0" cellspacing="0">
<tbody>
<tr>
<th>Values</th>
<th>Justification of Assessment</th>
<th>Assessment</th>
<th>Trend</th>
<th class="editIcons hideAdminAction">Edit</th>
</tr>

<tr>
<td>Assessment of the current state and trend of World Heritage values </td>
<td id ="<%=state_trend_idwh %>_WJF_TD"><%= justificationwh%></td>
<td id ="<%=state_trend_idwh %>_WST_TD"><span class ="<%=threatRatingwh.getCssClass() %>"><%=statewh %></span></td>
<td id ="<%=state_trend_idwh %>_WTR_TD"><%=trendwh%></td>
<td class="editIcons hideAdminAction">
<div class="editDelete">
<a href="#" onclick="javascript:dynamicPopup('${UpdateUrlwh}','<%=state_trend_idwh %>','Edit World Heritage values',event); return false;" class="edit">edit</a>

</div>
</td>
</tr>

<tr>
<td style="width:152px">Assessment of the current state and trend of other important biodiversity values (if applicable) </td>
<td style="width:560px" id="<%= state_trend_idbio%>_BJF_TD"><%=justificationbio %></td>
<td style="width:100px" id="<%= state_trend_idbio%>_BST_TD"><span class ="<%=threatRatingbio.getCssClass() %>"><%=statebio %></span></td>
<td style="width:100px" id="<%= state_trend_idbio%>_BTR_TD"><%=trendbio%></td>
<td class="editIcons hideAdminAction">
<div class="editDelete">

<a href="#" onclick="javascript:dynamicPopup('${UpdateUrlbio}','<%= state_trend_idbio%>','Edit other Important biodiversity values',event); return false;" class="edit">edit</a>

</div>
</td>
</tr>
</tbody>
</table>