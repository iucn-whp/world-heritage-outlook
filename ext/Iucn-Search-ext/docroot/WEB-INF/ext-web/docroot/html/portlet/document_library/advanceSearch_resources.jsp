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

<%@page import="com.iucn.whp.dbservice.service.persistence.docs_customDataUtil"%>
<%--  <%@page import="com.iucn.whp.dbservice.service.docs_customDataLocalServiceUtil"%> --%>
<%-- <link rel="stylesheet" href="${pageContext.request.contextPath}/css/test.css">--%>
<link rel="stylesheet" type="text/css" href="/css/test.css">
<%@page import="com.iucn.whp.dbservice.model.*"%>
<%@page import="com.iucn.whp.dbservice.service.*"%>
<%@ include file="/html/portlet/document_library/init.jsp" %>
<%@page import="com.liferay.portlet.documentlibrary.model.DLFileVersion"%>
<%@page import="com.liferay.portlet.documentlibrary.model.DLFileEntry"%>
<%@page import="com.liferay.portal.dao.orm.hibernate.DynamicQueryImpl"%>
<%@page import="com.liferay.portal.dao.orm.hibernate.DynamicQueryFactoryImpl"%>
<%@page import="com.liferay.portlet.documentlibrary.service.DLFileEntryLocalServiceUtil"%>
<%@page import="com.liferay.portlet.documentlibrary.service.DLFileEntryTypeLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.repository.model.FileEntry"%>
<%@page import="com.liferay.portlet.documentlibrary.service.DLFileEntryMetadataLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>

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
<%

//---------------------------------getting parameter from request


	String docType = ParamUtil.getString(request, "docType");
	String docCategory = ParamUtil.getString(request, "docCategory");
	String docSite = ParamUtil.getString(request, "docSite");
	String docAuthor = ParamUtil.getString(request, "docAuthor");
	String docpubDatestr = request.getParameter("docpubDate");
	
    DateFormat serverDate = new SimpleDateFormat("yyyy-MM-dd");
	SimpleDateFormat formDate = new SimpleDateFormat("dd/MM/yyyy");
	Date docpubDate=null;
	if(docpubDatestr!=null && !docpubDatestr.isEmpty())
	  docpubDate = serverDate.parse(serverDate.format(formDate.parse(docpubDatestr)));
	//Date docpubDate=date.parse(docpubDatestr);
	
	//ParamUtil.getDate(request, "docpubDate",DateFormat.getDateInstance(DateFormat.SHORT));
	String  docUploadDatestr = request.getParameter("docUploadDate");
	Date docUploadDate=null;
	if(docUploadDatestr!=null && !docUploadDatestr.isEmpty())
	docUploadDate =serverDate.parse(serverDate.format(formDate.parse(docUploadDatestr)));
	String docCopyright = ParamUtil.getString(request, "docCopyright");
	String docFull_COM = ParamUtil.getString(request, "docFull_COM");
	String docCOM = ParamUtil.getString(request, "docCOM");
	ArrayList<String>customFldList =new ArrayList<String>();
	ArrayList<String>catgFldList =new ArrayList<String>();
	
	
	HashMap <String,Object>customfldMap=new HashMap<String,Object>();
	HashMap <String,Object>catgmaplst=new HashMap<String,Object>();
	HashMap <String,String>catgfindermap=new HashMap<String,String>();
	
	if(docSite!=null && !docSite.isEmpty()){
		customFldList.add("Site");
		customfldMap.put("Site",docSite);
	}
	if(docAuthor!=null && !docAuthor.isEmpty()){
		customFldList.add("Author");
		customfldMap.put("Author",docAuthor);
	}
	if(docFull_COM!=null && !docFull_COM.isEmpty()){
		customFldList.add("Full_COM");
		customfldMap.put("Full_COM",docAuthor);
	}
	if(docCOM!=null && !docCOM.isEmpty()){
		customFldList.add("COM");
		customfldMap.put("COM",docCOM);
	}
	/* if(docUploadDate!=null && !docUploadDate.isEmpty()){
		customFldList.add("Upload Date");
		customfldMap.put("Upload Date",docUploadDate);
	} */
	  if(docpubDate!=null){
	catgFldList.add("Publish_date");
	catgmaplst.put("Publish_date",docpubDate);
	catgfindermap.put("Publish_date","fileid");
}   
	if(docType!=null && !docType.isEmpty() ){
		//docType=docType+ " information";
		catgFldList.add("Type");
		catgmaplst.put("Type",docType);
		catgfindermap.put("Type","filetype");
	}
	if(docCategory!=null && !docCategory.isEmpty()){
		catgFldList.add("Category");
		catgmaplst.put("Category",docCategory);
		catgfindermap.put("Category","filecategory");
		
		
	}

	



