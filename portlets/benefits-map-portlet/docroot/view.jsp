<%
/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
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

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />

<html xmlns="http://www.w3.org/1999/xhtml">

<head>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<!-- <style>
#frameMap
{
border:0px;
}

#column-1
{
 	margin: 0;
    padding: 0;
    position: absolute;
    top: 121px;
    width:100%;
    left:0px;
    height:330px;
}

#column-1 #layout-column_column-1
{
	margin: 0;
    padding: 0;
}
#content {
    height: 330px;
} -->

</style>



<!-- <script type="text/javascript">
        $(document).ready(function () {
			$('.c4YZDc').css({ 'width': (($(window).width()) - 0) + 'px' });
		});	
</script>	 -->

</head>
<body>

<!-- <embed id="frameMap" src="https://mapsengine.google.com/map/embed?mid=z50G4hXqYIhQ.k4jo7RZxWF7g" width="100%" height="330px"></embed> -->
<object type="text/html" data="//mangomap.com/maps/98f9e3e0-a0c2-11e4-aefd-22000b2517a0?preview=true&embed=true" width="100%"
  height="330px">
  <embed id="frameMap" src=
  "//mangomap.com/maps/98f9e3e0-a0c2-11e4-aefd-22000b2517a0?preview=true&embed=true" width="100%"
  height="330px" />
</object>

</html>