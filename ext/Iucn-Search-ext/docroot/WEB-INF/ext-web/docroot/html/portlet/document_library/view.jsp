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

<%@ include file="/html/portlet/document_library/init.jsp" %>
<%@page import="com.iucn.whp.dbservice.model.*"%>
<%@page import="com.iucn.whp.dbservice.service.*"%>
<%@ page import ="com.liferay.portlet.expando.service.ExpandoValueLocalServiceUtil" %>
<%@ page import ="com.liferay.portlet.expando.model.ExpandoTableConstants" %>
<%@ page import ="com.liferay.portlet.expando.model.ExpandoValue" %>
<%@ page import ="com.liferay.portlet.expando.model.ExpandoColumn" %>
<%@ page import ="com.liferay.portlet.expando.model.ExpandoBridge" %>
<%@ page import ="com.liferay.portlet.expando.model.ExpandoTable" %>
<%@ page import ="com.liferay.portlet.documentlibrary.service.DLFileVersionLocalServiceUtil" %>
<%@ page import ="com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil" %>
<%@page import="com.liferay.portlet.documentlibrary.model.DLFileEntry"%>
<%@page import="com.liferay.portlet.expando.service.ExpandoTableLocalServiceUtil" %>
<%@page import="com.liferay.portlet.expando.service.ExpandoColumnLocalServiceUtil" %>


<style type="text/css">
<%@include file="../../css/documentLibrary.css"%>
</style>

<%
String test12323="";
Folder folder = (com.liferay.portal.kernel.repository.model.Folder)request.getAttribute(WebKeys.DOCUMENT_LIBRARY_FOLDER);

List<assessment_lang_lkp> lstassessment_lang=null;

long folderId = BeanParamUtil.getLong(folder, request, "folderId", rootFolderId);

if ((folder == null) && (folderId != DLFolderConstants.DEFAULT_PARENT_FOLDER_ID)) {
	try {
		folder = DLAppLocalServiceUtil.getFolder(folderId);
	}
	catch (NoSuchFolderException nsfe) {
		folderId = DLFolderConstants.DEFAULT_PARENT_FOLDER_ID;
	}
}

long repositoryId = scopeGroupId;

if (folder != null) {
	repositoryId = folder.getRepositoryId();
}

String displayStyle = ParamUtil.getString(request, "displayStyle");

if (Validator.isNull(displayStyle)) {
	displayStyle = portalPreferences.getValue(PortletKeys.DOCUMENT_LIBRARY, "display-style", PropsValues.DL_DEFAULT_DISPLAY_VIEW);
}

if (!ArrayUtil.contains(displayViews, displayStyle)) {
	displayStyle = displayViews[0];
}

int entryStart = ParamUtil.getInteger(request, "entryStart");
int entryEnd = ParamUtil.getInteger(request, "entryEnd", entriesPerPage);

int entryRowsPerPage = entryEnd - entryStart;

int folderStart = ParamUtil.getInteger(request, "folderStart");
int folderEnd = ParamUtil.getInteger(request, "folderEnd", SearchContainer.DEFAULT_DELTA);

int folderRowsPerPage = folderEnd - folderStart;

String orderByCol = ParamUtil.getString(request, "orderByCol");
String orderByType = ParamUtil.getString(request, "orderByType");

if (Validator.isNotNull(orderByCol) && Validator.isNotNull(orderByType)) {
	portalPreferences.setValue(PortletKeys.DOCUMENT_LIBRARY, "order-by-col", orderByCol);
	portalPreferences.setValue(PortletKeys.DOCUMENT_LIBRARY, "order-by-type", orderByType);
}

request.setAttribute("view.jsp-folder", folder);

request.setAttribute("view.jsp-folderId", String.valueOf(folderId));

request.setAttribute("view.jsp-repositoryId", String.valueOf(repositoryId));
%>

