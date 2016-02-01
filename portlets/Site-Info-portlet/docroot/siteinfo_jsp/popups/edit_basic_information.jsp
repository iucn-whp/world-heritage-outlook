<!-- created by Sonil for edit Basic Information-->

<%@ include file="/siteinfo_jsp/init.jsp" %>

<%
    whp_sites siteId= new whp_sitesClp();
	String currentSiteId="";
    try{
        String selectedPkey=request.getParameter("keyVal");
        currentSiteId = request.getParameter("siteIdVal");
        if(selectedPkey!=null && !selectedPkey.isEmpty()){
        	siteId = whp_sitesLocalServiceUtil.getwhp_sites(Long.parseLong(selectedPkey));
        }
    }
    catch(Exception ex){
        out.println("Ex------------"+ex.getMessage());
    }
%>

    
<portlet:defineObjects /> 
 <liferay-ui:success key="success" message="Basic Information saved successfully!" /> 
   
    <portlet:actionURL name="editSiteBasicDetails" var="addSiteBI" />

<c:set var="site_id" value="<%=currentSiteId %>"/>
<c:set var="UpdateUrl" value="<%=addSiteBI %>"/>
<c:set var="RefreshUrl" value="/siteinfo_jsp/innerJSP/basic_information_edit.jsp"/>


<aui:script>

   AUI().use('aui-datepicker', function(A) {
  var simpleDatepicker1 = new A.DatePicker({
calendar:{
        dateFormat: '%d/%m/%Y',
        selectMultipleDates: false
        },
trigger: '#<portlet:namespace />startDate',

}).render('##<portlet:namespace />startDatePicker');

});
</aui:script>




<aui:form 
	id="SitebasicInfoForm" 
	name="SitebasicInfoForm" 
	action=""
	method="post" >
			        
