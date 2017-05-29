<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>





<script>

function dynamicPopup(renderJSPURL,id,popupTitle,e) {
	

	var customUrl="<portlet:renderURL  windowState='<%= LiferayWindowState.POP_UP.toString() %>'><portlet:param name='jspPage' value='jspURL' /><portlet:param name='keyVal' value='keyValue' /></portlet:renderURL>";
    var tempUrl=customUrl.replace("keyValue",id);
    var finalUrl=tempUrl.replace("jspURL",renderJSPURL); 
   
    Liferay.Util.openWindow(
			{
				cache: false,
				
				dialog: {
					modal:true,
					align: Liferay.Util.Window.ALIGN_CENTER,
					after: {
						render: function(event) {
							this.set('y', this.get('y') + 150);
						}
					},
					//width: 475,
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
function openFeedback()
{
	var finalUrl = window.location.protocol + "//"  + window.location.host+"/widget/web/iucn/feedback/-/1_WAR_webformportlet61x_INSTANCE_lKKu6T9bJGNo";
    
   Liferay.Util.openWindow(
			{
				cache: false,
				
				dialog: {
					modal:true,
					align: Liferay.Util.Window.ALIGN_CENTER,
					after: {
						render: function(event) {
							this.set('y', this.get('y') + 150);
						}
					},
					//width: 475,
					resizable:false
					
				},
				dialogIframe: {
					id: 'My_Iframe',
					uri: finalUrl
				},
				title: 'FeedBack',
				uri: finalUrl
			}
		);

['liferay-util-window']

}
   
</script>