//---------------------------------End Here-----------------------------

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

String displayStyle = ParamUtil.getString(request, "displayStyle");

if (Validator.isNull(displayStyle)) {
	displayStyle = portalPreferences.getValue(PortletKeys.DOCUMENT_LIBRARY, "display-style", PropsValues.DL_DEFAULT_DISPLAY_VIEW);
}

int entryStart = ParamUtil.getInteger(request, "entryStart");
int entryEnd = ParamUtil.getInteger(request, "entryEnd", entriesPerPage);

int total = 0;
%>

<aui:input name="repositoryId" type="hidden" value="<%= repositoryId %>" />

<liferay-util:buffer var="searchInfo">
	<c:if test="<%= (searchType != DLSearchConstants.FRAGMENT) %>">
		<div class="search-info">
			<span class="keywords" style="display: none;">
				<%= (folder != null) ? LanguageUtil.format(pageContext, "searched-for-x-in-x", new Object[] {HtmlUtil.escape(keywords), folder.getName()}) : LanguageUtil.format(pageContext, "searched-for-x-everywhere", HtmlUtil.escape(keywords)) %>
			</span>

			<c:if test="<%= folderId != DLFolderConstants.DEFAULT_PARENT_FOLDER_ID %>">
				<span class="change-search-folder">
					<aui:button onClick='<%= "javascript:" + liferayPortletResponse.getNamespace() + "changeSearchFolder();" %>' value='<%= (folder != null) ? LanguageUtil.get(pageContext, "search-everywhere") : LanguageUtil.get(pageContext, "search-in-the-current-folder") %>' />
				</span>
			</c:if>

			<div style="display:none">
			
			<liferay-ui:icon  cssClass="close-search" id="closeSearch" image="../aui/closethick" url="javascript:;" />
			</div>
			<a href="/web/iucn/document" style="float: right; font-weight: bold;">Back<liferay-ui:icon cssClass="close-search"  url="javascript:;" /></a>
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

<c:if test="<%= ((searchRepositoryId == scopeGroupId) && (searchType == DLSearchConstants.MULTIPLE)) || (searchType == DLSearchConstants.SINGLE) %>">
	<div id="<portlet:namespace />searchInfo">
		<%= searchInfo %>
	</div>
</c:if>

