<!--mainBlock Starts Here-->
<%@page import="com.iucn.whp.dbservice.service.potential_project_needsLocalServiceUtil"%>
<%@page import="com.iucn.whp.dbservice.model.potential_project_needs"%>
<%@page import="com.iucn.whp.dbservice.service.site_assessment_versionsLocalServiceUtil"%>
<%@page import="com.iucn.whp.dbservice.model.site_assessment_versions"%>
<%@page import="com.iucn.whp.dbservice.service.active_conservation_projectsLocalServiceUtil"%>
<%@page import="com.iucn.whp.dbservice.service.key_conservation_issuesLocalServiceUtil"%>
<%@page import="com.iucn.whp.dbservice.model.active_conservation_projects"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<div class="mainBlock siteInfoMainBlock">
<div class="tableWrapper tableWrapperSiteInfoContacts">


 <div id="outercoacDiv">
		<div class="infoSection">
			<h2 class="siteAssessmentSubHeadings">Compilation Of Active Conservation Projects And Project Needs
			<a href="#" onclick="javascript:dynamicPopup('/assessment_jsp/popup/site8_compillation_of_active.jsp','','Add Compilation Of Active Conservation Projects',event); return false;" class="addBtn hideAdminAction">+Add Conservation Projects </a>
			</h2>
			
			<div class="tipsSection">
			<p class="tiptext">If limited information is available on the organizations and conservation projects active within a site, site assessors are encouraged to provide whatever information is easily available, even if incomplete.</p>
			</div>
			
			<div id="coacDiv" class="infoSectionContent">
			<jsp:include page="/assessment_jsp/innerJsp/step8_coac.jsp"></jsp:include>
			</div>
		</div>
</div>

<div id="outercoppDiv">
		<div class="infoSection">
			<h2 class="siteAssessmentSubHeadings">Compilation of potential project needs
			<a href="#" onclick="javascript:dynamicPopup('/assessment_jsp/popup/site8_compillation_of_potential.jsp','','Add Compilation of potential project needs',event); return false;" class="addBtn hideAdminAction">+Add  potential project</a>
			</h2>
			<div class="tipsSection">
			<!-- <p class="tiptext">Help Text Comes Here.</p> -->
			</div>
			<div id="coppDiv" class="infoSectionContent">
			<jsp:include page="/assessment_jsp/innerJsp/step8_coppn.jsp"></jsp:include>
			</div>
		</div> 

</div> 
</div>

			<div class="wizardFooter">
			<a href="#" class="roundedcornerBTN" onclick="javascript:$('#step7').click();"><span>&#60;&#60; Previous</span></a>
			<a href="#" class="roundedcornerBTN" onclick="javascript:$('#step9').click();"><span>Next &#62;&#62;</span></a>
			</div>

</div>

<div class="buttonsSiteAssessment hideAdminAction">
<!-- <input type="button" value="Fill from previous assessment" /> -->
    <%@include file="/assessment_jsp/tab_step9_buttons.jsp" %>
	<input type="button" value="View Differences" onClick="javascript: viewDiff_8();"/>
	<input type="button" value="Clear Highlights" onClick="javascript: removeDiff_8();"/>
	<%-- <jsp:include page="/assessment_jsp/tab_buttons.jsp" />  --%>
      
	
</div>


<script type="text/javascript">

