<!--mainBlock Starts Here-->
<%@include file="/init_import.jsp" %>
<div class="mainBlock siteInfoMainBlock">
<div class="tableWrapper tableWrapperSiteInfoContacts">

		<div class="infoSection">
			<h2 class="siteAssessmentSubHeadings">References
			<a href="#" onclick="javascript:dynamicPopup('/assessment_jsp/popup/editstep9_reference.jsp','','Add References ',event); return false;" class="addBtn hideAdminAction">+Add References </a>
			</h2>
			<div class="tipsSection">
			<p class="tiptext">All information used in assessments is referenced for transparency and so that future assessments can review the previous information base. Information sources should be clearly referenced within the Description column in the case of Worksheet 1, and in the justification for assessment columns in Worksheets 2, 3 and 4. References should be compiled in Worksheet 9.</p>
			</div>
			
			<div id="step9Div" class="infoSectionContent">
			<jsp:include page="/assessment_jsp/innerJsp/step9_references.jsp"></jsp:include>
			</div>
		</div>

</div>

			<div class="wizardFooter">
			<a href="#" class="roundedcornerBTN" onclick="javascript:$('#step8').click();"><span>&#60;&#60; Previous</span></a>
			
			</div>


</div>

<div class="buttonsSiteAssessment hideAdminAction">
	<!-- <input type="button" value="View Differences" onClick="javascript: viewDiff_9();"/>
	<input type="button" value="Clear Highlights" onClick="javascript: removeDiff_9();"/> -->
	<%-- <%@include file="/assessment_jsp/tab_buttons.jsp" %>  --%>
	<%@include file="/assessment_jsp/tab_step9_buttons.jsp" %> 
</div>

<script type="text/javascript">

<%-- function viewDiff_9(){
	<%
	
	
	List<references> lst_references_curr=null;
	List<references> lst_references_prev=null;
	
	long prevAssesmentVersionId=0;

	long assesmentVersionId=Long.parseLong(request.getAttribute("versionId").toString());

	try{
		
		prevAssesmentVersionId=Long.parseLong(request.getAttribute("previousVersionId").toString());
		
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	
	
	lst_references_curr=referencesLocalServiceUtil.findByAssessmentId(assesmentVersionId);
	
	
	if(prevAssesmentVersionId>0){
   	
		
		
		try{
						
			lst_references_prev=referencesLocalServiceUtil.findByAssessmentId(prevAssesmentVersionId);

		
		}catch(Exception e)
		{
			e.printStackTrace();
		}

		
			
	
	   ArrayList <String>trval=new ArrayList <String>();
	   ArrayList <String>tdval=new ArrayList <String>();

	   
	  
	   if(lst_references_curr!=null && !lst_references_curr.isEmpty())
	   {
	   
	   for(references curr_referencesobj:lst_references_curr)
	   {
		   
			 boolean isSimilar_rnvalue=false;
			 System.out.println(curr_referencesobj.getReferences());
			 
			 if(lst_references_prev!=null)
			 {
				 
				 for(references prev_referencesobj:lst_references_prev)
				 {
				
					/* if(prev_referencesobj.getRn()==curr_referencesobj.getRn())
					{
						  isSimilar_rnvalue=true; */
					
					 if(!prev_referencesobj.getReferences().equals(curr_referencesobj.getReferences()))
					{
						
						 tdval.add(curr_referencesobj.getReference_id()+"_GR_TD");
						 isSimilar_rnvalue=true;
						 break; 
					}
					
					
						  }
				 
					

			 }
		   
			  if(!isSimilar_rnvalue){
		 			trval.add(curr_referencesobj.getReference_id()+"_TR");
  	 
		 		} 
			 
			 
	   }
		   
	   
	   }
	   
	   if(trval.isEmpty() && tdval.isEmpty()){
		   double version_code = site_assessment_versionsLocalServiceUtil.getsite_assessment_versions(prevAssesmentVersionId).getVersion_code();
			 %>
				alert("There are no differences in this version of Step 9 with its previuos version "+ <%= version_code%>+".");
				<% 
		 }
	   else{
		   if(tdval.size()>0){
				 //TDorange
			
				 for (String val : tdval) {				 
					 %>
					 
					 $("td[id='"+'<%=val%>'+"']").css("background-color", "#FFCC66");
					 <%
					 
				}
				 
			 }
		   if(trval.size()>0){
				 //TRgreen
				
				 for (String val : trval) {
					 
					%>
								 $("tr[id='"+'<%=val%>'+"']").css("background-color", "#acdfa7");
					 <%
				}
				 			 
			 }
		    
	   }
	  
	   
				 
	}
	else
	{
		%>
		alert("No Previous version available:");
		<%
	}
	
	
	
%>
}

function removeDiff_9(){
	
	
	$('#step9Div tr:gt(0)').css("background", "none");
	$('#step9Div tr:gt(0) td').css("background", "none");
	
}

</script>
 --%>