<div id="<portlet:namespace />documentLibraryContainer">
	<aui:layout cssClass="lfr-app-column-view">
	<!-- //<div style ="display:none" >  -->
	
	
	
	
	 <aui:column columnWidth="<%= showFolderMenu ? 80 : 100 %>" cssClass="context-pane" last="<%= true %>">
						<div class="lfr-header-row">
						<div class="lfr-header-row-content">
						
					<div class="barHolder">

						<div class="toolbarSiteSearch">
							<liferay-util:include
								page="/html/portlet/document_library/toolbar1.jsp" />
								</div>


						<div class="seacrhBarTop">

							<!-- <button id="btnAdvanceSearch">Advance Search</button> -->
							<c:if test="<%= showFoldersSearch %>">
								<liferay-util:include
									page="/html/portlet/document_library/file_entry_search.jsp" />
							</c:if>

						</div>

					</div>


								</div>
						</div>
						</aui:column>  
						
						
						
		<aui:column columnWidth="<%= 20 %>" cssClass="navigation-pane" first="<%= true %>">
		
			<liferay-util:include page="/html/portlet/document_library/view_folders.jsp" />

			<div class="folder-paginator"></div>
		</aui:column>
<!--  </div>  --> 



		<aui:column columnWidth="<%= showFolderMenu ? 80 : 100 %>" cssClass="context-pane" last="<%= true %>">
			<div class="lfr-header-row">
				<div class="lfr-header-row-content">
				





					<div class="toolbarBottom">

						<div class="toolbarCheckBox">
						<liferay-util:include page="/html/portlet/document_library/toolbar.jsp" />
					</div>
		
			 <portlet:resourceURL var="exportType">
               <portlet:param name="struts_action" value="/document_library/edit_entry" />
               <portlet:param name="fileEntryIds"  value='' />
               <portlet:param name="cmd" value="EXPORT" />
            </portlet:resourceURL> 
			
			
			
				<c:if test="<%= !user.isDefaultUser() %>">
			<aui:button onClick='<%= renderResponse.getNamespace() + "downloadOrders(1)"%>'  id="export" value="Export" />
			<aui:button onClick='<%= renderResponse.getNamespace() + "downloadOrders(2)"%>'  id="export" value="Download" />

	         </c:if>
			
			<c:if test="<%= !user.isDefaultUser() %>">
 						<aui:button id="btnAdvanceSearch" value="Advance Search" />

						</c:if>					

					<div class="display-style">
						<span class="toolbar" id="<portlet:namespace />displayStyleToolbar"></span>
					</div>
				</div>
			</div>

			<div class="document-library-breadcrumb" id="<portlet:namespace />breadcrumbContainer" style="display: none;">
				<liferay-util:include page="/html/portlet/document_library/breadcrumb.jsp" />
			</div>

			<liferay-portlet:renderURL varImpl="editFileEntryURL">
				<portlet:param name="struts_action" value="/document_library/edit_file_entry" />
			</liferay-portlet:renderURL>

			<aui:form action="<%= editFileEntryURL.toString() %>" method="get" name="fm2">
				<aui:input name="<%= Constants.CMD %>" type="hidden" />
				<aui:input name="redirect" type="hidden" value="<%= currentURL %>" />
				<aui:input name="repositoryId" type="hidden" value="<%= repositoryId %>" />
				<aui:input name="newFolderId" type="hidden" />
				<aui:input name="folderIds" type="hidden" />
				<aui:input name="fileEntryIds" type="hidden" />
				<aui:input name="fileShortcutIds" type="hidden" />

				<div class="document-container" id="<portlet:namespace />documentContainer">
					<liferay-util:include page="/html/portlet/document_library/view_entries.jsp" />
				</div>

				<div class="document-entries-paginator"></div>
			</aui:form>
		</aui:column>
	</aui:layout>
</div>

<%
int entriesTotal = GetterUtil.getInteger((String)request.getAttribute("view_entries.jsp-total"));
int foldersTotal = GetterUtil.getInteger((String)request.getAttribute("view_folders.jsp-total"));

if (folder != null) {
	if (portletName.equals(PortletKeys.DOCUMENT_LIBRARY)) {
		PortalUtil.setPageSubtitle(folder.getName(), request);
		PortalUtil.setPageDescription(folder.getDescription(), request);
	}
}
%>

