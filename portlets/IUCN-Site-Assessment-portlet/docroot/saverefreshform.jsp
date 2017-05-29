<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<portlet:resourceURL var="updateContent"/>
<portlet:resourceURL var="updateStatus"/>
<portlet:defineObjects />

<liferay-ui:error key="error" message="Sorry, Data not added" />


<script language="javascript" type="text/javascript">

  function submitPopupForm(versionId,jspPage,divId,formId,actionUrl,stepNum) {
   AUI().use('aui-io-request', function(A) {
   
    A.io.request(actionUrl, {
      method: 'GET',
      form: { id: '<portlet:namespace />'+formId},
      on: {
          success : function(response) { 
            top.document.getElementById('closethick').click();
            var stepDivId = "divStep"+stepNum;
           	var jspName = "/assessment_jsp/tab_step"+stepNum+".jsp";
           	if(stepNum>0){
           		refreshTable(versionId,jspName,stepDivId);
           	}
            if(stepNum==1){
             	refreshTable(versionId,"/assessment_jsp/tab_step4.jsp","divStep4");
             	refreshTable(versionId,"/assessment_jsp/tab_step2.jsp","divStep2");
         	}
            if(stepNum>1 && stepNum<5){
             	refreshTable(versionId,"/assessment_jsp/tab_step5.jsp","divStep5");
         	}
            if(stepNum==0 || stepNum==""){
            	refreshTable(versionId,jspPage,divId);
            }
          }
      	}
    });
  });
}
  
  function deletewhValues(versionId,valueId,actionUrl,tableName) {
		jQuery.get('<%=updateStatus %>&ACTION_CMD=deleteWhvalues&WHValueId='+valueId+' &tableName='+tableName+'&versionId='+versionId,  

		function(data) { 
			var parsedJSONObject = jQuery.parseJSON(data); 
			var result= parsedJSONObject.rows;
			if(result[0].isDeleted){
				var versionId = result[0].versionId;
				refreshTable(versionId,"/assessment_jsp/tab_step4.jsp","divStep4");
             	refreshTable(versionId,"/assessment_jsp/tab_step2.jsp","divStep2");
             	 refreshTable(versionId,"/assessment_jsp/tab_step1.jsp","divStep1");
			}	  
		}); 
	  
	}
  
  function refreshTable(assessment_versionId,p_jspPage,contentDiv) {
	   AUI().use('aui-io-request', function(A) {
	   A.io.request('<%= updateContent %>', {
	      data: {
	    	  assessment_versionId: assessment_versionId,jspPageDiv: p_jspPage
		  },
	      method: 'POST',
	      on: {
	          success : function() { 
	        	 parent.$('#'+contentDiv).html(this.get('responseData'));
	          }
	      }
	    });
	  });
	}
  
  function validateDelete(versionId,RefreshUrl,currentDiv,id,valueType){
	  	var actionCMD = "";
		if(valueType=="whValue")
			actionCMD = "assessmentWHValue";
		else actionCMD = "assessmentBioValue";
		
		jQuery.get('<%=updateStatus %>&ACTION_CMD='+actionCMD+'&WHValueId='+id+ '&versionId='+versionId,   

		function(data) { 
			var parsedJSONObject = jQuery.parseJSON(data); 
			var result= parsedJSONObject.rows;
			if(result[0].isValueAttached){
				var threatVal=result[0].threats;
				var whValue=result[0].whValue;
				var valueType=result[0].valueType;
				var value_id=result[0].whValueId;
				var versionId = result[0].assessmentVersionId;
				if (confirm("Value '"+whValue+ "' is associated with "+threatVal+" and also part of Current State and Trends. Are you sure to delete it?")){
					deletewhValues(versionId ,value_id,'${DeleteUrl}',valueType);
				}
			}else{

				var valueType=result[0].valueType;
				var bio="";
				if(valueType=="BioValue"){
					bio="Other Important Biodiversity Values";
				}else
					bio="Identifying And Describing Values";
				
				deletePopup(RefreshUrl,currentDiv ,result[0].whValueId,bio);
			}  
		}
		); 
		
	}
  

</script>

