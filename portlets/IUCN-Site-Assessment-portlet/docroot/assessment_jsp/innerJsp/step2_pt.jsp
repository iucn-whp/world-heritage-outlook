<%@page import="com.iucn.whp.dto.AssessmentValueCssClass"%>
<%@include file="/init_import.jsp" %>
<%
 List<assessing_threats_potential> lstthreats_potential=null;

try{
	long assesmentVersionId=Long.parseLong(request.getAttribute("versionId").toString());
	lstthreats_potential = site_assessmentLocalServiceUtil.getAssessingThreatsPotentialByVersion(assesmentVersionId);
	Collections.sort(lstthreats_potential);
}catch(Exception ex){
	
} 
%>
<c:set var="UpdateUrl" value="/assessment_jsp/popup/step2_potential_threat.jsp"/>
<c:set var="RefreshUrl" value="/assessment_jsp/innerJsp/step2_pt.jsp"/>
<c:set var="currentDiv" value="step2ptDiv"/> 

<table class="tab_data" cellpadding="0" cellspacing="0">
<tbody>
<tr>
<th>Specific Threat</th>
<th >Category</th>
<th >Sub-Category</th>
<th>Values Affected</th>
<th>Inside</th>
<th>Outside</th>
<th>Justification</th>
<th>Assessment</th>
<th class="editIcons hideAdminAction">Edit / Delete</th>
</tr>
<% 
if(lstthreats_potential.size()==0){
	%>
	<tr>
	<td colspan=9 align="center"><span class="blankCellStyle">Add Potential Threat</span></td>
	
	</tr>	<%
}

