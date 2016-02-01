<%@page import="com.iucn.whp.dbservice.service.*"%>
<%@page import="com.iucn.whp.dbservice.model.*"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<!--mainBlock Starts Here-->
<div class="mainBlock siteInfoMainBlock">
<div class="tableWrapper tableWrapperSiteInfoContacts">


<div id="outerstep7Div">
			<div class="infoSection">
			<h2 class="siteAssessmentSubHeadings">Understanding Benefits
			<a href="#" onclick="javascript:dynamicPopup('/assessment_jsp/popup/site7_benefits_pop.jsp','','Understanding Benefits',event); return false;" class="addBtn hideAdminAction">+Add Benefits </a>

			</h2>
			
			<div class="tipsSection">
			<p class="tiptext">Benefits are identified using a checklist. The site assessor should mark the benefits that are present, and those that could reasonably be assumed to be present but for which there is little/no information , i.e. data deficient, with an X. Benefits that are not marked are assumed to be absent.</p>
			</div>
		
			<div id="step7Div" class="infoSectionContent">
			<jsp:include page="/assessment_jsp/innerJsp/step7_understand_benefit.jsp"></jsp:include>
			</div>
			</div>
</div>

			<div class="infoSection">
			<h2 class="siteAssessmentSubHeadings">Summary of benefits</h2>
			
			<div class="tipsSection">
			<p class="tiptext">The evaluator selects a short list of key benefits, describes these in the €˜summary column, and states whether they are potential, minor or major for the community inside the site, the community outside the site and the wider community (including global).</p>
			</div>
			<div id="step7bDiv" class="infoSectionContent">
			<jsp:include page="/assessment_jsp/innerJsp/step7_benefit_summary.jsp"></jsp:include>
			</div>
			</div>

</div>

			<div class="wizardFooter">
			<a href="#" class="roundedcornerBTN" onclick="javascript:$('#step6').click();"><span>&#60;&#60; Previous</span></a>
			<a href="#" class="roundedcornerBTN" onclick="javascript:$('#step8').click();"><span>Next &#62;&#62;</span></a>
			</div>


</div>

<div class="buttonsSiteAssessment hideAdminAction">
     <%@include file="/assessment_jsp/tab_step9_buttons.jsp" %>
	<input type="button" value="View Differences" onClick="javascript: viewDiff_7();"/>
	<input type="button" value="Clear Highlights" onClick="javascript: removeDiff_7();"/>
	<%-- <jsp:include page="/assessment_jsp/tab_buttons.jsp" /> --%>
	
</div>
 

<script type="text/javascript">

