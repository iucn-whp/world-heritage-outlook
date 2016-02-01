<%@ include file="/init.jsp" %>

<%
	long assessmentVersionId = 0;
	List<threat_categories_lkp> lstThreatCategory = null;
	List<threat_subcategories_lkp> lstThreatSubCategory = null;
	List<threat_rating_lkp> lstThreatRating = null;
	List<Long> lstPotentialThreatVal = new ArrayList<Long>();
	List<Long> lstPotentialThreatBioVal = new ArrayList<Long>();
	List<potential_threat_assessment_cat> lstPotentialAssessmentCat = null;
	List<assessment_whvalues> lstWhValues = null;
	List<biodiversity_values> lstBioValues = null;
	long rating_id = 0;
	long potentialThreatId = 0;
	assessing_threats_potential potential_threat = new assessing_threats_potentialClp();
	try{
	 	String selectedPkey=request.getParameter("keyVal");
	    assessmentVersionId = Long.parseLong(request.getParameter("versionIdVal"));
	    lstThreatCategory = site_assessmentLocalServiceUtil.getAllThreatCategories();
	    lstThreatSubCategory = site_assessmentLocalServiceUtil.getAllThreatSubCategories();
	    lstThreatRating = site_assessmentLocalServiceUtil.getAllThreatRating();
	    lstWhValues = site_assessmentLocalServiceUtil.getAssessment_whvaluesByVersion(assessmentVersionId);
	    lstBioValues = site_assessmentLocalServiceUtil.getBiodiversityValuesByVersion(assessmentVersionId);
	    if(selectedPkey!=null && !selectedPkey.isEmpty()){
	    	potential_threat = assessing_threats_potentialLocalServiceUtil.getassessing_threats_potential(Long.parseLong(selectedPkey));
	    	potentialThreatId = potential_threat.getPotential_threat_id();
		    rating_id = potential_threat.getThreat_rating();
		    List<potential_threat_values> lstPotentialThreatValTemp = site_assessmentLocalServiceUtil.getPotentialThreatValuesByThreatId(potentialThreatId);
		    for(potential_threat_values wh:lstPotentialThreatValTemp){
		    	if(!wh.getIs_biodiv_whval())
		    		lstPotentialThreatVal.add(wh.getWhvalues_id());
		    	else lstPotentialThreatBioVal.add(wh.getWhvalues_id());
		    }
		    lstPotentialAssessmentCat = site_assessmentLocalServiceUtil.getPotentialThreatAssessmentCatByThreatId(potentialThreatId);
	    }
	    else{
	    	potential_threat.setPotential_threat_id(0);
	    	potential_threat.setAssessment_version_id(assessmentVersionId);
	    	potential_threat.setPotential_threat("");
	    	potential_threat.setInside_site(false);
	    	potential_threat.setOutside_site(false);
	    	potential_threat.setJustification("");
	    	potential_threat.setThreat_rating(0);
	    	
		    
	    }
	}catch(Exception e){
		e.printStackTrace();
	}
%>
<portlet:defineObjects /> 
   
    <portlet:actionURL name="updatestep2PotentialThreat" var="step2PotentialThreat" />

<c:set var="versionId" value="<%=assessmentVersionId %>"/>
<c:set var="UpdateUrl" value="<%=step2PotentialThreat %>"/>
<c:set var="RefreshUrl" value="/assessment_jsp/innerJsp/step2_pt.jsp"/>


<aui:form 
    id="step2PotentialForm" 
	name="step2PotentialForm" 
	action=""
	method="post"
>
	<aui:input
	        name="assessmentVersionId"
	        id="assessmentVersionId"
	        value="<%= assessmentVersionId %>"
	        type="hidden"
	    />	
	 <aui:input
	        name="potentialThreatId"
	        id="potentialThreatId"
	        value="<%= potentialThreatId %>"
	        type="hidden"
	    />
