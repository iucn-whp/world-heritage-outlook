<%@page import="com.liferay.portal.kernel.servlet.SessionErrors"%>
<%@page import="javax.portlet.RenderResponse"%>
<%@page import="javax.portlet.PortletResponse"%>
<%@ page import="javax.portlet.PortletPreferences" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<portlet:resourceURL var="updateContent"/>
<portlet:defineObjects />

<liferay-ui:error key="error" message="Sorry, Data not added" />
<script language="javascript" type="text/javascript">

  function submitPopupForm(siteId,jspPage,divId,formId,actionUrl) {
   AUI().use('aui-io-request', function(A) {
	   top.document.getElementById('closethick').click();
	   
	   
	   
    A.io.request(actionUrl, {
      method: 'GET',
      form: { id: '<portlet:namespace />'+formId},
      on: {
          success : function(response) { 
        	  
     	  
                	  
       	  	refreshTable(siteId,jspPage,divId);        	  
            if(divId=="inscriptionCriteriaDiv"){
             	refreshTable(siteId,"/siteinfo_jsp/innerJSP/basic_information_edit.jsp","basicInfoEdit");
         	}
            if(divId=="basicInfoCountryAdd"){
            	refreshTable(siteId,"/siteinfo_jsp/innerJSP/physical_info.jsp","physicalInfoDiv");
            }
          } 
      	}
    });
  });
}
  
  function refreshTable(siteID,p_jspPage,contentDiv) {
	
	   AUI().use('aui-io-request', function(A) {
	   A.io.request('<%= updateContent %>', {
	      data: {
		    siteId: siteID,jspPageDiv: p_jspPage
		  },
	      method: 'POST',
	      on: {
	          success : function() { 
	        	//alert("hello");
	        	  parent.$('#'+contentDiv).html(this.get('responseData')); 
	        	 
	        	 
	          }
	      }
	    });
	  });
	}

</script>