<table class="formBlock"> 
	<tr>
	<td><label class="popuplbl">IUCN ID :</label></td>
		<td>	
			<label class="popuplbl"><%=siteId.getSite_id() %></label>
			
			<aui:input 
				label="" 
				style="width:350px;"
				type="hidden" 
				name="iucnId" 
				value="<%=siteId.getSite_id() %>"
				id="iucnId"
				readonly="true"
				/></td>
	</tr>

	<tr>
		<td><label class="popuplbl">WDPA ID :</label></td>
		<td>	
			<aui:input 
				label="" 
				style="width:350px;"
				type="text" 
				name="wdpaId" 
				value="<%=siteId.getWdpa_id() %>"
				id="wdpaId">
    		</aui:input>
    	</td>
	</tr>
	
	<tr>
		<td><label class="popuplbl">UNESCO ID :</label></td>
		<td>	
			<aui:input 
				label="" 
				style="width:350px;"
				type="text" 
				name="unescoId" 
				value="<%=siteId.getUnesco_id() %>"
				id="unescoId">
    		</aui:input>
    	</td>
	</tr>
	
	<tr>
		<td><label class="popuplbl">Site Name(En) :</label></td>
		<td spellcheck="true">	
			<aui:input 
				label="" 
				style="width:350px;"
				type="textarea" 
				name="siteNameEn" 
				value="<%=siteId.getName_en() %>"
				id="siteNameEn">
    		</aui:input>
    	</td>
	</tr>
	
	<tr>
		<td><label class="popuplbl">Site Name(Fr) :</label></td>
		<td spellcheck="true">	
			<aui:input 
				label="" 
				style="width:350px;"
				type="textarea" 
				name="siteNameFr" 
				value="<%=siteId.getName_fr() %>"
				id="siteNameFr">
    			
    		</aui:input>
    	</td>
	</tr>

	<tr>
		<td><label class="popuplbl">Cultural Landscape :</label></td>
		<td>	
		<c:set var="cultural" value="<%= siteId.getCultural_landscape()%>"/>		
			<aui:select label="" name="culturalLand" id="culturalLand" style="width:350px;">
				<aui:option selected="${cultural== true}"
					value="1">
					<c:out value="Yes"/>
				</aui:option>
				<aui:option selected="${cultural== false}"
					value="2">
					<c:out value="No"/>
				</aui:option>
		</aui:select></td>
	</tr>

	<tr>
		<td><label class="popuplbl">Mixed Site :</label></td>
		<td>
		<label class="popuplbl"><%=(siteId.getMixed_site()==true)? "Yes": "No" %></label>
		<aui:input 
				label="" 
				style="width:350px;"
				type="hidden" 
				name="mixedSite" 
				value="<%=siteId.getMixed_site() %>"
				id="mixed"
				readonly="true"
				/>	
		</td>
	</tr>
	<tr>
		<td><label class="popuplbl">Inscription year :</label></td>
		
	   <div class="aui-datepicker aui-helper-clearfix" id="#<portlet:namespace />startDatePicker">
       <input type="hidden" name="startDate" id="<portlet:namespace />startDate" size="30" />
       </div>
       
        
		<td>	
			<%-- <aui:input 
				label="" 
				style="width:350px;"
				type="text" 
				name="siteInscriptionYear" 
				value=""
				id="siteInscriptionYear">
				</aui:input> --%>
				<%if(siteId.getInscription_date()!=null){ %>

		<%
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(siteId.getInscription_date());
		int year = cal.get(Calendar.YEAR);
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int month = cal.get(Calendar.MONTH);
		
		%>
		<liferay-ui:input-date 
		dayValue="<%= day %>"
		monthValue="<%= month %>"
		yearRangeStart="1960"
		yearValue="<%= year %>"
		yearRangeEnd="2050"
		dayParam="DobDay"
		monthParam="DobMonth"
		yearParam="DobYear"/>  
<% } else{%>

<%
Calendar cal = Calendar.getInstance();
   
   int day = cal.get(Calendar.DAY_OF_MONTH);
   int month = cal.get(Calendar.MONTH);
   int year = cal.get(Calendar.YEAR);

%>
        <liferay-ui:input-date 
		dayValue="<%= day %>"
		monthValue="<%= month %>"
		yearRangeStart="1960"
		yearValue="<%= year %>"
		yearRangeEnd="2050"
		dayParam="DobDay"
		monthParam="DobMonth"
		yearParam="DobYear"/>
       <br />

<%} %>
				
				
				</td>
	</tr>

	<tr>
	<td colspan="2" style="text-align:right;" >
			<aui:button name="saveButton" type="button" value="Submit" onclick="javascript:validateBasicForm();" />
		
			<aui:button name="cancelButton" type="button" value="Cancel" onclick="javascript:top.document.getElementById('closethick').click();"/>
	</td>
	</tr>

</table>
</aui:form>

<aui:script>

	function validateBasicForm(){
	
	var isValid = true;
	var wdpa = $('#<portlet:namespace/>wdpaId').val();
	var unesco = $('#<portlet:namespace/>unescoId').val();
	var siteName = $('#<portlet:namespace/>siteNameEn').val();
	var siteYear = $('#<portlet:namespace/>startDate').val();
	
	if(!wdpa.match(/^[0-9]*$/) || wdpa==""){
		alert('Please enter valid number in WDPA ID');
		isValid = false;
	}
	else if(!unesco.match(/^[0-9]*$/) || unesco==""){
		
		alert('Please enter valid number in UNESCO ID');
		isValid = false;
		
	}
	else if(siteName=="" && !isNaN(siteName)){
		alert('Please enter Site Name');
		isValid = false;
	}
	else if (!isDate(siteYear)){
		isValid = false;
	}
	else {
		isValid =true;
	}
	
	
	if(isValid){
		submitPopupForm('${site_id }','${RefreshUrl}','basicInfoEdit','SitebasicInfoForm','${UpdateUrl }');
	}
}	
   <%--  AUI().use('aui-datepicker', function(A) {

       var simpleDatepicker1 = new A.DatePicker({
       calendar:{
       dates:[new Date('<%=siteId.getInscription_date() %>')],
        dateFormat: '%d/%m/%Y',
        selectMultipleDates: false
       },

        trigger: '#<portlet:namespace />siteInscriptionYear',

       }).render();
		
    });
 --%>
 </aui:script>


<script type="text/javascript">
        jQuery('#<portlet:namespace />m1').hide();
	    jQuery('#<portlet:namespace />d1').hide();
	    jQuery('.aui-datepicker-button-wrapper').hide();
</script>
