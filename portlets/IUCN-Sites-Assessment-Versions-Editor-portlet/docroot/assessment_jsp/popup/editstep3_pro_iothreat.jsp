<%@page import="com.iucn.whp.dto.SiteAssessmentValues"%>
<%@page import="com.iucn.whp.dbservice.service.site_assessmentLocalServiceUtil"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.iucn.whp.dbservice.service.assessment_whvaluesLocalServiceUtil"%>
<%@page import="com.iucn.whp.dbservice.model.*"%>
<%@ include file="/init.jsp" %>
<% 
  

String msg="";
long assessmentVersionId=0;

List<protection_management> listprotection_management=null;
List<protection_mgmt_checklist_lkp> lstprotection_mgmt_checklist_lkp=null;
List<protection_management_ratings_lkp> protection_management_ratings_lkpList=null;
effective_prot_mgmt_iothreats objeffective_prot_mgmt_iothreats=null;

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
	    	objeffective_prot_mgmt_iothreats=effective_prot_mgmt_iothreatsLocalServiceUtil.geteffective_prot_mgmt_iothreats(Long.parseLong(selectedPkey));
	    }
	    else{
	    	objeffective_prot_mgmt_iothreats=new effective_prot_mgmt_iothreatsClp();
	    	objeffective_prot_mgmt_iothreats.setAssessment_version_id(assessmentVersionId);
	    	objeffective_prot_mgmt_iothreats.setJustification("");
	    	objeffective_prot_mgmt_iothreats.setRating(0);
	    	
	    }
	    
	    
			
	    objeffective_prot_mgmt_iothreats.getRating();
	    objeffective_prot_mgmt_iothreats.getJustification();
	    
	
	
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
 <portlet:actionURL name="addprotectionmngtIoThreats" var="step3" />

<c:set var="versionId" value="<%= assessmentVersionId %>"/>
<c:set var="UpdateUrl" value="<%=step3 %>"/>
<c:set var="RefreshUrl" value="/assessment_jsp/innerJsp/step3_overall.jsp"/>
 


  <aui:form 
    id="step3_ioThteatForm" 
	name="step3_ioThteatForm" 
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
	        value="<%=objeffective_prot_mgmt_iothreats.getPrimaryKey() %>"
	        type="hidden"
	    />
	<tr>
	<td class="lblTD">
		<label class="popuplbl">Topics: </label>
	</td>
	<td>
	<label class="popuplbl" style="width:400px;">Assessment of the effectiveness of protection</label>
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
			value= "<%=objeffective_prot_mgmt_iothreats.getJustification() %>"
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
			 protection_management_ratings_lkp objprotection_management_ratings_lkp= protection_management_ratings_lkpList.get(i); 
			 
			 if(objprotection_management_ratings_lkp.getId()==objeffective_prot_mgmt_iothreats.getRating())
			 {
				%> 
				 <aui:option selected="true"	value="<%=objprotection_management_ratings_lkp.getId() %>">
					<%=objprotection_management_ratings_lkp.getPm_rating()%>
				</aui:option>
					<%} else { %> 
					<aui:option
					value="<%=objprotection_management_ratings_lkp.getId() %>">
					<%=objprotection_management_ratings_lkp.getPm_rating() %>
				</aui:option>
			<%}} %>
			
		</select> 
	</td>
	
	</tr>
	
	
	<tr >
	<td class="btnTD" colspan="2" >
		<aui:button type="button" value="Submit" onclick="javascript:validatestep3cForm();"/>
		<aui:button name="cancelButton" type="button" value="Cancel" onclick="javascript:top.document.getElementById('closethick').click();"/>	</td>
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

	function validatestep3cForm(){
	
	
	
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
		submitPopupForm('${versionId }','${RefreshUrl}','step3overAllDiv','step3_ioThteatForm','${UpdateUrl }',3);
		
	}
}
</aui:script>



