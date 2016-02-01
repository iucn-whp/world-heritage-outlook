<%-- <%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %> --%>

<%-- <portlet:defineObjects /> --%>

<!-- This is the <b>Test Viewer</b> portlet. -->
<%@page import="com.liferay.util.portlet.PortletProps"%>
<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@page import="com.liferay.portal.kernel.dao.search.DisplayTerms"%>
<%@page import="com.liferay.portal.kernel.util.Constants"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui"%>
<%@page import="com.liferay.portal.kernel.dao.search.DisplayTerms"%>
<%@page import="java.util.Arrays"%>
<%@page import="java.util.StringTokenizer"%>
<%@page import="com.iucn.whp.dbservice.service.persistence.conservation_outlookPersistence"%>
<%@page import="com.iucn.whp.dbservice.service.persistence.conservation_outlookUtil"%>
<%@page import="com.iucn.whp.dbservice.service.persistence.conservation_outlook_rating_lkpUtil"%>
<%@page import="com.iucn.whp.dbservice.service.persistence.conservation_outlook_rating_lkpPersistence"%>
<%@page import="com.iucn.whp.dbservice.service.conservation_outlook_rating_lkpLocalServiceUtil"%>
<%@page import="com.iucn.whp.dbservice.service.conservation_outlookLocalServiceUtil"%>
<%@page import="com.iucn.whp.dbservice.service.site_assessment_versionsLocalServiceUtil"%>
<%@page import="java.util.Iterator"%>
<%@page import="com.iucn.whp.searchsite.util.*"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.Set"%>
<%@page import="java.util.TreeMap"%>
<%@page import="com.iucn.whp.dbservice.service.site_assessmentLocalServiceUtil"%>
<%@page import="com.iucn.whp.dbservice.service.unesco_regionLocalServiceUtil"%>
<%@page import="com.iucn.whp.dbservice.service.unesco_region_countryLocalServiceUtil"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.iucn.whp.dbservice.service.whp_sitesLocalServiceUtil"%>
<%@page import="com.iucn.whp.dbservice.service.country_lkpLocalServiceUtil"%>
<%@page import="com.iucn.whp.dbservice.service.whp_sites_countryLocalServiceUtil"%>
<%@page import="java.util.List"%>
<%@ include file="/init.jsp"%>
<%-- <%@ page import="com.rmsi.siteinfo.db.service.country_lkpLocalServiceUtil" %>  --%>

<%@ page import="com.iucn.whp.dbservice.service.iucn_regionLocalServiceUtil" %>
<%@ page import="com.iucn.whp.dbservice.service.iucn_region_countryLocalServiceUtil"%>
<%@ page import="com.iucn.whp.dbservice.model.*"%>
<portlet:resourceURL var="ajaxResourceURL">
	<portlet:param name="<%=Constants.CMD %>" value="<%=ActionKeys.GET_SITE %>"/>
</portlet:resourceURL>	

<portlet:resourceURL var="ajaxResourceURLthumbnail">
	<portlet:param name="<%=Constants.CMD %>" value="<%=ActionKeys.GET_THUMBNAIL %>"/>
</portlet:resourceURL>

<%-- <script language="javascript" type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery-1.4.1.js"></script>
 --%>
<%-- <script type="text/javascript"
	src="${pageContext.request.contextPath}/js/attributeviewer.js"></script> --%>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/style_IUCN_index.css">
<script src="http://maps.google.com/maps/api/js?v=3.5&amp;sensor=false"></script>

<script type="text/javascript">
	OpenLayers.ImgPath = "${pageContext.request.contextPath}/js/theme/default/img/";
</script>

<%-- <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.9.1.js"></script> --%>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-ui-1.10.2.custom.js"></script>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/jquery-ui-1.10.2.custom.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/js/theme/default/style.css" type="text/css">

<%--  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/jquery.autocomplete.css" /> --%>
<%--<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.3.2/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/js/jquery.autocomplete.js"></script> --%>

<!-- continentsListContainer script starts here -->

<!-- get textbox value  -->
  
<script>
var flag = false;
$(document).ready(function(){
  $('.anchorbtns').click(function(){
    //$(this).hide();
    if(flag){
    $(this).text("Satellite");
    $("#Google_Streets").attr("href","javascript:googleLayerManager('Google Streets')");
     flag = false;
    }else{
    $(this).text("Streets");
    $("#Google_Streets").attr("href","javascript:googleLayerManager('Google Satellite')");
    flag = true;
    }
  });
 
  /*list box script start*/
	$('.viewLessBtn').toggle(function(){
		
		$('.list').slideUp('fast');
		$(this).removeClass('viewLessBtn').addClass('viewMoreBtn');
		
		setTimeout(function() {
			$('.searchLabel').hide();
		}, 100);
		
					},
					
		function(){
			$('.list').slideDown('fast');
			$(this).removeClass('viewMoreBtn').addClass('viewLessBtn');
			$('.searchLabel').show();
		});
  /*list box script end*/
  
  
  $('.portlet-column').addClass('portletColumnWidth');
});
</script>


