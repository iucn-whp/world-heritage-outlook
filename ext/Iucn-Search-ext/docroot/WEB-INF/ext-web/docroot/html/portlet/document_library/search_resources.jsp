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

<%@page import="com.liferay.portal.kernel.search.SearchContext"%>
<%@ include file="/html/portlet/document_library/init.jsp"%>
<%@page import="com.liferay.portlet.documentlibrary.model.DLFileVersion"%>
<%@page
	import="com.liferay.portlet.documentlibrary.service.DLFileVersionLocalServiceUtil"%>

<%@page
	import="com.iucn.whp.dbservice.service.persistence.docs_customDataUtil"%>
<%@page import="com.iucn.whp.dbservice.model.*"%>
<%@page import="com.iucn.whp.dbservice.service.*"%>
<%@page import="com.liferay.portlet.documentlibrary.model.DLFileEntry"%>
<%@page import="com.liferay.portal.dao.orm.hibernate.DynamicQueryImpl"%>
<%@page
	import="com.liferay.portal.dao.orm.hibernate.DynamicQueryFactoryImpl"%>
<%@page
	import="com.liferay.portlet.documentlibrary.service.DLFileEntryLocalServiceUtil"%>
<%@page
	import="com.liferay.portlet.documentlibrary.service.DLFileEntryTypeLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.repository.model.FileEntry"%>
<%@page
	import="com.liferay.portlet.documentlibrary.service.DLFileEntryMetadataLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>

<%@page import="com.liferay.portlet.expando.model.ExpandoValue"%>
<%@page import="com.liferay.portlet.expando.model.ExpandoTableConstants"%>
<%@page
	import="com.liferay.portlet.expando.service.ExpandoValueLocalServiceUtil"%>
<%@page import="com.liferay.portlet.documentlibrary.model.DLFileEntry"%>
<%@page import="com.liferay.portlet.dynamicdatamapping.storage.Fields"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.Set"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.io.Serializable"%>
<%@page import="java.lang.StringBuffer"%>
<%@page import="javax.portlet.PortletSession" %>
<%@page import="javax.portlet.ResourceRequest" %>
<%@page import="javax.portlet.PortletPreferences" %>

<%
String redirect = ParamUtil.getString(request, "redirect");

long breadcrumbsFolderId = ParamUtil.getLong(request, "breadcrumbsFolderId");

long repositoryId = ParamUtil.getLong(request, "repositoryId");

if (repositoryId == 0) {
	repositoryId = scopeGroupId;
}

long searchRepositoryId = ParamUtil.getLong(request, "searchRepositoryId");

if (searchRepositoryId == 0) {
	searchRepositoryId = scopeGroupId;
}

long folderId = ParamUtil.getLong(request, "folderId");

long searchFolderId = ParamUtil.getLong(request, "searchFolderId");
long searchFolderIds = ParamUtil.getLong(request, "searchFolderIds");

long[] folderIdsArray = null;

Folder folder = null;

if (searchFolderId > 0) {
	folderIdsArray = new long[] {searchFolderId};

	folder = DLAppServiceUtil.getFolder(searchFolderId);
}
else {
	long defaultFolderId = DLFolderConstants.getFolderId(scopeGroupId, DLFolderConstants.getDataRepositoryId(scopeGroupId, searchFolderIds));

	List<Long> folderIds = DLAppServiceUtil.getSubfolderIds(scopeGroupId, searchFolderIds);

	folderIds.add(0, defaultFolderId);

	folderIdsArray = StringUtil.split(StringUtil.merge(folderIds), 0L);
}

List<Folder> mountFolders = DLAppServiceUtil.getMountFolders(scopeGroupId, DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, QueryUtil.ALL_POS, QueryUtil.ALL_POS);

String keywords = ParamUtil.getString(request, "keywords");


int searchType = ParamUtil.getInteger(request, "searchType");
//searchType=0;

String displayStyle = ParamUtil.getString(request, "displayStyle");

if (Validator.isNull(displayStyle)) {
	displayStyle = portalPreferences.getValue(PortletKeys.DOCUMENT_LIBRARY, "display-style", PropsValues.DL_DEFAULT_DISPLAY_VIEW);
}
String keywords1 = "";
if(!keywords.equalsIgnoreCase("advance_search")){
	keywords1 = keywords;
	}

