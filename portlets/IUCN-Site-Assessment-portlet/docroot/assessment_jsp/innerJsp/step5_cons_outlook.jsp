<%@page import="com.iucn.whp.dto.AssessmentValueCssClass"%>
<%@page import="com.iucn.whp.dto.Conservationoutlook"%>
<%@include file="/init_import.jsp" %>


<%

long assessmentVersionId=0;

List<conservation_outlook>  lstconservation_out =null;
List<conservation_outlook_rating_lkp> lstconservation_outlook_rating_lkp =null;
List<Conservationoutlook> lstclassconservationoutlook =new ArrayList<Conservationoutlook>();
AssessmentValueCssClass threatRating = new AssessmentValueCssClass();


try
{ 
	
	long assesmentVersionId=Long.parseLong(request.getAttribute("versionId").toString());

	
	lstconservation_out = conservation_outlookLocalServiceUtil.getconservationOutllokByVersion(assesmentVersionId);
	
	for(conservation_outlook   conservation_out :lstconservation_out)
	{
		Conservationoutlook  Conservationoutlookobj= new Conservationoutlook();
		
		Conservationoutlookobj.setConservationoutlook(conservation_out);
		threatRating.setCssClass(conservation_out.getRating());
		Conservationoutlookobj.setConservationoutlookrating(conservation_outlook_rating_lkpLocalServiceUtil.getconservation_outlook_rating_lkp(conservation_out.getRating()));
	
		lstclassconservationoutlook.add(Conservationoutlookobj);
	}
	

}catch(Exception e)
{
	e.printStackTrace();
}




%>

<c:set var="UpdateUrl" value="/assessment_jsp/popup/step5_cons_outlook_pop.jsp"/>
 <c:set var="currentDiv" value="step5Div"/> 
 
 
<table class="tab_data" cellpadding="0" cellspacing="0">
<tbody>
<tr>
<th class="topics">Topics</th>
<th class="justificationOfassessment">Justification Of Assessment	</th>
<th style="width:120px;" class="ssessment">Assessment </th>
<th class="editIcons hideAdminAction">Edit</th>
</tr>

				
<tr>
<td>Assessment of Conservation Outlook </td>
<% if(lstclassconservationoutlook.isEmpty()){ %>
<td>n.a.</td>
<td>n.a.</td>

<td class="editIcons hideAdminAction">
<div class="editDelete">
<a href="#" onclick="javascript:dynamicPopup('${UpdateUrl}','','Assessment of Conservation Outlook',event); return false;" class="edit">edit</a>
</div>
</td>
<%} %>
 <c:forEach items="<%=lstclassconservationoutlook %>" var="conservationout" varStatus="status">		

<td id="${conservationout.getConservationoutlook().getConservation_outlook_id()}_JF_TD">${conservationout.getConservationoutlook().getJustification()}</td>
<td id="${conservationout.getConservationoutlook().getConservation_outlook_id()}_RT_TD"><span class ="<%=threatRating.getCssClass() %>">${conservationout.getConservationoutlookrating().getCo_rating()}</span></td>

<td class="editIcons hideAdminAction">
<div class="editDelete">
<a href="#" onclick="javascript:dynamicPopup('${UpdateUrl}','${conservationout.getConservationoutlook().getConservation_outlook_id()}','Assessment of Conservation Outlook',event); return false;" class="edit">edit</a>
</div>
</td>
</c:forEach> 

</tr>

</tbody>
</table>