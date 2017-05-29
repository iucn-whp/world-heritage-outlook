<!--mainBlock Starts Here-->
<div class="mainBlock infoWrapperBorder">
<%-- <h2 class="pageHeading"><c:out value="${objwhp_sites.getName_en()}" /></h2> --%>
<div class="tableWrapper">
	<div class="header01">
	<h3 class="basicInfoPageTitle">Contacts</h3>
	</div>

		<div class="tblBlockHeader">
		<h2 class="header02">Contacts</h2>
				<div class="floatRight01">
				<a href="javascript:dynamicPopup('/siteinfo_jsp/popups/edit_contact_information.jsp','','Add Contact Information');" class="addBtn hideAdminAction">+Add</a>
				<a href="javascript:dynamicPopup('/siteinfo_jsp/popups/edit_existing_contact.jsp','','Add Contact');" class="addBtn hideAdminAction">+Add Existing Contact</a>
				</div>
		</div>


<div id="contactInfoDiv">
<jsp:include page="/siteinfo_jsp/innerJSP/contact_information.jsp"></jsp:include>
</div>

<%-- <table class="tabData1" cellpadding="0" cellspacing="0">
<tbody>
<tr>
<th>Name</th>
<th class="emailWidth230">Email</th>
<th>Category</th>
<th>Organisation</th>
<th>Edit / delete</th>
</tr>
<tr>

<c:forEach items="${lstContactCategory}" var="contact" varStatus="status">		
				
<tr>
<td><c:out value="${contact.getWhpContact().getFirst_name()} ${contact.getWhpContact().getLast_name()}" /></td>
<td><c:out value="${contact.getWhpContact().getEmail()}" /></td>
<td><c:out value="${contact.getContactCategory().getCategory_name()}" /></td>
<td><c:out value="${contact.getWhpContact().getOrganization()}" /></td>





<td class="editIcons">
<div class="editDelete">
<a href="javascript:dynamicPopup('/siteinfo_jsp/popups/edit_contact_information.jsp','${contact.getWhpContact().getContact_id() }','Edit Contact Information');" class="edit">edit</a>
<a href="#" class="delete">delete</a>
</div>
</td>
</tr>
		
</c:forEach>



</tbody>
</table> --%>
</div>

</div>

