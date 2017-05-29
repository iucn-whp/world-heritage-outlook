<%@include file="../../init.jsp" %>

<%--<c:set var="UpdateUrl" value="/assessment_jsp/popup/site8_compillation_of_potential.jsp"/>--%>
<%--<c:set var="RefreshUrl" value="/assessment_jsp/innerJsp/step8_coppn.jsp"/>--%>
<%--<c:set var="currentDiv" value="coppDiv"/>--%>

<table class="tab_data" cellpadding="0" cellspacing="0">
	<tbody>
	<tr>
		<th class="number">No.</th>
		<th>Brief description of potential site needs</th>
	</tr>

	<c:forEach items="${assessment.projectsDTO.potentialProjectsNeedsDTOList}" var="potentialProjectsNeeds" varStatus="status">
		<tr id="${potentialProjectsNeeds.ppnId}_TR2">
			<td><c:out value="${status.count}"/></td>
			<td id="${potentialProjectsNeeds.ppnId}OD_TD2"><c:out value="${potentialProjectsNeeds.description}"/></td>
		</tr>
	</c:forEach>

	</tbody>
</table>
