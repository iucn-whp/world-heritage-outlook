<%@ include file="/init.jsp" %>

<%
active_conservation_projects  active_conservation = new active_conservation_projectsClp();
long assessmentVersionId=0;

try {
	String selectedPkey = request.getParameter("keyVal");
	assessmentVersionId = Long.parseLong(request.getParameter("versionIdVal"));
	if (selectedPkey != null && !selectedPkey.isEmpty()) {
		active_conservation = active_conservation_projectsLocalServiceUtil.getactive_conservation_projects(Long.parseLong(selectedPkey));
	} else {
		active_conservation.setDescription("");
		active_conservation.setContact_details("");
		active_conservation.setOrganization_individual("");
		active_conservation.setAssessment_version_id(assessmentVersionId);
		active_conservation.setAcpid(0);
		active_conservation.setProjectDurationFrom("");
		active_conservation.setProjectDurationTo("");
	}
} catch (Exception ex) {
}
%>

<portlet:defineObjects /> 
<portlet:actionURL name="compilationActiveconver" var="step8" />
    
<c:set var="versionId" value="<%= assessmentVersionId %>"/>
<c:set var="UpdateUrl" value="<%=step8 %>"/>
<c:set var="RefreshUrl" value="/assessment_jsp/innerJsp/step8_coac.jsp"/>
<c:set var="activeConservation" value="<%=active_conservation %>"/>

<aui:form id="step8Form" name="step8Form" action="" method="post" >
	<table class="formBlock">
		<aui:input name="acpid" id="acpid" value="<%= active_conservation.getAcpid() %>" type="hidden" />
		<aui:input name="assessmentVersionId" id="assessmentVersionId" value="<%= assessmentVersionId %>" type="hidden" />

		<tr>
			<td class="lblTD">
				<label class="popuplbl">Organisation: </label>
			</td>
			<td>
				<aui:input type="text" label=""	id="organisation" name="organisation" value="<%=active_conservation.getOrganization_individual() %>" style="width:440px;"/>
			</td>
		</tr>
		<tr>
			<td class="lblTD">
				<label class="popuplbl">Project duration: </label>
			</td>
			<td>
				<div>
					<label class="popuplbl">From:&nbsp;&nbsp;</label>
					<aui:select label="" id="projectDurationFrom" name="projectDurationFrom" cssClass="negative-factors-table">
						<aui:option value=""></aui:option>
						<c:forEach var="from" begin="2009" end="2030" step="1">
							<aui:option selected="${activeConservation.projectDurationFrom eq from}"
										value="${from}">${from}</aui:option>
						</c:forEach>
					</aui:select>
					<label class="popuplbl">To:&nbsp;&nbsp;</label>
					<aui:select label="" id="projectDurationTo" name="projectDurationTo" cssClass="negative-factors-table">
						<aui:option value=""></aui:option>
						<c:forEach var="to" begin="2009" end="2030" step="1">
							<aui:option selected="${activeConservation.projectDurationTo eq to}"
										value="${to}">${to}</aui:option>
						</c:forEach>
					</aui:select>
				</div>
			</td>
		</tr>
		<tr>
			<td class="lblTD">
				<label class="popuplbl"> Brief Description: </label>
			</td>
			<td spellcheck="true" class="valueTD">
				<aui:input type="textarea" label=""	id="description" name="description"	value="<%=active_conservation.getDescription() %>" />
			</td>
		</tr>
		<tr>
			<td class="lblTD">
				<label class="popuplbl">contact Detail: </label>
			</td>

			<td spellcheck="true" class="valueTD">
				<aui:input type="textarea" label=""	id="contact" name="contact" value="<%=active_conservation.getContact_details() %>" />
			</td>
		</tr>
		<tr>
			<td class="btnTD" colspan="2">
				<aui:button type="button" value="Submit" onclick="javascript:validatestep8Form();"/>
				<aui:button name="cancelButton" type="button" value="Cancel" onclick="javascript:top.document.getElementById('closethick').click();"/>
			</td>
		</tr>
	</table>
</aui:form>

<script>

function validatestep8Form(){
	var isValid = true;
	var organisation = $('#<portlet:namespace/>organisation').val();
	var description = $('#<portlet:namespace/>description').val();
	var projectDurationFrom = $('#<portlet:namespace/>projectDurationFrom').val();
	var projectDurationTo = $('#<portlet:namespace/>projectDurationTo').val();

	if(organisation==""){
		isValid =false;
		alert("Organisation is required.");
	}
	else if(description==""){
		isValid =false;
		alert("Description is required.");
	}
	else if ((projectDurationFrom !== '' && projectDurationTo !== '')
			&& parseInt(projectDurationFrom) > parseInt(projectDurationTo)) {

		isValid = false;
		alert("Start Date can't be more than the End Date.");
	}
	
	if(isValid) {
		$("input[type=button]").attr("disabled", "disabled");
       	submitPopupForm('${versionId }','${RefreshUrl}','coacDiv','step8Form','${UpdateUrl }',8);
	}
}
</script>