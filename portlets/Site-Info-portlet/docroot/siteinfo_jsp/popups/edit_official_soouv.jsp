<%@page import="java.util.Date"%>
<%@ include file="/siteinfo_jsp/init.jsp" %>
<%
    whp_sites_soouv soouvId= new whp_sites_soouvClp();
	String currentSiteId = "";
    try{
        String selectedPkey=request.getParameter("keyVal");
        currentSiteId = request.getParameter("siteIdVal");
        if(selectedPkey!=null && !selectedPkey.isEmpty()){
        	soouvId = whp_sites_soouvLocalServiceUtil.getwhp_sites_soouv(Long.parseLong(selectedPkey));
        }
        else {
        	soouvId.setSoouv_date(null);
        	soouvId.setWhp_sites_soouv_id(0);
        	soouvId.setSite_id(Long.parseLong(currentSiteId));
        	soouvId.setDescription_en("");
        	soouvId.setDescription_fr("");
        }
    }
    catch(Exception ex){
        out.println("Ex------------"+ex.getMessage());
    }
%>
<portlet:defineObjects /> 
 <liferay-ui:success key="success" message="Statement Of Outstanding Universal Values saved successfully!" /> 
    <portlet:actionURL name="addSiteSOOUV" var="addSiteSOOUV"/>

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
	        dates:[new Date('<%= soouvId.getSoouv_date() %>')],
	        dateFormat: '%d/%m/%Y',
	        selectMultipleDates: false
        },
         trigger: '#<portlet:namespace />soouvDate',

       }).render();

    });
 </aui:script>
 --%>
  <c:set var="site_id" value="<%=currentSiteId %>"/>
<c:set var="UpdateUrl" value="<%=addSiteSOOUV %>"/>
<c:set var="RefreshUrl" value="/siteinfo_jsp/innerJSP/official_soouv.jsp"/>

<aui:form 
	id="soouvForm" 
	name="soouvForm" 
	action=""
	method="post">
	<table class="formBlock"> 
	<aui:input
        name="soouvId"
        id="soouvId"
        value="<%= soouvId.getWhp_sites_soouv_id() %>"
        type="hidden"
    />
    <aui:input
        name="siteID"
        id="siteID"
        value="<%= soouvId.getSite_id() %>"
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
		style="width:325px;"
		name="soouvDate" 
		type="text" 
		id="soouvDate">
	
	</aui:input> --%>
	
	<%if(soouvId.getSoouv_date() !=null){ %>

		<%
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(soouvId.getSoouv_date());
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
	<label class="popuplbl">Adaptation(En)</label>
	</td>
	<td spellcheck="true">
	<aui:input 
		label="" 
		style="width:325px; height:90px;"
		id="soouvEnAdaptation" 
		name="soouvEnAdaptation" 
		type="textarea"
		value="<%=soouvId.getDescription_en() %>">
		<aui:validator name="required" />
	</aui:input>
	</td>
	</tr>
	
	<tr>
	<td>
	<label class="popuplbl">Adaptation(Fr)</label>
	</td>
	<td spellcheck="true">
	<aui:input 
		label="" 
		style="width:325px; height:90px;"
		id="soouvFrAdaptation" 
		name="soouvFrAdaptation" 
		type="textarea"
		value="<%=soouvId.getDescription_fr() %>">
	</aui:input>
	</td>
	</tr>	
	
	<tr>
	<td colspan="2" style="text-align:right;" >
		<aui:button name="" type="button" value="Submit" onclick="javascript:validateSoouv();"/>
		<input type="reset" value="Cancel" onclick="javascript:top.document.getElementById('closethick').click();">
	</td>
	</tr>
	</table>
</aui:form>
		
<script>
function validateSoouv(){
	var isValid = true;
	var soouvEnAdapt = $('#<portlet:namespace/>soouvEnAdaptation').val();
	var soouvDate = $('#<portlet:namespace/>startDate').val();
	
	if(soouvEnAdapt==""){
		alert("English adaptation should not be empty");
		isValid = false;
	}else if (!isDate(soouvDate)){
	
		isValid = false;
	}

	if(isValid){
		submitPopupForm('${site_id }','${RefreshUrl}','soouvDiv','soouvForm','${UpdateUrl }');
	}
}

</script>


<script type="text/javascript">
        jQuery('#<portlet:namespace />m1').hide();
	    jQuery('#<portlet:namespace />d1').hide();
	    jQuery('.aui-datepicker-button-wrapper').hide();
</script>
