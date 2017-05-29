<%@ include file="/init.jsp" %>

<%
	long assessmentVersionId = 0;
	potential_project_needs  potential_project = new potential_project_needsClp();

	try {
		String selectedPkey = request.getParameter("keyVal");
		assessmentVersionId = Long.parseLong(request.getParameter("versionIdVal"));

		if (selectedPkey != null && !selectedPkey.isEmpty()) {
			potential_project = potential_project_needsLocalServiceUtil.getpotential_project_needs(Long.parseLong(selectedPkey));
		} else {
			potential_project.setContact_details("");
			potential_project.setDescription("");
			potential_project.setOrganization_individual("");
			potential_project.setAssessment_version_id(assessmentVersionId);
			potential_project.setPpn_id(0);
			potential_project.setProjectDurationFrom("");
			potential_project.setProjectDurationTo("");
		}
	} catch (Exception ex) {
		out.println("Ex------------" + ex.getMessage());
	}
%>


<portlet:defineObjects /> 
<portlet:actionURL name="compilationofpotentialpro" var="step8" />
    
<c:set var="versionid2" value="<%= assessmentVersionId %>"/>
<c:set var="UpdateUrl" value="<%=step8 %>"/>
<c:set var="RefreshUrl" value="/assessment_jsp/innerJsp/step8_coppn.jsp"/>
<c:set var="potentialProject" value="<%= potential_project%>"/>

<aui:form id="step8Form2" name="step8Form2" action="" method="post" >

	<table class="formBlock">
		<aui:input name="ppnid" id="ppnid" value="<%=potential_project.getPpn_id() %>" type="hidden" />
		<aui:input name="assessmentVersionId" id="assessmentVersionId"	value="<%= assessmentVersionId %>" type="hidden" />

		<tr>
			<td class="lblTD">
				<label class="popuplbl">Site need title: </label>
			</td>
			<td>
				<aui:input type="text" label="" id="organisation" name="organisation" value="<%=potential_project.getOrganization_individual() %>" style="width:440px;"/>
			</td>
		</tr>
		<tr>
			<td class="lblTD">
				<label class="popuplbl">Support needed for following years: </label>
			</td>
			<td>
				<div>
					<label class="popuplbl">From:&nbsp;&nbsp;</label>
					<aui:select label="" id="projectDurationFrom" name="projectDurationFrom" cssClass="negative-factors-table">
						<aui:option value=""></aui:option>
						<c:forEach var="from" begin="2009" end="2030" step="1">
							<aui:option selected="${potentialProject.projectDurationFrom eq from}" value="${from}">${from}</aui:option>
						</c:forEach>
					</aui:select>
					<label class="popuplbl">To:&nbsp;&nbsp;</label>
					<aui:select label="" id="projectDurationTo" name="projectDurationTo" cssClass="negative-factors-table">
						<aui:option value=""></aui:option>
						<c:forEach var="to" begin="2009" end="2030" step="1">
							<aui:option selected="${potentialProject.projectDurationTo eq to}" value="${to}">${to}</aui:option>
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
				<aui:input type="textarea" label="" id="description" name="description" value="<%=potential_project.getDescription() %>" />
			</td>
		</tr>
		<tr>
			<td class="lblTD">
				<label class="popuplbl"> Contact Detail: </label>
			</td>

			<td spellcheck="true" class="valueTD">
				<aui:input type="textarea" label="" id="contactdetail" name="contactdetail" value="<%=potential_project.getContact_details() %>" />
			</td>
		</tr>

		<tr>
			<td class="btnTD" colspan="2">
				<aui:button type="button" value="Submit" onclick="javascript:validatestep8bForm();"/>
				<aui:button name="cancelButton" type="button" value="Cancel" onclick="javascript:top.document.getElementById('closethick').click();"/>
			</td>
		</tr>
	</table>
</aui:form>


<script>
	function validatestep8bForm() {
		var isValid = true;
		var organisation = $('#<portlet:namespace/>organisation').val();
		var description = $('#<portlet:namespace/>description').val();
		var contactdetail = $('#<portlet:namespace/>contactdetail').val();
		var projectDurationFrom = $('#<portlet:namespace/>projectDurationFrom').val();
		var projectDurationTo = $('#<portlet:namespace/>projectDurationTo').val();

		if (organisation == "") {
			isValid = false;
			alert("Site need title is required.");
		}
		/*
		else if (description == "") {
			isValid = false;
			alert("Description is required.");
		}
		*/if ((projectDurationFrom !== '' && projectDurationTo !== '')
				&& parseInt(projectDurationFrom) > parseInt(projectDurationTo)) {
			isValid = false;
			alert("Start Date can't be more than the End Date.");
		}

		/* else if(contactdetail=="")
		 {
		 isValid =false;
		 alert("Contact is required.");
		 } */

		if (isValid) {
			$("input[type=button]").attr("disabled", "disabled");
			submitPopupForm('${versionid2 }', '${RefreshUrl}', 'coppDiv', 'step8Form2', '${UpdateUrl }', 8);
		}
	}
</script>