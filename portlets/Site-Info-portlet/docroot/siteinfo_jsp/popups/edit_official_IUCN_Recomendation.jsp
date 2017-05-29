<%@page import="java.util.Date"%>
<%@ include file="/siteinfo_jsp/init.jsp" %>
<%
whp_sites_iucn_recommendation iucnRecmId= new whp_sites_iucn_recommendationClp();;
List<recommendation_type_lkp> lstIucnRecm=null;
long iucnRecommendationTypeId= 0;
String currentSiteId ="";
try{
    String selectedPkey=request.getParameter("keyVal");
  	currentSiteId = request.getParameter("siteIdVal");
    lstIucnRecm=whp_sites_iucn_recommendationLocalServiceUtil.getAllRecommendationType();
    if(selectedPkey!=null && !selectedPkey.isEmpty()){
    	iucnRecmId = whp_sites_iucn_recommendationLocalServiceUtil.getwhp_sites_iucn_recommendation(Long.parseLong(selectedPkey));
    	iucnRecommendationTypeId = iucnRecmId.getRecommendation_type();
    }
    
    else {
    	iucnRecmId.setRec_date(null);
    	iucnRecmId.setWhp_sites_iucn_recommendation_id(0);
    	iucnRecmId.setSite_id(Long.parseLong(currentSiteId));
    	iucnRecmId.setRecommendation_type(0);
    }
}
catch(Exception ex){
    out.println("Ex------------"+ex.getMessage());
}
%> 
<portlet:defineObjects /> 
 <liferay-ui:success key="success" message="IUCN Recomendation saved successfully!" /> 
  
  
    <portlet:actionURL name="addSiteIUCNRRecomendation" var="addSiteIUCNR"/>

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
<%-- 
    AUI().use('aui-datepicker', function(A) {

       var simpleDatepicker1 = new A.DatePicker({
	calendar:{
       dates:[new Date('<%= iucnRecmId.getRec_date() %>')],
        dateFormat: '%d/%m/%Y',
        selectMultipleDates: false
        },
         trigger: '#<portlet:namespace />recommendationDate',

       }).render();

    });
 --%>
 
 </aui:script>
<c:set var="site_id" value="<%=currentSiteId %>"/>
<c:set var="UpdateUrl" value="<%=addSiteIUCNR %>"/>
<c:set var="RefreshUrl" value="/siteinfo_jsp/innerJSP/official_iucn_recommendation.jsp"/>

<aui:form 
	id="iucnRecommendationForm" 
	name="iucnRecommendationForm" 
	action="" 
	method="post"> 
	<table class="formBlock"> 
	<aui:input
        name="iucnRecommendationId"
        id="iucnRecommendationId"
        value="<%= iucnRecmId.getWhp_sites_iucn_recommendation_id() %>"
        type="hidden"
    />
    <aui:input
        name="siteID"
        id="siteID"
        value="<%= iucnRecmId.getSite_id() %>"
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
    	name="recommendationDate" 
    	type="text" 
    	style="width:395px;"
    	id="recommendationDate">
	</aui:input> --%>
	
	<%if(iucnRecmId.getRec_date()!=null){ %>

		<%
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(iucnRecmId.getRec_date());
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
		style="width:395px;"
		id="recommendationType" 
		name="recommendationType">
		<option value="0">Select</option>
		<c:set var="recomTypeId" value="<%= iucnRecommendationTypeId %>"/>
			<c:forEach items="<%=lstIucnRecm %>" var="recommendation" varStatus="status">
				<aui:option selected="${recommendation.getRec_type_id()== recomTypeId}"
					value="${recommendation.getRec_type_id()}">
					<c:out value="${recommendation.getRecommendation()}"/>
				</aui:option>
			</c:forEach>
	</aui:select>
	</td>
	</tr>
	<tr>
	<td colspan="2" style="text-align:right;" >
		<aui:button name="" type="button" value="Submit" onclick="javascript:validateRecom();"/>
		<aui:button name="" type="button" value="Cancel" onclick="javascript:top.document.getElementById('closethick').click();"/>
	</td>
	</tr>
	</table> 
</aui:form>				
<script>
function validateRecom(){
	var isValid = true;
	var recomType = $('#<portlet:namespace/>recommendationType').val();
	var recomDate = $('#<portlet:namespace/>startDate').val();
	
	if(recomType==0){
		alert("Selcet any valid recommendation type");
		isValid = false;
	}else if (!isDate(recomDate)){
		isValid = false;
	}

	if(isValid){
		submitPopupForm('${site_id }','${RefreshUrl}','iucnRecomDiv','iucnRecommendationForm','${UpdateUrl }');
	}
}

</script>


<script type="text/javascript">
        jQuery('#<portlet:namespace />m1').hide();
	    jQuery('#<portlet:namespace />d1').hide();
	    jQuery('.aui-datepicker-button-wrapper').hide();
</script>
