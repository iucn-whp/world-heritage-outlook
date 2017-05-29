<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<%@page import="com.iucn.whp.dbservice.model.whp_contact"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.iucn.whp.dbservice.service.contact_categoryLocalServiceUtil"%>
<%@page import="com.iucn.whp.dbservice.model.contact_category" %>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/style_IUCN_site_information_form_official.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/jqtransform.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/demo.css">
<head>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.4.1.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.lightbox_me.js"></script>

<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.validate.js"></script>
</head>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
 <%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %> 
 <%@ page import="javax.portlet.PortletPreferences" %>



<script>
	$(document).ready(function(){
		$('.viewForm').click(function(e) {
    $('.formBlock').lightbox_me({
        centered: true, 
        onLoad: function() { 
            $('.formBlock').find('input:first').focus()
            }
        });
    e.preventDefault();
});
	});
</script>
<script type="text/javascript">


function validate()
{
	if( document.myForm.Prefix.value == "" )
   {
     alert( "Please provide your Prefix!" );
     document.myForm.Prefix.focus() ;
     return false;
   }
   if( document.myForm.FName.value == "" )
   {
     alert( "Please provide your First name!" );
     document.myForm.FName.focus() ;
     return false;
   }
   if( document.myForm.LName.value == "" )
   {
     alert( "Please provide your Last name!" );
     document.myForm.LName.focus() ;
     return false;
   }
   if( document.myForm.Email.value == "" )
   {
     alert( "Please provide your Email!" );
     document.myForm.Email.focus() ;
     return false;
   }
   if( document.myForm.Position.value == "" )
   {
     alert( "Please provide your Position name!" );
     document.myForm.Position.focus() ;
     return false;
   }
   if( document.myForm.Organisation.value == "" )
   {
     alert( "Please provide your Organisation name!" );
     document.myForm.Organisation.focus() ;
     return false;
   }
   if( document.myForm.Telephone.value == "" ||
           isNaN( document.myForm.Telephone.value ) ||
           document.myForm.Telephone.value.length != 10 )
   {
     alert( "Please provide a Telephone in the format ##########." );
     document.myForm.Telephone.focus() ;
     return false;
   }
   if( document.myForm.Category.value == "select" )
   {
     alert( "Please provide your Category!" );
     return false;
   }
   
   if( document.myForm.Address.value == "" )
   {
     alert( "Please provide your Address!" );
     document.myForm.Address.focus() ;
     return false;
   }
   
   
   
   
}

</script>


<portlet:defineObjects /> 
 <liferay-ui:success key="success" message="Contact saved successfully!" /> 
  <% /* PortletPreferences prefs = renderRequest.getPreferences(); 
  String greeting = (String)prefs.getValue( "greeting", "Hello! Welcome to our portal."); */ %> 
  
   <p><%= "greeting" %></p>
    <portlet:actionURL name="addSiteContact" var="updateContact">
      <portlet:param name="resourcePrimKey" value="1" />
    </portlet:actionURL>

<form class="siteAssessmentForm jqtransform" action="<%= updateContact %>" method="post" id="SiteContactForm" name="myForm" >
	<div >
		<p>+ Add New Contact test</p>
	<div class="formElements">
	
	<label>
		<span>Prefix :</span>
		<input type="text" class="siteInfoTxtInput" name="Prefix" id="Prefix">
	</label> 
	
	<label>
		<span>First Name :</span>
		<input type="text" class="siteInfoTxtInput" name="FName" id="FName">
	</label>
	
	<label>
		<span>Last Name :</span>
		<input type="text" class="siteInfoTxtInput" name="LName" id="LName">
	</label>
	
	<label>
		<span>Email :</span>
		<input type="text" class="siteInfoTxtInput" name="Email">
	</label>
	
	<label>
		<span>Position :</span>
		<input type="text" class="siteInfoTxtInput" name="Position">
	</label>
	
	<label>
		<span>Organisation :</span>
		<input type="text" class="siteInfoTxtInput" name="Organisation">
	</label>
	
	<label>
		<span>Category :</span>
		 <%
		
	//	 java.util.List<contact_category> catg  = contact_categoryLocalServiceUtil.getContactCategory();
			
		
	//	int size=catg.size();
		 %> 
		
		<select name="Category">
		<option>select</option>
		<%-- <%for(int j=0;j<size;j++){%>
			<option><% out.println(catg.get(j).getCategory_name().toString()); %></option>
		<% }%> --%>
		</select>
	</label>
	
	<label>
		<span>Telephone :</span>
		<input type="text" class="siteInfoTxtInput" name="Telephone">
	</label>
	
	<label>
		<span>Address :</span>
		<textarea class="siteInfoTxtArea" name="Address"></textarea>
	</label>
	
	
	<label class="buttons">
		<input class="btn" type="submit" value="Save"  />
		<input class="btn" type="reset" value="Clear" />
	</label>
	</div>
	</div>
		
</form>



