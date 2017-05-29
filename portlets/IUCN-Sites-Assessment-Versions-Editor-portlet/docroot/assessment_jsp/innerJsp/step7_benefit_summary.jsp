<%@include file="../../init.jsp" %>

<%--<c:set var="UpdateUrl" value="/assessment_jsp/popup/step7_benefits_summ_pop.jsp"/>--%>
<%--<c:set var="currentDiv" value="step7bDiv"/> --%>

<table class="tab_data" cellpadding="0" cellspacing="0">
	<tbody>
	<tr>
        <th align="left"> Summary of benefits</th>
	</tr>

	<c:forEach items="${assessment.benefitsDTO.benefitsSummaryDTOList}" var="benefitsSummary" varStatus="status">
        <tr>
            <td colspan="2" id="${benefitsSummary.benefitsSummaryId}BSS_TD"><c:out value="${benefitsSummary.summary}"/></td>
        </tr>
	</c:forEach>
	</tbody>
</table>






















