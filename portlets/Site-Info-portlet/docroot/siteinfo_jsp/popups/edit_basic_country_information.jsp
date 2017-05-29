<!-- created by Sonil for edit the country in Basic Information of Site-->

<%@page import="java.util.ArrayList"%>
<%@ include file="/siteinfo_jsp/init.jsp" %>

<%
    whp_sites siteId= new whp_sitesClp();
	List<country_lkp> lstcountry_lkp = new ArrayList<country_lkp>();
	int countryId =0;
	country_lkp country_lkpObj = new country_lkpClp();
	String currentSiteId = "";
    try{
        String selectedPkey=request.getParameter("keyVal");
        currentSiteId = request.getParameter("siteIdVal");
        siteId = whp_sitesLocalServiceUtil.getwhp_sites(Long.parseLong(currentSiteId));
        lstcountry_lkp = country_lkpLocalServiceUtil.getAllCountries();
        if(selectedPkey!=null && !selectedPkey.isEmpty()){
        	country_lkpObj = country_lkpLocalServiceUtil.getcountry_lkp(Integer.parseInt(selectedPkey));
        	countryId = country_lkpObj.getCountryid();
        }else country_lkpObj.setCountryid(0);
    }
    
    catch(Exception ex){
        out.println("Ex------------"+ex.getMessage());
    }
%>
    
<portlet:defineObjects /> 
 <liferay-ui:success key="success" message="Basic Country Information added successfully!" /> 
   
    <portlet:actionURL name="editSiteBasicCountryInfo" var="addSiteBCI" />

<portlet:resourceURL var="addsiteCountryURL">
  <portlet:param name="siteId" value="<%=currentSiteId %>"/>
</portlet:resourceURL>
<c:set var="site_id" value="<%=currentSiteId %>"/>
<c:set var="UpdateUrl" value="<%=addSiteBCI %>"/>
<c:set var="RefreshUrl" value="/siteinfo_jsp/innerJSP/basic_information_country_edit.jsp"/>	   


<aui:form 
	id="SiteBasicCountryInfoForm" 
	name="SiteBasicCountryInfoForm"
	action=""
	method="post" >
	
<%-- <aui:form 
	id="SitebasicInfoForm" 
	name="SitebasicInfoForm" 
	action="javascript:submitPopupForm('${site_id }','${RefreshUrl}','basicInfoEdit','SitebasicInfoForm','${UpdateUrl }');"
	method="post" > --%>
			        
<table class="formBlock"> 
	<aui:input
	        name="siteID"
	        id="siteID"
	        value="<%=currentSiteId%>"
	        type="hidden"
		/>

	<tr>
		<td>
		<label class="popuplbl"> Country</label>
		</td>
		<td>
		<aui:select 
			label="" 
			style="width:380px;"
			name="countryId" 			
			id="countryId">
		<option >select</option>
		
			<c:forEach items="<%=lstcountry_lkp %>" var="siteCountry" varStatus="status">
				<aui:option value="${siteCountry.getCountryid()}">
					<c:out value="${siteCountry.getName()}"/>
				</aui:option>
		</c:forEach>
		</aui:select>
		</td>
	</tr>
	

	<tr>
	<td colspan="2" style="text-align:right;" >
			<aui:button name="saveButton" type="button" value="Save" onclick="javascript:checkExist2();" />
		
			<aui:button name="cancelButton" type="button" value="Cancel" onclick="javascript:top.document.getElementById('closethick').click();"/>
			</td>
	</tr>
	
</table>
</aui:form>

<script>

function checkExist2() {
	
	var selval=$('#<portlet:namespace/>countryId').val();
	var siteval=$('#<portlet:namespace/>siteID').val();
	jQuery.get('<%=addsiteCountryURL %>&ACTION_CMD=SiteCountryList&CountryID='+selval+'&siteID='+siteval,  

	function(data) {  
	var parsedJSONObject = jQuery.parseJSON(data);  
	var result= parsedJSONObject.rows;
	if(result[0].isCountryExist=='true' || result[0].isCountryExist==true){
		alert('Country already exist');
	}else{
		submitPopupForm('${site_id }','${RefreshUrl}','basicInfoCountryAdd','SiteBasicCountryInfoForm','${UpdateUrl }');
	}  
	}
	);
	}
</script>


<!--

//-->
</script>