<table class="formBlock">
	<tr>
			<td class="lblTD">
					<label class="popuplbl">Select Category:</label>
				</td>
					<td>
					<select name = "threatCategoryTemp" id = "threatCategoryTemp" 
						class="selctinputtxt">
							<option>Select</option>
							<%for(int i=0;i<lstThreatCategory.size();i++) { %>
								<option value = "<%=lstThreatCategory.get(i).getThreatCategoryid() %>" title="<%=lstThreatCategory.get(i).getThreat_category() %>">
								<%=lstThreatCategory.get(i).getThreat_category() %>
								</option>
								<%} %>
					</select>
				</td>
				
			</tr>
			<tr><td class="lblTD">
					<label class="popuplbl">Select Sub Categories:</label>
				</td>
			
				
				<td>
					<select name = "threatSubCategoryTemp" id = "threatSubCategoryTemp" 
					class="multiLinetxt" multiple>
					</select>
				</td>
				
			</tr>
		
	<tr>
	<td colspan="2" class="btnTD">
				
				<button type="button" value="Add" id="add">&nbsp;&nbsp;Add Categories&nbsp;&nbsp;</button>
				
				<button type="button" value="remove" id = "remove">Remove  Categories</button>
				</td>
	</tr>
		
	<tr>
		<td class="lblTD">
			<label class="popuplbl">Selected Categories/SubCategories</label>
		</td>
		<td>
			<select name = "threatSubCategory" id = "threatSubCategory" 
			class="multiLinetxt" multiple size="5">
				<%
				if(lstPotentialAssessmentCat!=null && !lstPotentialAssessmentCat.isEmpty()){
				for(potential_threat_assessment_cat potential_Threat:lstPotentialAssessmentCat) { 
								String threatCatStr = threat_categories_lkpLocalServiceUtil.getthreat_categories_lkp(potential_Threat.getCategory_id()).getThreat_category();
								String threatSubCatStr = threat_subcategories_lkpLocalServiceUtil.getthreat_subcategories_lkp(potential_Threat.getSub_cat_id()).getThreat_sub_category();
								
								%>
								<option value = "<%=potential_Threat.getSub_cat_id() %>" title="<%=threatCatStr%>-<%=threatSubCatStr%>">
								<%=threatCatStr%>-<%=threatSubCatStr%>
								</option>
								<%} }%>
		</select>
		</td>
		
	</tr>
		
	<tr>
		<td class="lblTD">
			<label class="popuplbl">Specific Threat Affecting site:</label>
		</td>
			<td class="valueTD">
			<aui:input type= "textarea" name = "currentThreat" id = "currentThreat"
			value= "<%=potential_threat.getPotential_threat() %>"
			label=""/>
		</td>
	</tr>
	<tr>
	<td class="lblTD">
		<label class="popuplbl">Select Inside/Outside Site:</label>
	</td>
		<td class="valueTD">
						<div class="floatLeftX">
						<label class="popuplbl">Inside Site:&nbsp;&nbsp;</label>
						<aui:input type="checkbox" name = "insideSite" id = "insideSite" label=""
						value = "<%=potential_threat.getInside_site() %>" />
						</div>
				
				
						<div class="floatLeftX">
						<label class="popuplbl">Outside Site:&nbsp;&nbsp;</label>
						<aui:input type="checkbox" name = "outsideSite" id = "outsideSite" label=""
						value = "<%=potential_threat.getOutside_site() %>" />
						</div>
		</td>
	</tr>
	<tr>
		<td class="lblTD">
			<label class="popuplbl">Select Values Affected(Identifying & Describing):</label>
		</td>
	<td class="valueTD" style="padding:1px 0px 0px 0px;">
			<div class="checkboxListforThreat" id="valueAffected" >
				<%
					for(int i=0;i<lstWhValues.size();i++) { 
						long value_id = lstWhValues.get(i).getWhvalues_id();
						if(lstPotentialThreatVal!=null && lstPotentialThreatVal.contains(value_id) ){
					%>
						<%-- <option value = "<%=value_id %>" title="<%= lstWhValues.get(i).getValues()%>"> --%>
						<input type="checkbox" name = "valueAffectedwh" id = "valueAffectedwh" checked value = "<%=value_id %>">  <%= lstWhValues.get(i).getValues()%><br>
						<!-- </option> -->
					<%}else { %>
					
					<%-- <option value = "<%=value_id %>"> --%>
						<input type="checkbox" name = "valueAffectedwh" id = "valueAffectedwh" value = "<%=value_id %>" > <%= lstWhValues.get(i).getValues()%><br>
						<!-- </option> -->
					<% }
					} 
				%>
			</div>
		</td>
	</tr>
	<tr>
		<td class="lblTD">
			<label class="popuplbl">Select Values Affected(Other Biodiversity) :</label>
		</td>
		<td class="valueTD" style="padding:1px 0px 0px 0px;">
			<div class="checkboxListforThreat" id="bioValues">
							<%
							for(int i=0;i<lstBioValues.size();i++) { 
								long value_id = lstBioValues.get(i).getId();
								if(lstPotentialThreatBioVal!=null && lstPotentialThreatBioVal.contains(value_id) ){
							%>
								<%-- <option value = "<%=value_id %>" title="<%= lstWhValues.get(i).getValues()%>"> --%>
								<input type="checkbox" name = "valueAffectedbio" id = "valueAffectedbio" checked value = "<%=value_id %>">  <%= lstBioValues.get(i).getValue()%><br>
								<!-- </option> -->
							<%}else { %>
							
							<%-- <option value = "<%=value_id %>"> --%>
								<input type="checkbox" name = "valueAffectedbio" id = "valueAffectedbio" value = "<%=value_id %>" > <%= lstBioValues.get(i).getValue()%><br>
								<!-- </option> -->
							<%}
								} %>
			</div>
		</td>
	</tr>
	<tr>
		<td class="lblTD">
			<label class="popuplbl">Write Justification:</label>
		</td>
	<td class="valueTD">
			<aui:input type= "textarea" name = "justification" id = "justification"
			value= "<%=potential_threat.getJustification() %>"
			label=""/>
		</td>
	</tr>
	<tr class="highlightrow">
	<td class="lblTD">
			<label class="popuplbl">Select Assessment:</label>
		</td>
	<td>
		<aui:select name = "currentAssessment" label= "" id = "currentAssessment" style="width:250px;">
				<aui:option value = "0">Select</aui:option>
				<%
				for(int i=0;i<lstThreatRating.size();i++){
					threat_rating_lkp rating= lstThreatRating.get(i);
					if(rating.getId()==rating_id){
				%>
			
				<aui:option  selected="true" value="<%=rating.getId() %>">
					<%=rating.getRating() %>
				</aui:option>
				
				<%}else { %>
				
				<aui:option  value="<%=rating.getId() %>">
					<%=rating.getRating() %>
				</aui:option>
				<%}} %>
			</aui:select>
		</td>
	</tr>
	<tr>
			<td colspan="2" class="btnTD">
			<aui:button type="button" value="Submit" onclick="javascript:validatestep2PotForm();"/>
			<aui:button name="cancelButton" type="button" value="Cancel" onclick="javascript:top.document.getElementById('closethick').click();"/>
		</td>
	</tr>
		
	</table>
