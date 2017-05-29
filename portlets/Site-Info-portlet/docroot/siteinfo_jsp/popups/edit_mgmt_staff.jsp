<%@page import="java.util.Date"%>
<%@ include file="/siteinfo_jsp/init.jsp" %>
<%
    whp_sites siteStaffId= new whp_sitesClp();
	String currentSiteId = "";
    try{
        String selectedPkey=request.getParameter("keyVal");
        currentSiteId = request.getParameter("siteIdVal");
        if(selectedPkey!=null && !selectedPkey.isEmpty()){
        	siteStaffId = whp_sitesLocalServiceUtil.getwhp_sites(Long.parseLong(selectedPkey));
        	if(siteStaffId.getStaff_update_date()== null ||siteStaffId.getStaff_update_date().toString().isEmpty()){
        		siteStaffId.setStaff_update_date(new Date());
        	}
        }
        else {
        	siteStaffId.setSite_id(Long.parseLong(currentSiteId));
        	siteStaffId.setStaff(0);
        	siteStaffId.setStaff_update_date(null);
        }
    }
    catch(Exception ex){
        out.println("Ex------------"+ex.getMessage());
    }
%>

<portlet:defineObjects /> 
 <liferay-ui:success key="success" message="Staff Count added successfully!" /> 
      <portlet:actionURL name="addStaffCount" var="addStaffCount"/>
      
<c:set var="site_id" value="<%=currentSiteId %>"/>
<c:set var="UpdateUrl" value="<%=addStaffCount %>"/>
<c:set var="RefreshUrl" value="/siteinfo_jsp/innerJSP/mgmt_staff.jsp"/>
     
<aui:script>
   <%--  AUI().use('aui-datepicker', function(A) {

      var simpleDatepicker1 = new A.DatePicker({
	  calendar:{
       	dates:[new Date('<%= siteStaffId.getStaff_update_date() %>')],
        dateFormat: '%d/%m/%Y',
        selectMultipleDates: false
       },
         trigger: '#<portlet:namespace />staffUpdateDate',

       }).render();

    });
 --%>
     function validateStaffForm(){
	
	var isValid=true;
	var dateVal = $('#<portlet:namespace/>startDate').val();
	var count=$('#<portlet:namespace/>textStaffCount').val();
	
	if(!isDate(dateVal)){
		isValid=false;
	} else if(! count.match(/^[0-9]*$/) ||  count=="" || parseInt(count)<0){
		alert('Please enter valid count');
		isValid = false;
	}
	if(isValid){
	submitPopupForm('${site_id }','${RefreshUrl}','mgmtStaffDiv','staffForm','${UpdateUrl }');
	}
		
}
</aui:script>


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
	id="staffForm" 
	name="staffForm" 
	action="" 
	method="post">
	   <table class="formBlock"> 

	<aui:input
        name="siteID"
        id="siteID"
        value="<%= siteStaffId.getSite_id() %>"
        type="hidden"
	    /> 
	    <tr>
	<td>
	<label class="popuplbl"> Update Date:</label>
	</td>
	
	 <div class="aui-datepicker aui-helper-clearfix" id="#<portlet:namespace />startDatePicker">
       <input type="hidden" name="startDate" id="<portlet:namespace />startDate" size="30" />
    </div>
     
	<td>
    <%-- <aui:input 
		label="" 
		style="width:385px;"
		name="staffUpdateDate"
		value="" 
		id="staffUpdateDate">
 	</aui:input> --%>
 	
 	<%if(siteStaffId.getStaff_update_date()!=null){ %>

		<%
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(siteStaffId.getStaff_update_date());
		int year = cal.get(Calendar.YEAR);
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int month = cal.get(Calendar.MONTH);
		
		%>
		<liferay-ui:input-date 
		dayValue="<%= day %>"
		monthValue="<%= month %>"
		yearRangeStart="1960"
		yearValue="<%= year %>"
		yearRangeEnd="2020"
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
	<label class="popuplbl"> Count</label>
	</td>
	
	<td>
	<aui:input 
		label="" 
		style="width:385px;"
		id="textStaffCount" 
		name="textStaffCount" 
		value="<%=siteStaffId.getStaff() %>"
		type="text">
   		</aui:input>
   		</td>
	<tr>
	<td colspan="2" style="text-align:right;" >
		<aui:button name="saveButton" type="button" value="Submit" onclick="javascript:validateStaffForm();"/>
		<aui:button name="cancelButton" type="button" value="Cancel" onclick="javascript:top.document.getElementById('closethick').click();"/>
	</td>
    </tr>
  </table>					
</aui:form>

<script type="text/javascript">
        jQuery('#<portlet:namespace />m1').hide();
	    jQuery('#<portlet:namespace />d1').hide();
	    jQuery('.aui-datepicker-button-wrapper').hide();
</script>

