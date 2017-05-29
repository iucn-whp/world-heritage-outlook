<link rel="stylesheet" href="${pageContext.request.contextPath}/css/style_main.css" type="text/css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/jquery.alerts.css" type="text/css" />
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.4.1.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.alerts.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.jqtransform.js"></script>

<%@ page import="javax.portlet.PortletURL" %>
<%@ page import="com.liferay.portlet.PortletURLFactoryUtil" %>
<%@ page import="javax.portlet.PortletRequest" %>
<%@ page import="com.iucn.whp.portlet.dto.SiteAssessmentDTO" %>
<%@ page import="com.liferay.portal.kernel.portlet.LiferayWindowState" %>
<%@ page import="com.liferay.portal.theme.ThemeDisplay" %>
<%@ page import="com.liferay.portal.kernel.util.WebKeys" %>
<%@ page import="com.liferay.portal.service.LayoutLocalServiceUtil" %>
<%@ page import="com.liferay.portal.model.Layout" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
    ThemeDisplay thisThemeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);

    Layout editLayoutFour = LayoutLocalServiceUtil.getFriendlyURLLayout(thisThemeDisplay.getScopeGroupId(),
            false, "/manage-assessment");
%>

<c:forEach items="${assessments}" var="assessment">

    <c:if test="${hasCoordinatorRole eq 'true' && hasAdminRole eq 'false'}">
        <c:if test="${assessment.status == 3 && assessment.stage == 2}">
            <div class="mainBlock siteInfoMainBlock">
                <div class="tableWrapper tableWrapperSiteInfoContacts">
                    <div class="topBarGrey">
                        <p class="AssessorP">User: <span>${assessment.threatsDTO.userFullName}</span></p>
                        <p class="siteNameP">Role: <span>${assessment.threatsDTO.roleName}</span></p>
                        <p class="versionP">Version: <span>${assessment.threatsDTO.version}</span></p>

                        <%
                            PortletURL myRenderURL = PortletURLFactoryUtil.create(request,
                                    "IUCNSiteAssessment_WAR_IUCNSiteAssessmentportlet", editLayoutFour.getPlid(),
                                    PortletRequest.ACTION_PHASE);

                            SiteAssessmentDTO siteAssessmentDTO = (SiteAssessmentDTO) pageContext.getAttribute("assessment");
                            Long versionId = siteAssessmentDTO.getValuesDTO().getAssessmentVersionId();

                            myRenderURL.setWindowState(LiferayWindowState.NORMAL);
                            myRenderURL.setParameter("assesmentId", String.valueOf(siteAssessmentDTO.getAssessmentId()));
                            myRenderURL.setParameter("mode", "edit");
                            myRenderURL.setParameter("versionId", String.valueOf(versionId));
                            myRenderURL.setParameter("userId", String.valueOf(thisThemeDisplay.getUserId()));
                            myRenderURL.setParameter("javax.portlet.action", "editPublishesAssessmentAction");
                            myRenderURL.setParameter("updateForSAV", "true");

                        %>
                        <p class="accept-button" style="float: right;">
                            <span class="aui-button">
                                <span class="aui-button-content">
                                    <a target="_blank" class="aui-button-input" href="<%= myRenderURL.toString() %>">
                                        <input class="aui-button-input" type="button" value="Accept">
                                    </a>
                                </span>
                            </span>
                        </p>
                    </div>

                    <div class="infoSection">
                        <h2 class="siteAssessmentSubHeadings">Assessing The Current State And Trend Of Values</h2>

                        <div id="step4MainDiv" class="infoSectionContent">
                            <jsp:include page="/assessment_jsp/innerJsp/step4_ctatv.jsp"></jsp:include>
                        </div>
                    </div>
                    <div class="infoSection">
                        <h2 class="siteAssessmentSubHeadings">Summary of the Values</h2>
                        <div id="step4whDiv" class="infoSectionContent">
                            <jsp:include page="/assessment_jsp/innerJsp/step4_whvalue_overall.jsp"></jsp:include>
                        </div>
                    </div>
                </div>
            </div>
        </c:if>
    </c:if>

    <c:if test="${hasCoordinatorRole eq 'false' || hasAdminRole eq 'true'}">
        <div class="mainBlock siteInfoMainBlock">
            <div class="tableWrapper tableWrapperSiteInfoContacts">
                <div class="topBarGrey">
                    <p class="AssessorP">User: <span>${assessment.threatsDTO.userFullName}</span></p>
                    <p class="siteNameP">Role: <span>${assessment.threatsDTO.roleName}</span></p>
                    <p class="versionP">Version: <span>${assessment.threatsDTO.version}</span></p>

                    <%
                        PortletURL myRenderURL = PortletURLFactoryUtil.create(request,
                                "IUCNSiteAssessment_WAR_IUCNSiteAssessmentportlet", editLayoutFour.getPlid(),
                                PortletRequest.ACTION_PHASE);

                        SiteAssessmentDTO siteAssessmentDTO = (SiteAssessmentDTO) pageContext.getAttribute("assessment");
                        Long versionId = siteAssessmentDTO.getValuesDTO().getAssessmentVersionId();

                        myRenderURL.setWindowState(LiferayWindowState.NORMAL);
                        myRenderURL.setParameter("assesmentId", String.valueOf(siteAssessmentDTO.getAssessmentId()));
                        myRenderURL.setParameter("mode", "edit");
                        myRenderURL.setParameter("versionId", String.valueOf(versionId));
                        myRenderURL.setParameter("userId", String.valueOf(thisThemeDisplay.getUserId()));
                        myRenderURL.setParameter("javax.portlet.action", "editPublishesAssessmentAction");
                        myRenderURL.setParameter("updateForSAV", "true");

                    %>
                    <p class="accept-button" style="float: right;">
                            <span class="aui-button">
                                <span class="aui-button-content">
                                    <a target="_blank" class="aui-button-input" href="<%= myRenderURL.toString() %>">
                                        <input class="aui-button-input" type="button" value="Accept">
                                    </a>
                                </span>
                            </span>
                    </p>
                </div>

                <div class="infoSection">
                    <h2 class="siteAssessmentSubHeadings">Assessing The Current State And Trend Of Values</h2>

                    <div id="step4MainDiv" class="infoSectionContent" class="infoSectionContent">
                        <jsp:include page="/assessment_jsp/innerJsp/step4_ctatv.jsp"></jsp:include>
                    </div>
                </div>
                <div class="infoSection">
                    <h2 class="siteAssessmentSubHeadings">Summary of the Values</h2>
                    <div id="step4whDiv" class="infoSectionContent">
                        <jsp:include page="/assessment_jsp/innerJsp/step4_whvalue_overall.jsp"></jsp:include>
                    </div>
                </div>
            </div>
        </div>
    </c:if>
</c:forEach>
