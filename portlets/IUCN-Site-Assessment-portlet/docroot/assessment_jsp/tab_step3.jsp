<!--mainBlock Starts Here-->
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@include file="/init.jsp"%>
<div class="mainBlock siteInfoMainBlock">
	<div class="tableWrapper tableWrapperSiteInfoContacts">


		<div id="step3Div">
		
			<div class="infoSection">
			<h2 class="siteAssessmentSubHeadings">Assessing Protection &amp; Management
			<a href="#" onclick="javascript:dynamicPopup('/assessment_jsp/popup/editstep3_protection_mgt.jsp','','Assessing Protection Management',event); return false;" class="addBtn hideAdminAction">+Assess Protection & Management</a>
			
			</h2>
			<div class="tipsSection">
			<p class="tiptext">The state of each protection and management topic is assessed against five ratings: Highly Effective, Effective, Some Concern, Serious Concern and Data Deficient.</p>
			</div>
			<div id="step3Div_mgt" class="infoSectionContent">
				<jsp:include page="/assessment_jsp/innerJsp/step3_in.jsp"></jsp:include>

			</div>
			
			</div>
			
		</div>


		<div class="infoSection">
			<h2 class="siteAssessmentSubHeadings">Overall assessment of
				protection and management</h2>
				<div class="tipsSection">
<!-- 		<p class="tiptext">The state of each protection and management topic is assessed against five ratings: Highly Effective, Effective, Some Concern, Serious Concern and Data Deficient. These ratings are defined in Table 3.1 of the Guidelines and questions to help guide the assessment are provided in Table 3.2.</p>
 -->		</div>
			<div id="step3overAllDiv" class="infoSectionContent">
				<jsp:include page="/assessment_jsp/innerJsp/step3_overall.jsp"></jsp:include>
			</div>
		</div>
		
		
	</div>
	
				
			<div class="wizardFooter">
			<a href="#" class="roundedcornerBTN" onclick="javascript:$('#step2').click();"><span>&#60;&#60; Previous</span></a>
			<a href="#" class="roundedcornerBTN" onclick="javascript:$('#step4').click();"><span>Next &#62;&#62;</span></a>
			</div>
		
	
</div>

<div class="buttonsSiteAssessment hideAdminAction">
	<!-- <input type="button" value="Fill from previous assessment" /> -->
	<input type="button" value="View Differences"
		onClick="javascript:viewDiff_3();" /> 
		<input type="button"
		value="Clear Highlights" onClick="javascript:removeDiff_3();" />
		<jsp:include page="/assessment_jsp/tab_buttons.jsp" />
</div>
<script type="text/javascript">function viewDifference(step){
	alert(step);
	var strVersionId = <c:out value="${versionId}"/>
	var customUrl="<portlet:renderURL  windowState='<%=LiferayWindowState.POP_UP.toString()%>'><portlet:param name='jspPage' value='jspURL' /><portlet:param name='versionIdVal' value='versionValue' /></portlet:renderURL>";
    var tempSiteId = customUrl.replace("versionValue",strVersionId); 
    var finalUrl=tempSiteId.replace("jspURL","/assessment_jsp/compareStep3.jsp");
    
    var left = (screen.width/2-150);
    var top = (screen.height/2-200);
    AUI().use('aui-dialog', 'aui-io', 'event', 'event-custom', function(A) {
	     var dialog = new A.Dialog({
	            title: "View Differences",		            
	            modal: true,		           
	            xy: [left, top]
	        }).plug(A.Plugin.IO, {uri: finalUrl}).render();
	        
	        dialog.show();
	        
	  });

/* window.open('${pageContext.request.contextPath}/assessment_jsp/compareStep3.jsp','mywindow','width=400,height=200'); */
}
//-->


