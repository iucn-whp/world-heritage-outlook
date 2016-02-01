<%@include file="/init_import.jsp" %>


<%
List<potential_project_needs> lstpotential_project =null;

try
{ 
	
	long assesmentVersionId=Long.parseLong(request.getAttribute("versionId").toString());

 	lstpotential_project=potential_project_needsLocalServiceUtil.getpotential_projectsByVersion(assesmentVersionId);
 

/*  	lstpotential_project.get(0).getPpn_id();
 	lstpotential_project.get(0).getOrganization_individual();
 	lstpotential_project.get(0).getDescription();
 	lstpotential_project.get(0).getContact_details(); */
	
	
}catch(Exception e)
{
	e.printStackTrace();
}



%>
<c:set var="UpdateUrl" value="/assessment_jsp/popup/site8_compillation_of_potential.jsp"/>
<c:set var="RefreshUrl" value="/assessment_jsp/innerJsp/step8_coppn.jsp"/>
<c:set var="currentDiv" value="coppDiv"/> 
<table class="tab_data" cellpadding="0" cellspacing="0">
<tbody>
<tr>
<th class="number">No.</th>
<th class="OrganisationIndividuals">Organisation / individuals</th>
<th>Brief Description of Active Projects</th>
<th>Contact details </th>
<th class="editIcons hideAdminAction">Edit / Delete</th>
</tr>

<%
if(lstpotential_project.isEmpty())
{
	%>
	<tr>
	<td colspan=5 align="center"><span class="blankCellStyle">Add Compilation of potential project needs</span></td>
	
	
	</tr>
	<script>
	$("#step8").removeClass('aui-state-complete');
	</script>	<%
	
}%>
<script>
	$("#step8").addClass('aui-state-complete');
	</script>
 <c:forEach items="<%=lstpotential_project %>" var="potential_project" varStatus="status">
 <c:set var="count" value="${count + 1}" scope="page"/>		
<tr id="${potential_project.getOrganization_individual()}_TR2" >
<td><c:out value="${count}"/></td>
<td id="${potential_project.getOrganization_individual()}OI_TD2"><c:out value="${potential_project.getOrganization_individual()}" /></td>
<td id="${potential_project.getOrganization_individual()}OD_TD2"><c:out value="${potential_project.getDescription()}" /></td>
<td id="${potential_project.getOrganization_individual()}OC_TD2"><c:out value="${potential_project.getContact_details()}" /></td>
<td class="editIcons hideAdminAction">
<div class="editDelete">
<a href="#" onclick="javascript:dynamicPopup('${UpdateUrl}','${potential_project.getPpn_id()}','potential project needs',event); return false;" class="edit">edit</a>
<a href="javascript:deletePopup('${RefreshUrl}','${currentDiv}','${potential_project.getPpn_id()}','potential project needs');" class="delete">delete</a>
</div>
</td>
</tr>
</c:forEach>  
</tbody>
</table>