<%@page import="com.iucn.whp.dbservice.service.country_lkpLocalServiceUtil"%>
<%

%>

<%@include file="/init.jsp" %>

<%
 ResultRow row = (ResultRow) request.getAttribute(
    WebKeys.SEARCH_CONTAINER_RESULT_ROW);
whp_contact contactDetails = (whp_contact) row.getObject();
// long groupId = themeDisplay.getLayout().getGroupId(); 
String name = whp_contact.class.getName();
String primKey = String.valueOf(contactDetails.getPrimaryKey()); 
String rowURL="javascript:viewContactPopup('/contact_jsp/contactForm.jsp','"+primKey+"','Add Contact Information')";
%>

<liferay-ui:icon-menu>

  <%-- <c:if test="<%= permissionChecker.hasPermission(groupId, name, primKey, ActionKeys.UPDATE) %>"> --%>
    <portlet:actionURL var="editURL" name="editSite" >
         <portlet:param name="resourcePrimKey" value="<%= primKey %>" />
          <portlet:param name="mode" value="edit" />
    </portlet:actionURL>

    <liferay-ui:icon image="edit" message="" url="#" onClick="<%=rowURL %>" />
  <%-- </c:if> --%>

  <%-- <c:if test="<%= permissionChecker.hasPermission(groupId, name, primKey, ActionKeys.DELETE) %>"> --%>
   <%--  <portlet:actionURL name="deleteSite" var="deleteURL">
      <portlet:param name="resourcePrimKey" value="<%= primKey %>" />
    </portlet:actionURL>

    <liferay-ui:icon-delete url="<%= deleteURL.toString() %>" /> --%>
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