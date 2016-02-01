<%@page import="com.iucn.whp.dbservice.model.assessment_whvalues_whcriterion"%>
<%@page import="com.iucn.whp.dbservice.service.assessment_whvalues_whcriterionLocalServiceUtil"%>
<%@page import="com.iucn.whp.dto.SiteAssessmentValues"%>
<%@page import="com.iucn.whp.dbservice.service.site_assessmentLocalServiceUtil"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.iucn.whp.dbservice.service.assessment_whvaluesLocalServiceUtil"%>
<%@page import="com.iucn.whp.dbservice.model.assessment_whvaluesClp"%>
<%@page import="com.iucn.whp.dbservice.model.assessment_whvalues"%>
<%@include file="/init.jsp" %>

<%
List<protection_mgmt_checklist_lkp> listProtection_mgmt_checklist_lkp=null;
List<protection_management_ratings_lkp> protection_management_ratings_lkpList=null;
protection_management objprotection_management= new protection_managementClp();

boolean isallfilled=false;
long assessmentVersionId=0;
String topic="";
long topicid=0;
String tempassessmentVersionId="";
try{
    String selectedPkey=request.getParameter("keyVal");
    
   /*  if(selectedPkey.contains("-")){
    	topicid=selectedPkey.substring(1);
    	selectedPkey="";
    } */
    	
    
    tempassessmentVersionId =request.getParameter("versionIdVal").toString();
    assessmentVersionId = Long.parseLong(tempassessmentVersionId);
    listProtection_mgmt_checklist_lkp=protection_mgmt_checklist_lkpLocalServiceUtil.findAll();
    protection_management_ratings_lkpList=protection_management_ratings_lkpLocalServiceUtil.findAll();
    
    
    if(selectedPkey!=null && !selectedPkey.isEmpty()){
    	objprotection_management=protection_managementLocalServiceUtil.getprotection_management(Long.parseLong(selectedPkey));
    	
    	for(int i=0;i<listProtection_mgmt_checklist_lkp.size();i++){
    		protection_mgmt_checklist_lkp temp=listProtection_mgmt_checklist_lkp.get(i);
    		if(objprotection_management.getTopic_id()==temp.getTopic_id()){
    			topic=temp.getTopic();
    			break;
    		}
   		
    		
    	}
    	
    		
    }else {
    	List<protection_management> lstprotection_management=protection_managementLocalServiceUtil.findByAssessementVersionId(assessmentVersionId);
    	int topid=0;
    	objprotection_management.setAssessment_version_id(assessmentVersionId);
    	objprotection_management.setJustification("");
    	objprotection_management.setPm_id(0);
    	objprotection_management.setRating(0);
    	if(lstprotection_management==null && lstprotection_management.isEmpty())
    	{	
    	
    	
    	
    		protection_mgmt_checklist_lkp temp=listProtection_mgmt_checklist_lkp.get(0);
    		temp.getTopic_id();
    		topic=temp.getTopic();
    			
    	objprotection_management.setTopic_id(temp.getTopic_id());		
    		
    	}else{
    		for(protection_management protection_managementobj:lstprotection_management)
    		{
    			int temptopicid=Integer.parseInt( protection_managementobj.getTopic_id()+"");
    	    	
    			if(temptopicid>topid)
    			{
    				topid= temptopicid;
    			}
    			
    			}
    		if(topid<listProtection_mgmt_checklist_lkp.size())
    		{
    			
    		
    		protection_mgmt_checklist_lkp temp=listProtection_mgmt_checklist_lkp.get(topid);
    		temp.getTopic_id();
    		topic=temp.getTopic();
    		objprotection_management.setTopic_id(temp.getTopic_id());
    		}
    		else{
    	
    			isallfilled=true;
			}		

    	}
    	
    }
}
catch(Exception ex){
	
}
%>

  <portlet:actionURL name="addprotectionmngt" var="step3" />
<portlet:resourceURL var="updateStatus">
<portlet:param name="assessmentVersionId" value= "<%= tempassessmentVersionId %>" />
</portlet:resourceURL>
<c:set var="versionId" value="<%= assessmentVersionId %>"/>
<c:set var="UpdateUrl" value="<%=step3 %>"/>
<c:set var="RefreshUrl" value="/assessment_jsp/innerJsp/step3_in.jsp"/>



  <aui:form 
    id="step3Form" 
	name="step3Form" 
	action=""
	method="post"
>

