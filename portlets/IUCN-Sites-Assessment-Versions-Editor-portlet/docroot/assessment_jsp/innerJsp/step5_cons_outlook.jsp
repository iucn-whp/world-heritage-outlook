<%@include file="/init.jsp" %>
<%--<c:set var="UpdateUrl" value="/assessment_jsp/popup/step5_cons_outlook_pop.jsp"/>--%>
<%--<c:set var="currentDiv" value="step5Div"/> --%>

<table class="tab_data" cellpadding="0" cellspacing="0">
	<tbody>
	<tr>
		<th class="topics">Topics</th>
		<th class="justificationOfassessment">Justification Of Assessment</th>
		<th style="width:120px;" class="ssessment">Assessment</th>
	</tr>

	<tr>
		<td>Assessment of Conservation Outlook</td>
		<c:if test="${assessment.conservationOutlookDTO.conservationOutlookDTOList.size() == 0}">
			<td>n.a.</td>
			<td>n.a.</td>
		</c:if>

		<c:forEach items="${assessment.conservationOutlookDTO.conservationOutlookDTOList}" var="conservationOutlook" varStatus="index">
			<td id="${conservationOutlook.conservationOutlookId}_JF_TD">${conservationOutlook.justification}</td>
			<td id="${conservationOutlook.conservationOutlookId}_RT_TD">
				<span class="${conservationOutlook.threatRating.cssClass}">${conservationOutlook.threatRating.threatRatingName}</span>
			</td>
		</c:forEach>
	</tr>

	</tbody>
</table>