<aui:script>
	Liferay.provide(
		window,
		'<portlet:namespace />toggleActionsButton',
		function() {
			var A = AUI();

			var actionsButton = A.one('#<portlet:namespace />actionsButtonContainer');

			var hide = (Liferay.Util.listCheckedExcept(document.<portlet:namespace />fm2, '<portlet:namespace /><%= RowChecker.ALL_ROW_IDS %>Checkbox').length == 0);

			if (actionsButton) {
				actionsButton.toggle(!hide);
			}
		},
		['liferay-util-list-fields']
	);

	<portlet:namespace />toggleActionsButton();
</aui:script>

<span id="<portlet:namespace />displayStyleButtonsContainer">
	<liferay-util:include page="/html/portlet/document_library/display_style_buttons.jsp" />
</span>

<aui:script use="liferay-document-library">
	<liferay-portlet:resourceURL copyCurrentRenderParameters="<%= false %>" varImpl="mainURL" />

	new Liferay.Portlet.DocumentLibrary(
		{
			actions: {
				DELETE: '<%= Constants.DELETE %>',
				MOVE: '<%= Constants.MOVE %>'
			},
			allRowIds: '<%= RowChecker.ALL_ROW_IDS %>',
			defaultParams: {
				p_p_id: <%= portletId %>,
				p_p_lifecycle: 0
			},
			defaultParentFolderId: '<%= DLFolderConstants.DEFAULT_PARENT_FOLDER_ID %>',
			displayStyle: '<%= HtmlUtil.escapeJS(displayStyle) %>',
			displayViews: ['<%= StringUtil.merge(displayViews, "','") %>'],
			editEntryUrl: '<portlet:actionURL><portlet:param name="struts_action" value="/document_library/edit_entry" /></portlet:actionURL>',
			entriesTotal: <%= entriesTotal %>,
			entryEnd: <%= entryEnd %>,
			entryRowsPerPage: <%= entryRowsPerPage %>,
			entryRowsPerPageOptions: [<%= StringUtil.merge(PropsValues.SEARCH_CONTAINER_PAGE_DELTA_VALUES) %>],
			entryStart: <%= entryStart %>,
			folderEnd: <%= folderEnd %>,
			folderId: <%= folderId %>,
			folderIdRegEx: /&?<portlet:namespace />folderId=([\d]+)/i,
			folderIdHashRegEx: /#.*&?<portlet:namespace />folderId=([\d]+)/i,
			folderRowsPerPage: <%= folderRowsPerPage %>,
			folderRowsPerPageOptions: [<%= StringUtil.merge(PropsValues.SEARCH_CONTAINER_PAGE_DELTA_VALUES) %>],
			folderStart: <%= folderStart %>,
			foldersTotal: <%= foldersTotal %>,
			form: {
				method: 'post',
				node: A.one(document.<portlet:namespace />fm2)
			},
			mainUrl: '<%= mainURL %>',
			moveEntryRenderUrl: '<portlet:renderURL><portlet:param name="struts_action" value="/document_library/move_entry" /></portlet:renderURL>',
			namespace: '<portlet:namespace />',
			portletId: '<%= portletId %>',
			rowIds: '<%= RowChecker.ROW_IDS %>',
			strutsAction: '/document_library/view',
			updateable: <%= DLFolderPermission.contains(permissionChecker, scopeGroupId, folderId, ActionKeys.UPDATE) %>
		}
	);
</aui:script>





<liferay-portlet:resourceURL var="advanceSearch123" >
	<portlet:param name="struts_action" value="/document_library/search" />
</liferay-portlet:resourceURL>

 



<!-- advance search----- -->

<div id="divAdvanceSerach" title="Search Criteria" style="display:none; width: 200px; background: url('/IUCN-theme/images/right_box_bg.GIF') repeat scroll 0 0 transparent;">

