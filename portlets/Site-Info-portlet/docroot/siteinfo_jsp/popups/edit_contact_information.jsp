<%@page import="com.iucn.whp.dbservice.service.persistence.whp_contactPersistence"%>
<%@ include file="/siteinfo_jsp/init.jsp" %>

<%
    whp_sites_contacts siteContactId= new whp_sites_contactsClp();
	whp_contact contactDetails = new whp_contactClp();
	List<contact_category> lstContactCategory= null;
	String currentSiteId=null;
    try{
        String selectedPkey=request.getParameter("keyVal");
        currentSiteId = request.getParameter("siteIdVal");
        //lstContactCategory = whp_sites_contactsLocalServ	iceUtil.getAllContactCategories();
        lstContactCategory = contact_categoryLocalServiceUtil.getContactCategory();
        if(selectedPkey!=null && !selectedPkey.isEmpty()){
        	siteContactId = whp_sites_contactsLocalServiceUtil.getwhp_sites_contacts(Long.parseLong(selectedPkey));
        	contactDetails = whp_contactLocalServiceUtil.getwhp_contact(siteContactId.getContactid());
        }
        else {
        	siteContactId.setContactid(0);
        	siteContactId.setSite_id(Long.parseLong(currentSiteId));
        	siteContactId.setWhp_sites_contacts_id(0);
        	contactDetails.setAddress("");
        	contactDetails.setCategoryid(0);
        	contactDetails.setFirst_name("");
        	contactDetails.setLast_name("");
        	contactDetails.setOrganization("");
        	contactDetails.setPosition("");
        	contactDetails.setPrefix("");
        	contactDetails.setTelephone("");
        	contactDetails.setEmail("");
        }
    }
    
    catch(Exception ex){
        out.println("Ex------------"+ex.getMessage());
    }
%>


<portlet:defineObjects /> 
 <liferay-ui:success key="success" message="Contact added successfully!" /> 
  
<portlet:actionURL name="addSiteContactInformation" var="updateContact"/>
	
<c:set var="site_id" value="<%=currentSiteId %>"/>
<c:set var="UpdateUrl" value="<%=updateContact %>"/>
<c:set var="RefreshUrl" value="/siteinfo_jsp/innerJSP/contact_information.jsp"/>





<aui:script>
function validatecontactForm(){
	
	var isValid=true;
	var isEmail=true;

	if($('#<portlet:namespace/>Prefix').val()==""){
		alert('Please Enter Prefix');
		  isValid=false;
	}	
	
	else if($('#<portlet:namespace/>FName').val()==""){
		alert('Please Enter First Name');
		 isValid=false;
	}	
	
	else if($('#<portlet:namespace/>LName').val()==""){
		alert('Please Enter Last Name');
		  isValid=false;
	}	
	else if($('#<portlet:namespace/>email').val()!=""){
	      if(!emailValidator($('#<portlet:namespace/>email').val())){
		     alert('Please Enter Valid email');
		       isValid=false;
		       isEmail = false;
		}
	}
    
    if($('#<portlet:namespace/>telephone').val()!="" && isEmail){
    	var phNum = $('#<portlet:namespace/>telephone').val();
		 if(checkPhoneNumber(phNum)==false){
		         alert('Please Enter valid  phone number');
		          isValid=false;
	} 
	}
			
	if(isValid){
		submitPopupForm('${site_id }','${RefreshUrl}','contactInfoDiv','SiteContactForm','${UpdateUrl}');
	}
	}

  
</aui:script>
<aui:form 
	action=""
	method="post" 
	id="SiteContactForm" 
	name="SiteContactForm" >
	
	<table class="formBlock"> 	
	<aui:input
	        name="siteContactId"
	        id="sitebudgetId"
	        value="<%= siteContactId.getWhp_sites_contacts_id() %>"
	        type="hidden"
	    />
	    <aui:input
	        name="siteID"
	        id="siteID"
	        value="<%= siteContactId.getSite_id() %>"
	        type="hidden"
	    />
	    <aui:input
	        name="contactID"
	        id="contactID"
	        value="<%= siteContactId.getContactid() %>"
	        type="hidden"
	    />

	<tr>
	<td><label class="popuplbl"> Prefix :</label></td>
		<td>	
			<aui:input 
				label="" 
				style="width:340px;"
				type="text" 
				name="Prefix" 
				value="<%=contactDetails.getPrefix() %>"
				id="Prefix">
				
				</aui:input></td>
				
	</tr>

	<tr>
		<td><label class="popuplbl"> First Name :</label></td>
		<td>	
			<aui:input 
				label="" 
				style="width:340px;"
				type="text" 
				name="FName" 
				value="<%=contactDetails.getFirst_name() %>"
				id="FName">
				
				</aui:input></td>
	</tr>
	<tr>
		<td><label class="popuplbl"> Last Name :</label></td>
		<td>		
			<aui:input 
				label="" 
				style="width:340px;"
				type="text" 
				name="LName"
				value="<%=contactDetails.getLast_name() %>" 
				id="LName">
				
				</aui:input></td>
	</tr>

	<tr>
		<td><label class="popuplbl"> Email :</label></td>
		<td>		
			<aui:input 
				label="" 
				style="width:340px;"
				type="text" 
				name="email"
				value="<%=contactDetails.getEmail() %>"
				id="email">
				
				
				</aui:input></td>
	</tr>

	<tr>
		<td><label class="popuplbl"> Position :</label></td>
		<td>		
			<aui:input 
				label="" 
				style="width:340px;"
				type="text" 
				name="position"
				value="<%=contactDetails.getPosition() %>"
				id="position"/></td>
	</tr>

	<tr>
		<td><label class="popuplbl"> Organisation :</label></td>
		<td>		
			<aui:input 
				label="" 
				style="width:340px;"
				type="text" 
				name="organisation"
				value="<%=contactDetails.getOrganization() %>"
				id="organisation"/></td>
	</tr>

	<tr>
		<td><label class="popuplbl"> Category :</label></td>
		<td>
		<aui:select 
			label="" 
			style="width:340px;"
			name="category" 
			id="category">
		<option >select</option>
		<c:set var="contactCategoryId" value="<%= contactDetails.getCategoryid()%>"/>
			<c:forEach items="<%=lstContactCategory %>" var="contactCategory" varStatus="status">
				<aui:option selected="${contactCategory.getContact_category_id()== contactCategoryId}"
					value="${contactCategory.getContact_category_id()}">
					<c:out value="${contactCategory.getCategory_name()}"/>
				</aui:option>
		</c:forEach>
		</aui:select></td>
	</tr>

	<tr>
		<td><label class="popuplbl"> Telephone :</label></td>
		<td>	
			<aui:input 
				label="" 
				style="width:340px;"
				type="text" 
				name="telephone"
				
				value="<%=contactDetails.getTelephone() %>"
				id="telephone">
			
				
				</aui:input></td>
	</tr>

	<tr>
		<td><label class="popuplbl"> Address :</label></td>
		<td align="left">	
			<aui:input 
				label="" 
				style="width:340px; height:70px;"
				name="address" 
				type="textarea"
				value="<%=contactDetails.getAddress() %>"
				id="address">
				
				</aui:input></td>
	</tr>

	
		<tr>
			<td colspan="2" style="text-align:right;" >
				<aui:button name="saveButton" type="button" value="Save" onclick="javascript:validatecontactForm();" />
			
				<aui:button name="cancelButton" type="button" value="Cancel" onclick="javascript:top.document.getElementById('closethick').click();"/>
			</td>
		</tr>
	
</table>
</aui:form>