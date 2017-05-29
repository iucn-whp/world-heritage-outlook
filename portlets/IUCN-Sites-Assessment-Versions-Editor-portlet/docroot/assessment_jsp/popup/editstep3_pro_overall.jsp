
<%@page import="com.iucn.whp.dto.SiteAssessmentValues"%>
<%@page import="com.iucn.whp.dbservice.service.site_assessmentLocalServiceUtil"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.iucn.whp.dbservice.service.assessment_whvaluesLocalServiceUtil"%>
<%@page import="com.iucn.whp.dbservice.model.assessment_whvaluesClp"%>
<%@page import="com.iucn.whp.dbservice.model.*"%>
<%@include file="/init.jsp" %>
<% 
  
List<protection_management> listprotection_management=null;
List<protection_mgmt_checklist_lkp> lstprotection_mgmt_checklist_lkp=null;

long assessmentVersionId=0;
String msg="";
List<protection_management_ratings_lkp> protection_management_ratings_lkpList=null;

prot_mgmt_overall obj_prot_overall=null;
assessmentVersionId = Long.parseLong(request.getParameter("versionIdVal"));


lstprotection_mgmt_checklist_lkp=protection_mgmt_checklist_lkpLocalServiceUtil.findAll();
listprotection_management=protection_managementLocalServiceUtil.findByAssessementVersionId(assessmentVersionId);
 
if(listprotection_management.size()>=lstprotection_mgmt_checklist_lkp.size())
{
	

 try
{ 
	 protection_management_ratings_lkpList=protection_management_ratings_lkpLocalServiceUtil.findAll();
	 String selectedPkey=request.getParameter("keyVal");
	    
	    
	    if(selectedPkey!=null && !selectedPkey.isEmpty()){
	    	obj_prot_overall=prot_mgmt_overallLocalServiceUtil.getprot_mgmt_overall(Long.parseLong(selectedPkey));
	    	
	    	
	    	
	    }
	    
	    else{
	    	obj_prot_overall=new prot_mgmt_overallClp();
	    	  obj_prot_overall.setAssessment_version_id(assessmentVersionId);
		      obj_prot_overall.setJustification("");
	    	  obj_prot_overall.setRating(0);
	    }
	    
	    
			
	    obj_prot_overall.getRating();
	    obj_prot_overall.getJustification();
	    
	
	
}catch(Exception e)
{
	e.printStackTrace();
}

}
else
{
	msg = "Please fill Assessing Protection & Management before filling Overall assessment of protection and management	. ";
}
%>


 <portlet:actionURL name="addmngtoverall" var="step3overall" />

<c:set var="versionId" value="<%= assessmentVersionId %>"/>
<c:set var="UpdateUrl" value="<%=step3overall %>"/>
<c:set var="RefreshUrl" value="/assessment_jsp/innerJsp/step3_overall.jsp"/>
 


  <aui:form 
    id="step3effectiveForm" 
	name="step3effectiveForm" 
	action=""
	method="post"
>
	<% if(msg.isEmpty()){ %>
		
	<table class="formBlock">
	
	    <aui:input
	        name="assessmentVersionId"
	        id="assessmentVersionId"
	        value="<%=assessmentVersionId %>"
	        type="hidden"
	    />
	    
	         
	    <aui:input
	        name="protection_managementId"
	        id="protection_managementId"
	        value="<%=obj_prot_overall.getPrimaryKey() %>"
	        type="hidden"
	    />
	<tr>
	<td class="lblTD">
		<label class="popuplbl" >Topics: </label>
	</td>
	<td>
		<label class="popuplbl" style="width:400px;">Overall assessment of protection and management</label>
	</td>
	</tr>
	
	<tr>
	<td class="lblTD">
		<label class="popuplbl">Justification of Assessment: </label>
	</td>
	<td spellcheck="true" class="valueTD">
		<aui:input 
			type="textarea" 
			label="" 
			id="justification" 
			name= "justification" 
			value= "<%=obj_prot_overall.getJustification() %>"
			/>
	</td>
	</tr>
	
	
	<tr>
	<td class="lblTD">
		<label class="popuplbl">Assessment Ratings: </label>
	</td>
	
	<td>
	
		 <select name="assessmentratings" id="assessmentratings" style="width:400px;">
		        <aui:option value="">Select Assessment</aui:option>
		
		
		<%
		 
		 for(int i=0;i<protection_management_ratings_lkpList.size();i++)
		 {
			 protection_management_ratings_lkp tempprotection_management_ratings_lkp= protection_management_ratings_lkpList.get(i); 
			 
			 if(tempprotection_management_ratings_lkp.getId()==obj_prot_overall.getRating())
			 {
				%> 
				 <aui:option selected="true"	value="<%=tempprotection_management_ratings_lkp.getId() %>">
					<%=tempprotection_management_ratings_lkp.getPm_rating()%>
				</aui:option>
					<%} else { %> 
					<aui:option
					value="<%=tempprotection_management_ratings_lkp.getId() %>">
					<%=tempprotection_management_ratings_lkp.getPm_rating() %>
				</aui:option>
			<%}} %>
				
			
		</select> 
	</td>
	
	</tr>
	
	<tr >
	<td class="btnTD" colspan="2" >
		<aui:button type="button" value="Submit" onclick="javascript:validatestep3bForm();"/>
		<aui:button name="cancelButton" type="button" value="Cancel" onclick="javascript:top.document.getElementById('closethick').click();"/>
	</td>
	</tr>
	</table>
	<%}else{ %>
	<table class="formBlock">
	
		
				
	<tr>
		<td>
			<label ><%=msg %></label>
		</td>
		
	</tr>
	
	<tr>
		<td style="text-align:center;">
			
			<aui:button name="cancelButton" type="button" value="OK" onclick="javascript:top.document.getElementById('closethick').click();"/>
		</td>
	</tr>
		
	</table>
	<%} %>
</aui:form>


<aui:script>

	function validatestep3bForm(){
	
	
	
 var isValid = true;
 
 
    var justification = $('#<portlet:namespace/>justification').val();
<%-- 	var assessmentratings = $('#<portlet:namespace/>assessmentratings').val();	
 --%>	
		var assessmentratings = $("#assessmentratings option:selected").val();
	
	
	
	if(justification==""){
		isValid =false;
		alert("Justification Of Assessment is required.");
	}
	
	else if(assessmentratings==0)
	{
	isValid =false;
		alert("Assessment is required.");
	} 
	
	
	if(isValid){

        $("input[type=button]").attr("disabled", "disabled");
		submitPopupForm('${versionId }','${RefreshUrl}','step3overAllDiv','step3effectiveForm','${UpdateUrl }',3);
		
	}
}
</aui:script>




