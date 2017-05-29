<%@ include file="/siteinfo_jsp/init.jsp" %>
<%
String currentSiteId="";
/*
whp_sites_inscription_criteria inscriptionCriteriaId= new whp_sites_inscription_criteriaClp();
List<inscription_criteria_lkp> lstInscriptionCriteria=null;
long inscriptionId= 0; */
try{
	//String selectedPkey=request.getParameter("keyVal");
	currentSiteId = request.getParameter("siteIdVal");
	//lstInscriptionCriteria= inscription_criteria_lkpLocalServiceUtil.getAllInscriptionCriteria();
	/* if(selectedPkey!=null && !selectedPkey.isEmpty()){
		inscriptionCriteriaId = whp_sites_inscription_criteriaLocalServiceUtil.getwhp_sites_inscription_criteria(Long.parseLong(selectedPkey));
		inscriptionId = inscriptionCriteriaId.getCriteria_id();
	}
	else {
		
		inscriptionCriteriaId.setCriteria_id(0);
		inscriptionCriteriaId.setWhp_sites_inscription_criteria_id(0);
		inscriptionCriteriaId.setSite_id(Long.parseLong(currentSiteId));
	} */
}
catch(Exception ex){
	out.println("Ex------------"+ex.getMessage());
}
//whp_sites_inscription_date InscDate = (whp_sites_inscription_date) request.getAttribute("editInscriptionHistoryJSP");
%>
<portlet:defineObjects /> 
 <liferay-ui:success key="success" message="Image upload successfully!" /> 
   
    <portlet:actionURL name="updateSiteThumbnail" var="updateThumbnail" />
  	 <portlet:resourceURL var="updateContent1">
 		<portlet:param name="siteId" value="<%=currentSiteId %>" />
 		<portlet:param name="jspPage" value="/siteinfo_jsp/innerJSP/official_inscription_criteria.jsp" />
 	</portlet:resourceURL>
 
<aui:form 
	id="thumbnailForm" 
	name="thumbnailForm" 
	action="javascript:submitThumbnail();" 
	method="post"> 
	<table class="formBlock">
	
    <aui:input
        name="siteID"
        id="siteID"
        value="<%= currentSiteId %>"
        type="hidden"
    />
	<tr>
	<td>
	<label class="popuplbl">File: </label>
	</td>
	<td >
	<aui:input
        name="filePath"
        id="filePath"
        value=""
        type="file">
    <aui:validator name="required" />
    </aui:input>
	</td>
	</tr>
	<tr>
	<td colspan="2" align="right" >
	<aui:button-row>
		<aui:button name="" type="submit" value="Submit"/>
		<aui:button name="" type="button" value="Cancel" onclick="javascript:top.document.getElementById('closethick').click();" />
	</aui:button-row>
	</td>
	</tr>
</table>
</aui:form>

<script language="javascript" type="text/javascript">
  function submitThumbnail() {
	  var src="/Site-Info-portlet/upload/thumb2.jpg"	  
	  $('#thumbnailImg').attr('src', src);  
   <%-- AUI().use('aui-io-request', function(A) {
   
    A.io.request('<%= updateThumbnail %>', {
      method: 'GET',
      form: { id: '<portlet:namespace />criteriaForm'},
      on: {
          success : function() { 
        	  refreshData1();
              top.document.getElementById('closethick').click();
          }
      }
    });
  }); --%>
  
  
}
  
  function refreshData1(siteID) {
		
	   AUI().use('aui-io-request', function(A) {
	   A.io.request('<%= updateContent1 %>', {
	      // autoLoad: false,
	      //dataType: 'json',
	      data: {
		    siteIdParam: siteID
		  },
	      method: 'POST',
	     // form: { id: '<portlet:namespace />myForm'},
	      on: {
	          success : function() { 
	        	 $('#inscriptionCriteriaDiv').html(this.get('responseData'));
	          }
	      }
	    });
	  });
	}

</script>