<%@ include file="/siteinfo_jsp/init.jsp" %>
<%@ page import="java.util.ArrayList"%>
<%@ page import="com.iucn.whp.dbservice.service.persistence.*" %>


<%
String currentSiteId="";
//List<whp_contact> lstContact=new ArrayList<whp_contact>();
List<whp_contact> lstContact=null;
try{
	String selectedPkey=request.getParameter("keyVal");
	currentSiteId = request.getParameter("siteIdVal");	
	lstContact=whp_contactLocalServiceUtil.getAllContact();
	
}
catch(Exception ex){
	out.println("Ex------------"+ex.getMessage());
}

%>
<portlet:defineObjects /> 
 <liferay-ui:success key="success" message="Inscription Criteria saved successfully!" /> 
    <portlet:actionURL name="addExistingContact" var="addExistingContact" />
    
<c:set var="site_id" value="<%=currentSiteId %>"/>
<c:set var="UpdateUrl" value="<%=addExistingContact %>"/>
<c:set var="RefreshUrl" value="/siteinfo_jsp/innerJSP/contact_information.jsp"/>

<portlet:resourceURL var="addsiteContactURL">
  <portlet:param name="siteId" value="<%=currentSiteId %>"/>
</portlet:resourceURL>
 
<aui:form 
	id="existingContactForm" 
	name="existingContactForm" 
	action="javascript:checkExist();"
	method="post"> 
	<table class="formBlock">
	
    <aui:input
        name="siteID"
        id="siteID"
        value="<%= currentSiteId %>"
        type="hidden"
    />
	<tr>
	<td>
	<label class="popuplbl">Contact</label>
	</td>
	<td >
	<aui:select 
	label="" 
	id="contactID" 
	name="contactID"
	style="width:380px;"
	>
			<option value="0">Select</option>			
			<c:forEach items="<%=lstContact %>" var="contacts" varStatus="status">
				<aui:option 
					value="${contacts.getContact_id()}">
					<c:out value="${contacts.getFirst_name()} ${contacts.getLast_name()} "/>
				</aui:option>
			</c:forEach>
							
	</aui:select>
	</td>
	</tr>
	<tr>
	<td colspan="2" style="text-align:right;" >
		<aui:button name="" type="submit" value="Submit"/>
		<aui:button name="" type="button" value="Cancel" onclick="javascript:top.document.getElementById('closethick').click();" />
	</td>
	</tr>
</table>
</aui:form>





<script>
<%-- function checkExist(_siteid){
	
		
	var selval=$('#<portlet:namespace />contactID').val();
	//alert(selval);
	
	var lst='<%=whp_sites_contactsLocalServiceUtil.getAllWhpContactsBySiteId(
			Long.parseLong(request.getParameter("siteIdVal")))%>';
	
			alert("Size##"+'<%=whp_sites_contactsLocalServiceUtil.getAllWhpContactsBySiteId(
			Long.parseLong(request.getParameter("siteIdVal"))).size()%>'); 
	
			var len='<%=whp_sites_contactsLocalServiceUtil.getAllWhpContactsBySiteId(
		Long.parseLong(request.getParameter("siteIdVal"))).size()%>';
	
		alert("lenL: "+len );
	
	<%int i=-1;%>
	for(var j=0;j<len;j++){
		alert("J:"+ j);
		
		<%i=i+1;
		System.out.println("I" + i);
		%>
		alert("val"+ '<%=whp_sites_contactsLocalServiceUtil.getAllWhpContactsBySiteId(
			Long.parseLong(request.getParameter("siteIdVal"))).get(i).getContactid()%>');
		
		if(<%=whp_sites_contactsLocalServiceUtil.getAllWhpContactsBySiteId(
			Long.parseLong(request.getParameter("siteIdVal"))).get(i).getContactid()%>==selval){
			alert('match');
			//break;
			//return;
			
		}
		
	}

	
}
 --%>

function checkExist() {

var selval=$('#<portlet:namespace />contactID').val();
jQuery.get('<%=addsiteContactURL %>&ACTION_CMD=ADD_CONTACT&ContactID='+selval,  

function(data) {  
var parsedJSONObject = jQuery.parseJSON(data);  
var result= parsedJSONObject.rows;
if(result[0].isContactExist=='true' || result[0].isContactExist==true){
	alert('Contact already exist');
}else{
	submitPopupForm('${site_id }','${RefreshUrl}','contactInfoDiv','existingContactForm','${UpdateUrl }');
}  
}
);
}

</script>