<div style="height: 334px;" class="mapcontainer" id="map">
	 <div class="mapbtns">
	<script type="text/javascript">
$(document).ready(
		function() {
			var loadAttributeViewer = new AttributeViewer();
			loadAttributeViewer.init(); 
		});
	</script> 
	<!--<a id="Google_Satellite" class="anchorbtns" href="javascript:googleLayerManager('Google Satellite');">Satellite</a>
	<a id="Google_Streets" class = "anchorbtns" href="javascript:googleLayerManager('Google Streets');">Streets</a>-->	
	
	<a id="Google_Streets" href="javascript:googleLayerManager('Google Satellite');" class="anchorbtns" onclick="javascript:googleLayerManager('Google Satellite');">Satellite</a> 
	</div> 
	
	
</div>


<div class="continentsListContainer">
		<div class="heading">
			<div class="continentsListContainerBtn">
				<a class="viewLessBtn" href="#">view more/ view less</a>
			</div>
			<h2>Explore Natural Sites</h2>
			
			<span class="searchLabel"></span>
		</div>
		<!-- list starts here -->


<!-- added for Auto suggestion by alok -->
<script type="text/javascript">

AUI().use('aui-autocomplete', function(A) {
		var dataSource = new A.DataSource.IO(
		    {
		        source: '<%=ajaxResourceURL %>'
		    }
		);
		
		var autoComplete = new A.AutoComplete(
		    {
		        dataSource: dataSource,
		        delimChar: '',
		        contentBox: '#siteAutoComplete',
		        matchKey: 'name',
		        maxResultsDisplayed: 20,
		        schema: {
		            resultListLocator: 'response',
		            resultFields: ['key','name','description', 'type', 'wdpaId']
		        },
		        uniqueName:'keyword',
		        schemaType:'json',
		        typeAhead: false,
		        cssClass: 'ac_input'
		    }
		 );
		
		autoComplete.generateRequest = function(query) {
		    return {
		    	
		        request: '&<%=DisplayTerms.KEYWORDS %>=' + query
		    };
		}
		
		autoComplete.on('itemSelect',function(event,data) {   
				var wdpaid = data.wdpaId;
				zoomSiteOnMap(wdpaid);
		});
		
		autoComplete.render();
		
	
});
</script>

<script>
$(document).keypress(function(e) {
	  if(e.which == 13) {
		  e.preventDefault();
		  //var wdpaid = document.getElementById("#ac-demo input.aui-field-input-text").value;
		 // alert('value : ' + wdpaid);
		  // zoomSiteOnMap(wdpaid);
	  }
})
</script>


<!-- Added for auto suggestion by Alok -->
		<div class="list" style="display: block;">
		<form class="browseSitesForm">
			<!-- <div class="searchSiteBar"><div id="siteAutoComplete" ></div></div> -->
			<div id="siteAutoComplete">
				<!-- <input type="text" value="Type country" name="siteSeaarch"/> -->
			</div>
			
			<!-- <input type="text" name="siteText" class="searchSiteInput" value="Type site name" tabindex="1" /> -->
			
			<%-- <a href="#" class="searchSiteBtn" onclick="javascript:zoomSiteOnMap('<%=wdpa_id%>');"></a> --%>
			<!-- <a href="#" class="searchSiteBtn"></a> -->
			<span> </span>
			<div>
				<a href="http://www.worldheritageoutlook.iucn.org/web/iucn/search-sites" class="browseAllLink" target='_self'>Advanced search</a>
			</div>
			
			<span> </span>
		</form>
			<!-- listContentHolder starts here -->
			<span class="veiwByRatings"> View by rating </span>
			<ul class="siteStatusContainer">
				<%
					Map<String, List<whp_sites>> map_rating_sites = new TreeMap<String, List<whp_sites>>();
					int countriesCount = unesco_region_countryLocalServiceUtil.getunesco_region_countriesCount();
					List<whp_sites> siteList = whp_sitesLocalServiceUtil.getAllActiveSites();
					int totalsites = siteList.size();
					String str_totalsites = " (" + String.valueOf(totalsites) + ")";
				%>
			
				<li><a href="#" class="seeAll" onclick="javascript:refreshWMSLayerForDefault();">See all<%=str_totalsites %></a></li>
				<li><a href="#" class="statusGood" id="Good" onclick="javascript:refreshWMSLayer('Good');">Good</a></li>
				<li><a href="#" class="statusgdWthSmConcerns" id="Good with some Concerns" onclick="javascript:refreshWMSLayer('Good with some concerns');">Good with some concerns</a></li>
				<li><a href="#" class="statusSigficntConcern" id="Significant Concern" onclick="javascript:refreshWMSLayer('Significant Concern');">Significant concern</a></li>
				<li><a href="#" class="statusCritical" id="Critical" onclick="javascript:refreshWMSLayer('Critical');">Critical</a></li>
				<li><a href="#" class="statusDataDeficient" id="Data Deficient" onclick="javascript:refreshWMSLayer('Data Deficient');">Data deficient</a></li>
				<li><a href="#" class="statusComingSoon" id="Coming Soon" onclick="javascript:refreshWMSLayer('Coming Soon');">Coming soon</a></li>
			</ul>
			<!-- listContentHolder ends here -->
		</div>
