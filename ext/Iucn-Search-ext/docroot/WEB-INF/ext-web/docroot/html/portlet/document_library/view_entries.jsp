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

<%@page import="com.iucn.whp.dbservice.service.docs_customDataLocalServiceUtil"%>
<%@page import="com.iucn.whp.dbservice.model.docs_customData"%>
<%@ include file="/html/portlet/document_library/init.jsp" %>
<%@page import="com.liferay.portlet.expando.model.ExpandoValue"%>
<%@page import="com.liferay.portlet.expando.model.ExpandoTableConstants"%>
<%@page import="com.liferay.portlet.expando.service.ExpandoValueLocalServiceUtil"%>
<%@page import="com.liferay.portlet.documentlibrary.service.DLFileVersionLocalServiceUtil"%>
<%@page import="com.liferay.portlet.documentlibrary.model.DLFileEntry"%>
<%@page import="com.liferay.portlet.dynamicdatamapping.storage.Fields"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.Set"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.io.Serializable"%>
<%@page import="java.lang.StringBuffer"%>
<%@page import="javax.portlet.RenderRequest" %>
<%@page import="javax.portlet.PortletPreferences" %>
<%@page import="javax.portlet.ResourceRequest" %>
<%@page import="javax.portlet.PortletSession" %>


<%
String navigation = ParamUtil.getString(request, "navigation", "home");

if(resourceRequest !=null)
{
	PortletSession ps = resourceRequest.getPortletSession();
	ps.setAttribute("keywords","",PortletSession.PORTLET_SCOPE);
}
else if(renderRequest!=	null)
{
	PortletSession ps = renderRequest.getPortletSession();
	ps.setAttribute("keywords","",PortletSession.PORTLET_SCOPE);
}

Folder folder = (Folder)request.getAttribute(WebKeys.DOCUMENT_LIBRARY_FOLDER);

long folderId = GetterUtil.getLong((String)request.getAttribute("view.jsp-folderId"));

long repositoryId = GetterUtil.getLong((String)request.getAttribute("view.jsp-repositoryId"));

long fileEntryTypeId = ParamUtil.getLong(request, "fileEntryTypeId", -1);

String dlFileEntryTypeName = LanguageUtil.get(pageContext, "basic-document");

int status = WorkflowConstants.STATUS_APPROVED;

if (permissionChecker.isCompanyAdmin() || permissionChecker.isGroupAdmin(scopeGroupId)) {
	status = WorkflowConstants.STATUS_ANY;
}

long categoryId = ParamUtil.getLong(request, "categoryId");
String tagName = ParamUtil.getString(request, "tag");

boolean useAssetEntryQuery = (categoryId > 0) || Validator.isNotNull(tagName);

String displayStyle = ParamUtil.getString(request, "displayStyle");

if (Validator.isNull(displayStyle)) {
	displayStyle = portalPreferences.getValue(PortletKeys.DOCUMENT_LIBRARY, "display-style", PropsValues.DL_DEFAULT_DISPLAY_VIEW);
}
else {
	boolean saveDisplayStyle = ParamUtil.getBoolean(request, "saveDisplayStyle");

	if (saveDisplayStyle && ArrayUtil.contains(displayViews, displayStyle)) {
		portalPreferences.setValue(PortletKeys.DOCUMENT_LIBRARY, "display-style", displayStyle);
	}
}

if (!ArrayUtil.contains(displayViews, displayStyle)) {
	displayStyle = displayViews[0];
}

PortletURL portletURL = liferayPortletResponse.createRenderURL();

portletURL.setParameter("struts_action", "/document_library/view");
portletURL.setParameter("folderId", String.valueOf(folderId));
portletURL.setParameter("displayStyle", String.valueOf(displayStyle));

SearchContainer searchContainer = new SearchContainer(liferayPortletRequest, null, null, "cur2", entriesPerPage, portletURL, null, "No Files To Display");

List<String> headerNames = new ArrayList<String>();

for (String headerName : entryColumns) {
	if (headerName.equals("action")) {
		headerName = StringPool.BLANK;
	}
	else if (headerName.equals("name")) {
		headerName = "title";
	}
  
	else if(headerName.equals("Document Type"))
	{
		headerName="Site";
	}
	headerNames.add(headerName);
}

searchContainer.setHeaderNames(headerNames);

EntriesChecker entriesChecker = new EntriesChecker(liferayPortletRequest, liferayPortletResponse);