for(assessing_threats_potential potentialThreat:lstthreats_potential){
	 long potential_id = potentialThreat.getPotential_threat_id();
	 String justification = potentialThreat.getJustification();
	 AssessmentValueCssClass threatRating = new AssessmentValueCssClass();
	 threatRating.setCssClass(potentialThreat.getThreat_rating());
	 String assessment = threat_rating_lkpLocalServiceUtil.getthreat_rating_lkp(potentialThreat.getThreat_rating()).getRating();
	 List<potential_threat_assessment_cat> lstthreat_assessment_cat = site_assessmentLocalServiceUtil.getPotentialThreatAssessmentCatByThreatId(potential_id);
	 List<potential_threat_values> lstthreat_values = site_assessmentLocalServiceUtil.getPotentialThreatValuesByThreatId(potential_id);
	 String strwhValues = "";
	 for(potential_threat_values threatValue:lstthreat_values){
		 if(!threatValue.getIs_biodiv_whval()){
			 if(strwhValues.isEmpty())
				 strwhValues = assessment_whvaluesLocalServiceUtil.getassessment_whvalues(threatValue.getWhvalues_id()).getValues();
			 else strwhValues = strwhValues+ " , "+assessment_whvaluesLocalServiceUtil.getassessment_whvalues(threatValue.getWhvalues_id()).getValues();
		 }
	 }
	 int i=0;
	 for(potential_threat_values threatValue:lstthreat_values){
		 
		 if(threatValue.getIs_biodiv_whval()){
			 if(strwhValues.isEmpty())
				 strwhValues = biodiversity_valuesLocalServiceUtil.getbiodiversity_values(threatValue.getWhvalues_id()).getValue();
			 else   strwhValues = strwhValues+" , "+biodiversity_valuesLocalServiceUtil.getbiodiversity_values(threatValue.getWhvalues_id()).getValue();
			 i++;
		 
		 }
	 }
	 int rowcount = lstthreat_assessment_cat.size();
	 Set<Long> setCategory = new HashSet<Long>();

	Collections.sort(lstthreat_assessment_cat, new Comparator<potential_threat_assessment_cat>() {
		@Override
		public int compare(potential_threat_assessment_cat o1, potential_threat_assessment_cat o2) {
			return Long.compare(o1.getCategory_id(), o2.getCategory_id());
		}
	});

	 for(potential_threat_assessment_cat threatCat:lstthreat_assessment_cat){
		 long category = threatCat.getCategory_id();
		 setCategory.add(category);
	 }
	 
%>	
	<c:set var="threatId" value="<%=potential_id %>"/> 	
	<% 
	if(setCategory.size()>0){
		int categoryCounter=0;
		for(Long category_id:setCategory){
			String category_val = threat_categories_lkpLocalServiceUtil.getthreat_categories_lkp(category_id).getThreat_category();
			String subcatval="";
			List<potential_threat_assessment_cat> lstSubCat = potential_threat_assessment_catLocalServiceUtil.getPotentialThreatSubCategories(potential_id,category_id);

			Collections.sort(lstSubCat, new Comparator<potential_threat_assessment_cat>() {
				@Override
				public int compare(potential_threat_assessment_cat o1, potential_threat_assessment_cat o2) {
					return Long.compare(o1.getCategory_id(), o2.getCategory_id());
				}
			});

			int subRowCount = lstSubCat.size();
			int subCategoryCounter = 0;
			for(potential_threat_assessment_cat subCat:lstSubCat){
				String subCategoriesVal = threat_subcategories_lkpLocalServiceUtil.getthreat_subcategories_lkp(subCat.getSub_cat_id()).getThreat_sub_category();
				if(categoryCounter==0 && subCategoryCounter==0){
					%>
					<tr id="${threatId}_PT_TR">
					<td rowspan = "<%=rowcount %>"><%=potentialThreat.getPotential_threat() %></td>
					<td rowspan = "<%=subRowCount %>" id="<%=potentialThreat.getPotential_threat()%>_<%=category_id %>_CAT_PT_TD">
								<%=category_val %>
					</td>
					<td  id="<%=potentialThreat.getPotential_threat()%>_<%=category_id+"_"+subCat.getSub_cat_id() %>_SUBCAT_PT_TD" >
						<%=subCategoriesVal %>
					</td>
					<td rowspan = "<%=rowcount %>" id="${threatId}_PT_WH_TD"><%=strwhValues %></td>
					<td rowspan = "<%=rowcount %>" id="${threatId}_PT_IN_TD"><%=potentialThreat.getInside_site() ? "Yes, " + potentialThreat.getThreadExtentValue() : "No"%></td>
					<td rowspan = "<%=rowcount %>" id="${threatId}_PT_OUT_TD"><%=potentialThreat.getOutside_site()? "Yes" : "No" %></td>
					<td rowspan = "<%=rowcount %>" id="${threatId}_PT_JF_TD" ><%=justification%></td>
					<td rowspan = "<%=rowcount %>" id="${threatId}_PT_RT_TD" ><span class ="<%=threatRating.getCssClass() %>"><%=assessment %></span></td>
					<td rowspan = "<%=rowcount %>" class="editIcons hideAdminAction">
					<div class="editDelete">
					<a href="#" onclick="javascript:dynamicPopup('${UpdateUrl}','${threatId}','Current Threats',event); return false;" class="edit">edit</a>
					<a href="javascript:deletePopup('${RefreshUrl}','${currentDiv}','${threatId}','Potential Threats');" class="delete">delete</a>
					</div>
					</td>
				</tr>
					<%
				}else if(categoryCounter>0 && subCategoryCounter==0){
					
				%>
				<tr id="${threatId}_PT_TR">
					<td rowspan = "<%=subRowCount %>" id="<%=potentialThreat.getPotential_threat()%>_<%=category_id %>_CAT_PT_TD">
								<%=category_val %>
					</td>
					<td  id="<%=potentialThreat.getPotential_threat()%>_<%=category_id+"_"+subCat.getSub_cat_id() %>_SUBCAT_PT_TD" >
						<%=subCategoriesVal %>
					</td>
				
				</tr>
				<%
				}else {
					
					%>
					<tr id="${threatId}_PT_TR">
						<td  id="<%=potentialThreat.getPotential_threat()%>_<%=category_id+"_"+subCat.getSub_cat_id() %>_SUBCAT_PT_TD" >
							<%=subCategoriesVal %>
						</td>
					
					</tr>
					<%
					}
				
				subCategoryCounter++;
			}
			categoryCounter++;
		}
	} 		
	
	 
}	
		
		
 %>
</tbody>
</table>
