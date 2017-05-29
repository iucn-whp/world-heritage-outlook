<%@include file="../../init.jsp" %>

<%--<c:set var="UpdateUrl" value="/assessment_jsp/popup/site8_compillation_of_active.jsp"/>--%>
<%--<c:set var="RefreshUrl" value="/assessment_jsp/innerJsp/step8_coac.jsp"/>--%>
<%--<c:set var="currentDiv" value="coacDiv"/>--%>

<table class="tab_data" cellpadding="0" cellspacing="0">
	<tbody>
	<tr>
		<th class="number">No.</th>
		<th class="OrganisationIndividuals">Organisation / individuals</th>
		<th style="width: 100px">Project duration</th>
		<th class="briefdiscription">Brief Description of Active Projects</th>
		<th class="contactdetail">Contact details</th>
	</tr>

	<c:forEach items="${assessment.projectsDTO.conservationProjectDTOList}" var="conservationProject" varStatus="status">
		<tr id="${conservationProject.conservationId}_TR">
			<td><c:out value="${status.count}"/></td>
			<td id="${conservationProject.conservationId}OI_TD"><c:out value="${conservationProject.organizationIndividual}"/></td>
			<td id="${conservationProject.conservationId}OI_TD"><c:out value="${conservationProject.projectDurationFrom} - ${conservationProject.projectDurationTo}"/></td>
			<td id="${conservationProject.conservationId}OD_TD"><c:out value="${conservationProject.conservationDescription}"/></td>
			<td id="${conservationProject.conservationId}OC_TD"><c:out value="${conservationProject.conservationDetails}"/></td>
		</tr>
	</c:forEach>

	</tbody>
</table>