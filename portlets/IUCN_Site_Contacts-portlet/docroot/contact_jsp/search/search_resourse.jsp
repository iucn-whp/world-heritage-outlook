<%@page import="com.iucn.contact.util.ContactsearchUtil"%>
<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
<%
/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
%>
<%@include file="/init.jsp" %>
<%@page import="com.liferay.portal.kernel.util.Validator" %>

<portlet:defineObjects />


<%
    String  sitename=ParamUtil.getString(request,"sitename");         
    int typeid=ParamUtil.getInteger(request, "typeid");
  

  
    
 
   
   
  List<whp_contact> whp_contactList=null;
  

		  if (!sitename.isEmpty() && typeid==0 ) 
		 {
			  whp_contactList=ContactsearchUtil.getContactBySitename(sitename);
		 }
		  else  if (sitename.isEmpty() && typeid>0 ) 
		  {
			  whp_contactList=ContactsearchUtil.getContactByType(typeid);
		  }
		  else  if (!sitename.isEmpty() && typeid>0 ) 
		  {
			  whp_contactList=ContactsearchUtil.getContactByjoin(sitename,typeid);
		  }
 
 
 
 

    
    
    //setting value of iterator of search container
    PortletURL whp_sitesSearchURL=null;
	try{
	    	whp_sitesSearchURL = (PortletURL)liferayPortletResponse.createRenderURL();
	  	    whp_sitesSearchURL.setParameter("jspPage", "/view.jsp");
	  	  	whp_sitesSearchURL.setParameter("isSearch", "Y");
	  	  whp_sitesSearchURL.setWindowState(WindowState.NORMAL);
	  	  
	  	
	  	  
	  	   	pageContext.setAttribute("whp_contactList", whp_contactList,PageContext.SESSION_SCOPE);
      }catch(Exception ex){
  	  ex.getStackTrace();
  	  
    }
          
%>

<a href="/web/iucn/address-book" class="clearAnchorCS">Clear Search Result(s)</a>

<div id="contactDivBack">

<liferay-ui:search-container
      emptyResultsMessage="No-Contact-were-found-for-your-search"
     iteratorURL="<%=whp_sitesSearchURL %>" delta="10">

    <liferay-ui:search-container-results>
    <%
    List<whp_contact> tempResults = whp_contactList;
	int cur=1;
    if(tempResults!=null){
    	//searchContainer.
    	results = ListUtil.subList(
    	        tempResults, searchContainer.getStart(), searchContainer.getEnd());
    	    total = tempResults.size();
    }else{
    		results = null;
    	    total = 0;
    }

    pageContext.setAttribute("results", results);
    pageContext.setAttribute("total", total);
    %>
    </liferay-ui:search-container-results>

    <liferay-ui:search-container-row
        className="com.iucn.whp.dbservice.model.whp_contact"
        keyProperty="contact_id"
        modelVar="contact">
        <%
        
      //  long tempContactID=contact.getContact_id();
        
       // String rowURL="javascript:viewContactPopup('/contact_jsp/contactForm.jsp','"+tempContactID+"','Add Contact Information')";
        %>
      
      
      
      <liferay-ui:search-container-column-text
          name="Name"
          value='<%= contact.getFirst_name()+" "+contact.getLast_name() %>'
           />
      <%-- <liferay-ui:search-container-column-text
          name="First Name"
          property="first_name"
           />
               <liferay-ui:search-container-column-text
          name="Last Name"
          property="last_name"
           /> --%>
           
         <%--     <liferay-ui:search-container-column-text
          name="email"
          property="email"
           /> --%>
           
          <liferay-ui:search-container-column-text
          name="Organization"
          property="organization"
           />
           
           <%-- <liferay-ui:search-container-column-text
          name="Telephone"
          property="telephone"
           /> --%>
       <%//getting category Name from contact
       String categoryName="";
       contact_category contactCategory = contact_categoryLocalServiceUtil.getcontact_category(contact.getCategoryid());
       if(contactCategory!=null){
       categoryName=contactCategory.getCategory_name();
       }
       
        %>
           <liferay-ui:search-container-column-text
          name="Type"
          value='<%= categoryName %>'
           />
           
          <%//getting Site Name from Contactid
        
          List<whp_sites_contacts> siteContacts = whp_sites_contactsLocalServiceUtil.getAllWhpSitesByContactId(contact.getContact_id());
          String sites="";
           if(siteContacts!=null && siteContacts.size()>0){
           	for(int i=0;i<siteContacts.size();i++){
           		whp_sites_contacts whpSiteContacts = siteContacts.get(i);
           		Long siteID =  whpSiteContacts.getSite_id();
           		whp_sites whpSite = whp_sitesLocalServiceUtil.getSiteBySiteId(siteID);
           		if(sites!="")
           		{
           			sites=sites+", "+whpSite.getName_en();
           		}else{
               		sites=whpSite.getName_en();
           		}
           	}
           	
           }
       
        %> 
           <liferay-ui:search-container-column-text
          name="Site Name"
          value='<%= sites %>'
           />
           
         <liferay-ui:search-container-column-jsp name="Edit"
          path="/contact_jsp/contact_actions.jsp"
          align="center" />
   
       </liferay-ui:search-container-row>

    <liferay-ui:search-iterator paginate="<%= true %>"  />

  </liferay-ui:search-container>

</div>



