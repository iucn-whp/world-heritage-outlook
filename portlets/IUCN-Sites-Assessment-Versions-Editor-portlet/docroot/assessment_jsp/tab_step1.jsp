<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ page import="javax.portlet.PortletRequest" %>
<%@ page import="com.liferay.portlet.PortletURLFactoryUtil" %>
<%@ page import="javax.portlet.PortletURL" %>
<%@ page import="com.liferay.portal.service.LayoutLocalServiceUtil" %>
<%@ page import="com.liferay.portal.model.Layout" %>
<%@ page import="com.iucn.whp.portlet.dto.SiteAssessmentDTO" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<liferay-theme:defineObjects />

<div class="mainBlock siteInfoMainBlock">

    <%-- Multiple Assessment / Reviewer results --%>
    <div class="tableWrapper tableWrapperSiteInfoContacts">

        <c:forEach items="${assessments}" var="assessment">
            <c:if test="${hasCoordinatorRole eq 'true' && hasAdminRole eq 'false'}">
                <c:if test="${assessment.status == 3 && assessment.stage == 2}">
                    <div class="topBarGrey">
                        <p class="AssessorP">User: <span>${assessment.valuesDTO.userFullName}</span></p>
                        <p class="siteNameP">Role: <span>${assessment.valuesDTO.roleName}</span></p>
                        <p class="versionP">Version: <span>${assessment.valuesDTO.version}</span></p>

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
                            myRenderURL.setParameter("siteId", siteId);
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
                        <h2 class="siteAssessmentSubHeadings">Identifying And Describing Values</h2>
                        <div class="infoSectionContent">
                            <table class="tab_data" cellpadding="0" cellspacing="0">
                                <tbody>
                                <tr>
                                    <th class="number">No.</th>
                                    <th class="values">Values</th>
                                    <th class="description">Description</th>
                                    <th class="whCriterion">WH Criteria</th>
                                </tr>

                                <c:forEach items="${assessment.valuesDTO.whValuesDTOList}" var="whValue" varStatus="value">
                                    <tr id="${whValue.valueId}_WH_TR">
                                        <td class="dataHeading"><c:out value="${value.count}"/></td>
                                        <td class="dataHeading"><c:out value="${whValue.values}"/></td>
                                        <td id="${whValue.valueId}_CRT_TD">
                                            <span colspan="4" id="${whValue.valueId}_DES_TD"><c:out value="${whValue.description}"/></span>
                                        </td>
                                        <td class="dataHeading" id="${whValue.valueId}_CRT_TD">Criteria: <c:out value="${whValue.whCriteria}"/></td>
                                    </tr>
                                </c:forEach>
                                </tbody>
                            </table>
                        </div>
                    </div>

                    <div class="infoSection">
                        <h2 class="siteAssessmentSubHeadings">Other Important Biodiversity Values</h2>
                        <div class="infoSectionContent">
                            <table class="tab_data" cellpadding="0" cellspacing="0">
                                <tbody>
                                <tr>
                                    <th class="number">No.</th>
                                    <th class="values">Values</th>
                                    <th class="description">Description</th>
                                </tr>

                                <c:forEach items="${assessment.valuesDTO.biodiversityValuesDTOList}" var="bioValues" varStatus="value">
                                    <tr id="${bioValues.biodiversityValueId}_BD_TR">
                                        <td class="dataHeading" style="width:20px;"><c:out value="${value.count}"/></td>
                                        <td class="dataHeading" id="${bioValues.biodiversityValueId}_BWH_TD"><c:out value="${bioValues.values}"/></td>
                                        <td id="${bioValues.biodiversityValueId}_BD_TR">
                                            <span colspan="3" id="${bioValues.biodiversityValueId}_BDS_TD"><c:out value="${bioValues.description}"/></span>
                                        </td>
                                    </tr>
                                </c:forEach>
                                </tbody>
                            </table>
                        </div>
                    </div>

                </c:if>
            </c:if>

            <c:if test="${hasCoordinatorRole eq 'false' || hasAdminRole eq 'true'}">
                <div class="topBarGrey">
                    <p class="AssessorP">User: <span>${assessment.valuesDTO.userFullName}</span></p>
                    <p class="siteNameP">Role: <span>${assessment.valuesDTO.roleName}</span></p>
                    <p class="versionP">Version: <span>${assessment.valuesDTO.version}</span></p>

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
                        myRenderURL.setParameter("siteId", siteId);
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
                    <h2 class="siteAssessmentSubHeadings">Identifying And Describing Values</h2>
                    <div class="infoSectionContent">
                        <table class="tab_data" cellpadding="0" cellspacing="0">
                            <tbody>
                            <tr>
                                <th class="number">No.</th>
                                <th class="values">Values</th>
                                <th class="description">Description</th>
                                <th class="whCriterion">WH Criteria</th>
                            </tr>

                            <c:forEach items="${assessment.valuesDTO.whValuesDTOList}" var="whValue" varStatus="value">
                                <tr id="${whValue.valueId}_WH_TR">
                                    <td class="dataHeading"><c:out value="${value.count}"/></td>
                                    <td class="dataHeading"><c:out value="${whValue.values}"/></td>
                                    <td id="${whValue.valueId}_CRT_TD">
                                        <span colspan="4" id="${whValue.valueId}_DES_TD"><c:out value="${whValue.description}"/></span>
                                    </td>
                                    <td class="dataHeading" id="${whValue.valueId}_CRT_TD">Criteria: <c:out value="${whValue.whCriteria}"/></td>
                                </tr>
                            </c:forEach>
                            </tbody>
                        </table>
                    </div>
                </div>

                <div class="infoSection">
                    <h2 class="siteAssessmentSubHeadings">Other Important Biodiversity Values</h2>
                    <div class="infoSectionContent">
                        <table class="tab_data" cellpadding="0" cellspacing="0">
                            <tbody>
                            <tr>
                                <th class="number">No.</th>
                                <th class="values">Values</th>
                                <th class="description">Description</th>
                            </tr>

                            <c:forEach items="${assessment.valuesDTO.biodiversityValuesDTOList}" var="bioValues" varStatus="value">
                                <tr id="${bioValues.biodiversityValueId}_BD_TR">
                                    <td class="dataHeading" style="width:20px;"><c:out value="${value.count}"/></td>
                                    <td class="dataHeading" id="${bioValues.biodiversityValueId}_BWH_TD"><c:out value="${bioValues.values}"/></td>
                                    <td id="${bioValues.biodiversityValueId}_BD_TR">
                                        <span colspan="3" id="${bioValues.biodiversityValueId}_BDS_TD"><c:out value="${bioValues.description}"/></span>
                                    </td>
                                </tr>
                            </c:forEach>
                            </tbody>
                        </table>
                    </div>
                </div>
            </c:if>
        </c:forEach>
    </div>

</div>