

<%@ include file="/html/portlet/document_library/init.jsp" %>
<%@page import="com.iucn.whp.dbservice.model.whp_sites"%>
<%@page import="com.iucn.whp.dbservice.service.site_assessmentLocalServiceUtil"%>
<%@page
	import="com.iucn.whp.dbservice.service.whp_sitesLocalServiceUtil"%>
<%@page
	import="java.util.List"%>
<%@ page import="com.iucn.whp.dbservice.model.site_assessment" %>
<%@ page import="java.util.ArrayList" %>


<%
long repositoryId = GetterUtil.getLong((String)request.getAttribute("view.jsp-repositoryId"));

long folderId = GetterUtil.getLong((String)request.getAttribute("view.jsp-folderId"));

List<Folder> mountFolders = DLAppServiceUtil.getMountFolders(repositoryId, DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
%>

<liferay-portlet:resourceURL var="searchURL">
	<portlet:param name="struts_action" value="/document_library/search" />
	<portlet:param name="repositoryId" value="<%= String.valueOf(repositoryId) %>" />
	<portlet:param name="searchRepositoryId" value="<%= String.valueOf(folderId) %>" />
	<portlet:param name="folderId" value="<%= String.valueOf(folderId) %>" />
	<portlet:param name="searchFolderId" value="<%= String.valueOf(folderId) %>" />
</liferay-portlet:resourceURL>

	<aui:form action="<%= searchURL.toString() %>" method="get" name="fm22" onSubmit='<%= "event.preventDefault(); " + liferayPortletResponse.getNamespace() + "searchFile();" %>'>

		<%
		String taglibOnClick = "javascript:" + liferayPortletResponse.getNamespace() + "searchFile();";
		%>

		<aui:layout>

		<aui:column>

				<span><b>Select Site Name</b></span>

		</aui:column>
			<aui:column >

				<aui:select  label="" id="keywords" name="keywords"  style="width:202px;" class="siteSelect">
				       <aui:option label="Select Site"  value=""/>

						<%

						List<whp_sites> lst_whpsites = new ArrayList<whp_sites>();
						whp_sites site = null;

                            final String ASSESS_REW_ROLE = "Reviewer";
                            final String ASSESS_ASSESSOR_ROLE = "Assessor";

                            if(request.isUserInRole(ASSESS_REW_ROLE) || request.isUserInRole(ASSESS_ASSESSOR_ROLE)){

                                User currentUser = PortalUtil.getUser(request);
//                                lst_whpsites=whp_sitesLocalServiceUtil.getAllActiveSitesByUserId(currentUser.getUserId());
								List<site_assessment> siteAssessments = site_assessmentLocalServiceUtil.getActiveAssessmentByUserId(currentUser.getUserId());

								for (site_assessment assessment : siteAssessments) {
									site = whp_sitesLocalServiceUtil.fetchwhp_sites(assessment.getSite_id());
									lst_whpsites.add(site);
								}

							}else {

                                lst_whpsites=whp_sitesLocalServiceUtil.getAllActiveSites();
                            }

						for(int i=0;i<lst_whpsites.size();i++)
						{
							whp_sites currData=lst_whpsites.get(i);

							%>
							<aui:option  value="<%=currData.getName_en()%>">
							<%=currData.getName_en() %>
						</aui:option>
						<%} %>

						 </aui:select>
			</aui:column>

			<aui:column >
				<aui:button cssClass="lfr-search-combobox-item" name="search" onClick="<%= taglibOnClick %>" value="GO" />
			</aui:column>
		</aui:layout>
	</aui:form>


<aui:script>
	function <portlet:namespace />searchFile() {
		Liferay.fire(
			'<portlet:namespace />dataRequest',
			{
				requestParams: {
					'<portlet:namespace />struts_action': '/document_library/search',
					'<portlet:namespace />repositoryId': '<%= repositoryId %>',
					'<portlet:namespace />searchRepositoryId': '<%= repositoryId %>',
					'<portlet:namespace />folderId': '<%= folderId %>',
					'<portlet:namespace />searchFolderId': '<%= folderId %>',
					'<portlet:namespace />keywords': document.<portlet:namespace />fm22.<portlet:namespace />keywords.value,
					'<portlet:namespace />searchType': <%= ((repositoryId == scopeGroupId) && (folderId == DLFolderConstants.DEFAULT_PARENT_FOLDER_ID)) ? DLSearchConstants.MULTIPLE : DLSearchConstants.SINGLE %>

				},
				src: Liferay.DL_SEARCH
			}
		);

		<%
		if ((repositoryId == scopeGroupId) && (folderId == DLFolderConstants.DEFAULT_PARENT_FOLDER_ID)) {
			for (Folder mountFolder : mountFolders) {
			%>

				Liferay.fire(
					'<portlet:namespace />dataRequest',
					{
						requestParams: {
							'<portlet:namespace />struts_action': '/document_library/search',
							'<portlet:namespace />repositoryId': '<%= mountFolder.getRepositoryId() %>',
							'<portlet:namespace />searchRepositoryId': '<%= mountFolder.getRepositoryId() %>',
							'<portlet:namespace />folderId': '<%= mountFolder.getFolderId() %>',
							'<portlet:namespace />searchFolderId': '<%= mountFolder.getFolderId() %>',
							'<portlet:namespace />keywords': document.<portlet:namespace />fm22.<portlet:namespace />keywords.value,
							'<portlet:namespace />searchType': <%= DLSearchConstants.MULTIPLE %>
						},
						src: Liferay.DL_SEARCH
					}
				);

			<%
			}
		}
		%>

	}
</aui:script>
