<%@include file="/init_import.jsp" %>
<%
List<references> whpreferences=null;


try
{
	//long siteid=Long.parseLong(request.getAttribute("siteId").toString());
	long assesment_version_id=Long.parseLong(request.getAttribute("versionId").toString());
	whpreferences=referencesLocalServiceUtil.findByAssessmentId(assesment_version_id);
	Collections.sort(whpreferences);
	
	
}catch(Exception ex){
	ex.printStackTrace();
}

%>

<c:set var="UpdateUrl" value="/assessment_jsp/popup/editstep9_reference.jsp"/>
<c:set var="RefreshUrl" value="/assessment_jsp/innerJsp/step9_references.jsp"/>
<c:set var="currentDiv" value="step9Div"/> 


<table class="tab_data" cellpadding="0" cellspacing="0">
<tbody>
<tr>

<th class="number">Rn<sup>0</sup></th>
<th>References</th>
<th class="editIcons hideAdminAction"> Edit / Delete</th>
</tr>


<%
if(whpreferences.isEmpty())
{
	%>
	<tr>
	<td colspan=3 align="center"><span class="blankCellStyle">Add References </span></td>
	
	
	</tr>	
	<script>
	$("#step9").removeClass('aui-state-complete');
	</script>
	<%
}%>

	<script>
	$("#step9").addClass('aui-state-complete');
	</script>

<c:forEach items="<%=whpreferences %>" var="whpreferencesObj" varStatus="status">		
<c:set var="count" value="${count + 1}" scope="page"/>		
<tr id="${whpreferencesObj.getReference_id()}_TR">
<td><c:out value="${count}"/></td>
<%-- <td  id="${whpreferencesObj.getReference_id()}_RN_TD" ><c:out value="${whpreferencesObj.getRn()}" /></td>
 --%>
 <td id="${whpreferencesObj.getReference_id()}_GR_TD"><c:out value="${whpreferencesObj.getReferences()}" /></td>

<td class="editIcons hideAdminAction">
<div class="editDelete">

<a href="#" onclick="javascript:dynamicPopup('${UpdateUrl}','${whpreferencesObj.getReference_id()}','References',event); return false;" class="edit">edit</a>
<a href="javascript:deletePopup('${RefreshUrl}','${currentDiv}','${whpreferencesObj.getReference_id()}','References');" class="delete">delete</a>
</div>
</td>
</tr>
		
</c:forEach>
 
</tbody>
</table>