entriesChecker.setCssClass("document-selector");

searchContainer.setRowChecker(entriesChecker);

Map<String, String> orderableHeaders = new HashMap<String, String>();

orderableHeaders.put("title", "title");
orderableHeaders.put("Document Type", "Document Type");
orderableHeaders.put("Category", "Category");
orderableHeaders.put("create-date", "creationDate");
orderableHeaders.put("modified-date", "modifiedDate");
orderableHeaders.put("COM", "COM");
orderableHeaders.put("Upload Date", "Upload Date");

//orderableHeaders.put("downloads", "downloads");

String orderByCol = ParamUtil.getString(request, "orderByCol");
String orderByType = ParamUtil.getString(request, "orderByType");

if (Validator.isNull(orderByCol)) {
	orderByCol = portalPreferences.getValue(PortletKeys.DOCUMENT_LIBRARY, "order-by-col", StringPool.BLANK);
	orderByType = portalPreferences.getValue(PortletKeys.DOCUMENT_LIBRARY, "order-by-type", "asc");
}
else {
	boolean saveOrderBy = ParamUtil.getBoolean(request, "saveOrderBy");

	if (saveOrderBy) {
		portalPreferences.setValue(PortletKeys.DOCUMENT_LIBRARY, "order-by-col", orderByCol);
		portalPreferences.setValue(PortletKeys.DOCUMENT_LIBRARY, "order-by-type", orderByType);
	}
}

OrderByComparator orderByComparator = DLUtil.getRepositoryModelOrderByComparator(orderByCol, orderByType);

//searchContainer.setOrderableHeaders(orderableHeaders);
searchContainer.setOrderByCol(orderByCol);
searchContainer.setOrderByComparator(orderByComparator);
searchContainer.setOrderByJS("javascript:" + liferayPortletResponse.getNamespace() + "sortEntries('" + folderId + "', 'orderKey', 'orderByType');");
searchContainer.setOrderByType(orderByType);

int entryStart = ParamUtil.getInteger(request, "entryStart", searchContainer.getStart());
int entryEnd = ParamUtil.getInteger(request, "entryEnd", searchContainer.getEnd());

int folderStart = ParamUtil.getInteger(request, "folderStart");
int folderEnd = ParamUtil.getInteger(request, "folderEnd", SearchContainer.DEFAULT_DELTA);

List results = null;
int total = 0;

if (fileEntryTypeId >= 0) {
	Indexer indexer = IndexerRegistryUtil.getIndexer(DLFileEntryConstants.getClassName());

	if (fileEntryTypeId > 0) {
		DLFileEntryType dlFileEntryType = DLFileEntryTypeLocalServiceUtil.getFileEntryType(fileEntryTypeId);

		dlFileEntryTypeName = dlFileEntryType.getName();
	}

	SearchContext searchContext = SearchContextFactory.getInstance(request);

	searchContext.setAttribute("paginationType", "none");
	searchContext.setEnd(entryEnd);
	searchContext.setStart(entryStart);

	Hits hits = indexer.search(searchContext);

	results = new ArrayList();

	for (int i = 0; i < hits.getDocs().length; i++) {
		Document doc = hits.doc(i);

		long fileEntryId = GetterUtil.getLong(doc.get(Field.ENTRY_CLASS_PK));

		FileEntry fileEntry = null;

		try {
			fileEntry = DLAppLocalServiceUtil.getFileEntry(fileEntryId);
		}
		catch (Exception e) {
			if (_log.isWarnEnabled()) {
				_log.warn("Document library search index is stale and contains file entry {" + fileEntryId + "}");
			}

			continue;
		}

		results.add(fileEntry);
	}

	total = hits.getLength();
}
else {
	if (navigation.equals("home")) {
		if (useAssetEntryQuery) {
			long[] classNameIds = {PortalUtil.getClassNameId(DLFileEntryConstants.getClassName()), PortalUtil.getClassNameId(DLFileShortcut.class.getName())};

			AssetEntryQuery assetEntryQuery = new AssetEntryQuery(classNameIds, searchContainer);

			assetEntryQuery.setEnd(entryEnd);
			assetEntryQuery.setExcludeZeroViewCount(false);
			assetEntryQuery.setStart(entryStart);

			results = AssetEntryServiceUtil.getEntries(assetEntryQuery);
			total = AssetEntryServiceUtil.getEntriesCount(assetEntryQuery);
		}
		else {
			/* String urlData=ParamUtil.getString(request, "viewEntries");
			if(urlData==null || urlData.equalsIgnoreCase("") || urlData.isEmpty()){
				results = new ArrayList();
				total = 0;
			}else{ */
				
			/* 	results = DLAppServiceUtil.getFoldersAndFileEntriesAndFileShortcuts(repositoryId, folderId, status, false, entryStart, entryEnd, searchContainer.getOrderByComparator());
				total = DLAppServiceUtil.getFoldersAndFileEntriesAndFileShortcutsCount(repositoryId, folderId, status, false);
	 */
	 	results = DLAppServiceUtil.getFileEntriesAndFileShortcuts(repositoryId, folderId, status,entryStart, entryEnd);
		total = DLAppServiceUtil.getFileEntriesAndFileShortcutsCount(repositoryId, folderId, status);
		
			//}
		}
	}
	else if (navigation.equals("mine") || navigation.equals("recent")) {
		long groupFileEntriesUserId = 0;

		if (navigation.equals("mine") && themeDisplay.isSignedIn()) {
			groupFileEntriesUserId = user.getUserId();
		}

		results = DLAppServiceUtil.getGroupFileEntries(repositoryId, groupFileEntriesUserId, folderId, entryStart, entryEnd);
		total = DLAppServiceUtil.getGroupFileEntriesCount(repositoryId, groupFileEntriesUserId, folderId);
	}
	
}

 //results = new ArrayList();
