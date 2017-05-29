<%@page import="com.iucn.whp.dto.AssessmentValueCssClass"%>
<%@page import="com.iucn.whp.dto.AssessmentTrends"%>
<%@include file="/init_import.jsp" %>
<%
		List<current_state_trend> lstcurrent_state_trend=null;
//		List<state_trend_whvalues> lststate_trendWH = null;
//		List<state_trend_biodivvals> lstBiodivvals = null;

		List<AssessmentTrends> lstData = new ArrayList<AssessmentTrends>();

//		String trendwh = "n.a.";
//		String justificationwh = "n.a.";
//		String trendbio = "n.a.";
//		String justificationbio = "n.a.";

//		long state_trend_idwh = 0;
//		long state_trend_idbio = 0;
//
//		long trendWhRating = 0;
//		long trendBioRating = 0;
//
//		AssessmentValueCssClass threatRatingwh = new AssessmentValueCssClass();
//		AssessmentValueCssClass threatRatingbio = new AssessmentValueCssClass();
		AssessmentValueCssClass threatRating = new AssessmentValueCssClass();

		int whCount=0;

		try {
			long assesmentVersionId = Long.parseLong(request.getAttribute("versionId").toString());

			lstcurrent_state_trend = site_assessmentLocalServiceUtil.getCurrent_state_trendByVersion(assesmentVersionId);
//			lststate_trendWH = site_assessmentLocalServiceUtil.getState_trend_whvaluesByVersion(assesmentVersionId);

			AssessmentTrends assessmentTrends = null;

			Collections.sort(lstcurrent_state_trend);

			for (current_state_trend aLstcurrent_state_trend : lstcurrent_state_trend) {
				try {
					if (!aLstcurrent_state_trend.getIs_biodiv_whval()) {
						whCount++;
						assessmentTrends = new AssessmentTrends();
						assessmentTrends.setCurrentstatetrend(aLstcurrent_state_trend);
						if (aLstcurrent_state_trend.getState_id() > 0 && aLstcurrent_state_trend.getTrend_id() > 0) {
							assessmentTrends.setState(state_lkpLocalServiceUtil.getstate_lkp(aLstcurrent_state_trend.getState_id()));
							assessmentTrends.setTrend(trend_lkpLocalServiceUtil.gettrend_lkp(aLstcurrent_state_trend.getTrend_id()));
						}
						long valueId = aLstcurrent_state_trend.getVn();
						assessmentTrends.setWhvalue(assessment_whvaluesLocalServiceUtil.getassessment_whvalues(valueId).getValues());
						assessmentTrends.setCount(whCount);
						assessmentTrends.setIs_Biodiv_value(false);
						lstData.add(assessmentTrends);
					}
				} catch (Exception ex) {
				}
			}

			whCount = 0;

			for (current_state_trend aLstcurrent_state_trend : lstcurrent_state_trend) {
				try {
					if (aLstcurrent_state_trend.getIs_biodiv_whval()) {
						whCount++;
						assessmentTrends = new AssessmentTrends();
						assessmentTrends.setCurrentstatetrend(aLstcurrent_state_trend);
						if (aLstcurrent_state_trend.getState_id() > 0 && aLstcurrent_state_trend.getTrend_id() > 0) {
							assessmentTrends.setState(state_lkpLocalServiceUtil.getstate_lkp(aLstcurrent_state_trend.getState_id()));
							assessmentTrends.setTrend(trend_lkpLocalServiceUtil.gettrend_lkp(aLstcurrent_state_trend.getTrend_id()));
						}
						long valueId = aLstcurrent_state_trend.getVn();
						assessmentTrends.setWhvalue(biodiversity_valuesLocalServiceUtil.getbiodiversity_values(valueId).getValue());
						assessmentTrends.setCount(whCount);
						assessmentTrends.setIs_Biodiv_value(true);
						lstData.add(assessmentTrends);
					}
				} catch (Exception ex) {}
			}

//		if (lststate_trendWH.size() > 0) {
//			state_trend_whvalues trendWhValue = lststate_trendWH.get(0);
//			state_trend_idwh = trendWhValue.getState_trend_whval_id();
//			trendWhRating = trendWhValue.getState_id();
//			if (trendWhValue.getState_id() > 0) {
//				trendwh = trend_lkpLocalServiceUtil.gettrend_lkp(trendWhValue.getTrend_id()).getTrend();
//				justificationwh = trendWhValue.getJustification();
//				threatRatingwh.setCssClass(trendWhValue.getState_id());
//			}
//		}
//
//		lstBiodivvals = site_assessmentLocalServiceUtil.getStatetrendbiodivvalsByVersion(assesmentVersionId);
//
//		if (lstBiodivvals.size() > 0) {
//			state_trend_biodivvals trendBioValue = lstBiodivvals.get(0);
//			state_trend_idbio = trendBioValue.getState_trend_biodivvals_id();
//
//			trendBioRating = trendBioValue.getState_id();
//
//			if (trendBioValue.getState_id() > 0) {
//				trendbio = trend_lkpLocalServiceUtil.gettrend_lkp(trendBioValue.getTrend_id()).getTrend();
//				justificationbio = trendBioValue.getJustification();
//				threatRatingbio.setCssClass(trendBioValue.getState_id());
//			}
//		}

	} catch (Exception ex) {}