<aui:form action="<%= advanceSearch123.toString() %>" method="get" name="advancefm2" onSubmit='<%= "event.preventDefault();advanceDocumentSearch();" %>'>
<!-- 	<div class="formElements">
 -->		
<!-- 	<table class="table.documentTable">
 -->		<table class="formBlock">
	
	
	<tr>
		<td><label class="popuplbl"> Site :</label></td>
		<td>
<aui:select changesContext="<%= true %>" label="" id="docSite" name="docSite"  style="width:202px;" class="siteSelect">
	<aui:option label="Select"  value=""/>
	<%
				
		List<whp_sites> whp_sitesList=null;
		
	    try{
	    	whp_sitesList=whp_sitesLocalServiceUtil.getAllActiveSites();
	    	
	    }catch(Exception ex){
	    	System.out.print("EX: "+ ex.getMessage());
	    }
		
		for (whp_sites currData : whp_sitesList) {
				%>
				<aui:option label="<%= currData.getName_en() %>"  value="<%= currData.getName_en() %>" />
				<%
		}
		%>
	</aui:select>
	</td>
	</tr>
	
<%-- <tr>
	<td><label class="popuplbl">Type:</label></td>
	<td>
<aui:select 
			label=""
			name="docType" 
			id="docType" onChange="javascript:fill_Cities(this.selectedIndex);"
			style="width:202px;"
			>
		<option value="">select</option>
		<option value="Confidential">Confidential</option>
		<option value="Public">Public</option>
		<option value="Official">Official</option>
		<option value="image">Image</option>				
		</aui:select>
	</td>
</tr> --%>

<tr>
	<td><label class="popuplbl">Category:</label>
	</td>
	<td><aui:select changesContext="<%= true %>" label=""
			id="docCategory" name="docCategory" style="width:202px;">
			<aui:option label="Select" value="" />
						<!--##########Added by PN to get document type based on role#######-->
			<%
				String[] categoryList=null;
							
			   String listTodisplay="";
			
				List<Role> userRoles = ((ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY)).getUser().getRoles();
				boolean blnAdminUser = false;
				for (int iUserRole = 0; iUserRole < userRoles.size(); iUserRole++)
				{
					String role = userRoles.get(iUserRole).getName();
					System.out.println(role);
					
					if ("Administrator".equalsIgnoreCase(userRoles.get(iUserRole).getName())|| ("WHP Staff".equalsIgnoreCase(userRoles.get(iUserRole).getName()))) {
						listTodisplay = "Select Document";
						 System.out.println("------------------");
							
					} else if ("Power User".equalsIgnoreCase(userRoles.get(iUserRole).getName())) {
						listTodisplay = "Document type";
	
					} else if ("Reviewer".equalsIgnoreCase(userRoles.get(iUserRole).getName()) || "Assessor".equalsIgnoreCase(userRoles.get(iUserRole).getName())) {
						listTodisplay = "Document";
						}
				}
						try {
							
							//long versionID = DLFileVersionLocalServiceUtil.getLatestFileVersion(fileId, true).getFileVersionId();
							long companyId = PortalUtil.getDefaultCompanyId(); 
							ExpandoTable expandoTable = ExpandoTableLocalServiceUtil.getDefaultTable(companyId, DLFileEntry.class.getName());
							ExpandoColumn column = ExpandoColumnLocalServiceUtil.getColumn(expandoTable.getTableId(), listTodisplay);
							if (column != null) {
							
								String category = column.getDefaultData();
								categoryList = category.split(",");
								
								for (String currData : categoryList) {
									%>
									<aui:option label="<%= currData %>"  value="<%= currData %>" />
									<%
							}
								
							//DLFileEntry dlFileEntry=DLFileVersionLocalServiceUtil.getDLFileVersion(-1).getFileEntry();
							//Object cat= dlFileEntry.getFileVersion().getExpandoBridge().getAttribute("Document"); 
							}					
						} catch (Exception ex)
							{
							 System.out.print("CATEGORY TYPE: " + ex.getMessage());
							}
							
							
						%>
					</aui:select></td>
					</tr><tr>
		<td><label class="popuplbl"> Author :</label></td>
		<td>
