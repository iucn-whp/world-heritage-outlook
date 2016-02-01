<!-- created by Sonil for edit Basic Information-->

<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ include file="/siteinfo_jsp/init.jsp" %>
<liferay-theme:defineObjects />

   
<portlet:defineObjects /> 
 <liferay-ui:success key="success" message="Basic Information saved successfully!" /> 
   
<portlet:actionURL name="addSiteBasicDetails" windowState="<%=LiferayWindowState.EXCLUSIVE.toString() %>" var="addSiteBesic" />


<c:set var="UpdateUrl" value="<%=addSiteBesic %>"/>
<c:set var="RefreshUrl" value="SiteInfo_view.jsp"/>


<aui:form 
	id="basicInfoForm" 
	name="basicInfoForm" 
	action="<%=addSiteBesic %>"
	method="post" >
			        
<table class="formBlock"> 

			<aui:input 
				label="" 
				type="hidden" 
				name="userId" 
				value="<%=user.getUserId() %>"
				id="userId"/>
	
	<tr>
		<td><label class="popuplbl">WDPA ID :</label></td>
		<td>	
			<aui:input 
				label="" 
				style="width:200px;"
				type="text" 
				name="wdpaId" 
				value=""
				id="wdpaId">
    		</aui:input></td>
	</tr>
	
	<tr>
		<td><label class="popuplbl">UNESCO ID :</label></td>
		<td>	
			<aui:input 
				label="" 
				style="width:200px;"
				type="text" 
				name="unescoId" 
				value=""
				id="unescoId">
    		</aui:input></td>
	</tr>
	
	<tr>
		<td><label class="popuplbl">Site Name(En) :</label></td>
		<td spellcheck="true">	
			<aui:input 
				label="" 
				style="width:200px;"
				type="textarea" 
				name="siteNameEn" 
				value=""
				id="siteNameEn">
				</aui:input></td>
	</tr>
	
	<tr>
		<td><label class="popuplbl">Site Name(Fr) :</label></td>
		<td spellcheck="true">	
			<aui:input 
				label="" 
				style="width:200px;"
				type="textarea" 
				name="siteNameFr" 
				value=""
				id="siteNameFr"/></td>
	</tr>

	<tr>
		<td><label class="popuplbl">Cultural Landscape :</label></td>
		<td>	
		<aui:select label="" name="culturalLand" id="culturalLand" style="width:200px;">
				<aui:option	value="1">Yes				
				</aui:option>
				<aui:option value="2">No
									</aui:option>
		</aui:select></td>
	</tr>

	<%-- <tr>
		<td><label class="popuplbl">Mixed Site :</label></td>
		<td>	
			<aui:select label="" name="mixedSite" id="mixed" style="width:200px;">
				<aui:option value="1">
					Yes
				</aui:option>
				<aui:option value="2">
					No
				</aui:option>
		</aui:select></td>
	</tr> --%>
	<tr>
		<td><label class="popuplbl">Inscription year :</label></td>
		<td>	
			<aui:input 
				label="" 
				style="width:200px;"
				type="text" 
				name="siteInscriptionYear" 
				value=""
				id="siteInscriptionYear">
    		</aui:input></td>
	</tr>
	

	<tr>
	<td colspan="2" style="text-align:right;" >
			<aui:button name="saveButton" type="button" value="Save" onclick = "javascript:validateSiteForm();" />
			<aui:button name="cancelButton" type="button" value="Cancel" onclick="javascript:top.document.getElementById('closethick').click();"/>
	</td>
	</tr>

</table>
</aui:form>
<aui:script>

    AUI().use('aui-datepicker', function(A) {

       var simpleDatepicker1 = new A.DatePicker({
       calendar:{
       dates:[new Date()],
        dateFormat: '%d/%m/%Y',
        selectMultipleDates: false
       },

        trigger: '#<portlet:namespace />siteInscriptionYear',

       }).render();
		
    });
    
    function validateSiteForm(){
	
	var isValid = true;
	var wdpa = $('#<portlet:namespace/>wdpaId').val();
	var unesco = $('#<portlet:namespace/>unescoId').val();
	var siteName = $('#<portlet:namespace/>siteNameEn').val();
	var siteYear = $('#<portlet:namespace/>siteInscriptionYear').val();
	
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
	
	
	if(isValid){
 		document.forms["<portlet:namespace/>basicInfoForm"].submit();
 		
		
	}
}
</aui:script>
