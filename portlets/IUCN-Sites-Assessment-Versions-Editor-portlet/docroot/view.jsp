<%@ page import="com.liferay.portal.model.User" %>
<%@ page import="com.liferay.portal.theme.ThemeDisplay" %>
<%@ page import="com.liferay.portal.service.RoleLocalServiceUtil" %>
<%@ page import="com.liferay.portal.model.Role" %>
<%@ page import="com.liferay.portal.kernel.exception.PortalException" %>
<%@ page import="com.liferay.portal.kernel.exception.SystemException" %>
<%@include file="init.jsp" %>

<!-- Wrapper Starts here-->
<div class="headingBTN">
    <h2 class="floatHeading siteAssessmentPageHeading">Site Assessment Versions</h2>

    <div class="headerLinks">
        <a href="/web/iucn/sites-data" class="roundedwhiteBTN" style="float:right"><span><p>Back</p></span></a>

        <%--<a href="javascript:void(0);" onclick="javascript:validatehelp();" class="roundedwhiteBTN" style="float:right"><span><p class="help">Help</p></span></a>--%>
    </div>
</div>

<div id="tabs1">

    <div class="topBarGrey">
        <p class="siteNameP">Site Name: <span>${siteName}</span></p>
        <%--<p class="siteDateP">Date: <span><fmt:formatDate pattern="dd/MM/yyyy" value="<%=assesment.getInitiation_date() %>"/></span></p>--%>
        <%--<p class="AssessorP">Assessor: <span><%=UserName %></span></p>--%>
        <%--<p class="versionP">Version: <span><%= version_id%></span></p>--%>
    </div>
    <c:choose>
        <c:when test="${fn:length(assessments)!= 0}">
            <ul class="aui-tabview-list" id="docs1">

                <li class="assessment-tab aui-tab yui3-widget aui-component aui-state-default" id="step1">
                    <a class="aui-tab-label ie7fix" href="javascript:void(0);">1.&nbsp;Values</a>
                </li>

                <li class="assessment-tab aui-tab yui3-widget aui-component aui-state-default" id="step2">
                    <a id="step2a" class="aui-tab-label ie7fix" href="javascript:void(0);">2.&nbsp;Threats</a>
                </li>

                <li class="assessment-tab aui-tab yui3-widget aui-component aui-state-default" id="step3">
                    <a class="aui-tab-label" id="step3a" href="javascript:void(0);">3.&nbsp;Protection & <br>&nbsp;&nbsp;&nbsp;Management</a>
                </li>

                <li class="assessment-tab aui-tab yui3-widget aui-component aui-state-default" id="step4">
                    <a class="aui-tab-label" id="step4a" href="javascript:void(0);">4.&nbsp;Assessing <br>&nbsp;&nbsp;&nbsp;Values</a>
                </li>

                <li class="assessment-tab aui-tab yui3-widget aui-component aui-state-default" id="step5">
                    <a class="aui-tab-label" href="javascript:void(0);">5.&nbsp;Conservation <br>&nbsp;&nbsp;&nbsp;Outlook</a>
                </li>

                <li class="assessment-tab aui-tab yui3-widget aui-component aui-state-default" id="step6">
                    <a class="aui-tab-label  ie7fix" href="javascript:void(0);">6. Benefits</a>
                </li>

                <li class="assessment-tab aui-tab yui3-widget aui-component aui-state-default" id="step7">
                    <a class="aui-tab-label" href="javascript:void(0);">7. Projects</a>
                </li>

                <li class="assessment-tab aui-tab yui3-widget aui-component aui-state-default" id="step8">
                    <a class="aui-tab-label  ie7fix" href="javascript:void(0);">8.&nbsp;References</a>
                </li>

            </ul>

            <div class="aui-tabview-content aui-widget-bd" id="docsContent1">
                    <%-- Tab content --%>
                <div id="divStep1" class="aui-tabview-content-item" data-step="step1">
                    <%@include file="/assessment_jsp/tab_step1.jsp" %>
                </div>

                <div id="divStep2" class="aui-tabview-content-item aui-helper-hidden" data-step="step2">
                    <%@include file="/assessment_jsp/tab_step2.jsp" %>
                </div>

                <div id="divStep3" class="aui-tabview-content-item aui-helper-hidden" data-step="step3">
                    <jsp:include page="/assessment_jsp/tab_step3.jsp"/>
                </div>

                <div id="divStep4" class="aui-tabview-content-item aui-helper-hidden" data-step="step4">
                    <%@include file="/assessment_jsp/tab_step4.jsp" %>
                </div>

                <div id="divStep5" class="aui-tabview-content-item aui-helper-hidden" data-step="step5">
                    <%@include file="/assessment_jsp/tab_step5.jsp" %>
                </div>

                <div id="divStep6" class="aui-tabview-content-item aui-helper-hidden" data-step="step6">
                    <%@include file="/assessment_jsp/tab_step7.jsp" %>
                </div>

                <div id="divStep7" class="aui-tabview-content-item aui-helper-hidden" data-step="step7">
                    <%@include file="/assessment_jsp/tab_step8.jsp" %>
                </div>

                <div id="divStep8" class="aui-tabview-content-item aui-helper-hidden" data-step="step8">
                    <%@include file="/assessment_jsp/tab_step9.jsp" %>
                </div>
            </div>
        </c:when>
        <c:otherwise>
            There is have no Site Versions with Status:Complete and Stage:Review.
        </c:otherwise>
    </c:choose>

</div>