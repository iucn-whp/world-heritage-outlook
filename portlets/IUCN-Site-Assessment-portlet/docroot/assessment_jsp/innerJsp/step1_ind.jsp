<%@page import="com.iucn.whp.dto.SiteAssessmentValues"%>
<%@include file="/init_import.jsp" %>

<%
List<assessment_whvalues> lstwhValues=null;
String assesmentVersionId = "0";
List<SiteAssessmentValues> lstSiteAssessment = new ArrayList<SiteAssessmentValues>();
try{
	assesmentVersionId=request.getAttribute("versionId").toString();
	lstwhValues = site_assessmentLocalServiceUtil.getAssessment_whvaluesByVersion(Long.parseLong(assesmentVersionId));
	Collections.sort(lstwhValues);
	SiteAssessmentValues siteAssessmentValues = null;
	 for(int i=0;i<lstwhValues.size();i++){
		try{
		    		
					siteAssessmentValues=new SiteAssessmentValues();
		    		
					siteAssessmentValues.setWhvalues(lstwhValues.get(i));
		    		
					List<assessment_whvalues_whcriterion> lstwhvalues_whcriterion = assessment_whvalues_whcriterionLocalServiceUtil.getAssessment_whvalues_whcriterionsBywhValue(lstwhValues.get(i).getWhvalues_id());
					String str = null;
					for(int j=0;j<lstwhvalues_whcriterion.size();j++){
						long criteriaTemp = lstwhvalues_whcriterion.get(j).getCriterion();
						inscription_criteria_lkp insCriteria=inscription_criteria_lkpLocalServiceUtil.getinscription_criteria_lkp(Integer.parseInt(criteriaTemp+""));
						String strCriteria =insCriteria.getCriteria();
						if(str==null) str = strCriteria;
						else str = str+","+strCriteria;
					}
		    		
					siteAssessmentValues.setStrwhvalues_whcriterion(str) ; 
					siteAssessmentValues.setSno(i+1);
					lstSiteAssessment.add(siteAssessmentValues);
		    	}catch(Exception ex){
		    		System.out.println("EXCEPTION:"+ ex.getStackTrace()+"------"+ex.getStackTrace());
		    	}

			} 
	 /* Collections.sort(lstSiteAssessment, new Comparator<SiteAssessmentValues>(){
		    public int compare(SiteAssessmentValues one, SiteAssessmentValues other) {
		        return String.valueOf(one.getWhvalues().getVn()).compareTo(String.valueOf(other.getWhvalues().getVn()));
		    }
		}); */
	
	
}catch(Exception ex){
	
}

%>
<portlet:actionURL name="deleteCurrentRecordFromWhValues" var="deleteRecord"/>
<c:set var="UpdateUrl" value="/assessment_jsp/popup/site1_ind_popup.jsp"/>
<c:set var="RefreshUrl" value="/assessment_jsp/innerJsp/step1_ind.jsp"/>
<c:set var="DeleteUrl" value="<%=deleteRecord %>"/>
<c:set var="currentDiv" value="indDiv"/> 
<c:set var="versionId" value="<%=assesmentVersionId %>"/>

<table class="tab_dataValues" cellpadding="0" cellspacing="0">
<tbody>
<!-- <tr>
<th class="number">No.</th>
<th class="values">Values</th>
<th class="description">Description</th>
<th class="whCriterion">WH Criteria</th>
<th class="editIcons hideAdminAction">Edit / Delete</th>
</tr> -->
<% 
if(lstSiteAssessment.size()==0){
	%>
	<tr>
	<td colspan=5 style = "text-align:center"><span class="blankCellStyle"> Add Identifying And Describing Values</span></td>
	
	
	</tr>
	<%
}
%>
<c:forEach items="<%=lstSiteAssessment %>" var="whValues" varStatus="status">		
				

<tr id="${whValues.getWhvalues().getWhvalues_id()}_WH_TR">
<th class="dataHeading" style="width:20px;"><c:out value="${whValues.getSno()}" /></th>
<th class="dataHeading"><c:out value="${whValues.getWhvalues().getValues()}" /></th>
<th class="dataHeading" style="width:150px;" id="${whValues.getWhvalues().getWhvalues_id()}_CRT_TD">Criteria: <c:out value="${whValues.getStrwhvalues_whcriterion()}" /></th>
<th  class="editIcons hideAdminAction dataHeading" style="width: 80px;">
<div class="editDelete">
<a href="#" onclick="javascript:dynamicPopup('${UpdateUrl}','${whValues.getWhvalues().getWhvalues_id()}','Identifying And Describing Values',event); return false;" class="edit">edit</a>
<a href="javascript:validateDelete('${versionId}','${RefreshUrl}','${currentDiv}','${whValues.getWhvalues().getWhvalues_id()}','whValue');" class="delete">delete</a>
</div>
</th>
</tr>
<tr id="${whValues.getWhvalues().getWhvalues_id()}_CRT_TD" ><td colspan="4" id="${whValues.getWhvalues().getWhvalues_id()}_DES_TD"><c:out value="${whValues.getWhvalues().getDescription()}" /></td></tr>
</c:forEach>

</tbody>
</table>
