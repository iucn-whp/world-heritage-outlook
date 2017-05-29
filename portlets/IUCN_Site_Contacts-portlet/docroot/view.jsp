<%@page import="javax.portlet.WindowState"%>
<%@page import="javax.portlet.PortletURL"%>
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
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<portlet:defineObjects />

<h3 class="pageHeaderTitle">Contacts</h3>

<div class="topBarCS">

<%@include file="/contact_jsp/search/search_contact.jsp" %>

</div>


<%

String isSearch=ParamUtil.getString(request, "isSearch");
List<whp_contact> whp_contactList = null;
String pageUrl="N";

if(isSearch==null || isSearch.isEmpty() || isSearch.equalsIgnoreCase("N")){
	whp_contactList=whp_contactLocalServiceUtil.getAllContact();
	
}else{
	whp_contactList= (List<whp_contact>)session.getAttribute("whp_contactList");
	pageUrl="Y";
}

	PortletURL whp_sitesSearchURL=null;
	whp_sitesSearchURL = (PortletURL)liferayPortletResponse.createRenderURL();
	whp_sitesSearchURL.setParameter("jspPage", "/view.jsp");
	whp_sitesSearchURL.setParameter("isSearch", pageUrl);
	whp_sitesSearchURL.setWindowState(WindowState.NORMAL);
	pageContext.setAttribute("whp_contactList", whp_contactList,PageContext.SESSION_SCOPE);


%>


		<div style="clear:both; display:block; overflow:hidden;">
		<a href="javascript:viewContactPopup('/contact_jsp/contactForm.jsp','','Add Contact Information');" class="addBtn">+Add</a>
		</div>
		<div id="contactDiv">
		
<liferay-ui:search-container
      emptyResultsMessage="No-Contact-were-found-for-your-search"
     iteratorURL="<%=whp_sitesSearchURL %>" delta="10">

    <liferay-ui:search-container-results>
    <%
    List<whp_contact> tempResults =whp_contactList;

    results = ListUtil.subList(
        tempResults, searchContainer.getStart(), searchContainer.getEnd());
    total = tempResults.size();

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

    <liferay-ui:search-iterator />

  </liferay-ui:search-container>
</div>



<portlet:resourceURL var="updateContent"/>

<script language="javascript" type="text/javascript">
  function submitPopupForm(siteId,jspPage,divId,formId,actionUrl) {
   AUI().use('aui-io-request', function(A) {
   
    A.io.request(actionUrl, {
      method: 'GET',
      form: { id: '<portlet:namespace />'+formId},
      on: {
          success : function() { 
        	  refreshDiv(siteId,jspPage,divId);
              top.document.getElementById('closethick').click();
          }
      }
    });
  });
}
  
  function refreshTable(p_jspPage,contentDiv) {
	// alert("Div:"+contentDiv+":siteID:"+siteID+":p_jspPage:"+p_jspPage);
	   AUI().use('aui-io-request', function(A) {
	   A.io.request('<%= updateContent %>', {
	      data: {
		   jspPageDiv: p_jspPage
		  },
	      method: 'POST',
	      on: {
	          success : function() { 
	        	  //alert(this.get('responseData'));
	        	 $('#'+contentDiv).html(this.get('responseData'));
	          }
	      }
	    });
	  });
	}

  function viewContactPopup(renderJSPURL,idValue,popupTitle) {
		//creating url
		
		var customUrl="<portlet:renderURL  windowState='<%= LiferayWindowState.EXCLUSIVE.toString() %>'><portlet:param name='jspPage' value='jspURL' /><portlet:param name='keyVal' value='keyValue' /></portlet:renderURL>";
	   
		customUrl=customUrl.replace("keyValue",idValue);
	    var finalUrl=customUrl.replace("jspURL",renderJSPURL);
	    
	    AUI().use('aui-dialog', 'aui-io', 'event', 'event-custom', function(A) {
		     var dialog = new A.Dialog({
		            title: popupTitle,
		            //centered: true,
		            //draggable: true,
		            modal: true,
		           // position: [300, 100]
		            xy: [500, 200]
		        }).plug(A.Plugin.IO, {uri: finalUrl}).render();
		        
		        dialog.show();
		        
		  });
	}
</script>
<script>
	$(document).ready(function(){
		$('.taglib-page-iterator .search-pages').css('margin-top','0.5em');
		$('.aui-field-input, .aui-field-labels-top .aui-field-input').css('margin-top','0.3em');
		$('.results-grid').css('border','none');
	});
</script>