<!--mainBlock Starts Here-->
<%@include file="/init_import.jsp" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>


<portlet:resourceURL var="updateStatusStep2"/>
<div class="mainBlock siteInfoMainBlock">
<div class="tableWrapper tableWrapperSiteInfoContacts">

	<div class="infoSection">
	
	<h2 class="siteAssessmentSubHeadings">Current Threats
	<a href="#" onclick= "javascript:dynamicPopup('/assessment_jsp/popup/step2_current_threat.jsp','','Add Current Threats',event); return false;" class="addBtn hideAdminAction">+Add Current Threats</a>
	</h2>
	<div class="tipsSection">
		<p class="tiptext">Threats corresponding to selected heritage site are identified and are then cross-referenced to the values they affect. Threats are then assessed against five assessment ratings - Very Low Threat, Low Threat, High Threat, Very High Threat, and Data Deficient. The justification for the assessment is also captured in threat assessment.</p>
		</div>
	<div id="step2ctDiv" class="infoSectionContent">
	<jsp:include page="/assessment_jsp/innerJsp/step2_ct.jsp"></jsp:include>
	
	</div>
	
	</div>


	<div class="infoSection">
	<h2 class="siteAssessmentSubHeadings">Potential Threats
	<a href="#" onclick="javascript:dynamicPopup('/assessment_jsp/popup/step2_potential_threat.jsp','','Add Potential Threats',event); return false;" class="addBtn hideAdminAction">+Add Potential Threats</a>
	</h2>
	<div class="tipsSection">
		<!-- <p class="tiptext"></p> -->
		</div>
	
		<div id="step2ptDiv" class="infoSectionContent">
		<jsp:include page="/assessment_jsp/innerJsp/step2_pt.jsp"></jsp:include>
		</div>
	
	</div>

	<div class="infoSection">
	<h2 class="siteAssessmentSubHeadings">Overall Assessment of Threats</h2>
	<div class="tipsSection">
		<!-- <p class="tiptext">Threats are identified in column 1 and are then cross-referenced to the values they affect in column 2 (using the references Vx, V1, V2 etc). Threats are then assessed against five assessment ratings - Very Low Threat, Low Threat, High Threat, Very High Threat, and Data Deficient - in columns 4-8 (these ratings are defined in Table 2.1 of the Guidelines). The justification for the assessment is presented in column 3 and referenced, e.g. (SOC report, 2009).</p> -->
		</div>
	
		<div id="step2oltDiv" class="infoSectionContent">
		<jsp:include page="/assessment_jsp/innerJsp/step2_ot.jsp"></jsp:include>
		
		</div>
	
	</div>


</div>


		<div class="wizardFooter">
		<a href="#" class="roundedcornerBTN" onclick="javascript:$('#step1').click();"><span>&#60;&#60; Previous</span></a>
		<a href="#" class="roundedcornerBTN" onclick="javascript:$('#step3').click();"><span>Next &#62;&#62;</span></a>
		</div>
	

</div>


<div class="buttonsSiteAssessment hideAdminAction">
	 <!-- <input type="button" value="Fill from previous assessment" /> -->
	
	<input type="button" value="View Differences" onClick="javascript: viewDiff_2();"/>
	<input type="button" value="Clear Highlights" onClick="javascript: removeDiff_2();"/>
	<jsp:include page="/assessment_jsp/tab_buttons.jsp" />
</div>
<script type="text/javascript">


