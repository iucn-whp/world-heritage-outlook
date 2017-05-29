<%@include file="/init.jsp" %>
<%
    Long currentAssessmentId = ParamUtil.getLong(request, "assesmentId");
%>

<div class="mainBlock siteInfoMainBlock">
<div class="tableWrapper tableWrapperSiteInfoContacts">


<div id="outerstep5Div">

		<div class="infoSection">
		<h2 class="siteAssessmentSubHeadings">Summary of Assessments of Values, Threats, and Protection and Management</h2>
		<div class="tipsSection">
			<p class="tiptext">
				Indicate the conservation outlook for the World Heritage site in the table below,
				based on the assessments of current state and trend of World Heritage values, threats, and protection and management
				for the site (Steps 1-4). Conservation Outlook is assessed against five ratings: Good, Good with Some Concerns,
				Significant Concern, Critical, and Data Deficient. The Guidelines provide further details on how each category is defined.
				Please note, the "Summary of Assessments of Values, Threats, and Protection and Management" table containing
				the "Justification Of Assessment" and "Assessment" fields has been automatically populated in this table from the
				previous assessment steps and only the "Assessment of Conservation Outlook" table is new. The assessment summaries
				and Conservation Outlook should be as detailed and stand-alone as possible.
				<a target="_blank" href="<%= themeDisplay.getURLPortal().concat("/")
            .concat("IUCN-Site-Assessment-portlet/Guidelines_IUCN_Conservation_Outlook_Assessments_Version_2_0_FINAL.pdf") %>">Access Guidelines for this Step.</a>
			</p>
		</div>
		<div id="step5Div" class="infoSectionContent">
		<jsp:include page="/assessment_jsp/innerJsp/step5_assess_outlook.jsp"></jsp:include>
		</div>
		</div>


</div>

		<div class="infoSection">
		<h2 class="siteAssessmentSubHeadings">Assessment of Conservation Outlook </h2>
		<div class="tipsSection">
		<!-- <p class="tiptext">Help Text Comes Here.</p> -->
		</div>
		<div id="step5bDiv" class="infoSectionContent">
		<jsp:include page="/assessment_jsp/innerJsp/step5_cons_outlook.jsp"></jsp:include>
		</div>
		</div>


</div>

		<div class="wizardFooter">
			<a href="#" class="roundedcornerBTN" onclick="javascript:$('#step4').click();"><span>&#60;&#60; Previous</span></a>
			<a href="#" class="roundedcornerBTN" onclick="javascript:$('#step7').click();"><span>Save and continue &#62;&#62;</span></a>
			</div>

</div>
<%--
<div class="buttonsSiteAssessment hideAdminAction">
	<%@include file="/assessment_jsp/tab_step9_buttons.jsp" %>

	<c:if test="<%= AssessmentActionUtil.hasLinkVisible(currentAssessmentId, user.getUserId(), AssessmentContstant.ACTION_VIEW_DIFFERENCES) %>">
		<input type="button" value="View Differences" onClick="javascript: viewDiff_5();"/>
	</c:if>
	<c:if test="<%= AssessmentActionUtil.hasLinkVisible(currentAssessmentId, user.getUserId(), AssessmentContstant.ACTION_CLEAR_HIGHLIGHTS) %>">
		<input type="button" value="Clear Highlights" onClick="javascript: removeDiff_5();"/>
	</c:if>
</div>--%>


<script type="text/javascript">


