<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<table class="tab_data" cellpadding="0" cellspacing="0">
    <tbody>
    <c:if test="${!assessment.getAssessingValuesDTO().getNotBioVal().isEmpty()}">
        <tr>
            <th colspan="3">World Heritage Values</th>
            <th colspan="5">Assessment</th>
            <th colspan="2"></th>
        </tr>
        <tr>
            <th>No.</th>
            <th>Values</th>
            <th>Justification of Assessment</th>
            <th class="good">Good</th>
            <th class="low-concern">Low Concern</th>
            <th class="high-concern">High Concern</th>
            <th class="critical">Critical</th>
            <th>Data deficient</th>
            <th>Trend</th>
        </tr>

        <%--NOT BIO VALUE--%>
        <c:forEach items="${assessment.getAssessingValuesDTO().getNotBioVal()}" var="trend"
                   varStatus="status">
            <tr>
                <td><c:out value="${trend.getCount()}"/></td>
                <td><c:out value="${trend.getWhvalue()}"/></td>
                <td id="${trend.getCurrentstatetrend().getState_trend_id()}_JF_TD"><c:out
                        value="${trend.getCurrentstatetrend().getJustification()}"/></td>
                <td>
                    <c:choose>
                        <c:when test="${trend.getCurrentstatetrend().getState_id() == 1}">
                            <span class="verylowThreatcell"></span>
                        </c:when>
                        <c:otherwise>
                            <span class=""></span>
                        </c:otherwise>
                    </c:choose>
                </td>
                <td>
                    <c:choose>
                        <c:when test="${trend.getCurrentstatetrend().getState_id() == 2}">
                            <span class="lowthreatcell"></span>
                        </c:when>
                        <c:otherwise>
                            <span class=""></span>
                        </c:otherwise>
                    </c:choose>
                </td>
                <td>
                    <c:choose>
                        <c:when test="${trend.getCurrentstatetrend().getState_id() == 3}">
                            <span class="highThreatcell"></span>
                        </c:when>
                        <c:otherwise>
                            <span class=""></span>
                        </c:otherwise>
                    </c:choose>
                </td>
                <td>
                    <c:choose>
                        <c:when test="${trend.getCurrentstatetrend().getState_id() == 4}">
                            <span class="veryhighThreatcell"></span>
                        </c:when>
                        <c:otherwise>
                            <span class=""></span>
                        </c:otherwise>
                    </c:choose>
                </td>
                <td></td>
                <td id="${trend.getCurrentstatetrend().getState_trend_id()}_TR_TD"><c:out
                        value="${trend.getTrend().getTrend()}"/>
                </td>
            </tr>
        </c:forEach>
    </c:if>

    <%--this place for bio values--%>
    <c:if test="${!assessment.getAssessingValuesDTO().getBioVal().isEmpty()}">
        <tr>
            <th>No.</th>
            <th>Other Important Biodiversity Values</th>
            <th>Justification of Assessment</th>
            <th class="good">Good</th>
            <th class="low-concern">Low Concern</th>
            <th class="high-concern">High Concern</th>
            <th class="critical">Critical</th>
            <th>Data deficient</th>
            <th>Trend</th>
        </tr>

        <c:forEach items="${assessment.getAssessingValuesDTO().getBioVal()}" var="bioTrend"
                   varStatus="status">
            <tr>
                <td><c:out value="${bioTrend.getCount()}"/></td>
                <td><c:out value="${bioTrend.getWhvalue()}"/></td>
                <td id="${bioTrend.getCurrentstatetrend().getState_trend_id()}_JF_TD"><c:out
                        value="${bioTrend.getCurrentstatetrend().getJustification()}"/></td>
                <td>
                    <c:choose>
                        <c:when test="${bioTrend.getCurrentstatetrend().getState_id() == 1}">
                            <span class="verylowThreatcell"></span>
                        </c:when>
                        <c:otherwise>
                            <span class=""></span>
                        </c:otherwise>
                    </c:choose>
                </td>
                <td>
                    <c:choose>
                        <c:when test="${bioTrend.getCurrentstatetrend().getState_id() == 2}">
                            <span class="lowthreatcell"></span>
                        </c:when>
                        <c:otherwise>
                            <span class=""></span>
                        </c:otherwise>
                    </c:choose>
                </td>
                <td>
                    <c:choose>
                        <c:when test="${bioTrend.getCurrentstatetrend().getState_id() == 3}">
                            <span class="highThreatcell"></span>
                        </c:when>
                        <c:otherwise>
                            <span class=""></span>
                        </c:otherwise>
                    </c:choose>
                </td>
                <td>
                    <c:choose>
                        <c:when test="${bioTrend.getCurrentstatetrend().getState_id() == 4}">
                            <span class="veryhighThreatcell"></span>
                        </c:when>
                        <c:otherwise>
                            <span class=""></span>
                        </c:otherwise>
                    </c:choose>
                </td>
                <td></td>
                <td id="${bioTrend.getCurrentstatetrend().getState_trend_id()}_TR_TD"><c:out
                        value="${bioTrend.getTrend().getTrend()}"/>
                </td>
            </tr>
        </c:forEach>
    </c:if>
    </tbody>
</table>