<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.iucn.whp.dbservice.service.*"%>
<%@page import="com.iucn.whp.dbservice.model.*"%>
<%@page import="com.iucn.whp.dto.AssessmentTrends"%>
<!--mainBlock Starts Here-->
<portlet:resourceURL var="updateStatusStep4"/>
<div class="mainBlock siteInfoMainBlock">
		<div class="tableWrapper tableWrapperSiteInfoContacts">
		
			<div class="infoSection">
					<h2 class="siteAssessmentSubHeadings">Assessing The Current State And Trend Of Values
					</h2>
				<div class="tipsSection">
				<p class="tiptext">The current state of values is assessed against five ratings: Good, Low Concern, High Concern, Critical and Data Deficient . The baseline for the assessment should be the condition at the time of inscription, with reference to the best-recorded historical conservation state. Trend is assessed in relation to whether the condition of a value is Improving, Stable, Deteriorating or Data Deficient, and is intended to be snapshot of recent developments over the last five years.</p>
				</div>
					<div id="step4MainDiv" class="infoSectionContent">
					<jsp:include page="/assessment_jsp/innerJsp/step4_ctatv.jsp"></jsp:include>
					</div>
		    </div>
		<div class="infoSection">
					<h2 class="siteAssessmentSubHeadings">Summary of the Values
					</h2>
					<div id="step4whDiv" class="infoSectionContent"> 
					
					<jsp:include page="/assessment_jsp/innerJsp/step4_whvalue_overall.jsp"></jsp:include>
					
					</div>
		</div>
		  </div>


			<div class="wizardFooter">
			<a href="#" class="roundedcornerBTN" onclick="javascript:$('#step3').click();"><span>&#60;&#60; Previous</span></a>
			<a href="#" class="roundedcornerBTN" onclick="javascript:$('#step5').click();"><span>Next &#62;&#62;</span></a>
			</div>

</div>

<div class="buttonsSiteAssessment hideAdminAction">

<!-- <input type="button" value="Fill from previous assessment" /> -->
	
	<input type="button" value="View Differences" onClick="javascript: viewDiff_4();"/>
	<input type="button" value="Clear Highlights" onClick="javascript: removeDiff_4();"/>
	<jsp:include page="/assessment_jsp/tab_buttons.jsp" />

</div>
<script>

