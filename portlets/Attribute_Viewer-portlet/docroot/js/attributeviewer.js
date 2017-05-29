
var hilites;
var vector_layer;
var vector_point;
//var url = "http://www.iucnworldheritage.org/geoserver/IUCN/wms";
var url = "http://www.worldheritageoutlook.iucn.org/geoserver/IUCN/wms";
var map;
var gsat;
var gmap;
var info;
var dataPost;


function AttributeViewer(){
	
	

	this.init = function(){
		
		var styleGeo = {
			    fillColor: '#000f',
			    fillOpacity: 0.1,
			    strokeWidth: 0
			};
		
			map = new OpenLayers.Map('map',
					{
					numZoomLevels: 18,
				    controls: [
						//new OpenLayers.Control.OverviewMap(),
						new OpenLayers.Control.MousePosition(),
						new OpenLayers.Control.Navigation({
					            dragPanOptions: {
					                enableKinetic: true
					            }
					        }),
						new OpenLayers.Control.Attribution(),
				        new OpenLayers.Control.Zoom(),
				        new OpenLayers.Control.Pan()
			            ],
			            projection: new OpenLayers.Projection("EPSG:900913"),
                        displayProjection: new OpenLayers.Projection("EPSG:4326"),
                         units: "m",
			            center: [0, 0],
			            zoom: 1 ,
			            theme: null
					}
				); 

				gmap = new OpenLayers.Layer.Google('Google Streets', // the default
				{
					type: google.maps.MapTypeId.STREETS,
					numZoomLevels: 18
				});
				gmap.animationEnabled=true;
						
				gsat = new OpenLayers.Layer.Google('Google Satellite', {
					//type: google.maps.MapTypeId.SATELLITE,
					numZoomLevels: 18
				});
				gsat.animationEnabled=true;
			
			var vector = new OpenLayers.Layer.Vector('vector');
			map.addLayers([vector,gmap,gsat]);
			
			map.setCenter(
	                new OpenLayers.LonLat(77.6, 13).transform(
	                    new OpenLayers.Projection("EPSG:4326"),
	                    map.getProjectionObject()
	               ), 2);

			vector_layer = new OpenLayers.Layer.WMS("World Heritage Sites", 
					url, 
					{ layers: "whs",
					transparent: "true", 
					format: "image/png" }, 
					{ group: "IUCN" }, 
					{ singleTile: true }
					);
			vector_point = new OpenLayers.Layer.WMS("WHS-Points", 
					url, 
					{ layers: "whs_points",
					transparent: "true", 
					format: "image/png" }, 
					{ group: "IUCN" }, 
					{ singleTile: true }
					);
			map.addLayers([vector_point,vector_layer]);
		    
	        infoControls = {
	            click: new OpenLayers.Control.WMSGetFeatureInfo({
	                url: url, 
	                title: 'Identify features by clicking',
	                layers: [vector_layer],
	                hover: true,
	                queryVisible: true,
	                ratio :3,
				    alpha :false,
				    transitionEffect :'resize'
	            }),
	            /*hover: new OpenLayers.Control.WMSGetFeatureInfo({
	                url: url, 
	                title: 'Identify features by clicking',
	                layers: [vector_point],
	                hover: true,
	                // defining a custom format options here
	                formatOptions: {
	                    typeName: 'co_rating', 
	                    featureNS: url
	                },
	                queryVisible: true
	            })*/
	            
	        };

	        
			for (var i in infoControls) { 
	            infoControls[i].events.register("getfeatureinfo", this, onFeatureSelect);
	            map.addControl(infoControls[i]); 
	            infoControls[i].activate();
	        }

						
			//// hover functionality
            
            /*var hoverfunctionality = new OpenLayers.Control.SelectFeature(vector_layer, {
                hover: true,
                highlightOnly: true,
            });
            map.addControl(hoverfunctionality);
            hoverfunctionality.activate();*/
			
            ////// END hover fun
            


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
            	
	            //creating table
	           /*var temptable= "<center><table class='siteInfoPopupTable'>"+
	            "<tr class='odd'><th>WDPA_ID</th><td>"+attribArray['wdpaid']+"</td></tr>" +
	            "<tr class='even'><th>Name</th><td>"+attribArray['name']+"</td></tr>" +
	            "<tr class='odd'><th>Original Name</th><td>"+attribArray['orig_name']+"</td></tr>" +
	            "<tr class='even'><th>Country</th><td>"+attribArray['country']+"</td></tr>" +
	            "<tr class='odd'><th>Designation</th><td>"+attribArray['desig_eng']+"</td></tr>" +
	            "<tr class='even'><th>Criteria</th><td>"+attribArray['int_crit']+"</td></tr>" +
	            "<tr class='odd'><th>WDPA_Recorded_Area_sqkm</th><td>"+attribArray['gis_m_area']+"</td></tr>" +
	            "<tr class='even'><th>Link_to_ProtectedPlanet</th><td><a href=\""+attribArray['LinkPP']+"\" target='_blank'>"+attribArray['LinkPP']+"</a></td></tr>" +
	            "<tr class='odd'><th>Link_to_UNESCO_Website</th><td><a href=\""+attribArray['LinkUNESCO']+"\" target='_blank'>"+attribArray['LinkUNESCO']+"</a></td></tr>" +
	            "</table></center>";*/
            	
            	//var content = "<h3>"+attribArray['orig_name'] + " Attributes </h3>" +temptable; //feature.attributes.description;
	           
            	var wdpa_id_value = attribArray['wdpa_id'];
            	var test_url = "http://www.iucnworldheritage.org/web/iucn/sites/-/wdpaid/en/";
            	var finalLink = test_url + wdpa_id_value;
            	var co_rating_value = attribArray['co_rating'];
            	if(co_rating_value === ""){
            		co_rating_value = "Coming Soon";
            		
            		
            	}
            	
            	//var thumbnail_id = attribArray['thumbnailid'];
            	
//            	FileEntry fe = DLAppServiceUtil.getFileEntry(thumbnailID); 
//				thumbnailUrl = DLUtil.getThumbnailSrc(fe, null,themeDisplay);
            	
	            var temptable= "<center><table class='siteInfoPopupTable'>"+
	            "<tr class='even'><td>"+attribArray['country']+"</td></tr>" +
	            "<tr class='odd'><td>Inscribed in "+attribArray['date_part']+"</td></tr>" +
	            "<tr class='even'><td>"+co_rating_value+"</td></tr>" +
	            "<tr class='odd'><td><a href=\""+finalLink+"\" target='_blank'>Find out more</a></td></tr>" +
	            "</table></center>";
	            
	            var content = "<h3>"+attribArray['name_en'] + "</h3>" +temptable;
	           
	            //end of table
	            
	            if (content.search("<script") != -1) {
	                content = "Content contained Javascript! Escaped content below.<br>" + content.replace(/</g, "<");
	            }
	           /* popup = new OpenLayers.Popup.FramedCloud(null, 
	            		map.getLonLatFromPixel(event.xy),
	                    new OpenLayers.Size(0,100),
	                    "<div style='height:100'>"+content+"</div>", null, true, onPopupClose);
	            map.addPopup(popup);*/
	            
	            
	            //// new code for popup 
	            
	            /*var tablecontent = "<table><td><img src="resources/golden_mountains_of_altai_img4.png"></img></td>" +
	            		"<td><tr>"+attribArray['name_en'] + "</tr>" +
	            		"<tr>"+attribArray['country']+"</tr>"+
	            		"<tr>Inscribed in "+attribArray['date_part']+"</tr>"+
	            		"<tr>"+co_rating_value+"</tr>"+
	            		"<tr><a href=\""+finalLink+"\" target='_blank'>Find out more</a></tr>"+
	            		"</td></table>";*/
	            
	            //var cont = "<h3>"+attribArray['name_en'] + "</h3>" +tablecontent;
	            
	            /*var tableNew= "<table class='siteInfoPopupTable'>"+
	            "<tr class='even'><td>"+attribArray['name_en'] + "</td></tr>" +
	            "<tr class='odd'><td>"+attribArray['country']+"</td></tr>" +
	            "<tr class='even'><td>Inscribed in "+attribArray['date_part']+"</td></tr>" +
	            "<tr class='odd'><td>"+co_rating_value+"</td></tr>" +
	            "<tr class='even'><td><a href=\""+finalLink+"\" target='_blank'>Find out more</a></td></tr>" +
	            "</table>";*/
	            
	            var tableNew= "<table class='siteInfoPopupTable'>"+
	            "<tr class='even'><td>"+attribArray['country']+"</td></tr>" +
	            "<tr class='odd'><td>Inscribed in "+attribArray['date_part']+"</td></tr>" +
	            "<tr class='even'><td>"+co_rating_value+"</td></tr>" +
	            "<tr class='odd'><td><a href=\""+finalLink+"\" target='_blank'>Find out more</a></td></tr>" +
	            "</table>";
	            
	          var cont = "<h3>"+attribArray['name_en'] + "</h3>" + '<img src="resources/golden_mountains_of_altai_img4.png"></img>' + tableNew;
	            
	          //var cont = tableNew;
	          
	            popup = new OpenLayers.Popup.Anchored("High Chickens",
	        		   map.getLonLatFromPixel(event.xy),
	                   new OpenLayers.Size(200,100),
	                   "<div style='height:100px; width: 150px;'>"+cont+"</div>", null, true, onPopupClose);
	            
	            
	            map.addPopup(popup);
	            
        	} 
            		    
            function onFeatureUnselect(event) {
            	//remove all popups
            	var pops = map.popups;
            	for(var a = 0; a < pops.length; a++){
            	   map.removePopup(map.popups[a]);
            	};
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
			    var circle = new OpenLayers.Feature.Vector(
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
			map.setBaseLayer(gmap);
			}
		}
	
	if (layer == "Google Satellite") {
		if (gmap != undefined){
			gmap.setVisibility(false);
			gsat.setVisibility(true);
			map.setBaseLayer(gsat);
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
	//var geometryName = 'the_geom';
	
	var pos = layerName.indexOf(":");
	prefix = layerName.substring(0, pos);
	type = layerName.substring(++pos);
	
	var filters=getFilter(fieldName,fieldVal);
	var filter_1_0 = new OpenLayers.Format.Filter({
			version : "1.1.0"
		});

	createXML();
	var xml = new OpenLayers.Format.XML();
			var xmlFilter = xml.write(filter_1_0.write(filters));
			dataPost = dataPost.replace("${layer}", "\"" + 'IUCN:whs' + "\"");
			dataPost = dataPost.replace("${featureNS}", "\"" + featureNS + "\"");
			dataPost = dataPost.replace("${filter}", xmlFilter);
			dataPost = dataPost.replace("${uniqueFld}", fieldName);
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
	
	var bounds = null;

		bounds = geom.getBounds();

	var newBounds = bounds.transform(new OpenLayers.Projection("EPSG:4326"),
				map.getProjectionObject());
	map.zoomToExtent(newBounds);
	
}
function createXML() {
	
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


/// added for filter the layer 

function refreshWMSLayer(str_rating){
	
    var layer = map.getLayersByName("WHS-Points")[0];
    var new_filter = getFilterParam(str_rating);
    layer.params['FILTER'] = new_filter;
    layer.redraw();

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
    //var new_filter = getFilterParam(str_rating);
    var new_filter = getFilterParamForDefault();
    //new_filter.deactivate();
    layer.params['FILTER'] = new_filter;
    layer.redraw();
    //layer.refresh();
    
   // map.addLayers([vector_point,vector_layer]);

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
        //filters: [filter_good, filter_gwsc, filter_sc, filter_crit, filter_dd]
    	filters: [filter_good, filter_gwsc, filter_sc, filter_crit, filter_dd, filter_csoon] 
    });

    var filter_1_0 = new OpenLayers.Format.Filter({version: "1.0.0"});
    var xml = new OpenLayers.Format.XML(); 
    var filter_param = xml.write(filter_1_0.write(ol_filter));

    return filter_param;
    
}

