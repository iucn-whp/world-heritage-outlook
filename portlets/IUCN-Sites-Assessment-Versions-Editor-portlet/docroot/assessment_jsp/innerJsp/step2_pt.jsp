<%@include file="../../init.jsp" %>

<c:set var="UpdateUrl" value="/assessment_jsp/popup/step2_potential_threat.jsp"/>
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

    <c:forEach items="${assessment.threatsDTO.potentialThreatsDTOList}" var="potentialThreat" varStatus="value">
        <c:set var="categoryCount" value="${potentialThreat.categoryDTOList.size()}"/>
        <c:set var="countP" value="0" scope="page"/>

        <c:forEach items="${potentialThreat.categoryDTOList}" var="category" varStatus="categoryValue">
            <c:forEach items="${category.subCategoryDTOList}" var="subCategory" varStatus="subCategoryValue">
                <c:set var="countP" value="${countP + 1}" scope="page"/>
            </c:forEach>
        </c:forEach>

        <c:forEach items="${potentialThreat.categoryDTOList}" var="category" varStatus="categoryValue">
            <c:set var="subCategoryCaunt" value="${category.subCategoryDTOList.size()}"/>
            <c:forEach items="${category.subCategoryDTOList}" var="subCategory" varStatus="subCategoryValue">
                <c:choose>
                    <c:when test="${categoryValue.count == 1 and subCategoryValue.count == 1}">
                        <tr id="${potentialThreat.potentialThreatId}_CT_TR">
                            <td rowspan="${countP}">${potentialThreat.potentialThreatName}</td>
                            <td rowspan="${subCategoryCaunt}"
                                id="${potentialThreat.potentialThreatId}_${category.categoryId}_CAT_CT_TD">${category.categoryName}</td>
                            <td id="${potentialThreat.potentialThreatId}_${category.categoryId}_${subCategory.subCategoryId}_SUBCAT_CT_TD">${subCategory.subCategoryName}</td>
                            <td rowspan="${countP}"
                                id="${potentialThreat.potentialThreatId}_CT_WH_TD">${potentialThreat.valuesAffected}</td>
                            <td rowspan="${countP}" id="${potentialThreat.potentialThreatId}_CT_IN_TD">
                                <c:choose>
                                <c:when test="${potentialThreat.insideSite}">Yes, ${potentialThreat.threatExtentValue}</c:when>
                                <c:otherwise>No</c:otherwise>
                                </c:choose>
                            <td rowspan="${countP}"
                                id="${potentialThreat.potentialThreatId}_CT_OUT_TD">${potentialThreat.outsideSite ? "Yes" : "No"}</td>
                            <td rowspan="${countP}"
                                id="${potentialThreat.potentialThreatId}_CT_JF_TD">${potentialThreat.justification}</td>
                            <td rowspan="${countP}" id="${potentialThreat.potentialThreatId}_CT_RT_TD">
                                <span class="${potentialThreat.threatRating.cssClass}">${potentialThreat.threatRating.threatRatingName}</span>
                            </td>
                        </tr>
                    </c:when>
                    <c:when test="${categoryValue.count > 1 and subCategoryValue.count == 1}">
                        <tr id="${potentialThreat.potentialThreatId}_CT_TR">
                            <td rowspan="${subCategoryCaunt}"
                                id="${potentialThreat.potentialThreatId}_${category.categoryId}_CAT_CT_TD">${category.categoryName}</td>
                            <td id="${potentialThreat.potentialThreatId}_${category.categoryId}_${subCategory.subCategoryId}_SUBCAT_CT_TD">${subCategory.subCategoryName}</td>
                        </tr>
                    </c:when>
                    <c:otherwise>
                        <tr id="${potentialThreat.potentialThreatId}_CT_TR">
                            <td id="${potentialThreat.potentialThreatId}_${category.categoryId}_${subCategory.subCategoryId}_SUBCAT_CT_TD">${subCategory.subCategoryName}</td>
                        </tr>
                    </c:otherwise>
                </c:choose>

            </c:forEach>
        </c:forEach>
    </c:forEach>
    </tbody>
</table>

