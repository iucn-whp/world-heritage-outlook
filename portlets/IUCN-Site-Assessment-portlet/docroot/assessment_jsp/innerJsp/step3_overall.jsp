<%@page import="com.iucn.whp.dto.AssessmentValueCssClass"%>
<%@include file="/init_import.jsp" %>


<%
	AssessmentValueCssClass threatRating = new AssessmentValueCssClass();
  	long assessmentVersionId=1;
	Map<Long,String> ratingMap=new HashMap<Long,String>();
    effective_prot_mgmt_iothreats objeffective_prot_mgmt_iothreats=null;
    prot_mgmt_overall objoverall=null;
    prot_mgmt_best_practices objbest_practices=null;

 try
{ 
	 
	//assessmentVersionId=Long.parseLong(request.getAttribute("versionId").toString());
	List<protection_management_ratings_lkp> protection_management_ratings_lkpList=protection_management_ratings_lkpLocalServiceUtil.findAll();
	System.out.println("test-"+request.getAttribute("versionId"));
	assessmentVersionId=Long.parseLong(request.getAttribute("versionId").toString());
	ratingMap.put(0l,"");
	    for(protection_management_ratings_lkp protection_management_ratings_lkptemp : protection_management_ratings_lkpList)
	{
		ratingMap.put(protection_management_ratings_lkptemp.getId(),protection_management_ratings_lkptemp.getPm_rating());
	}
	
	
 List<effective_prot_mgmt_iothreats> effective_prot_mgmt_iothreatsList=effective_prot_mgmt_iothreatsLocalServiceUtil.geteffectivemanagthreatByVersion(assessmentVersionId);
	 if(effective_prot_mgmt_iothreatsList!=null && effective_prot_mgmt_iothreatsList.size()>0)
	    objeffective_prot_mgmt_iothreats=effective_prot_mgmt_iothreatsList.get(0);
	
 List<prot_mgmt_overall> prot_overallList = prot_mgmt_overallLocalServiceUtil.getprotmgmtoverallByVersion(assessmentVersionId);
	 if(prot_overallList!=null && prot_overallList.size()>0)
		objoverall=prot_overallList.get(0);
	
 List<prot_mgmt_best_practices> prot_best_practicelList = prot_mgmt_best_practicesLocalServiceUtil.getBestpractEntriesByAssessmentId(assessmentVersionId);
	 if(prot_best_practicelList!=null && prot_best_practicelList.size()>0)
		 objbest_practices=prot_best_practicelList.get(0);
	
	 
		
	
	
}catch(Exception e)
{
	e.printStackTrace();
}


 

%>

<%-- <c:set var="UpdateUrl" value="/assessment_jsp/popup/step5_cons_outlook_pop.jsp"/>
 <c:set var="currentDiv" value="step5Div"/> 
  --%>
 
<table class="tab_data" cellpadding="0" cellspacing="0">
<tbody>
<tr>
<th class="topics">Topics</th>
<th class="justificationOfassessment">Justification Of Assessment	</th>
<th class="assessment">Assessment </th>
<th class="editIcons hideAdminAction">Edit</th>
</tr>

				
<tr>
<td>Assessment of the effectiveness of protection and management  in addressing threats outside the site </td>
<%
if(objeffective_prot_mgmt_iothreats!=null){
	long rating =objeffective_prot_mgmt_iothreats.getRating();
	String assessment =  ratingMap.get(objeffective_prot_mgmt_iothreats.getRating());
	threatRating.setCssClass(rating);
%>
<td id="<%=objeffective_prot_mgmt_iothreats.getId()%>IO_JS_TD"><%=objeffective_prot_mgmt_iothreats.getJustification()%></td>
<td id="<%=objeffective_prot_mgmt_iothreats.getId()%>IO_RA_TD"><span class ="<%=threatRating.getCssClass() %>"><%=assessment %></span></td>
<%} else{%>
<td ></td>
<td ></td>
<%} %>

<td class="editIcons hideAdminAction">
<div class="editDelete">
<a href="#" onclick="javascript:dynamicPopup('/assessment_jsp/popup/editstep3_pro_iothreat.jsp','<%=objeffective_prot_mgmt_iothreats!=null ? objeffective_prot_mgmt_iothreats.getId() :"" %>','Assessment of the effectiveness of protection ',event); return false;" class="edit">edit</a>
</div>
</td>
 
 </tr>
 
 <tr>
<td>Overall assessment of protection and management </td>

<%
if(objoverall!=null){
	long rating =objoverall.getRating();
	String assessment =  ratingMap.get(objoverall.getRating());
	threatRating.setCssClass(rating);
%>
<td id="<%=objoverall.getPmo_id()%>PMO_JS_TD"><%= objoverall.getJustification()%></td>
<td id="<%=objoverall.getPmo_id()%>PMO_RA_TD"><span class ="<%=threatRating.getCssClass() %>"><%=assessment %></span></td>
<%} else{%>
<td></td>
<td></td>
<%} %>

<td class="editIcons hideAdminAction">
<div class="editDelete">
<a href="#" onclick="javascript:dynamicPopup('/assessment_jsp/popup/editstep3_pro_overall.jsp','<%=objoverall!=null ? objoverall.getPrimaryKey() :"" %>','Overall assessment of protection and management',event); return false;" class="edit">edit</a>
</div>
</td>
 
 </tr>
 
 <tr>
<td>Best Practice Examples</td>

<%
if(objbest_practices!=null){
%>
<td colspan="2" id="<%=objbest_practices.getBest_practice_id()%>BP_TD"> <%=objbest_practices.getDescription() %></td>

<%} else{%>
<td colspan="2"></td>

<%} %>

<td class="editIcons hideAdminAction">
<div class="editDelete">
<a href="#" onclick="javascript:dynamicPopup('/assessment_jsp/popup/editstep3_best_practices.jsp','<%=objbest_practices!=null ? objbest_practices.getPrimaryKey() :"" %>','Best Practice Examples',event); return false;" class="edit">edit</a>
</div>
</td>

 </tr>
 
 
    

</tbody>
</table>