%>

<c:set var="UpdateUrl" value="/assessment_jsp/popup/step4_ctatv_popup.jsp"/>
<c:set var="RefreshUrl" value="/assessment_jsp/innerJsp/step4_ctatv.jsp"/>
<c:set var="currentDiv" value="step4MainDiv"/>

<c:set var="UpdateUrlwh" value="/assessment_jsp/popup/step4_wh_popup.jsp"/>
<c:set var="UpdateUrlbio" value="/assessment_jsp/popup/step4_biodiv_popup.jsp"/>

<table class="tab_data" cellpadding="0" cellspacing="0">
<tbody>
    <tr>
		<th colspan="3">World Heritage Values</th>
		<th colspan="5">Assessment</th>
		<th colspan="2"></th>
	</tr>
	<tr>
		<th>No.</th>
		<th>Values</th>
		<th>Justification of Assessment</th>
		<th class="good">Good</th>
		<th class="low-concern">Low Concern</th>
		<th class="high-concern">High Concern</th>
		<th class="critical">Critical</th>
		<th>Data deficient</th>
		<th>Trend</th>
		<th class="editIcons hideAdminAction">Edit</th>
	</tr>
<% 
if(lstData.size()==0){
	%>
	<tr>
	<td colspan=6 align="center"><span class="blankCellStyle">Add Current State and Trend of Values</span></td>
	
	
	</tr>
	<%
}
%>
<c:forEach items="<%=lstData %>" var="currtrend" varStatus="status">		
<%
	long rating = 0;
    AssessmentTrends ast = (AssessmentTrends)pageContext.getAttribute("currtrend");
	rating = ast.getCurrentstatetrend().getState_id();
	threatRating.setCssClass(rating);
