<%@page import="com.iucn.whp.dbservice.service.key_conservation_issuesLocalServiceUtil"%>
<%@page import="com.iucn.whp.dbservice.service.site_assessment_versionsLocalServiceUtil"%>
<%@page import="com.iucn.whp.dbservice.model.key_conservation_issues"%>

<%@include file="/init.jsp" %>
<%
    Long currentAssessmentId = ParamUtil.getLong(request, "assesmentId");
%>

<!--mainBlock Starts Here-->
<div class="mainBlock siteInfoMainBlock">
	<div class="tableWrapper tableWrapperSiteInfoContacts">
		<div id="outerstep5Div">
			<div class="infoSection">
				<h2 class="siteAssessmentSubHeadings">Understanding Key Conservation Issues
					<a href="#"
					   onclick="javascript:dynamicPopup('/assessment_jsp/popup/site6_keyconservation_issue_pop.jsp','','Add Key Conservation Issues',event); return false;"
					   class="addBtn hideAdminAction">+Add Conservation Issues</a>
				</h2>

				<div class="tipsSection">
					<p class="tiptext">
						The conservation issues identified through this assessment are not meant to be
						detailed recommendations for action. Such recommendations will be part of the follow up to
						Conservation Outlook Assessments, but are not part of the assessment itself. The description of
						issues should summarize the key conservation problems affecting a site, including whether these
						could be locally resolved by the management authority, or require the implication of the other
						actors such as a national government or the international community.
						<a target="_blank" href="<%= themeDisplay.getURLPortal().concat("/")
            .concat("IUCN-Site-Assessment-portlet/Guidelines_IUCN_Conservation_Outlook_Assessments_Version_2_0_FINAL.pdf") %>">Access Guidelines for this Step.</a>
					</p>
				</div>

				<div id="step6Div" class="infoSectionContent">
					<jsp:include page="/assessment_jsp/innerJsp/step6_key_cois.jsp"></jsp:include>
				</div>
			</div>
		</div>
	</div>

	<div class="wizardFooter">
		<a href="#" class="roundedcornerBTN" onclick="javascript:$('#step5').click();"><span>&#60;&#60; Previous</span></a>
		<a href="#" class="roundedcornerBTN" onclick="javascript:$('#step7').click();"><span>Save and continue &#62;&#62;</span></a>
	</div>

</div>

<%--<div class="buttonsSiteAssessment hideAdminAction">--%>
	<%--<%@include file="/assessment_jsp/tab_step9_buttons.jsp" %>--%>
	<%--<c:if test="<%= AssessmentActionUtil.hasLinkVisible(currentAssessmentId, user.getUserId(), AssessmentContstant.ACTION_VIEW_DIFFERENCES) %>">--%>
		<%--<input type="button" value="View Differences" onClick="javascript: viewDiff_6();"/>--%>
	<%--</c:if>--%>
	<%--<c:if test="<%= AssessmentActionUtil.hasLinkVisible(currentAssessmentId, user.getUserId(), AssessmentContstant.ACTION_CLEAR_HIGHLIGHTS) %>">--%>
		<%--<input type="button" value="Clear Highlights" onClick="javascript: removeDiff_6();"/>--%>
	<%--</c:if>--%>
	<%--&lt;%&ndash; <jsp:include page="/assessment_jsp/tab_buttons.jsp" /> &ndash;%&gt;--%>
<%--</div>--%>

<script type="text/javascript">

function viewDiff_6(){

	<%
	
	
	List<key_conservation_issues> lst_conservationIssues_curr=null;
	List<key_conservation_issues> lst_conservationIssues_prev=null;
	
	long prevAssesmentVersionId=0;
	long assesmentVersionId=Long.parseLong(request.getAttribute("versionId").toString());
	

	
    try{
		
		prevAssesmentVersionId=Long.parseLong(request.getAttribute("previousVersionId").toString());
		
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	
	
	
	lst_conservationIssues_curr=key_conservation_issuesLocalServiceUtil.getkey_conversionissueByVersion(assesmentVersionId);

	
	/* long assessmentId=0; */
	double previousVersionCode=0;
	
	

	if(prevAssesmentVersionId>0){
   	
		
		
		try{
			
			
			lst_conservationIssues_prev=key_conservation_issuesLocalServiceUtil.getkey_conversionissueByVersion(prevAssesmentVersionId);

		
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}

		
		
		
	
	
	

	
	
		
	
	
	   ArrayList <String>trval=new ArrayList <String>();
	   ArrayList <String>tdval=new ArrayList <String>();
	   
	   
	   if(lst_conservationIssues_curr!=null && !lst_conservationIssues_curr.isEmpty())
	   {
	   
		for( key_conservation_issues curr_keyconissueobj: lst_conservationIssues_curr){
			
			
			 boolean isSimilar_key_issue=false;
			 boolean isSimilar_description=false;
			 boolean isSimilar_scale=false;
			
			 if(lst_conservationIssues_prev!=null && !lst_conservationIssues_prev.isEmpty() )
			 {
			 
				for( key_conservation_issues prev_keyconissueobj: lst_conservationIssues_prev){
					
					
					if(prev_keyconissueobj.getKey_conservation_issues().equals(curr_keyconissueobj.getKey_conservation_issues())){
					
						isSimilar_key_issue=true;
				
					
					if(!prev_keyconissueobj.getDescription().equals(curr_keyconissueobj.getDescription()))
					{
					
						tdval.add(curr_keyconissueobj.getKey_conservation_issues()+"_DS_TD");
					}
					
					if(prev_keyconissueobj.getScale()!=curr_keyconissueobj.getScale()){
						
						tdval.add(curr_keyconissueobj.getKey_conservation_issues()+"_SC_TD");
						
						
						}
				break;
					
				}
				
				
				}
			 
			
		}

				if(!isSimilar_key_issue){
		 			trval.add(curr_keyconissueobj.getKey_conservation_issues()+"_TR");
        	 
		 		}
	
		}
	
	
	   }
	   if(trval.isEmpty() && tdval.isEmpty()){
		   double version_code = site_assessment_versionsLocalServiceUtil.getsite_assessment_versions(prevAssesmentVersionId).getVersion_code();
			 %>
				alert("There are no differences in this version of Step 6 with its previous version "+ <%= version_code%>+".");
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
	}
	else
	{
		%>
		alert("No Previous version available:")
		<%
	}
	
%>
}

function removeDiff_6(){
	
	
	$('#step6Div tr:gt(0)').css("background", "none");
	$('#step6Div tr:gt(0) td').css("background", "none");
	
}

</script>


