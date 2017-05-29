<%@include file="/init.jsp" %>

<c:set value="${assessment.conservationOutlookDTO.summaryOfAssessmentsDTO}" var="summaryOfAssessment"/>

<table class="tab_data" cellpadding="0" cellspacing="0">
	<tbody>
		<tr>
			<th class="topics">Topics</th>
			<th class="justificationOfassessment">Justification Of Assessment</th>
			<th style="width:120px;" class="assessment">Assessment</th>
		</tr>
		<tr>
			<td>Current State Trend of World Heritage values</td>
			<c:choose>
				<c:when test="${summaryOfAssessment.currentStateTrendWhId ne null && summaryOfAssessment.currentStateTrendWhId gt 0}">
					<td id="${summaryOfAssessment.currentStateTrendWhId}ST_WHV_JS_TD">${summaryOfAssessment.currentStateTrendWhJustification}</td>
					<td id="${summaryOfAssessment.currentStateTrendWhId}ST_WHV_AS_TD">
						<span class="${summaryOfAssessment.currentStateTrendWhRating.cssClass}">${summaryOfAssessment.currentStateTrendWhRating.threatRatingName}</span>
					</td>
				</c:when>
				<c:otherwise>
					<td></td>
					<td></td>
				</c:otherwise>
			</c:choose>
		</tr>
		<tr>
			<td>Current state and trend of other important biodiversity	values (if applicable)</td>
			<c:choose>
				<c:when test="${summaryOfAssessment.currentStateTrendBioId ne null && summaryOfAssessment.currentStateTrendBioId gt 0}">
					<td id="${summaryOfAssessment.currentStateTrendBioId}ST_BV_JS_TD">${summaryOfAssessment.currentStateTrendBioJustification}</td>
					<td id="${summaryOfAssessment.currentStateTrendBioId}ST_BV_AS_TD">
						<span class="${summaryOfAssessment.currentStateTrendBioRating.cssClass}">${summaryOfAssessment.currentStateTrendBioRating.threatRatingName}</span>
					</td>
				</c:when>
				<c:otherwise>
					<td></td>
					<td></td>
				</c:otherwise>
			</c:choose>
		</tr>
		<tr>
			<td>Current threats</td>
			<c:choose>
				<c:when test="${summaryOfAssessment.currentThreatsId ne null && summaryOfAssessment.currentThreatsId gt 0}">
					<td id="${summaryOfAssessment.currentThreatsId}TSC_JS_TD">${summaryOfAssessment.currentThreatsJustification}</td>
					<td id="${summaryOfAssessment.currentThreatsId}TSC_AS_TD">
						<span class="${summaryOfAssessment.currentThreatsRating.cssClass}">${summaryOfAssessment.currentThreatsRating.threatRatingName}</span>
					</td>
				</c:when>
				<c:otherwise>
					<td></td>
					<td></td>
				</c:otherwise>
			</c:choose>
		</tr>
		<tr>
			<td>Potential threats</td>
			<c:choose>
				<c:when test="${summaryOfAssessment.potentialThreatsId ne null && summaryOfAssessment.potentialThreatsId gt 0}">
					<td id="${summaryOfAssessment.potentialThreatsId}TSP_JS_TD">${summaryOfAssessment.potentialThreatsJustification}</td>
					<td id="${summaryOfAssessment.potentialThreatsId}TSP_AS_TD">
						<span class="${summaryOfAssessment.potentialThreatsRating.cssClass}">${summaryOfAssessment.potentialThreatsRating.threatRatingName}</span>
					</td>
				</c:when>
				<c:otherwise>
					<td></td>
					<td></td>
				</c:otherwise>
			</c:choose>
		</tr>
		<tr>
			<td>Overall threats</td>
			<c:choose>
				<c:when test="${summaryOfAssessment.overallThreatsId ne null && summaryOfAssessment.overallThreatsId gt 0}">
					<td id="${summaryOfAssessment.overallThreatsId}TSO_JS_TD">${summaryOfAssessment.overallThreatsJustification}</td>
					<td id="${summaryOfAssessment.overallThreatsId}TSO_AS_TD">
						<span class="${summaryOfAssessment.overallThreatsRating.cssClass}">${summaryOfAssessment.overallThreatsRating.threatRatingName}</span>
					</td>
				</c:when>
				<c:otherwise>
					<td></td>
					<td></td>
				</c:otherwise>
			</c:choose>
		</tr>
		<tr>
			<td>Effectiveness of protection and management in addressing threats outside the site</td>
			<c:choose>
				<c:when test="${summaryOfAssessment.effectiveProtectionAndManagementId ne null && summaryOfAssessment.effectiveProtectionAndManagementId gt 0}">
					<td id="${summaryOfAssessment.effectiveProtectionAndManagementId}EMP_JS_TD">${summaryOfAssessment.effectiveProtectionAndManagementJustification}</td>
					<td id="${summaryOfAssessment.effectiveProtectionAndManagementId}EPM_RA_TD">
						<span class="${summaryOfAssessment.effectiveProtectionAndManagementRating.cssClass}">${summaryOfAssessment.effectiveProtectionAndManagementRating.threatRatingName}</span>
					</td>
				</c:when>
				<c:otherwise>
					<td></td>
					<td></td>
				</c:otherwise>
			</c:choose>
		</tr>
		<tr>
			<td>Overall protection and management</td>
			<c:choose>
				<c:when test="${summaryOfAssessment.protectionAndManagementId ne null && summaryOfAssessment.protectionAndManagementId gt 0}">
					<td id="${summaryOfAssessment.protectionAndManagementId}PMOA_JS_TD">${summaryOfAssessment.protectionAndManagementJustification}</td>
					<td id="${summaryOfAssessment.protectionAndManagementId}PMOA_RA_TD">
						<span class="${summaryOfAssessment.protectionAndManagementRating.cssClass}">${summaryOfAssessment.protectionAndManagementRating.threatRatingName}</span>
					</td>
				</c:when>
				<c:otherwise>
					<td></td>
					<td></td>
				</c:otherwise>
			</c:choose>
		</tr>
	</tbody>
</table>