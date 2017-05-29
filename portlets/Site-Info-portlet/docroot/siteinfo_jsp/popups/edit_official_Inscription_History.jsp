<%@page import="java.util.Date"%>
<%@ include file="/siteinfo_jsp/init.jsp" %>

<%
 whp_sites_inscription_date InscDate=new whp_sites_inscription_dateClp();
List<inscription_type_lkp> lstTypes=null;
String currentSiteId="";
int inscriptionId= 0;
try{
	String selectedPkey=request.getParameter("keyVal");
	currentSiteId = request.getParameter("siteIdVal");
	lstTypes=inscription_type_lkpLocalServiceUtil.getAllInscriptionType();
	System.out.println("Site id------------"+currentSiteId);
	if(selectedPkey!=null && !selectedPkey.equalsIgnoreCase("")){
		//System.out.println("InscDatea------------"+selectedPkey);
		InscDate = whp_sites_inscription_dateLocalServiceUtil.getwhp_sites_inscription_date(Long.parseLong(selectedPkey));
		
		//System.out.println("InscDatea>>>>------------"+InscDate.getInscription_date());
		inscriptionId = InscDate.getInscription_type_id();
	}
	else{
		InscDate.setInscription_date(null);
		InscDate.setInscription_type_id(0);
		InscDate.setSite_id(Long.parseLong(currentSiteId));
		
	}
}
catch(Exception ex){
	out.println("Ex------------"+ex.getMessage());
}
//whp_sites_inscription_date InscDate = (whp_sites_inscription_date) request.getAttribute("editInscriptionHistoryJSP");
%>
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
    
    
    
 <%--    AUI().use('aui-datepicker', function(A) {

       var simpleDatepicker1 = new A.DatePicker({
	calendar:{
       dates:[new Date('<%= InscDate.getInscription_date() %>')],
        dateFormat: '%d/%m/%Y',
        selectMultipleDates: false
        },
         trigger: '#<portlet:namespace />inscriptionDate1',

       }).render();

    });
 --%>
 </aui:script>
<portlet:actionURL name="EditInscriptionHistory" var="updateHistoryURL" />
 	
<c:set var="site_id" value="<%=currentSiteId %>"/>
<c:set var="UpdateUrl" value="<%=updateHistoryURL %>"/>
<c:set var="RefreshUrl" value="/siteinfo_jsp/innerJSP/official_inscription_history.jsp"/>
<aui:form
	id="historyForm"
    name="historyForm"
    action=""
    method="post">
   <table class="formBlock"> 
     <aui:input
        name="inscriptionDateId"
        id="inscriptionDateId"
        value="<%= InscDate.getWhp_sites_inscription_date_id() %>"
        type="hidden"
    />
    <aui:input
        name="siteID"
        id="siteID"
        value="<%= InscDate.getSite_id() %>"
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
    	id="inscriptionDate1"
        name="inscriptionDate1"
        type="text" 
        style="width:370px;" 
        >
	</aui:input> --%>
	
	
	<%if(InscDate.getInscription_date() !=null){ %>

		<%
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(InscDate.getInscription_date());
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
	<label class="popuplbl">Inscription Type</label>
	</td>
	
	<td>
   <aui:select 
		label=""
		id="inscriptionType" 
		name="inscriptionType"
		style="width:370px;">
		<aui:option value="0">Select</aui:option>
		<c:set var="inscriptionId" value="<%= inscriptionId %>"/>
		<c:forEach items="<%=lstTypes %>" var="inscriptionType" varStatus="status">
			<aui:option selected="${inscriptionType.getIncription_type_id()== inscriptionId}"
				value="${inscriptionType.getIncription_type_id()}">
				<c:out value="${inscriptionType.getType()}"/>
			</aui:option>
		</c:forEach>
	</aui:select>
	</td>
	</tr>
	
	<tr>
	<td>
	<label class="popuplbl">Reference No</label>
	</td>
	<td>
	<aui:input 
		label=""
		id="referenceNo" 
		name="referenceNo" 
		style="width:370px;"
		value="<%=InscDate.getReference_no() %>"
		type="text">
	</aui:input>
	</td>
	</tr>
		
	<tr>
	<td colspan="2" style="text-align:right;" >
      <aui:button 
      	  name="saveButton"
      	  id="saveButton"
	      type="button" 
	      onclick="javascript:validateHistory();"
	      value="Submit"/>
      <aui:button
      	name="cancelButton"
          type="button"
          value="Cancel"
          onclick="javascript:top.document.getElementById('closethick').click();"/>
    </td>
    </tr>
  </table>
</aui:form>
<script>
function validateHistory(){
	var isValid = true;
	var insHistory = $('#<portlet:namespace/>inscriptionType').val();
	var reference = $('#<portlet:namespace/>referenceNo').val();
	var insDate = $('#<portlet:namespace/>startDate').val();
	
	if(insHistory==0){
		alert("Selcet any valid inscription type");
		isValid = false;
	}else if(reference==""){
		alert("Reference number should not be empty");
		isValid = false;
	}else if (!isDate(insDate)){
		isValid = false;
	}


	if(isValid){
		//alert("tretret");
		submitPopupForm('${site_id}','${RefreshUrl}','inscriptionDateDiv','historyForm','${UpdateUrl}');

	}
}

</script>


<script type="text/javascript">
        jQuery('#<portlet:namespace />m1').hide();
	    jQuery('#<portlet:namespace />d1').hide();
	    jQuery('.aui-datepicker-button-wrapper').hide();
</script>

