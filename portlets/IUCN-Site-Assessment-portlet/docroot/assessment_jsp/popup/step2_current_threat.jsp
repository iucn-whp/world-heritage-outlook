<%@ include file="/init.jsp" %>
<%
	long assessmentVersionId = 0;
	List<threat_categories_lkp> lstThreatCategory = null;
	List<threat_subcategories_lkp> lstThreatSubCategory = null;
	List<threat_rating_lkp> lstThreatRating = null;
	List<Long> lstCurrentThreatVal = new ArrayList<Long>();
	List<Long> lstCurrentThreatBioVal = new ArrayList<Long>();
	List<current_threat_assessment_cat> lstCurrentAssessmentCat = null;
	List<assessment_whvalues> lstWhValues = null;
	List<biodiversity_values> lstBioValues = null;
	List<Long> lstSubCat = new ArrayList<Long>();
	long rating_id = 0;
	long currentThreatId = 0;
	assessing_threats_current curretn_threat = new assessing_threats_currentClp();
	try{
	 	String selectedPkey=request.getParameter("keyVal");
	    assessmentVersionId = Long.parseLong(request.getParameter("versionIdVal"));
	    lstThreatCategory = site_assessmentLocalServiceUtil.getAllThreatCategories();
	    lstThreatSubCategory = site_assessmentLocalServiceUtil.getAllThreatSubCategories();
	    lstThreatRating = site_assessmentLocalServiceUtil.getAllThreatRating();
	    lstBioValues = site_assessmentLocalServiceUtil.getBiodiversityValuesByVersion(assessmentVersionId);
	    lstWhValues = site_assessmentLocalServiceUtil.getAssessment_whvaluesByVersion(assessmentVersionId);
	    if(selectedPkey!=null && !selectedPkey.isEmpty()){
		    curretn_threat = assessing_threats_currentLocalServiceUtil.getassessing_threats_current(Long.parseLong(selectedPkey));
		    currentThreatId = curretn_threat.getCurrent_threat_id();
		    rating_id = curretn_threat.getThreat_rating_id();
		    List<current_threat_values> lstCurrentThreatValTemp = site_assessmentLocalServiceUtil.getCurrentlThreatValuesByThreatId(currentThreatId);
		    for(current_threat_values wh:lstCurrentThreatValTemp){
		    	if(!wh.getIs_biodiv_whval())
		    		lstCurrentThreatVal.add(wh.getWhvalues_id());
		    	else lstCurrentThreatBioVal.add(wh.getWhvalues_id());
		    }
		    lstCurrentAssessmentCat = site_assessmentLocalServiceUtil.getCurrentThreatAssessmentCatByThreatId(currentThreatId);
	    }
	    else{
	    	curretn_threat.setCurrent_threat_id(0);
	    	curretn_threat.setAssessment_version_id(assessmentVersionId);
	    	curretn_threat.setCurrent_threat("");
	    	curretn_threat.setInside_site(false);
	    	curretn_threat.setOutside_site(false);
	    	curretn_threat.setJustification("");
	    	curretn_threat.setThreat_rating_id(0);
	    	
		    
	    }
	}catch(Exception e){
		e.printStackTrace();
	}
%>
<portlet:defineObjects /> 
   
    <portlet:actionURL name="updatestep2CurrentThreat" var="step2CurrentThreat" />

<c:set var="versionId" value="<%=assessmentVersionId %>"/>
<c:set var="UpdateUrl" value="<%=step2CurrentThreat %>"/>
<c:set var="RefreshUrl" value="/assessment_jsp/innerJsp/step2_ct.jsp"/>

