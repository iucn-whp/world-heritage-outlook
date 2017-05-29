<%--
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
--%>

<%@page import="com.liferay.portal.util.PrefsPropsUtil"%>
<%@page import="com.iucn.whp.dbservice.service.whp_sitesLocalServiceUtil"%>
<%@page import="com.iucn.whp.dbservice.model.whp_sites"%>
<%@ include file="/siteinfo_jsp/thumbnail/init.jsp" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>
<liferay-theme:defineObjects />

<%
long site_id=Long.parseLong(request.getAttribute("siteId").toString());
whp_sites site = whp_sitesLocalServiceUtil.getwhp_sites(site_id);
//User selUser = PortalUtil.getSelectedUser(request);
%>

<c:choose>
	<c:when test='<%= SessionMessages.contains(renderRequest, "request_processed") %>'>
	<%
		String siteLogoURL = StringPool.BLANK;

		if (site.getThumbnailid() != 0) {
			//LayoutSet publicLayoutSet = LayoutSetLocalServiceUtil.getLayoutSet(publicLayoutSetId);

			siteLogoURL = themeDisplay.getPathImage() + "/whpsite_tumbnail?img_id=" + site.getThumbnailid() + "&t=" + WebServerServletTokenUtil.getToken(site.getThumbnailid());
		}
		%>
		<aui:script>
			window.close();
			opener.<portlet:namespace />changeLogo('<%=  siteLogoURL %>');
		</aui:script>
	</c:when>
	<c:otherwise>
		<portlet:actionURL var="editSiteThumbnailURL">
			<portlet:param name="struts_action" value="/siteinfo_jsp/thumbnail/edit_site_thumbnail" />
		</portlet:actionURL>

		<aui:form action="<%= editSiteThumbnailURL %>" enctype="multipart/form-data" method="post" name="fm">
			<aui:input name="siteId" type="hidden" value="<%= selUser.getUserId() %>" />

			<liferay-ui:error exception="<%= UploadException.class %>" message="an-unexpected-error-occurred-while-uploading-your-file" />

			<liferay-ui:error exception="<%= UserPortraitSizeException.class %>">

				<%
				long imageMaxSize = PrefsPropsUtil.getLong(PropsKeys.USERS_IMAGE_MAX_SIZE) / 1024;
				%>

				<liferay-ui:message arguments="<%= imageMaxSize %>" key="please-enter-a-file-with-a-valid-file-size-no-larger-than-x" />
			</liferay-ui:error>

			<liferay-ui:error exception="<%= UserPortraitTypeException.class %>" message="please-enter-a-file-with-a-valid-file-type" />

			<aui:fieldset>
				<aui:input label='<%= LanguageUtil.format(pageContext, "upload-a-gif-or-jpeg-that-is-x-pixels-tall-and-x-pixels-wide", new Object[] {"120", "100"}, false) %>' name="fileName" size="50" type="file" />

				<aui:button-row>
					<aui:button type="submit" />

					<aui:button onClick="window.close();" type="cancel" value="close" />
				</aui:button-row>
			</aui:fieldset>
		</aui:form>

		<c:if test="<%= windowState.equals(WindowState.MAXIMIZED) %>">
			<aui:script>
				Liferay.Util.focusFormField(document.<portlet:namespace />fm.<portlet:namespace />fileName);
			</aui:script>
		</c:if>
	</c:otherwise>
</c:choose>