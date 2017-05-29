<%@page import="com.iucn.whp.dto.AssessmentValueCssClass"%>
<%@include file="/init_import.jsp" %>


<%
	/* long assessmentVersionId = 0;

	try {
		long assesmentVersionId = Long.parseLong(request.getAttribute(
				"versionId").toString());

	} catch (Exception e) {
		e.printStackTrace();
	} */

	String statewh = "";
	String justificationwh = "";

	String statebio = "";
	String justificationbio = null;

	String justificationcurrentthreat = null;
	String statecurrent = "";

	String justificationpotentialthreat = null;
	String statepotential = "";

	String justificationoverallthreat = null;
	String stateoverall = "";

	String justieffectivepromgmt = null;
	String stateeffectivepromgmt = " ";

	String justificationmgmtoverall = null;

	String statemgmtoverall = "";

	List<state_trend_whvalues> lstwh=null;
	
	List<state_trend_biodivvals> lstbio=null;
	
	
	List<threat_summary_current> lstthreat_current=null;
	
	List<threat_summary_potential> lstthreat__potential=null;
	
	List<threat_summary_overall> lstthreat_overall=null;
	
	List<effective_prot_mgmt_iothreats> lsteffectivet_iothreats=null;
	
	List<prot_mgmt_overall> lstprot_overall=null;
	AssessmentValueCssClass threatRatingwh = new AssessmentValueCssClass();
	AssessmentValueCssClass threatRatingbio = new AssessmentValueCssClass();
	AssessmentValueCssClass threatRatingtc = new AssessmentValueCssClass();
	AssessmentValueCssClass threatRatingtp = new AssessmentValueCssClass();
	AssessmentValueCssClass threatRatinget = new AssessmentValueCssClass();
	AssessmentValueCssClass threatRatingpm = new AssessmentValueCssClass();
	AssessmentValueCssClass threatRatingto = new AssessmentValueCssClass();
	
	try {
		long assesmentVersionId = Long.parseLong(request.getAttribute(
				"versionId").toString());
		 lstwh = site_assessmentLocalServiceUtil
				.getState_trend_whvaluesByVersion(assesmentVersionId);
		if (lstwh != null && lstwh.size() > 0) {
			justificationwh = lstwh.get(0).getJustification();
			long state = lstwh.get(0).getState_id();
			if(state>0){
				statewh = state_lkpLocalServiceUtil.getstate_lkp(
				lstwh.get(0).getState_id()).getState();
				threatRatingwh.setCssClass(lstwh.get(0).getState_id());
			}
		}

		
		lstbio = site_assessmentLocalServiceUtil
				.getStatetrendbiodivvalsByVersion(assesmentVersionId);
		if (lstbio != null && lstbio.size() > 0) {
			justificationbio = lstbio.get(0).getJustification();
			if (lstbio.get(0).getState_id() > 0){
				statebio = state_lkpLocalServiceUtil.getstate_lkp(
				lstbio.get(0).getState_id()).getState();
				threatRatingbio.setCssClass(lstbio.get(0).getState_id());
			}
		}

		
		lstthreat_current = site_assessmentLocalServiceUtil
				.getThreatSummaryCurrentByVersion(assesmentVersionId);
		if (lstthreat_current!=null && lstthreat_current.size() > 0) {
			justificationcurrentthreat = lstthreat_current.get(0)
					.getOverall_current();
			if(lstthreat_current.get(0).getThreat_rating()>0){
				statecurrent = threat_rating_lkpLocalServiceUtil
					.getthreat_rating_lkp(
							lstthreat_current.get(0).getThreat_rating())
					.getRating();
				threatRatingtc.setCssClass(lstthreat_current.get(0).getThreat_rating());
			}
		}

		
		lstthreat__potential = site_assessmentLocalServiceUtil
				.getThreatSummaryPotentialByVersion(assesmentVersionId);
		if (lstthreat__potential!=null && lstthreat__potential.size() > 0) {
			justificationpotentialthreat = lstthreat__potential.get(0)
					.getOverall_potential();
			if(lstthreat__potential.get(0).getThreat_rating()>0){
				statepotential = threat_rating_lkpLocalServiceUtil
						.getthreat_rating_lkp(lstthreat__potential.get(0)
										.getThreat_rating()).getRating();
				threatRatingtp.setCssClass(lstthreat__potential.get(0).getThreat_rating());
			}
		}

		
		 lstthreat_overall = site_assessmentLocalServiceUtil
				.getThreatSummaryOverallByVersion(assesmentVersionId);
		if (lstthreat_overall!=null && lstthreat_overall.size() > 0) {
			justificationoverallthreat = lstthreat_overall.get(0)
					.getOverall_threat();
			if(lstthreat_overall.get(0).getThreat_rating()>0){
				stateoverall = threat_rating_lkpLocalServiceUtil
					.getthreat_rating_lkp(
							lstthreat_overall.get(0).getThreat_rating()).getRating();
				threatRatingto.setCssClass(lstthreat_overall.get(0).getThreat_rating());
			}
		}

		
		
		 lsteffectivet_iothreats = effective_prot_mgmt_iothreatsLocalServiceUtil
				.geteffectivemanagthreatByVersion(assesmentVersionId);

		if (lsteffectivet_iothreats!=null && lsteffectivet_iothreats.size() > 0) {
			justieffectivepromgmt = lsteffectivet_iothreats.get(0)
					.getJustification();
			if(lsteffectivet_iothreats.get(0).getRating()>0){
				stateeffectivepromgmt = protection_management_ratings_lkpLocalServiceUtil
					.getprotection_management_ratings_lkp(
							lsteffectivet_iothreats.get(0).getRating())
					.getPm_rating();
				threatRatinget.setCssClass(lsteffectivet_iothreats.get(0).getRating());
			}
		}

		
		lstprot_overall = prot_mgmt_overallLocalServiceUtil
				.getprotmgmtoverallByVersion(assesmentVersionId);

		if (lstprot_overall!=null && lstprot_overall.size() > 0) {
			justificationmgmtoverall = lstprot_overall.get(0)
					.getJustification();
			if(lstprot_overall.get(0).getRating()>0){
				statemgmtoverall = protection_management_ratings_lkpLocalServiceUtil
					.getprotection_management_ratings_lkp(
							lstprot_overall.get(0).getRating())
					.getPm_rating();
				threatRatingpm.setCssClass(lstprot_overall.get(0).getRating());
			}
		}

	} catch (Exception ex) {

	}

