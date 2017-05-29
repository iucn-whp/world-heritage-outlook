<%
/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
%>
<%@page import="com.liferay.portal.util.*" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<portlet:defineObjects />
<%
String width=null;
HttpServletRequest httpReq = PortalUtil.getOriginalServletRequest(PortalUtil.getHttpServletRequest(renderRequest)); 
width = httpReq.getParameter("w");
if(width!=null){
%>
<iframe
   src="http://www.panoramio.com/wapi/template/photo_list.html?&tag=beach&width=950&height=800&position=bottom&list_size=6&bgcolor=%23000020"
   frameborder="1" width="950" height="800" scrolling="no" marginwidth="10" marginheight="10">
</iframe>
<%
}
else
{
%>
<iframe
   src="http://www.panoramio.com/wapi/template/photo_list.html?&tag=beach&width=400&height=400&position=bottom&list_size=6&bgcolor=%23000020"
   frameborder="1" width="400" height="400" scrolling="no" marginwidth="10" marginheight="10">
</iframe>

<%
} 
%>