</div>



		<!-- list ends here -->
		<!-- <div class="continentsListContainerFooter" style="top: 205px;"></div> -->
	</div>
</div>

<!-- <div style="width: 25%; height: 25%" id="mapInfo"></div> -->

<!-- <a href="#" onclick="javascript:test()" >Test</a> -->


<script language="JavaScript" type="text/javascript">  

var hilites;
var vector_layer;
var vector_point;
/* var url = "http://localhost:8080/geoserver/IUCN/wms"; */
var url = "http://www.worldheritageoutlook.iucn.org/geoserver/IUCN/wms";
var map;
var gsat;
var gmap;
var info;
var resultData;


function AttributeViewer(){
	

	this.init = function(){
		
		var styleGeo = {
			    fillColor: '#000f',
			    fillOpacity: 0.1,
			    strokeWidth: 0
			};
			// pink tile avoidance
	        OpenLayers.IMAGE_RELOAD_ATTEMPTS = 5;
	        // make OL compute scale according to WMS spec
	        OpenLayers.DOTS_PER_INCH = 25.4 / 0.28;
	       /* var bounds = new OpenLayers.Bounds(
                    -180, -55.323,
                    179.999, 71.814
                ); */
			map = new OpenLayers.Map('map',
					{
				numZoomLevels: 20,
				//scales: [100,1000,2500,5000,10000,25000,50000,75000,100000,200000,400000,600000,1000000,1500000,3000000,10000000,50000000,100000000,200000000], 
				    controls: [],
			            //projection: new OpenLayers.Projection("EPSG:900913"),
			            //scales: [100,1000,2500,5000,10000,25000,50000,75000,100000,200000,400000,600000,1000000,1500000,3000000,10000000,50000000,100000000,200000000],
			            /* wrapDateLine: true, */
                        displayProjection: new OpenLayers.Projection("EPSG:4326"),
                        projection: new OpenLayers.Projection("EPSG:900913"),
                        //minResolution: "auto",
                        //minExtent: new OpenLayers.Bounds(-180, -90, 180, 90),
                        
                        //maxResolution: "auto",
                        //maxExtent: "auto",
                        //restrictedExtent: new OpenLayers.Bounds(-180, -90, 180, 90),
        	            allOverlays: true,
					}
				
				); 

                vector_point = new OpenLayers.Layer.WMS("WHS-Points", 
    					url, 
    					{ layers: "whs_points",
    					transparent: "true",
    					format: "image/png"
    					} ,
    					{singleTile: true, ratio: 1}
    					);
                vector_layer = new OpenLayers.Layer.WMS("World Heritage Sites", 
    					url, 
    					{ layers: "whs",
    					transparent: "true",
    					format: "image/png"
    					} ,
    					{singleTile: true,ratio: 1}
    					);
                
			var vector = new OpenLayers.Layer.Vector('vector');
			
			gsat = new OpenLayers.Layer.Google('Google Satellite', 
					{type: google.maps.MapTypeId.SATELLITE}
					);
					
					gsat.animationEnabled=true;  
					
			 gmap = new OpenLayers.Layer.Google('Google Streets',
					{type: google.maps.MapTypeId.STREETS}
					);
					gmap.animationEnabled=true;
							
			
							
			map.addLayers([vector_layer,vector_point,vector,gsat,gmap]);//vector_layer,vector_point,vector,
			
			//new OpenLayers.Control.OverviewMap(),
			map.addControl(new OpenLayers.Control.MousePosition());
			
			map.addControl(new OpenLayers.Control.Navigation({
	            dragPanOptions: {
	                enableKinetic: true
	            }
	        }));
			map.addControl(new OpenLayers.Control.Attribution());
			map.addControl(new OpenLayers.Control.Zoom());
			map.addControl(new OpenLayers.Control.Scale());
			//map.addControl(new OpenLayers.Control.dragPan());
			//map.addControl(new OpenLayers.Control.PanZoomBar());
	        /* new OpenLayers.Control.Zoom(),
	        new OpenLayers.Control.Pan() */
	        
			map.setCenter(
	                new OpenLayers.LonLat(77.6, 13).transform(
	                    new OpenLayers.Projection("EPSG:4326"),
	                    map.getProjectionObject()
	               ), 2);
			
	        /* infoControls = {
	            click: new OpenLayers.Control.WMSGetFeatureInfo({
	                url: url, 
	                title: 'Identify features by clicking',
	                layers: [vector_point, vector_layer],
	                hover: true,
	                queryVisible: true,
	                ratio :3,
				    alpha :false,
				    transitionEffect :'resize'
	            }),
	        }; */
	        
	        infoControls = {
	                /* click: new OpenLayers.Control.WMSGetFeatureInfo({
	                    url: url, 
	                    title: 'Identify features by clicking',
	                    layers: [vector_point, vector_layer],
	                    queryVisible: true
	                }), */
	                hover: new OpenLayers.Control.WMSGetFeatureInfo({
	                    url: url, 
	                    title: 'Identify features by hover',
	                    layers: [vector_point, vector_layer],
	                    hover: true,
	                    'delay': 1000,
                        'pixelTolerance': 6,
	                    vendorParams: {
	                        buffer: 8  // geoserver buffer in pixels
	                	},

	                    
	                    queryVisible: true
	                })
	            };
	        
	        
 	        map.events.register('zoomend', this, function() {
				var PolygonLayer = map.getLayersByName('World Heritage Sites')[0];
				//alert(map.getScale());
				//alert(map.getZoom());
				if(map.getZoom() > 5){
					PolygonLayer.setVisibility(true);
				}else{
					PolygonLayer.setVisibility(false);
				}
			});  

	        
			for (var i in infoControls) { 
	            infoControls[i].events.register("getfeatureinfo", this, onFeatureSelect);
	            map.addControl(infoControls[i]); 
	            infoControls[i].activate();
	        }
            
            function onPopupClose(evt) {
                //select.unselectAll();
            	var pops = map.popups;
            	for(var a = 0; a < pops.length; a++){
            	   map.removePopup(map.popups[a]);
            	};
            }
            
            function onFeatureSelect(event) {
	            
            	//remove all popups if exists
            	var pops = map.popups;
            	for(var a = 0; a < pops.length; a++){
            	   map.removePopup(map.popups[a]);
            	};
            	
            	var el = document.createElement( 'div' );
            	el.innerHTML = event.text;
            	var attribArray = {};
            	if (el.children[2] == undefined){
            		return;
            	}
            	for (var attribcount = 0; attribcount<el.children[2].childNodes[3].rows[0].children.length;attribcount++)
            		{
            			attribArray[el.children[2].childNodes[3].rows[0].children[attribcount].textContent] = el.children[2].childNodes[3].rows[1].children[attribcount].textContent; 
            		}
            	
            	var feature = event.feature;

            	var wdpa_id_value = attribArray['wdpa_id'];
            	var thumbnail_id = attribArray['thumbnailid'];
            	var languagecode = attribArray['languagecode'];
            	
            	var test_url = "http://www.worldheritageoutlook.iucn.org/search-sites/-/wdpaid/"+languagecode+"/";
            	var finalLink = test_url + wdpa_id_value;
            	var co_rating_value = attribArray['co_rating'];
            	if(co_rating_value === ""){
            		co_rating_value = "Coming Soon";
            	}
 
            	 
             	AUI().use('aui-io-request', function(A) {
             	   A.io.request('<%=ajaxResourceURLthumbnail %>', {
             	      method: 'POST',
             	      data:{
             	    	  thumbnailID: thumbnail_id
             	      },
             	      datatype: 'json',
             	      on: {
             	    	   failure: function(){
             	    		 	alert('Ajax failed !');  
             	    	   },
             	    	   success: function(){
             	    		  resultData = this.get('responseData');
             	    		 forPopupAfterAJAX(resultData, attribArray, finalLink, co_rating_value, map, event);
             	    	   }
             	      }
             	    });
             	  });
	            
        	} 
            		    
            function onFeatureUnselect(event) {
            	//remove all popups
            	var pops = map.popups;
            	for(var a = 0; a < pops.length; a++){
            	   map.removePopup(map.popups[a]);
            	};
            	var feature = event.feature;
                if(feature.popup) {
                    map.removePopup(feature.popup);
                    feature.popup.destroy();
                    delete feature.popup;
                }
            }
            
            ////  for geolocation 

			var pulsate = function(feature) {
			    var point = feature.geometry.getCentroid(),
			        bounds = feature.geometry.getBounds(),
			        radius = Math.abs((bounds.right - bounds.left)/2),
			        count = 0,
			        grow = 'up';

			    var resize = function(){
			        if (count>16) {
			            clearInterval(window.resizeInterval);
			        }
			        var interval = radius * 0.03;
			        var ratio = interval/radius;
			        switch(count) {
			            case 4:
			            case 12:
			                grow = 'down'; break;
			            case 8:
			                grow = 'up'; break;
			        }
			        if (grow!=='up') {
			            ratio = - Math.abs(ratio);
			        }
			        feature.geometry.resize(1+ratio, point);
			        vector.drawFeature(feature);
			        count++;
			    };
			    window.resizeInterval = window.setInterval(resize, 50, point, radius);
			};

			var geolocate = new OpenLayers.Control.Geolocate({
			    bind: false,
			    geolocationOptions: {
			        enableHighAccuracy: false,
			        maximumAge: 0
			    }
			});
			map.addControl(geolocate);
			var firstGeolocation = true;
			geolocate.events.register("locationupdated",geolocate,function(e) {
			    vector.removeAllFeatures();
			    /* var circle = new OpenLayers.Feature.Vector(
			        OpenLayers.Geometry.Polygon.createRegularPolygon(
			            new OpenLayers.Geometry.Point(e.point.x, e.point.y),
			            e.position.coords.accuracy/2,
			            40,
			            0
			        ),
			        {},
			        styleGeo
			    ); 
			    vector.addFeatures([
			    			        new OpenLayers.Feature.Vector(
			    			            e.point,
			    			            {},
			    			            {
			    			                graphicName: 'cross',
			    			                strokeColor: '#0000FF',
			    			                strokeWidth: 2,
			    			                fillOpacity: 0,
			    			                pointRadius: 10
			    			            }
			    			        ),
			    			        circle
			     ]); */
			     
			     /// geolocation symbol has been changed from plus sign to solid circle
			     
			    var circle = new OpenLayers.Feature.Vector(
			    		new OpenLayers.Geometry.Point(e.point.x, e.point.y),
				        {},
				        styleGeo
				    );
			    vector.addFeatures([
			        new OpenLayers.Feature.Vector(
			            e.point,
			            {},
			            {
			                graphicName: 'circle',
			                strokeColor: '#0101DF',
			                strokeWidth: 2,
			                fillOpacity: 1,
			                fillColor: '#5858FA',
			                pointRadius: 6
			            }
			        ),
			        circle
			    ]);
			    if (firstGeolocation) {
			        map.zoomToExtent(vector.getDataExtent());
			        pulsate(circle);
			        map.zoomTo(5);	
			        firstGeolocation = false;
			        this.bind = true;
			    }
			});
			geolocate.events.register("locationfailed",this,function() {
			    OpenLayers.Console.log('Location detection failed');
			});
			vector.removeAllFeatures();
		    geolocate.deactivate();
		    geolocate.watch = false;
		    firstGeolocation = true;
		    geolocate.activate();
		    
	};

	this.loadSites = function(){		
		
		
	};

}