//	if(ast.getCount()==1 && ast.isIs_Biodiv_value()){
	if(ast.isIs_Biodiv_value()){
		%>
		<tr>
			<th>No.</th>
			<th>Other Important Biodiversity Values</th>
			<th>Justification of Assessment</th>
			<th class="good">Good</th>
			<th class="low-concern">Low Concern</th>
			<th class="high-concern">High Concern</th>
			<th class="critical">Critical</th>
			<th>Data deficient</th>
			<th>Trend</th>
			<th class="editIcons hideAdminAction">Edit</th>
		</tr>
		<%
	}
	%>
	<tr id="${currtrend.getCurrentstatetrend().getState_trend_id()}_CST_TR">
		<td><c:out value="${currtrend.getCount()}"/></td>
		<td><c:out value="${currtrend.getWhvalue()}"/></td>
		<td id="${currtrend.getCurrentstatetrend().getState_trend_id()}_JF_TD"><c:out value="${currtrend.getCurrentstatetrend().getJustification()}"/></td>
		<c:forEach begin="1" end="5" varStatus="ratingIndex">
			<td id="${currtrend.getCurrentstatetrend().getState_trend_id()}_ST_TD" style="text-align: center">
				<c:set var="currentRating" value="<%= rating%>" />
				<c:if test="${ratingIndex.index == currentRating}">
					<span class="<%=threatRating.getCssClass() %>"></span>
				</c:if>
			</td>
		</c:forEach>
		<td id="${currtrend.getCurrentstatetrend().getState_trend_id()}_TR_TD"><c:out value="${currtrend.getTrend().getTrend()}"/></td>
		<td class="editIcons hideAdminAction">
			<div class="editDelete">
				<a href="#" onclick="javascript:dynamicPopup('${UpdateUrl}','${currtrend.getCurrentstatetrend().getState_trend_id()}','Edit Current State And Trend Of Values',event); return false;"
				   class="edit">edit</a>
			</div>
		</td>
	</tr>
</c:forEach>

	<%--<tr>--%>
		<%--<td colspan="2">Assessment of the current state and trend of World Heritage values</td>--%>
		<%--<td id="<%=state_trend_idwh %>_WJF_TD"><%= justificationwh%></td>--%>
		<%--<c:forEach begin="1" end="5" varStatus="ratingIndex">--%>
			<%--<td id="<%=state_trend_idwh %>_WST_TD">--%>
				<%--<c:set var="currentRating" value="<%= trendWhRating %>" />--%>
				<%--<c:if test="${ratingIndex.index == currentRating}">--%>
					<%--<span class="<%=threatRatingwh.getCssClass() %>"></span>--%>
				<%--</c:if>--%>
			<%--</td>--%>
		<%--</c:forEach>--%>
		<%--<td id="<%=state_trend_idwh %>_WTR_TD"><%=trendwh%></td>--%>
		<%--<td class="editIcons hideAdminAction">--%>
			<%--<div class="editDelete">--%>
				<%--<a href="#" onclick="javascript:dynamicPopup('${UpdateUrlwh}','<%=state_trend_idwh %>','Edit World Heritage values',event); return false;"--%>
				   <%--class="edit">edit</a>--%>
			<%--</div>--%>
		<%--</td>--%>
	<%--</tr>--%>

	<%--<tr>--%>
		<%--<th colspan="10">Addendum - other important biodiversity values</th>--%>
	<%--</tr>--%>

	<%--<tr>--%>
		<%--<td colspan="2">Assessment of the current state and trend of other important biodiversity values (if applicable)</td>--%>
		<%--<td id="<%= state_trend_idbio%>_BJF_TD"><%= justificationbio %></td>--%>
		<%--<c:forEach begin="1" end="5" varStatus="ratingIndex">--%>
			<%--<td id="<%=state_trend_idbio %>_BST_TD">--%>
				<%--<c:set var="currentRating" value="<%= trendBioRating %>"/>--%>
				<%--<c:if test="${ratingIndex.index == currentRating}">--%>
					<%--<span class="<%=threatRatingbio.getCssClass() %>"></span>--%>
				<%--</c:if>--%>
			<%--</td>--%>
		<%--</c:forEach>--%>
		<%--<td id="<%= state_trend_idbio%>_BTR_TD"><%=trendbio %></td>--%>
		<%--<td class="editIcons hideAdminAction">--%>
			<%--<div class="editDelete">--%>
				<%--<a href="#" onclick="javascript:dynamicPopup('${UpdateUrlbio}','<%= state_trend_idbio%>','Edit Important biodiversity values',event); return false;"--%>
				   <%--class="edit">edit</a>--%>
			<%--</div>--%>
		<%--</td>--%>
	<%--</tr>--%>
</tbody>
</table>
