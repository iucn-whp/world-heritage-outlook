<%@page import="com.liferay.portal.model.Role"%>
<%@page import="com.liferay.portal.theme.ThemeDisplay"%>
<%@page import="com.iucn.whp.dbservice.service.country_lkpLocalServiceUtil"%>
<%

%>
<%@include file="init.jsp" %>
<liferay-theme:defineObjects />

<%
 ResultRow row = (ResultRow) request.getAttribute(
    WebKeys.SEARCH_CONTAINER_RESULT_ROW);
whp_sites mySite = (whp_sites) row.getObject();
// long groupId = themeDisplay.getLayout().getGroupId(); 
String name = whp_sites.class.getName();
String primKey = String.valueOf(mySite.getPrimaryKey()); 
%>

<%
 List<Role> userRoles = ((ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY)).getUser().getRoles();
boolean isdeleteper=false;
    	for(int iUserRole = 0; iUserRole < userRoles.size(); iUserRole++)
    	{
    		if("WHP Staff".equalsIgnoreCase(userRoles.get(iUserRole).getName()))
    		{
    			isdeleteper = true;
    			break;
    		}
    		}
 %>
 
<liferay-ui:icon-menu>

  <%-- <c:if test="<%= permissionChecker.hasPermission(groupId, name, primKey, ActionKeys.UPDATE) %>"> --%>
    <portlet:actionURL var="editURL" name="editSite" >
         <portlet:param name="resourcePrimKey" value="<%= primKey %>" />
          <portlet:param name="mode" value="edit" />
    </portlet:actionURL>

    <liferay-ui:icon image="edit" message="Edit" url="<%= editURL.toString() %>" />
  <%-- </c:if> --%>

  <c:if test="<%=!isdeleteper %>">
  
    <portlet:actionURL name="deleteSite" var="deleteURL">
      <portlet:param name="resourcePrimKey" value="<%= primKey %>" />
    </portlet:actionURL>

 <liferay-ui:icon-delete url="<%= deleteURL.toString() %>" />
 
  </c:if>
   
    
     <portlet:actionURL var="startAssessmentURL" name="startSiteAssessment" >
         <portlet:param name="siteID" value="<%= primKey %>" />
         <portlet:param name="userId" value="<%= String.valueOf(user.getUserId()) %>" />
    </portlet:actionURL>
    
    <liferay-ui:icon image="edit" message="Start Assessment" url="<%= startAssessmentURL.toString() %>" />
  <%-- </c:if> --%>

  <%-- <c:if test="<%= permissionChecker.hasPermission(groupId, name, primKey, ActionKeys.PERMISSIONS) %>"> --%>
    <%-- <liferay-security:permissionsURL
        modelResource="<%= PRProduct.class.getName() %>"
        modelResourceDescription="<%= myProduct.getProductName() %>"
        resourcePrimKey="<%= primKey %>"
        var="permissionsURL" />

    <liferay-ui:icon image="permissions" url="<%= permissionsURL.toString() %>" />
  </c:if>--%>
</liferay-ui:icon-menu> 