function forPopupAfterAJAX(resultData, attribArray, finalLink, co_rating_value, map, event){
	
	//alert('NAME : ' + resultData);
	var tableNew = "";
	var date = attribArray['date_part'];
	var date_part = date.substring(0,4);
	
	
    if(co_rating_value == "Coming Soon"){
    	tableNew= "<div class='tblMapBubble'><table class='siteInfoPopupTable'>"+
        "<tr class='even'><td>"+attribArray['country']+"</td></tr>" +
        "<tr class='odd'><td>Inscribed in "+date_part+"</td></tr>" +
        "<tr class='even'><td></td></tr>" +
        "<tr class='odd'><td><b><font color='#7B7B7B'>"+co_rating_value+"</font></b></td></tr>" +
        "</table></div>";
    }else{
    	if(co_rating_value == "Critical"){
    		tableNew= "<div class='tblMapBubble'><table class='siteInfoPopupTable'>"+
            "<tr class='even'><td>"+attribArray['country']+"</td></tr>" +
            "<tr class='odd'><td>Inscribed in "+date_part+"</td></tr>" +
            "<tr class='even'><td><b><font color='#ed1c24'>"+co_rating_value+"</font></b></td></tr>" +
            "<tr class='odd'><td><a href=\""+finalLink+"\" target='_self'>Find out more</a></td></tr>" +
            "</table></div>";
    		
    	}else if(co_rating_value == "Good"){
    		tableNew= "<div class='tblMapBubble'><table class='siteInfoPopupTable'>"+
            "<tr class='even'><td>"+attribArray['country']+"</td></tr>" +
            "<tr class='odd'><td>Inscribed in "+date_part+"</td></tr>" +
            "<tr class='even'><td><b><font color='#39b54a'>"+co_rating_value+"</font></b></td></tr>" +
            "<tr class='odd'><td><a href=\""+finalLink+"\" target='_self'>Find out more</a></td></tr>" +
            "</table></div>";
    	}else if(co_rating_value == "Good with some concerns"){
    		tableNew= "<div class='tblMapBubble'><table class='siteInfoPopupTable'>"+
            "<tr class='even'><td>"+attribArray['country']+"</td></tr>" +
            "<tr class='odd'><td>Inscribed in "+date_part+"</td></tr>" +
            "<tr class='even'><td><b><font color='#acd373'>"+co_rating_value+"</font></b></td></tr>" +
            "<tr class='odd'><td><a href=\""+finalLink+"\" target='_self'>Find out more</a></td></tr>" +
            "</table></div>";	
    	}else if(co_rating_value == "Data Deficient"){
    		tableNew= "<div class='tblMapBubble'><table class='siteInfoPopupTable'>"+
            "<tr class='even'><td>"+attribArray['country']+"</td></tr>" +
            "<tr class='odd'><td>Inscribed in "+date_part+"</td></tr>" +
            "<tr class='even'><td><b><font color='#D0D0D0'>"+co_rating_value+"</font></b></td></tr>" +
            "<tr class='odd'><td><a href=\""+finalLink+"\" target='_self'>Find out more</a></td></tr>" +
            "</table></div>";
    	}else if(co_rating_value == "Significant Concern"){
    		tableNew= "<div class='tblMapBubble'><table class='siteInfoPopupTable'>"+
            "<tr class='even'><td>"+attribArray['country']+"</td></tr>" +
            "<tr class='odd'><td>Inscribed in "+date_part+"</td></tr>" +
            "<tr class='even'><td><b><font color='#f7941d'>"+co_rating_value+"</font></b></td></tr>" +
            "<tr class='odd'><td><a href=\""+finalLink+"\" target='_self'>Find out more</a></td></tr>" +
            "</table></div>";
    	}
    	
    	
    	
    }
   
    //var onlyImage = "";
    //if(resultData[0]=="No url found"){
    	//var dd = "resources/golden_mountains_of_altai_img4.png";
      	//onlyImage = '<img src='+resultData[]+'></img>';	
    //}
   // var onlyImage = '<img src='+resultData+'></img>';
   
   var srcURL = "";
   for(var index in resultData){
	   var imageURL = resultData[index];
	   srcURL = srcURL + imageURL;
   }
   var a_srcURL = srcURL.replace("[","");
   var b_srcURL = a_srcURL.replace("]","");
   
   //alert(srcURL.length);
   if(srcURL.length == 0){
	   var cont = "<h3>"+attribArray['name_en'] + "</h3>" + '<img src="images/imgUnavailablesmall.gif" style="width:86px; height:86px; border:0px;"></img>' + tableNew;
   }else{
	   var cont = "<h3>"+attribArray['name_en'] + "</h3>" + '<img src='+b_srcURL+' style="width:86px; height:86px; border:0px;"></img>' + tableNew;
   }
   
       
    //var cont = "<h3>"+attribArray['name_en'] + "</h3>" + '<img src="resources/golden_mountains_of_altai_img4.png" style="width:86px; height:86px; border:0px;"></img>' + tableNew;
   //var cont = "<h3>"+attribArray['name_en'] + "</h3>" + '<img src="'+srcURL+'" style="width:86px; height:86px; border:0px;"></img>' + tableNew;
    
    
   // var cont = "<h3>"+attribArray['name_en'] + "</h3>" + onlyImage + tableNew;
    
  	popup = new OpenLayers.Popup.Anchored("HighChickens",
		   map.getLonLatFromPixel(event.xy),
           null,
           "<div class='mapBubble'>"+cont+"</div>", null, true, null);
   
  	var border = "3px solid #042f5b";
  	popup.autoSize = true;
  	popup.setBorder(border);
  	popup.contentDiv.style.overflow='inherit';
  	
  	//OpenLayers.Event.stop(event);
  	
    map.addPopup(popup);
	
}