<liferay-util:buffer var="searchResults">
	<liferay-portlet:renderURL varImpl="searchURL">
		<portlet:param name="struts_action" value="/document_library/search" />
	</liferay-portlet:renderURL>

	<div class="document-container" id="<portlet:namespace />documentContainer">
		<aui:form action="<%= searchURL %>" method="get" name="fm">
			<liferay-portlet:renderURLParams varImpl="searchURL" />
			<aui:input name="redirect" type="hidden" value="<%= redirect %>" />
			<aui:input name="breadcrumbsFolderId" type="hidden" value="<%= breadcrumbsFolderId %>" />
			<aui:input name="searchFolderId" type="hidden" value="<%= searchFolderId %>" />
			<aui:input name="searchFolderIds" type="hidden" value="<%= searchFolderIds %>" />

			<%
			PortletURL portletURL = liferayPortletResponse.createRenderURL();

			portletURL.setParameter("struts_action", "/document_library/search");
			portletURL.setParameter("redirect", redirect);
			portletURL.setParameter("breadcrumbsFolderId", String.valueOf(breadcrumbsFolderId));
			portletURL.setParameter("searchFolderId", String.valueOf(searchFolderId));
			portletURL.setParameter("searchFolderIds", String.valueOf(searchFolderIds));
			portletURL.setParameter("keywords", keywords);
			portletURL.setParameter("docType", docType);

			List<String> headerNames = new ArrayList<String>();

			for (String headerName : entryColumns) {
				if (headerName.equals("action")) {
					headerName = StringPool.BLANK;
				}
				else if (headerName.equals("name")) {
					headerName = "title";
				}

				headerNames.add(headerName);
			}

			SearchContainer searchContainer = new SearchContainer(liferayPortletRequest, null, null, SearchContainer.DEFAULT_CUR_PARAM, entriesPerPage, portletURL, headerNames, null);

			Map<String, String> orderableHeaders = new HashMap<String, String>();

			//orderableHeaders.put("title", "title");
			//orderableHeaders.put("size", "size");
			//orderableHeaders.put("create-date", "creationDate");
			//orderableHeaders.put("modified-date", "modifiedDate");
			//orderableHeaders.put("downloads", "downloads");
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

			//searchContainer.setOrderByComparator(orderByComparator);

			searchContainer.setRowChecker(new EntriesChecker(liferayPortletRequest, liferayPortletResponse));

			try {
				SearchContext searchContext = SearchContextFactory.getInstance(request);

				searchContext.setAttribute("paginationType", "regular");
				searchContext.setEnd(entryEnd);
				searchContext.setFolderIds(folderIdsArray);
				
				searchContext.setKeywords(keywords);
				searchContext.setStart(entryStart);
//////////////////////////////////////commented by Amit Start********************************************
List results = new ArrayList();
List results1 = new ArrayList();
if(false){
				Hits hits = DLAppServiceUtil.search(searchRepositoryId, searchContext);

				//List results = new ArrayList();

				List resultRows = searchContainer.getResultRows();

				Document[] docs = hits.getDocs();

				if (docs != null) {
					for (Document doc : docs) {

						// Folder and document

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
				}

				total = hits.getLength();

				searchContainer.setResults(results);
				searchContainer.setTotal(total);
}
	
///////////////////////////////////////////////////////*************commented by Amit end ********************************************	
		if(customFldList.size()>0){
			
			String CustomfldName=customFldList.get(0);
			String customfldval=(String)customfldMap.get(CustomfldName);
			long companyId = PortalUtil.getDefaultCompanyId();
			long class_id=ClassNameLocalServiceUtil.getClassNameId(DLFileEntryConstants.getClassName());
			List<ExpandoValue> values = ExpandoValueLocalServiceUtil.getColumnValues(companyId, class_id, ExpandoTableConstants.DEFAULT_TABLE_NAME, CustomfldName,customfldval, -1, -1);
			for (int cnt = 0; cnt < values.size(); cnt++) {
				 try{
				long fileversionid =values.get(cnt).getClassPK();
				DLFileVersion dlversion=DLFileVersionLocalServiceUtil.getDLFileVersion(fileversionid);
				if(dlversion!=null){
						DLFileEntry objDlfileentry=DLFileVersionLocalServiceUtil.getDLFileVersion(fileversionid).getFileEntry();
					if(objDlfileentry!=null){
						
					
						long fileEntryTypeId11=DLFileVersionLocalServiceUtil.getDLFileVersion(fileversionid).getFileEntryId();
						
						 try{
						         boolean addfileinResult=true;
								  FileEntry obj11=DLAppLocalServiceUtil.getFileEntry(fileEntryTypeId11);
								  if(docUploadDate!=null){
									 Date uploaddate= obj11.getModifiedDate();
									 if(uploaddate.getDay()!=docUploadDate.getDay() ||uploaddate.getMonth()!=docUploadDate.getMonth()||uploaddate.getYear()!= docUploadDate.getYear())
										 continue;
								  }
			//*************************** code for checking all custom values*************************************************
								  for(int ecnt=1;ecnt<customFldList.size();ecnt++){
									  String customflnmval=customFldList.get(ecnt);
									   customfldval=(String)customfldMap.get(customflnmval);
									   String SiteValue="";
									   if(customflnmval.equalsIgnoreCase("site")){
											Object customFieldValues = obj11.getExpandoBridge().getAttribute(customflnmval);            
									         String [] cfValues = (String[]) customFieldValues ;
									         SiteValue = (cfValues .length > 0 ? cfValues [0] : "");
									   }
									   else{
										   Object comFieldValues = obj11.getExpandoBridge().getAttribute(customflnmval); 
										   SiteValue=comFieldValues.toString();
									   }
									   if(!customfldval.equalsIgnoreCase(SiteValue)){
										   addfileinResult=false;
										   break;
									   }
									   
								  }
//**********************************************************code for custom values ends here**************************************				 
//************************* This code is for checking metadadata**********************************************************			
								boolean categadddocs=true;
                                 for(int meatcnt=0;meatcnt<catgFldList.size();meatcnt++){
                                	 Object catgvalDate=null;
                                	 String catgval="";
									String catgName=catgFldList.get(meatcnt);
									if(catgName.toLowerCase().contains("date"))
									 catgvalDate=catgmaplst.get(catgName);
									else
									 catgval=(String)catgmaplst.get(catgName);
									 String doccategory="";
									 java.util.Map<String, com.liferay.portlet.dynamicdatamapping.storage.Fields>  mapcategory=null;
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
																	     //String date=null;
																		while(metatagnamesItr.hasNext())
																		{
																			boolean pubdateflag =true;
																			String chkstring ="";     
																			String metatagnamesStr=metatagnamesItr.next();
																			     if(catgName.equalsIgnoreCase("Category")){
																			    	 chkstring="catg"; 
																			     }
																			    	 
																			     if(catgName.equalsIgnoreCase("Type")){
																			    	 chkstring="type";  
																			     }
																			     if(catgName.equalsIgnoreCase("Publish_Date")){
																			    	 chkstring="pubdate"; 
																			    	 pubdateflag =false;
																			    	 if(metatagnamesStr.toLowerCase().contains(chkstring)){
																				    	 fieldd=field.get(metatagnamesStr);
																				    	 Date pubdate=(Date)fieldd.getValue();
																				    	Date publishdate=(Date)catgvalDate;
																				    	if(pubdate.getYear()!=publishdate.getYear()|| pubdate.getMonth()!=publishdate.getMonth()|| pubdate.getDay()!=publishdate.getDay())
																				    	{
																				    		categadddocs=false;
																				    		outloop=false;
																				    		 break;
																				    	}
																			          }
																			     }	
																			     if(metatagnamesStr.toLowerCase().contains(chkstring) && pubdateflag){
			 																    	 fieldd=field.get(metatagnamesStr);
			 																    	doccategory =(String) fieldd.getValue().toString();
			 																    	doccategory =doccategory .replace("[\"","" );
			 																    	doccategory =doccategory .replace("\"]","" );
			 																    	if(!catgval.equalsIgnoreCase(doccategory))
			 																    	{
			 																    		categadddocs=false;
			 																    		outloop=false;
			 																    		 break;
			 																    	}
			 															          }
																        }
																		if(!outloop)
																			break;
													  
											                    }
											
									
						                
										  }
									
								}
                   ///***************************************code for metadata ends here******************************************************              
                             	if(categadddocs && addfileinResult){
									results.add(obj11);
								}
								//////////////// check for metadata fields
								
									
						     
					  }catch(Exception e ){ 
					     ////user with this primary key was not found in DB .....  
						  System.out.println("exception:::"+e.getMessage());
					  }//
					}
				}	
				
			 }catch(Exception e ){ 
			     ////user with this primary key was not found in DB .....  
				  System.out.println("exception11:::"+e.getMessage());
			  }
			}	 
			
		}
		
		else{
			if(catgFldList.size()>0){
				String catgName=catgFldList.get(0);
				 Date catgvalDate=null;
				 String catgval="";
				 List<docs_customData> docList=new ArrayList<docs_customData>();
				
				   if(catgName.equalsIgnoreCase("type")){
					   catgval=(String)catgmaplst.get(catgName);
					   docList=docs_customDataLocalServiceUtil.findBytype(catgval);
					   //docList=docs_customDataUtil.findByfiletype(catgval);
				   }
                   if(catgName.equalsIgnoreCase("category")){
                	   catgval=(String)catgmaplst.get(catgName);
                	   docList=docs_customDataLocalServiceUtil.findBycategory(catgval);
                	   //docList= docs_customDataUtil.findByfilecategory(catgval);
                	   
				   }
                  if(catgName.equalsIgnoreCase("publish_date")){
                	  catgvalDate=(Date)catgmaplst.get(catgName);
                	  docList=docs_customDataLocalServiceUtil.findBypulicDate(catgvalDate);
                	 // docList= docs_customDataUtil.findByfileid(catgvalDate);
				   }
                  for(int doccnt=0;doccnt<docList.size();doccnt++){
                	  docs_customData customdocument=docList.get(doccnt);
                	  long fileobjid=customdocument.getFileentryid();
                	  FileEntry fileobj=DLAppLocalServiceUtil.getFileEntry(fileobjid);
                	  if(docUploadDate!=null){
							 Date uploaddate= fileobj.getModifiedDate();
							 if(uploaddate.getDay()!=docUploadDate.getDay() ||uploaddate.getMonth()!=docUploadDate.getMonth()||uploaddate.getYear()!= docUploadDate.getYear())
								 continue;
						  }
                	 long fileversionid= fileobj.getFileVersion().getFileVersionId();
                	DLFileEntry objDlfileentry=DLFileEntryLocalServiceUtil.getFileEntry(fileobjid);
                	  //matching code for all categories
                	  boolean categadddocs=true;
                	  for(int meatcnt=1;meatcnt<catgFldList.size();meatcnt++){
 						 catgName=catgFldList.get(meatcnt);
 						  catgvalDate=null;
 						    if(catgName.toLowerCase().contains("date"))
 							 catgvalDate=(Date)catgmaplst.get(catgName);
 							else
 							 catgval=(String)catgmaplst.get(catgName);
 						 String doccategory="";
 						 java.util.Map<String, com.liferay.portlet.dynamicdatamapping.storage.Fields>  mapcategory=null;
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
 														     //String date=null;
 															while(metatagnamesItr.hasNext())
 															{
 																boolean pubdateflag =true;
 																String chkstring ="";     
 																String metatagnamesStr=metatagnamesItr.next();
 																     if(catgName.equalsIgnoreCase("Category")){
 																    	 chkstring="catg"; 
 																     }
 																    	 
 																     if(catgName.equalsIgnoreCase("Type")){
 																    	 chkstring="type";  
 																     }
 																     if(catgName.equalsIgnoreCase("Publish_Date")){
 																    	 chkstring="pubdate"; 
 																    	 pubdateflag =false;
 																    	 if(metatagnamesStr.toLowerCase().contains(chkstring)){
 																	    	 fieldd=field.get(metatagnamesStr);
 																	    	 Date pubdate=(Date)fieldd.getValue();
 																	    	 //Date publishdate=(Date)catgvalDate;
 																	    	if(pubdate.getYear()!=catgvalDate.getYear()|| pubdate.getMonth()!=catgvalDate.getMonth()|| pubdate.getDay()!=catgvalDate.getDay())
 																	    	{
 																	    		categadddocs=false;
 																	    		outloop=false;
 																	    		 break;
 																	    	}
 																          }
 																     }	 
 																      if(metatagnamesStr.toLowerCase().contains(chkstring) && pubdateflag){
 																    	 fieldd=field.get(metatagnamesStr);
 																    	doccategory =(String) fieldd.getValue().toString();
 																    	doccategory =doccategory .replace("[\"","" );
 																    	doccategory =doccategory .replace("\"]","" );
 																    	if(!catgval.equalsIgnoreCase(doccategory))
 																    	{
 																    		categadddocs=false;
 																    		outloop=false;
 																    		 break;
 																    	}
 															          }
 													        }
 															if(!outloop)
 																break;
 										  
 								                    }
 								
 						
 			                
 							  }
 						
 					}
                	 if(categadddocs) {
                		 results.add(fileobj); 
                	 }
                	  
                	  
                	  
                	  //////
                  }
		}

	}
		 searchContainer.setResults(results);
		 total=results.size();
		searchContainer.setTotal(total);