function viewDiff_3(){
	
	<%
	List<protection_management> listprotection_management_curr=null;
	List<protection_management> listprotection_management_prev=null;
	
	 List<prot_mgmt_best_practices> lstprot_best_practice_curr=null;
	 List<prot_mgmt_best_practices> lstprot_best_practice_prev=null;
	 
	 List<effective_prot_mgmt_iothreats> lsteffective_prot_mgmt_io_curr=null;
	 List<effective_prot_mgmt_iothreats> lsteffective_prot_mgmt_io_prev=null;
	 
	 List<prot_mgmt_overall> lstprot_overall_curr =null; 
	 List<prot_mgmt_overall> lstprot_overall_prev =null;	 
	 
	   ArrayList<String> trval=new ArrayList<String>();
	   ArrayList<String> tdval=new ArrayList<String>();
	   
	
	   
    long prevAssesmentVersionId=0;   
	long assesmentVersionId=Long.parseLong(request.getAttribute("versionId").toString());
	
	
	
try{
		
		prevAssesmentVersionId=Long.parseLong(request.getAttribute("previousVersionId").toString());
		
		
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	
	
		
	listprotection_management_curr=protection_managementLocalServiceUtil.findByAssessementVersionId(assesmentVersionId);
	lstprot_best_practice_curr = prot_mgmt_best_practicesLocalServiceUtil.getBestpractEntriesByAssessmentId(assesmentVersionId);
	lsteffective_prot_mgmt_io_curr=	 effective_prot_mgmt_iothreatsLocalServiceUtil.geteffectivemanagthreatByVersion(assesmentVersionId);
	lstprot_overall_curr=prot_mgmt_overallLocalServiceUtil.getprotmgmtoverallByVersion(assesmentVersionId);

	//fboolean isSimilar_topicid=true;
	
	if(prevAssesmentVersionId>0)
	{
		listprotection_management_prev=protection_managementLocalServiceUtil.findByAssessementVersionId(prevAssesmentVersionId);
	
	 
	 
		if(listprotection_management_curr!=null && !listprotection_management_curr.isEmpty() && 
				listprotection_management_prev!=null && !listprotection_management_prev.isEmpty() )
		{
			
			for(protection_management curr_protection_managementobj:listprotection_management_curr)
			{
			 boolean isSimilar_topicid=false;
	
				for(protection_management prev_protection_managementobj:listprotection_management_prev )
				{
					
					if(prev_protection_managementobj.getTopic_id()==curr_protection_managementobj.getTopic_id())
					{
						isSimilar_topicid=true;
						
						if(!prev_protection_managementobj.getJustification().equalsIgnoreCase(curr_protection_managementobj.getJustification()) )
						{
							tdval.add(curr_protection_managementobj.getTopic_id()+"_JS_TD");

						}
						
						if(prev_protection_managementobj.getRating()!=curr_protection_managementobj.getRating())
						{
							tdval.add(curr_protection_managementobj.getTopic_id()+"_GR_TD");

						}
						break;
					}
				}
				if(!isSimilar_topicid){
					 trval.add(curr_protection_managementobj.getTopic_id()+"_TR");
			 
			 	}
			}
			 
			
		}
	 
		
		
		if(lstprot_best_practice_curr!=null && !lstprot_best_practice_curr.isEmpty())
		{
			lstprot_best_practice_prev=prot_mgmt_best_practicesLocalServiceUtil.getBestpractEntriesByAssessmentId(prevAssesmentVersionId);
			if(lstprot_best_practice_prev!=null && !lstprot_best_practice_prev.isEmpty())
			{
				if(!lstprot_best_practice_prev.get(0).getDescription().equals(lstprot_best_practice_curr.get(0).getDescription()))
				{
				 tdval.add(lstprot_best_practice_curr.get(0).getBest_practice_id()+"BP_TD");
				}
			}
			
		}
		
		
		if(lsteffective_prot_mgmt_io_curr!=null && !lsteffective_prot_mgmt_io_curr.isEmpty())
		{
			lsteffective_prot_mgmt_io_prev=effective_prot_mgmt_iothreatsLocalServiceUtil.geteffectivemanagthreatByVersion(prevAssesmentVersionId);
			
			if(lsteffective_prot_mgmt_io_prev!=null && !lsteffective_prot_mgmt_io_prev.isEmpty())
			{
				if(!lsteffective_prot_mgmt_io_prev.get(0).getJustification().equals(lsteffective_prot_mgmt_io_curr.get(0).getJustification()))
				{
					 tdval.add(lsteffective_prot_mgmt_io_curr.get(0).getId()+"IO_JS_TD");
				}
				if(lsteffective_prot_mgmt_io_prev.get(0).getRating()!=lsteffective_prot_mgmt_io_curr.get(0).getRating())
				{
					 tdval.add(lsteffective_prot_mgmt_io_curr.get(0).getId()+"IO_RA_TD");
				}
				
			}
		}
		
		
		
		if(lstprot_overall_curr!=null && !lstprot_overall_curr.isEmpty())
		{
			lstprot_overall_prev=prot_mgmt_overallLocalServiceUtil.getprotmgmtoverallByVersion(prevAssesmentVersionId);
			
			if(lstprot_overall_prev!=null && !lstprot_overall_prev.isEmpty())
			{
				if(!lstprot_overall_prev.get(0).getJustification().equals(lstprot_overall_curr.get(0).getJustification()))
				{
					 tdval.add(lstprot_overall_curr.get(0).getPmo_id()+"PMO_JS_TD");

				}
				
				if(lstprot_overall_prev.get(0).getRating()!=lstprot_overall_curr.get(0).getRating())
				{
					 tdval.add(lstprot_overall_curr.get(0).getPmo_id()+"PMO_RA_TD");

				}
			}

		}
		
			
			
		
		if(trval.isEmpty() && tdval.isEmpty()){
		 double version_code = site_assessment_versionsLocalServiceUtil.getsite_assessment_versions(prevAssesmentVersionId).getVersion_code();
			 %>
				alert("There are no differences in this version of Step 3 with its previous version "+ <%= version_code%>+".");
				<% 
				}
		 else {
		
			 if(trval.size()>0){
				 //TRgreen
				
				 for (String val : trval) {%>
								 $("tr[id='"+'<%=val%>'+"']").css("background-color", "#acdfa7");
					 <%}
				 			 
			 }
			 if(tdval.size()>0){
				 //TDorange
				
				 for (String val : tdval) {%>
					 
					 $("td[id='"+'<%=val%>' + "']").css("background-color", "#FFCC66");
<%}
				 
			}
		}
	}
	
	else
	{%>
	alert("No Previous version available:")
<%}%>
	}

	function removeDiff_3() {

		$('#step3Div_mgt tr:gt(0)').css("background", "none");
		$('#step3Div_mgt tr:gt(0) td').css("background", "none");

		$('#step3overAllDiv tr:gt(0)').css("background", "none");
		$('#step3overAllDiv tr:gt(0) td').css("background", "none");

	}
</script>


