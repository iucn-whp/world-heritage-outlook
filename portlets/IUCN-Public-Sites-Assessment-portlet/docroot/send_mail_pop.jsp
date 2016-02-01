<%@page import="com.liferay.portal.kernel.util.PropsUtil"%>
<%@page import="com.iucn.whp.dbservice.service.whp_sitesLocalServiceUtil"%>
<%@page import="com.iucn.whp.dbservice.model.whp_sites"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://liferay.com/tld/security" prefix="liferay-security" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/util" prefix="liferay-util" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.*"%>
<liferay-theme:defineObjects />

<liferay-ui:success key="success" message="Mail send successfully!" /> 



<portlet:defineObjects /> 


<portlet:actionURL name="sendmailURL" var="sendmailURL"/>
   
 <aui:form  method="post"  name="FeedbackForm" id="FeedbackForm"	>
 
 <%
 
 String mailto = PropsUtil.get("mail.name.public"); 
 
 System.out.println(mailto);
 String selectedPkey=request.getParameter("keyVal");
 long siteid=Long.parseLong(selectedPkey);
 
 whp_sites siteobj=whp_sitesLocalServiceUtil.getSiteBySiteId(siteid);
 
 String subj="Feedback on "+siteobj.getName_en();
 
 if(mailto==null)
 {
	 mailto="";
 }
 
 %>
			        
<table class="formBlock"> 

			<aui:input
		        name="siteId"
		        id="siteId"
		        value="siteId"
		        type="hidden"
		    />	
		    
		    <aui:input
		        name="Tomail"
		        id="Tomail"
		        value="<%=mailto %>"
		        type="hidden"
		    />	
		    
	<tr>
		<td><label class="popuplbl">Name :</label></td>
		<td>	
			<aui:input 
				label="" 
				style="width:450px;"
				type="text" 
				name="name" 
				value=""
				id="name">
    		</aui:input></td>
	</tr>	    
	
	<tr>
		<td><label class="popuplbl">Mail Address :</label></td>
		<td>	
			<aui:input 
				label="" 
				style="width:450px;"
				type="text" 
				name="mailAddress" 
				value=""
				id="mailAddress">
    		</aui:input></td>
	</tr>
	
	<tr>
		<td><label class="popuplbl">Subject:</label></td>
		<td>	
			<aui:input 
				label="" 
				style="width:450px;"
				type="text" 
				name="subject" 
				value="<%= subj%>"
				id="subject">
    		</aui:input></td>
	</tr>
	
	<tr>
		<td><label class="popuplbl">Comments:</label></td>
		<td spellcheck="true">	
			<aui:input 
				label="" 
				style="width:450px;  height:120px;"
				type="textarea" 
				name="message" 
				value=""
				id="message">
				</aui:input></td>
	</tr>
	
	
	<tr>
	<td colspan="2" style="text-align:right;" >
			
			<aui:button type="button" value="Submit Feedback" onclick="javascript:sendMail();"/>
	</td>
	</tr>

</table>
</aui:form>



<script type="text/javascript">

	function sendMail(){
		

		
		
		var from=document.getElementById("<portlet:namespace/>mailAddress").value;
		var body=document.getElementById("<portlet:namespace/>message").value;
		var to=document.getElementById("<portlet:namespace/>Tomail").value;
		var name=document.getElementById("<portlet:namespace/>name").value;
		
		var isValid = true;
		
		 var filter = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;

		   
		if(name == ""){
			isValid = false;
			alert("Add Name.");
		}
		else  if (!filter.test(from)) {
			isValid = false;
			alert("Please provide a valid email address.");
	    }
		else if(body == ""){
			isValid = false;
			alert("Add comment.");
		}
		else if(to==""){
			isValid = false;
			alert("Mail address is not configured, mail can't be send");
		}
		if(isValid){
		
			
			submitPopMail();
		
		}
	}
</script>


<script>


function submitPopMail() {
	
	   AUI().use('aui-io-request', function(A) {
		 
		top.document.getElementById('closethick').click();
		   
	   A.io.request('<%= sendmailURL %>', {
	      data: {
	    	  from: document.getElementById("<portlet:namespace/>mailAddress").value,
	    	  body: document.getElementById("<portlet:namespace/>message").value,
	    	  to:document.getElementById("<portlet:namespace/>Tomail").value,
	    	  subject:document.getElementById("<portlet:namespace/>subject").value,
	    	  name:document.getElementById("<portlet:namespace/>name").value
	    	  
		  },
	      method: 'POST',
	      on: {
	          success : function() { 
	        	alert("mail sent successfully");
	        	 /*  parent.$('#siteDashboardDiv').html(this.get('responseData'));  */
	        	 
	        	 
	          }
	      }
	    });
	  });
	}

</script>

