<%@ include file="/init.jsp" %>



<%

long assessmentVersionId=0;

List<benefits_summary> lstbenefits_summary=null;
benefits_summary objbenefits_summary=null;





try
{
	
	String selectedPkey=request.getParameter("keyVal");
    assessmentVersionId = Long.parseLong(request.getParameter("versionIdVal"));
    
    lstbenefits_summary=benefits_summaryLocalServiceUtil.getEntriesFromAssessmentId(assessmentVersionId);
    
    
    
    
    
    if(selectedPkey!=null && !selectedPkey.isEmpty())
    {
    
    	objbenefits_summary=benefits_summaryLocalServiceUtil.getbenefits_summary(Long.parseLong(selectedPkey));
    	
    	
	   }else{

		   objbenefits_summary= new  benefits_summaryClp();
		   
		   objbenefits_summary.setAssessment_version_id(assessmentVersionId);
		   objbenefits_summary.setSummary("");
		   
		   
		   
	   }
	
}catch(Exception e)
{
	out.println("Ex------------"+e.getMessage());
}



%>




<portlet:defineObjects /> 
   
    <portlet:actionURL name="addSummarryOfBenefit" var="step7" />
    
    <c:set var="versionId" value="<%= assessmentVersionId %>"/>
<c:set var="UpdateUrl" value="<%=step7 %>"/>
<c:set var="RefreshUrl" value="/assessment_jsp/innerJsp/step7_benefit_summary.jsp"/>



<aui:form 
    id="step7bForm" 
	name="step7bForm" 
	action=""
	method="post"
>
		
	<table class="formBlock">
	
	    <aui:input
	        name="benefitsummury_id"
	        id="benefitsummury_id"
	        value="<%=objbenefits_summary.getBenefits_summary_id()%>"
	        type="hidden"
	    />
	    
	        <aui:input
	        name="assessmentVersionId"
	        id="assessmentVersionId"
	        value="<%= assessmentVersionId %>"
	        type="hidden"
	    />
	
	
	
	
	<tr>
	<td class="lblTD">
		<label class="popuplbl">  Summary of benefits  </label>
	</td>
	<td spellcheck="true" class="valueTD">
		<aui:input 
			type="textarea" 
			label="" 
			id="summarybenefits" 
			name= "summarybenefits" 
			value= "<%=objbenefits_summary.getSummary()%>"
			/>
	</td>
	</tr>
	<tr>
	<td class="btnTD" colspan="2" >
		<aui:button type="button" value="Submit" onclick="javascript:validatestep7bForm();"/>
		<aui:button name="cancelButton" type="button" value="Cancel" onclick="javascript:top.document.getElementById('closethick').click();"/>
	</td>
	</tr>
	</table>
</aui:form>





<aui:script>

	function validatestep7bForm(){
	
	
	
 var isValid = true;
 
 
    var summarybenefits = $('#<portlet:namespace/>summarybenefits').val();
	
	
	
	if(summarybenefits==""){
		isValid =false;
		alert("Summary of benefits is required.");
	}
	
	
	
	if(isValid){

        $("input[type=button]").attr("disabled", "disabled");
		submitPopupForm('${versionId }','${RefreshUrl}','step7bDiv','step7bForm','${UpdateUrl }',7);
		
	}
}
</aui:script>




