/// method to zoom WDPA_ID on the map ..

function zoomSiteOnMap(wdpaid){
	zoomToLayerFeature('World Heritage Sites','Polygon','wdpa_id',wdpaid);
	}

//custom method for getting value from vector layer
function getAttributeList(attrName, attrValue){
	
	//var SearchLayer = map.layers[4];
	var i, feature, len = vector_layer.features.length, foundFeatures = [];
	for (i = 0; i < len; i++) {
		feature = SearchLayer.features[i];
		if (feature && feature.attributes) {
			if (feature.attributes[attrName].value === attrValue) {
				foundFeatures.push(feature);
			}
		}
	}
	return foundFeatures;
}


function createMarker(markerLayer){
	
	var size = new OpenLayers.Size(21,25);
    var offset = new OpenLayers.Pixel(-(size.w/2), -size.h);
    var icon = new OpenLayers.Icon('/resources/heritage_site_map_pin.png',size,offset);
	
	var j, feature, len = vector_layer.features.length;
	for(j=0; j<len; j++){
		feature = vector_layer.features[j];
		var marker = new OpenLayers.Marker(feature.geometry.getBounds().getCentroid(), icon);
		markerLayer.addMarker(marker); 
	}
	
}

function googleLayerManager(layer){
 
	if (layer == "Google Streets") {
		if (gsat != undefined){
			gsat.setVisibility(false);
			gmap.setVisibility(true);
			//map.setBaseLayer(gmap);
		}
	}
	
	if (layer == "Google Satellite") {
		if (gmap != undefined){
			gmap.setVisibility(false);
			gsat.setVisibility(true);
			//map.setBaseLayer(gsat);
		}
	}
}

