<%@page import="java.util.Date"%>
<%@ include file="/siteinfo_jsp/init.jsp" %>
<%
    whp_sites_visitors siteVisitorId= new whp_sites_visitorsClp();
String currentSiteId ="";
    try{
        String selectedPkey=request.getParameter("keyVal");
        currentSiteId = request.getParameter("siteIdVal");
        if(selectedPkey!=null && !selectedPkey.isEmpty()){
        	siteVisitorId = whp_sites_visitorsLocalServiceUtil.getwhp_sites_visitors(Long.parseLong(selectedPkey));
        }
        else {
        	siteVisitorId.setRecord_date(null);
        	siteVisitorId.setWhp_sites_visitors_id(0);
        	siteVisitorId.setSite_id(Long.parseLong(currentSiteId));
        	siteVisitorId.setVisitor_count(0);
        }
    }
    catch(Exception ex){
        out.println("Ex------------"+ex.getMessage());
    }
%>
<portlet:defineObjects /> 
 <liferay-ui:success key="success" message="Visitors Count added successfully!" /> 
    <portlet:actionURL name="addmgmtVisitor" var="addVisitorCount"/>
  
  <c:set var="site_id" value="<%=currentSiteId %>"/>
<c:set var="UpdateUrl" value="<%=addVisitorCount %>"/>
<c:set var="RefreshUrl" value="/siteinfo_jsp/innerJSP/mgmt_visitor.jsp"/>
    
    
    
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
    
    
<aui:script>

   <%--  AUI().use('aui-datepicker', function(A) {

       	var simpleDatepicker1 = new A.DatePicker({
		calendar:{
       		dates:[new Date('<%= siteVisitorId.getRecord_date() %>')],
        	dateFormat: '%d/%m/%Y',
        	setValue: true,
        	selectMultipleDates: false
        },
                
         trigger: '#<portlet:namespace />visitorDate',

       }).render();

    });
 
 --%> 
 
 function validateForm(){
	
	var isValid=true;
	var dateVal = $('#<portlet:namespace/>startDate').val();
	var count=$('#<portlet:namespace/>visitorCount').val();

	 if(!isDate(dateVal)){
		isValid=false;
	} else if(!count.match(/^[0-9]*$/) ||  count=="" || parseInt(count)<0){
		alert('Please enter valid count');
		isValid = false;
	}
	if(isValid){
	submitPopupForm('${site_id }','${RefreshUrl}','mgmtVisitorDiv','visitorForm','${UpdateUrl }');
	}
		
}
 </aui:script>


<aui:form 
	id="visitorForm" 
	name="visitorForm" 
	action="" 
	method="post"> 
	   <table class="formBlock"> 
	
	<aui:input
        name="siteVisitorId"
        id="siteVisitorId"
        value="<%= siteVisitorId.getWhp_sites_visitors_id() %>"
        type="hidden"
	    />
	<aui:input
        name="siteID"
        id="siteID"
        value="<%= siteVisitorId.getSite_id() %>"
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
			label=" " 
			style="width:390px;"
			name="visitorDate" 
			type="text" 
			id="visitorDate">
		</aui:input> --%>
		
		<%if(siteVisitorId.getRecord_date()!=null){ %>

		<%
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(siteVisitorId.getRecord_date());
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
	<label class="popuplbl">Count</label>
	</td>
	
	<td>
	<aui:input 
		label="" 
		style="width:390px;"
		name="visitorCount" 
		type="text" 
		value="<%=siteVisitorId.getVisitor_count() %>"
		id="visitorCount">
		</aui:input>
		</td>
		<tr>
	<td colspan="2" style="text-align:right;" >
		<aui:button name="saveButton" type="button" value="Submit" onclick="javascript:validateForm();"/>
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



