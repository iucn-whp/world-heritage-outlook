<%@page import="com.iucn.whp.dbservice.service.persistence.whp_sites_contactsUtil"%>
<%@page import="com.iucn.whp.dbservice.service.persistence.whp_contactPersistence"%>
<%@include file="/siteinfo_jsp/init.jsp" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.*"%>
<%@ page import="com.iucn.whp.dbservice.model.*" %>
<%@ page import="com.iucn.whp.dto.*" %>

<%
//String siteidfromResopnce=request.getAttribute("siteId").toString();
List<WhpSite> lstContactCategory=new ArrayList<WhpSite>();
whp_sites_contacts obj_whp_sites_contacts= new whp_sites_contactsClp();
List<whp_sites_contacts> lstSiteContacts = null;
try {
	long siteid=Long.parseLong(request.getAttribute("siteId").toString());
	WhpSite whpsite=null;
	List<whp_contact> lstContact=null;
	lstContact=whp_sitesLocalServiceUtil.getWhpContactListBySiteId(siteid); 
	lstSiteContacts=whp_sites_contactsLocalServiceUtil.getAllWhpContactsBySiteId(siteid);
	
	for(int i=0;i<lstSiteContacts.size();i++){   	
	   	try{
       		whpsite=new WhpSite();
    		whpsite.setWhpContact(whp_contactLocalServiceUtil.getwhp_contact(lstSiteContacts.get(i).getContactid()));
    		whpsite.setContactCategory(whp_sitesLocalServiceUtil.getContactCategoryByCategoryId(whp_contactLocalServiceUtil.getwhp_contact(lstSiteContacts.get(i).getContactid()).getCategoryid()));        		
    		whpsite.setWhpSiteContacts(whp_sites_contactsLocalServiceUtil.getwhp_sites_contacts(lstSiteContacts.get(i).getWhp_sites_contacts_id()));
    		lstContactCategory.add(whpsite); 
    	
    	}catch(Exception ex){
    		System.out.println("EXCEPTION:"+ ex.getStackTrace()+"------"+ex.getStackTrace());
    	}
	    	}
	
	System.out.println("lstCountry---------"+lstContactCategory);
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
%>
<c:set var="UpdateUrl" value="/siteinfo_jsp/popups/edit_contact_information.jsp"/>
<c:set var="RefreshUrl" value="/siteinfo_jsp/innerJSP/contact_information.jsp"/>
<c:set var="currentDiv" value="contactInfoDiv"/>

<table cellpadding="0" cellspacing="0" class="tabData">
<tbody>
<tr>
<th>Name</th>
<th class="emailWidth230">Email</th>
<th>Category</th>
<th>Organisation</th>
<th class="hideAdminAction">Edit / delete</th>
</tr>
<tr id="contactTable"	>

<c:forEach items="<%=lstContactCategory %>" var="contact" varStatus="status">		
				
<tr>
<td><c:out value="${contact.getWhpContact().getFirst_name()} ${contact.getWhpContact().getLast_name()}" /></td>
<%-- <td><c:out value="${contact.getWhpContact().getEmail()}" /></td> --%>
<td><a href="mailto:${contact.getWhpContact().getEmail()}">${contact.getWhpContact().getEmail()}</a></td>
<td><c:out value="${contact.getContactCategory().getCategory_name()}" /></td>
<td><c:out value="${contact.getWhpContact().getOrganization()}" /></td>
<td class="editIcons hideAdminAction">
<div class="editDelete">
<a href="#" onclick="javascript:dynamicPopup('${UpdateUrl}','${contact.getWhpSiteContacts().getWhp_sites_contacts_id()}','Contact Information',event);return false;" class="edit">edit</a>
<a href="javascript:deletePopup('${RefreshUrl}','${currentDiv}','${contact.getWhpSiteContacts().getWhp_sites_contacts_id()}','Contact Information');" class="delete">delete</a>
</div>
</td>
</tr>
</c:forEach>
</tbody>
</table>