function zoomToLayerFeature(relLayerName,layerType,fieldName,fieldVal){
	
	
	var layer = map.getLayersByName(relLayerName)[0];
	
	if(layer==null)
		return;
	
	lyrType=layerType;
	var url=map.getLayersByName(relLayerName)[0].url;
	var layerName='whs';
	var type;	
	var featureNS=getFeatureNS(layerName,url);
	var prefix;	
	var geomFieldName='the_geom';
	var featuresGeom=null;
	
	var pos = layerName.indexOf(":");
	prefix = layerName.substring(0, pos);
	type = layerName.substring(++pos);
	
	var filters=getFilter(fieldName,fieldVal);
	
	var filter_1_0 = new OpenLayers.Format.Filter({
			version : "1.1.0"
		});

	var datapostResult = createXML();
	var xml = new OpenLayers.Format.XML();
			var xmlFilter = xml.write(filter_1_0.write(filters));
			datapostResult = datapostResult.replace("##layer", '"' + "IUCN:whs" + '"');
			datapostResult = datapostResult.replace("##featureNS", '"' + featureNS + '"');
			datapostResult = datapostResult.replace("##filter", xmlFilter);
			datapostResult = datapostResult.replace("##uniqueFld", fieldName);
		    //dataPost = dataPost.replace("${SortOrder}", "ASC");
		var mapProj = map.projection;
		var reverseCoords = false;
		if (mapProj == "EPSG:4326") {
			reverseCoords = true;
		}

		$.ajax({
					url : url,
					dataType : "xml",
					contentType : "text/xml; subtype=gml/3.1.1; charset=utf-8",
					type : "POST",
					data : datapostResult,
					success : function(data) {
						var gmlFeatures = new OpenLayers.Format.WFST.v1_1_0({
							xy : reverseCoords,
							featureType : 'whs',
							gmlns : 'http://www.opengis.net/gml',
							featureNS : featureNS,
							geometryName : geomFieldName, 
							featurePrefix : 'IUCN',
							extractAttributes : true
						}).read(data);
						
						if(gmlFeatures.length>0){
						   featuresGeom=gmlFeatures[0].geometry;
						   zoomToAnyFeature(featuresGeom);
						}else{
							alert("Site not found on Map");
						}
	               }
	      });
					
}