function viewDiff_7(){
	
	<%
	
	List<benefits> lstbenefit_curr= null;
	List<benefits> lstbenefit_prev= null;
	
	List<benefits_summary> lstbenefits_summary_curr=null;
	List<benefits_summary> lstbenefits_summary_prev=null;
	
	
	
	long prevAssesmentVersionId=0;
	long assesmentVersionId=Long.parseLong(request.getAttribute("versionId").toString());
	lstbenefit_curr=benefitsLocalServiceUtil.getbenefitByVersion(assesmentVersionId);
	lstbenefits_summary_curr=benefits_summaryLocalServiceUtil.getEntriesFromAssessmentId(assesmentVersionId);

	
	long benefitid_curr=0;
	long benefitid_prev=0;
	
	
	
	
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
			
			lstbenefit_prev=benefitsLocalServiceUtil.getbenefitByVersion(prevAssesmentVersionId);
			lstbenefits_summary_prev=benefits_summaryLocalServiceUtil.getEntriesFromAssessmentId(prevAssesmentVersionId);

              			
			
		}catch(Exception e)
		{
			
			
			e.printStackTrace();

			
		}
		
	
		
	
	   ArrayList <String>trval=new ArrayList <String>();
	   ArrayList <String>tdval=new ArrayList <String>();
	   
	
	   List<benefits_type_ref> curr_lstbenefitstyperef=null;
		List<benefits_type_ref> prev_lstbenefitstyperef=null;
		
		
		if(lstbenefit_curr!=null && !lstbenefit_curr.isEmpty())
		{
			
		
	for(benefits curr_benefit_obj:lstbenefit_curr)
	{
		boolean isSimilar_benefit=false;
		
		if(lstbenefit_prev!=null && !lstbenefit_prev.isEmpty())
		{
			
			for(benefits prev_benefit_obj :lstbenefit_prev )
			{
				
				if(prev_benefit_obj.getSelected_benefit()==curr_benefit_obj.getSelected_benefit())
				{
					isSimilar_benefit=true;
					
					
					    curr_lstbenefitstyperef =benefits_type_refLocalServiceUtil.findByBenefitsId(curr_benefit_obj.getBenefits_id());
					
					
						prev_lstbenefitstyperef =benefits_type_refLocalServiceUtil.findByBenefitsId(prev_benefit_obj.getBenefits_id());
				
						List<Long> lstsubtype= new ArrayList<Long>();
						
						
						
						 for(  benefits_type_ref obj :curr_lstbenefitstyperef)
						    {
						    	
						    	lstsubtype.add(obj.getBenefit_checksubtype());
						    }
						 
						 
							
						
					 for(benefits_type_ref prev_benefit_refobj:prev_lstbenefitstyperef)
					{
						
							
							 boolean isSimilar_subbenefit=false;
							 long benefitSubtype = 0;
							
							for( benefits_type_ref curr_benefit_refobj:curr_lstbenefitstyperef)
							{
								benefitSubtype=curr_benefit_refobj.getBenefit_checksubtype();
								
								if(!lstsubtype.contains(prev_benefit_refobj.getBenefit_checksubtype()))
								{
									tdval.add(curr_benefit_obj.getBenefits_id()+"_"+benefitSubtype+"_SUB_TD");
								}
								
								if(curr_benefit_refobj.getBenefit_checksubtype()==prev_benefit_refobj.getBenefit_checksubtype())
								{
									
									isSimilar_subbenefit=true;
                                    break;
								}
								
							
								
								
							}
							if(!isSimilar_subbenefit)
							{
								tdval.add(curr_benefit_obj.getBenefits_id()+"_"+benefitSubtype+"_SUB_TD");

							}
					} 
					
												
						
					if(prev_benefit_obj.getData_deficient()!=curr_benefit_obj.getData_deficient())
					{
						tdval.add(curr_benefit_obj.getBenefits_id()+"DD_TD");
					}
					if(!prev_benefit_obj.getSummary().equals(curr_benefit_obj.getSummary()))
					{
						tdval.add(curr_benefit_obj.getBenefits_id()+"SM_TD");
					}
														
					if(prev_benefit_obj.getCommunity_within_site()!=curr_benefit_obj.getCommunity_within_site())
					{
						tdval.add(curr_benefit_obj.getBenefits_id()+"CW_TD");

					}
					if(prev_benefit_obj.getCommunity_outside_site()!=curr_benefit_obj.getCommunity_outside_site())
					{
						tdval.add(curr_benefit_obj.getBenefits_id()+"CO_TD");

					}
					
					if(prev_benefit_obj.getWider_community()!=curr_benefit_obj.getWider_community())
					{
						tdval.add(curr_benefit_obj.getBenefits_id()+"WC_TD");

					}
					
					break;
				}
				
				
			}
									
		}
		
		
		
		 if(!isSimilar_benefit){
	 			trval.add(curr_benefit_obj.getBenefits_id()+"_TR");
	 
	 		}
		
	}
	
	}
	
		
		//Summary of benefits  view difference 
		
		if(lstbenefits_summary_curr!=null &&  !lstbenefits_summary_curr.isEmpty())
		{
			if(lstbenefits_summary_prev!=null && !lstbenefits_summary_prev.isEmpty())
			{
				
				if(!lstbenefits_summary_prev.get(0).getSummary().equals(lstbenefits_summary_curr.get(0).getSummary()))
				{
					 tdval.add(lstbenefits_summary_curr.get(0).getBenefits_summary_id()+"BSS_TD");

				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		if(trval.isEmpty() && tdval.isEmpty()){
			  double version_code = site_assessment_versionsLocalServiceUtil.getsite_assessment_versions(prevAssesmentVersionId).getVersion_code();
			 %>
				alert("There are no differences in this version of Step 7 with its previuos version "+ <%= version_code%>+".");
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
	
	
	}else
	{
		
			%>
			alert("No Previous version available");
			<%
		
	}
	
	%>
	
	
}



function removeDiff_7(){

	$('#step7Div tr:gt(0)').css("background", "none");
	$('#step7Div tr:gt(0) td').css("background", "none");
	
	
	$('#step7bDiv tr:gt(0)').css("background", "none");
	$('#step7bDiv tr:gt(0) td').css("background", "none");
	
	
}


</script>