</aui:form>
<script type="text/javascript">

	jQuery(function () {
		jQuery("#threatCategoryTemp").change(function() {
			
			jQuery("#threatSubCategoryTemp").empty();
			var catId = $("#threatCategoryTemp").val();
			
			  <%
			  List<threat_subcategories_lkp> lstThreatSubCategoryTemp = site_assessmentLocalServiceUtil.getAllThreatSubCategories();
			  for(int i=0;i<lstThreatSubCategoryTemp.size();i++) { 
			  		
			  		long parantId = lstThreatSubCategoryTemp.get(i).getParent_id();
			  	%>
			  	var parant_id = <%=parantId%>;
			  	if(parant_id == catId){
			  		jQuery("#threatSubCategoryTemp").append('<option value="<%=lstThreatSubCategoryTemp.get(i).getId()%>" title = "<%=lstThreatSubCategoryTemp.get(i).getThreat_sub_category() %>"><%=lstThreatSubCategoryTemp.get(i).getThreat_sub_category() %></option>'); 

			  	}
			  	<%} %>
			});
	
		jQuery("#add").click(function () {
			var selectedCatVal = $("#threatCategoryTemp option:selected").text();
			$("#threatSubCategoryTemp option:selected").each(function () {
				var lst = document.getElementById('threatSubCategory');
				//alert(lst.length);
				var newItem = selectedCatVal.trim()+"-"+$(this).text().trim();
				var isAlreadyAdded= false;
				//alert(newItem);
				for (var i = 0; i < lst.options.length; i++) {
					var txt = lst.options[i].text; 
					//alert(txt.toLowerCase() +" --"+newItem.toLowerCase());
					//alert(txt.toLowerCase().trim() == newItem.toLowerCase().trim());
					if (txt.toLowerCase() == newItem.toLowerCase()) {
					alert ("Selected subcategory already added - please add different subcategory.");
					isAlreadyAdded = true;
					return false;
					}}
				if(!isAlreadyAdded)
					jQuery("#threatSubCategory").append(jQuery("<option></option>").attr("value", $(this).val()).text(selectedCatVal.trim()+"-"+$(this).text().trim())); 
				
              });

			
		});
	
			jQuery("#remove").click(function () {
			    jQuery("#threatSubCategory option:selected").remove();
			});
	
	});
	function listbox_selectall(listID, isSelect) {
	    var listbox = document.getElementById(listID);
	    for(var count=0; count < listbox.options.length; count++) {
	        listbox.options[count].selected = isSelect;
	}
	}