//////////////////////////////code end for custom fields.........................	


//******************************************* checking for metadata only*******************************************************
for (int i = 0; i < results.size(); i++) {
					Object result = results.get(i);
				%>

					<%@ include file="/html/portlet/document_library/cast_result.jspf" %>

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

							<%
							List resultRows = searchContainer.getResultRows();

							ResultRow row = new ResultRow(fileEntry, fileEntry.getFileEntryId(), i);

							// Position

							PortletURL rowURL = liferayPortletResponse.createRenderURL();

							rowURL.setParameter("struts_action", "/document_library/view_file_entry");
							rowURL.setParameter("redirect", currentURL);
							rowURL.setParameter("fileEntryId", String.valueOf(fileEntry.getFileEntryId()));

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
									row.addText(fileEntry.getTitle(), rowURL);
								}
								 DLFileVersion docVersion = (DLFileVersion)fileEntry.getFileVersion().getModel();
									
									if (columnName.equalsIgnoreCase("Document Type")) {
										
										
										 if(docVersion!=null){
											 long docTypeId = docVersion.getFileEntryTypeId();
											 DLFileEntryType docType1 = DLFileEntryTypeLocalServiceUtil.getFileEntryType(docTypeId);
											 String docTypeName = docType1.getName();
										     row.addText(docTypeName);
										 }
								}

								/* if (columnName.equals("size")) {
									row.addText(TextFormatter.formatKB(fileEntry.getSize(), locale) + "k");
								} */
							
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
																	     //String date=null;
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
									row.addText(doccategory);
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

				<%
				}
				%>

				<c:if test="<%= results.isEmpty() %>">
					<div class="portlet-msg-info">
						<%-- <%= LanguageUtil.format(pageContext, "no-documents-were-found-that-matched-the-keywords-x", "<strong>" + HtmlUtil.escape(keywords) + "</strong>") %> --%>
					</div>
				</c:if>

				<c:if test='<%= displayStyle.equals("list") %>'>
					<liferay-ui:search-iterator paginate="<%= false %>" searchContainer="<%= searchContainer %>" type="more" />
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
</liferay-util:buffer>

