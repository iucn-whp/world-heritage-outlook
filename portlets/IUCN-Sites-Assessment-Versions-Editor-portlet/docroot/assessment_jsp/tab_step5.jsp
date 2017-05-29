<liferay-theme:defineObjects />



<div class="mainBlock siteInfoMainBlock">
    <div class="tableWrapper tableWrapperSiteInfoContacts">
        <c:forEach items="${assessments}" var="assessment">

            <c:if test="${hasCoordinatorRole eq 'true' && hasAdminRole eq 'false'}">
                <c:if test="${assessment.status == 3 && assessment.stage == 2}">
                    <div class="topBarGrey">
                        <p class="AssessorP">User: <span>${assessment.conservationOutlookDTO.userFullName}</span></p>
                        <p class="siteNameP">Role: <span>${assessment.conservationOutlookDTO.roleName}</span></p>
                        <p class="versionP">Version: <span>${assessment.conservationOutlookDTO.version}</span></p>
                        <%
                            Layout editLayout = LayoutLocalServiceUtil.getFriendlyURLLayout(themeDisplay.getScopeGroupId(),
                                    false, "/manage-assessment");

                            String siteId = String.valueOf(request.getAttribute("siteId"));

                            PortletURL myRenderURL= PortletURLFactoryUtil.create(request,
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

                    <c:set var="assessment" value="${assessment}" scope="request"/>

                    <div class="infoSection">
                        <h2 class="siteAssessmentSubHeadings">Summary of Assessments of Values, Threats, and Protection and Management</h2>
                        <div id="step5Div" class="infoSectionContent">
                            <jsp:include page="/assessment_jsp/innerJsp/step5_assess_outlook.jsp"/>
                        </div>
                    </div>

                    <div class="infoSection">
                        <h2 class="siteAssessmentSubHeadings">Assessment of Conservation Outlook </h2>
                        <div id="step5bDiv" class="infoSectionContent">
                            <jsp:include page="/assessment_jsp/innerJsp/step5_cons_outlook.jsp" />
                        </div>
                    </div>
                </c:if>
            </c:if>

            <c:if test="${hasCoordinatorRole eq 'false' || hasAdminRole eq 'true'}">
                <div class="topBarGrey">
                    <p class="AssessorP">User: <span>${assessment.conservationOutlookDTO.userFullName}</span></p>
                    <p class="siteNameP">Role: <span>${assessment.conservationOutlookDTO.roleName}</span></p>
                    <p class="versionP">Version: <span>${assessment.conservationOutlookDTO.version}</span></p>
                    <%
                        Layout editLayout = LayoutLocalServiceUtil.getFriendlyURLLayout(themeDisplay.getScopeGroupId(),
                                false, "/manage-assessment");

                        String siteId = String.valueOf(request.getAttribute("siteId"));

                        PortletURL myRenderURL= PortletURLFactoryUtil.create(request,
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

                <c:set var="assessment" value="${assessment}" scope="request"/>

                <div class="infoSection">
                    <h2 class="siteAssessmentSubHeadings">Summary of Assessments of Values, Threats, and Protection and Management</h2>
                    <div id="step5Div" class="infoSectionContent">
                        <jsp:include page="/assessment_jsp/innerJsp/step5_assess_outlook.jsp"/>
                    </div>
                </div>

                <div class="infoSection">
                    <h2 class="siteAssessmentSubHeadings">Assessment of Conservation Outlook </h2>
                    <div id="step5bDiv" class="infoSectionContent">
                        <jsp:include page="/assessment_jsp/innerJsp/step5_cons_outlook.jsp" />
                    </div>
                </div>
            </c:if>
        </c:forEach>
    </div>
</div>
