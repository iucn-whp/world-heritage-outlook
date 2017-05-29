<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!--mainBlock Starts Here-->
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState" %>
<%@ page import="com.liferay.portal.model.Layout" %>
<%@ page import="javax.portlet.PortletURL" %>
<%@ page import="com.liferay.portal.service.LayoutLocalServiceUtil" %>
<%@ page import="com.liferay.portlet.PortletURLFactoryUtil" %>
<%@ page import="javax.portlet.PortletRequest" %>
<%@ page import="com.iucn.whp.portlet.dto.SiteAssessmentDTO" %>
<%@ page import="com.liferay.portal.theme.ThemeDisplay" %>
<%@ page import="com.liferay.portal.kernel.util.WebKeys" %>
<%@ taglib prefix="portlet" uri="http://java.sun.com/portlet" %>
<%
    ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
    Layout editLayout = LayoutLocalServiceUtil.getFriendlyURLLayout(themeDisplay.getScopeGroupId(),
            false, "/manage-assessment");
%>

<div class="mainBlock siteInfoMainBlock">

    <div class="tableWrapper tableWrapperSiteInfoContacts">

        <c:forEach items="${assessments}" var="assessment">
            <c:if test="${hasCoordinatorRole eq 'true' && hasAdminRole eq 'false'}">
                <c:if test="${assessment.status == 3 && assessment.stage == 2}">
                    <div id="step3Div">

                        <div class="topBarGrey">
                            <p class="AssessorP">User: <span>${assessment.threatsDTO.userFullName}</span></p>
                            <p class="siteNameP">Role: <span>${assessment.threatsDTO.roleName}</span></p>
                            <p class="versionP">Version: <span>${assessment.threatsDTO.version}</span></p>

                            <%
                                PortletURL myRenderURL = PortletURLFactoryUtil.create(request,
                                        "IUCNSiteAssessment_WAR_IUCNSiteAssessmentportlet", editLayout.getPlid(),
                                        PortletRequest.ACTION_PHASE);

                                SiteAssessmentDTO siteAssessmentDTO = (SiteAssessmentDTO) pageContext.getAttribute("assessment");
                                Long versionId = siteAssessmentDTO.getValuesDTO().getAssessmentVersionId();

                                myRenderURL.setWindowState(LiferayWindowState.NORMAL);
                                myRenderURL.setParameter("assesmentId", String.valueOf(siteAssessmentDTO.getAssessmentId()));
                                myRenderURL.setParameter("mode", "edit");
                                myRenderURL.setParameter("versionId", String.valueOf(versionId));
                                myRenderURL.setParameter("userId", String.valueOf(themeDisplay.getUserId()));
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

                            <div id="step3Div_mgt" class="infoSectionContent">
                                <jsp:include page="/assessment_jsp/innerJsp/step3_in.jsp"/>
                            </div>

                        </div>

                    </div>

                    <div class="infoSection">
                        <h2 class="siteAssessmentSubHeadings">Overall assessment of
                            protection and management</h2>
                        <div class="tipsSection"></div>
                        <div id="step3overAllDiv" class="infoSectionContent">
                            <jsp:include page="/assessment_jsp/innerJsp/step3_overall.jsp"/>
                        </div>
                    </div>
                </c:if>
            </c:if>

            <c:if test="${hasCoordinatorRole eq 'false' || hasAdminRole eq 'true'}">
                <div id="step3Div">

                    <div class="topBarGrey">
                        <p class="AssessorP">User: <span>${assessment.threatsDTO.userFullName}</span></p>
                        <p class="siteNameP">Role: <span>${assessment.threatsDTO.roleName}</span></p>
                        <p class="versionP">Version: <span>${assessment.threatsDTO.version}</span></p>

                        <%
                            PortletURL myRenderURL = PortletURLFactoryUtil.create(request,
                                    "IUCNSiteAssessment_WAR_IUCNSiteAssessmentportlet", editLayout.getPlid(),
                                    PortletRequest.ACTION_PHASE);

                            SiteAssessmentDTO siteAssessmentDTO = (SiteAssessmentDTO) pageContext.getAttribute("assessment");
                            Long versionId = siteAssessmentDTO.getValuesDTO().getAssessmentVersionId();

                            myRenderURL.setWindowState(LiferayWindowState.NORMAL);
                            myRenderURL.setParameter("assesmentId", String.valueOf(siteAssessmentDTO.getAssessmentId()));
                            myRenderURL.setParameter("mode", "edit");
                            myRenderURL.setParameter("versionId", String.valueOf(versionId));
                            myRenderURL.setParameter("userId", String.valueOf(themeDisplay.getUserId()));
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

                        <div id="step3Div_mgt" class="infoSectionContent">
                            <jsp:include page="/assessment_jsp/innerJsp/step3_in.jsp"/>
                        </div>

                    </div>

                </div>

                <div class="infoSection">
                    <h2 class="siteAssessmentSubHeadings">Overall assessment of
                        protection and management</h2>
                    <div class="tipsSection"></div>
                    <div id="step3overAllDiv" class="infoSectionContent">
                            <jsp:include page="/assessment_jsp/innerJsp/step3_overall.jsp"/>
                    </div>
                </div>
            </c:if>
        </c:forEach>
    </div>
</div>


