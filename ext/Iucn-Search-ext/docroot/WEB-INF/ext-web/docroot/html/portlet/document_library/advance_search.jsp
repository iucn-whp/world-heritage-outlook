<%@ include file="/html/portlet/document_library/init.jsp" %>


<portlet:resourceURL var="advanceSearch1">
	<portlet:param name="struts_action" value="/document_library/advance_search" />
</portlet:resourceURL>

<button id="opener" onclick="javascript:openAdvanceSerach();">Advance Search</button>
<portlet:resourceURL var="advanceSearch123">
	<portlet:param name="struts_action" value="/document_library/advance_search" />
</portlet:resourceURL>

<form action="<%= advanceSearch1.toString() %>" method="get" id="advanceSerach1" name="myFor1"  onSubmit='<%= "event.preventDefault(); " + liferayPortletResponse.getNamespace() + "searchFileEntry();" %>'>

<aui:input name="Type" value="" id="fileType" />

	<div class="formBlock">
		<div class="formElements">
	<div class="sectionLeft">
		<div class="labelContainer">
			<label>Type :</label>
			<input type="text" class="txtInput" />
		</div>
		
		<div class="labelContainer">
			<label >Category :</label>
			<input type="text" class="txtInput" />
		</div>
		
		<div class="labelContainer">
			<label >Site :</label>
			<input type="text" class="txtInput" />
		</div>
		
		<div class="labelContainer">
			<label >Author :</label>
			<input type="text" class="txtInput" />
		</div>
		
		<div class="labelContainer">
			<label >Publish date :</label>
			<input type="text" class="txtInput" />
		</div>
	</div>
	
	<div class="sectionRight">
		<div class="labelContainer">
			<label >Upload Date :</label>
			<input type="text" class="txtInput" />
		</div>
		
		<div class="labelContainer">
			<label >Copyright:</label>
			<input type="text" class="txtInput" />
		</div>
		
		<div class="labelContainer">
			<label >Language:</label>
			<input type="text" class="txtInput" />
		</div>
		
		<div class="labelContainer">
			<label >Full_COM :</label>
			<input type="text" class="txtInput" />
		</div>	
		
		<div class="labelContainer">
			<label >COM :</label>
			<input type="text" class="txtInput" />
		</div>
	</div>

	
	<div class="buttons contactButtonsWrap">
		<input class="btn" type="submit" value="Search" />
		<input class="btn" type="reset" value="Clear" />
	</div>
	</div>
	</div>
</form>

<liferay-portlet:resourceURL var="searchURL1">
	<portlet:param name="struts_action" value="/document_library/advance_search1" />
	
</liferay-portlet:resourceURL>

<div class="lfr-search-combobox search-button-container" id="<portlet:namespace />fileEntrySearchContainer">
	<aui:form action="<%= searchURL1.toString() %>" method="get" name="fm1" onSubmit='<%= "event.preventDefault(); " + liferayPortletResponse.getNamespace() + "searchFileEntry();" %>'>

		<%
		String taglibOnClick = "javascript:" + liferayPortletResponse.getNamespace() + "AdvanceSearchFileEntry1();";
		%>

		<aui:layout>
			<aui:column columnWidth="70">
				<aui:input cssClass="keywords lfr-search-combobox-item" id="keywords" label="" name="keywords" type="text" />
			</aui:column>

			<aui:column columnWidth="30">
				<aui:button cssClass="lfr-search-combobox-item" name="search1" onClick="<%= taglibOnClick %>" value="search1" />
			</aui:column>
		</aui:layout>
	</aui:form>
</div>

<aui:script>
	function <portlet:namespace />searchFileEntry() {
	alert('test');
		Liferay.fire(
			'<portlet:namespace />dataRequest',
			{
			requestParams:{
				'<portlet:namespace />struts_action': '/document_library/advance_search'
			}
			
			
			}
		);	

	}
</aui:script>


<aui:script>
	function <portlet:namespace />AdvanceSearchFileEntry1() {
		
				Liferay.fire(
					'<portlet:namespace />dataRequest',
					{
						requestParams: {
							'<portlet:namespace />struts_action': '/document_library/search',
							'<portlet:namespace />repositoryId': '1',
							'<portlet:namespace />searchRepositoryId': '1',
							'<portlet:namespace />folderId': '1',
							'<portlet:namespace />searchFolderId': '1',
							'<portlet:namespace />keywords': '1',
							'<portlet:namespace />searchType': <%= DLSearchConstants.MULTIPLE %>
						},
						src: Liferay.DL_SEARCH
					}
				);

			

	}
</aui:script>