<c:choose>
	<c:when test="<%= searchType == DLSearchConstants.MULTIPLE %>">
		<c:choose>
			<c:when test="<%= (searchRepositoryId == scopeGroupId) %>">
				<div class="search-results-container" id="<portlet:namespace />searchResultsContainer">
					<liferay-ui:tabs
						names='<%= "local," + ListUtil.toString(mountFolders, "name") %>'
						refresh="<%= false %>"
					>
						<liferay-ui:section>
							<div class="local-search-results" id='<%= liferayPortletResponse.getNamespace() + "searchResults" + searchRepositoryId %>'>
								<%= searchResults %>
							</div>
						</liferay-ui:section>

						<%
						for (Folder mountFolder : mountFolders) {
						%>

							<liferay-ui:section>
								<div id="<portlet:namespace />repositorySearchResultsContainer<%= mountFolder.getRepositoryId() %>">
									<div class="portlet-msg-info">
										<%= LanguageUtil.get(pageContext, "searching,-please-wait") %>
									</div>
								</div>
							</liferay-ui:section>

						<%
						}
						%>

					</liferay-ui:tabs>
				</div>

				<span id="<portlet:namespace />displayStyleButtons">
					<liferay-util:include page="/html/portlet/document_library/display_style_buttons.jsp" />
				</span>
			</c:when>
			<c:when test="<%= (searchRepositoryId != scopeGroupId) %>">
				<div class="repository-search-results" id='<%= liferayPortletResponse.getNamespace() + "searchResults" + searchRepositoryId %>'>
					<%= searchResults %>
				</div>
			</c:when>
		</c:choose>
	</c:when>
	<c:when test="<%= searchType == DLSearchConstants.SINGLE %>">
		<div id="<portlet:namespace />singleSearchResults">
			<%= searchResults %>
		</div>
	</c:when>
	<c:when test="<%= searchType == DLSearchConstants.FRAGMENT %>">
		<div id="<portlet:namespace />fragmentSearchResults">
			<%= searchResults %>
		</div>
	</c:when>
</c:choose>

<%!
private static Log _log = LogFactoryUtil.getLog("portal-web.docroot.html.portlet.document_library.search_resources_jsp");
%>