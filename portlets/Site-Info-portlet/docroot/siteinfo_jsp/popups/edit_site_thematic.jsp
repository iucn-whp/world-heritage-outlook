<%@page import="java.util.Date"%>
<%@ include file="/siteinfo_jsp/init.jsp" %>

<%
sites_thematic sites_thematicobj= new sites_thematicClp();
thematic_lkp thematic_lkpobj= new thematic_lkpClp();
List<thematic_lkp> lstthematic_lkp=null;
long thematicId=0l;
String currentSiteId = "";

try
{
	
	 String selectedPkey=request.getParameter("keyVal");
     currentSiteId = request.getParameter("siteIdVal");
     lstthematic_lkp=thematic_lkpLocalServiceUtil.getAllThematic();
     if(selectedPkey!=null && !selectedPkey.isEmpty()){
    	 
    	 sites_thematicobj=sites_thematicLocalServiceUtil.getsites_thematic(Long.parseLong(selectedPkey));
    	 thematic_lkpobj=thematic_lkpLocalServiceUtil.fetchthematic_lkp(sites_thematicobj.getThematicid());
    	 thematicId=thematic_lkpobj.getThematicid();
     }
     else
     {
    	 sites_thematicobj.setSite_id(Long.parseLong(currentSiteId));
    	 sites_thematicobj.setThematicid(0l);
    	 sites_thematicobj.setSitethematicid(0l);
    	 
     }
     
  
}catch(Exception e)
{
	 out.println("Ex------------"+e.getMessage());
}
%>
<portlet:defineObjects /> 
 <liferay-ui:success key="success" message="Indiginous Communities added successfully!" /> 
 
     <portlet:actionURL name="AddsiteThematic" var="AddsiteThematic"/>
 
 
<c:set var="site_id" value="<%=currentSiteId %>"/>
<c:set var="UpdateUrl" value="<%=AddsiteThematic %>"/>
<c:set var="RefreshUrl" value="/siteinfo_jsp/innerJSP/sites_thematic.jsp"/> 

<aui:form 
	name="sitesthematicForm" 
	id="sitesthematicForm"
	action="" 
	method="post">
		<table class="formBlock"> 
	
	<aui:input
        name="siteID"
        id="siteID"
        value="<%= sites_thematicobj.getSite_id() %>"
        type="hidden"
	/>
    <aui:input
        name="sitesthematicID"
        id="sitesthematicID"
        value="<%= sites_thematicobj.getSitethematicid() %>"
        type="hidden"
    />
	 <%-- <aui:input
	 	label="Other Designations" 
		name="OtherDesignations" 
		value="<%=otherDesignationDetail.getDesignation() %>" 
		id="OtherDesignations"/> --%>
	<tr>
	<td>
	<label class="popuplbl"> Site Theme</label>
	</td>
	<td>
	<aui:select 
	label="" 
	id="OtherThematics" 
	style="width:350px;"
	name="OtherThematics">
			<option value="0">Select</option>
			<c:set var="OtherThematicId" value="<%= thematicId %>"/>
			<c:forEach items="<%=lstthematic_lkp %>" var="otherThematic" varStatus="status">
				<aui:option selected="${otherThematic.getThematicid()== OtherThematicId}"
					value="${otherThematic.getThematicid()}">
					<c:out value="${otherThematic.getThematic()}"/>
				</aui:option>
			</c:forEach>
							
	</aui:select>
		</td>
	</tr>
		
	<tr>
	<td colspan="2" style="text-align:right;" >
		<aui:button name="saveButton" type="button" value="Submit" onclick="javascript:validateDesignation();"/>
		<aui:button name="cancelButton" type="button" value="Cancel" onclick="javascript:top.document.getElementById('closethick').click();"/>
	</td>
		</tr>
		</table>					
</aui:form>


<script>
function validateDesignation(){
	
	var isValid = true;
	var OtherThematics = $('#<portlet:namespace/>OtherThematics').val();
	
	if(OtherThematics==0){
		alert("Please select any Theme");
		isValid= false;
	}else {
		<%
		
		List<sites_thematic> lstSitesThematic=sites_thematicLocalServiceUtil.getSitesThematicBySiteId(Long.parseLong(currentSiteId));
		for(int j=0;j<lstSitesThematic.size();j++){   	
			
	    	try{
	    		
	    		
	    		
	    		long site_thematic_id = lstSitesThematic.get(j).getThematicid();        		
	    	%>
	    	var other_thematicn = <%= site_thematic_id %>;
	    	if(OtherThematics==other_thematicn){
	    		alert("Selected Theme already added");
	    		isValid= false;
	    	}
	    	<%	        		
	    		    		
	    		
	    	}catch(Exception ex){
	    		System.out.println("EXCEPTION:"+ ex.getStackTrace()+"------"+ex.getStackTrace());
	    	}
	    	
	    	
	    	
		}
		%>
	}
	if(isValid)
		submitPopupForm('${site_id }','${RefreshUrl}','sitesThematicsDiv','sitesthematicForm','${UpdateUrl }');
}
</script>


