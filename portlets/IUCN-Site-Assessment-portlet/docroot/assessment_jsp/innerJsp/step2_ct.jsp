<%@page import="com.iucn.whp.dto.AssessmentValueCssClass"%>
<%@include file="/init_import.jsp" %>
<%
List<assessing_threats_current> lstthreats_current=null;

try{
	long assesmentVersionId=Long.parseLong(request.getAttribute("versionId").toString());
	lstthreats_current = site_assessmentLocalServiceUtil.getAssessingThreatsCurrentByVersion(assesmentVersionId);
	Collections.sort(lstthreats_current);
}catch(Exception ex){
	
} 

%>
<c:set var="UpdateUrl" value="/assessment_jsp/popup/step2_current_threat.jsp"/>
<c:set var="RefreshUrl" value="/assessment_jsp/innerJsp/step2_ct.jsp"/>
<c:set var="currentDiv" value="step2ctDiv"/> 

<table class="tab_data" cellpadding="0" cellspacing="0">
<tbody>
<tr>
<th>Specific Threat</th>
<th>Category</th>
<th>Sub-Category</th>
<th>Values Affected</th>
<th>Inside</th>
<th>Outside</th>
<th>Justification</th>
<th>Assessment</th>
<th class="editIcons hideAdminAction">Edit / Delete</th>
</tr>
<% 
if(lstthreats_current.size()==0){
	%>
	<tr>
	<td colspan=9 align="center"><span class="blankCellStyle">Add Current Threat</span></td>
	</tr>
	<%
}

for(assessing_threats_current currentThreat:lstthreats_current){
	 long current_id = currentThreat.getCurrent_threat_id();
	 String justification = currentThreat.getJustification();
	 AssessmentValueCssClass threatRating = new AssessmentValueCssClass();
	 threatRating.setCssClass(currentThreat.getThreat_rating_id());
	 String assessment = threat_rating_lkpLocalServiceUtil.getthreat_rating_lkp(currentThreat.getThreat_rating_id()).getRating();
	 List<current_threat_assessment_cat> lstthreat_assessment_cat = site_assessmentLocalServiceUtil.getCurrentThreatAssessmentCatByThreatId(current_id);
	 List<current_threat_values> lstthreat_values = site_assessmentLocalServiceUtil.getCurrentlThreatValuesByThreatId(current_id);
	 String strwhValues = "";
	 for(current_threat_values threatValue:lstthreat_values){
		 if(!threatValue.getIs_biodiv_whval()){
			 if(strwhValues.isEmpty())
				 strwhValues = assessment_whvaluesLocalServiceUtil.getassessment_whvalues(threatValue.getWhvalues_id()).getValues();
			 else strwhValues = strwhValues+" , "+assessment_whvaluesLocalServiceUtil.getassessment_whvalues(threatValue.getWhvalues_id()).getValues();
		 }
	 }
	 int i=0;
	 for(current_threat_values threatValue:lstthreat_values){
		 
		 if(threatValue.getIs_biodiv_whval()){
			 if(strwhValues.isEmpty())
				 strwhValues = biodiversity_valuesLocalServiceUtil.getbiodiversity_values(threatValue.getWhvalues_id()).getValue();
			 else   strwhValues = strwhValues+" , "+biodiversity_valuesLocalServiceUtil.getbiodiversity_values(threatValue.getWhvalues_id()).getValue();
			 i++;
		 }
	 }
	 int rowcount = lstthreat_assessment_cat.size();
	 Set<Long> setCategory = new HashSet<Long>();
	 for(current_threat_assessment_cat threatCat:lstthreat_assessment_cat){
		 long category = threatCat.getCategory_id();
		 setCategory.add(category);
	 }
	 
%>	

<c:set var="threatId" value="<%=current_id %>"/> 			
	
	
	<% 
	if(setCategory.size()>0){
		int categoryCounter=0;
		for(Long category_id:setCategory){
			String category_val = threat_categories_lkpLocalServiceUtil.getthreat_categories_lkp(category_id).getThreat_category();
			String subcatval="";
			List<current_threat_assessment_cat> lstSubCat = current_threat_assessment_catLocalServiceUtil.getCurrentThreatAssessmentSubCategories(current_id,category_id);
			int subRowCount = lstSubCat.size();
			int subCategoryCounter = 0;
			for(current_threat_assessment_cat subCat:lstSubCat){
				String subCategoriesVal = threat_subcategories_lkpLocalServiceUtil.getthreat_subcategories_lkp(subCat.getSub_cat_id()).getThreat_sub_category();
				if(categoryCounter==0 && subCategoryCounter==0){
					%>
					<tr id="${threatId}_CT_TR">
					<td rowspan = "<%=rowcount %>"><%=currentThreat.getCurrent_threat() %></td>
					<td rowspan = "<%=subRowCount %>" id="<%=currentThreat.getCurrent_threat_id()%>_<%=category_id %>_CAT_CT_TD">
								<%=category_val %>
					</td>
					<td  id="<%=currentThreat.getCurrent_threat_id()%>_<%=category_id+"_"+subCat.getSub_cat_id() %>_SUBCAT_CT_TD" >
						<%=subCategoriesVal %>
					</td>
					<td rowspan = "<%=rowcount %>" id="${threatId}_CT_WH_TD"><%=strwhValues %></td>
					<td rowspan = "<%=rowcount %>" id="${threatId}_CT_IN_TD"><%=currentThreat.getInside_site() ? "Yes" : "No"%></td>
					<td rowspan = "<%=rowcount %>" id="${threatId}_CT_OUT_TD"><%=currentThreat.getOutside_site()? "Yes" : "No" %></td>
					<td rowspan = "<%=rowcount %>" id="${threatId}_CT_JF_TD" ><%=justification%></td>
					<td rowspan = "<%=rowcount %>" id="${threatId}_CT_RT_TD" ><span class ="<%=threatRating.getCssClass() %>"><%=assessment %></span></td>
					<td rowspan = "<%=rowcount %>" class="editIcons hideAdminAction">
					<div class="editDelete">
					<a href="#" onclick="javascript:dynamicPopup('${UpdateUrl}','${threatId}','Current Threats',event); return false;" class="edit">edit</a>
					<a href="javascript:deletePopup('${RefreshUrl}','${currentDiv}','${threatId}','Current Threats');" class="delete">delete</a>
					</div>
					</td>
				</tr>
					<%
				}else if(categoryCounter>0 && subCategoryCounter==0){
					
				%>
				<tr  id="${threatId}_CT_TR">
					<td rowspan = "<%=subRowCount %>" id="<%=currentThreat.getCurrent_threat_id()%>_<%=category_id %>_CAT_CT_TD">
								<%=category_val %>
					</td>
					<td  id="<%=currentThreat.getCurrent_threat_id()%>_<%=category_id+"_"+subCat.getSub_cat_id() %>_SUBCAT_CT_TD" >
						<%=subCategoriesVal %>
					</td>
				
				</tr>
				<%
				}else {
					
					%>
					<tr  id="${threatId}_CT_TR">
						<td  id="<%=currentThreat.getCurrent_threat_id()%>_<%=category_id+"_"+subCat.getSub_cat_id() %>_SUBCAT_CT_TD" >
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
} %>
</tbody>
</table>