<aui:input id="docAuthor" label="" name="docAuthor" type="text" style="width:200px;"  />
</td>
</tr>


<tr>
<td><label class="popuplbl"> Publish Date :</label></td>
<td>

<aui:input id="docpubDate" label=" " name="docpubDate" type="text" style="width:200px;"  />
</td>
</tr>

<tr>
	<td><label class="popuplbl"> Upload Date :</label></td>
	<td>
	<aui:input id="docUploadDate" label="" name="docUploadDate" type="text" style="width:200px;"  />
	</td>
</tr>

<tr>
	<td><label class="popuplbl"> Copyright :</label></td>
	<td>
	<aui:input id="docCopyright" label="" name="docCopyright" type="text" style="width:200px;" />
	</td>
</tr>

<tr>
<td> <label class="popuplbl"> Language :</label></td>
<td>
<%--   <aui:input id="docLanguage" label="" name="docLanguage" type="text" style="width:200px;" /> 
 --%>
<aui:select  label="" id="docLanguage" name="docLanguage"  style="width:200px;" >
	<aui:option label="Select"  value=""/>
			
			<%
			lstassessment_lang=assessment_lang_lkpLocalServiceUtil.findAll();

			
			for(int i=0;i<lstassessment_lang.size();i++)
			{
				assessment_lang_lkp objassment_lkp=lstassessment_lang.get(i);
											
				%>
				<aui:option  value="<%=objassment_lkp.getLanguagename() %>">
				<%=objassment_lkp.getLanguagename() %>
			</aui:option>
			<%} %>
			
			 </aui:select>
</td>
</tr>

<tr >
<td><label class="popuplbl"> Full COM :</label></td>
<td>
<aui:input id="docFull_COM" label="" name="docFull_COM" type="text" style="width:200px;" />
</td>
</tr>


<tr>
<td><label class="popuplbl">  COM :</label></td>
<td>
<aui:input id="docCOM" label="" name="docCOM" type="text" style="width:200px;" />
	</td>
	</tr>
			
	<tr>
			<td colspan="2" align="right">
			
			<br>
	<%-- <aui:button name="search" type="submit" value="Search"  id="advSearch" />&nbsp;
	<aui:button name="Clear" type="reset" value="Clear" /> --%>
	
		<input class="btn " type="submit" value="Search"  />
		<input class="btn" type="reset" value="Clear" />
	</td>
		</tr>
<!-- 	</div>
 -->	
	</table>
	
	</aui:form>	
</div>
 <link rel="stylesheet" href="http://code.jquery.com/ui/1.9.0/themes/base/jquery-ui.css" />
   <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style_metadata_form.css" />
    <script src="http://code.jquery.com/jquery-1.8.2.js"></script>
    <script src="${pageContext.request.contextPath}/resources/demos/external/jquery.bgiframe-2.1.2.js"></script>
    <script src="http://code.jquery.com/ui/1.9.0/jquery-ui.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/demos/style.css" />
    <script>
    // increase the default animation speed to exaggerate the effect
    $.fx.speeds._default = 1000;
    $(function() {
        $( "#divAdvanceSerach" ).dialog({
            autoOpen: false,
           // show: "blind",
            //hide: "explode"
           // height:300,
            width: 308
        });
 
        $( "#btnAdvanceSearch" ).click(function() {
        	$( "#divAdvanceSerach" ).show();
        	$( "#divAdvanceSerach" ).dialog( "open" );
            
            return false;
        });
       });   
    </script>


