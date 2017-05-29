<%@ page import="com.liferay.portal.kernel.portlet.LiferayWindowState" %>
<%@ page import="com.liferay.portal.kernel.util.WebKeys" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="portlet" uri="http://java.sun.com/portlet" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="liferay-ui" uri="http://liferay.com/tld/ui" %>
<%@ taglib prefix="aui" uri="http://alloy.liferay.com/tld/aui" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<portlet:defineObjects/>

<link rel="stylesheet" href="${pageContext.request.contextPath}/css/style_main.css" type="text/css"/>

<c:set var="themeDisplay" value="<%=request.getAttribute(WebKeys.THEME_DISPLAY)%>"/>
<c:set var="exclusive" value="<%=LiferayWindowState.EXCLUSIVE.toString()%>"/>
<c:set var="namespace"><portlet:namespace/></c:set>

<script type="text/javascript">

    jQuery(document).ready(function () {
        var config = {
            namespace: '<portlet:namespace/>',
            container: '#tabs1',
            urls: {
            }
        };

        var assessments = new Assessments(config);

    });

</script>