function viewDiff_4(){
	

	
	<%
	long prevAssesmentVersionId=0;
	long assesmentVersionId=Long.parseLong(request.getAttribute("versionId").toString());
	List<current_state_trend> lstcurrent_state_trend=null;
	List<current_state_trend> lstcurrent_state_trendPrev=null;
	List<AssessmentTrends> lstCurrentVersionData = new ArrayList<AssessmentTrends>();
	List<AssessmentTrends> lstPreviousVersionData = new ArrayList<AssessmentTrends>();
	List<state_trend_whvalues> lstCurstate_trendWH=null;
	List<state_trend_whvalues> lstPrevState_trendWH=null;
	List<state_trend_biodivvals> lstCurBiodivvals=null;
	List<state_trend_biodivvals> lstPrevBiodivvals=null;

	try{
		prevAssesmentVersionId=Long.parseLong(request.getAttribute("previousVersionId").toString());
		if(prevAssesmentVersionId>0){
			lstcurrent_state_trend = site_assessmentLocalServiceUtil.getCurrent_state_trendByVersion(assesmentVersionId);
			lstcurrent_state_trendPrev = site_assessmentLocalServiceUtil.getCurrent_state_trendByVersion(prevAssesmentVersionId);
			AssessmentTrends assessmentTrends = null;
			int j=0,k=0;
			if(lstcurrent_state_trend!=null && lstcurrent_state_trendPrev!=null){
				for(int i=0;i<lstcurrent_state_trend.size();i++){
					
					assessmentTrends=new AssessmentTrends();
					assessmentTrends.setCurrentstatetrend(lstcurrent_state_trend.get(i));
					if(lstcurrent_state_trend.get(i).getState_id()>0 && lstcurrent_state_trend.get(i).getTrend_id()>0){
						assessmentTrends.setState(state_lkpLocalServiceUtil.getstate_lkp(lstcurrent_state_trend.get(i).getState_id()));
						assessmentTrends.setTrend(trend_lkpLocalServiceUtil.gettrend_lkp(lstcurrent_state_trend.get(i).getTrend_id()));
					}
					if(lstcurrent_state_trend.get(i).isIs_biodiv_whval())
						assessmentTrends.setWhvalue(biodiversity_valuesLocalServiceUtil.getbiodiversity_values(lstcurrent_state_trend.get(i).getVn()).getValue());
						else assessmentTrends.setWhvalue(assessment_whvaluesLocalServiceUtil.getassessment_whvalues(lstcurrent_state_trend.get(i).getVn()).getValues());
						assessmentTrends.setCount(j+1);
					lstCurrentVersionData.add(assessmentTrends);
					
				} 
				for(int i=0;i<lstcurrent_state_trendPrev.size();i++){
						    		
					assessmentTrends=new AssessmentTrends();
					assessmentTrends.setCurrentstatetrend(lstcurrent_state_trendPrev.get(i));
					if(lstcurrent_state_trendPrev.get(i).getState_id()>0 && lstcurrent_state_trendPrev.get(i).getTrend_id()>0){
						assessmentTrends.setState(state_lkpLocalServiceUtil.getstate_lkp(lstcurrent_state_trendPrev.get(i).getState_id()));
						assessmentTrends.setTrend(trend_lkpLocalServiceUtil.gettrend_lkp(lstcurrent_state_trendPrev.get(i).getTrend_id()));
					}
					if(lstcurrent_state_trendPrev.get(i).isIs_biodiv_whval())
					assessmentTrends.setWhvalue(biodiversity_valuesLocalServiceUtil.getbiodiversity_values(lstcurrent_state_trendPrev.get(i).getVn()).getValue());
					else assessmentTrends.setWhvalue(assessment_whvaluesLocalServiceUtil.getassessment_whvalues(lstcurrent_state_trendPrev.get(i).getVn()).getValues());
					assessmentTrends.setCount(k+1);
					lstPreviousVersionData.add(assessmentTrends);
				}
			}
			ArrayList <String>trval=new ArrayList <String>();
		  	ArrayList <String>tdval=new ArrayList <String>();
	   
			 for (AssessmentTrends currSiteAssessment : lstCurrentVersionData) {
				 
				 boolean isSimilar_CST=false;
			 		for (AssessmentTrends prevSiteAssessment :lstPreviousVersionData ) {
	        		
		        	if (prevSiteAssessment.getWhvalue().equals(currSiteAssessment.getWhvalue())) {
		        		
		        		isSimilar_CST=true;
		        		
		        		if(prevSiteAssessment.getState()!=null && currSiteAssessment.getState()!=null )
		        		{
						if( prevSiteAssessment.getState().getState_id()!=currSiteAssessment.getState().getState_id()){ 
							 tdval.add(currSiteAssessment.getCurrentstatetrend().getState_trend_id()+"_ST_TD");
						}
		        		}
		        		else
		        		{
						 tdval.add(currSiteAssessment.getCurrentstatetrend().getState_trend_id()+"_ST_TD");
	
		        		}
		        		
		        		if(prevSiteAssessment.getTrend()!=null && currSiteAssessment.getTrend()!=null)
		        		{
		        				        		
						if(prevSiteAssessment.getTrend().getTrend_id()!=currSiteAssessment.getTrend().getTrend_id()){ 
							 tdval.add(currSiteAssessment.getCurrentstatetrend().getState_trend_id()+"_TR_TD");
						}
		        		}
		        		else
		        		{
							 tdval.add(currSiteAssessment.getCurrentstatetrend().getState_trend_id()+"_TR_TD");

		        		}
		        		
		        		if(prevSiteAssessment.getCurrentstatetrend().getJustification()!=null || currSiteAssessment.getCurrentstatetrend().getJustification()!=null )
		        		{
						if(!prevSiteAssessment.getCurrentstatetrend().getJustification().equals(currSiteAssessment.getCurrentstatetrend().getJustification())){ 
							 tdval.add(currSiteAssessment.getCurrentstatetrend().getState_trend_id()+"_JF_TD");
						}
		        		}
		        		else
		        		{
							 tdval.add(currSiteAssessment.getCurrentstatetrend().getState_trend_id()+"_TR_TD");

		        		}
		        		break;
		            }
	        	}
				if(!isSimilar_CST) {
					trval.add(currSiteAssessment.getCurrentstatetrend().getState_trend_id()+"_CST_TR");
				}
			 }

			 try{
			 	lstCurstate_trendWH = site_assessmentLocalServiceUtil.getState_trend_whvaluesByVersion(assesmentVersionId);
			 	lstCurBiodivvals = site_assessmentLocalServiceUtil.getStatetrendbiodivvalsByVersion(assesmentVersionId);
			 	lstPrevState_trendWH = site_assessmentLocalServiceUtil.getState_trend_whvaluesByVersion(prevAssesmentVersionId);
			 	lstPrevBiodivvals = site_assessmentLocalServiceUtil.getStatetrendbiodivvalsByVersion(prevAssesmentVersionId); 
			 	if(lstCurstate_trendWH!=null && lstCurstate_trendWH.size()>0 && lstPrevState_trendWH!=null && lstPrevState_trendWH.size()>0){	
			 		
			 	
				 		if(lstCurstate_trendWH.get(0).getState_id()!=lstPrevState_trendWH.get(0).getState_id())
				 			tdval.add(lstCurstate_trendWH.get(0).getState_trend_whval_id()+"_WST_TD");	
				 		if(lstCurstate_trendWH.get(0).getTrend_id()!=lstPrevState_trendWH.get(0).getTrend_id())
				 			tdval.add(lstCurstate_trendWH.get(0).getState_trend_whval_id()+"_WTR_TD");
				 		if(!lstCurstate_trendWH.get(0).getJustification().equals(lstPrevState_trendWH.get(0).getJustification()))
				 			tdval.add(lstCurstate_trendWH.get(0).getState_trend_whval_id()+"_WJF_TD");
			 	}
			 	if(lstCurBiodivvals!=null && lstCurBiodivvals.size()>0 && lstPrevBiodivvals!=null && lstPrevBiodivvals.size()>0){
				 		if(lstCurBiodivvals.get(0).getState_id()!=lstPrevBiodivvals.get(0).getState_id())
					 			tdval.add(lstCurBiodivvals.get(0).getState_trend_biodivvals_id()+"_BST_TD");	
				 		if(lstCurBiodivvals.get(0).getTrend_id()!=lstPrevBiodivvals.get(0).getTrend_id())
				 			tdval.add(lstCurBiodivvals.get(0).getState_trend_biodivvals_id()+"_BTR_TD");
				 		if(!lstCurBiodivvals.get(0).getJustification().equals(lstPrevBiodivvals.get(0).getJustification()))
				 			tdval.add(lstCurBiodivvals.get(0).getState_trend_biodivvals_id()+"_BJF_TD");
			 		
			 	}
			 }catch(Exception ex){
			 	
			 } 
			 if(trval.isEmpty() && tdval.isEmpty()){
				  double version_code = site_assessment_versionsLocalServiceUtil.getsite_assessment_versions(prevAssesmentVersionId).getVersion_code();
			 %>
				alert("There are no differences in this version of Step 4 with its previous version "+ <%= version_code%>+".");
				<% 
			 }
			 else {
				 if(trval.size()>0){
					 //TRgreen
					
					 for (String val : trval) {
						%>
									 $("tr[id='"+'<%=val%>'+"']").css("background-color", "#acdfa7");
						 <%
					}
					 			 
				 }
				 if(tdval.size()>0){
					 //TDorange
					
					 for (String val : tdval) {				 
						 %>
						 
						 $("td[id='"+'<%=val%>'+"']").css("background-color", "#FFCC66");
						 <%
						 
					}
					 
				 } 
			}
		 }else{
				%>
				alert("No Previous version available.");
				<%
			}
	}catch(Exception ex){
		ex.printStackTrace();
	}

	
	
		
	%>
}
function removeDiff_4(){
	$('#step4MainDiv tr:gt(0)').css("background", "none");
	$('#step4MainDiv tr:gt(0) td').css("background", "none");
	$('#step4whDiv tr:gt(0)').css("background", "none");
	$('#step4whDiv tr:gt(0) td').css("background", "none");
	
}
</script>