<aui:script>
//final script for advace search
	function advanceDocumentSearch() {
//	$('#_20_documentContainer').empty();
	
	if((document.getElementById("_20_docFull_COM").value=="")  && (document.getElementById("_20_docLanguage").value=="")&&(document.getElementById("_20_docCopyright").value=="")&&(document.getElementById("_20_docCOM").value=="")&&(document.getElementById("_20_docAuthor").value=="")&&(document.getElementById("_20_docpubDate").value=="")&&(document.getElementById("_20_docUploadDate").value=="")&&(document.getElementById("_20_docCategory").value=="")&&(document.getElementById("_20_docSite").value=="")) 	
 {
		alert("Enter atleast one value to search....");
		return false;
		
	}
	else
	
	$("#divAdvanceSerach" ).dialog( "close" );
	
		Liferay.fire(
			'<portlet:namespace />dataRequest',
			{
				requestParams: {
					'<portlet:namespace />struts_action': '/document_library/search',
					'<portlet:namespace />docCategory': document.<portlet:namespace />advancefm2.<portlet:namespace />docCategory.value,
					'<portlet:namespace />docSite': document.<portlet:namespace />advancefm2.<portlet:namespace />docSite.value,
					'<portlet:namespace />docAuthor': document.<portlet:namespace />advancefm2.<portlet:namespace />docAuthor.value,
					'<portlet:namespace />docpubDate': document.<portlet:namespace />advancefm2.<portlet:namespace />docpubDate.value,
					'<portlet:namespace />docUploadDate': document.<portlet:namespace />advancefm2.<portlet:namespace />docUploadDate.value,
					'<portlet:namespace />docCopyright': document.<portlet:namespace />advancefm2.<portlet:namespace />docCopyright.value,
					'<portlet:namespace />docLanguage': document.<portlet:namespace />advancefm2.<portlet:namespace />docLanguage.value,
					'<portlet:namespace />docFull_COM': document.<portlet:namespace />advancefm2.<portlet:namespace />docFull_COM.value,
					'<portlet:namespace />docCOM': document.<portlet:namespace />advancefm2.<portlet:namespace />docCOM.value,
					'<portlet:namespace />keywords': 'advance_search'
				},
				src: Liferay.DL_SEARCH
			}
		);

		

	}
</aui:script>

<aui:script>

    AUI().use('aui-datepicker', function(A) {

       var simpleDatepicker1 = new A.DatePicker({
       calendar:{
       dates:[],
        dateFormat: '%d/%m/%Y',
        selectMultipleDates: false
       },

        trigger: '#<portlet:namespace />docUploadDate',

       }).render();
		
    });
</aui:script>
<aui:script>

    AUI().use('aui-datepicker', function(A) {

       var simpleDatepicker1 = new A.DatePicker({
       calendar:{
       dates:[],
        dateFormat: '%d/%m/%Y',
        selectMultipleDates: false
       },

        trigger: '#<portlet:namespace />docpubDate',

       }).render();
		
    });
</aui:script>

<script type="text/javascript">
	$(document).ready(function(){
	//	$('#btnAdvanceSearch').css('padding','2px');
		//$('table.documentTable td').css('margin-bottom','10px');
	});
</script>  



<aui:script>
Liferay.provide(
window,
'<portlet:namespace />downloadOrders',
function(type) {

	var val = new Array();
	var fileEntry="";
	var k = 0;
	
	var cattype="";
	if(type==1)
	{
	cattype="Export";
	}
	else if(type==2)
	{
		cattype="Download";
	
	}
	
	$('input:checked').each(function(index,value) {
		            //val[k] = $(this).val();
		            if(k==0)
			    		fileEntry=$(this).val();
			    	else
			    		fileEntry=fileEntry+","+$(this).val();;
		            k++;
		            
		        });
	if(fileEntry!=""){
	
		        
	var customUrl="<portlet:resourceURL> <portlet:param name='struts_action' value='/document_library/edit_entry' /><portlet:param name='fileEntryIds'  value='fileEntryValues' /> <portlet:param name='cmd' value='Export' /></portlet:resourceURL>";
	var tempUrl=customUrl.replace("fileEntryValues",fileEntry);
	var finalurl=tempUrl.replace("Export",cattype);
	submitForm(document.hrefFm, finalurl,false); 
	}
	else
	{
	alert("Please Select Atleast One Document.")
	}
	$('input:checked').each(function(index,value) {
   <!-- $(this).removeAttr('checked'); -->
    });
    
}
);

</aui:script>
