<%-- <%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %> --%>

<%-- <portlet:defineObjects /> --%>

<!-- This is the <b>kml loader</b> portlet. -->

<%@ include file="init.jsp" %>
<%@ page import="com.iucn.whp.dbservice.service.country_lkpLocalServiceUtil" %>
<%@ page import="com.iucn.whp.dbservice.service.whp_sitesLocalServiceUtil" %>

<!-- <div style="width:25%; height:25%" id="mapInfo"></div> -->
<!-- <link rel="stylesheet" href="http://openlayers.org/website.css" type="text/css" /> -->
<script type="text/javascript" src="${pageContext.request.contextPath}/js/OpenLayers.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/kmlLoader.js"></script>
<script src="http://maps.google.com/maps/api/js?v=3.5&amp;sensor=false"></script>
<script type="text/javascript">
    // tell OpenLayers where the control images are
    // remember the trailing slash
     OpenLayers.ImgPath = "/js/theme/default/img/";
</script>


<% 
long wdpa_id=0;
long temp_siteid=Long.parseLong(request.getAttribute("siteId").toString());

whp_sites current_Site = whp_sitesLocalServiceUtil.getwhp_sites(temp_siteid);
wdpa_id = current_Site.getWdpa_id();
//String wdpaID=request.getParameter("");

%>
<div style="width:990px; height:400px" id="map1"></div>

<script type="text/javascript">
$(document).ready(
		function() {
			var loadGoogleLayers = new kmlLoader();
			loadGoogleLayers.init('<%=wdpa_id%>'); 

		});
	</script>

