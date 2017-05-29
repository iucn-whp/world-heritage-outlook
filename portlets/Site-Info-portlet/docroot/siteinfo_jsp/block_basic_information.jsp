<%-- <jsp:include page="/siteinfo_jsp/site_country.jsp" /> --%>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>
<liferay-theme:defineObjects />
<%@include file="init.jsp"%>
<%@include file="/siteinfo_jsp/thumbnail/init.jsp"%>
<%@page import="com.iucn.whp.dbservice.model.*"%>
<%@page import="com.liferay.portal.kernel.repository.model.FileEntry"%>
<%@page import="com.iucn.whp.sites.portlet.siteAdminPortlet"%>
<%@page import="com.liferay.portlet.documentlibrary.model.DLFileEntry"%>
<%@page import="com.liferay.portlet.documentlibrary.util.*"%>
<%@page
	import="com.liferay.portlet.documentlibrary.service.DLAppServiceUtil"%>

 <div class="mainBlockContainer01">
	<%-- <h2 class="pageHeading"><c:out value="${objwhp_sites.getName_en()}" /></h2> --%>
	<div class="floatRightBlock">
		<c:set value="${objwhp_sites.getSite_id()}" var="siteid"></c:set>
		<portlet:actionURL var="uploadURL" name="UploadSiteImage">
		</portlet:actionURL>
		<%-- <liferay-ui:error message="Image with same name have already been uploaded. Try uploading with a different file name." key="duplicateFile" /> --%>

		<%
			long repositoryId = themeDisplay.getLayout().getGroupId();
			themeDisplay.getLayout().getUuid();

			whp_sites currentSite = (whp_sites) request
					.getAttribute("objwhp_sites");
			//long siteid = currentSite.getSite_id();
			long thumbnailID = currentSite.getThumbnailid();
			String thumbnailUrl = "";
			if (thumbnailID == 0) {
				thumbnailUrl = "/Site-Info-portlet/upload/mountains_of_virgin_komi_02.jpg";
			} else {
				if( DLAppServiceUtil.getFileEntry(thumbnailID) != null && !"".equals(DLAppServiceUtil.getFileEntry(thumbnailID)) ){
					FileEntry fe = DLAppServiceUtil.getFileEntry(thumbnailID);
					thumbnailUrl = DLUtil.getThumbnailSrc(fe, null, themeDisplay);
				} else{
					thumbnailUrl = "/Site-Info-portlet/upload/mountains_of_virgin_komi_02.jpg";
				}
			}

			/* long pLid = themeDisplay.getPlid();
			String portletId = themeDisplay.getPortletDisplay().getId();
			String doAsUserId = String.valueOf(themeDisplay.getUserId());
			String doAsGroupId = String.valueOf(themeDisplay.getScopeGroupId());
			String languageId = themeDisplay.getLanguageId();
			String connectorURL = themeDisplay.getURLPortal()
					+ "/html/js/editor/ckeditor/editor/filemanager/browser/liferay/browser.html?Connector=";

			String resourceSelectorParam = "/c/portal/fckeditor?p_l_id=" + pLid
					+ "&p_p_id=" + HttpUtil.encodeURL(portletId) + "&userId="
					+ HttpUtil.encodeURL(doAsUserId) + "&doAsGroupId="
					+ HttpUtil.encodeURL(doAsGroupId);

			connectorURL += HttpUtil.encodeURL(resourceSelectorParam); */
			//get the current url
			//String currentURL = PortalUtil.getCurrentURL(request);
		%>
		<script type="text/javascript">
	var CKEDITOR={
			 tools : {
				callFunction: function(funcNum, fileUrl){
					$('#imagePreview').attr('src' ,fileUrl);
					$('#<portlet:namespace/>slideImage').val(fileUrl);
					alert(fileUrl);
					}
			}
	};
	<%-- function selectImage(){
			window.open('<%=connectorURL%>
			', "mywindow",
						"scroll=1,status=1,menubar=1,width=700,height=550");
			} --%>
		</script>
		<!--<div class="thumbnail"></div>  -->

		<!-- <div class="thumbnail"></div> -->
		<div>
			<img id="thumbnailImg" src="<%=thumbnailUrl%>" alt="" height="94"
				width="170">

			<!-- <div> -->
			<div class="hideAdminAction">
				<aui:form action="<%=uploadURL%>" method="post"
					enctype="multipart/form-data">
					<aui:fieldset>
						<aui:input name="fileUpload" type="file"></aui:input>
						<aui:input name="fileUpload_small" type="file"></aui:input>
						<%-- <aui:input name="title"></aui:input>
		<aui:input name="description" type="textarea"></aui:input> --%>
						<aui:button type="submit" value="Upload"></aui:button>
						<aui:input name="repositoryId" type="hidden" value="<%=repositoryId %>"></aui:input>
						<aui:input name="siteid" type="hidden" value="<%=siteid %>"></aui:input>
					</aui:fieldset>
				</aui:form>
			</div>
			<!-- <a href="javascript:selectImage();">Browse Existing Image</a>  -->
		</div>

		<%-- <div>
		<c:if test="<%= objwhp_sites != null %>">
			<portlet:renderURL var="editSiteThumbnailURL" windowState="<%= LiferayWindowState.POP_UP.toString() %>">
				<portlet:param name="jspPage" value="/siteinfo_jsp/thumbnail/edit_site_thumbnail.jsp" />
				<portlet:param name="redirect" value="<%= currentURL %>" />
				<portlet:param name="siteId" value="<%= String.valueOf(objwhp_sites.getSite_id()) %>" />
				<portlet:param name="thumbnailid" value="<%= String.valueOf(objwhp_sites.getThumbnailid()) %>" />
			</portlet:renderURL>

			<liferay-ui:logo-selector
				defaultLogoURL="<%= UserConstants.getPortraitURL(themeDisplay.getPathImage(), user.isMale(), 0) %>"
				editLogoURL="<%= editSiteThumbnailURL %>"
				imageId="<%= objwhp_sites.getThumbnailid() %>"
				logoDisplaySelector=".user-logo"
				showBackground="<%= false %>"
			/>
		</c:if>
	</div> --%>
		<%-- <div>	
	<img id="thumbnailImg" src="/Site-Info-portlet/upload/mountains_of_virgin_komi_02.jpg" alt="" height="94" width="170"> 
	</div>
	<br>
	<a href="javascript:dynamicPopup('/siteinfo_jsp/popups/edit_basic_information_thumbnail.jsp','${objwhp_sites.getSite_id()}','Thumbnail');">Change Thumbnail</a> --%>

		<p>
			<c:out value="${objwhp_sites.getName_en()}" />
		</p>
	</div>
	
	
	<div class="floatLeftBlock">

				<div id="basicInfoEdit" class="borderWrapper">
					<jsp:include page="/siteinfo_jsp/innerJSP/basic_information_edit.jsp"></jsp:include>
				</div>
				<!-- <div class="infoWrapper">
			<div class="rowWrapper">
			<div class="row">
				<span class="inputLeft">Assessment of Conservation Outlook</span>
				
				<span class="inputRight">dfgdf</span>
				</div>
				</div>
			</div> -->
			
			<div id="SitedescDiv" class="borderWrapper">
					<jsp:include page="/siteinfo_jsp/innerJSP/site_description.jsp"></jsp:include>
			</div>
			
			
				<div id="basicInfoCountryAdd" class="borderWrapper">
					<jsp:include
						page="/siteinfo_jsp/innerJSP/basic_information_country_edit.jsp"></jsp:include>
				</div>
				
								
				
				
	</div>

</div>