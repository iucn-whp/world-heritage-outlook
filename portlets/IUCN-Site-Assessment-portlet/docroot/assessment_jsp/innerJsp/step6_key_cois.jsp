<%@page import="com.iucn.whp.dto.KeyconservationIssue"%>
<%@page import="com.iucn.whp.dto.SiteAssessmentValues"%>
<%@include file="/init_import.jsp" %>

<%
List<key_conservation_issues> lstKey_conservationIssues=null;
List<KeyconservationIssue> lstclassKeyconservation=new ArrayList<KeyconservationIssue>()	;
List<key_conservation_scale_lkp> lstKeyconservationscale=null;
try
{ 
	int i=1;
	long assesmentVersionId=Long.parseLong(request.getAttribute("versionId").toString());
	
	lstKey_conservationIssues=key_conservation_issuesLocalServiceUtil.getkey_conversionissueByVersion(assesmentVersionId);
	
	Collections.sort(lstKey_conservationIssues);
	for(key_conservation_issues key_conservationIssues :lstKey_conservationIssues)
	{
		KeyconservationIssue  keyconservationIssueobj = new KeyconservationIssue();
		
		keyconservationIssueobj.setKey_conservation(key_conservationIssues);
		 if(key_conservationIssues.getScale()>0)
		keyconservationIssueobj.setKey_conserrvation_scale(
				key_conservation_scale_lkpLocalServiceUtil.getkey_conservation_scale_lkp(key_conservationIssues.getScale()));
		else
			keyconservationIssueobj.setKey_conserrvation_scale(null); 
	
		/* 	keyconservationIssueobj.setKey_conserrvation_scale(key_conservation_scale_lkpLocalServiceUtil.getkey_conservation_scale_lkp(key_conservationIssues.getScale())); */
		
		
		keyconservationIssueobj.setCount(i);
		i++;
		
		lstclassKeyconservation.add(keyconservationIssueobj);
	}

	
	
	
	
 }catch(Exception e)
{
	e.printStackTrace();
}


%>

<c:set var="UpdateUrl" value="/assessment_jsp/popup/site6_keyconservation_issue_pop.jsp"/>
<c:set var="RefreshUrl" value="/assessment_jsp/innerJsp/step6_key_cois.jsp"/>
 <c:set var="currentDiv" value="step6Div"/> 


<table class="tab_data" cellpadding="0" cellspacing="0">
<tbody>
<tr>
<th class="number">No.</th>
<th class="Keyconservationissue">Key Conservation Issue</th>
<th class="Description">Description</th>
<th class="Scale">Scale </th>
<th class="editIcons hideAdminAction">Edit / Delete</th>
</tr>
<%
if(lstclassKeyconservation.isEmpty())
{
	%>
	<tr>
	<td colspan=5 align="center"><span class="blankCellStyle">Add Key Conservation Issues</span></td>
	
	
	</tr><script>
	$("#step6").removeClass('aui-state-complete');
	</script>	<%
	
}%>
<script>
	$("#step6").addClass('aui-state-complete');
	</script>

 <c:forEach items="<%=lstclassKeyconservation %>" var="keyconservation" varStatus="status">		
				
<tr id="${keyconservation.getKey_conservation().getKey_conservation_issues()}_TR">
<td><c:out value="${keyconservation.getCount()}" /> </td>
<td id="${keyconservation.getKey_conservation().getKey_conservation_issues()}_CO_TD"><c:out value="${keyconservation.getKey_conservation().getKey_conservation_issues()}" /></td>
<td id="${keyconservation.getKey_conservation().getKey_conservation_issues()}_DS_TD"><c:out value="${keyconservation.getKey_conservation().getDescription()}" /></td>
<td id="${keyconservation.getKey_conservation().getKey_conservation_issues()}_SC_TD"><c:out value="${ keyconservation.getKey_conserrvation_scale() eq null ? '' : keyconservation.getKey_conserrvation_scale().getScale()  }" /></td>

<td class="editIcons hideAdminAction">
<div class="editDelete">
<a href="#" onclick="javascript:dynamicPopup('${UpdateUrl}','${keyconservation.getKey_conservation().getKey_conservation_issues_id()}','Key Conservation Issues..',event); return false;" class="edit">edit</a>
<a href="#" onclick="javascript:deletePopup('${RefreshUrl}','${currentDiv}','${keyconservation.getKey_conservation().getKey_conservation_issues_id()}','Key Conservation Issues',event); return false;" class="delete">delete</a>
</div>
</td>
</tr>
</c:forEach> 
</tbody>
</table>


