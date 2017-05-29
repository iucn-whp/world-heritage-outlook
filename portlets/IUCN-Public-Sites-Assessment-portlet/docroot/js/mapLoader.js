var vector_point;
var map_static;
var gmap;
var wmsurl = "http://www.worldheritageoutlook.iucn.org/geoserver/IUCN/wms";
//var wmsurl = "http://localhost:8080/geoserver/IUCN/wms";
function mapLoader(){

	this.init = function(wdpaid){
		
		var styleGeo = {
			    fillColor: '#000f',
			    fillOpacity: 0.1,
			    strokeWidth: 0
			};
		// pink tile avoidance
        OpenLayers.IMAGE_RELOAD_ATTEMPTS = 5;
        // make OL compute scale according to WMS spec
        OpenLayers.DOTS_PER_INCH = 25.4 / 0.28;

		map_static = new OpenLayers.Map('map1',
				{
				numZoomLevels: 20,
				controls: [],
				displayProjection: new OpenLayers.Projection("EPSG:4326"),
				projection: new OpenLayers.Projection("EPSG:900913"),
				allOverlays: true,
				}
			);
	
		map_static.addControl(new OpenLayers.Control.Attribution());
		map_static.addControl(new OpenLayers.Control.Zoom());
		map_static.addControl(new OpenLayers.Control.Pan());
				
			vector_point = new OpenLayers.Layer.WMS("WHS-Points", 
					wmsurl, 
					{ layers: "whs_points",
					transparent: "true",
					format: "image/png"
					} ,
					{singleTile: true, ratio: 1}
					);
			vector_layer = new OpenLayers.Layer.WMS("World Heritage Sites", 
					wmsurl, 
					{ layers: "whs",
					transparent: "true",
					format: "image/png"
					} ,
					{singleTile: true,ratio: 1}
					);
				
			
					
				gmap = new OpenLayers.Layer.Google('Google Streets',
						{type: google.maps.MapTypeId.STREETS}
						);
						gmap.animationEnabled=true;
					
				var vector = new OpenLayers.Layer.Vector('vector');
				
				map_static.addLayers([vector_layer,vector_point,vector,gmap]);

			//console.log(map.getProjection());
		    
			
		    //addMarkerLayer(new OpenLayers.Geometry.Point(15677636.505529493, -4452363.047975198));
			//registerEvents(vector_point,wdpaid);
			zoomToSite('World Heritage Sites','Polygon','wdpa_id',wdpaid);
			//add google layer at the end
			
	};
	
	this.loadSites = function(){
		
		
	};
};


/*function getAttributeList_Site(attrName, attrValue){
	var i, feature, len = vector_layer_site.features.length, foundFeatures = [];
	for (i = 0; i < len; i++) {
		feature = vector_layer_site.features[i];
		if (feature && feature.attributes) {
			if (feature.attributes[attrName].value === attrValue) {
				foundFeatures.push(feature);
			}
		}
	}
	return foundFeatures;
}*/

/*function zoomToSite(wdpaid){
	
		var featureResults = getAttributeList_Site('WDPA_ID',wdpaid);//vector_layer_site.getFeaturesByAttribute('WDPA_ID', wdpaid);
		var point = featureResults[0].geometry.getCentroid();
		var bounds = new OpenLayers.Bounds();
		bounds.extend(point);
		bounds.toBBOX();
		console.log(point);
		var center = bounds.getCenterLonLat();
		map.setCenter(center, 4);
		addMarkerLayer(point);
		
}*/

function registerEvents(layer,wdpaid) {
	  layer.events.register('loadend', layer, function() {
		  zoomToSite('World Heritage Sites','Point','wdpa_id',wdpaid)
		  //zoomToSite(wdpaid);
	  });

    //map.addLayer(layer);
}

