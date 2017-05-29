<%@page import="java.util.Date"%>
<%@ include file="/siteinfo_jsp/init.jsp" %> 

<%
whp_site_danger_list dangerListId= new whp_site_danger_listClp();;
List<danger_list_status_lkp> lstDangerStatus=null;
long dangerId= 0;
String currentSiteId="";
try{
	String selectedPkey=request.getParameter("keyVal");
	currentSiteId = request.getParameter("siteIdVal");
	lstDangerStatus=danger_list_status_lkpLocalServiceUtil.getAllDangerListType();
	if(selectedPkey!=null && !selectedPkey.isEmpty()){
		dangerListId = whp_site_danger_listLocalServiceUtil.getwhp_site_danger_list(Long.parseLong(selectedPkey));
		dangerId = dangerListId.getStatus_id();
	}
	else {
		dangerListId.setYear(null);
		dangerListId.setWhp_site_danger_list_id(0);
		dangerListId.setSite_id(Long.parseLong(currentSiteId));

	}
}
catch(Exception ex){
	out.println("Ex------------"+ex.getMessage());
}
%>
<portlet:defineObjects /> 
 <liferay-ui:success key="success" message="Danger List added successfully!" /> 
    <portlet:actionURL name="addSiteDangerList" var="addSiteDangerList"/>
    
<c:set var="site_id" value="<%=currentSiteId %>"/>
<c:set var="UpdateUrl" value="<%=addSiteDangerList %>"/>
<c:set var="RefreshUrl" value="/siteinfo_jsp/innerJSP/official_danger_list.jsp"/>

<aui:form 
	id="dangerForm" 
	name="dangerForm" 
	action="" 
	method="post"> 
		<table class="formBlock"> 
		<aui:input
	        name="dangerListId"
	        id="dangerListId"
	        value="<%= dangerListId.getWhp_site_danger_list_id() %>"
	        type="hidden"
	    />
	    <aui:input
	        name="siteID"
	        id="siteID"
	        value="<%= dangerListId.getSite_id() %>"
	        type="hidden"
	    />
		<tr>
		<td>
		<label class="popuplbl">Date</label>
		</td>
		
		<div class="aui-datepicker aui-helper-clearfix" id="#<portlet:namespace />startDatePicker">
       <input type="hidden" name="startDate" id="<portlet:namespace />startDate" size="30" />
        </div> 
    
		<td><%if(dangerListId.getYear()!=null){ %>

		<%
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(dangerListId.getYear());
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


    
		
		<%-- <aui:input 
	
			label="" 
			name="dangerDate" 
			value=""
			id="dangerDate"
			style="width:380px;">
			</aui:input>
	 --%>
	 	</td>
		</tr>	
		<tr>
		<td>
		<label class="popuplbl">Status</label>
		</td>
		<td>
		<aui:select 
			label="" 
			id="dangerType" 
			name="dangerType"
			style="width:380px;">
			<aui:option value="0">Select</aui:option>
				<c:set var="dangerId" value="<%= dangerId %>"/>
				<c:forEach items="<%=lstDangerStatus %>" var="dangerStatus" varStatus="status">
					<aui:option selected="${dangerStatus.getDlstatus_id()== dangerId}"
						value="${dangerStatus.getDlstatus_id()}">
						<c:out value="${dangerStatus.getDl_status()}"/>
					</aui:option>
				</c:forEach>
		</aui:select>
		</td>
		</tr>
		<tr>
	<td colspan="2" style="text-align:right;" >
			<aui:button name="" type="button" value="Submit" onclick="javascript:validateDanger();"/>
			<aui:button name="" type="button" value="Cancel" onclick="javascript:top.document.getElementById('closethick').click();"/>
		</td>
		</tr>
</table>		
</aui:form>
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


<%-- AUI().use('aui-datepicker', function(A) {

       var simpleDatepicker1 = new A.DatePicker({
       calendar:{
       dates:[new Date('<%= dangerListId.getYear() %>')],
        dateFormat: '%d/%m/%Y',
        selectMultipleDates: false
        
       },

        trigger: '#<portlet:namespace />dangerDate',

       }).render();
		
    });
 --%>
 </aui:script>

<script>
function validateDanger(){
	var isValid = true;
	var dangerType = $('#<portlet:namespace/>dangerType').val();
	var dangerDate = $('#<portlet:namespace/>startDate').val();
	
	if(dangerType==0){
		alert("Selcet any valid danger type");
		isValid = false;
	}else if (!isDate(dangerDate)){
		isValid = false;
	}

	if(isValid){
		submitPopupForm('${site_id }','${RefreshUrl}','dangerDiv','dangerForm','${UpdateUrl }');
	}
}

</script>

<script type="text/javascript">
        jQuery('#<portlet:namespace />m1').hide();
	    jQuery('#<portlet:namespace />d1').hide();
	    jQuery('.aui-datepicker-button-wrapper').hide();
</script>