%>






<table class="tab_data" cellpadding="0" cellspacing="0">
	<tbody>
		<tr>
			<th class="topics">Topics</th>
			<th class="justificationOfassessment">Justification Of
				Assessment</th>
			<th style="width:120px;" class="assessment">Assessment</th>
		</tr>
		<tr>
			<td>Current State Trend of World Heritage values</td>
			<%
			if(lstwh!=null && lstwh.size()>0){
            %> 
            <td  id="<%=lstwh.get(0).getState_trend_whval_id()%>ST_WHV_JS_TD"><%=justificationwh%></td>
			<td id="<%=lstwh.get(0).getState_trend_whval_id()%>ST_WHV_AS_TD"><span class ="<%=threatRatingwh.getCssClass() %>"><%=statewh %></span></td>
			<%}else {%>
			 <td></td>
			<td></td>
			<%}%>
		</tr>
		<tr>
			<td>Current state and trend of other important biodiversity
				values (if applicable)</td>
				<%
			if(lstbio!=null && lstbio.size()>0){
            %> 
			<td id="<%=lstbio.get(0).getState_trend_biodivvals_id()%>ST_BV_JS_TD"><%=justificationbio%></td>
			<td id="<%=lstbio.get(0).getState_trend_biodivvals_id()%>ST_BV_AS_TD"><span class ="<%=threatRatingbio.getCssClass() %>"><%=statebio %></span></td>
			<%}else {%>
			 <td></td>
			<td></td>
			<%}%>
		</tr>
		<tr>
			<td>Current threats</td>
			<%
			if(lstthreat_current!=null && lstthreat_current.size()>0){
            %> 
			<td id="<%=lstthreat_current.get(0).getThreat_sum_cur_id()%>TSC_JS_TD"><%=justificationcurrentthreat%></td>
			<td id="<%=lstthreat_current.get(0).getThreat_sum_cur_id()%>TSC_AS_TD"><span class ="<%=threatRatingtc.getCssClass() %>"><%=statecurrent %></span></td>
			<%}else {%>
			 <td></td>
			<td></td>
			<%}%>
		</tr>
		<tr>
			<td>Potential threats</td>
			<%
			if(lstthreat__potential!=null && lstthreat__potential.size()>0){
            %> 
			<td id="<%=lstthreat__potential.get(0).getThreat_sum_potential_id()%>TSP_JS_TD"><%=justificationpotentialthreat%></td>
			<td id="<%=lstthreat__potential.get(0).getThreat_sum_potential_id()%>TSP_AS_TD"><span class ="<%=threatRatingtp.getCssClass() %>"><%=statepotential %></span></td>
			<%}else {%>
			 <td></td>
			<td></td>
			<%}%>
		</tr>
		<tr>
			<td>Overall threats</td>
			<%
			if(lstthreat_overall!=null  && lstthreat_overall.size()>0){
            %> 
			<td id="<%=lstthreat_overall.get(0).getThreat_sum_overall_id()%>TSO_JS_TD"><%=justificationoverallthreat%></td>
			<td id="<%=lstthreat_overall.get(0).getThreat_sum_overall_id()%>TSO_AS_TD"><span class ="<%=threatRatingto.getCssClass() %>"><%=stateoverall %></span></td>
			<%}else {%>
			 <td></td>
			<td></td>
			<%}%>
		</tr>
		<tr>
			<td>Effectiveness of protection and management in addressing
				threats outside the site</td>
				<%
			if(lsteffectivet_iothreats!=null && lsteffectivet_iothreats.size()>0){
            %> 
			<td id="<%=lsteffectivet_iothreats.get(0).getId()%>EMP_JS_TD"><%=justieffectivepromgmt%></td>
			<td id="<%=lsteffectivet_iothreats.get(0).getId()%>EPM_RA_TD"><span class ="<%=threatRatinget.getCssClass() %>"><%=stateeffectivepromgmt %></span></td>
			<%}else {%>
			 <td></td>
			<td></td>
			<%}%>
		</tr>
		<tr>
			<td>Overall protection and management</td>
				<%
			if(lstprot_overall!=null && lstprot_overall.size()>0){
            %> 
			<td id="<%=lstprot_overall.get(0).getPmo_id()%>PMOA_JS_TD"><%=justificationmgmtoverall%></td>
			<td id="<%=lstprot_overall.get(0).getPmo_id()%>PMOA_RA_TD"><span class ="<%=threatRatingpm.getCssClass() %>"><%=statemgmtoverall %></span></td>
			<%}else {%>
			 <td></td>
			<td></td>
			<%}%>
		</tr>
	</tbody>
</table>