/*function addMarkerLayer(point){
	var bounds = new OpenLayers.Bounds();
	bounds.extend(point);
	bounds.toBBOX();
	console.log(point);
	var center = bounds.getCenterLonLat();
	map.setCenter(center, 4);
	var vectorLayer = new OpenLayers.Layer.Vector("Overlay");
	var feature = new OpenLayers.Feature.Vector(
	 point,
	 {some:'WHP_Site'},
	 {externalGraphic: '/resources/heritage_site_map_pin.png', graphicHeight: 26, graphicWidth: 18});
	vectorLayer.addFeatures(feature);
	map.addLayer(vectorLayer);
}
*/
function zoomToSite(relLayerName,layerType,fieldName,fieldVal){
	
	
	var layer = map_static.getLayersByName(relLayerName)[0];
	
	if(layer==null)
		return;
	
	lyrType=layerType;
	var wmsurl=map_static.getLayersByName(relLayerName)[0].url;
	var layerName='whs';
	var type;	
	var featureNS=getNS(layerName,wmsurl);
	var prefix;	
	var geomFieldName='the_geom';
	var featuresGeom1=null;
	//var geometryName = 'the_geom';
	
	var pos = layerName.indexOf(":");
	prefix = layerName.substring(0, pos);
	type = layerName.substring(++pos);
	
	var filters=getStaticFilter(fieldName,fieldVal);
	var filter_1_0 = new OpenLayers.Format.Filter({
			version : "1.1.0"
		});

	createStaticXML();
	var xml = new OpenLayers.Format.XML();
			var xmlFilter = xml.write(filter_1_0.write(filters));
			dataPost = dataPost.replace("${layer}", "\"" + 'IUCN:whs' + "\"");
			dataPost = dataPost.replace("${featureNS}", "\"" + featureNS + "\"");
			dataPost = dataPost.replace("${filter}", xmlFilter);
			dataPost = dataPost.replace("${uniqueFld}", fieldName);
		    //dataPost = dataPost.replace("${SortOrder}", "ASC");
			

		var mapProj = map_static.projection;
		var reverseCoords = false;
		if (mapProj == "EPSG:4326") {
			reverseCoords = true;
		}

		$.ajax({
					url : wmsurl,
					dataType : "xml",
					contentType : "text/xml; subtype=gml/3.1.1; charset=utf-8",
					type : "POST",
					data : dataPost,
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
						   featuresGeom1=gmlFeatures[0].geometry;
						   zoomToActiveSite(featuresGeom1);
						}else{
							alert("Site not found on Map");
						}
	               }
	      });
					
}

function getStaticFilter(fieldName,fieldVal) {
	var filter;
	
	filter = new OpenLayers.Filter.Comparison({
        type: OpenLayers.Filter.Comparison.EQUAL_TO,
        matchCase: false,
        property: fieldName,
        value: fieldVal
    });
	
	return filter;
}

function getNS(layerName,wmsurl){
	if(wmsurl==null)
		return wmsurl;
	var _wfsurl = wmsurl.replace(new RegExp( "wms", "i" ), "wfs");
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

function zoomToActiveSite(curGeom) {
	var bounds = curGeom.getBounds();
	var newBounds = bounds.transform(
		new OpenLayers.Projection("EPSG:4326"),
		map_static.getProjectionObject());

	try {
		map_static.setCenter(newBounds.getCenterLonLat(), 4);
	} catch (e) {}

	try {
		map_static.zoomToExtent(newBounds);
	} catch (e) {}

}

function createStaticXML() {
	
	var maxFeatureCount = 1;
    dataPost = "<wfs:GetFeature service=\"WFS\" version=\"1.1.0\" maxFeatures =\"" + maxFeatureCount + "\" " +
        "xmlns:gml=\"http://www.opengis.net/gml\" " +
        "xmlns:wfs=\"http://www.opengis.net/wfs\" " +
        "xmlns:ogc=\"http://www.opengis.net/ogc\" " +
        "xsi:schemaLocation=\"http://www.opengis.net/wfs http://schemas.opengis.net/wfs/1.1.0/wfs.xsd\" " +
        "xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">" +

         "<wfs:Query typeName=${layer} xmlns:feature=${featureNS}> ${filter}" +
     "</wfs:Query>" +
"</wfs:GetFeature>";

}