$(document).ready(function(){  
    $("#<portlet:namespace/>tabs1.aui-tab").click(function(){
      alert($('a',this).html());
  }); 

});

 function viewDiff_2(){

	<%
	List<assessing_threats_current> lstthreats_current_curr=null;
	List<assessing_threats_current> lstthreats_current_prev=null;
	List<assessing_threats_potential> lstthreats_potential_curr=null;
	List<assessing_threats_potential> lstthreats_potential_prev=null;
	List<threat_summary_current> lstSummary_current_curr=null;
	List<threat_summary_current> lstSummary_current_prev=null;
	List<threat_summary_potential> lstSummary_potential_curr=null;
	List<threat_summary_potential> lstSummary_potential_prev=null;
	List<threat_summary_overall> lstSummary_overall_curr=null;
	List<threat_summary_overall> lstSummary_overall_prev=null;
	long prevAssesmentVersionId=0;
	long assessmentId=0;
  	ArrayList <String>trval=new ArrayList <String>();
  	ArrayList <String>tdval=new ArrayList <String>();
  	ArrayList <String>trcatval=new ArrayList <String>(); 

	try{
		long assesmentVersionId=Long.parseLong(request.getAttribute("versionId").toString());
		prevAssesmentVersionId = Long.parseLong(request.getAttribute("previousVersionId").toString());
		lstthreats_current_curr = site_assessmentLocalServiceUtil.getAssessingThreatsCurrentByVersion(assesmentVersionId);
		lstthreats_potential_curr = site_assessmentLocalServiceUtil.getAssessingThreatsPotentialByVersion(assesmentVersionId);
		lstSummary_current_curr = site_assessmentLocalServiceUtil.getThreatSummaryCurrentByVersion(assesmentVersionId);
		lstSummary_potential_curr = site_assessmentLocalServiceUtil.getThreatSummaryPotentialByVersion(assesmentVersionId);
		lstSummary_overall_curr = site_assessmentLocalServiceUtil.getThreatSummaryOverallByVersion(assesmentVersionId);
		
	}catch(Exception e){
		
	}
	if(prevAssesmentVersionId>0){
		lstthreats_current_prev = site_assessmentLocalServiceUtil.getAssessingThreatsCurrentByVersion(prevAssesmentVersionId);
		lstthreats_potential_prev = site_assessmentLocalServiceUtil.getAssessingThreatsPotentialByVersion(prevAssesmentVersionId);
		
		if(lstthreats_current_curr!=null && lstthreats_current_prev!=null){
			for (assessing_threats_current currSiteAssessment : lstthreats_current_curr) {
				 
				boolean isSimilar_curr_threat=false;
				 
			 	for (assessing_threats_current prevSiteAssessment :lstthreats_current_prev ) {
			 			 
		        	if (prevSiteAssessment.getCurrent_threat().equals(currSiteAssessment.getCurrent_threat())) {
		        		
		        		isSimilar_curr_threat=true;
		        		
		        		
		        		if (prevSiteAssessment.getInside_site()!=currSiteAssessment.getInside_site()) {
		        			
		        			tdval.add(currSiteAssessment.getCurrent_threat_id()+"_CT_IN_TD");
		        		}
		        		
						if (prevSiteAssessment.getOutside_site()!=currSiteAssessment.getOutside_site()) {
		        			
							tdval.add(currSiteAssessment.getCurrent_threat_id()+"_CT_OUT_TD");
		        		}
						
						if (!prevSiteAssessment.getJustification().equals(currSiteAssessment.getJustification())) {
							tdval.add(currSiteAssessment.getCurrent_threat_id()+"_CT_JF_TD");
		        		}
						
						if (prevSiteAssessment.getThreat_rating_id()!=currSiteAssessment.getThreat_rating_id()) {
							tdval.add(currSiteAssessment.getCurrent_threat_id()+"_CT_RT_TD");
		        		}
		        		
						/******************************Category and WH Values*************************************/
						long current_threat_id =currSiteAssessment.getCurrent_threat_id();
						long previous_threat_id =prevSiteAssessment.getCurrent_threat_id();
						List<current_threat_assessment_cat> lstCurrentThreat_assessment_cat = site_assessmentLocalServiceUtil.getCurrentThreatAssessmentCatByThreatId(current_threat_id);
						List<current_threat_values> lstCurrentThreat_values = site_assessmentLocalServiceUtil.getCurrentlThreatValuesByThreatId(current_threat_id);
						List<current_threat_assessment_cat> lstPreviousThreat_assessment_cat = site_assessmentLocalServiceUtil.getCurrentThreatAssessmentCatByThreatId(previous_threat_id);
						List<current_threat_values> lstPreviousThreat_values = site_assessmentLocalServiceUtil.getCurrentlThreatValuesByThreatId(previous_threat_id);
						List<String> lstCurrentWHValues = new ArrayList<String>();
						List<String> lstPreviousWHValues = new ArrayList<String>();
						if(lstCurrentThreat_values!=null && lstPreviousThreat_values!=null){
							for(current_threat_values threatValue:lstCurrentThreat_values){
								boolean whVal = false;
								if(!threatValue.getIs_biodiv_whval()){
									for(current_threat_values threatValuePrev:lstPreviousThreat_values){
										if(!threatValuePrev.getIs_biodiv_whval()){
											String currVal=assessment_whvaluesLocalServiceUtil.getassessment_whvalues(threatValue.getWhvalues_id()).getValues();
											String prevVal=assessment_whvaluesLocalServiceUtil.getassessment_whvalues(threatValuePrev.getWhvalues_id()).getValues();
											if(currVal.equals(prevVal)){
												whVal=true;
												break;
											}
										}
									}
								}else{
									for(current_threat_values threatValuePrev:lstPreviousThreat_values){
										if(threatValuePrev.getIs_biodiv_whval()){
											String currVal=biodiversity_valuesLocalServiceUtil.getbiodiversity_values(threatValue.getWhvalues_id()).getValue();
											String prevVal=biodiversity_valuesLocalServiceUtil.getbiodiversity_values(threatValuePrev.getWhvalues_id()).getValue();
											if(currVal.equals(prevVal)){
												whVal=true;
												break;
											}
										}
									}
								}
								if(!whVal){
									tdval.add(currSiteAssessment.getCurrent_threat_id()+"_CT_WH_TD");
									break;
								}
							}
						}
						
						
						
						
						if(lstCurrentThreat_assessment_cat!=null && lstPreviousThreat_assessment_cat!=null){
							
							List<Long> lstsubtype= new ArrayList<Long>();
							List<Long> lstcattype= new ArrayList<Long>();
							
							for(  current_threat_assessment_cat obj :lstCurrentThreat_assessment_cat)
						    {
						    	
						    	lstsubtype.add(obj.getSub_cat_id());
						    }
						 
							for(  current_threat_assessment_cat obj :lstCurrentThreat_assessment_cat)
						    {
						    	
								lstcattype.add(obj.getCategory_id());
						    }
							
							
							for(current_threat_assessment_cat threatAssesCat:lstCurrentThreat_assessment_cat){
								boolean isThreatCat = false;
								boolean isThreatSubCat = false;
								
								
								
								for(current_threat_assessment_cat threatAssesPrevCat:lstPreviousThreat_assessment_cat){
									
									if(!lstcattype.contains(threatAssesPrevCat.getCategory_id()))
									{
										tdval.add(currSiteAssessment.getCurrent_threat_id()+"_"+threatAssesCat.getCategory_id()+"_CAT_CT_TD");
									}
									if(threatAssesCat.getCategory_id()==threatAssesPrevCat.getCategory_id()){
										isThreatCat= true;
										/* if(threatAssesCat.getSub_cat_id()==threatAssesPrevCat.getSub_cat_id()){
											isThreatSubCat = true;
											break;
										} */
										
										if(!lstsubtype.contains(threatAssesPrevCat.getSub_cat_id()))
										{
											isThreatSubCat=true;
										}
										
									}
								}
								if(isThreatSubCat){
									tdval.add(currSiteAssessment.getCurrent_threat_id()+"_"+threatAssesCat.getCategory_id()+"_"+threatAssesCat.getSub_cat_id()+"_SUBCAT_CT_TD");
								}
								if(!isThreatCat){
									tdval.add(currSiteAssessment.getCurrent_threat_id()+"_"+threatAssesCat.getCategory_id()+"_CAT_CT_TD");
									
								}
								
							}
						}
		        	}
		      		}
		 		if(!isSimilar_curr_threat){
					trval.add(currSiteAssessment.getCurrent_threat_id()+"_CT_TR");
		      	 
		 		}
			}
		}
		
		if(lstthreats_potential_curr!=null && lstthreats_potential_prev!=null){
			for (assessing_threats_potential currSiteAssessment : lstthreats_potential_curr) {
				 
				boolean isSimilar_curr_threat=false;
				 
			 	for (assessing_threats_potential prevSiteAssessment :lstthreats_potential_prev ) {
			 			 
		        	if (prevSiteAssessment.getPotential_threat().equals(currSiteAssessment.getPotential_threat())) {
		        		
		        		isSimilar_curr_threat=true;
		        		
		        		
		        		if (prevSiteAssessment.getInside_site()!=currSiteAssessment.getInside_site()) {
		        			
		        			tdval.add(currSiteAssessment.getPotential_threat_id()+"_PT_IN_TD");
		        		}
		        		
						if (prevSiteAssessment.getOutside_site()!=currSiteAssessment.getOutside_site()) {
		        			
							tdval.add(currSiteAssessment.getPotential_threat_id()+"_PT_OUT_TD");
		        		}
						
						if (!prevSiteAssessment.getJustification().equals(currSiteAssessment.getJustification())) {
							tdval.add(currSiteAssessment.getPotential_threat_id()+"_PT_JF_TD");
		        		}
						
						if (prevSiteAssessment.getThreat_rating()!=currSiteAssessment.getThreat_rating()) {
							tdval.add(currSiteAssessment.getPotential_threat_id()+"_PT_RT_TD");
		        		}
		        		
						/******************************Category and WH Values*************************************/
						long current_threat_id =currSiteAssessment.getPotential_threat_id();
						long previous_threat_id =prevSiteAssessment.getPotential_threat_id();
						List<potential_threat_assessment_cat> lstCurrentThreat_assessment_cat = site_assessmentLocalServiceUtil.getPotentialThreatAssessmentCatByThreatId(current_threat_id);
						List<potential_threat_values> lstCurrentThreat_values = site_assessmentLocalServiceUtil.getPotentialThreatValuesByThreatId(current_threat_id);
						List<potential_threat_assessment_cat> lstPreviousThreat_assessment_cat = site_assessmentLocalServiceUtil.getPotentialThreatAssessmentCatByThreatId(previous_threat_id);
						List<potential_threat_values> lstPreviousThreat_values = site_assessmentLocalServiceUtil.getPotentialThreatValuesByThreatId(previous_threat_id);
						List<String> lstCurrentWHValues = new ArrayList<String>();
						List<String> lstPreviousWHValues = new ArrayList<String>();
						if(lstCurrentThreat_values!=null && lstPreviousThreat_values!=null){
							for(potential_threat_values threatValue:lstCurrentThreat_values){
								boolean whVal = false;
								if(!threatValue.getIs_biodiv_whval()){
									for(potential_threat_values threatValuePrev:lstPreviousThreat_values){
										if(!threatValuePrev.getIs_biodiv_whval()){
											String currVal=assessment_whvaluesLocalServiceUtil.getassessment_whvalues(threatValue.getWhvalues_id()).getValues();
											String prevVal=assessment_whvaluesLocalServiceUtil.getassessment_whvalues(threatValuePrev.getWhvalues_id()).getValues();
											if(currVal.equals(prevVal)){
												whVal=true;
												break;
											}
										}
									}
								}else{
									for(potential_threat_values threatValuePrev:lstPreviousThreat_values){
										if(threatValuePrev.getIs_biodiv_whval()){
											String currVal=biodiversity_valuesLocalServiceUtil.getbiodiversity_values(threatValue.getWhvalues_id()).getValue();
											String prevVal=biodiversity_valuesLocalServiceUtil.getbiodiversity_values(threatValuePrev.getWhvalues_id()).getValue();
											if(currVal.equals(prevVal)){
												whVal=true;
												break;
											}
										}
									}
								}
								if(!whVal){
									tdval.add(currSiteAssessment.getPotential_threat_id()+"_PT_WH_TD");
									break;
								}
							}
						}
						if(lstCurrentThreat_assessment_cat!=null && lstPreviousThreat_assessment_cat!=null){
							for(potential_threat_assessment_cat threatAssesCat:lstCurrentThreat_assessment_cat){
								boolean isThreatCat = false;
								boolean isThreatSubCat = false;

								for(potential_threat_assessment_cat threatAssesPrevCat:lstPreviousThreat_assessment_cat){
									if(threatAssesCat.getCategory_id()==threatAssesPrevCat.getCategory_id()){
										isThreatCat= true;
										if(threatAssesCat.getSub_cat_id()==threatAssesPrevCat.getSub_cat_id()){
											isThreatSubCat = true;
											break;
										}
									}
								}
								if(!isThreatSubCat){
									tdval.add(currSiteAssessment.getPotential_threat_id()+"_"+threatAssesCat.getCategory_id()+"_"+threatAssesCat.getSub_cat_id()+"_SUBCAT_PT_TD");
								}
								if(!isThreatCat){
									tdval.add(currSiteAssessment.getPotential_threat_id()+"_"+threatAssesCat.getCategory_id()+"_CAT_PT_TR");
									
								}
								
							}
						}
		        	}
		      	}
		 		if(!isSimilar_curr_threat){
					trval.add(currSiteAssessment.getPotential_threat_id()+"_PT_TR");
		 		}
			}
			if(lstSummary_current_curr!=null && !lstSummary_current_curr.isEmpty()){
				lstSummary_current_prev = site_assessmentLocalServiceUtil.getThreatSummaryCurrentByVersion(prevAssesmentVersionId);
				if(lstSummary_current_prev!=null && !lstSummary_current_prev.isEmpty()){
					if(!lstSummary_current_curr.get(0).getOverall_current().equalsIgnoreCase(lstSummary_current_prev.get(0).getOverall_current()))
						tdval.add(lstSummary_current_curr.get(0).getThreat_sum_cur_id()+"_SC_JF_TD");
					if(lstSummary_current_curr.get(0).getThreat_rating()!=lstSummary_current_prev.get(0).getThreat_rating())
						tdval.add(lstSummary_current_curr.get(0).getThreat_sum_cur_id()+"_SC_RT_TD");
				}
			}
			if(lstSummary_potential_curr!=null && !lstSummary_potential_curr.isEmpty()){
				lstSummary_potential_prev = site_assessmentLocalServiceUtil.getThreatSummaryPotentialByVersion(prevAssesmentVersionId);
				if(lstSummary_current_prev!=null && !lstSummary_potential_prev.isEmpty()){
					if(!lstSummary_potential_curr.get(0).getOverall_potential().equalsIgnoreCase(lstSummary_potential_prev.get(0).getOverall_potential()))
						tdval.add(lstSummary_potential_curr.get(0).getThreat_sum_potential_id()+"_SP_JF_TD");
					if(lstSummary_potential_curr.get(0).getThreat_rating()!=lstSummary_potential_prev.get(0).getThreat_rating())
						tdval.add(lstSummary_potential_curr.get(0).getThreat_sum_potential_id()+"_SP_RT_TD");
					
				}
			}
			if(lstSummary_overall_curr!=null && !lstSummary_overall_curr.isEmpty()){
				lstSummary_overall_prev = site_assessmentLocalServiceUtil.getThreatSummaryOverallByVersion(prevAssesmentVersionId);
				if(lstSummary_current_prev!=null && !lstSummary_current_prev.isEmpty()){
					if(!lstSummary_overall_curr.get(0).getOverall_threat().equalsIgnoreCase(lstSummary_overall_prev.get(0).getOverall_threat()))
						tdval.add(lstSummary_overall_curr.get(0).getThreat_sum_overall_id()+"_SO_JF_TD");
					if(lstSummary_overall_curr.get(0).getThreat_rating()!=lstSummary_overall_prev.get(0).getThreat_rating())
						tdval.add(lstSummary_overall_curr.get(0).getThreat_sum_overall_id()+"_SO_RT_TD");
				}
			}
		}
		if(trval.isEmpty() && tdval.isEmpty()){
		    double version_code = site_assessment_versionsLocalServiceUtil.getsite_assessment_versions(prevAssesmentVersionId).getVersion_code();
			 %>
				alert("There are no differences in this version of Step 2 with its previous version "+ <%= version_code%>+".");
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
			 if(trcatval.size()>0){
				//TRorange
				 for (String val1 : trcatval) {				 
					
					%>
					 								 
					 $("tr[id='"+'<%=val1%>'+"']").css("background-color", "#FFCC66");
					 <%
				 }
			}
		 }
		} else{
			%>
			alert("No Previous version available.");
			<%
		}
	%>
}


function removeDiff_2(){
	$('#step2ctDiv tr:gt(0)').css("background", "none");
	$('#step2ctDiv tr:gt(0) td').css("background", "none");
	$('#step2ptDiv tr:gt(0)').css("background", "none");
	$('#step2ptDiv tr:gt(0) td').css("background", "none");
	$('#step2oltDiv tr:gt(0)').css("background", "none");
	$('#step2oltDiv tr:gt(0) td').css("background", "none");
	
}
</script>
 