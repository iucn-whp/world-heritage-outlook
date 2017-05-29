<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<table class="tab_data" cellpadding="0" cellspacing="0">
    <tbody>
    <tr>
        <th>Values</th>
        <th>Justification of Assessment</th>
        <th>Assessment</th>
        <th>Trend</th>
    </tr>

    <tr>
        <td>Assessment of the current state and trend of World Heritage values</td>

        <td id="${assessment.getAssessingValuesDTO().getAssessingValuesDTOStateTrend().getTrendWhValue()
                .getState_trend_whval_id()}_WJF_TD">
            ${assessment.getAssessingValuesDTO().getAssessingValuesDTOStateTrend().getTrendWhValue().getJustification()}
        </td>
        <c:choose>
            <c:when test="${assessment.getAssessingValuesDTO()
                    .getAssessingValuesDTOStateTrend().getTrendWhValue().getState_id() == 1}">
                <td>
                    <span class="verylowThreatcell"></span>
                </td>
            </c:when>
            <c:when test="${assessment.getAssessingValuesDTO()
                    .getAssessingValuesDTOStateTrend().getTrendWhValue().getState_id() == 2}">
                <td>
                    <span class="lowthreatcell"></span>
                </td>
            </c:when>
            <c:when test="${assessment.getAssessingValuesDTO()
                    .getAssessingValuesDTOStateTrend().getTrendWhValue().getState_id() == 3}">
                <td>
                    <span class="highThreatcell"></span>
                </td>
            </c:when>
            <c:when test="${assessment.getAssessingValuesDTO()
                    .getAssessingValuesDTOStateTrend().getTrendWhValue().getState_id() == 4}">
                <td>
                    <span class="veryhighThreatcell"></span>
                </td>
            </c:when>
            <c:otherwise>
                <td>
                    <span class=""></span>
                </td>
            </c:otherwise>
        </c:choose>
        <td id="${assessment.getAssessingValuesDTO()
                        .getAssessingValuesDTOStateTrend().getTrendWhValue().getState_id()}_WTR_TD">
            ${assessment.getAssessingValuesDTO().getAssessingValuesDTOStateTrend().getTrend_lkp().getTrend()}
        </td>
    </tr>

    <%--<tr>--%>
        <%--<th colspan="4">Addendum - other important biodiversity values</th>--%>
    <%--</tr>--%>

    <tr>
        <td>Assessment of the current state and trend of other important biodiversity values (if
            applicable)
        </td>

        <td id="${assessment.getAssessingValuesDTO().getAssessingValuesDTOStateTrendBio().getState_trend_biodivvals()
            .getState_trend_biodivvals_id()}_BJF_TD">
            ${assessment.getAssessingValuesDTO().getAssessingValuesDTOStateTrendBio().getState_trend_biodivvals()
                    .getJustification()}
        </td>

        <c:choose>
            <c:when test="${assessment.getAssessingValuesDTO()
                    .getAssessingValuesDTOStateTrendBio().getState_trend_biodivvals().getState_id() == 1}">
                <td>

                    <span class="verylowThreatcell"></span>
                </td>
            </c:when>
            <c:when test="${assessment.getAssessingValuesDTO()
                    .getAssessingValuesDTOStateTrendBio().getState_trend_biodivvals().getState_id() == 2}">
                <td>

                    <span class="lowthreatcell"></span>
                </td>
            </c:when>
            <c:when test="${assessment.getAssessingValuesDTO()
                    .getAssessingValuesDTOStateTrendBio().getState_trend_biodivvals().getState_id() == 3}">
                <td>

                    <span class="highThreatcell"></span>
                </td>
            </c:when>
            <c:when test="${assessment.getAssessingValuesDTO()
                    .getAssessingValuesDTOStateTrendBio().getState_trend_biodivvals().getState_id() == 4}">
                <td>

                    <span class="veryhighThreatcell"></span>
                </td>
            </c:when>
            <c:otherwise>
                <td>

                    <span class=""></span>
                </td>
            </c:otherwise>
        </c:choose>

        <td id="${assessment.getAssessingValuesDTO().getAssessingValuesDTOStateTrendBio().getState_trend_biodivvals()
            .getState_trend_biodivvals_id()}_BTR_TD">
            ${assessment.getAssessingValuesDTO().getAssessingValuesDTOStateTrendBio().getTrend_lkp().getTrend()}
        </td>
    </tr>

    </tbody>
</table>