//total=0; 
searchContainer.setResults(results);
searchContainer.setTotal(total);

request.setAttribute("view_entries.jsp-total", String.valueOf(total));
%>

<%-- <c:if test="<%= results.isEmpty() %>">
	<div class="portlet-msg-info">
		<liferay-ui:message key="there-are-no-documents-or-media-files-in-this-folder" />
	</div>
</c:if> --%>

<%
boolean showSyncMessage = GetterUtil.getBoolean(SessionClicks.get(request, liferayPortletResponse.getNamespace() + "show-sync-message", "true"));

String cssClass = StringPool.BLANK;

if (results.isEmpty() || !showSyncMessage || !PropsValues.DL_SHOW_LIFERAY_SYNC_MESSAGE) {
	cssClass = "aui-helper-hidden";
}
%>
<div style="display: none;">
<div class="<%= cssClass %>" id="<portlet:namespace />syncNotification">
	<div class="lfr-message-info sync-notification" id="<portlet:namespace />syncNotificationContent">
		<a href="http://www.liferay.com/products/liferay-sync" target="_blank">
			<liferay-ui:message key="access-these-files-offline-using-liferay-sync" />
		</a>
	</div>
</div>
</div>

<%
for (int i = 0; i < results.size(); i++) {
	Object result = results.get(i);
%>

	<%@ include file="/html/portlet/document_library/cast_result.jspf" %>

	<c:choose>
		<c:when test="<%= fileEntry != null %>">
			<c:choose>
				<c:when test='<%= !displayStyle.equals("list") %>'>
					<c:choose>
						<c:when test="<%= DLFileEntryPermission.contains(permissionChecker, fileEntry, ActionKeys.VIEW) %>">

							<%
							PortletURL tempRowURL = liferayPortletResponse.createRenderURL();

							tempRowURL.setParameter("struts_action", "/document_library/view_file_entry");
							tempRowURL.setParameter("redirect", currentURL);
							tempRowURL.setParameter("fileEntryId", String.valueOf(fileEntry.getFileEntryId()));

							request.setAttribute("view_entries.jsp-fileEntry", fileEntry);
							request.setAttribute("view_entries.jsp-fileShortcut", fileShortcut);

							request.setAttribute("view_entries.jsp-tempRowURL", tempRowURL);
							%>

							<c:choose>
								<c:when test='<%= displayStyle.equals("icon") %>'>
									<liferay-util:include page="/html/portlet/document_library/view_file_entry_icon.jsp" />
								</c:when>
								<c:otherwise>
									<liferay-util:include page="/html/portlet/document_library/view_file_entry_descriptive.jsp" />
								</c:otherwise>
							</c:choose>
						</c:when>

						<c:otherwise>
							<div style="float: left; margin: 100px 10px 0px;">
								<img alt="<liferay-ui:message key="image" />" border="no" src="<%= themeDisplay.getPathThemeImages() %>/application/forbidden_action.png" />
							</div>
						</c:otherwise>
					</c:choose>
				</c:when>

				<c:otherwise>
					<liferay-util:buffer var="fileEntryTitle">

						<%
						Map<String, Object> data = new HashMap<String, Object>();

						data.put("file-entry-id", fileEntry.getFileEntryId());

						PortletURL rowURL = liferayPortletResponse.createRenderURL();

						rowURL.setParameter("struts_action", "/document_library/view_file_entry");
						rowURL.setParameter("redirect", currentURL);
						rowURL.setParameter("fileEntryId", String.valueOf(fileEntry.getFileEntryId()));
						%>

						<liferay-ui:icon
							cssClass="document-display-style selectable"
							data="<%= data %>"
							image='<%= "../file_system/small/" + DLUtil.getFileIcon(fileEntry.getExtension()) %>'
							label="<%= true %>"
							message="<%= fileEntry.getTitle() %>"
							method="get"
							url="<%= rowURL.toString() %>"
						/>

						<%
						FileVersion latestFileVersion = fileEntry.getFileVersion();

						if ((user.getUserId() == fileEntry.getUserId()) || permissionChecker.isCompanyAdmin() || permissionChecker.isGroupAdmin(scopeGroupId) || DLFileEntryPermission.contains(permissionChecker, fileEntry, ActionKeys.UPDATE)) {
							latestFileVersion = fileEntry.getLatestFileVersion();
						}
						%>

						<c:if test="<%= latestFileVersion.isDraft() || latestFileVersion.isPending() %>">

							<%
							String statusLabel = WorkflowConstants.toLabel(latestFileVersion.getStatus());
							%>

							<span class="workflow-status-<%= statusLabel %>">
								(<liferay-ui:message key="<%= statusLabel %>" />)
							</span>
						</c:if>
					</liferay-util:buffer>

					<%
					List resultRows = searchContainer.getResultRows();

					ResultRow row = null;

					if (fileShortcut == null) {
						row = new ResultRow(fileEntry, fileEntry.getFileEntryId(), i);
					}
					else {
						row = new ResultRow(fileShortcut, fileShortcut.getFileShortcutId(), i);
					}

					row.setClassName("document-display-style");

					Map<String, Object> data = new HashMap<String, Object>();

					data.put("draggable", DLFileEntryPermission.contains(permissionChecker, fileEntry, ActionKeys.DELETE) || DLFileEntryPermission.contains(permissionChecker, fileEntry, ActionKeys.UPDATE));
					data.put("title", fileEntry.getTitle());

					row.setData(data);

					for (String columnName : entryColumns) {
						if (columnName.equals("action")) {
							row.addJSP("/html/portlet/document_library/file_entry_action.jsp");
						}

						if (columnName.equals("create-date")) {
							row.addText(dateFormatDateTime.format(fileEntry.getCreateDate()));
						}

						if (columnName.equals("downloads")) {
							row.addText(String.valueOf(fileEntry.getReadCount()));
						}
                   //************************* commented by Amit********************************
						/* if (columnName.equals("modified-date")) {
							row.addText(dateFormatDateTime.format(fileEntry.getModifiedDate()));
						} */

						if (columnName.equals("name")) {
							TextSearchEntry folderTitleSearchEntry = new TextSearchEntry();

							folderTitleSearchEntry.setName(fileEntryTitle);

							row.addSearchEntry(folderTitleSearchEntry);
						}
//**********************************************code added by Amit for docs Listing***************************************
						/* if (columnName.equals("size")) {
							row.addText(TextFormatter.formatKB(fileEntry.getSize(), locale) + "k");
						} */
						
					/*******  this code is getting doument Type******************************/	
/* 					 DLFileVersion docVersion = (DLFileVersion)fileEntry.getFileVersion().getModel();
 */
						long  fileentryid=fileEntry.getFileEntryId();

						if (columnName.equalsIgnoreCase("Document Type")) {
							
							docs_customData docdata=null;
							
							try{
								 docdata=docs_customDataLocalServiceUtil.getfileEntry(fileentryid);
							}
							catch(Exception e )
							{
								
							}
							
							if(docdata!=null)
							{
								String docType=docdata.getSite();
								   row.addText(docType);
							}
							else
							{
								   row.addText("NA");

							}
						/* 	
							 if(docVersion!=null){
								 long docTypeId = docVersion.getFileEntryTypeId();
								 DLFileEntryType docType = DLFileEntryTypeLocalServiceUtil.getFileEntryType(docTypeId);
								 String docTypeName = docType.getName();
							     row.addText(docTypeName);
							 } */
					}
						
						 /* if(columnName.equalsIgnoreCase("Category")) {
								
							 String doccategory="";
							 java.util.Map<String, com.liferay.portlet.dynamicdatamapping.storage.Fields>  mapcategory=null;
							 try {
								
								 long fileversionid = docVersion.getFileVersionId();
								  DLFileEntry objDlfileentry=DLFileVersionLocalServiceUtil.getDLFileVersion(fileversionid).getFileEntry();
								  mapcategory =objDlfileentry.getFieldsMap(fileversionid);
								            if(mapcategory!=null){
										    Set<String> docfieldset=mapcategory.keySet();
											Iterator<String> docfieldsetItr=docfieldset.iterator();
											boolean outloop=true;
											             while(docfieldsetItr.hasNext()){
																	 String fieldName=docfieldsetItr.next();
																	 Fields field=mapcategory.get(fieldName);
																	 Set<String> metatagnames=field.getNames();
																     Iterator<String> metatagnamesItr=metatagnames.iterator();
																     com.liferay.portlet.dynamicdatamapping.storage.Field  fieldd=null;
																     String date=null;
																	while(metatagnamesItr.hasNext())
																	{
																		     String metatagnamesStr=metatagnamesItr.next();
																		     
																		      if(metatagnamesStr.toLowerCase().contains("catg")){
																		    	 fieldd=field.get(metatagnamesStr);
																		    	doccategory =(String) fieldd.getValue().toString();
																		    	doccategory =doccategory .replace("[\"","" );
																		    	doccategory =doccategory .replace("\"]","" );
																		    	// doccategory=doccatego[0];
																		          outloop=false;
																			       break;
																	          }
															        }
																	if(!outloop)
																		break;
												  
										                    }
											
								
					                
									  }
							} catch (PortalException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							} catch (SystemException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							 
							  /////////////////////////////////////////
							  if(doccategory.equalsIgnoreCase("select"))
								  doccategory="";
								row.addText(doccategory);
						 }
						  */
						  
						  
						  
						  
						  if(columnName.equalsIgnoreCase("Category")) {
								
								
								docs_customData docdata=null;
								
								try{
									 docdata=docs_customDataLocalServiceUtil.getfileEntry(fileentryid);
								}
								catch(Exception e )
								{
									
								}
								
								if(docdata!=null)
								{
									String doccategory=docdata.getCategory();
									   row.addText(doccategory);
								}
								else
								{
									   row.addText("NA");

								}
							 
							 
						 
						 
						 }
						  
						 
						 
						 if (columnName.equalsIgnoreCase("Upload Date")) {
								row.addText(dateFormatDateTime.format(fileEntry.getCreateDate()));
							}
						 if(columnName.equalsIgnoreCase("COM")) {
							 String doccomValue="";
								try{
									Object comFieldValues = fileEntry.getFileVersion().getExpandoBridge().getAttribute("COM"); 
								
								if(comFieldValues!=null && !comFieldValues.toString().isEmpty()){
							         //String [] comfValues = (String[]) comFieldValues ;
							         doccomValue = comFieldValues.toString();
								}
							
								row.addText(doccomValue);
							}
								catch (Exception e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
									System.out.println(" Problem in getting siteid "+ e.getMessage());
								}
							
								
						 }
						 
					}

					resultRows.add(row);
					%>

				</c:otherwise>
			</c:choose>
		</c:when>
	</c:choose>

<%
}
%>

<c:if test='<%= displayStyle.equals("list") %>'>
	<liferay-ui:search-iterator paginate="<%= false %>" searchContainer="<%= searchContainer %>" />
</c:if>

<aui:script>
	Liferay.fire(
		'<portlet:namespace />pageLoaded',
		{
			paginator: {
				name: 'entryPaginator',
				state: {
					page: <%= (total == 0) ? 0 : (entryEnd / (entryEnd - entryStart)) %>,
					rowsPerPage: <%= (entryEnd - entryStart) %>,
					total: <%= total %>
				}
			}
		}
	);
</aui:script>


<%!
private static Log _log = LogFactoryUtil.getLog("portal-web.docroot.html.portlet.document_library.view_entries_jsp");
%>