<div id="popupdiv">
<aui:form 
    id="step2CurrentForm" 
	name="step2CurrentForm" 
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
	        name="currentThreatId"
	        id="currentThreatId"
	        value="<%= currentThreatId %>"
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
			<tr>
				<td class="lblTD">
					<label class="popuplbl">Select Sub Category:</label>
				</td>
				
				<td>
					<select class="multiLinetxt" name = "threatSubCategoryTemp" id = "threatSubCategoryTemp" 
					multiple>
						
						
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
					class="multiLinetxt"  multiple size="5">
					<%
					if(lstCurrentAssessmentCat!=null && !lstCurrentAssessmentCat.isEmpty()){
						for(current_threat_assessment_cat current_threat:lstCurrentAssessmentCat) { 
								String threatCatStr = threat_categories_lkpLocalServiceUtil.getthreat_categories_lkp(current_threat.getCategory_id()).getThreat_category();
								String threatSubCatStr = threat_subcategories_lkpLocalServiceUtil.getthreat_subcategories_lkp(current_threat.getSub_cat_id()).getThreat_sub_category();
								long threatSubCat = current_threat.getSub_cat_id();
								if(lstSubCat.contains(threatSubCat))
									continue;
								else{
								lstSubCat.add(threatSubCat);
								%>
								<option value = "<%=threatSubCat%>" title="<%=threatCatStr%>-<%=threatSubCatStr%>">
								<%=threatCatStr%>-<%=threatSubCatStr%>
								</option>
								<%}} }%>	
				</select>
				</td>
				
			</tr>
		
	<tr>
		<td class="lblTD">
			<label class="popuplbl">Specific Threat Affecting site:</label>
		</td>
	<td class="valueTD">
			<aui:input type= "textarea" name = "currentThreat" id = "currentThreat"
			value= "<%=curretn_threat.getCurrent_threat() %>"
			label="">
			<aui:validator name="required" />
			</aui:input>
			
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
						value = "<%=curretn_threat.getInside_site() %>"/>
						</div>
						<div class="floatLeftX">
						<label class="popuplbl">Outside Site:&nbsp;&nbsp;</label>
						<aui:input type="checkbox" name = "outsideSite" id = "outsideSite" label=""
						value = "<%=curretn_threat.getOutside_site() %>" />
						</div>

		</td>
	</tr>
	<tr>
		<td class="lblTD">
			<label class="popuplbl">Select Values Affected(Identifying & Describing):</label>
		</td>
		<td class="valueTD" style="padding:1px 0px 0px 0px;">
			<div class="checkboxListforThreat" id="valueAffected">
							<%
							for(int i=0;i<lstWhValues.size();i++) { 
								long value_id = lstWhValues.get(i).getWhvalues_id();
								
								if(lstCurrentThreatVal!=null && lstCurrentThreatVal.contains(value_id) ){
							%>
								<%-- <option value = "<%=wh_id %>" title="<%= lstWhValues.get(i).getValues()%>"> --%>
								<input type="checkbox" name = "valueAffectedwh" id = "valueAffectedwh" checked value = "<%=value_id %>">  <%= lstWhValues.get(i).getValues()%><br>
								<!-- </option> -->
							<%}else { %>
							
							<%-- <option value = "<%=wh_id %>"> --%>
								<input type="checkbox" name = "valueAffectedwh" id = "valueAffectedwh" value = "<%=value_id %>" > <%= lstWhValues.get(i).getValues()%><br>
								<!-- </option> -->
							<%}
								} %>
			</div>
		</td>
	</tr>
	<tr>
		<td class="lblTD">
			<label class="popuplbl">Select Values Affected(Other Biodiversity):</label>
		</td>
		<td class="valueTD" style="padding:1px 0px 0px 0px;">
			<div class="checkboxListforThreat" id = "bioValues">
							<%
							for(int i=0;i<lstBioValues.size();i++) { 
								long value_id = lstBioValues.get(i).getId();
								if(lstCurrentThreatBioVal!=null && lstCurrentThreatBioVal.contains(value_id) ){
							%>
								<%-- <option value = "<%=wh_id %>" title="<%= lstWhValues.get(i).getValues()%>"> --%>
								<input type="checkbox" name = "valueAffectedbio" id = "valueAffectedbio" checked value = "<%=value_id %>">  <%= lstBioValues.get(i).getValue()%><br>
								<!-- </option> -->
							<%}else { %>
							
							<%-- <option value = "<%=wh_id %>"> --%>
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
			value= "<%=curretn_threat.getJustification() %>"
			label="">
			<aui:validator name="required" />
			</aui:input>
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
			<aui:button type="button" value="Submit" onclick="javascript:validatestep2CurForm();"/>
			<aui:button name="cancelButton" type="button" value="Cancel" onclick="javascript:top.document.getElementById('closethick').click();"/>
		</td>
	</tr>
		
	</table>
</aui:form>
</div>
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
					var newItem = selectedCatVal.trim()+"-"+$(this).text();
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
						jQuery("#threatSubCategory").append(jQuery("<option></option>").attr("value", $(this).val()).text(selectedCatVal.trim()+"-"+$(this).text())); 
					
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
function validatestep2CurForm(){
	
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
		submitPopupForm('${versionId }','${RefreshUrl}','step2ctDiv','step2CurrentForm','${UpdateUrl }',2);
	}
}
</script>