</script>
<script>

function validatestep2PotForm(){
	
	var isValid = true;
	listbox_selectall('threatSubCategory', true);	
	var assessment = $('#<portlet:namespace/>currentAssessment').val();
	var valueAffectedwh = [];
    $('#valueAffected :checked').each(function() {
    	valueAffectedwh.push($(this).val());
    });
    $('#t').val(valueAffectedwh);
    
    var valueAffectedbio = [];
    $('#bioValues :checked').each(function() {
    	valueAffectedbio.push($(this).val());
    });
    $('#t').val(valueAffectedbio);
  //  alert(valueAffectedwh);
	//var valueAffectedwh = '';
	
/* 	$('input:checkbox:checked').each(function(){
		
		if ($(this).is(':checked')) {
			valueAffectedwh = $(this).val();
	    }
    }); */
	//var valueAffectedbio = '';
	
	/* $('input:checkbox:checked').each(function(){
		if ($(this).is(':checked')) {
			valueAffectedbio = $(this).val();
	    }
    }); */

	var justification = $('#<portlet:namespace/>justification').val();	
	var currentThreat = $('#<portlet:namespace/>currentThreat').val();	
	var threatSubCategories = $('#threatSubCategory option:selected').val();	
	if(currentThreat==""){
		isValid =false;
		alert("Pl fill Specific threat is required.");
		
	}else if(threatSubCategories==undefined){
		isValid =false;
		alert("Pl add Categories");
	
	}else if(valueAffectedwh=="" && valueAffectedbio==""){
	
		isValid =false;
		alert("Pl select Values for threat.");
	}else if(justification == ""){
		isValid =false;
		alert("Pl fill Justification field of threat.");
	}else if(assessment==0){
		isValid =false;
		alert("Assessment Value is required.");
	}
	
	if(isValid){
		submitPopupForm('${versionId }','${RefreshUrl}','step2ptDiv','step2PotentialForm','${UpdateUrl }',2);
	}
}
</script>