function getFilter(fieldName,fieldVal) {
	var filter;
	
	filter = new OpenLayers.Filter.Comparison({
        type: OpenLayers.Filter.Comparison.EQUAL_TO,
        matchCase: false,
        property: fieldName,
        value: fieldVal
    });
	
	return filter;
}

function getFeatureNS(layerName,url){
	if(url==null)
		return url;
	var _wfsurl = url.replace(new RegExp( "wms", "i" ), "wfs");
	var _wfsSchema = _wfsurl + "?request=DescribeFeatureType&version=1.1.0&typename=" + layerName;		

	var featureNS='';
	$.ajax({
	    url: _wfsSchema,
	    dataType: "xml",
	    async:false,
	    success: function (data) {
	        var featureTypesParser = new OpenLayers.Format.WFSDescribeFeatureType();
	        var responseText = featureTypesParser.read(data);	      
	        featureNS = responseText.targetNamespace;
	    }
	});
	return featureNS;
}

function zoomToAnyFeature(geom) {
	
	//check if the geometry is a multipart geometry
	//OpenLayers.Geometry.MultiPolygon multipartpGeom = geom;
	//alert (geom.CLASS_NAME);
	
	//alert('Multipart Part Count = '+ geom.components.length);
	
	var biggerArea=0.0;
	var biggerPart=0;
	for (intpartCnt = 0; intpartCnt<geom.components.length;intpartCnt++){
		if (biggerArea < geom.components[intpartCnt].getArea()){
			biggerArea = geom.components[intpartCnt].getArea();
			biggerPart = intpartCnt;
		}
	}
	
	var bounds = null;
	//bounds = geom.getBounds();
	bounds = geom.components[biggerPart].getBounds();
	var newBounds = bounds.transform(new OpenLayers.Projection("EPSG:4326"),
				map.getProjectionObject());
	map.zoomToExtent(newBounds);
	
		
}

