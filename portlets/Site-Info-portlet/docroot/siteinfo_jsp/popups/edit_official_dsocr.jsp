<%@page pageEncoding="UTF-8"%>
<%@ page import="java.util.Date"%>
<%@page import="java.util.Calendar" %>
<%@page import="java.util.Date"%>
<%@ include file="/siteinfo_jsp/init.jsp" %>
<%
    whp_sites_dsocr dsocrId= new whp_sites_dsocrClp();
	String currentSiteId = "";
    try{
        String selectedPkey=request.getParameter("keyVal");
        currentSiteId = request.getParameter("siteIdVal");
        if(selectedPkey!=null && !selectedPkey.isEmpty()){
        	dsocrId = whp_sites_dsocrLocalServiceUtil.getwhp_sites_dsocr(Long.parseLong(selectedPkey));
        }
        else {
        	dsocrId.setDsocr_date(null);
        	dsocrId.setWhp_sites_dsocr_id(0);
        	dsocrId.setSite_id(Long.parseLong(currentSiteId));
        	dsocrId.setState_description("");
        }
    }
    catch(Exception ex){
        out.println("Ex------------"+ex.getMessage());
    }
%>

<portlet:defineObjects /> 
 <liferay-ui:success key="success" message="DSOCR saved successfully!" /> 
  <portlet:actionURL name="addSiteDscor" var="addSitedscor"/>
<%-- <aui:script>

    AUI().use('aui-datepicker', function(A) {

       var simpleDatepicker1 = new A.DatePicker({
		calendar:{
       dates:[new Date('<%= dsocrId.getDsocr_date() %>')],
        dateFormat: '%d/%m/%Y',
        selectMultipleDates: false
        },
         trigger: '#<portlet:namespace />dsocrDate',

       }).render();

    });
</aui:script>
 --%>

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
<c:set var="site_id" value="<%=currentSiteId %>"/>
<c:set var="UpdateUrl" value="<%=addSitedscor %>"/>
<c:set var="RefreshUrl" value="/siteinfo_jsp/innerJSP/official_dsocr.jsp"/>

<aui:form 
	id="dsocrForm" 
	name="dsocrForm" 
	action="<%=addSitedscor %>"
	method="get"> 
	<table class="formBlock"> 
	<aui:input
        name="dsocrId"
        id="dsocrId"
        value="<%= dsocrId.getWhp_sites_dsocr_id() %>"
        type="hidden"
    />
    <aui:input
        name="siteID"
        id="siteID"
        value="<%= dsocrId.getSite_id() %>"
        type="hidden"
    />
	
	<tr>
	<td>
	<label class="popuplbl">Date</label>
	</td>
	
	
	<%-- <aui:input 
		label="" 
		style="width:390px;"
		name="dsocrDate" 
		type="text" 
		id="dsocrDate">
	</aui:input> --%>
	
	 <div class="aui-datepicker aui-helper-clearfix" id="#<portlet:namespace />startDatePicker">
       <input type="hidden" name="startDate" id="<portlet:namespace />startDate" size="30" />
    </div> 

<td>

<%if(dsocrId.getDsocr_date()!=null){ %>

		<%
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(dsocrId.getDsocr_date());
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

     <br />	</td>
	</tr>
	
	<tr>
	<td>
	<label class="popuplbl">State</label>
	</td>
	<td>
	<aui:input 
		label="" 
		style="width:390px;"
		id="dsocrState" 
		name="dscorState" 
		value="<%= dsocrId.getState_description() %>"
		type="text">
	</aui:input>
	</td>
	</tr>
		
	<tr>
	<td colspan="2" style="text-align:right;" >
		<aui:button name="" type="button" value="Submit" onclick="javascript:validatedsocr();"/>
		<aui:button type="button" value="Cancel" onclick="javascript:top.document.getElementById('closethick').click();"/>
	</td>
	</tr>
	</table>
</aui:form>

<script>
function validatedsocr(){
	var isValid = true;
	var dsocrState = $('#<portlet:namespace/>dsocrState').val();
	var dsocrDate = $('#<portlet:namespace/>startDate').val();
	
	
	
	
	if(dsocrState==0){
		alert("Selcet any valid type for DSOCR");
		isValid = false;
	} else if (!isDate(dsocrDate)){
	
		isValid = false;
	}

	
	
	if(isValid){
		
 		submitPopupForm('${site_id }','${RefreshUrl}','dscorDiv','dsocrForm','${UpdateUrl }');
 }
}

</script>
	
	
<script type="text/javascript">
        jQuery('#<portlet:namespace />m1').hide();
	    jQuery('#<portlet:namespace />d1').hide();
	    jQuery('.aui-datepicker-button-wrapper').hide();
</script>
