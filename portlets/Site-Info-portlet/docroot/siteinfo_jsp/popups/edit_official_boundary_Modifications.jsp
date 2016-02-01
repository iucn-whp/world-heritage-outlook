<%@page import="java.util.Date"%>
<%@ include file="/siteinfo_jsp/init.jsp" %>

<portlet:defineObjects /> 
<%
	whp_sites_boundary_modification boundModId= new whp_sites_boundary_modificationClp();
	List<boundary_modification_type_lkp> lstBoundMod=null;
	long boundModificationTypeId= 0;
	String currentSiteId = "";
	try{
		String selectedPkey=request.getParameter("keyVal");
		currentSiteId = request.getParameter("siteIdVal");
		lstBoundMod=boundary_modification_type_lkpLocalServiceUtil.getAllBoundaryModificationType();
		if(selectedPkey!=null && !selectedPkey.isEmpty()){
			boundModId = whp_sites_boundary_modificationLocalServiceUtil.getwhp_sites_boundary_modification(Long.parseLong(selectedPkey));
			boundModificationTypeId = boundModId.getBmid();
		}
		else {
			boundModId.setMod_date(null);
			boundModId.setWhp_sites_boundary_modification_id(0);
			boundModId.setSite_id(Long.parseLong(currentSiteId));
			boundModId.setDescription("");
		}
	}
	catch(Exception ex){
		out.println("Ex------------"+ex.getMessage());
	}
%>
 <liferay-ui:success key="success" message="Boundary Modification saved successfully!" /> 
  <portlet:actionURL name="addSiteBoundaryModification" var="addSiteBoundMod"/>

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


<%-- <aui:script>

    AUI().use('aui-datepicker', function(A) {

       var simpleDatepicker1 = new A.DatePicker({
		calendar:{
       dates:[new Date('<%= boundModId.getMod_date() %>')],
        dateFormat: '%d/%m/%Y',
        selectMultipleDates: false
        },
         trigger: '#<portlet:namespace />boundaryModificationDate',

       }).render();
     
    });

</aui:script>
 --%>
 <c:set var="site_id" value="<%=currentSiteId %>"/>
<c:set var="UpdateUrl" value="<%=addSiteBoundMod %>"/>
<c:set var="RefreshUrl" value="/siteinfo_jsp/innerJSP/official_boundary_modification.jsp"/>

<aui:form 
	id="boundModForm" 
	name="boundModForm" 
	action=""
	method="post"> 
	<aui:input
        name="boundaryModificationId"
        id="boundaryModificationId"
        value="<%= boundModId.getWhp_sites_boundary_modification_id() %>"
        type="hidden"
    />
    <table class="formBlock"> 
    <aui:input
        name="siteID"
        id="siteID"
        value="<%= boundModId.getSite_id() %>"
        type="hidden"
    />
	<tr>
	<td>
	<label class="popuplbl">Date</label>
	</td>
	
	<div class="aui-datepicker aui-helper-clearfix" id="#<portlet:namespace />startDatePicker">
       <input type="hidden" name="startDate" id="<portlet:namespace />startDate" size="30" />
    </div>
    
	<td>
		<%-- <aui:input 
			label="" 
			style="width:355px;"
			name="boundaryModificationDate" 
			type="text" 
			id="boundaryModificationDate">
			<aui:validator name="required" />
	 	</aui:input> --%>
	 	
	 	<%if(boundModId.getMod_date()!=null){ %>

		<%
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(boundModId.getMod_date());
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


<%} %>
	 	
   	</td>
	</tr>
	<tr>
	<td>
	<label class="popuplbl">Type</label>
	</td>
	<td>
	<aui:select 
		label="" 
		style="width:355px;"
		id="boundaryModificationType" 
		name="boundaryModificationType">
		<option value="0">Select</option>
		<c:set var="boundaryModId" value="<%= boundModificationTypeId %>"/>
			<c:forEach items="<%=lstBoundMod %>" var="boundaryModificationType" varStatus="status">
				<aui:option selected="${boundaryModificationType.getBm_id()== boundaryModId}"
					value="${boundaryModificationType.getBm_id()}">
					<c:out value="${boundaryModificationType.getBm_type()}"/>
				</aui:option>
			</c:forEach>
	</aui:select>
	</td>
	</tr>
	<tr>
	<td>
	<label class="popuplbl">Description</label>
	</td>
	<td spellcheck="true">
	<aui:input 
	label="" 
	style="width:355px; height:90px;"
	id="boundaryModificationDescription" 
	name="boundaryModificationDescription"
	value="<%=boundModId.getDescription() %>"
	type="text">
	<aui:validator name="required" />
	</aui:input>
	</td>
	</tr>
	<tr>
	<td colspan="2" style="text-align:right;" >
		<aui:button name="" type="button" value="Submit" onclick="javascript:validateBoundMod();"/>
		<aui:button name="" type="button" value="Cancel" onclick="javascript:top.document.getElementById('closethick').click();"/>
	</td>
	</tr>
	</table>
</aui:form>

<script>
function validateBoundMod(){
	var isValid = true;
	var boundModType = $('#<portlet:namespace/>boundaryModificationType').val();
	var boundModDecs = $('#<portlet:namespace/>boundaryModificationDescription').val();
	var boundModDate = $('#<portlet:namespace/>startDate').val();
	
	if(boundModType==0){
		alert("Selcet any valid boundary modifications type");
		isValid = false;
	}else if(boundModDecs==""){
		alert("Description should not be empty");
		isValid = false;
	}else if (!isDate(boundModDate)){
	
		isValid = false;
	}

	if(isValid){
		submitPopupForm('${site_id }','${RefreshUrl}','BounModDiv','boundModForm','${UpdateUrl }');
	}
}

</script>

<script type="text/javascript">
        jQuery('#<portlet:namespace />m1').hide();
	    jQuery('#<portlet:namespace />d1').hide();
	    jQuery('.aui-datepicker-button-wrapper').hide();
</script>