int entryStart = ParamUtil.getInteger(request, "entryStart");
int entryEnd = ParamUtil.getInteger(request, "entryEnd", entriesPerPage);

int entries=entryEnd-entryStart;
int count =200;

int total = 0;


//added by PN for advanced search
boolean AttribFromSession=false;
PortletSession session_search = resourceRequest.getPortletSession();

String navigation = ParamUtil.getString(request, "navigation");
String keywordFromSession =(String) session_search.getAttribute("keywords");

%>

<aui:input name="repositoryId" type="hidden" value="<%= repositoryId %>" />

<liferay-util:buffer var="searchInfo">
	<c:if test="<%= (searchType != DLSearchConstants.FRAGMENT) %>">
		<div class="search-info">
			<%-- //<% if(!keywords.equalsIgnoreCase("advance_search") && !keywords.isEmpty()){ %> --%>
			<span class="keywords" style="display: none;"> <%= (folder != null) ? LanguageUtil.format(pageContext, "searched-for-x-in-x", new Object[] {HtmlUtil.escape(keywords1), folder.getName()}) : LanguageUtil.format(pageContext, "searched-for-x-everywhere", HtmlUtil.escape(keywords1)) %>
			</span>
			<%-- <% } %> --%>
			<c:if
				test="<%= folderId != DLFolderConstants.DEFAULT_PARENT_FOLDER_ID %>">
				<span class="change-search-folder" style="display: none;"> <aui:button
						onClick='<%= "javascript:" + liferayPortletResponse.getNamespace() + "changeSearchFolder();" %>'
						value='<%= (folder != null) ? LanguageUtil.get(pageContext, "search-everywhere") : LanguageUtil.get(pageContext, "search-in-the-current-folder") %>' />
				</span>
			</c:if>
			<liferay-ui:icon  cssClass="close-search" id="closeSearch"  
			image="../aui/closethick" message="Close Search" url="javascript:;" />
		</div>

		<c:if test="<%= windowState.equals(WindowState.MAXIMIZED) %>">
			<aui:script>
				Liferay.Util.focusFormField(document.<portlet:namespace />fm.<portlet:namespace />keywords);
			</aui:script>
		</c:if>

		<aui:script>
		
			function <portlet:namespace />changeSearchFolder() {
				Liferay.fire(
					'<portlet:namespace />dataRequest',
					{	
						requestParams: {
							'<portlet:namespace />struts_action': '/document_library/search',
							'<portlet:namespace />repositoryId': '<%= repositoryId %>',
							'<portlet:namespace />searchRepositoryId': '<%= ((folder == null) || folder.isDefaultRepository()) ? repositoryId : scopeGroupId %>',
							'<portlet:namespace />folderId': '<%= folderId %>',
							'<portlet:namespace />searchFolderId': '<%= (folder != null) ? DLFolderConstants.DEFAULT_PARENT_FOLDER_ID : folderId %>',
							'<portlet:namespace />keywords': document.<portlet:namespace />fm1.<portlet:namespace />keywords.value,
							'<portlet:namespace />searchType': <%= (folder != null) ? DLSearchConstants.MULTIPLE : DLSearchConstants.SINGLE %>
						},
						src: Liferay.DL_SEARCH
					}
				);

				<%
				if (folder != null) {
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
									'<portlet:namespace />keywords': document.<portlet:namespace />fm1.<portlet:namespace />keywords.value,
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

		<c:if test="<%= (searchRepositoryId == scopeGroupId) %>">
			<aui:script use="aui-base">
				A.one('#<portlet:namespace />closeSearch').on(
					'click',
					function(event) {
						Liferay.fire(
							'<portlet:namespace />dataRequest',
							{
								requestParams: {
									'<portlet:namespace />struts_action': '/document_library/view',
									'<portlet:namespace />folderId': '<%= String.valueOf(folderId) %>',
									'<portlet:namespace />viewEntries': <%= Boolean.TRUE.toString() %>							
								},
								src: Liferay.DL_SEARCH_END
							}
						);
					}
				);
			</aui:script>
		</c:if>
	</c:if>
</liferay-util:buffer>

<c:if
	test="<%= ((searchRepositoryId == scopeGroupId) && (searchType == DLSearchConstants.MULTIPLE)) || (searchType == DLSearchConstants.SINGLE) %>">
	<div id="<portlet:namespace />searchInfo">
		<%= searchInfo %>
	</div>
</c:if>

<liferay-util:buffer var="searchResults">
	<liferay-portlet:renderURL varImpl="searchURL">
		<portlet:param name="struts_action" value="/document_library/search" />
	</liferay-portlet:renderURL>

	<div class="document-container"
		id="<portlet:namespace />documentContainer">
		<aui:form action="<%= searchURL %>" method="get" name="fm">
			<liferay-portlet:renderURLParams varImpl="searchURL" />
			<aui:input name="redirect" type="hidden" value="<%= redirect %>" />
			<aui:input name="breadcrumbsFolderId" type="hidden"
				value="<%= breadcrumbsFolderId %>" />
			<aui:input name="searchFolderId" type="hidden"
				value="<%= searchFolderId %>" />
			<aui:input name="searchFolderIds" type="hidden"
				value="<%= searchFolderIds %>" />

			<%
			
			
//########################added by PN for advance search########################################################## 			
				if(!keywords.equalsIgnoreCase("advance_search") && !navigation.equalsIgnoreCase("home") && keywords.isEmpty())	
				{											
					keywords = keywordFromSession;
					
					if(keywords.equalsIgnoreCase("advance_search"))
					AttribFromSession=true;
				}			
///###############################################################################			
			
			
			PortletURL portletURL = liferayPortletResponse.createRenderURL();
			portletURL.setParameter("struts_action", "/document_library/search");
			portletURL.setParameter("redirect", redirect);
			portletURL.setParameter("breadcrumbsFolderId", String.valueOf(breadcrumbsFolderId));
			portletURL.setParameter("searchFolderId", String.valueOf(searchFolderId));
			portletURL.setParameter("searchFolderIds", String.valueOf(searchFolderIds));
			//portletURL.setParameter("keywords", keywords);
			
			
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
			String message = null;
			if(keywords.isEmpty())
			{
				message = "No Files To Display";
			}
			SearchContainer searchContainer = new SearchContainer(
					liferayPortletRequest, null, null, SearchContainer.DEFAULT_CUR_PARAM, entries, portletURL, headerNames, message);

						
			Map<String, String> orderableHeaders = new HashMap<String, String>();

			/* orderableHeaders.put("title", "title");
			orderableHeaders.put("size", "size");
			orderableHeaders.put("create-date", "creationDate");
			orderableHeaders.put("modified-date", "modifiedDate");
			orderableHeaders.put("downloads", "downloads"); */
			 orderableHeaders.put("title", "title");
			orderableHeaders.put("Document Type", "Document Type");
			orderableHeaders.put("Category", "Category");
			orderableHeaders.put("create-date", "creationDate");
			orderableHeaders.put("modified-date", "modifiedDate");
			orderableHeaders.put("COM", "COM");
			orderableHeaders.put("Upload Date", "Upload Date");

			//searchContainer.setOrderableHeaders(orderableHeaders);

			String orderByCol = ParamUtil.getString(request, "orderByCol");

			searchContainer.setOrderByCol(orderByCol);

			String orderByType = ParamUtil.getString(request, "orderByType");

			searchContainer.setOrderByType(orderByType);

			OrderByComparator orderByComparator = DLUtil.getRepositoryModelOrderByComparator(orderByCol, orderByType);

			searchContainer.setOrderByComparator(orderByComparator);

			searchContainer.setRowChecker(new EntriesChecker(liferayPortletRequest, liferayPortletResponse));

			try {
				SearchContext searchContext = SearchContextFactory.getInstance(request);

				searchContext.setAttribute("paginationType", "regular");
				searchContext.setEnd(entryEnd);
				searchContext.setFolderIds(folderIdsArray);
				searchContext.setKeywords(keywords);
				searchContext.setStart(entryStart);
								
				List results = new ArrayList();
				
				List tempresult= new ArrayList();
				
				List allFiles= new ArrayList();
				
				List resultRows = searchContainer.getResultRows();
				
				//Hits hits = DLAppServiceUtil.search(searchRepositoryId, searchContext);
				
				
				String query="";		
		
						//List results = new ArrayList();
		
						//List resultRows = searchContainer.getResultRows();
		if(!keywords.equalsIgnoreCase("advance_search") && !keywords.isEmpty()){
			
						// this serach is customized for any metadata for this value
						List<String> customizedsearch =new ArrayList<String>();
						customizedsearch.add("Author");
						customizedsearch.add("Full_COM");
						customizedsearch.add("Copyright");
						customizedsearch.add("COM");
						customizedsearch.add("Language");
						customizedsearch.add("Site");
						customizedsearch.add("Type_");
						customizedsearch.add("category");
						keywords=keywords.trim().toLowerCase();
						
						for(int cnt=0;cnt<customizedsearch.size();cnt++ ){
							String customFieldName=customizedsearch.get(cnt);
							if(query.isEmpty())
							query="select * from whp_docs_customdata where  " + "lower(" + customFieldName + ") like '%" + keywords +"%'";
							else
							query=query + " or " + "lower("+  customFieldName + ") like '%" + keywords +"%'";
							
						}
						
						List<docs_customData> docList=docs_customDataLocalServiceUtil.findbyquery(query,0,docs_customDataLocalServiceUtil.getdocs_customDatasCount());
						for(int doccnt=0;doccnt<docList.size();doccnt++){
		                	  docs_customData customdocument=docList.get(doccnt);
		                	  long fileobjid=customdocument.getFileentryid();
		                	   FileEntry fileobj=null;
				                	  try{
				                	       fileobj=DLAppLocalServiceUtil.getFileEntry(fileobjid);
				                	  }
				                	  catch(Exception e){
				                		  System.out.println("following id  not find" + fileobjid);
				                		  continue;
				                	  }							
				                	  tempresult.add(fileobj);		                	  
		                  }
						results = ListUtil.subList(tempresult,entryStart,entryEnd);
						//results = ListUtil.subList(tempresult,searchContainer.getStart(),searchContainer.getEnd());
						total=tempresult.size();
						
					}
		else{
				    
				 if(keywords.isEmpty()){
					 results=new ArrayList();
				 	int status = WorkflowConstants.STATUS_APPROVED;
					if (permissionChecker.isCompanyAdmin() || permissionChecker.isGroupAdmin(scopeGroupId)) {
						status = WorkflowConstants.STATUS_ANY;
					}
					long categoryId = ParamUtil.getLong(request, "categoryId");
					String tagName = ParamUtil.getString(request, "tag");

					boolean useAssetEntryQuery = (categoryId > 0) || Validator.isNotNull(tagName);
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
						/* allFiles = DLAppServiceUtil.getFoldersAndFileEntriesAndFileShortcuts(repositoryId, folderId, status, false, entryStart, count, searchContainer.getOrderByComparator());
						total = DLAppServiceUtil.getFoldersAndFileEntriesAndFileShortcutsCount(repositoryId, folderId, status, false); */
						
						allFiles = DLAppServiceUtil.getFileEntriesAndFileShortcuts(repositoryId, folderId, status,entryStart, count);
						total = DLAppServiceUtil.getFileEntriesAndFileShortcutsCount(repositoryId, folderId, status);
						results = ListUtil.subList(allFiles,searchContainer.getStart(),searchContainer.getEnd());
					} 
					//total=results.size();
				}
				 else{	
					 
					 String docType="";
					 String docCategory="";
					 String docSite="";
					 String doclanguage="";
					 String docAuthor="";
					 String docpubDatestr="";
					 String  docUploadDatestr="";
					 String docCopyright="";
					 String docFull_COM="";
					 String docCOM="";
					 
					 if(AttribFromSession)
					 	{
					 		
					 		docType=(String) session_search.getAttribute("docType");
					 		docCategory=(String) session_search.getAttribute("docCategory");
					 		docSite=(String) session_search.getAttribute("docSite");
					 		doclanguage=(String) session_search.getAttribute("doclanguage");
					 		docAuthor=(String) session_search.getAttribute("docAuthor");
					 		docpubDatestr=(String) session_search.getAttribute("docpubDatestr");
					 		 docUploadDatestr=(String) session_search.getAttribute("docUploadDatestr");
					 		docCopyright=(String) session_search.getAttribute("docCopyright");
					 		docFull_COM=(String) session_search.getAttribute("docFull_COM");
					 		docCOM=(String) session_search.getAttribute("docCOM");
					 	}
					 else
					 {
						docType = ParamUtil.getString(request, "docType");
						docCategory = ParamUtil.getString(request, "docCategory");
						docSite = ParamUtil.getString(request, "docSite");
						doclanguage = ParamUtil.getString(request, "docLanguage");
						docAuthor = ParamUtil.getString(request, "docAuthor");
						docpubDatestr = request.getParameter("docpubDate");
						docUploadDatestr = request.getParameter("docUploadDate");
						docCopyright = ParamUtil.getString(request, "docCopyright");
						docFull_COM = ParamUtil.getString(request, "docFull_COM");
						docCOM = ParamUtil.getString(request, "docCOM");
					 }
				
					DateFormat serverDate = new SimpleDateFormat("yyyy-MM-dd");
					SimpleDateFormat formDate = new SimpleDateFormat("dd/MM/yyyy");
					Date docpubDate=null;
					if(docpubDatestr!=null && !docpubDatestr.isEmpty())
					  docpubDate = serverDate.parse(serverDate.format(formDate.parse(docpubDatestr)));
					
					Date docUploadDate=null;
					if(docUploadDatestr!=null && !docUploadDatestr.isEmpty())
					docUploadDate =serverDate.parse(serverDate.format(formDate.parse(docUploadDatestr)));
					
					ArrayList<String>customFldList =new ArrayList<String>();
					ArrayList<String>catgFldList =new ArrayList<String>();
					HashMap <String,Object>customfldMap=new HashMap<String,Object>();
					HashMap <String,Object>catgmaplst=new HashMap<String,Object>();
					HashMap <String,String>catgfindermap=new HashMap<String,String>();
					
					
					
					
					if(docSite!=null && !docSite.isEmpty() && !docSite.equalsIgnoreCase("Select Site")){
						catgFldList.add("Site");
						catgmaplst.put("Site",docSite);
					}
					if(docAuthor!=null && !docAuthor.isEmpty()){
						catgFldList.add("Author");
						catgmaplst.put("Author",docAuthor);
					}
					if(docFull_COM!=null && !docFull_COM.isEmpty()){
						catgFldList.add("Full_COM");
						catgmaplst.put("Full_COM",docFull_COM);
					}
					if(docCOM!=null && !docCOM.isEmpty()){
						catgFldList.add("COM");
						catgmaplst.put("COM",docCOM);
					}
					
					 if(docCopyright!=null && !docCopyright.isEmpty()){
							
						  catgFldList.add("Copyright");
						   catgmaplst.put("Copyright",docCopyright);
							
						}
					 if(doclanguage!=null && !doclanguage.isEmpty()){
						    catgFldList.add("Language");
							catgmaplst.put("Language",doclanguage);
						}
					  if(docpubDate!=null){
					catgFldList.add("Publish_date");
					catgmaplst.put("Publish_date",docpubDate);
					
				}   
					  
					if(docType!=null && !docType.isEmpty() ){
					
						catgFldList.add("Type_");
						catgmaplst.put("Type_",docType);
						
					}
					if(docCategory!=null && !docCategory.isEmpty() && !docCategory.equalsIgnoreCase("Select")){
						catgFldList.add("Category");
						catgmaplst.put("Category",docCategory);
						}

					  if(docUploadDate!=null ){
						 catgFldList.add("Upload_Date");
						 catgmaplst.put("Upload_Date",docUploadDate);
						 
						}  

					  
					  
                       for(int mapcnt=0;mapcnt<catgFldList.size();mapcnt++){
                    	   String cstmfldval="";
                    	   Date cstmflddate=null;
                    	   Date cstmflddate1=null;
                    	   String customfldName=catgFldList.get(mapcnt);
                    	   if(customfldName.toLowerCase().contains("date")){
                    		 Date ds=  (Date)catgmaplst.get(customfldName);
                    		   cstmfldval=catgmaplst.get(customfldName).toString();
                    		   DateFormat serverDate1 = new SimpleDateFormat("yyyy-MM-dd");
                    			Date dd=new Date(cstmfldval);
                    			cstmfldval= serverDate1.format(dd);
                    	    	
                    	   }else{
                    		   cstmfldval=(String)catgmaplst.get(customfldName);
                    		   cstmfldval=cstmfldval.toLowerCase();
                    	   }
                    	   if(query.isEmpty())
                    	   {
                    		   if(customfldName.toLowerCase().contains("date"))
                    		   {
                    	      query="select * from whp_docs_customdata where "+   customfldName + " ='" + cstmfldval +"'";
                    		   }
                    		   else{
                    			
                    		    query="select * from whp_docs_customdata where "+ "lower(" + customfldName + ") ='" + cstmfldval +"'";
                    		
                    		   }
                    	   }
                    	    else
                    	    {
                    	    	if(customfldName.toLowerCase().contains("date"))
                    	    	{
                          	      query=query + " and " +  customfldName + " ='" + cstmfldval +"'";
                    	    	}
                    	    	else
                    	    	{
   							    query=query + " and " + "lower("+  customfldName + ") ='" + cstmfldval +"'";
                    	    	}
                    	    }
                       }
                       List<docs_customData> docList=docs_customDataLocalServiceUtil.findbyquery(query,0,docs_customDataLocalServiceUtil.getdocs_customDatasCount());
						for(int doccnt=0;doccnt<docList.size();doccnt++){
		                	  docs_customData customdocument=docList.get(doccnt);
		                	  long fileobjid=customdocument.getFileentryid();
		                	   FileEntry fileobj=null;
				                	  try{
				                	       fileobj=DLAppLocalServiceUtil.getFileEntry(fileobjid);
				                	  }
				                	  catch(Exception e){
				                		  System.out.println("following id  not find" + fileobjid);
				                		  continue;
				                	  }
							
				                	  tempresult.add(fileobj);
						}
    	            	  //results = ListUtil.subList(tempresult,searchContainer.getStart(),searchContainer.getEnd()); 
    	            	  results = ListUtil.subList(tempresult,entryStart,entryEnd);
							total=tempresult.size();
						      /* pageContext.setAttribute("results", results);
						      pageContext.setAttribute("total", total); */					
			}
		}
			//////////////////////////////code end for custom fields.........................	
		
				pageContext.setAttribute("results", results);
				pageContext.setAttribute("total", total);
				searchContainer.setResults(results);
				searchContainer.setTotal(total);
				

				for (int i = 0; i < results.size(); i++) {
					Object result = results.get(i);
				%>

			<%@ include file="/html/portlet/document_library/cast_result.jspf"%>
			<%if(fileEntry != null){ %>
			<c:choose>

				<c:when test='<%= !displayStyle.equals("list") %>'>
					<c:choose>
						<c:when
							test="<%= DLFileEntryPermission.contains(permissionChecker, fileEntry, ActionKeys.VIEW) %>">

							<%
									PortletURL tempRowURL = liferayPortletResponse.createRenderURL();

									tempRowURL.setParameter("struts_action", "/document_library/view_file_entry");
									tempRowURL.setParameter("redirect", currentURL);
									tempRowURL.setParameter("fileEntryId", String.valueOf(fileEntry.getFileEntryId()));

									request.setAttribute("view_entries.jsp-fileEntry", fileEntry);
									request.setAttribute("view_entries.jsp-tempRowURL", tempRowURL);
									%>

							<c:choose>
								<c:when test='<%= displayStyle.equals("icon") %>'>
									<liferay-util:include
										page="/html/portlet/document_library/view_file_entry_icon.jsp" />
								</c:when>

								<c:otherwise>
									<liferay-util:include
										page="/html/portlet/document_library/view_file_entry_descriptive.jsp" />
								</c:otherwise>
							</c:choose>
						</c:when>

						<c:otherwise>
							<div style="float: left; margin: 100px 10px 0px;">
								<img alt="<liferay-ui:message key="image" />" border="no"
									src="<%= themeDisplay.getPathThemeImages() %>/application/forbidden_action.png" />
							</div>
						</c:otherwise>
					</c:choose>
				</c:when>

				<c:otherwise>


					<liferay-util:buffer var="fileEntryTitle">

						<%

						  
						PortletURL rowURL = liferayPortletResponse.createRenderURL();

						rowURL.setParameter("struts_action", "/document_library/view_file_entry");
						rowURL.setParameter("redirect", currentURL);
						rowURL.setParameter("fileEntryId", String.valueOf(fileEntry.getFileEntryId()));
						%>

						<liferay-ui:icon cssClass="document-display-style selectable"
							image='<%= "../file_system/small/" + DLUtil.getFileIcon(fileEntry.getExtension()) %>'
							label="<%= true %>" message="<%= fileEntry.getTitle() %>"
							method="get" url="<%= rowURL.toString() %>" />

						<%
						FileVersion latestFileVersion = fileEntry.getFileVersion();

						if ((user.getUserId() == fileEntry.getUserId()) || permissionChecker.isCompanyAdmin() || permissionChecker.isGroupAdmin(scopeGroupId) || DLFileEntryPermission.contains(permissionChecker, fileEntry, ActionKeys.UPDATE)) {
							latestFileVersion = fileEntry.getLatestFileVersion();
						}
						%>

						<c:if
							test="<%= latestFileVersion.isDraft() || latestFileVersion.isPending() %>">

							<%
							String statusLabel = WorkflowConstants.toLabel(latestFileVersion.getStatus());
							%>

							<span class="workflow-status-<%= statusLabel %>"> (<liferay-ui:message
									key="<%= statusLabel %>" />) </span>
						</c:if>
					</liferay-util:buffer>
					<%
                            resultRows = searchContainer.getResultRows();

    						ResultRow row = new ResultRow(fileEntry, fileEntry.getFileEntryId(), i);

						PortletURL rowURL = liferayPortletResponse.createRenderURL();

						rowURL.setParameter("struts_action", "/document_library/view_file_entry");
						rowURL.setParameter("redirect", currentURL);
						rowURL.setParameter("fileEntryId", String.valueOf(fileEntry.getFileEntryId()));
						%>


					<%
							/* resultRows = searchContainer.getResultRows();

							ResultRow row = new ResultRow(fileEntry, fileEntry.getFileEntryId(), i);

							// Position

							PortletURL rowURL = liferayPortletResponse.createRenderURL();

							rowURL.setParameter("struts_action", "/document_library/view_file_entry");
							rowURL.setParameter("redirect", currentURL);
							rowURL.setParameter("fileEntryId", String.valueOf(fileEntry.getFileEntryId()));
							 */

							for (String columnName : entryColumns) {
								if (columnName.equals("action")) {
									row.addJSP("right", SearchEntry.DEFAULT_VALIGN, "/html/portlet/document_library/file_entry_action.jsp");
								}

								if (columnName.equals("create-date")) {
									row.addText(dateFormatDateTime.format(fileEntry.getCreateDate()));
								}

								if (columnName.equals("downloads")) {
									row.addText(String.valueOf(fileEntry.getReadCount()));
								}

								if (columnName.equals("modified-date")) {
									row.addText(dateFormatDateTime.format(fileEntry.getModifiedDate()));
								}

								if (columnName.equals("name")) {
									TextSearchEntry folderTitleSearchEntry = new TextSearchEntry();

									folderTitleSearchEntry.setName(fileEntryTitle);

									row.addSearchEntry(folderTitleSearchEntry);

 									//row.addText(folderTitleSearchEntry, rowURL);
 
								}

								/* if (columnName.equals("size")) {
									row.addText(TextFormatter.formatKB(fileEntry.getSize(), locale) + "k");
								} */
			//*************************** coded added by amit Shukla					
								
/* 								 DLFileVersion docVersion = (DLFileVersion)fileEntry.getFileVersion().getModel();
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
									 /* if(docVersion!=null){
										 long docTypeId = docVersion.getFileEntryTypeId();
										 DLFileEntryType docType1 = DLFileEntryTypeLocalServiceUtil.getFileEntryType(docTypeId);
										 String docTypeName = docType1.getName();
									     row.addText(docTypeName);
									 }
							 */
							 }

							/* if (columnName.equals("size")) {
								row.addText(TextFormatter.formatKB(fileEntry.getSize(), locale) + "k");
							} */
						
							
				/* 			
						 if(columnName.equalsIgnoreCase("Category")) {
								
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
							  if(doccategory.equalsIgnoreCase("select")){
								  doccategory="";
							  }
								row.addText(doccategory);
						 } */
							
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

							// Add result row

							resultRows.add(row);
							%>

				</c:otherwise>

			</c:choose>
			<%} %>

			<%
				}
				%>

			<c:if test="<%= results.isEmpty() %>">
				<% if(!keywords.equalsIgnoreCase("advance_search") && !keywords.isEmpty()){ %>
				<div class="portlet-msg-info">
					<%= LanguageUtil.format(pageContext, "no-documents-were-found-that-matched-the-keywords-x", "<strong>" + HtmlUtil.escape(keywords) + "</strong>") %>
				</div>
				<%} %>   
			</c:if>

			<c:if test='<%= displayStyle.equals("list") %>'>
				<liferay-ui:search-iterator paginate="<%= false %>"
					searchContainer="<%= searchContainer %>" type="more" />
			</c:if>

			<%
			}
			catch (Exception e) {
				_log.error(e, e);
			}
			%>

		</aui:form>
	</div>

	<aui:script>
		Liferay.fire(
			'<portlet:namespace />pageLoaded',
			{
				paginator: {
					name: 'entryPaginator',
					state: {
						page: <%= entryEnd / (entryEnd - entryStart) %>,
						rowsPerPage: <%= (entryEnd - entryStart) %>,
						total: <%= total %>
					}
				},
				repositoryId: '<%= repositoryId %>',
				src: Liferay.DL_SEARCH
			}
		);
	</aui:script>
	
	
<%if(keywords.isEmpty()){ %>	
	<aui:script>
	Liferay.fire(
							'<portlet:namespace />dataRequest',
							{
								requestParams: {
									'<portlet:namespace />struts_action': '/document_library/view',
									'<portlet:namespace />folderId': '<%= String.valueOf(folderId) %>',
									'<portlet:namespace />viewEntries': <%= Boolean.TRUE.toString() %>							
								},
								src: Liferay.DL_SEARCH_END
							}
						);
	</aui:script>
	<%} %>
</liferay-util:buffer>

<c:choose>
	<c:when test="<%= searchType == DLSearchConstants.MULTIPLE %>">
	<%System.out.println("/>MultipleSearchResults1"); %>
		<c:choose>
			<c:when test="<%= (searchRepositoryId == scopeGroupId) %>">
				<div class="search-results-container"				
					id="<portlet:namespace />searchResultsContainer">
					<%System.out.println("/>MultipleSearchResults2"); %>
					<liferay-ui:tabs
						names='<%= "local," + ListUtil.toString(mountFolders, "name") %>'
						refresh="<%= true %>">
						<liferay-ui:section>
							<div class="local-search-results"
								id='<%= liferayPortletResponse.getNamespace() + "searchResults" + searchRepositoryId %>'>
								<%System.out.println("/>MultipleSearchResults3"); %>
								<%= searchResults %>
							</div>
						</liferay-ui:section>

						<%
						for (Folder mountFolder : mountFolders) {
						%>

						<liferay-ui:section>
							<div
								id="<portlet:namespace />repositorySearchResultsContainer<%= mountFolder.getRepositoryId() %>">
								<%System.out.println("/>MultipleSearchResults4"); %>
								<div class="portlet-msg-info">
								<%System.out.println("/>MultipleSearchResults5"); %>
									<%= LanguageUtil.get(pageContext, "searching,-please-wait") %>
								</div>
							</div>
						</liferay-ui:section>

						<%
						}
						%>

					</liferay-ui:tabs>
				</div>

				<span id="<portlet:namespace />displayStyleButtons"> <liferay-util:include
						page="/html/portlet/document_library/display_style_buttons.jsp" />
				</span>
			</c:when>
			<c:when test="<%= (searchRepositoryId != scopeGroupId) %>">
				<div class="repository-search-results"
					id='<%= liferayPortletResponse.getNamespace() + "searchResults" + searchRepositoryId %>'>
					<%System.out.println("/>MultipleSearchResults6"); %>
					<%= searchResults %>
				</div>
			</c:when>
		</c:choose>
	</c:when>
	<c:when test="<%= searchType == DLSearchConstants.SINGLE %>">
		<div id="<portlet:namespace />singleSearchResults">
			<%System.out.println("/>singleSearchResults"); %>
			<%= searchResults %>
		</div>
	</c:when>
	<c:when test="<%= searchType == DLSearchConstants.FRAGMENT %>">
		<div id="<portlet:namespace />fragmentSearchResults">
		<%System.out.println("/>fragmentSearchResults"); %>
			<%= searchResults %>
		</div>
	</c:when> 
</c:choose>

<%!
private static Log _log = LogFactoryUtil.getLog("portal-web.docroot.html.portlet.document_library.search_resources_jsp");
%>