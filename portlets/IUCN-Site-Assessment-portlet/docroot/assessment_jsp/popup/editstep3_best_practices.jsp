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
   List<protection_management_ratings_lkp> protection_management_ratings_lkpList=null;
   List<protection_management> listprotection_management=null;
   List<protection_mgmt_checklist_lkp> lstprotection_mgmt_checklist_lkp=null;
   
   prot_mgmt_best_practices objprot_mgmt_practices=null;
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
	    	objprot_mgmt_practices=prot_mgmt_best_practicesLocalServiceUtil.getprot_mgmt_best_practices(Long.parseLong(selectedPkey));
	    	
	    }
	    else{
	    	objprot_mgmt_practices=new prot_mgmt_best_practicesClp();
	    	objprot_mgmt_practices.setAssessment_version_id(assessmentVersionId);
	    	objprot_mgmt_practices.setDescription("");
	    }
	
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


  
 <portlet:actionURL name="addbestpractices" var="step3practice" />
 <c:set var="versionId" value="<%= assessmentVersionId %>"/>
 <c:set var="UpdateUrl" value="<%=step3practice %>"/>
 <c:set var="RefreshUrl" value="/assessment_jsp/innerJsp/step3_overall.jsp"/>
 


  <aui:form 
    id="step3practiceForm" 
	name="step3practiceForm" 
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
	        value="<%=objprot_mgmt_practices.getBest_practice_id() %>"
	        type="hidden"
	    />  
	<tr>
	<td class="lblTD">
		<label class="popuplbl">Topics: </label>
	</td>
	<td class="lblTD">
		<b>Best Practice Examples</b>
	</td>
    </tr>
	
	<tr>
	<td class="lblTD">
		<label class="popuplbl">Description: </label>
	</td>
	<td spellcheck="true" class="valueTD">
	<aui:input 
			type="textarea" 
			id="description" 
			name= "description" 
			label=""
			value= "<%=objprot_mgmt_practices.getDescription()%>"
			
			/> 
	</td>
	</tr> 
	
	
	<tr >
	<td class="btnTD" colspan="2" >
		<aui:button type="button" value="Submit" onclick="javascript:validatestep3cForm();"/>
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

	function validatestep3cForm(){
	
	
	
 var isValid = true;
 
 
    var description = $('#<portlet:namespace/>description').val();
	
	
	
	if(description==""){
		isValid =false;
		alert("Justification Of Assessment is required.");
	}
	
	
	
	if(isValid){
        $("input[type=button]").attr("disabled", "disabled");
		submitPopupForm('${versionId }','${RefreshUrl}','step3overAllDiv','step3practiceForm','${UpdateUrl }',3);
		
	}
}
</aui:script>



