<%-- <%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %> --%>

<%-- <portlet:defineObjects /> --%>

<!-- This is the <b>kml loader</b> portlet. -->

<%@ include file="init.jsp" %>
<%@ page import="com.iucn.whp.dbservice.service.country_lkpLocalServiceUtil" %>
<%@ page import="com.iucn.whp.dbservice.service.whp_sitesLocalServiceUtil" %>
<%@ page import="com.iucn.whp.dbservice.model.whp_sites"%>

<!-- <div style="width:25%; height:25%" id="mapInfo"></div> -->
<!-- <link rel="stylesheet" href="http://openlayers.org/website.css" type="text/css" /> -->
<script type="text/javascript" src="${pageContext.request.contextPath}/js/OpenLayers.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/mapLoader.js"></script>
<script src="http://maps.google.com/maps/api/js?v=3.5&amp;sensor=false"></script>
<script type="text/javascript">
    // tell OpenLayers where the control images are
    // remember the trailing slash
     OpenLayers.ImgPath = "/js/theme/default/img/";
</script>


<% 

/* String rParameter_siteId = request.getParameter("site_Id");	
long selsiteId = Long.parseLong(rParameter_siteId);
whp_sites obj_whp_sites = whp_sitesLocalServiceUtil.getSiteBySiteId(selsiteId);
long wdpa_id= obj_whp_sites.getWdpa_id(); */
/* long wdpa_id=0;
wdpa_id=Long.parseLong(request.getAttribute("wdpa_id").toString()); */

long wdpa_id = Long.parseLong(request.getParameter("wdpaid"));


%>

<!-- <div id="map1">
	<iframe frameborder="0" scrolling="no" marginheight="0" marginwidth="0" style="height: 160px"></iframe>
</div> -->

<div style="width:100%; height: 100%" class="frame" id="map1" margin="1px"></div>

<script type="text/javascript">
$(document).ready(
		function() {
			var loadGoogleLayers = new mapLoader();
			loadGoogleLayers.init('<%=wdpa_id%>'); 

		});
	</script>

