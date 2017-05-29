<%@ taglib prefix="liferay" uri="http://java.sun.com/portlet" %>
<%@page import="com.liferay.portal.model.Layout"%>
<%@page import="com.liferay.portal.model.Role"%>
<%@ page import="com.liferay.portal.service.LayoutLocalServiceUtil" %>
<%@ page import="com.liferay.portal.theme.ThemeDisplay" %>
<%@ page import="com.liferay.portlet.PortletURLFactoryUtil" %>
<%@ page import="javax.portlet.PortletRequest" %>
<%@ page import="javax.portlet.PortletURL" %>
<%@ page import="com.liferay.portal.model.LayoutTypePortlet" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet"%>

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

    <c:set value="<%= primKey%>" var="siteId"/>

    <%
//        Layout editLayout = LayoutLocalServiceUtil.getFriendlyURLLayout(themeDisplay.getScopeGroupId(),
//                false, "/site-assessment-versions");

//        LayoutTypePortlet editLayoutTypePortlet = (LayoutTypePortlet)editLayout.getLayoutType();
//        List actualPortletList = editLayoutTypePortlet.getPortletIds();
//        String editPortletName = null;
//
//        for (java.lang.Object object : actualPortletList){
//            if (object.toString().toLowerCase().indexOf("editor") > 0){
//                editPortletName = object.toString();
//                break;
//            }
//        }
//
//        PortletURL myRenderURL= PortletURLFactoryUtil.create(request,
//                editPortletName, editLayout.getPlid(),
//                PortletRequest.RENDER_PHASE);
//        myRenderURL.setParameter("siteId", primKey);

    %>

    <%--<liferay-ui:icon image="edit" message="Site Assessment Versions"--%>
                     <%--url="<%= myRenderURL.toString() %>" method="GET" />--%>

</liferay-ui:icon-menu> 