

AttributeViewer_Old = function(){

	this.init = function(){
		
		var map = new OpenLayers.Map('map',
				{
			    controls: [
					new OpenLayers.Control.LayerSwitcher(),
					new OpenLayers.Control.ScaleLine(),        
					new OpenLayers.Control.OverviewMap(),
					new OpenLayers.Control.MousePosition(),
					new OpenLayers.Control.Navigation({
				            dragPanOptions: {
				                enableKinetic: true
				            }
				        }),
					new OpenLayers.Control.Attribution(),
			        new OpenLayers.Control.Zoom(),
		            ],
		            center: [0, 0],
		            zoom: 1    
				}
			); 
		
		
		    
		    var googlemap = new OpenLayers.Layer.Google('Google Layer');
		    map.addLayer(googlemap);
		    map.setCenter(
		                new OpenLayers.LonLat(77.6, 13).transform(
		                    new OpenLayers.Projection("EPSG:4326"),
		                    map.getProjectionObject()
		               ), 5);
		    console.log(map.getProjection());
		    
		    var vector_layer = new OpenLayers.Layer.Vector("KML", {
                projection: map.displayProjection,
                strategies: [new OpenLayers.Strategy.Fixed()],
                protocol: new OpenLayers.Protocol.HTTP({
                    url: "resources/sample1.kml",
                    format: new OpenLayers.Format.KML({
                        extractStyles: true,
                        extractAttributes: true
                    })
                })
            });	
		    map.addLayer(vector_layer);
		    var select = new OpenLayers.Control.SelectFeature(vector_layer);
            
		    vector_layer.events.on({
                "featureselected": onFeatureSelect,
                "featureunselected": onFeatureUnselect
            });
            map.addControl(select);
            select.activate();
            
            /*//// hover functionality
            
            var hoverfunctionality = new OpenLayers.Control.SelectFeature(vector_layer, {
                hover: true,
                highlightOnly: true,
                renderIntent: "temporary",
                eventListeners: {
                    beforefeaturehighlighted: report,
                    featurehighlighted: report,
                    featureunhighlighted: report
                }
            });
            map.addControl(hoverfunctionality);
            hoverfunctionality.activate();
            
            ////// END hover fun
             */            
            
            function onPopupClose(evt) {
                select.unselectAll();
            }
                
            function onFeatureSelect(event) {
	            var feature = event.feature;
	            // Since KML is user-generated, do naive protection against
	            // Javascript.
	            
	           var content = "";
	           for(var key in feature.attributes){        	   
	        	   if (key == "Criteria"){
        			     
	        	   }
	        	   else { 
	        		   content = ""+feature.attributes.name + " " + feature.attributes.description;
	        	   }
	           }
	           
//	            var content = ""+feature.attributes.name + " " + feature.attributes.description;
	            if (content.search("<script") != -1) {
	                content = "Content contained Javascript! Escaped content below.<br>" + content.replace(/</g, "<");
	            }
	            popup = new OpenLayers.Popup.FramedCloud(null, 
	            		feature.geometry.getBounds().getCenterLonLat(),
	                    new OpenLayers.Size(100,100),
	                    "<div style='background-color:#cfcd9d; width:100;height:100'>"+content+"</div>", null, true, onPopupClose);
	           
	            feature.popup = popup;
	            map.addPopup(popup);
        	}
            		    
            function onFeatureUnselect(event) {
                var feature = event.feature;
                if(feature.popup) {
                    map.removePopup(feature.popup);
                    feature.popup.destroy();
                    delete feature.popup;
                }
           }
            
            /*function createPopupForm(){
                var theHTML = '';
                var layerVector   = map.layers[1];
                var selectedFeature = layerVector.selectedFeatures[0];
                var attributeName  = selectedFeature.attributes['Criteria'] ? selectedFeature.attributes['English_Name'] : "no name available";

                theHTML += '<table style="background-color:#BBCCFF">';

                theHTML += '<tr><td colspan="2"><span style="font-size:14px;font-weight:bold;background-color:#BBCCFF">' +          attributeName + '</span><hr></td></tr>' ;

                for(var key in selectedFeature.attributes)
                {   if(key != "Criteria" && key != "English_Name")
                    theHTML += '<tr><td>' + key + ' :</td><td>' + selectedFeature.attributes[key] + '</td></tr>';
                }

                theHTML += '</table>';
                return theHTML;
            }*/

	};
	
	this.loadSites = function(){
		
		
		
	};
};