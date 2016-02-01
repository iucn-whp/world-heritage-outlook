<%@page import="com.iucn.whp.dto.AssessmentValueCssClass"%>
<%@page import="com.iucn.whp.dto.AssessmentTrends"%>
<%@include file="/init_import.jsp" %>
<%
List<current_state_trend> lstcurrent_state_trend=null;
List<AssessmentTrends> lstData = new ArrayList<AssessmentTrends>();
AssessmentValueCssClass threatRating = new AssessmentValueCssClass();
int whCount=0;
try{
	long assesmentVersionId=Long.parseLong(request.getAttribute("versionId").toString());
	lstcurrent_state_trend = site_assessmentLocalServiceUtil.getCurrent_state_trendByVersion(assesmentVersionId);
	AssessmentTrends assessmentTrends = null;
	 for(int i=0;i<lstcurrent_state_trend.size();i++){
		try{
			if(!lstcurrent_state_trend.get(i).getIs_biodiv_whval()){
				whCount++;
				assessmentTrends=new AssessmentTrends();
				assessmentTrends.setCurrentstatetrend(lstcurrent_state_trend.get(i));
				if(lstcurrent_state_trend.get(i).getState_id()>0 && lstcurrent_state_trend.get(i).getTrend_id()>0){
					assessmentTrends.setState(state_lkpLocalServiceUtil.getstate_lkp(lstcurrent_state_trend.get(i).getState_id()));
					assessmentTrends.setTrend(trend_lkpLocalServiceUtil.gettrend_lkp(lstcurrent_state_trend.get(i).getTrend_id()));
				}
				long valueId = lstcurrent_state_trend.get(i).getVn();
				assessmentTrends.setWhvalue(assessment_whvaluesLocalServiceUtil.getassessment_whvalues(valueId).getValues());
				assessmentTrends.setCount(whCount);
				assessmentTrends.setIs_Biodiv_value(false);
				lstData.add(assessmentTrends);
			}
    	}catch(Exception ex){
    		System.out.println("EXCEPTION:"+ ex.getStackTrace()+"------"+ex.getStackTrace());
    	}

	}
	 whCount=0;	 
	 for(int i=0;i<lstcurrent_state_trend.size();i++){
			try{
				if(lstcurrent_state_trend.get(i).getIs_biodiv_whval()){
					whCount++;
					assessmentTrends=new AssessmentTrends();
					assessmentTrends.setCurrentstatetrend(lstcurrent_state_trend.get(i));
					if(lstcurrent_state_trend.get(i).getState_id()>0 && lstcurrent_state_trend.get(i).getTrend_id()>0){
						assessmentTrends.setState(state_lkpLocalServiceUtil.getstate_lkp(lstcurrent_state_trend.get(i).getState_id()));
						assessmentTrends.setTrend(trend_lkpLocalServiceUtil.gettrend_lkp(lstcurrent_state_trend.get(i).getTrend_id()));
					}
					long valueId = lstcurrent_state_trend.get(i).getVn();
					assessmentTrends.setWhvalue(biodiversity_valuesLocalServiceUtil.getbiodiversity_values(valueId).getValue());
					assessmentTrends.setCount(whCount);
					assessmentTrends.setIs_Biodiv_value(true);
					lstData.add(assessmentTrends);
				}
	    	}catch(Exception ex){
	    		System.out.println("EXCEPTION:"+ ex.getStackTrace()+"------"+ex.getStackTrace());
	    	}

		}
	 
}catch(Exception ex){
	
}

%>
<c:set var="UpdateUrl" value="/assessment_jsp/popup/step4_ctatv_popup.jsp"/>
<c:set var="RefreshUrl" value="/assessment_jsp/innerJsp/step4_ctatv.jsp"/>
<c:set var="currentDiv" value="step4MainDiv"/> 

<table class="tab_data" cellpadding="0" cellspacing="0">
<tbody>
<tr>
<th>No.</th>
<th>World Heritage Values</th>
<th>Justification of Assessment</th>
<th>Assessment</th>
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
	String assessment="";
	AssessmentTrends ast = (AssessmentTrends)pageContext.getAttribute("currtrend");
	rating = ast.getCurrentstatetrend().getState_id();
	if(ast.getState()!=null)
		assessment = ast.getState().getState() ;
	threatRating.setCssClass(rating);
	if(ast.getCount()==1 && ast.isIs_Biodiv_value()){
		%>
		<tr>
			<th>No.</th>
			<th>Other Important Biodiversity Values</th>
			<th>Justification of Assessment</th>
			<th>Assessment</th>
			<th>Trend</th>
			<th class="editIcons hideAdminAction">Edit</th>
		</tr>
		<%
	}
	%>			
<tr id="${currtrend.getCurrentstatetrend().getState_trend_id()}_CST_TR">
<td><c:out value="${currtrend.getCount()}" /></td>
<td><c:out value="${currtrend.getWhvalue()}" /></td>
<td id="${currtrend.getCurrentstatetrend().getState_trend_id()}_JF_TD"><c:out value="${currtrend.getCurrentstatetrend().getJustification()}" /></td>
<td id="${currtrend.getCurrentstatetrend().getState_trend_id()}_ST_TD"><span class ="<%=threatRating.getCssClass() %>"><%=assessment %></span></td>
<td id="${currtrend.getCurrentstatetrend().getState_trend_id()}_TR_TD"><c:out value="${currtrend.getTrend().getTrend()}" /></td>
<td class="editIcons hideAdminAction">
<div class="editDelete">
<a href="#" onclick="javascript:dynamicPopup('${UpdateUrl}','${currtrend.getCurrentstatetrend().getState_trend_id()}','Edit Current State And Trend Of Values',event); return false;" class="edit">edit</a>
</div>
</td>
</tr>
<%

%>
</c:forEach> 
</tbody>
</table> 
