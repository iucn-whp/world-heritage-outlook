<%@page import="java.util.Comparator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Date"%>
<%@ include file="/siteinfo_jsp/init.jsp" %>
<%
    whp_sites_budget siteBudgetId= new whp_sites_budgetClp();
List<country_lkp> objCountry_lkp= country_lkpLocalServiceUtil.getAllCountries();
	String currentSiteId = "";
    try{
        String selectedPkey=request.getParameter("keyVal");
        currentSiteId = request.getParameter("siteIdVal");
        if(selectedPkey!=null && !selectedPkey.isEmpty()){
        	siteBudgetId = whp_sites_budgetLocalServiceUtil.getwhp_sites_budget(Long.parseLong(selectedPkey));
        }
        else {
        	siteBudgetId.setDate(null);
        	siteBudgetId.setWhp_sites_budget_id(0);
        	siteBudgetId.setSite_id(Long.parseLong(currentSiteId));
        	siteBudgetId.setCurrency_local(0);
        	siteBudgetId.setCurrency_usd(0);
        	siteBudgetId.setCurrency("");
        }
      
    }
    catch(Exception ex){
        out.println("Ex------------"+ex.getMessage());
    }
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
</aui:script>


<portlet:defineObjects /> 
 <liferay-ui:success key="success" message="Visitor added successfully!" /> 

  
    <portlet:actionURL name="addmgmtBudget" var="addmgmtBudget"/>
 
<c:set var="site_id" value="<%=currentSiteId %>"/>
<c:set var="UpdateUrl" value="<%=addmgmtBudget %>"/>
<c:set var="RefreshUrl" value="/siteinfo_jsp/innerJSP/mgmt_budget.jsp"/>
<aui:form 
	name="budgetForm" 
	id="budgetForm"
	action=""
	method="post"> 
	   <table class="formBlock"> 
	
		<aui:input
	        name="sitebudgetId"
	        id="sitebudgetId"
	        value="<%= siteBudgetId.getWhp_sites_budget_id() %>"
	        type="hidden"
	    />
	    <aui:input
	        name="siteID"
	        id="siteID"
	        value="<%= siteBudgetId.getSite_id() %>"
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
			style="width:370px;"
			name="budgetDate" 
			id="budgetDate">
   		</aui:input> --%>
   		
   		<%if(siteBudgetId.getDate()!=null){ %>

		<%
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(siteBudgetId.getDate());
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
	<label class="popuplbl">National Currency </label>
	</td>
	
	<td>
		<aui:input 
			label="" 
			style="width:370px;"
			name="nationalCurrency" 
			value="<%= siteBudgetId.getCurrency_local() %>" 
			id="nationalCurrency">
   			
   		</aui:input>
   		</td>
    </tr>
    
    <tr>
		<td><label class="popuplbl"> Currency Type :</label></td>
		<td>
		<aui:select 
			label="" 
			style="width:370px;"
			name="currencytype" 
			id="currencytype">
		<aui:option value="">Select Currency</aui:option>
		
	 
		 <% int size=objCountry_lkp.size();
		 List<String> lstCurrencies = new ArrayList<String>();
		for(int i=0;i<size;i++){
			country_lkp tempCountry_lkp=objCountry_lkp.get(i);
			String strCurreny = tempCountry_lkp.getCurrency();
			if(!strCurreny.isEmpty() && !lstCurrencies.contains(strCurreny) )
				lstCurrencies.add(tempCountry_lkp.getCurrency());
		}
		Collections.sort(lstCurrencies, new Comparator<String>(){
		    public int compare(String one, String other) {
		        return one.compareTo(other);
		    }
		});
		for(String currency:lstCurrencies){
			%>
			<aui:option selected="<%=currency.equalsIgnoreCase(siteBudgetId.getCurrency()) %>"
					value="<%=currency %>">
					<%=currency %>
				</aui:option>
			
		<%} %>
			
		</aui:select> 
		
		</td>
	</tr>
            
    <tr>
	<td>
	<label class="popuplbl">value In USD($) </label>
	</td>
	
	<td>
			
		<aui:input 
			label ="" 
			style="width:370px;"
			name="valueInUSD" 
			value="<%= siteBudgetId.getCurrency_usd() %>" 
			id="valueInUSD">
   			
   		</aui:input>
	</tr>
	

	
	
		
	<tr>
	<td colspan="2" style="text-align:right;" >
			<aui:button name="saveButton" type="button" value="Submit" onclick="javascript:validateBudgetForm();"/>
			<aui:button name="cancelButton" type="button" value="Cancel" onclick="javascript:top.document.getElementById('closethick').click();"/>
		</td>
		</tr>
		
			
		</table>
</aui:form>


    
<aui:script>

  <%--   AUI().use('aui-datepicker', function(A) {

      var simpleDatepicker1 = new A.DatePicker({
	  calendar:{
       	dates:[new Date('<%= siteBudgetId.getDate() %>')],
        dateFormat: '%d/%m/%Y',
        selectMultipleDates: false
       },
         trigger: '#<portlet:namespace />budgetDate',

       }).render();

    });
    
 --%>    function validateBudgetForm(){
	
	var isValid=true;
	var dateVal = $('#<portlet:namespace/>startDate').val();
	var ncurrency=$('#<portlet:namespace/>nationalCurrency').val();
	var vUSD=$('#<portlet:namespace/>valueInUSD').val();
	
	
	 if(!isDate(dateVal)){
		isValid=false;
	}
	else if(ncurrency=="" || parseFloat(ncurrency)<0 || isNaN(ncurrency)){
		alert('Please EnterValid currency');
		isValid = false;
	}
	 else if(vUSD==""|| parseFloat(vUSD)<0  || isNaN(vUSD)){
		alert('Please Enter Correct Value');
		isValid = false;
	}
	
	if(isValid){
		submitPopupForm('${site_id }','${RefreshUrl}','mgmtBudgetDiv','budgetForm','${UpdateUrl }');
	}
		
}
      
    
    
</aui:script>
		


<script type="text/javascript">
        jQuery('#<portlet:namespace />m1').hide();
	    jQuery('#<portlet:namespace />d1').hide();
	    jQuery('.aui-datepicker-button-wrapper').hide();
</script>


