<%@include file="../../init.jsp" %>

<table class="tab_data" cellpadding="0" cellspacing="0">
	<tbody>
	<tr>
		<th>Values</th>
		<th>Justification</th>
		<th>Assessment</th>
	</tr>

	<c:forEach items="${assessment.threatsDTO.overallAssessmentOfThreatsDTOList}" var="overallAssessment" varStatus="value">
		<tr>
			<td class="currentThreat" style="width:250px;">Overall Assessment of current Threats</td>
			<c:choose>
				<c:when test="${overallAssessment.overallCurrent == null or overallAssessment.currentRating.rating == 0}">
					<td align="center"></td>
					<td align="center"></td>
				</c:when>
				<c:otherwise>
					<td id="${overallAssessment.threatSumCurrentId}_SC_JF_TD">${overallAssessment.overallCurrent}</td>
					<td id="${overallAssessment.threatSumCurrentId}_SC_RT_TD"><span class="${overallAssessment.currentRating.cssClass}">${overallAssessment.currentRating.threatRatingName}</span></td>
				</c:otherwise>
			</c:choose>
		</tr>

		<tr>
			<td class="currentThreat" style="width:250px;">Overall Assessment of Potential Threats</td>
			<c:choose>
				<c:when test="${overallAssessment.overallPotential == null or overallAssessment.potentialRating.rating == 0}">
					<td align="center"></td>
					<td align="center"></td>
				</c:when>
				<c:otherwise>
					<td id="${overallAssessment.threatSumPotentialId}_SP_JF_TD">${overallAssessment.overallPotential}</td>
					<td id="${overallAssessment.threatSumPotentialId}_SP_RT_TD"><span class="${overallAssessment.potentialRating.cssClass}">${overallAssessment.potentialRating.threatRatingName}</span></td>
				</c:otherwise>
			</c:choose>
		</tr>

		<tr>
			<td class="currentThreat" style="width:205px;">Overall Assessment of Threats</td>
			<c:choose>
				<c:when test="${overallAssessment.overallThreat == null or overallAssessment.threatRating.rating == 0}">
					<td align="center"></td>
					<td align="center"></td>
				</c:when>
				<c:otherwise>
					<td id="${overallAssessment.threatSumOverallId}_SO_JF_TD">${overallAssessment.overallThreat}</td>
					<td id="${overallAssessment.threatSumOverallId}_SO_RT_TD"><span class="${overallAssessment.threatRating.cssClass}">${overallAssessment.threatRating.threatRatingName}</span></td>
				</c:otherwise>
			</c:choose>
		</tr>
	</c:forEach>
	</tbody>
</table>
