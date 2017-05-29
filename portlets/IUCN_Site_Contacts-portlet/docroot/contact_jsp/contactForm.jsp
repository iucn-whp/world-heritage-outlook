<%@page import="com.iucn.whp.dbservice.service.persistence.whp_contactPersistence"%>
<%@ include file="/init.jsp" %>

<%
    whp_sites_contacts siteContactId= new whp_sites_contactsClp();
	whp_contact contactDetails = new whp_contactClp();
	List<contact_category> lstContactCategory= null;
	String currentSiteId=null;
    try{
        String selectedPkey=request.getParameter("keyVal");
        //currentSiteId = request.getParameter("siteIdVal");
        //lstContactCategory = whp_sites_contactsLocalServiceUtil.getAllContactCategories();
        lstContactCategory = contact_categoryLocalServiceUtil.getContactCategory();
        //System.out.println("lstContactCategory"+lstContactCategory);
        if(selectedPkey!=null && !selectedPkey.isEmpty()){
        	//siteContactId = whp_sites_contactsLocalServiceUtil.getwhp_sites_contacts(Long.parseLong(selectedPkey));
        	contactDetails = whp_contactLocalServiceUtil.getwhp_contact(Integer.parseInt(selectedPkey));
        }
        else {
        	siteContactId.setContactid(0);
        	//siteContactId.setSite_id(Long.parseLong(currentSiteId));
        	//siteContactId.setWhp_sites_contacts_id(0);
        	contactDetails.setContact_id(0);
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
  
<portlet:actionURL name="addContactInformation" var="updateContact"/>
	

<c:set var="UpdateUrl" value="<%=updateContact %>"/>
<c:set var="RefreshUrl" value="/siteinfo_jsp/innerJSP/contact_information.jsp"/>


<aui:form 
  action="<%= updateContact %>"
	method="post" 
	id="SiteContactForm" 
	name="contactForm" >
	
	<table class="formBlock"> 	
	<%-- <aui:input
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
	    /> --%>
	    <aui:input
	        name="contactID"
	        id="contactID"
	        value="<%= contactDetails.getContact_id() %>"
	        type="hidden"
	    />

	<tr>
	<td><label class="popuplbl"> Prefix :</label></td>
		<td>	
			<aui:input 
				label="" 
				style="width:200px;"
				type="text" 
				name="Prefix" 
				value="<%=contactDetails.getPrefix() %>"
				id="Prefix"/></td>
	</tr>

	<tr>
		<td><label class="popuplbl"> First Name :</label></td>
		<td>	
			<aui:input 
				label="" 
				style="width:200px;"
				type="text" 
				name="FName" 
				value="<%=contactDetails.getFirst_name() %>"
				id="FName"/></td>
	</tr>
	<tr>
		<td><label class="popuplbl"> Last Name :</label></td>
		<td>		
			<aui:input 
				label="" 
				style="width:200px;"
				type="text" 
				name="LName"
				value="<%=contactDetails.getLast_name() %>" 
				id="LName"/></td>
	</tr>

	<tr>
		<td><label class="popuplbl"> Email :</label></td>
		<td>		
			<aui:input 
				label="" 
				style="width:200px;"
				type="text" 
				name="email"
				value="<%=contactDetails.getEmail() %>"
				id="email"/></td>
	</tr>

	<tr>
		<td><label class="popuplbl"> Position :</label></td>
		<td>		
			<aui:input 
				label="" 
				style="width:200px;"
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
				style="width:200px;"
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
			style="width:200px;"
			name="category" 
			id="category">
		<option >select</option>
		<%-- <c:set var="contactCategoryId" value="<%= contactDetails.getCategoryid()%>"/>
			<c:forEach items="<%=lstContactCategory %>" var="contactCategory" varStatus="status">
				<aui:option selected="${contactCategory.getContact_category_id()== contactCategoryId}"
					value="${contactCategory.getContact_category_id()}">
					<c:out value="${contactCategory.getCategory_name()}"/>
				</aui:option>
		</c:forEach> --%>
		
		
		<% int size=lstContactCategory.size();
		for(int i=0;i<size;i++){
			contact_category tempcontact_category=lstContactCategory.get(i);
		
			%>
			<aui:option selected="<%=tempcontact_category.getContact_category_id()==contactDetails.getCategoryid() %>"
					value="<%=tempcontact_category.getContact_category_id() %>">
					<%=tempcontact_category.getCategory_name() %>
				</aui:option>
			
		<%} %>
			
			
		</aui:select></td>
	</tr>

	<tr>
		<td><label class="popuplbl"> Telephone :</label></td>
		<td>	
			<aui:input 
				label="" 
				style="width:200px;"
				type="text" 
				name="telephone"
				
				value="<%=contactDetails.getTelephone() %>"
				id="telephone"/></td>
	</tr>

	<tr>
		<td><label class="popuplbl"> Address :</label></td>
		<td align="left">	
			<aui:input 
				label="" 
				style="width:200px;"
				name="address" 
				type="textarea"
				value="<%=contactDetails.getAddress() %>"
				id="address"/></td>
	</tr>

	
		<tr>
			<td colspan="2" align="right" >
				<aui:button name="saveButton" type="submit" value="Save"  />
			
				<aui:button name="cancelButton" type="button" value="Cancel" onclick="javascript:top.document.getElementById('closethick').click();"/>
			</td>
		</tr>
	
</table>
</aui:form>