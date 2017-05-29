<%@include file="/init_import.jsp" %>

<%
List<biodiversity_values> lstbioValues=null;
long assesmentVersionId=0;
try{
	assesmentVersionId=Long.parseLong(request.getAttribute("versionId").toString());
	lstbioValues = site_assessmentLocalServiceUtil.getBiodiversityValuesByVersion(assesmentVersionId);
	Collections.sort(lstbioValues);
}catch(Exception ex){
	
}
%>

<portlet:actionURL name="deleteCurrentRecordFromWhValues" var="deleteRecord"/>
<c:set var="UpdateUrl" value="/assessment_jsp/popup/site1_bio_popup.jsp"/>
<c:set var="RefreshUrl" value="/assessment_jsp/innerJsp/step1_oib.jsp"/>
<c:set var="currentDiv" value="oibDiv"/> 
<c:set var="DeleteUrl" value="<%=deleteRecord %>"/>
<c:set var="versionId" value="<%=assesmentVersionId %>"/>


<table class="tab_data"  cellpadding="0" cellspacing="0">
<tbody>

<tr>
	<th class="number">No.</th>
	<th class="values">Values</th>
	<th class="description">Description</th>
	<th class="editIcons hideAdminAction">Edit / Delete</th>
</tr>

<% 
if(lstbioValues.size()==0){
	%>
	<tr>
	<td colspan=4 style="text-align:center"><span class="blankCellStyle">Add Other Important Biodiversity Values</span></td>
	
	</tr>	<%
}
%>

<c:forEach items="<%=lstbioValues%>" var="bioValues" varStatus="status">		
				
<tr id="${bioValues.getId()}_BD_TR">
	<td class="dataHeading" style="width:20px;"><c:out value="${status.count}" /></td>
	<td class="dataHeading" id="${bioValues.getId()}_BWH_TD"><c:out value="${bioValues.getValue()}" /></td>
	<td id="${bioValues.getId()}_BD_TR">
		<span colspan="3" id="${bioValues.getId()}_BDS_TD"><c:out value="${bioValues.getDescription()}" /></span>
	</td>
	<td class="dataHeading editIcons hideAdminAction" style="width: 80px;">
		<div class="editDelete">
		<a href="#" onclick="javascript:dynamicPopup('${UpdateUrl}','${bioValues.getId()}','Other Important Biodiversity Values',event); return false;" class="edit">edit</a>
		<a href="javascript:validateDelete('${versionId}','${RefreshUrl}','${currentDiv}','${bioValues.getId()}','bioValue');" class="delete">delete</a>
		</div>
	</td>
</tr>

</c:forEach> 
</tbody>
</table>

