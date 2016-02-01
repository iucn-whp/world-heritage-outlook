<%@include file="/init_import.jsp" %>
<%
List<active_conservation_projects> lstactive_projects =null;

try
{ 
	
	long assesmentVersionId=Long.parseLong(request.getAttribute("versionId").toString());
	lstactive_projects=active_conservation_projectsLocalServiceUtil.getactive_conservation_projectsByVersion(assesmentVersionId);
	
	 
}catch(Exception e)
{
	e.printStackTrace();
}

%>
<c:set var="UpdateUrl" value="/assessment_jsp/popup/site8_compillation_of_active.jsp"/>
<c:set var="RefreshUrl" value="/assessment_jsp/innerJsp/step8_coac.jsp"/>
<c:set var="currentDiv" value="coacDiv"/> 

<table class="tab_data" cellpadding="0" cellspacing="0">
<tbody>
<tr>
<th class="number">No.</th>
<th class="OrganisationIndividuals">Organisation / individuals</th>
<th class="briefdiscription">Brief Description of Active Projects</th>
<th class="contactdetail">Contact details </th>
<th class="editIcons hideAdminAction">Edit / Delete</th>
</tr>
<%
if(lstactive_projects.isEmpty())
{
	%>
	<tr>
	<td colspan=5 align="center"><span class="blankCellStyle">Add Compilation Of Active Conservation Projects And Project Needs</span></td>
	
	
	</tr>
	<script>
	$("#step8").removeClass('aui-state-complete');
	</script>	<%
	
}%>
 <c:forEach items="<%=lstactive_projects %>" var="activeconservation" varStatus="status">		
	<c:set var="count" value="${count + 1}" scope="page"/>			
<tr id="${activeconservation.getOrganization_individual()}_TR" >
<td><c:out value="${count}"/></td>
<td id="${activeconservation.getOrganization_individual()}OI_TD"><c:out value="${activeconservation.getOrganization_individual()}" /></td>
<td id="${activeconservation.getOrganization_individual()}OD_TD"><c:out value="${activeconservation.getDescription()}" /></td>
<td id="${activeconservation.getOrganization_individual()}OC_TD"><c:out value="${activeconservation.getContact_details()}" /></td>
<td class="editIcons hideAdminAction">
<div class="editDelete">
<a href="#" onclick="javascript:dynamicPopup('${UpdateUrl}','${activeconservation.getAcpid()}','Conservation Projects Needs',event); return false;" class="edit">edit</a>
<a href="javascript:deletePopup('${RefreshUrl}','${currentDiv}','${activeconservation.getAcpid()}','Conservation Projects Needs');" class="delete">delete</a>
</div>
</td>
</tr>
</c:forEach> 

</tbody></table>