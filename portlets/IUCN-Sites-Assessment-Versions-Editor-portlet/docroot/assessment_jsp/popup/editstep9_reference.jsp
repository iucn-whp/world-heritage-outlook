<%@ include file="/init.jsp" %>
<%@page import="com.iucn.whp.dbservice.model.assessment_whvaluesClp"%>
<%@page import="com.iucn.whp.dbservice.model.*"%>


<%


   long assessmentVersionId=0;
   String rn="";
   List<references> lstreferences=null;
   references referencesObj=null;
  
  long    rnvalue=0;
  

try{
	lstreferences= referencesLocalServiceUtil.findByAssessmentId(assessmentVersionId);
    String selectedPkey=request.getParameter("keyVal");
    assessmentVersionId = Long.parseLong(request.getParameter("versionIdVal"));
    
    if(selectedPkey!=null && !selectedPkey.isEmpty())
    {
    	referencesObj=referencesLocalServiceUtil.getreferences(Long.parseLong(selectedPkey));
    	
    	
    }
    else{
    	 referencesObj= new referencesClp();  
    	referencesObj.setAssessment_version_id(assessmentVersionId);
    	referencesObj.setReference_id(0);
    	referencesObj.setReferences("");
    	//referencesObj.setRn(0);
    	
    }
  
    	/* if(referencesObj.getRn()>0){
    		rn=referencesObj.getRn()+"";
    	}else rn=""; */
  
}
    catch(Exception ex){
	    out.println("Ex------------"+ex.getMessage());
	}

%>
<portlet:defineObjects /> 
<portlet:actionURL name="referencedetails" var="step9" />
<c:set var="versionId" value="<%= assessmentVersionId %>"/>
<c:set var="UpdateUrl" value="<%=step9 %>"/>
<c:set var="RefreshUrl" value="/assessment_jsp/innerJsp/step9_references.jsp"/>
<aui:form 
name="referenceform" 
 id="referenceform"
action="" 
method="post">
 <table class="formBlock"> 

<aui:input
    name="assessmentVersionId"
    id="assessmentVersionId"
    value="<%=referencesObj.getAssessment_version_id() %>"
    type="hidden"
    />
    
    
    <aui:input
    name="referenceID"
    id="referenceID"
    value="<%=referencesObj.getReference_id()%>"
    type="hidden"
    />
    
     <aui:input
 	label="" 
 	style="width:400px;"
 	name="referencern" 
	value="<%= rn  %>"
	id="referencern"
	 type="hidden"
	/>
   <%--  <tr>
    
 <td>
<label class="popuplbl"> Rn</label>
</td> -->
<td>
 <aui:input
 	label="" 
 	style="width:400px;"
 	name="referencern" 
	value="<%= rn  %>"
	id="referencern"
	 type="hidden"
	/>
	
		
</td>
</tr>--%>
<tr>
<td class="lblTD">
       <label class="popuplbl"> References</label>
</td>

<td spellcheck="true" class="valueTD">
    <aui:input
 	    label="" 
 	    type="textarea"
 	    name="referencesub" 
	    value="<%=referencesObj.getReferences() %>" 
	    id="referencesub"
	    
	    />

</td>
</tr>





	
 <tr>
<td class="btnTD" colspan="2" >
	<aui:button name="saveButton" type="button" value="Submit" onclick="javascript:validatereferenceForm();"/>
	<aui:button name="cancelButton" type="button" value="Cancel" onclick="javascript:top.document.getElementById('closethick').click();"/>
</td>
	</tr> 
	</table>				
</aui:form>


<script>

	function validatereferenceForm(){
	
	var isValid = true;
	 var sub = $('#<portlet:namespace/>referencesub').val();
	var rn = $('#<portlet:namespace/>referencern').val();
	
	if(sub==""){
	    isValid=false;
	     alert("References is Required");
	}
	
	/* else if(rn==""  ){
	    isValid=false;
	     alert("Rn is Required");
	} 
	 else if(isNaN(rn)){
	    isValid=false;
	     alert("Rn Should be Numeric"); 
	} 
	 */
	
	if(isValid){
   		$("input[type=button]").attr("disabled", "disabled");
		submitPopupForm('<%=assessmentVersionId %>','${RefreshUrl}','step9Div','referenceform','${UpdateUrl}','9');
	}
	
}
</script>

   