function viewDiff_8(){

	<%
	
	
	List<active_conservation_projects> lstactive_projects_curr =null;
	List<active_conservation_projects> lstactive_projects_prev =null;
	List<potential_project_needs> lstpotential_project_curr =null;
	List<potential_project_needs> lstpotential_project_prev =null;
	
	
	long prevAssesmentVersionId=0;
	long assesmentVersionId=Long.parseLong(request.getAttribute("versionId").toString());
	
	lstactive_projects_curr=active_conservation_projectsLocalServiceUtil.getactive_conservation_projectsByVersion(assesmentVersionId);
	lstpotential_project_curr=potential_project_needsLocalServiceUtil.getpotential_projectsByVersion(assesmentVersionId);

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
			
		    lstactive_projects_prev=active_conservation_projectsLocalServiceUtil.getactive_conservation_projectsByVersion(prevAssesmentVersionId);
		    lstpotential_project_prev=potential_project_needsLocalServiceUtil.getpotential_projectsByVersion(prevAssesmentVersionId);
              			
			
		}catch(Exception e)
		{
			
			
			e.printStackTrace();

			
		}
		
	
	
	
	   ArrayList <String>trval=new ArrayList <String>();
	   ArrayList <String>tdval=new ArrayList <String>();
	   
	
	   
	   if(lstactive_projects_curr!=null && !lstactive_projects_curr.isEmpty())
	   {
		   
	  
	   
		for( active_conservation_projects curr_activeconobj: lstactive_projects_curr){

			
			 boolean isSimilar_Organisation=false;
			 

			 if(lstactive_projects_prev!=null && !lstactive_projects_prev.isEmpty())
			 {
				  for(active_conservation_projects  prev_activeconobj :lstactive_projects_prev)
				 {
									 
					 if(prev_activeconobj.getOrganization_individual().equals(curr_activeconobj.getOrganization_individual()))
					 {
						
						 isSimilar_Organisation=true;
						 
						 if(!prev_activeconobj.getDescription().equals(curr_activeconobj.getDescription()))
						 {
							 tdval.add(curr_activeconobj.getOrganization_individual()+"OD_TD");
						 }
						 
						 if(!prev_activeconobj.getContact_details().equals(curr_activeconobj.getContact_details()))
						 {
							 tdval.add(curr_activeconobj.getOrganization_individual()+"OC_TD");

						 }
						 
						 break;
					 }
					  
				
					 
				 }
				 
				 
				 
			 }
			
			
			
			 if(!isSimilar_Organisation){
		 			trval.add(curr_activeconobj.getOrganization_individual()+"_TR");
     	 
		 		}
	
	   
		}
	
	   }
		
	   
	   if(lstpotential_project_curr!=null && !lstpotential_project_curr.isEmpty())
	   {
	
		for( potential_project_needs curr_potentialobj: lstpotential_project_curr){

	
			boolean isSimilar_individuals=false;
		
			if(lstpotential_project_prev!=null && !lstpotential_project_prev.isEmpty()){
				
				for(potential_project_needs prev_potentialobj: lstpotential_project_prev)
				{
					if(prev_potentialobj.getOrganization_individual().equals(curr_potentialobj.getOrganization_individual()))
					{
						isSimilar_individuals=true;
						
						if(!prev_potentialobj.getDescription().equals(curr_potentialobj.getDescription()))
						{
							 tdval.add(curr_potentialobj.getOrganization_individual()+"OD_TD2");

						}
						
						if(!prev_potentialobj.getContact_details().equals(curr_potentialobj.getContact_details()))
						{
							 tdval.add(curr_potentialobj.getOrganization_individual()+"OC_TD2");

						}
						
						break;
					}
					
					
				}
				
				
			}
				
			 if(!isSimilar_individuals){
		 			trval.add(curr_potentialobj.getOrganization_individual()+"_TR2");
   	 
		 		}
		
	
			
		}
	
	   }
	   if(trval.isEmpty() && tdval.isEmpty()){
		   double version_code = site_assessment_versionsLocalServiceUtil.getsite_assessment_versions(prevAssesmentVersionId).getVersion_code();
			 %>
				alert("There are no differences in this version of Step 8 with its previous version "+ <%= version_code%>+".");
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
		alert("No Previous version available:")
		<%
	}
		
	%>
	
	
}

function removeDiff_8(){

	$('#coacDiv tr:gt(0)').css("background", "none");
	$('#coacDiv tr:gt(0) td').css("background", "none");
	
	$('#coppDiv tr:gt(0)').css("background", "none");
	$('#coppDiv tr:gt(0) td').css("background", "none");
	
	
}


</script>