<% if(!isallfilled){ %>
		
	<table class="formBlock">
	
	    <aui:input
	        name="assessmentVersionId"
	        id="assessmentVersionId"
	        value="<%=assessmentVersionId %>"
	        type="hidden"
	    />
	    
	      <aui:input
	        name="topicId"
	        id="topicId"
	        value="<%=objprotection_management.getTopic_id() %>"
	        type="hidden"
	    />
	   
	    
	    <aui:input
	        name="protection_managementId"
	        id="protection_managementId"
	        value="<%=objprotection_management.getPrimaryKey() %>"
	        type="hidden"
	    />
	<tr>
	<td class="lblTD">
		<label class="popuplbl">Topic: </label>
	</td>
	<td>
	<label class="popuplbl" id="lbltopicId" style="width:400px;"><%=topic %> </label>
		<aui:input 
			type="hidden" 
			label="" 
			id="topic" 
			name= "topic" 
			value= "<%=topic %>"
			
			/>
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
			value= "<%=objprotection_management.getJustification() %>"
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
			 
			 if(tempprotection_management_ratings_lkp.getId()==objprotection_management.getRating())
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
		<input type="button" class="roundedcornerBTN" value="Previous" onclick="javascript:movePreviousForm()"/>
		<input type="button" id = "submitandmove" class="roundedcornerBTN" value="Submit & Move Next" onclick="javascript:validateStep_Form();"/>
		<input type="button" class="roundedcornerBTN" name="cancelButton" value="Cancel" onclick="javascript:top.document.getElementById('closethick').click();"/>
	</td>
	</tr>
	</table>
	<%}else{ %>
	<table class="formBlock">
	
		
				
	<tr>
		<td>
			<label >All topic Filled</label>
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
<script>



function movePreviousForm()
{
	var topicid = $('#<portlet:namespace/>topicId').val();
	
	
	topicid--;
	if(topicid>0)
		{
	getTopicdat(topicid);
		}
	
	else
		{
		
		alert("No previous topic available");
		
		}
	
	
}


function validateStep_Form(){
	/* setTimeout("submitandmove = false", 2000);  */
	/* $('#submitandmove').attr('disabled',true);	 */
    var isValid = true;
  
    var justification = $('#<portlet:namespace/>justification').val();

    var topicid = $('#<portlet:namespace/>topicId').val();

    topicid++;
  
 
 	
	var assessmentratings = $("#assessmentratings option:selected").val();
	
	
	if(justification==""){
		isValid =false;
		alert("Justification Of Assessment is required.");
	}
	
	else if(assessmentratings==0)
	{
	isValid =false;
		alert("Assessment Rating is required.");
	} 
	
	
	if(isValid){
		setTimeout("submitandmove = false", 2000); 
		submitAndMovePopupForm('${versionId }','${RefreshUrl}','step3Div_mgt','step3Form','${UpdateUrl }',3,topicid);
		$('#submitandmove').attr('disabled',true);	
		
	}


}
function submitAndMovePopupForm(versionId,jspPage,divId,formId,actionUrl,stepNum,topicid) {
	//$('#submitandmove').attr('disabled',true);
	   AUI().use('aui-io-request', function(A) {
		   
		    A.io.request(actionUrl, {
		      method: 'GET',
		      form: { id: '<portlet:namespace />'+formId},
		      on: {
		          success : function(response) { 
		            var stepDivId = "divStep"+stepNum;
		           	var jspName = "/assessment_jsp/tab_step"+stepNum+".jsp";
		            refreshTable(versionId,jspName,stepDivId);
		           	getTopicdat(topicid);
		            $('#submitandmove').attr('disabled',false);
		          }
		      	}
		    });
		  });

	   
	   

}

function getTopicdat(id)
{
	
jQuery.get('<%=updateStatus%>&ACTION_CMD=actionGetTopic&topic_id='+id,

		function(data) { 
			var parsedJSONObject = jQuery.parseJSON(data); 
			var result= parsedJSONObject.rows;
			if(result[0].islastrating){
			var rating=result[0].rating;
			var assessmentVersionId=result[0].assessmentVersionId;
			var justifiaction=result[0].justifiaction;
			var topic_id=result[0].topic_id;
			var topicvalue=result[0].topicvalue;
			var protectionId=result[0].protectionId;
			
			
/* 			alert(rating + " "+ assessmentVersionId + " "+ justifiaction+ " "+ topic_id+ " "+ topicvalue + " "+protectionId)
 */			
			   //$('#<portlet:namespace/>lbltopicId').innerHTML=topicvalue;
			 document.getElementById("lbltopicId").innerHTML = topicvalue;
			 $('#<portlet:namespace/>justification').val(justifiaction);
			 $('#assessmentratings').val(rating);
			 $('#<portlet:namespace/>topicId').val(topic_id);
			 $('#<portlet:namespace/>assessmentVersionId').val(assessmentVersionId);
			 $('#<portlet:namespace/>protection_managementId').val(protectionId);
	        



			
			}else{
				alert("All Topics are filled");
				top.document.getElementById('closethick').click();
			}		

		}
		); 

	
}

</script>

