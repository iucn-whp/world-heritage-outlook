<%@ page import="com.iucn.whp.portlet.dto.SiteAssessmentDTO" %>
<%@ page import="com.iucn.whp.portlet.dto.step.threats.CurrentThreatsDTO" %>
<%@ page import="com.iucn.whp.portlet.dto.step.threats.CategoryDTO" %>
<%@ page import="com.iucn.whp.portlet.dto.step.threats.SubCategoryDTO" %>
<%@include file="../../init.jsp" %>

<c:set var="UpdateUrl" value="/assessment_jsp/popup/step2_current_threat.jsp"/>
<c:set var="RefreshUrl" value="/assessment_jsp/innerJsp/step2_ct.jsp"/>
<c:set var="currentDiv" value="step2ctDiv"/>

<table class="tab_data" cellpadding="0" cellspacing="0">
    <tbody>
    <tr>
        <th>Specific Threat</th>
        <th>Category</th>
        <th>Sub-Category</th>
        <th>Values Affected</th>
        <th>Inside</th>
        <th>Outside</th>
        <th>Justification</th>
        <th>Assessment</th>
    </tr>

    <c:forEach items="${assessment.threatsDTO.currentThreatsDTOList}" var="currentThreat" varStatus="value">
        <c:set var="rowCount" value="${currentThreat.categoryDTOList.size()}"/>

        <c:set var="count" value="0" scope="page"/>

        <c:forEach items="${currentThreat.categoryDTOList}" var="category" varStatus="categoryValue">
            <c:forEach items="${category.subCategoryDTOList}" var="subCategory" varStatus="subCategoryValue">
                <c:set var="count" value="${count + 1}" scope="page"/>
            </c:forEach>
        </c:forEach>
        <c:forEach items="${currentThreat.categoryDTOList}" var="category" varStatus="categoryValue">
            <c:set var="subRowCount" value="${category.subCategoryDTOList.size()}"/>
            <c:forEach items="${category.subCategoryDTOList}" var="subCategory" varStatus="subCategoryValue">
                <c:choose>
                    <c:when test="${categoryValue.count == 1 and subCategoryValue.count == 1}">
                        <tr id="${currentThreat.currentThreatId}_CT_TR">
                            <td rowspan="${count}">${currentThreat.currentThreatName}</td>
                            <td rowspan="${subRowCount}"
                                id="${currentThreat.currentThreatId}_${category.categoryId}_CAT_CT_TD">${category.categoryName}</td>
                            <td id="${currentThreat.currentThreatId}_${category.categoryId}_${subCategory.subCategoryId}_SUBCAT_CT_TD">${subCategory.subCategoryName}</td>
                            <td rowspan="${count}"
                                id="${currentThreat.currentThreatId}_CT_WH_TD">${currentThreat.valuesAffected}</td>
                            <td rowspan="${count}" id="${currentThreat.currentThreatId}_CT_IN_TD">
                                <c:choose>
                                <c:when test="${currentThreat.insideSite}">Yes, ${currentThreat.threatExtentValue}</c:when>
                                <c:otherwise>No</c:otherwise>
                                </c:choose>
                            <td rowspan="${count}"
                                id="${currentThreat.currentThreatId}_CT_OUT_TD">${currentThreat.outsideSite ? "Yes" : "No"}</td>
                            <td rowspan="${count}"
                                id="${currentThreat.currentThreatId}_CT_JF_TD">${currentThreat.justification}</td>
                            <td rowspan="${count}" id="${currentThreat.currentThreatId}_CT_RT_TD">
                                <span class="${currentThreat.threatRating.cssClass}">${currentThreat.threatRating.threatRatingName}</span>
                            </td>
                        </tr>
                    </c:when>
                    <c:when test="${categoryValue.count > 1 and subCategoryValue.count == 1}">
                        <tr id="${currentThreat.currentThreatId}_CT_TR">
                            <td rowspan="${subRowCount}"
                                id="${currentThreat.currentThreatId}_${category.categoryId}_CAT_CT_TD">${category.categoryName}</td>
                            <td id="${currentThreat.currentThreatId}_${category.categoryId}_${subCategory.subCategoryId}_SUBCAT_CT_TD">${subCategory.subCategoryName}</td>
                        </tr>
                    </c:when>
                    <c:otherwise>
                        <tr id="${currentThreat.currentThreatId}_CT_TR">
                            <td id="${currentThreat.currentThreatId}_${category.categoryId}_${subCategory.subCategoryId}_SUBCAT_CT_TD">${subCategory.subCategoryName}</td>
                        </tr>
                    </c:otherwise>
                </c:choose>

            </c:forEach>
        </c:forEach>
    </c:forEach>
    </tbody>
</table>