function createXML() {
	var datapost = '';
	var maxFeatureCount = 1;
	datapost = "<wfs:GetFeature service=\"WFS\" version=\"1.1.0\" maxFeatures =\"" + maxFeatureCount + "\" " +
    "xmlns:gml=\"http://www.opengis.net/gml\" " +
    "xmlns:wfs=\"http://www.opengis.net/wfs\" " +
    "xmlns:ogc=\"http://www.opengis.net/ogc\" " +
    "xsi:schemaLocation=\"http://www.opengis.net/wfs http://schemas.opengis.net/wfs/1.1.0/wfs.xsd\" " +
    "xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">" +

     "<wfs:Query typeName=##layer xmlns:feature=##featureNS> ##filter" +
 "</wfs:Query>"+
 "</wfs:GetFeature>";
    
    /* dataPost = "<wfs:GetFeature service=\"WFS\" version=\"1.1.0\" maxFeatures =\"" + maxFeatureCount + "\" " +
        "xmlns:gml=\"http://www.opengis.net/gml\" " +
        "xmlns:wfs=\"http://www.opengis.net/wfs\" " +
        "xmlns:ogc=\"http://www.opengis.net/ogc\" " +
        "xsi:schemaLocation=\"http://www.opengis.net/wfs http://schemas.opengis.net/wfs/1.1.0/wfs.xsd\" " +
        "xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">" +

         "<wfs:Query typeName=${layer} xmlns:feature=${featureNS}> ${filter}" +
     "</wfs:Query>" +
"</wfs:GetFeature>"; */

return datapost;

}


/// added for filter the layer 

function refreshWMSLayer(str_rating){
	
    var layer = map.getLayersByName("WHS-Points")[0];
    var new_filter = getFilterParam(str_rating);
    layer.params['FILTER'] = new_filter;
    layer.redraw();
    map.zoomTo(2);

}

function getFilterParam(str_rating){
	 
    var ol_filter = new OpenLayers.Filter.Logical({
        type: OpenLayers.Filter.Logical.AND,
        filters: [
            new OpenLayers.Filter.Comparison({
                type: OpenLayers.Filter.Comparison.EQUAL_TO,
                property: "co_rating",
                value: str_rating
            })]           
    });

    var filter_1_0 = new OpenLayers.Format.Filter({version: "1.0.0"});
    var xml = new OpenLayers.Format.XML(); 
    var filter_param = xml.write(filter_1_0.write(ol_filter));

    return filter_param;
    
}


/// for default filter on the layer ...

function refreshWMSLayerForDefault(){
	
    var layer = map.getLayersByName("WHS-Points")[0];
    var new_filter = getFilterParamForDefault();
    layer.params['FILTER'] = new_filter;
    layer.redraw();
    map.zoomTo(2);
}


function getFilterParamForDefault(){
	 
	var filter_good = new OpenLayers.Filter.Comparison({
        type: OpenLayers.Filter.Comparison.EQUAL_TO,
        property: "co_rating",
        value: 'Good'
    });
	
	var filter_gwsc = new OpenLayers.Filter.Comparison({
        type: OpenLayers.Filter.Comparison.EQUAL_TO,
        property: "co_rating",
        value: 'Good with some concerns'
    });
	
	
	var filter_sc = new OpenLayers.Filter.Comparison({
        type: OpenLayers.Filter.Comparison.EQUAL_TO,
        property: "co_rating",
        value: 'Significant Concern'
    });
	
	var filter_crit = new OpenLayers.Filter.Comparison({
        type: OpenLayers.Filter.Comparison.EQUAL_TO,
        property: "co_rating",
        value: 'Critical'
    });
	
	var filter_dd = new OpenLayers.Filter.Comparison({
        type: OpenLayers.Filter.Comparison.EQUAL_TO,
        property: "co_rating",
        value: 'Data Deficient'
    });
	
	var filter_csoon = new OpenLayers.Filter.Comparison({
        type: OpenLayers.Filter.Comparison.EQUAL_TO,
        property: "co_rating",
        value: 'Coming Soon'
    });
	
	
    var ol_filter = new OpenLayers.Filter.Logical({
        type: OpenLayers.Filter.Logical.OR,
    	filters: [filter_good, filter_gwsc, filter_sc, filter_crit, filter_dd, filter_csoon] 
    });

    var filter_1_0 = new OpenLayers.Format.Filter({version: "1.0.0"});
    var xml = new OpenLayers.Format.XML(); 
    var filter_param = xml.write(filter_1_0.write(ol_filter));

    return filter_param;
    
}
</script>

<script>


</script>


