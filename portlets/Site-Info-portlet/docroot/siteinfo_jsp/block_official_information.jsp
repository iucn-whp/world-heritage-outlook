<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://liferay.com/tld/security" prefix="liferay-security" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/util" prefix="liferay-util" %>

<portlet:defineObjects />
<portlet:resourceURL var="updateContent"/>


<div class="mainBlockContainer01">
<div class="floatLeftBlock">


<div class="borderWrapper">



<%-- <h2 class="pageHeading"><c:out value="${objwhp_sites.getName_en()}" /></h2> --%>
<!--tableWrapper starts here-->
<div class="tableWrapper">
	<div class="header01">
	<h3 class="basicInfoPageTitle">Official Information</h3></div>

<div id="inscriptionCriteriaDiv">
<jsp:include page="/siteinfo_jsp/innerJSP/official_inscription_criteria.jsp"></jsp:include>
</div>

 <div id="soouvDiv">
<jsp:include page="/siteinfo_jsp/innerJSP/official_soouv.jsp"></jsp:include>
</div>


<div id="inscriptionDateDiv">
<jsp:include page="/siteinfo_jsp/innerJSP/official_inscription_history.jsp"></jsp:include>
</div>

 <div id="iucnRecomDiv">
<jsp:include page="/siteinfo_jsp/innerJSP/official_iucn_recommendation.jsp"></jsp:include>
</div>

<div id="BounModDiv">
<jsp:include page="/siteinfo_jsp/innerJSP/official_boundary_modification.jsp"></jsp:include>
</div>

<div id="dangerDiv">
<jsp:include page="/siteinfo_jsp/innerJSP/official_danger_list.jsp"></jsp:include>
</div>

<div id="dscorDiv">
<jsp:include page="/siteinfo_jsp/innerJSP/official_dsocr.jsp"></jsp:include>
</div>
</div>



</div>

</div>
<!--tableWrapper Ends Here-->
<div class="floatRightBlock">
<p class="docLinksHeading">Missions</p>
<c:forEach items="${lstMissions}" var="SiteMission" varStatus="status">
<div class="links" style="word-wrap:break-word;">
<span>Date - <fmt:formatDate pattern="dd/MM/yyyy" value="${SiteMission.getDate_published()}" /> </span>
<a href="<c:out value="${SiteMission.getDocument_link()}"></c:out>" target="_blank"><c:out value="${SiteMission.getDocument_link()}"></c:out></a>

</div>
</c:forEach>

<p class="docLinksHeading">SOC Reports</p>
<c:forEach items="${lstSoc_reports}" var="SiteSOCReports" varStatus="status">
<div class="links" style="word-wrap:break-word;">
<span>Date - <fmt:formatDate pattern="dd/MM/yyyy" value="${SiteSOCReports.getDate_published()}" /> </span>
<a href="<c:out value="${SiteSOCReports.getDocument_link()}"></c:out>"  target="_blank"><c:out value="${SiteSOCReports.getDocument_link()}"></c:out></a>
</div>
</c:forEach>

</div>


</div>
<script type="text/javascript">


	function dynamicPopup(renderJSPURL,id,popupTitle,e) {
		//creating url
		
		var strCurrentSiteId = <c:out value="${currentSiteId}"/>
		var customUrl="<portlet:renderURL  windowState='<%= LiferayWindowState.POP_UP.toString() %>'><portlet:param name='jspPage' value='jspURL' /><portlet:param name='keyVal' value='keyValue' /><portlet:param name='siteIdVal' value='currentSiteValue' /></portlet:renderURL>";
	    var tempUrl=customUrl.replace("keyValue",id);
	    var tempSiteId = tempUrl.replace("currentSiteValue",strCurrentSiteId);
	    var finalUrl=tempSiteId.replace("jspURL",renderJSPURL);
	    
	    
	    Liferay.Util.openWindow(
				{
					cache: false,
					dialog: {
						modal:true,
						align: Liferay.Util.Window.ALIGN_CENTER,
						after: {
							render: function(event) {
								this.set('y', this.get('y') + 50);
							}
						},
						width: 475,
						resizable:false
					},
					dialogIframe: {
						id: 'My_Iframe',
						uri: finalUrl
					},
					title: popupTitle,
					uri: finalUrl
				}
			);
	
	['liferay-util-window']

	}
	    
	function deletePopup(refreshURL,currentDiv,id,popupTitle) {
		var strCurrentSiteId = <c:out value="${currentSiteId}"/>
		var customUrl="<portlet:renderURL  windowState='<%= LiferayWindowState.POP_UP.toString() %>'><portlet:param name='jspPage' value='jspURL' /><portlet:param name='refreshPage' value='refURL' /><portlet:param name='divVal' value='divValue' /><portlet:param name='keyVal' value='keyValue' /><portlet:param name='siteIdVal' value='currentSiteValue' /><portlet:param name='tableName' value='tableNameValue' /></portlet:renderURL>";
	    var tempUrl=customUrl.replace("keyValue",id);
	    var tempDiv=tempUrl.replace("divValue",currentDiv);
	    var temptabName = tempDiv.replace("tableNameValue", popupTitle);
	    var tempSiteId = temptabName.replace("currentSiteValue",strCurrentSiteId);
	    var refreshPageUrl=tempSiteId.replace("jspURL","/siteinfo_jsp/popups/delete_records.jsp");
	    var finalUrl=refreshPageUrl.replace("refURL",refreshURL);
	    Liferay.Util.openWindow(
				{
					cache: false,
					dialog: {
						modal:true,
						align: Liferay.Util.Window.ALIGN_CENTER,
						after: {
							render: function(event) {
								this.set('y', this.get('y') + 50);
							}
						},
						width: 380,
						resizable:false
						
					},
					dialogIframe: {
						id: 'My_Iframe',
						uri: finalUrl
					},
					title: popupTitle,
					uri: finalUrl
				}
			);
	
	['liferay-util-window']

	
	}
</script>
<!--mainBlock ends here-->