function viewDiff_5(){

	<%
	
	
	
	List<conservation_outlook>  lstconservation_out_curr =null;
	List<conservation_outlook>  lstconservation_out_prev =null;

	

	List<prot_mgmt_overall> listprot_overall_curr =null; 
	List<prot_mgmt_overall> listprot_overall_prev =null;

	List<effective_prot_mgmt_iothreats> listeffective_prot_mgmt_io_curr=null;
	List<effective_prot_mgmt_iothreats> listeffective_prot_mgmt_io_prev=null;


	List<threat_summary_current> listSummary_current_curr=null;
	List<threat_summary_current> listSummary_current_prev=null;

	List<threat_summary_potential> listSummary_potential_curr=null;
	List<threat_summary_potential> listSummary_potential_prev=null;

	List<threat_summary_overall> listthrtSummary_overall_curr=null;
	List<threat_summary_overall> listthrtSummary_overall_prev=null;



	List<state_trend_biodivvals> lststate_trend_biodivvals_curr=null;
	List<state_trend_biodivvals> lststate_trend_biodivvals_prev=null;


	List<state_trend_whvalues> liststate_trend_whvalues_curr=null;
	List<state_trend_whvalues> liststate_trend_whvalues_prev=null;

	
	
	

	long prevAssesmentVersionId=0;
	
	long assesmentVersionId=Long.parseLong(request.getAttribute("versionId").toString());
	lstconservation_out_curr=conservation_outlookLocalServiceUtil.getconservationOutllokByVersion(assesmentVersionId);
	
	liststate_trend_whvalues_curr = site_assessmentLocalServiceUtil.getState_trend_whvaluesByVersion(assesmentVersionId);
	lststate_trend_biodivvals_curr = site_assessmentLocalServiceUtil.getStatetrendbiodivvalsByVersion(assesmentVersionId);
	
	
	
	listSummary_current_curr = site_assessmentLocalServiceUtil.getThreatSummaryCurrentByVersion(assesmentVersionId);
	listSummary_potential_curr = site_assessmentLocalServiceUtil.getThreatSummaryPotentialByVersion(assesmentVersionId);
	listthrtSummary_overall_curr = site_assessmentLocalServiceUtil.getThreatSummaryOverallByVersion(assesmentVersionId);

	
	listeffective_prot_mgmt_io_curr= effective_prot_mgmt_iothreatsLocalServiceUtil.geteffectivemanagthreatByVersion(assesmentVersionId);
	
	listprot_overall_curr=prot_mgmt_overallLocalServiceUtil.getprotmgmtoverallByVersion(assesmentVersionId);

	try{
		
		prevAssesmentVersionId=Long.parseLong(request.getAttribute("previousVersionId").toString());
		
	}catch(Exception e)
	{
		
		e.printStackTrace();
	}
	
	
	if(prevAssesmentVersionId>0)
	{
		
		try
		{
			
			lstconservation_out_prev=conservation_outlookLocalServiceUtil.getconservationOutllokByVersion(prevAssesmentVersionId);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	
		
		
		

	   ArrayList <String>tdval=new ArrayList <String>();
	   try{
		   if(lstconservation_out_curr!=null && lstconservation_out_prev!=null )
		   {
		   if(!lstconservation_out_curr.isEmpty() && !lstconservation_out_prev.isEmpty() &&  lstconservation_out_prev.size()>0)
		   {
		   
		if(!lstconservation_out_curr.get(0).getJustification().equals(lstconservation_out_prev.get(0).getJustification()))
			tdval.add(lstconservation_out_curr.get(0).getConservation_outlook_id()+"_JF_TD");
		if(lstconservation_out_curr.get(0).getRating()!=lstconservation_out_prev.get(0).getRating())
			tdval.add(lstconservation_out_curr.get(0).getConservation_outlook_id()+"_RT_TD");
		   
		   }
	}
	   }catch(Exception ex){
		   
	   }
	
	  

	   // State And Trend Of Values
	   
	   if(liststate_trend_whvalues_curr!=null && !liststate_trend_whvalues_curr.isEmpty())
	   {
		   
		   liststate_trend_whvalues_prev = site_assessmentLocalServiceUtil.getState_trend_whvaluesByVersion(prevAssesmentVersionId);
		 
		   if(liststate_trend_whvalues_prev!=null && liststate_trend_whvalues_prev.size()>0 && !liststate_trend_whvalues_prev.isEmpty())
		   {
			   if(!liststate_trend_whvalues_prev.get(0).getJustification().equalsIgnoreCase(liststate_trend_whvalues_curr.get(0).getJustification()))
			   {
				   tdval.add(liststate_trend_whvalues_curr.get(0).getState_trend_whval_id()+"ST_WHV_JS_TD");
			   }
			   
			   if(liststate_trend_whvalues_prev.get(0).getState_id()!=liststate_trend_whvalues_curr.get(0).getState_id())
			   {
				   tdval.add(liststate_trend_whvalues_curr.get(0).getState_trend_whval_id()+"ST_WHV_AS_TD");
			   }
		   }
		 
	   }
	   
	   
	// State And Trend Of Values
	   
	   if(lststate_trend_biodivvals_curr!=null && !lststate_trend_biodivvals_curr.isEmpty() )
	   {
		   
		   lststate_trend_biodivvals_prev=site_assessmentLocalServiceUtil.getStatetrendbiodivvalsByVersion(prevAssesmentVersionId);
		   
		   if(lststate_trend_biodivvals_prev!=null && lststate_trend_biodivvals_prev.size()>0 &&!lststate_trend_biodivvals_prev.isEmpty())
		   {
			   if(!lststate_trend_biodivvals_prev.get(0).getJustification().equalsIgnoreCase(lststate_trend_biodivvals_curr.get(0).getJustification()))
			   {
					 tdval.add(lststate_trend_biodivvals_curr.get(0).getState_trend_biodivvals_id()+"ST_BV_JS_TD");

			   }
			   
			   if(lststate_trend_biodivvals_prev.get(0).getState_id()!=lststate_trend_biodivvals_curr.get(0).getState_id())
			   {
				   tdval.add(lststate_trend_biodivvals_curr.get(0).getState_trend_biodivvals_id()+"ST_BV_AS_TD");
				   
			   }
		   }
	   }
	   
	   
	   
	  
	   
         //current  Threat summary 

		 
	     if(listSummary_current_curr!=null && !listSummary_current_curr.isEmpty())
		 {
	    	 listSummary_current_prev=site_assessmentLocalServiceUtil.getThreatSummaryCurrentByVersion(prevAssesmentVersionId);
	    	if(listSummary_current_prev!=null && listSummary_current_prev.size()>0) {
	    if(!listSummary_current_prev.get(0).getOverall_current().equalsIgnoreCase(listSummary_current_curr.get(0).getOverall_current()))
	    {
	    	  tdval.add(listSummary_current_curr.get(0).getThreat_sum_cur_id()+"TSC_JS_TD");
	    }
	    
	    if(listSummary_current_prev.get(0).getThreat_rating()!=listSummary_current_curr.get(0).getThreat_rating())
	    {
	    	  tdval.add(listSummary_current_curr.get(0).getThreat_sum_cur_id()+"TSC_AS_TD");
	    }
		 } 
		 }
	   
		 
	     //potential  Threat summary
	     
		 
	     if(listSummary_potential_curr!=null && !listSummary_potential_curr.isEmpty())
	     {
	    	 
	    	 listSummary_potential_prev = site_assessmentLocalServiceUtil.getThreatSummaryPotentialByVersion(prevAssesmentVersionId);

	    	 if(listSummary_potential_prev!=null && listSummary_potential_prev.size()>0){
	    	 if(!listSummary_potential_prev.get(0).getOverall_potential().equalsIgnoreCase(listSummary_potential_curr.get(0).getOverall_potential()))
	    	 {
		    	  tdval.add(listSummary_potential_curr.get(0).getThreat_sum_potential_id()+"TSP_JS_TD");

	    	 }
	    	 
	    	 if(listSummary_potential_prev.get(0).getThreat_rating()!=listSummary_potential_curr.get(0).getThreat_rating())
	    	 {
		    	  tdval.add(listSummary_potential_curr.get(0).getThreat_sum_potential_id()+"TSP_AS_TD");

	    	 }
	    	 }
	     }
		 
	     //overall  Threat summary 
	     
	     if(listthrtSummary_overall_curr!=null && !listthrtSummary_overall_curr.isEmpty())
	     {
	    	 listthrtSummary_overall_prev = site_assessmentLocalServiceUtil.getThreatSummaryOverallByVersion(prevAssesmentVersionId);
	    	 
	    	 if(listthrtSummary_overall_prev!=null && listthrtSummary_overall_prev.size()>0){
	    	 if(!listthrtSummary_overall_prev.get(0).getOverall_threat().equalsIgnoreCase(listthrtSummary_overall_curr.get(0).getOverall_threat()))
	    	 {
	    		 tdval.add(listthrtSummary_overall_curr.get(0).getThreat_sum_overall_id()+"TSO_JS_TD");
	    	 }
	    	 
	    	 if(listthrtSummary_overall_prev.get(0).getThreat_rating()!=listthrtSummary_overall_curr.get(0).getThreat_rating())
	    	 {
	    		 tdval.add(listthrtSummary_overall_curr.get(0).getThreat_sum_overall_id()+"TSO_AS_TD");
	    	 }
	    	 }
	     }
	    	 
	    	 
	     //effective  protection and management
	     
	     
	     if(listeffective_prot_mgmt_io_curr!=null && !listeffective_prot_mgmt_io_curr.isEmpty())
			{
	    	 listeffective_prot_mgmt_io_prev=effective_prot_mgmt_iothreatsLocalServiceUtil.geteffectivemanagthreatByVersion(prevAssesmentVersionId);
				
				if(listeffective_prot_mgmt_io_prev!=null && listeffective_prot_mgmt_io_prev.size()>0 && !listeffective_prot_mgmt_io_prev.isEmpty())
				{
					if(!listeffective_prot_mgmt_io_prev.get(0).getJustification().equalsIgnoreCase(listeffective_prot_mgmt_io_curr.get(0).getJustification()))
					{
						 tdval.add(listeffective_prot_mgmt_io_curr.get(0).getId()+"EMP_JS_TD");
					}
					if(listeffective_prot_mgmt_io_prev.get(0).getRating()!=listeffective_prot_mgmt_io_curr.get(0).getRating())
					{
						 tdval.add(listeffective_prot_mgmt_io_curr.get(0).getId()+"EPM_RA_TD");
					}
					
				}
			}
	     
	    	 
	     
	     //Overall assessment of protection and management

			if(listprot_overall_curr!=null && !listprot_overall_curr.isEmpty())
			{
				listprot_overall_prev=prot_mgmt_overallLocalServiceUtil.getprotmgmtoverallByVersion(prevAssesmentVersionId);
				
				if(listprot_overall_prev!=null && !listprot_overall_prev.isEmpty())
				{
					if(!listprot_overall_prev.get(0).getJustification().equalsIgnoreCase(listprot_overall_curr.get(0).getJustification()))
					{
						 tdval.add(listprot_overall_curr.get(0).getPmo_id()+"PMOA_JS_TD");

					}
					
					if(listprot_overall_prev.get(0).getRating()!=listprot_overall_curr.get(0).getRating())
					{
						 tdval.add(listprot_overall_curr.get(0).getPmo_id()+"PMOA_RA_TD");

					}
				}

			}
			
			 if(tdval.isEmpty()){
				   double version_code = site_assessment_versionsLocalServiceUtil.getsite_assessment_versions(prevAssesmentVersionId).getVersion_code();
					 %>
						alert("There are no differences in this version of Step 5 with its previuos version "+ <%= version_code%>+".");
						<% 
				 }
				 else {
					 if(tdval.size()>0){
						 //TDorange
						
							 for (String val : tdval) {				 
								 
								 %>
								 
								 $("td[id='"+'<%=val%>'+"']").css("background-color", "#FFCC66");
								 <%
								 
							}
		
						 }	 
				 }		 
			
	
	}else
	{
		%>
		alert("No Previous version available:")
		<%
	}
		
	%>
	
	
	
}



function removeDiff_5(){
	
	$('#step5bDiv tr:gt(0)').css("background", "none");
	$('#step5bDiv tr:gt(0) td').css("background", "none");
	
	
	$('#step5Div tr:gt(0)').css("background", "none");
	$('#step5Div tr:gt(0) td').css("background", "none");	
}

</script>



